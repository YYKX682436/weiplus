package gg1;

/* loaded from: classes7.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f353119e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(gg1.c1 c1Var, int i17) {
        super(0);
        this.f353118d = c1Var;
        this.f353119e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String a17 = fg1.u.f343426l.a(this.f353119e);
        gg1.c1 c1Var = this.f353118d;
        c1Var.getClass();
        x91.h b17 = c1Var.f353072e.b();
        gg1.w0 w0Var = new gg1.w0(c1Var, a17);
        x91.l lVar = b17.f534182c;
        if (lVar != null) {
            b17.f534181b.g(new w91.j(b17.a(lVar), b17.f534182c.f534197a, a17), w0Var);
        }
        return jz5.f0.f384359a;
    }
}
