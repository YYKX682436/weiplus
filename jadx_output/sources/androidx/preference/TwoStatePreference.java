package androidx.preference;

/* loaded from: classes13.dex */
public abstract class TwoStatePreference extends androidx.preference.Preference {
    public java.lang.CharSequence R;
    public java.lang.CharSequence S;
    public boolean T;
    public boolean U;
    public boolean V;

    /* loaded from: classes13.dex */
    public static class SavedState extends androidx.preference.Preference.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.preference.TwoStatePreference.SavedState> CREATOR = new androidx.preference.m0();

        /* renamed from: d, reason: collision with root package name */
        public boolean f11790d;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.f11790d = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            super.writeToParcel(parcel, i17);
            parcel.writeInt(this.f11790d ? 1 : 0);
        }
    }

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
    }

    @Override // androidx.preference.Preference
    public void A(android.os.Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(androidx.preference.TwoStatePreference.SavedState.class)) {
            super.A(parcelable);
            return;
        }
        androidx.preference.TwoStatePreference.SavedState savedState = (androidx.preference.TwoStatePreference.SavedState) parcelable;
        super.A(savedState.getSuperState());
        M(savedState.f11790d);
    }

    @Override // androidx.preference.Preference
    public android.os.Parcelable B() {
        this.P = true;
        android.view.AbsSavedState absSavedState = android.view.AbsSavedState.EMPTY_STATE;
        if (this.f11764x) {
            return absSavedState;
        }
        androidx.preference.TwoStatePreference.SavedState savedState = new androidx.preference.TwoStatePreference.SavedState(absSavedState);
        savedState.f11790d = this.T;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public void C(java.lang.Object obj) {
        if (obj == null) {
            obj = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (L()) {
            k();
            booleanValue = this.f11748e.b().getBoolean(this.f11758r, booleanValue);
        }
        M(booleanValue);
    }

    @Override // androidx.preference.Preference
    public boolean J() {
        return (this.V ? this.T : !this.T) || super.J();
    }

    public void M(boolean z17) {
        boolean z18 = this.T != z17;
        if (z18 || !this.U) {
            this.T = z17;
            this.U = true;
            if (L()) {
                boolean z19 = !z17;
                boolean L = L();
                java.lang.String str = this.f11758r;
                if (L) {
                    k();
                    z19 = this.f11748e.b().getBoolean(str, z19);
                }
                if (z17 != z19) {
                    k();
                    android.content.SharedPreferences.Editor a17 = this.f11748e.a();
                    a17.putBoolean(str, z17);
                    if (!this.f11748e.f11798e) {
                        a17.apply();
                    }
                }
            }
            if (z18) {
                o(J());
                n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.T
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.R
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.T
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.S
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.S
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3c
            java.lang.CharSequence r2 = r4.f11755o
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3c
            r5.setText(r2)
            r0 = r1
        L3c:
            if (r0 != 0) goto L3f
            goto L41
        L3f:
            r1 = 8
        L41:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4a
            r5.setVisibility(r1)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.N(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public void t() {
        boolean z17 = !this.T;
        if (d(java.lang.Boolean.valueOf(z17))) {
            M(z17);
        }
    }

    @Override // androidx.preference.Preference
    public java.lang.Object w(android.content.res.TypedArray typedArray, int i17) {
        return java.lang.Boolean.valueOf(typedArray.getBoolean(i17, false));
    }

    public TwoStatePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
