package lx;

/* loaded from: classes10.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final lx.x f403533a = new lx.x();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f403534b = new java.util.HashMap();

    public final java.util.Map a(java.lang.String feedID, java.lang.String streamUrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedID, "feedID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamUrl, "streamUrl");
        java.util.Map map = f403534b;
        if (!((java.util.HashMap) map).containsKey(feedID)) {
            ((java.util.HashMap) map).put(feedID, new java.util.HashMap());
        }
        java.util.Map map2 = (java.util.Map) ((java.util.HashMap) map).get(feedID);
        if (map2 != null) {
            ((vd2.b3) ((ss5.h0) i95.n0.c(ss5.h0.class))).getClass();
            java.lang.String d17 = ko0.t.f391436a.d(streamUrl);
            if (d17 != null) {
                map2.put("streamid", d17);
            }
        }
        java.util.Map map3 = (java.util.Map) ((java.util.HashMap) map).get(feedID);
        return map3 == null ? kz5.q0.f395534d : map3;
    }
}
