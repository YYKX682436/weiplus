package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.MultiSelectListPreference */
/* loaded from: classes13.dex */
public class C1144x3a67c6ee extends p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec {
    public final java.lang.CharSequence[] X;
    public final java.lang.CharSequence[] Y;
    public final java.util.Set Z;

    /* renamed from: androidx.preference.MultiSelectListPreference$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p100xa8fcbcdb.C1144x3a67c6ee.SavedState> f3585x681a0c0c = new p012xc85e97e9.p100xa8fcbcdb.j();

        /* renamed from: d, reason: collision with root package name */
        public java.util.Set f93274d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f93274d = new java.util.HashSet();
            java.lang.String[] strArr = new java.lang.String[readInt];
            parcel.readStringArray(strArr);
            java.util.Collections.addAll(this.f93274d, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f93274d.size());
            java.util.Set set = this.f93274d;
            parcel.writeStringArray((java.lang.String[]) set.toArray(new java.lang.String[set.size()]));
        }
    }

    public C1144x3a67c6ee(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.Z = new java.util.HashSet();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93352e, i17, 0);
        java.lang.CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.X = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        java.lang.CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.Y = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void A(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(p012xc85e97e9.p100xa8fcbcdb.C1144x3a67c6ee.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1144x3a67c6ee.SavedState savedState = (p012xc85e97e9.p100xa8fcbcdb.C1144x3a67c6ee.SavedState) parcelable;
        super.A(savedState.getSuperState());
        Q(savedState.f93274d);
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public android.os.Parcelable B() {
        this.P = true;
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (this.f93297x) {
            return absSavedState;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1144x3a67c6ee.SavedState savedState = new p012xc85e97e9.p100xa8fcbcdb.C1144x3a67c6ee.SavedState(absSavedState);
        savedState.f93274d = this.Z;
        return savedState;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void C(java.lang.Object obj) {
        java.util.Set<java.lang.String> set = (java.util.Set) obj;
        if (L()) {
            k();
            set = this.f93281e.b().getStringSet(this.f93291r, set);
        }
        Q(set);
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec
    public java.lang.CharSequence[] M() {
        return this.X;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec
    public java.lang.CharSequence[] N() {
        return this.Y;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec
    public java.util.Set O() {
        return this.Z;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.p101x21ffc6bd.AbstractC1157xa91160ec
    public void Q(java.util.Set set) {
        java.util.Set set2 = this.Z;
        ((java.util.HashSet) set2).clear();
        set2.addAll(set);
        if (L()) {
            boolean L = L();
            java.lang.String str = this.f93291r;
            java.util.Set<java.lang.String> set3 = null;
            if (L) {
                k();
                set3 = this.f93281e.b().getStringSet(str, null);
            }
            if (set.equals(set3)) {
                return;
            }
            k();
            android.content.SharedPreferences.Editor a17 = this.f93281e.a();
            a17.putStringSet(str, set);
            if (!this.f93281e.f93331e) {
                a17.apply();
            }
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i17);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public C1144x3a67c6ee(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559753dy, android.R.attr.dialogPreferenceStyle));
    }
}
