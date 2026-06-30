package yw;

/* loaded from: classes7.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yw.s0 f547986d = new yw.s0();

    public s0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            linkedHashMap.put("isDebug", "1");
        }
        linkedHashMap.put("MagicSclPublicService", ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj("MagicSclPublicService"));
        java.lang.String Ui = ((cx.j1) ((bx.v) i95.n0.c(bx.v.class))).Ui();
        java.lang.String Ui2 = ((cx.j1) ((bx.r) i95.n0.c(bx.r.class))).Ui();
        try {
            java.lang.String mo15082x48bce8a4 = new cl0.g(Ui).mo15082x48bce8a4("version");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a4, "optString(...)");
            linkedHashMap.put("MagicBrandService", mo15082x48bce8a4);
            java.lang.String mo15082x48bce8a42 = new cl0.g(Ui2).mo15082x48bce8a4("version");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo15082x48bce8a42, "optString(...)");
            linkedHashMap.put("MagicAdBrandService", mo15082x48bce8a42);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizFlutterDynamicCardHelper", e17, "", new java.lang.Object[0]);
        }
        linkedHashMap.put("supportCoverForAdBrandService", java.lang.Boolean.valueOf(((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi("MagicAdBrandService")));
        linkedHashMap.put("supportCoverForBrandService", java.lang.Boolean.valueOf(((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi("MagicBrandService")));
        return linkedHashMap;
    }
}
