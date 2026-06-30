package mg4;

/* loaded from: classes7.dex */
public final class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f72888x366c91de = 79;

    /* renamed from: NAME */
    public static final java.lang.String f72889x24728b = "operateWXData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        r45.m24 m24Var = new r45.m24();
        m24Var.f461622d = component.mo48798x74292566();
        java.lang.String optString = data.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        byte[] bytes = optString.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        m24Var.f461623e = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bytes, 0, bytes.length);
        m24Var.f461626h = 0;
        m24Var.f461625g = 0;
        m24Var.f461624f = "";
        m24Var.f461628m = 0;
        r45.nd7 nd7Var = new r45.nd7();
        nd7Var.f462829e = wc1.a.f77339x366c91de;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33) component.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33.class);
        if (interfaceC11702x4ae7c33 != null) {
            r45.pe7 pe7Var = new r45.pe7();
            pe7Var.f464523d = interfaceC11702x4ae7c33.i();
            pe7Var.f464524e = interfaceC11702x4ae7c33.W0();
            nd7Var.f462832h = pe7Var;
        }
        m24Var.f461627i = nd7Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = m24Var;
        lVar.f152198b = new r45.n24();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/js-operatewxdata";
        lVar.f152200d = 1133;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        pm0.v.K(null, new mg4.b(lVar.a()));
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String format = objArr.length > 0 ? java.lang.String.format("ok", objArr) : "ok";
        hashMap.putAll(new java.util.HashMap());
        java.lang.String p17 = p(format, hashMap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "makeReturnJson(...)");
        return p17;
    }
}
