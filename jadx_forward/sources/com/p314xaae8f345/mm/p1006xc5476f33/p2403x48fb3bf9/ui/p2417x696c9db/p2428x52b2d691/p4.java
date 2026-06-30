package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class p4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267960e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(nw4.k kVar, nw4.y2 y2Var) {
        super(1);
        this.f267959d = kVar;
        this.f267960e = y2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String draftData = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftData, "draftData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getDraftData success");
        if (draftData.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleMPPageAction", "getDraftData is empty");
        }
        nw4.g gVar = this.f267959d.f422396d;
        nw4.y2 y2Var = this.f267960e;
        java.lang.String str = y2Var.f422546c;
        java.lang.String str2 = y2Var.f422552i + ":ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("draftData", draftData);
        gVar.e(str, str2, hashMap);
        return jz5.f0.f384359a;
    }
}
