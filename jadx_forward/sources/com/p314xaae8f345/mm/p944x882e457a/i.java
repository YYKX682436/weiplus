package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes7.dex */
public class i implements im5.a {

    /* renamed from: e, reason: collision with root package name */
    public pq5.g f152178e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f152179f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f152180g = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.x f152181h = new com.p314xaae8f345.mm.p944x882e457a.C11107x7a9e027b(this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f152182i = false;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.g f152177d = new com.p314xaae8f345.mm.p944x882e457a.g(this);

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        com.p314xaae8f345.mm.p944x882e457a.o oVar2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Object obj = "";
        com.p314xaae8f345.mm.p944x882e457a.g gVar = this.f152177d;
        objArr[0] = (gVar == null || (oVar2 = gVar.f152159g) == null) ? "" : java.lang.Integer.valueOf(oVar2.f152246d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cgi", "[afterDead] cgi=%s", objArr);
        if (!this.f152182i) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (gVar != null && (oVar = gVar.f152159g) != null) {
                obj = java.lang.Integer.valueOf(oVar.f152246d);
            }
            objArr2[0] = obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cgi", "[cancelAfterDead] do cancel of cgi=%s", objArr2);
            j();
        }
        this.f152178e = null;
    }

    public void j() {
        com.p314xaae8f345.mm.p944x882e457a.o oVar;
        if (this.f152180g.compareAndSet(false, true)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.p314xaae8f345.mm.p944x882e457a.g gVar = this.f152177d;
            objArr[0] = (gVar == null || (oVar = gVar.f152159g) == null) ? "" : java.lang.Integer.valueOf(oVar.f152246d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Cgi", "[cancel] cgi=%s", objArr);
            if (gVar != null) {
                gVar.f152160h = new java.lang.ref.WeakReference(null);
                com.p314xaae8f345.mm.p944x882e457a.z2.b(gVar);
            }
            pq5.g gVar2 = this.f152178e;
            if (gVar2 != null) {
                gVar2.j(true);
            }
        }
    }

    public void k(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    public synchronized pq5.g l() {
        com.p314xaae8f345.mm.p944x882e457a.e eVar;
        iz5.a.d("You should set a CommReqResp!", this.f152179f);
        iz5.a.g("RunCgi NetSceneQueue not ready!", com.p314xaae8f345.mm.p944x882e457a.z2.c());
        if (this.f152178e == null) {
            eVar = new com.p314xaae8f345.mm.p944x882e457a.e(this);
            eVar.M(new com.p314xaae8f345.mm.p944x882e457a.d(this));
            this.f152178e = eVar;
        } else {
            eVar = null;
        }
        return eVar;
    }

    public void p(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        this.f152179f = oVar;
        this.f152177d.f152159g = oVar;
    }
}
