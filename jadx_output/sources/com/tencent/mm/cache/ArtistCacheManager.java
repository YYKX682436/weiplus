package com.tencent.mm.cache;

/* loaded from: classes10.dex */
public class ArtistCacheManager extends android.content.BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.cache.ArtistCacheManager f63629c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f63630d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f63631e = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f63632a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f63633b;

    public static com.tencent.mm.cache.ArtistCacheManager a() {
        if (f63629c == null) {
            f63629c = new com.tencent.mm.cache.ArtistCacheManager();
        }
        return f63629c;
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistCacheManager", "[clearAllCache]");
        if (this.f63633b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ArtistCacheManager", "[clearAllCache %s] skip, mCacheAlive true", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        java.util.Iterator it = f63630d.entrySet().iterator();
        while (it.hasNext()) {
            ((um.c) ((java.util.Map.Entry) it.next()).getValue()).a();
        }
        f63631e.clear();
        f63629c = null;
        s75.d.b(new um.b(this), "MicroMsg.ArtistCacheManager[clearAllCache]");
        um.f.f428678c.f428679a.clear();
    }

    public um.m c(dl.a aVar) {
        java.util.HashMap hashMap = f63630d;
        if (hashMap.containsKey(this.f63632a)) {
            return ((um.c) hashMap.get(this.f63632a)).b(aVar);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", this.f63632a);
        return null;
    }

    public boolean d(dl.a aVar) {
        java.util.HashMap hashMap = f63630d;
        return hashMap.containsKey(this.f63632a) && ((um.c) hashMap.get(this.f63632a)).f428671a.containsKey(aVar);
    }

    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistCacheManager", "[%s] makeCacheDead: ", java.lang.Integer.valueOf(hashCode()));
        this.f63633b = false;
        if (f63629c != null) {
            b();
        }
    }

    public void f(java.lang.String str) {
        this.f63632a = str;
        java.util.HashMap hashMap = f63630d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistCacheManager", "registerCache: id:%s, contained:%b", str, java.lang.Boolean.valueOf(hashMap.containsKey(str)));
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, new um.c(this));
    }

    public void g(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistCacheManager", "unregisterCache: id:%s", str);
        this.f63632a = null;
        java.util.HashMap hashMap = f63630d;
        if (hashMap.containsKey(str)) {
            ((um.c) hashMap.get(str)).a();
            hashMap.remove(str);
        }
        s75.d.b(new um.a(this), "MicroMsg.ArtistCacheManager[clearAllCache]");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ArtistCacheManager", "[onReceive]");
        if (intent == null || !intent.getAction().equals("com.tencent.mm.plugin.photoedit.action.clear")) {
            return;
        }
        b();
    }
}
