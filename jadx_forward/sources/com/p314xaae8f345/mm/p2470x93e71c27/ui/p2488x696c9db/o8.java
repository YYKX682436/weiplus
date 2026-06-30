package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes15.dex */
public class o8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f273345a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 f273346b = com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    public int f273347c;

    /* renamed from: d, reason: collision with root package name */
    public int f273348d;

    /* renamed from: e, reason: collision with root package name */
    public int f273349e;

    /* renamed from: f, reason: collision with root package name */
    public int f273350f;

    /* renamed from: g, reason: collision with root package name */
    public int f273351g;

    /* renamed from: h, reason: collision with root package name */
    public int f273352h;

    public boolean a(int i17, int i18, int i19, int i27) {
        if (this.f273347c == i17 && this.f273348d == i18 && this.f273349e == i19 && this.f273350f == i27) {
            return true;
        }
        this.f273347c = i17;
        this.f273348d = i18;
        this.f273349e = i19;
        this.f273350f = i27;
        float f17 = (i19 * 1.0f) / i27;
        float f18 = (i17 * 1.0f) / i18;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var = this.f273346b;
        if (e1Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.DEFAULT) {
            b(f17, f18);
            return false;
        }
        if (e1Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CONTAIN) {
            if (i17 < i18) {
                int i28 = (int) (i17 / f17);
                this.f273352h = i28;
                this.f273351g = i17;
                if (i28 <= i18) {
                    return false;
                }
                this.f273351g = (int) (i18 * f17);
                this.f273352h = i18;
                return false;
            }
            int i29 = (int) (i18 * f17);
            this.f273351g = i29;
            this.f273352h = i18;
            if (i29 <= i17) {
                return false;
            }
            this.f273352h = (int) (i17 / f17);
            this.f273351g = i17;
            return false;
        }
        if (e1Var == com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.FILL) {
            this.f273352h = i18;
            this.f273351g = i17;
            return false;
        }
        if (e1Var != com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.COVER) {
            b(f17, f18);
            return false;
        }
        if (i17 > i18) {
            int i37 = (int) (i17 / f17);
            this.f273352h = i37;
            this.f273351g = i17;
            if (i37 >= i18) {
                return false;
            }
            this.f273351g = (int) (i18 * f17);
            this.f273352h = i18;
            return false;
        }
        int i38 = (int) (i18 * f17);
        this.f273351g = i38;
        this.f273352h = i18;
        if (i38 >= i17) {
            return false;
        }
        this.f273352h = (int) (i17 / f17);
        this.f273351g = i17;
        return false;
    }

    public final void b(float f17, float f18) {
        if (!this.f273345a) {
            int i17 = this.f273347c;
            int i18 = this.f273348d;
            if (i17 < i18) {
                this.f273352h = (int) (i17 / f17);
                this.f273351g = i17;
                return;
            } else {
                this.f273351g = (int) (i18 * f17);
                this.f273352h = i18;
                return;
            }
        }
        if (java.lang.Math.abs(f17 - f18) > 0.05d) {
            int i19 = this.f273347c;
            int i27 = this.f273348d;
            if (i19 < i27) {
                this.f273352h = (int) (i19 / f17);
                this.f273351g = i19;
                return;
            } else {
                this.f273351g = (int) (i27 * f17);
                this.f273352h = i27;
                return;
            }
        }
        int i28 = this.f273347c;
        int i29 = this.f273348d;
        if (i28 > i29) {
            this.f273352h = (int) (i28 / f17);
            this.f273351g = i28;
        } else {
            this.f273351g = (int) (i29 * f17);
            this.f273352h = i29;
        }
    }

    public void c() {
        this.f273348d = 0;
        this.f273347c = 0;
        this.f273350f = 0;
        this.f273349e = 0;
        this.f273352h = 0;
        this.f273351g = 0;
    }

    public boolean d(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var2 = this.f273346b;
        boolean z17 = e1Var2 == e1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewSizeCache", "set scale type old[%s] new[%s]", e1Var2, e1Var);
        this.f273346b = e1Var;
        c();
        return !z17;
    }
}
