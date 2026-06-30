package ef0;

/* loaded from: classes8.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a f333891d;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar) {
        this.f333891d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hm4.c cVar = (hm4.c) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f478670h.mo141623x754a37bb();
        java.lang.String path = this.f333891d.f186864e;
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingSyncExtension", "onReddotChanged path: ".concat(path));
        w71.m1 a17 = cVar.a();
        if (a17 != null) {
            p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170128x21b094b4(((w71.n1) a17).m105978x2737f10(), path);
        }
    }
}
