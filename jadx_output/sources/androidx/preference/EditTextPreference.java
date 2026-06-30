package androidx.preference;

/* loaded from: classes13.dex */
public class EditTextPreference extends androidx.preference.DialogPreference {
    public java.lang.String X;

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.EditTextPreference.SavedState> CREATOR = new androidx.preference.g();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f11732d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f11732d = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f11732d);
        }
    }

    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
    }

    @Override // androidx.preference.Preference
    public void A(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.EditTextPreference.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        androidx.preference.EditTextPreference.SavedState savedState = (androidx.preference.EditTextPreference.SavedState) parcelable;
        super.A(savedState.getSuperState());
        M(savedState.f11732d);
    }

    @Override // androidx.preference.Preference
    public android.os.Parcelable B() {
        this.P = true;
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (this.f11764x) {
            return absSavedState;
        }
        androidx.preference.EditTextPreference.SavedState savedState = new androidx.preference.EditTextPreference.SavedState(absSavedState);
        savedState.f11732d = this.X;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void C(java.lang.Object obj) {
        M(j((java.lang.String) obj));
    }

    @Override // androidx.preference.Preference
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

    @Override // androidx.preference.Preference
    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        return typedArray.getString(i17);
    }

    public EditTextPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.tencent.mm.R.attr.f478236ed, android.R.attr.editTextPreferenceStyle));
    }
}
