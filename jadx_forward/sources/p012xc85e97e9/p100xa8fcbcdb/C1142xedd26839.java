package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.ListPreference */
/* loaded from: classes13.dex */
public class C1142xedd26839 extends p012xc85e97e9.p100xa8fcbcdb.AbstractC1138x57e6e063 {
    public java.lang.CharSequence[] X;
    public java.lang.CharSequence[] Y;
    public java.lang.String Z;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f93268p0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f93269x0;

    /* renamed from: androidx.preference.ListPreference$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839.SavedState> f3584x681a0c0c = new p012xc85e97e9.p100xa8fcbcdb.h();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f93270d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f93270d = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeString(this.f93270d);
        }
    }

    public C1142xedd26839(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93351d, i17, i18);
        java.lang.CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.X = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        java.lang.CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.Y = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        obtainStyledAttributes.recycle();
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93353f, i17, i18);
        this.f93268p0 = d3.r.h(obtainStyledAttributes2, 32, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void A(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839.SavedState savedState = (p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839.SavedState) parcelable;
        super.A(savedState.getSuperState());
        N(savedState.f93270d);
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public android.os.Parcelable B() {
        this.P = true;
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (this.f93297x) {
            return absSavedState;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839.SavedState savedState = new p012xc85e97e9.p100xa8fcbcdb.C1142xedd26839.SavedState(absSavedState);
        savedState.f93270d = this.Z;
        return savedState;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void C(java.lang.Object obj) {
        N(j((java.lang.String) obj));
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void H(java.lang.CharSequence charSequence) {
        super.H(charSequence);
        if (charSequence == null && this.f93268p0 != null) {
            this.f93268p0 = null;
        } else {
            if (charSequence == null || charSequence.equals(this.f93268p0)) {
                return;
            }
            this.f93268p0 = charSequence.toString();
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
        if (z17 || !this.f93269x0) {
            this.Z = str;
            this.f93269x0 = true;
            E(str);
            if (z17) {
                n();
            }
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public java.lang.CharSequence l() {
        java.lang.CharSequence M = M();
        java.lang.String str = this.f93268p0;
        if (str == null) {
            return this.f93288o;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        if (M == null) {
            M = "";
        }
        objArr[0] = M;
        return java.lang.String.format(str, objArr);
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        return typedArray.getString(i17);
    }

    public C1142xedd26839(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public C1142xedd26839(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, d3.r.a(context, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559753dy, android.R.attr.dialogPreferenceStyle));
    }
}
