package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public class i implements im5.a {

    /* renamed from: e, reason: collision with root package name */
    public pq5.g f70645e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f70646f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f70647g = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.x f70648h = new com.tencent.mm.modelbase.CgiLifecycleObserver(this);

    /* renamed from: i, reason: collision with root package name */
    public boolean f70649i = false;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.g f70644d = new com.tencent.mm.modelbase.g(this);

    @Override // im5.a
    public void dead() {
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mm.modelbase.o oVar2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        java.lang.Object obj = "";
        com.tencent.mm.modelbase.g gVar = this.f70644d;
        objArr[0] = (gVar == null || (oVar2 = gVar.f70626g) == null) ? "" : java.lang.Integer.valueOf(oVar2.f70713d);
        com.tencent.mars.xlog.Log.i("MicroMsg.Cgi", "[afterDead] cgi=%s", objArr);
        if (!this.f70649i) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            if (gVar != null && (oVar = gVar.f70626g) != null) {
                obj = java.lang.Integer.valueOf(oVar.f70713d);
            }
            objArr2[0] = obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.Cgi", "[cancelAfterDead] do cancel of cgi=%s", objArr2);
            j();
        }
        this.f70645e = null;
    }

    public void j() {
        com.tencent.mm.modelbase.o oVar;
        if (this.f70647g.compareAndSet(false, true)) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.tencent.mm.modelbase.g gVar = this.f70644d;
            objArr[0] = (gVar == null || (oVar = gVar.f70626g) == null) ? "" : java.lang.Integer.valueOf(oVar.f70713d);
            com.tencent.mars.xlog.Log.i("MicroMsg.Cgi", "[cancel] cgi=%s", objArr);
            if (gVar != null) {
                gVar.f70627h = new java.lang.ref.WeakReference(null);
                com.tencent.mm.modelbase.z2.b(gVar);
            }
            pq5.g gVar2 = this.f70645e;
            if (gVar2 != null) {
                gVar2.j(true);
            }
        }
    }

    public void k(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
    }

    public synchronized pq5.g l() {
        com.tencent.mm.modelbase.e eVar;
        iz5.a.d("You should set a CommReqResp!", this.f70646f);
        iz5.a.g("RunCgi NetSceneQueue not ready!", com.tencent.mm.modelbase.z2.c());
        if (this.f70645e == null) {
            eVar = new com.tencent.mm.modelbase.e(this);
            eVar.M(new com.tencent.mm.modelbase.d(this));
            this.f70645e = eVar;
        } else {
            eVar = null;
        }
        return eVar;
    }

    public void p(com.tencent.mm.modelbase.o oVar) {
        this.f70646f = oVar;
        this.f70644d.f70626g = oVar;
    }
}
