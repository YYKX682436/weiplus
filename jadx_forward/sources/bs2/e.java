package bs2;

/* loaded from: classes2.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f105360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str) {
        super(1);
        this.f105360d = c0Var;
        this.f105361e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cw2.da view = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f105360d;
        c0Var.f391645d = c0Var.f391645d || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view.mo56696x9040359a(), this.f105361e);
        return java.lang.Boolean.FALSE;
    }
}
