package ud3;

/* loaded from: classes7.dex */
public final class k extends lc3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final ud3.d f508205d = new ud3.d();

    @Override // lc3.c0
    public java.lang.String f() {
        return "getLocalDataSizeSync";
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.HashMap a17 = this.f508205d.a(data, e().f425864a);
        java.lang.Object obj = a17.get("error");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.magicbrush.base.MBErrorInfo");
        lc3.z zVar = (lc3.z) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar, lc3.x.f399467a)) {
            return h(zVar.f399477a, zVar.f399478b);
        }
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("size", a17.get("size"));
        a0Var.put("quota", a17.get("quota"));
        m(a0Var);
        return a0Var;
    }
}
