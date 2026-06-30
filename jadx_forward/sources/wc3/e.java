package wc3;

/* loaded from: classes7.dex */
public final class e extends lc3.f0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f526044e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f526045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String bizName, java.lang.String instanceName) {
        super(instanceName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        this.f526044e = bizName;
        this.f526045f = "MagicCommonBizPkgManagement";
    }

    @Override // jc3.x
    public java.lang.String a(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return "";
    }

    @Override // jc3.x
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 b() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y0();
    }

    @Override // jc3.x
    public java.lang.String d() {
        return this.f526044e;
    }

    @Override // jc3.x
    public void f(yz5.l cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f526045f, "provide main scripts");
        cb6.mo146xb9724478(kz5.b0.c(new lc3.j0("")));
    }

    @Override // jc3.x
    public java.lang.String g() {
        return this.f526044e;
    }
}
