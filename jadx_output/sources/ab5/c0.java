package ab5;

/* loaded from: classes9.dex */
public abstract class c0 {
    public static java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str);
        if (Bi != null && Bi.u0() != null) {
            return Bi.field_appId;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        return null;
    }

    public static java.lang.String b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str);
        if (Bi != null && Bi.u0() != null) {
            return Bi.u0().f305638m;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        return null;
    }

    public static java.lang.String c(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str);
        if (Bi != null) {
            return Bi.field_nickname;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandServiceHelper", "attr is null or getAppInfo return null");
        return null;
    }

    public static void d(android.content.Context context, java.lang.String str, boolean z17) {
        com.tencent.mm.autogen.events.UpdateWxaOptionsEvent updateWxaOptionsEvent = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent();
        am.g00 g00Var = updateWxaOptionsEvent.f54927g;
        g00Var.f6724a = str;
        g00Var.f6725b = z17 ? 2 : 1;
        g00Var.f6726c = 2;
        updateWxaOptionsEvent.e();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.vi6 vi6Var = new r45.vi6();
        vi6Var.f388296f = str;
        vi6Var.f388295e = z17 ? 1 : 0;
        vi6Var.f388294d = 3;
        linkedList.add(vi6Var);
        c01.d9.e().a(1176, new ab5.a0(context, str, z17));
        ((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).getClass();
        c01.d9.e().g(new k01.z0(linkedList));
    }
}
