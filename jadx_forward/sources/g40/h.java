package g40;

/* loaded from: classes12.dex */
public final class h implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g40.l f350221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h40.f f350222b;

    public h(g40.l lVar, h40.f fVar) {
        this.f350221a = lVar;
        this.f350222b = fVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p947xba6de98f.m1 m1Var = event.f152636a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileRecordMsgDownloadHelper", "CdnJavaHelperListener %s", m1Var);
        if (m1Var == com.p314xaae8f345.mm.p947xba6de98f.m1.f152618q) {
            g40.l lVar = this.f350221a;
            lVar.f350230e = false;
            i40.b bVar = this.f350222b.f360276d;
            if (bVar != null) {
                bVar.b();
            }
            java.lang.String str = lVar.f350232g;
            if (str != null) {
                d40.q qVar = (d40.q) i95.n0.c(d40.q.class);
                f40.k kVar = new f40.k(5, 0L, 0L);
                qVar.getClass();
                f40.m.f340971g.a().f340972f.compute(str, new f40.l(kVar));
            }
            lVar.c();
        }
    }
}
