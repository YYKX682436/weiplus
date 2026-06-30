package bt1;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a */
    public final java.util.concurrent.ConcurrentHashMap f105704a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b */
    public final fp0.t f105705b;

    /* renamed from: c */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f105706c;

    public l() {
        fp0.t tVar = new fp0.t("BypSyncExecutor");
        tVar.e();
        this.f105705b = tVar;
        xu5.b bVar = w11.h2.f523582e;
        this.f105706c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(w11.h2.f523582e, new bt1.i(this));
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selector, "selector");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.BypSyncCore", "[doSync] selector=" + selector + " source=" + source + " isContinue=" + z17 + " retryCount=" + i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Byp.BypSyncCore", th6, "doSync err", new java.lang.Object[0]);
        }
        if (i17 >= 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Byp.BypSyncCore", "[doSync] over limit retry count[" + i17 + "] limit=3");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1465L, 130L, 1L);
            return;
        }
        fp0.r rVar = new fp0.r(new bt1.k(selector, source, this, i17), null, 2, null);
        fp0.t tVar = this.f105705b;
        if (!z17) {
            tVar.b(rVar);
            return;
        }
        tVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Loader.SingleTaskExecutor", "[postTask] name=" + tVar.f346814a + " isRunningTask=" + tVar.f346817d + " task=" + rVar);
        rVar.f346812h = tVar.f346819f;
        tVar.f346816c.addFirst(rVar);
        tVar.c();
    }
}
