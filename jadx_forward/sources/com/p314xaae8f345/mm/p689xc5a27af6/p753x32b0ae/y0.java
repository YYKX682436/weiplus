package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes8.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f148827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f148828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148829f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f148830g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f148831h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f148832i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f148833m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f148834n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g f148835o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148836p;

    public y0(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, boolean z17, long j17, java.lang.String str, long j18, android.content.Context context, android.view.ViewGroup viewGroup, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 interfaceC28980x1159d658, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        this.f148836p = iVar;
        this.f148827d = z17;
        this.f148828e = j17;
        this.f148829f = str;
        this.f148830g = j18;
        this.f148831h = context;
        this.f148832i = viewGroup;
        this.f148833m = interfaceC28980x1159d658;
        this.f148834n = map;
        this.f148835o = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f148836p.f148712q) {
            if (!this.f148827d) {
                java.util.Iterator it = this.f148836p.f148712q.keySet().iterator();
                while (it.hasNext()) {
                    java.util.HashMap hashMap = (java.util.HashMap) this.f148836p.f148712q.get((java.lang.Long) it.next());
                    java.util.Iterator it6 = hashMap.keySet().iterator();
                    while (it6.hasNext()) {
                        fa3.a aVar = (fa3.a) hashMap.get(java.lang.Long.valueOf(((java.lang.Long) it6.next()).longValue()));
                        if (aVar != null) {
                            aVar.a(false);
                        }
                    }
                }
            }
            if (!this.f148836p.f148712q.containsKey(java.lang.Long.valueOf(this.f148828e)) && !this.f148827d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppCamera setCameraComponent appId:%s, appUUid:%d, pageId:%d", this.f148829f, java.lang.Long.valueOf(this.f148828e), java.lang.Long.valueOf(this.f148830g));
                fa3.a aVar2 = new fa3.a(this.f148829f, this.f148828e, this.f148830g, this.f148831h, this.f148832i, this.f148833m, this.f148834n, this.f148835o);
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put(java.lang.Long.valueOf(this.f148830g), aVar2);
                this.f148836p.f148712q.put(java.lang.Long.valueOf(this.f148828e), hashMap2);
            } else if (this.f148836p.f148712q.containsKey(java.lang.Long.valueOf(this.f148828e))) {
                java.util.HashMap hashMap3 = (java.util.HashMap) this.f148836p.f148712q.get(java.lang.Long.valueOf(this.f148828e));
                if (!hashMap3.containsKey(java.lang.Long.valueOf(this.f148830g)) && !this.f148827d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppCamera setCameraComponent appId:%s, appUUid:%d, pageId:%d", this.f148829f, java.lang.Long.valueOf(this.f148828e), java.lang.Long.valueOf(this.f148830g));
                    hashMap3.put(java.lang.Long.valueOf(this.f148830g), new fa3.a(this.f148829f, this.f148828e, this.f148830g, this.f148831h, this.f148832i, this.f148833m, this.f148834n, this.f148835o));
                } else if (hashMap3.containsKey(java.lang.Long.valueOf(this.f148830g))) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "LiteAppCamera setCameraComponent resume appId:%s, appUUid:%d, pageId:%d", this.f148829f, java.lang.Long.valueOf(this.f148828e), java.lang.Long.valueOf(this.f148830g));
                    ((fa3.a) hashMap3.get(java.lang.Long.valueOf(this.f148830g))).b();
                }
            }
        }
    }
}
