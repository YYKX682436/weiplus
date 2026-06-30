package androidx.preference;

/* loaded from: classes13.dex */
public class MultiSelectListPreference extends androidx.preference.internal.AbstractMultiSelectListPreference {
    public final java.lang.CharSequence[] X;
    public final java.lang.CharSequence[] Y;
    public final java.util.Set Z;

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.MultiSelectListPreference.SavedState> CREATOR = new androidx.preference.j();

        /* renamed from: d, reason: collision with root package name */
        public java.util.Set f11741d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f11741d = new java.util.HashSet();
            java.lang.String[] strArr = new java.lang.String[readInt];
            parcel.readStringArray(strArr);
            java.util.Collections.addAll(this.f11741d, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f11741d.size());
            java.util.Set set = this.f11741d;
            parcel.writeStringArray((java.lang.String[]) set.toArray(new java.lang.String[set.size()]));
        }
    }

    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.Z = new java.util.HashSet();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11819e, i17, 0);
        java.lang.CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.X = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        java.lang.CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.Y = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void A(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.MultiSelectListPreference.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        androidx.preference.MultiSelectListPreference.SavedState savedState = (androidx.preference.MultiSelectListPreference.SavedState) parcelable;
        super.A(savedState.getSuperState());
        Q(savedState.f11741d);
    }

    @Override // androidx.preference.Preference
    public android.os.Parcelable B() {
        this.P = true;
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (this.f11764x) {
            return absSavedState;
        }
        androidx.preference.MultiSelectListPreference.SavedState savedState = new androidx.preference.MultiSelectListPreference.SavedState(absSavedState);
        savedState.f11741d = this.Z;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void C(java.lang.Object obj) {
        java.util.Set<java.lang.String> set = (java.util.Set) obj;
        if (L()) {
            k();
            set = this.f11748e.b().getStringSet(this.f11758r, set);
        }
        Q(set);
    }

    @Override // androidx.preference.internal.AbstractMultiSelectListPreference
    public java.lang.CharSequence[] M() {
        return this.X;
    }

    @Override // androidx.preference.internal.AbstractMultiSelectListPreference
    public java.lang.CharSequence[] N() {
        return this.Y;
    }

    @Override // androidx.preference.internal.AbstractMultiSelectListPreference
    public java.util.Set O() {
        return this.Z;
    }

    @Override // androidx.preference.internal.AbstractMultiSelectListPreference
    public void Q(java.util.Set set) {
        java.util.Set set2 = this.Z;
        ((java.util.HashSet) set2).clear();
        set2.addAll(set);
        if (L()) {
            boolean L = L();
            java.lang.String str = this.f11758r;
            java.util.Set<java.lang.String> set3 = null;
            if (L) {
                k();
                set3 = this.f11748e.b().getStringSet(str, null);
            }
            if (set.equals(set3)) {
                return;
            }
            k();
            android.content.SharedPreferences.Editor a17 = this.f11748e.a();
            a17.putStringSet(str, set);
            if (!this.f11748e.f11798e) {
                a17.apply();
            }
        }
    }

    @Override // androidx.preference.Preference
    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        java.lang.CharSequence[] textArray = typedArray.getTextArray(i17);
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.tencent.mm.R.attr.f478220dy, android.R.attr.dialogPreferenceStyle));
    }
}
