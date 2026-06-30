package p012xc85e97e9.p087x9da2e250.app;

@java.lang.Deprecated
/* renamed from: androidx.fragment.app.FragmentTabHost */
/* loaded from: classes13.dex */
public class C1108x33448a4d extends android.widget.TabHost implements android.widget.TabHost.OnTabChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f92769d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TabHost.OnTabChangeListener f92770e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92771f;

    /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p087x9da2e250.app.C1108x33448a4d.SavedState> f3521x681a0c0c = new p012xc85e97e9.p087x9da2e250.app.g2();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f92772d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f92772d = parcel.readString();
        }

        /* renamed from: toString */
        public java.lang.String m7737x9616526c() {
            return "FragmentTabHost.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " curTab=" + this.f92772d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f92772d);
        }
    }

    @java.lang.Deprecated
    public C1108x33448a4d(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f92769d = new java.util.ArrayList();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.inflatedId}, 0, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        java.util.ArrayList arrayList = this.f92769d;
        if (arrayList.size() > 0) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(0));
            throw null;
        }
        this.f92771f = true;
        if (arrayList.size() <= 0) {
            return;
        }
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(0));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f92771f = false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof p012xc85e97e9.p087x9da2e250.app.C1108x33448a4d.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.C1108x33448a4d.SavedState savedState = (p012xc85e97e9.p087x9da2e250.app.C1108x33448a4d.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f92772d);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        p012xc85e97e9.p087x9da2e250.app.C1108x33448a4d.SavedState savedState = new p012xc85e97e9.p087x9da2e250.app.C1108x33448a4d.SavedState(super.onSaveInstanceState());
        savedState.f92772d = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(java.lang.String str) {
        if (this.f92771f) {
            java.util.ArrayList arrayList = this.f92769d;
            if (arrayList.size() > 0) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(arrayList.get(0));
                throw null;
            }
        }
        android.widget.TabHost.OnTabChangeListener onTabChangeListener = this.f92770e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @java.lang.Deprecated
    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener onTabChangeListener) {
        this.f92770e = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    public void setup() {
        throw new java.lang.IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
