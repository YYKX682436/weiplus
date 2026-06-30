package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes7.dex */
public final class g1 implements k91.f5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f75845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f75846b;

    public g1(java.util.List list, yz5.a aVar) {
        this.f75845a = list;
        this.f75846b = aVar;
    }

    @Override // k91.e5
    public void a() {
        com.tencent.mm.plugin.appbrand.appcache.predownload.k1 k1Var = com.tencent.mm.plugin.appbrand.appcache.predownload.k1.f75859a;
        java.util.Iterator it = this.f75845a.iterator();
        while (it.hasNext()) {
            java.util.Set g17 = com.tencent.mm.plugin.appbrand.appcache.predownload.k1.f75861c.g((java.lang.String) it.next());
            if (g17 == null) {
                g17 = kz5.r0.f314002d;
            }
            java.util.Iterator it6 = g17.iterator();
            while (it6.hasNext()) {
                ((yz5.a) it6.next()).invoke();
            }
        }
        this.f75846b.invoke();
    }
}
