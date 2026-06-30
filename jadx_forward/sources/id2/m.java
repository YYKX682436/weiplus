package id2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final id2.m f372195a = new id2.m();

    public final java.lang.String a(int i17, int i18, int i19) {
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        return i17 + '-' + i18 + '-' + i19 + '-' + r26.i0.t(uuid, "-", "", false);
    }

    public final void b(java.lang.String eid, java.lang.String pagId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagId, "pagId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318 c6463x6ead4318 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6463x6ead4318();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6463x6ead4318.f138055d = java.lang.System.currentTimeMillis();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c6463x6ead4318.u(xy2.c.e(context));
        c6463x6ead4318.p("");
        c6463x6ead4318.B("");
        c6463x6ead4318.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6463x6ead4318.w(Ri);
        c6463x6ead4318.r(f372195a.a(3, 28, 65));
        ml2.q1 q1Var = ml2.q1.f409345e;
        c6463x6ead4318.q("temp_6");
        c6463x6ead4318.A("");
        c6463x6ead4318.x("");
        c6463x6ead4318.v("");
        c6463x6ead4318.s(eid);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("page_id", pagId);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6463x6ead4318.t(r26.i0.t(jSONObject2, ",", ";", false));
        c6463x6ead4318.z("");
        c6463x6ead4318.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderChatRoomLiveReporter", "report23059 eid:" + eid + ", pagId:" + pagId);
    }

    public final void c(java.lang.String pagId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagId, "pagId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4 c6465xc36db3c4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6465xc36db3c4();
        ml2.q1 q1Var = ml2.q1.f409345e;
        c6465xc36db3c4.p("temp_6");
        c6465xc36db3c4.q(a(3, 28, 65));
        c6465xc36db3c4.r(pagId);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("is_finder_role", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() ? 1 : 0);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6465xc36db3c4.s(r26.i0.t(jSONObject2, ",", ";", false));
        c6465xc36db3c4.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderChatRoomLiveReporter", "report22946 pagId:".concat(pagId));
    }

    public final void d(java.lang.String pagId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagId, "pagId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399 c6466x94846399 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6466x94846399();
        ml2.q1 q1Var = ml2.q1.f409345e;
        c6466x94846399.p("temp_6");
        c6466x94846399.q(a(3, 28, 65));
        c6466x94846399.r(pagId);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("is_finder_role", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() ? 1 : 0);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6466x94846399.s(r26.i0.t(jSONObject2, ",", ";", false));
        c6466x94846399.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderChatRoomLiveReporter", "report22947 pagId:".concat(pagId));
    }

    public final void e(java.lang.String eid, java.lang.String pagId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagId, "pagId");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e c6464xd152d07e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6464xd152d07e();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c6464xd152d07e.f138070d = java.lang.System.currentTimeMillis();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c6464xd152d07e.u(xy2.c.e(context));
        c6464xd152d07e.p("");
        c6464xd152d07e.A("");
        c6464xd152d07e.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        c6464xd152d07e.w(Ri);
        c6464xd152d07e.r(f372195a.a(3, 28, 65));
        ml2.q1 q1Var = ml2.q1.f409345e;
        c6464xd152d07e.q("temp_6");
        c6464xd152d07e.f138078l = c6464xd152d07e.b("TabContextID", "", true);
        c6464xd152d07e.x("");
        c6464xd152d07e.v("");
        c6464xd152d07e.s(eid);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("page_id", pagId);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        c6464xd152d07e.t(r26.i0.t(jSONObject2, ",", ";", false));
        c6464xd152d07e.z("");
        c6464xd152d07e.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderChatRoomLiveReporter", "report23057 eid:" + eid + ", pagId:" + pagId);
    }
}
