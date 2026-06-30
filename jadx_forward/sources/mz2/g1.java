package mz2;

/* loaded from: classes9.dex */
public class g1 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public mz2.f1 f414655d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 f414656e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f414657f;

    public g1() {
        super(0);
        this.f414657f = false;
    }

    public final void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "onFail()");
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8 = this.f414656e;
        mz2.a aVar2 = (mz2.a) aVar;
        aVar2.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseFingerprintImp", "hy: onOpenFingerprintAuthFailed");
        if (c5820xc13f26f8 != null) {
            am.on onVar = c5820xc13f26f8.f136128g;
            if (onVar.f89098c != null) {
                am.pn pnVar = new am.pn();
                c5820xc13f26f8.f136129h = pnVar;
                pnVar.f89168a = i17;
                pnVar.f89169b = "";
                pnVar.f89170c = "";
                pnVar.f89173f = aVar2.mo148658x368f3a();
                onVar.f89098c.run();
            }
        }
        if (this.f414657f) {
            this.f414656e = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onFail()");
    }

    public final boolean c(boolean z17) {
        f();
        if (!((nz2.o) gm0.j1.s(nz2.o.class)).ja()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "no fingerprints enrolled, use settings to enroll fingerprints first");
            ((nz2.o) gm0.j1.s(nz2.o.class)).mo150320xae7a2e7a();
            this.f414656e = null;
            this.f414657f = true;
            b(1, "");
            return false;
        }
        if (((pz2.a) gm0.j1.s(pz2.a.class)).dg(this.f414655d, 0, z17) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "startIdentify()");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "failed to start identify");
        ((nz2.o) gm0.j1.s(nz2.o.class)).mo150320xae7a2e7a();
        this.f414656e = null;
        this.f414657f = true;
        b(1, "");
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "OpenFingerPrintAuthEvent account is not ready");
            return false;
        }
        this.f414657f = false;
        if (!(c5820xc13f26f8 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "handle OpenFingerPrintAuthEventListener");
        if (!mz2.n0.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "device is not support FingerPrintAuth");
            this.f414657f = true;
            b(1, "");
            return true;
        }
        this.f414656e = c5820xc13f26f8;
        if (c5820xc13f26f8 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", null, "mEvent is null !!!");
            return false;
        }
        java.lang.String str = c5820xc13f26f8.f136128g.f89096a;
        mz2.d2 d2Var = mz2.d2.IML;
        d2Var.f414645e = str;
        boolean ja6 = ((nz2.o) gm0.j1.s(nz2.o.class)).ja();
        if (this.f414655d == null) {
            this.f414655d = new mz2.f1(this);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d2Var.f414644d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenFingerPrintAuthEventListener", "no challenge!!");
            b(1, "");
        } else {
            c(false);
        }
        return ja6;
    }

    public void f() {
        ((nz2.o) gm0.j1.s(nz2.o.class)).mo150320xae7a2e7a();
    }
}
