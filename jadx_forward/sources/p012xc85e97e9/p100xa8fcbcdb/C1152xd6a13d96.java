package p012xc85e97e9.p100xa8fcbcdb;

/* renamed from: androidx.preference.SeekBarPreference */
/* loaded from: classes13.dex */
public class C1152xd6a13d96 extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb {
    public int R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public android.widget.SeekBar W;
    public android.widget.TextView X;
    public final boolean Y;
    public final boolean Z;

    /* renamed from: p0, reason: collision with root package name */
    public final android.widget.SeekBar.OnSeekBarChangeListener f93318p0;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.View.OnKeyListener f93319x0;

    /* renamed from: androidx.preference.SeekBarPreference$SavedState */
    /* loaded from: classes13.dex */
    public static class SavedState extends p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb.BaseSavedState {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96.SavedState> f3588x681a0c0c = new p012xc85e97e9.p100xa8fcbcdb.j0();

        /* renamed from: d, reason: collision with root package name */
        public int f93320d;

        /* renamed from: e, reason: collision with root package name */
        public int f93321e;

        /* renamed from: f, reason: collision with root package name */
        public int f93322f;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f93320d = parcel.readInt();
            this.f93321e = parcel.readInt();
            this.f93322f = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f93320d);
            parcel.writeInt(this.f93321e);
            parcel.writeInt(this.f93322f);
        }
    }

    public C1152xd6a13d96(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f93318p0 = new p012xc85e97e9.p100xa8fcbcdb.h0(this);
        this.f93319x0 = new p012xc85e97e9.p100xa8fcbcdb.i0(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012xc85e97e9.p100xa8fcbcdb.g0.f93357j, i17, 0);
        this.S = obtainStyledAttributes.getInt(3, 0);
        int i18 = obtainStyledAttributes.getInt(1, 100);
        int i19 = this.S;
        i18 = i18 < i19 ? i19 : i18;
        if (i18 != this.T) {
            this.T = i18;
            n();
        }
        int i27 = obtainStyledAttributes.getInt(4, 0);
        if (i27 != this.U) {
            this.U = java.lang.Math.min(this.T - this.S, java.lang.Math.abs(i27));
            n();
        }
        this.Y = obtainStyledAttributes.getBoolean(2, true);
        this.Z = obtainStyledAttributes.getBoolean(5, true);
        obtainStyledAttributes.recycle();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void A(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96.SavedState savedState = (p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96.SavedState) parcelable;
        super.A(savedState.getSuperState());
        this.R = savedState.f93320d;
        this.S = savedState.f93321e;
        this.T = savedState.f93322f;
        n();
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public android.os.Parcelable B() {
        this.P = true;
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (this.f93297x) {
            return absSavedState;
        }
        p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96.SavedState savedState = new p012xc85e97e9.p100xa8fcbcdb.C1152xd6a13d96.SavedState(absSavedState);
        savedState.f93320d = this.R;
        savedState.f93321e = this.S;
        savedState.f93322f = this.T;
        return savedState;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void C(java.lang.Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        if (L()) {
            k();
            intValue = this.f93281e.b().getInt(this.f93291r, intValue);
        }
        M(intValue, true);
    }

    public final void M(int i17, boolean z17) {
        int i18 = this.S;
        if (i17 < i18) {
            i17 = i18;
        }
        int i19 = this.T;
        if (i17 > i19) {
            i17 = i19;
        }
        if (i17 != this.R) {
            this.R = i17;
            android.widget.TextView textView = this.X;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(i17));
            }
            if (L()) {
                int i27 = ~i17;
                boolean L = L();
                java.lang.String str = this.f93291r;
                if (L) {
                    k();
                    i27 = this.f93281e.b().getInt(str, i27);
                }
                if (i17 != i27) {
                    k();
                    android.content.SharedPreferences.Editor a17 = this.f93281e.a();
                    a17.putInt(str, i17);
                    if (!this.f93281e.f93331e) {
                        a17.apply();
                    }
                }
            }
            if (z17) {
                n();
            }
        }
    }

    public void N(android.widget.SeekBar seekBar) {
        int progress = this.S + seekBar.getProgress();
        if (progress != this.R) {
            if (d(java.lang.Integer.valueOf(progress))) {
                M(progress, false);
            } else {
                seekBar.setProgress(this.R - this.S);
            }
        }
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public void s(p012xc85e97e9.p100xa8fcbcdb.f0 f0Var) {
        super.s(f0Var);
        f0Var.f3639x46306858.setOnKeyListener(this.f93319x0);
        this.W = (android.widget.SeekBar) f0Var.i(com.p314xaae8f345.mm.R.id.mhp);
        android.widget.TextView textView = (android.widget.TextView) f0Var.i(com.p314xaae8f345.mm.R.id.mhr);
        this.X = textView;
        if (this.Z) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.X = null;
        }
        android.widget.SeekBar seekBar = this.W;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f93318p0);
        this.W.setMax(this.T - this.S);
        int i17 = this.U;
        if (i17 != 0) {
            this.W.setKeyProgressIncrement(i17);
        } else {
            this.U = this.W.getKeyProgressIncrement();
        }
        this.W.setProgress(this.R - this.S);
        android.widget.TextView textView2 = this.X;
        if (textView2 != null) {
            textView2.setText(java.lang.String.valueOf(this.R));
        }
        this.W.setEnabled(m());
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb
    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        return java.lang.Integer.valueOf(typedArray.getInt(i17, 0));
    }

    public C1152xd6a13d96(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.p314xaae8f345.mm.R.C30857x2dd9f1.f81543if);
    }
}
