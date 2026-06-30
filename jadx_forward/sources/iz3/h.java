package iz3;

/* loaded from: classes12.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz3.j f377614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry3.r f377615e;

    public h(iz3.j jVar, ry3.r rVar) {
        this.f377614d = jVar;
        this.f377615e = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ry3.p pVar;
        iz3.j jVar = this.f377614d;
        ry3.r rVar = this.f377615e;
        if (jVar == null || (pVar = jVar.f377617a) == null) {
            return;
        }
        long j17 = pVar.f483060a;
        boolean z17 = pVar.f483061b != 2;
        if (!com.p314xaae8f345.mm.vfs.w6.j(pVar.f483064e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseAiImageUploader", "onScanFailed session: %d, errCode: %d, errMsg: %s", java.lang.Long.valueOf(j17), 999, "image not exist");
            ry3.q qVar = new ry3.q();
            qVar.f483076a = j17;
            qVar.f483077b = false;
            qVar.f483078c = 3;
            qVar.f483079d = 999;
            qVar.f483080e = "image not exist";
            ((ku5.t0) ku5.t0.f394148d).B(new iz3.t(rVar, j17, qVar));
            return;
        }
        if (pVar.f483070k == null && pVar.f483071l) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.o1 o1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.o1.f240505a;
            java.lang.String imagePath = pVar.f483064e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imagePath, "imagePath");
            pVar.f483070k = o1Var.a(imagePath);
        }
        if (z17) {
            f04.l.b(pVar.f483064e, 0, hz3.i.a(pVar.f483061b), new iz3.g(jVar, j17, pVar, rVar));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.w(j17, 0, pVar.f483070k, 2, null);
        jVar.f377618b = wVar.hashCode();
        gm0.j1.d().g(wVar);
    }
}
