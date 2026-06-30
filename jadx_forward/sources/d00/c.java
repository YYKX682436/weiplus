package d00;

/* loaded from: classes7.dex */
public final class c implements d00.d {

    /* renamed from: a, reason: collision with root package name */
    public final l81.b1 f306786a;

    public c(l81.b1 appBundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBundle, "appBundle");
        this.f306786a = appBundle;
    }

    @Override // d00.d
    public java.lang.Object a(java.lang.Object obj) {
        jz5.f0 input = (jz5.f0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.o6.class);
        l81.b1 b1Var = this.f306786a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 Dh = o6Var.Dh(b1Var.f398547b, b1Var.f398549c);
        kz5.q0 q0Var = kz5.q0.f395534d;
        if (Dh == null) {
            return q0Var;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y8(Dh.f67183x55b471cc);
            y8Var.a();
            java.io.InputStream c17 = y8Var.c("/ecs_ext.json");
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                java.lang.String str = new java.lang.String(vz5.a.c(c17), r26.c.f450398a);
                vz5.b.a(c17, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GetFeatureListTask", "ecs_ext.json -> ".concat(str));
                return d00.b.f306785a.a(str);
            } finally {
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GetFeatureListTask", "no ecs_ext.json");
            return q0Var;
        }
    }
}
