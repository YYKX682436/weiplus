package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class a8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f33685x366c91de = 651;

    /* renamed from: NAME */
    public static final java.lang.String f33686x24728b = "markScene";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String mo48798x74292566;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null || !c0Var.mo50262x39e05d35()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiMarkScene", "Service dead, miss");
            java.lang.String o17 = o("fail:service dead");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "makeReturnJson(...)");
            return o17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(c0Var.mo48798x74292566(), true);
        if (b18 == null) {
            java.lang.String o18 = o("fail:session dead");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "makeReturnJson(...)");
            return o18;
        }
        int optInt = jSONObject != null ? jSONObject.optInt("sceneId", -1) : -1;
        if (optInt < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiMarkScene", "parameter fail " + optInt);
            java.lang.String o19 = o("fail:illegal argument");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o19, "makeReturnJson(...)");
            return o19;
        }
        b18.B.set(optInt);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.C11845x2243166f.f159117d && optInt == 0 && (b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b((mo48798x74292566 = c0Var.mo48798x74292566()), true)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1173xa7c31030.m.f(mo48798x74292566, "FirstRenderToGameInteractive", b17.f169682u, java.lang.System.currentTimeMillis(), null);
        }
        java.lang.String o27 = o("ok");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o27, "makeReturnJson(...)");
        return o27;
    }
}
