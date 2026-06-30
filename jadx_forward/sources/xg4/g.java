package xg4;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xg4.g f535974d = new xg4.g();

    public g() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.HashMap hashMap;
        xg4.p pVar = xg4.m.f535980b;
        java.lang.Integer valueOf = (pVar == null || (hashMap = pVar.f364532n) == null) ? null : java.lang.Integer.valueOf(hashMap.size());
        xg4.p pVar2 = xg4.m.f535980b;
        java.lang.Integer valueOf2 = (pVar2 == null || (concurrentHashMap = pVar2.f364534p) == null) ? null : java.lang.Integer.valueOf(concurrentHashMap.size());
        if (valueOf != null && valueOf.intValue() == 0 && valueOf2 != null && valueOf2.intValue() == 0) {
            xg4.m mVar = xg4.m.f535979a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanUpService");
            xg4.p pVar3 = xg4.m.f535980b;
            if (pVar3 != null) {
                pVar3.mo123041x5cd39ffa();
            }
            xg4.m.f535980b = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup reset MagicLiveCardMgr");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanup frameSet or root not empty frameSetSize:" + valueOf + " rootSize:" + valueOf2);
        }
        return jz5.f0.f384359a;
    }
}
