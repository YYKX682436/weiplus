package nd1;

/* loaded from: classes7.dex */
public abstract class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Class f417831g;

    public f0(java.lang.Class cls) {
        this.f417831g = cls;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public final java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(lVar);
        if (a17 == null) {
            return o("fail:page don't exist");
        }
        if (data == null) {
            return o("fail:invalid data");
        }
        java.lang.Class cls = this.f417831g;
        java.lang.Object B1 = a17.B1(cls);
        if (B1 == null) {
            if (!a17.mo50262x39e05d35()) {
                return o("fail:interrupted");
            }
            if (a17.a0()) {
                throw new java.lang.IllegalAccessError(java.lang.String.format("%s Not Found", cls.getName()));
            }
            return o("fail:not supported");
        }
        nd1.i2 i2Var = (nd1.i2) this;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        ni1.e ext = (ni1.e) B1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ext, "ext");
        int optInt = data.optInt("orientation", 0);
        java.lang.String str = optInt != -90 ? optInt != 90 ? "portrait" : "landscape" : "landscapeLeft";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.PrivateJsApiSetDisplayOrientation", "set display orientation:%s", str);
        ext.f(str);
        java.lang.String o17 = i2Var.o("ok");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "makeReturnJson(...)");
        return o17;
    }
}
