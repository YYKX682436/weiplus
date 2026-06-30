package com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7;

/* loaded from: classes7.dex */
public class o implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 f128775a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f128776b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie.d f128777c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f128778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f128779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.r f128780f;

    public o(com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.r rVar, com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p432xd1075a44.p433x5fb57ca.C3896xa9b9c399 c3896xa9b9c399, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, ie.d dVar, float f17, int i17) {
        this.f128780f = rVar;
        this.f128775a = c3896xa9b9c399;
        this.f128776b = e9Var;
        this.f128777c = dVar;
        this.f128778d = f17;
        this.f128779e = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.r3
    public void a(int i17) {
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.r rVar = this.f128780f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f128776b;
        if (2 != i17) {
            int height = this.f128777c.getHeight();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(height);
            float f17 = this.f128778d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WAGameJsApiShowKeyboard", "onVisibilityChanged state(%d),inputPanelHeight(%d),density(%f).", valueOf, valueOf2, java.lang.Float.valueOf(f17));
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("height", java.lang.Float.valueOf(height / f17));
            e9Var.a(this.f128779e, rVar.p("ok", hashMap));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1 p1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 page = e9Var.V0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
            p1Var.x(height, e9Var, page, null);
            return;
        }
        com.p314xaae8f345.p425x1ea3c036.p428x304bf2.p429x60b7c31.p430x1e0673e7.c cVar = rVar.f128785h;
        java.lang.String obj = this.f128775a.getEditableText().toString();
        cVar.getClass();
        if (e9Var.mo50262x39e05d35()) {
            java.util.HashMap hashMap2 = new java.util.HashMap(2);
            hashMap2.put("errMsg", "ok");
            hashMap2.put("value", obj);
            cVar.t(hashMap2);
            cVar.u(e9Var);
            cVar.m();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1 p1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 page2 = e9Var.V0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page2, "page");
        p1Var2.x(0, e9Var, page2, null);
    }
}
