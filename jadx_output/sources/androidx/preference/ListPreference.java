package androidx.preference;

/* loaded from: classes13.dex */
public class ListPreference extends androidx.preference.DialogPreference {
    public java.lang.CharSequence[] X;
    public java.lang.CharSequence[] Y;
    public java.lang.String Z;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f11735p0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f11736x0;

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.ListPreference.SavedState> CREATOR = new androidx.preference.h();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f11737d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f11737d = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f11737d);
        }
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11818d, i17, i18);
        java.lang.CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.X = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        java.lang.CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.Y = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11820f, i17, i18);
        this.f11735p0 = d3.r.h(obtainStyledAttributes2, 32, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public void A(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.ListPreference.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        androidx.preference.ListPreference.SavedState savedState = (androidx.preference.ListPreference.SavedState) parcelable;
        super.A(savedState.getSuperState());
        N(savedState.f11737d);
    }

    @Override // androidx.preference.Preference
    public android.os.Parcelable B() {
        this.P = true;
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (this.f11764x) {
            return absSavedState;
        }
        androidx.preference.ListPreference.SavedState savedState = new androidx.preference.ListPreference.SavedState(absSavedState);
        savedState.f11737d = this.Z;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void C(java.lang.Object obj) {
        N(j((java.lang.String) obj));
    }

    @Override // androidx.preference.Preference
    public void H(java.lang.CharSequence charSequence) {
        super.H(charSequence);
        if (charSequence == null && this.f11735p0 != null) {
            this.f11735p0 = null;
        } else {
            if (charSequence == null || charSequence.equals(this.f11735p0)) {
                return;
            }
            this.f11735p0 = charSequence.toString();
        }
    }

    public java.lang.CharSequence M() {
        java.lang.CharSequence[] charSequenceArr;
        java.lang.CharSequence[] charSequenceArr2;
        java.lang.String str = this.Z;
        int i17 = -1;
        if (str != null && (charSequenceArr2 = this.Y) != null) {
            int length = charSequenceArr2.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                }
                if (this.Y[length].equals(str)) {
                    i17 = length;
                    break;
                }
                length--;
            }
        }
        if (i17 < 0 || (charSequenceArr = this.X) == null) {
            return null;
        }
        return charSequenceArr[i17];
    }

    public void N(java.lang.String str) {
        boolean z17 = !android.text.TextUtils.equals(this.Z, str);
        if (z17 || !this.f11736x0) {
            this.Z = str;
            this.f11736x0 = true;
            E(str);
            if (z17) {
                n();
            }
        }
    }

    @Override // androidx.preference.Preference
    public java.lang.CharSequence l() {
        java.lang.CharSequence M = M();
        java.lang.String str = this.f11735p0;
        if (str == null) {
            return this.f11755o;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (M == null) {
            M = "";
        }
        objArr[0] = M;
        return java.lang.String.format(str, objArr);
    }

    @Override // androidx.preference.Preference
    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        return typedArray.getString(i17);
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public ListPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.tencent.mm.R.attr.f478220dy, android.R.attr.dialogPreferenceStyle));
    }
}
