package androidx.fragment.app;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public class FragmentTabHost extends android.widget.TabHost implements android.widget.TabHost.OnTabChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f11236d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TabHost.OnTabChangeListener f11237e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11238f;

    /* loaded from: classes13.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentTabHost.SavedState> CREATOR = new androidx.fragment.app.g2();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f11239d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f11239d = parcel.readString();
        }

        public java.lang.String toString() {
            return "FragmentTabHost.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " curTab=" + this.f11239d + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f11239d);
        }
    }

    @java.lang.Deprecated
    public FragmentTabHost(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11236d = new java.util.ArrayList();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.inflatedId}, 0, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCurrentTabTag();
        java.util.ArrayList arrayList = this.f11236d;
        if (arrayList.size() > 0) {
            android.support.v4.media.f.a(arrayList.get(0));
            throw null;
        }
        this.f11238f = true;
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.f.a(arrayList.get(0));
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11238f = false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.fragment.app.FragmentTabHost.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.fragment.app.FragmentTabHost.SavedState savedState = (androidx.fragment.app.FragmentTabHost.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f11239d);
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        androidx.fragment.app.FragmentTabHost.SavedState savedState = new androidx.fragment.app.FragmentTabHost.SavedState(super.onSaveInstanceState());
        savedState.f11239d = getCurrentTabTag();
        return savedState;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(java.lang.String str) {
        if (this.f11238f) {
            java.util.ArrayList arrayList = this.f11236d;
            if (arrayList.size() > 0) {
                android.support.v4.media.f.a(arrayList.get(0));
                throw null;
            }
        }
        android.widget.TabHost.OnTabChangeListener onTabChangeListener = this.f11237e;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @java.lang.Deprecated
    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener onTabChangeListener) {
        this.f11237e = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    public void setup() {
        throw new java.lang.IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
