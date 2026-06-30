package lu4;

/* loaded from: classes7.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lu4.m f402972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(lu4.m mVar, java.lang.String str) {
        super(3);
        this.f402972d = mVar;
        this.f402973e = str;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        lu4.c cVar = (lu4.c) this.f402972d.f402963b;
        java.lang.String str = this.f402973e;
        cl0.g gVar = new cl0.g();
        gVar.h("err_code", (java.lang.Integer) obj2);
        gVar.h("err_msg", "fail");
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        lu4.c.u(cVar, str, gVar2, null, 4, null);
        return jz5.f0.f384359a;
    }
}
