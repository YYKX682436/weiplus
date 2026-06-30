package b20;

/* loaded from: classes9.dex */
public final class j extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ni()) {
            callback.c("current device has issue on transparent mode.");
            return;
        }
        com.tencent.mars.xlog.Log.i("ECS_O.NativeHandler.MpActivityGiftPack", "launch mp lottery with params: " + jumpInfo.g().b().f192156a.length);
        java.lang.String c17 = n51.d.c(jumpInfo.g().b().f192156a, 0);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("activity_info_base64", c17);
        if (context.f357553c != null) {
            java.lang.String wi6 = ((j00.o) ((c00.d3) i95.n0.c(c00.d3.class))).wi(context.f357553c);
            com.tencent.mars.xlog.Log.i("ECS_O.NativeHandler.MpActivityGiftPack", "set open event callback, eventId:" + wi6);
            jSONObject.put("ecsOpenEventId", wi6);
        }
        c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
        android.content.Context c18 = context.c();
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((j00.d2) m3Var).Ni(c18, jSONObject2);
        callback.d(null);
    }
}
