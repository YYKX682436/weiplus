package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.EditTextPreference */
/* loaded from: classes13.dex */
public class C1140x2319a6b2 extends p012xc85e97e9.p100xa8fcbcdb.AbstractC1138x57e6e063 {
    public java.lang.String X;

    /* renamed from: androidx.preference.EditTextPreference$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2.SavedState> f3583x681a0c0c = new p012xc85e97e9.p100xa8fcbcdb.g();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f93265d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f93265d = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f93265d);
        }
    }

    public C1140x2319a6b2(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void A(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2.SavedState savedState = (p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2.SavedState) parcelable;
        super.A(savedState.getSuperState());
        M(savedState.f93265d);
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public android.os.Parcelable B() {
        this.P = true;
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (this.f93297x) {
            return absSavedState;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2.SavedState savedState = new p012xc85e97e9.p100xa8fcbcdb.C1140x2319a6b2.SavedState(absSavedState);
        savedState.f93265d = this.X;
        return savedState;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void C(java.lang.Object obj) {
        M(j((java.lang.String) obj));
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public boolean J() {
        return android.text.TextUtils.isEmpty(this.X) || super.J();
    }

    public void M(java.lang.String str) {
        boolean J2 = J();
        this.X = str;
        E(str);
        boolean J3 = J();
        if (J3 != J2) {
            o(J3);
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        return typedArray.getString(i17);
    }

    public C1140x2319a6b2(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559769ed, android.R.attr.editTextPreferenceStyle));
    }
}
