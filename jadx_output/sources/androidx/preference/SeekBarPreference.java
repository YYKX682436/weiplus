package androidx.preference;

/* loaded from: classes13.dex */
public class SeekBarPreference extends androidx.preference.Preference {
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
    public final android.widget.SeekBar.OnSeekBarChangeListener f11785p0;

    /* renamed from: x0, reason: collision with root package name */
    public final android.view.View.OnKeyListener f11786x0;

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.SeekBarPreference.SavedState> CREATOR = new androidx.preference.j0();

        /* renamed from: d, reason: collision with root package name */
        public int f11787d;

        /* renamed from: e, reason: collision with root package name */
        public int f11788e;

        /* renamed from: f, reason: collision with root package name */
        public int f11789f;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f11787d = parcel.readInt();
            this.f11788e = parcel.readInt();
            this.f11789f = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f11787d);
            parcel.writeInt(this.f11788e);
            parcel.writeInt(this.f11789f);
        }
    }

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f11785p0 = new androidx.preference.h0(this);
        this.f11786x0 = new androidx.preference.i0(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.g0.f11824j, i17, 0);
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

    @Override // androidx.preference.Preference
    public void A(android.os.Parcelable parcelable) {
        if (!parcelable.getClass().equals(androidx.preference.SeekBarPreference.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        androidx.preference.SeekBarPreference.SavedState savedState = (androidx.preference.SeekBarPreference.SavedState) parcelable;
        super.A(savedState.getSuperState());
        this.R = savedState.f11787d;
        this.S = savedState.f11788e;
        this.T = savedState.f11789f;
        n();
    }

    @Override // androidx.preference.Preference
    public android.os.Parcelable B() {
        this.P = true;
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (this.f11764x) {
            return absSavedState;
        }
        androidx.preference.SeekBarPreference.SavedState savedState = new androidx.preference.SeekBarPreference.SavedState(absSavedState);
        savedState.f11787d = this.R;
        savedState.f11788e = this.S;
        savedState.f11789f = this.T;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void C(java.lang.Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        if (L()) {
            k();
            intValue = this.f11748e.b().getInt(this.f11758r, intValue);
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
                java.lang.String str = this.f11758r;
                if (L) {
                    k();
                    i27 = this.f11748e.b().getInt(str, i27);
                }
                if (i17 != i27) {
                    k();
                    android.content.SharedPreferences.Editor a17 = this.f11748e.a();
                    a17.putInt(str, i17);
                    if (!this.f11748e.f11798e) {
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

    @Override // androidx.preference.Preference
    public void s(androidx.preference.f0 f0Var) {
        super.s(f0Var);
        f0Var.itemView.setOnKeyListener(this.f11786x0);
        this.W = (android.widget.SeekBar) f0Var.i(com.tencent.mm.R.id.mhp);
        android.widget.TextView textView = (android.widget.TextView) f0Var.i(com.tencent.mm.R.id.mhr);
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
        seekBar.setOnSeekBarChangeListener(this.f11785p0);
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

    @Override // androidx.preference.Preference
    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        return java.lang.Integer.valueOf(typedArray.getInt(i17, 0));
    }

    public SeekBarPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f10if);
    }
}
