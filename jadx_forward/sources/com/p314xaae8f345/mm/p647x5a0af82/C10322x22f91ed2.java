package com.p314xaae8f345.mm.p647x5a0af82;

/* renamed from: com.tencent.mm.cache.ArtistCacheManager */
/* loaded from: classes10.dex */
public class C10322x22f91ed2 extends android.content.BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2 f145162c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f145163d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f145164e = new java.util.HashSet();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f145165a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f145166b;

    public static com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2 a() {
        if (f145162c == null) {
            f145162c = new com.p314xaae8f345.mm.p647x5a0af82.C10322x22f91ed2();
        }
        return f145162c;
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistCacheManager", "[clearAllCache]");
        if (this.f145166b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistCacheManager", "[clearAllCache %s] skip, mCacheAlive true", java.lang.Integer.valueOf(hashCode()));
            return;
        }
        java.util.Iterator it = f145163d.entrySet().iterator();
        while (it.hasNext()) {
            ((um.c) ((java.util.Map.Entry) it.next()).getValue()).a();
        }
        f145164e.clear();
        f145162c = null;
        s75.d.b(new um.b(this), "MicroMsg.ArtistCacheManager[clearAllCache]");
        um.f.f510211c.f510212a.clear();
    }

    public um.m c(dl.a aVar) {
        java.util.HashMap hashMap = f145163d;
        if (hashMap.containsKey(this.f145165a)) {
            return ((um.c) hashMap.get(this.f145165a)).b(aVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ArtistCacheManager", "[getArtistCache] id is not contains! %s", this.f145165a);
        return null;
    }

    public boolean d(dl.a aVar) {
        java.util.HashMap hashMap = f145163d;
        return hashMap.containsKey(this.f145165a) && ((um.c) hashMap.get(this.f145165a)).f510204a.containsKey(aVar);
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistCacheManager", "[%s] makeCacheDead: ", java.lang.Integer.valueOf(hashCode()));
        this.f145166b = false;
        if (f145162c != null) {
            b();
        }
    }

    public void f(java.lang.String str) {
        this.f145165a = str;
        java.util.HashMap hashMap = f145163d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistCacheManager", "registerCache: id:%s, contained:%b", str, java.lang.Boolean.valueOf(hashMap.containsKey(str)));
        if (hashMap.containsKey(str)) {
            return;
        }
        hashMap.put(str, new um.c(this));
    }

    public void g(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistCacheManager", "unregisterCache: id:%s", str);
        this.f145165a = null;
        java.util.HashMap hashMap = f145163d;
        if (hashMap.containsKey(str)) {
            ((um.c) hashMap.get(str)).a();
            hashMap.remove(str);
        }
        s75.d.b(new um.a(this), "MicroMsg.ArtistCacheManager[clearAllCache]");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ArtistCacheManager", "[onReceive]");
        if (intent == null || !intent.getAction().equals("com.tencent.mm.plugin.photoedit.action.clear")) {
            return;
        }
        b();
    }
}
