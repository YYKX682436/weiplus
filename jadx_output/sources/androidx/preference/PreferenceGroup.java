package androidx.preference;

/* loaded from: classes13.dex */
public abstract class PreferenceGroup extends androidx.preference.Preference {
    public final java.util.List R;
    public boolean S;
    public int T;
    public boolean U;
    public int V;
    public final x.n W;

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.S = true;
        this.T = 0;
        this.U = false;
        this.V = Integer.MAX_VALUE;
        this.W = new x.n();
        new android.os.Handler();
        this.R = new java.util.ArrayList();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11822h, i17, i18);
        this.S = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i19 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i19 != Integer.MAX_VALUE) {
                android.text.TextUtils.isEmpty(this.f11758r);
            }
            this.V = i19;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void A(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.PreferenceGroup.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        androidx.preference.PreferenceGroup.SavedState savedState = (androidx.preference.PreferenceGroup.SavedState) parcelable;
        this.V = savedState.f11784d;
        super.A(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    public android.os.Parcelable B() {
        this.P = true;
        return new androidx.preference.PreferenceGroup.SavedState(android.view.AbsSavedState.EMPTY_STATE, this.V);
    }

    public androidx.preference.Preference M(java.lang.CharSequence charSequence) {
        androidx.preference.Preference M;
        if (android.text.TextUtils.equals(this.f11758r, charSequence)) {
            return this;
        }
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            androidx.preference.Preference N = N(i17);
            java.lang.String str = N.f11758r;
            if (str != null && str.equals(charSequence)) {
                return N;
            }
            if ((N instanceof androidx.preference.PreferenceGroup) && (M = ((androidx.preference.PreferenceGroup) N).M(charSequence)) != null) {
                return M;
            }
        }
        return null;
    }

    public androidx.preference.Preference N(int i17) {
        return (androidx.preference.Preference) ((java.util.ArrayList) this.R).get(i17);
    }

    public int O() {
        return ((java.util.ArrayList) this.R).size();
    }

    @Override // androidx.preference.Preference
    public void e(android.os.Bundle bundle) {
        super.e(bundle);
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            N(i17).e(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void f(android.os.Bundle bundle) {
        super.f(bundle);
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            N(i17).f(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void o(boolean z17) {
        super.o(z17);
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            androidx.preference.Preference N = N(i17);
            if (N.B == z17) {
                N.B = !z17;
                N.o(N.J());
                N.n();
            }
        }
    }

    @Override // androidx.preference.Preference
    public void p() {
        super.p();
        this.U = true;
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            N(i17).p();
        }
    }

    @Override // androidx.preference.Preference
    public void u() {
        super.u();
        this.U = false;
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            N(i17).u();
        }
    }

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.PreferenceGroup.SavedState> CREATOR = new androidx.preference.u();

        /* renamed from: d, reason: collision with root package name */
        public final int f11784d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f11784d = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f11784d);
        }

        public SavedState(android.os.Parcelable parcelable, int i17) {
            super(parcelable);
            this.f11784d = i17;
        }
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public PreferenceGroup(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
