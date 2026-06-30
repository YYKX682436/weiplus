package c03;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final c03.k f37665a = new c03.k();

    /* renamed from: b, reason: collision with root package name */
    public static long f37666b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f37667c = "";

    public static final void b(android.content.Context context, java.lang.String contextId, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, long j17, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        java.lang.String u17 = pm0.v.u(finderItem.getFeedObject().getId());
        if (f37665a.a(u17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoJumpRouter", "jump to PlayerDetailUI, feedIdStr=".concat(u17));
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            android.os.Bundle bundle = new android.os.Bundle();
            if (str == null || str.length() == 0) {
                int i17 = qg3.g1.f362820d;
                str = urgen.ur_54A4.UR_6075.UR_BC6E();
            }
            bw5.id0 id0Var = new bw5.id0();
            id0Var.f28542g = z17;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            android.util.ArrayMap arrayMap = id0Var.f28558z;
            arrayMap.put(4, bool);
            bw5.zc0 zc0Var = new bw5.zc0();
            zc0Var.d(new bw5.yr().parseFrom(finderItem.getFeedObject().toByteArray()));
            id0Var.e(zc0Var);
            id0Var.f(str);
            id0Var.g((int) j17);
            id0Var.f28541f = 7L;
            arrayMap.put(3, bool);
            id0Var.d(281);
            byte[] byteArray = id0Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            linkedHashMap.put("open_params", byteArray);
            ((a03.h0) ((n40.o) i95.n0.c(n40.o.class))).ij(context, linkedHashMap, z17, bundle, finderItem.getFeedObject(), contextId);
        }
    }

    public final boolean a(java.lang.String feedIdStr) {
        kotlin.jvm.internal.o.g(feedIdStr, "feedIdStr");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f37666b > 2000 || !kotlin.jvm.internal.o.b(f37667c, feedIdStr)) {
            f37666b = currentTimeMillis;
            f37667c = feedIdStr;
            return true;
        }
        f37666b = currentTimeMillis;
        com.tencent.mars.xlog.Log.w("MicroMsg.MegaVideoJumpRouter", "jump to PlayerDetailUI in 2000 mills, return feedIdStr=".concat(feedIdStr));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.E(31240, 206, 0, 0, 0, 0, 0, feedIdStr);
        return false;
    }
}
