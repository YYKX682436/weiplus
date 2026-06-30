package q01;

/* loaded from: classes4.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q01.x f440874d;

    public w(q01.x xVar) {
        this.f440874d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneInspect duplicating callback: ");
        q01.x xVar = this.f440874d;
        sb6.append(xVar.e());
        sb6.append(" - dump: ");
        jz5.g gVar = xVar.f440884n;
        sb6.append(((java.util.List) ((jz5.n) gVar).mo141623x754a37bb()).size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", sb6.toString());
        int i17 = 0;
        for (java.lang.Object obj : (java.util.List) ((jz5.n) gVar).mo141623x754a37bb()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "\tcaller " + i17 + ':');
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c((java.lang.Throwable) obj);
            if (c17 != null) {
                java.util.Iterator it = r26.n0.f0(c17, new java.lang.String[]{"\n"}, false, 0, 6, null).iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneQueueTracker", "\t\t- " + ((java.lang.String) it.next()));
                }
            }
            i17 = i18;
        }
    }
}
