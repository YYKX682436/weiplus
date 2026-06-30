package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class r4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f268010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f268011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268013g;

    public r4(java.util.HashMap hashMap, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, nw4.k kVar, nw4.y2 y2Var) {
        this.f268010d = hashMap;
        this.f268011e = c0Var;
        this.f268012f = kVar;
        this.f268013g = y2Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String value = ((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).f149939d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        java.util.HashMap hashMap = this.f268010d;
        hashMap.put("temporaryVisitInfoList", value);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getTeenModeTemporaryVisitInfo isValidVisit=" + this.f268011e.f391645d + ", temporaryVisitInfoList=" + hashMap.get("temporaryVisitInfoList"));
        nw4.g gVar = this.f268012f.f422396d;
        nw4.y2 y2Var = this.f268013g;
        gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
    }
}
