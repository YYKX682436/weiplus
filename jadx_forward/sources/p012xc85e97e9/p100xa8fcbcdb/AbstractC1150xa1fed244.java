package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.PreferenceGroup */
/* loaded from: classes13.dex */
public abstract class AbstractC1150xa1fed244 extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb {
    public final java.util.List R;
    public boolean S;
    public int T;
    public boolean U;
    public int V;
    public final x.n W;

    public AbstractC1150xa1fed244(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.S = true;
        this.T = 0;
        this.U = false;
        this.V = Integer.MAX_VALUE;
        this.W = new x.n();
        new android.os.Handler();
        this.R = new java.util.ArrayList();
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93355h, i17, i18);
        this.S = obtainStyledAttributes.getBoolean(2, obtainStyledAttributes.getBoolean(2, true));
        if (obtainStyledAttributes.hasValue(1)) {
            int i19 = obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i19 != Integer.MAX_VALUE) {
                android.text.TextUtils.isEmpty(this.f93291r);
            }
            this.V = i19;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void A(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244.SavedState savedState = (p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244.SavedState) parcelable;
        this.V = savedState.f93317d;
        super.A(savedState.getSuperState());
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public android.os.Parcelable B() {
        this.P = true;
        return new p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244.SavedState(android.view.AbsSavedState.EMPTY_STATE, this.V);
    }

    public p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb M(java.lang.CharSequence charSequence) {
        p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb M;
        if (android.text.TextUtils.equals(this.f93291r, charSequence)) {
            return this;
        }
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb N = N(i17);
            java.lang.String str = N.f93291r;
            if (str != null && str.equals(charSequence)) {
                return N;
            }
            if ((N instanceof p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) && (M = ((p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) N).M(charSequence)) != null) {
                return M;
            }
        }
        return null;
    }

    public p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb N(int i17) {
        return (p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb) ((java.util.ArrayList) this.R).get(i17);
    }

    public int O() {
        return ((java.util.ArrayList) this.R).size();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void e(android.os.Bundle bundle) {
        super.e(bundle);
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            N(i17).e(bundle);
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void f(android.os.Bundle bundle) {
        super.f(bundle);
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            N(i17).f(bundle);
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void o(boolean z17) {
        super.o(z17);
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb N = N(i17);
            if (N.B == z17) {
                N.B = !z17;
                N.o(N.J());
                N.n();
            }
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void p() {
        super.p();
        this.U = true;
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            N(i17).p();
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void u() {
        super.u();
        this.U = false;
        int O = O();
        for (int i17 = 0; i17 < O; i17++) {
            N(i17).u();
        }
    }

    /* renamed from: androidx.preference.PreferenceGroup$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244.SavedState> f3587x681a0c0c = new p012xc85e97e9.p100xa8fcbcdb.u();

        /* renamed from: d, reason: collision with root package name */
        public final int f93317d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f93317d = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f93317d);
        }

        public SavedState(android.os.Parcelable parcelable, int i17) {
            super(parcelable);
            this.f93317d = i17;
        }
    }

    public AbstractC1150xa1fed244(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0);
    }

    public AbstractC1150xa1fed244(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
