package wk;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public w21.k0 f528422d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f528423e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f528424f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f528425g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f528426h;

    public n() {
        super(0);
    }

    public final void b() {
        w21.k0 k0Var = this.f528422d;
        if (k0Var != null) {
            k0Var.mo166726xad07d6f3();
            java.lang.Runnable runnable = this.f528426h;
            if (runnable != null) {
                if (this.f528425g) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k6) runnable).run();
                }
                this.f528426h = null;
            }
            this.f528424f = true;
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5399xd243b6 c5399xd243b6 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5399xd243b6) abstractC20979x809547d1;
        if (!(c5399xd243b6 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5399xd243b6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.ExtSimpleRecord", "mismatched event");
            return false;
        }
        am.q8 q8Var = c5399xd243b6.f135741g;
        int i17 = q8Var.f89229a;
        am.r8 r8Var = c5399xd243b6.f135742h;
        if (i17 == 1) {
            if (this.f528422d == null) {
                this.f528422d = new w21.k0();
            }
            this.f528426h = q8Var.f89232d;
            w21.k0 k0Var = this.f528422d;
            if (k0Var.f523952c == 1) {
                k0Var.mo166726xad07d6f3();
            }
            this.f528422d.mo166725x8e35cb53(q8Var.f89230b);
            r8Var.getClass();
            int i18 = q8Var.f89231c;
            if (i18 <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtSimpleRecord", "duration is invalid, less than 0");
                i18 = 60;
            }
            if (i18 > 600) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtSimpleRecord", "duration is invalid, more than %d", 600);
                i18 = 600;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtSimpleRecord", "MaxVoiceRecordTime (%d)s", java.lang.Integer.valueOf(i18));
            long j17 = i18 * 1000;
            if (this.f528423e == null) {
                this.f528423e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new wk.m(this), false);
            }
            if (this.f528423e.e()) {
                this.f528423e.d();
            }
            this.f528425g = false;
            this.f528423e.c(j17, j17);
            this.f528424f = false;
        } else if (i17 == 2 && this.f528422d != null) {
            if (!this.f528424f) {
                this.f528423e.d();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtSimpleRecord", "Voice record stop.");
                b();
            }
            r8Var.getClass();
        }
        return true;
    }
}
