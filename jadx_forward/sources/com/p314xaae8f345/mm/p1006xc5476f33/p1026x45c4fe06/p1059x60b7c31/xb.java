package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class xb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f35012x366c91de = 1289;

    /* renamed from: NAME */
    private static final java.lang.String f35013x24728b = "publishWeChatStateDirectly";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11953xb3fd7a47 c11953xb3fd7a47;
        android.content.Intent intent;
        k91.r m07;
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609;
        java.lang.String o17;
        k91.r m08;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u08;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u09;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiPublishWeChatStateDirectly", "invoke, env is null");
            return;
        }
        java.lang.String mo48798x74292566 = c0Var.mo48798x74292566();
        java.lang.String str3 = mo48798x74292566 == null ? "" : mo48798x74292566;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = c0Var.t3();
        java.lang.String str4 = (t37 == null || (u09 = t37.u0()) == null) ? null : u09.f128811x;
        java.lang.String str5 = str4 == null ? "" : str4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t38 = c0Var.t3();
        int i18 = t38 != null ? t38.f156338p.f158814g : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t39 = c0Var.t3();
        int i19 = (t39 == null || (u08 = t39.u0()) == null) ? 0 : u08.L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t310 = c0Var.t3();
        java.lang.String n07 = t310 != null ? t310.n0() : null;
        if (n07 == null) {
            n07 = "";
        }
        if (i18 == 0) {
            str = n07;
        } else {
            str = n07 + (char) 183 + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(i18);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareParams, rawAppName: ");
        sb6.append(n07);
        sb6.append(", appName: ");
        sb6.append(str);
        sb6.append(", content = ");
        sb6.append(jSONObject != null ? jSONObject.toString() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiPublishWeChatStateDirectly", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t311 = c0Var.t3();
        java.lang.String str6 = (t311 == null || (u07 = t311.u0()) == null) ? null : u07.f158813f;
        java.lang.String str7 = str6 == null ? "" : str6;
        if (jSONObject == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t312 = c0Var.t3();
            java.lang.String b17 = (t312 == null || (m08 = t312.m0()) == null) ? null : m08.b();
            if (b17 == null) {
                b17 = "";
            }
            java.lang.String str8 = str;
            java.lang.String str9 = b17;
            intent = null;
            c11953xb3fd7a47 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11953xb3fd7a47(null, null, null, str9, null, null, false, str3, str5, i18, i19, str8, str7, false, null, 24695, null);
        } else {
            java.lang.String str10 = str;
            java.lang.String a17 = nf.e.a(jSONObject, "state");
            java.lang.String a18 = nf.e.a(jSONObject, "imgUrl");
            if (r26.i0.A(a18, "wxfile://", false, 2, null)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = c0Var.mo50354x59eafec1();
                str2 = (mo50354x59eafec1 == null || (mo49620x1d537609 = mo50354x59eafec1.mo49620x1d537609(a18)) == null || (o17 = mo49620x1d537609.o()) == null) ? "" : o17;
            } else {
                str2 = a18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiPublishWeChatStateDirectly", "prepareParams, rawThumbUrl: " + a18 + ", thumbUrl: " + str2);
            java.lang.String a19 = nf.e.a(jSONObject, "desc");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t313 = c0Var.t3();
            java.lang.String b18 = (t313 == null || (m07 = t313.m0()) == null) ? null : m07.b();
            intent = null;
            c11953xb3fd7a47 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11953xb3fd7a47(a17, str2, a19, nf.e.b(jSONObject, "url", b18 != null ? b18 : ""), nf.e.a(jSONObject, "verifyInfo"), nf.e.a(jSONObject, "activityId"), true, str3, str5, i18, i19, str10, str7, false, null, 24576, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiPublishWeChatStateDirectly", "prepareParams, setTextStatusParams: " + c11953xb3fd7a47);
        android.content.Context f229340d = c0Var.getF229340d();
        if (f229340d == null) {
            f229340d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f229340d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.wb wbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.wb(c0Var, i17, this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11909x6e248f19 c11909x6e248f19 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11909x6e248f19(c11953xb3fd7a47);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vb vbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.vb(wbVar);
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(f229340d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c11909x6e248f19, vbVar, intent);
    }
}
