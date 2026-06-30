package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class a1 implements com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25503x5b4ab10b {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.a1 f150530a = new com.p314xaae8f345.mm.p874xaefb6cc9.a1();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f150531b;

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25503x5b4ab10b
    /* renamed from: convertToHostPath */
    public java.lang.String mo46906x1a94379b(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        if (path.length() == 0) {
            return "";
        }
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = f150531b;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("service");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1 = c0Var.mo50354x59eafec1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50354x59eafec1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = mo50354x59eafec1.mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(path)), null, false, b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49619x6aa75256, "createTempFileFrom(...)");
        if (mo49619x6aa75256 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
            java.lang.Object value = b0Var.f373357a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
            return (java.lang.String) value;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVA.WVAHostPathDelegate", "convertToHostPath failed, opRet=" + mo49619x6aa75256);
        return "";
    }
}
