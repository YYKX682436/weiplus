package b20;

/* loaded from: classes9.dex */
public final class f extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        bw5.v7 g17 = jumpInfo.g();
        java.lang.String c17 = g17 != null ? g17.c() : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            callback.c("handle params is nil");
            return;
        }
        try {
            java.util.Map e17 = b00.p0.f16747a.e(new org.json.JSONObject(c17));
            if (context.f357553c != null) {
                java.lang.String wi6 = ((j00.o) ((c00.d3) i95.n0.c(c00.d3.class))).wi(context.f357553c);
                com.tencent.mars.xlog.Log.i("ECS_O.NativeHandler.GiftDetail", "set open event callback, eventId:" + wi6);
                e17.put("ecsOpenEventId", wi6);
            }
            i95.m c18 = i95.n0.c(c00.e3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            c00.e3.n9((c00.e3) c18, context.c(), e17, null, 4, null);
            callback.d(null);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.GiftDetail", "handle error:" + e18);
            callback.c("handle error");
        }
    }
}
