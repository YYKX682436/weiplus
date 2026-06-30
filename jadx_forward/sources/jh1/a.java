package jh1;

/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f381325a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f381326b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f381327c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f381328d = new java.util.concurrent.ConcurrentHashMap();

    public static void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AppBrandAudioClientService", "onCreate");
        ((java.util.concurrent.ConcurrentHashMap) f381325a).clear();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b.f160662a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioApiTaskExecutor", "onCreate %s", str);
        ((java.util.concurrent.ConcurrentSkipListSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b.f160665d).add(str);
        ((java.util.concurrent.ConcurrentHashMap) f381328d).put(str, java.lang.Boolean.TRUE);
    }

    public static void b(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AppBrandAudioClientService", "onDestroy");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b.f160662a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.AudioApiTaskExecutor", "onDestroy:%s", str);
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = (java.util.concurrent.ConcurrentSkipListSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b.f160665d;
        if (concurrentSkipListSet.remove(str) && concurrentSkipListSet.isEmpty()) {
            synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b.f160664c) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b.f160663b != null) {
                    ((java.util.concurrent.ConcurrentHashMap) lm5.i.f401142a).remove("app_brand_audio_player".toUpperCase(java.util.Locale.ENGLISH));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b.f160663b.quit();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b.f160663b = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b.f160662a = null;
                }
            }
        }
        ((java.util.concurrent.ConcurrentHashMap) f381325a).clear();
        java.util.Iterator it = f381327c.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) ((java.util.HashMap) f381326b).remove((java.lang.String) it.next());
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
        }
        ((java.util.HashMap) f381326b).clear();
        f381327c.clear();
        ((java.util.concurrent.ConcurrentHashMap) f381328d).remove(str);
    }

    public static void c(java.lang.String str) {
        java.util.Map map = f381326b;
        if (!((java.util.HashMap) map).containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AppBrandAudioClientService", "appId:%s not exist the appId for listener", str);
            return;
        }
        f381327c.remove(str);
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) ((java.util.HashMap) map).remove(str);
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
    }
}
