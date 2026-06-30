package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes7.dex */
public final class v4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16414xa73e916a f229714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f229715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16414xa73e916a c16414xa73e916a, java.util.HashSet hashSet) {
        super(0);
        this.f229714d = c16414xa73e916a;
        this.f229715e = hashSet;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16414xa73e916a c16414xa73e916a = this.f229714d;
        str = c16414xa73e916a.f229344h;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "MagicPlayable");
        java.util.HashSet hashSet = this.f229715e;
        if (b17) {
            int d17 = kz5.b1.d(kz5.d0.q(hashSet, 10));
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 >= 16 ? d17 : 16);
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.lang.Object newInstance = java.lang.Class.forName((java.lang.String) it.next()).newInstance();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandJsApi");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0) newInstance;
                linkedHashMap.put(k0Var.k(), k0Var);
            }
            return kz5.c1.m(linkedHashMap, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16414xa73e916a.b0(c16414xa73e916a));
        }
        int d18 = kz5.b1.d(kz5.d0.q(hashSet, 10));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(d18 >= 16 ? d18 : 16);
        java.util.Iterator it6 = hashSet.iterator();
        while (it6.hasNext()) {
            java.lang.Object newInstance2 = java.lang.Class.forName((java.lang.String) it6.next()).newInstance();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandJsApi");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0) newInstance2;
            linkedHashMap2.put(k0Var2.k(), k0Var2);
        }
        return kz5.c1.m(linkedHashMap2, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16414xa73e916a.a0(c16414xa73e916a));
    }
}
