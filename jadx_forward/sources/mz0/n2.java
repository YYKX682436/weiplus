package mz0;

/* loaded from: classes5.dex */
public final class n2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f414543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(mz0.x2 x2Var) {
        super(0);
        this.f414543d = x2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mz0.x2 x2Var = this.f414543d;
        r45.ib6 ib6Var = (r45.ib6) x2Var.M.mo141623x754a37bb();
        if (ib6Var == null) {
            return null;
        }
        mz0.x2.J7(x2Var, ib6Var.f458444f, "", java.lang.Boolean.valueOf(ib6Var.f458449n));
        java.lang.String templateId = ib6Var.f458443e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(templateId, "templateId");
        java.lang.String musicId = ib6Var.f458444f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(musicId, "musicId");
        return new mz0.a(templateId, musicId, java.lang.Boolean.valueOf(ib6Var.f458449n));
    }
}
