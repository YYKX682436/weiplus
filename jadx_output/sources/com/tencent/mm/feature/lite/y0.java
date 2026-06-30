package com.tencent.mm.feature.lite;

/* loaded from: classes8.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f67294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f67295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f67297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67298h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f67299i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.TextureRegistry f67300m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f67301n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.api.g f67302o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67303p;

    public y0(com.tencent.mm.feature.lite.i iVar, boolean z17, long j17, java.lang.String str, long j18, android.content.Context context, android.view.ViewGroup viewGroup, io.flutter.view.TextureRegistry textureRegistry, java.util.Map map, com.tencent.mm.plugin.lite.api.g gVar) {
        this.f67303p = iVar;
        this.f67294d = z17;
        this.f67295e = j17;
        this.f67296f = str;
        this.f67297g = j18;
        this.f67298h = context;
        this.f67299i = viewGroup;
        this.f67300m = textureRegistry;
        this.f67301n = map;
        this.f67302o = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f67303p.f67179q) {
            if (!this.f67294d) {
                java.util.Iterator it = this.f67303p.f67179q.keySet().iterator();
                while (it.hasNext()) {
                    java.util.HashMap hashMap = (java.util.HashMap) this.f67303p.f67179q.get((java.lang.Long) it.next());
                    java.util.Iterator it6 = hashMap.keySet().iterator();
                    while (it6.hasNext()) {
                        fa3.a aVar = (fa3.a) hashMap.get(java.lang.Long.valueOf(((java.lang.Long) it6.next()).longValue()));
                        if (aVar != null) {
                            aVar.a(false);
                        }
                    }
                }
            }
            if (!this.f67303p.f67179q.containsKey(java.lang.Long.valueOf(this.f67295e)) && !this.f67294d) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppCamera setCameraComponent appId:%s, appUUid:%d, pageId:%d", this.f67296f, java.lang.Long.valueOf(this.f67295e), java.lang.Long.valueOf(this.f67297g));
                fa3.a aVar2 = new fa3.a(this.f67296f, this.f67295e, this.f67297g, this.f67298h, this.f67299i, this.f67300m, this.f67301n, this.f67302o);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put(java.lang.Long.valueOf(this.f67297g), aVar2);
                this.f67303p.f67179q.put(java.lang.Long.valueOf(this.f67295e), hashMap2);
            } else if (this.f67303p.f67179q.containsKey(java.lang.Long.valueOf(this.f67295e))) {
                java.util.HashMap hashMap3 = (java.util.HashMap) this.f67303p.f67179q.get(java.lang.Long.valueOf(this.f67295e));
                if (!hashMap3.containsKey(java.lang.Long.valueOf(this.f67297g)) && !this.f67294d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppCamera setCameraComponent appId:%s, appUUid:%d, pageId:%d", this.f67296f, java.lang.Long.valueOf(this.f67295e), java.lang.Long.valueOf(this.f67297g));
                    hashMap3.put(java.lang.Long.valueOf(this.f67297g), new fa3.a(this.f67296f, this.f67295e, this.f67297g, this.f67298h, this.f67299i, this.f67300m, this.f67301n, this.f67302o));
                } else if (hashMap3.containsKey(java.lang.Long.valueOf(this.f67297g))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppCamera setCameraComponent resume appId:%s, appUUid:%d, pageId:%d", this.f67296f, java.lang.Long.valueOf(this.f67295e), java.lang.Long.valueOf(this.f67297g));
                    ((fa3.a) hashMap3.get(java.lang.Long.valueOf(this.f67297g))).b();
                }
            }
        }
    }
}
