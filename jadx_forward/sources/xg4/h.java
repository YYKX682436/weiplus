package xg4;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final xg4.h f535975d = new xg4.h();

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap;
        xg4.p pVar = xg4.m.f535980b;
        if (pVar != null && (hashMap = pVar.f364532n) != null) {
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = ((fq0.x) entry.getValue()).f347021l;
                if (c10867x3e50a04d != null) {
                    c10867x3e50a04d.removeAllViews();
                }
                java.lang.String str = ((fq0.x) entry.getValue()).f347011b;
            }
        }
        xg4.p pVar2 = xg4.m.f535980b;
        if (pVar2 != null) {
            pVar2.mo123041x5cd39ffa();
        }
        xg4.m.f535980b = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "forceCleanUp reset MagicLiveCardMgr");
    }
}
