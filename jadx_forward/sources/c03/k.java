package c03;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final c03.k f119198a = new c03.k();

    /* renamed from: b, reason: collision with root package name */
    public static long f119199b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f119200c = "";

    public static final void b(android.content.Context context, java.lang.String contextId, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem, long j17, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextId, "contextId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        java.lang.String u17 = pm0.v.u(finderItem.getFeedObject().m76784x5db1b11());
        if (f119198a.a(u17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MegaVideoJumpRouter", "jump to PlayerDetailUI, feedIdStr=".concat(u17));
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            android.os.Bundle bundle = new android.os.Bundle();
            if (str == null || str.length() == 0) {
                int i17 = qg3.g1.f444353d;
                str = p3380x6a61f93.p3383xf5152754.C30552x21b30f7a.m169879x21b8cb32();
            }
            bw5.id0 id0Var = new bw5.id0();
            id0Var.f110075g = z17;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            android.util.ArrayMap arrayMap = id0Var.f110091z;
            arrayMap.put(4, bool);
            bw5.zc0 zc0Var = new bw5.zc0();
            zc0Var.d(new bw5.yr().mo11468x92b714fd(finderItem.getFeedObject().mo14344x5f01b1f6()));
            id0Var.e(zc0Var);
            id0Var.f(str);
            id0Var.g((int) j17);
            id0Var.f110074f = 7L;
            arrayMap.put(3, bool);
            id0Var.d(281);
            byte[] mo14344x5f01b1f6 = id0Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            linkedHashMap.put("open_params", mo14344x5f01b1f6);
            ((a03.h0) ((n40.o) i95.n0.c(n40.o.class))).ij(context, linkedHashMap, z17, bundle, finderItem.getFeedObject(), contextId);
        }
    }

    public final boolean a(java.lang.String feedIdStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedIdStr, "feedIdStr");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f119199b > 2000 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f119200c, feedIdStr)) {
            f119199b = currentTimeMillis;
            f119200c = feedIdStr;
            return true;
        }
        f119199b = currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MegaVideoJumpRouter", "jump to PlayerDetailUI in 2000 mills, return feedIdStr=".concat(feedIdStr));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.E(31240, 206, 0, 0, 0, 0, 0, feedIdStr);
        return false;
    }
}
