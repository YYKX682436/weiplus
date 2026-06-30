package ue3;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ue3.c f508425a = new ue3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f508426b = new java.util.HashMap();

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushStorageFactory", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
    }

    public final synchronized jc3.t a(java.lang.String bizName, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6 d6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4.class));
        if (d6Var.f229444d == 0) {
            d6Var.f229444d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? gm0.j1.b().h() : gm0.m.i();
        }
        int i17 = d6Var.f229444d;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicBrushStorageFactory", "getOrCreateBizStorage uin invalid bizName:%s", bizName);
            return null;
        }
        jc3.u0 u0Var = jc3.u0.f380529a;
        if (!jc3.u0.f380532d.contains(bizName) || str == null) {
            return b(bizName, i17);
        }
        synchronized (this) {
            java.util.List list = (java.util.List) f508426b.get(bizName);
            if (list == null || !list.contains(str)) {
                return null;
            }
            return b(str, i17);
        }
    }

    public final jc3.t b(java.lang.String bizName, int i17) {
        java.util.Map map = ue3.f.f508431c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        java.lang.String str = i17 + '-' + bizName;
        java.util.Map map2 = ue3.f.f508431c;
        synchronized (map2) {
            if (!((java.util.LinkedHashMap) map2).keySet().contains(str)) {
                map2.put(str, new ue3.f(i17, bizName, "MagicBrushMMKVStorage#" + bizName + '#'));
            }
        }
        java.lang.Object obj = ((java.util.LinkedHashMap) map2).get(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        return (ue3.f) obj;
    }
}
