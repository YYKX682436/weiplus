package z50;

/* loaded from: classes8.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(vu4.a actionId, vu4.b actionType, int i17, int i18, org.json.JSONObject extInfo, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        vu4.c cVar = new vu4.c(actionId, actionType, java.lang.String.valueOf(o13.p.f423783c), java.lang.String.valueOf(o13.p.f423784d), java.lang.String.valueOf(o13.p.f423784d), 0, query, null, null, null, false, 1920, null);
        cVar.f521822l = i17;
        cVar.f521823m = i18;
        java.lang.String jSONObject = extInfo.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        cVar.f521824n = jSONObject;
        vu4.k a17 = cVar.a();
        rk0.c.c("MicroMsg.FTS.FTSReportHelper", "doReport26897: " + a17, new java.lang.Object[0]);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().k(a17);
    }

    public final void b(vu4.a actionId, vu4.b actionType, org.json.JSONObject extInfo, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        vu4.c cVar = new vu4.c(actionId, actionType, java.lang.String.valueOf(o13.p.f423783c), java.lang.String.valueOf(o13.p.f423784d), java.lang.String.valueOf(o13.p.f423784d), 0, query, null, null, null, false, 1920, null);
        java.lang.String jSONObject = extInfo.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        cVar.f521824n = jSONObject;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).aj().k(cVar.a());
    }
}
