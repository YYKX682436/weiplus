package bt1;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a */
    public final java.util.concurrent.ConcurrentHashMap f24171a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b */
    public final fp0.t f24172b;

    /* renamed from: c */
    public final com.tencent.mm.sdk.platformtools.n3 f24173c;

    public l() {
        fp0.t tVar = new fp0.t("BypSyncExecutor");
        tVar.e();
        this.f24172b = tVar;
        xu5.b bVar = w11.h2.f442049e;
        this.f24173c = new com.tencent.mm.sdk.platformtools.n3(w11.h2.f442049e, new bt1.i(this));
    }

    public static /* synthetic */ void b(bt1.l lVar, java.util.List list, bt1.g gVar, boolean z17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        if ((i18 & 8) != 0) {
            i17 = 0;
        }
        lVar.a(list, gVar, z17, i17);
    }

    public final void a(java.util.List selector, bt1.g source, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(selector, "selector");
        kotlin.jvm.internal.o.g(source, "source");
        try {
            com.tencent.mars.xlog.Log.i("Byp.BypSyncCore", "[doSync] selector=" + selector + " source=" + source + " isContinue=" + z17 + " retryCount=" + i17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Byp.BypSyncCore", th6, "doSync err", new java.lang.Object[0]);
        }
        if (i17 >= 3) {
            com.tencent.mars.xlog.Log.e("Byp.BypSyncCore", "[doSync] over limit retry count[" + i17 + "] limit=3");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1465L, 130L, 1L);
            return;
        }
        fp0.r rVar = new fp0.r(new bt1.k(selector, source, this, i17), null, 2, null);
        fp0.t tVar = this.f24172b;
        if (!z17) {
            tVar.b(rVar);
            return;
        }
        tVar.getClass();
        com.tencent.mars.xlog.Log.i("Loader.SingleTaskExecutor", "[postTask] name=" + tVar.f265281a + " isRunningTask=" + tVar.f265284d + " task=" + rVar);
        rVar.f265279h = tVar.f265286f;
        tVar.f265283c.addFirst(rVar);
        tVar.c();
    }
}
