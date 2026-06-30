package at0;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at0.n f95105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs0.a f95106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f95107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f95108g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f95109h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f95110i;

    public f(at0.n nVar, rs0.a aVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, yz5.l lVar) {
        this.f95105d = nVar;
        this.f95106e = aVar;
        this.f95107f = h0Var;
        this.f95108g = f0Var;
        this.f95109h = h0Var2;
        this.f95110i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17;
        if (this.f95105d.f95141p) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop daemonRecorder ");
        ht0.b bVar = this.f95105d.f95129d;
        sb6.append(bVar != null ? bVar.mo127744x5000ed37() : null);
        sb6.append(' ');
        ht0.b bVar2 = this.f95105d.f95129d;
        sb6.append(bVar2 != null ? bVar2.b() : null);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.CameraPreviewContainer", sb6.toString(), new java.lang.Object[0]);
        this.f95106e.a();
        this.f95105d.g("LowRecordStopWaitTime", java.lang.Long.valueOf(this.f95106e.f480821b.a()));
        ht0.b bVar3 = this.f95105d.f95129d;
        java.lang.String mo127744x5000ed37 = bVar3 != null ? bVar3.mo127744x5000ed37() : null;
        ht0.b bVar4 = this.f95105d.f95129d;
        java.lang.String b17 = bVar4 != null ? bVar4.b() : null;
        if (mo127744x5000ed37 == null || b17 == null || (d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(mo127744x5000ed37, true)) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f95107f;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f95108g;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f95109h;
        at0.n nVar = this.f95105d;
        yz5.l lVar = this.f95110i;
        ct0.b bVar5 = (ct0.b) h0Var.f391656d;
        bVar5.f303739c = true;
        bVar5.getClass();
        bVar5.f303742f = mo127744x5000ed37;
        ct0.b bVar6 = (ct0.b) h0Var.f391656d;
        bVar6.getClass();
        bVar6.f303743g = b17;
        ct0.b bVar7 = (ct0.b) h0Var.f391656d;
        bVar7.f303744h = 0;
        bVar7.f303745i = d17.f243915a;
        f0Var.f391649d++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraPreviewContainer", "record video info daemon: " + d17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(985L, 174L, 1L, false);
        g0Var.mo68477x336bdfd8(985L, 173L, d17.f243916b, false);
        g0Var.mo68477x336bdfd8(985L, 175L, d17.f243919e, false);
        if (f0Var.f391649d != 2) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i((java.lang.Runnable) h0Var2.f391656d, 3000L);
            return;
        }
        g0Var.mo68477x336bdfd8(985L, 150L, 1L, false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l((java.lang.Runnable) h0Var2.f391656d);
        nVar.f95141p = true;
        if (lVar != null) {
            lVar.mo146xb9724478(h0Var.f391656d);
        }
    }
}
