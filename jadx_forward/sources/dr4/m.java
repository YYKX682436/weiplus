package dr4;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.o f324197d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ is0.c f324198e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(dr4.o oVar, is0.c cVar) {
        super(0);
        this.f324197d = oVar;
        this.f324198e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dr4.o oVar = this.f324197d;
        dr4.r1 r1Var = oVar.f324219l;
        is0.c texture = this.f324198e;
        if (r1Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(texture, "texture");
            r1Var.D = texture;
            r1Var.C = texture.f375928e;
            dr4.r1 r1Var2 = oVar.f324219l;
            if (r1Var2 != null) {
                r1Var2.w(oVar.f324222o, oVar.f324221n);
            }
        } else {
            oVar.f324220m = texture;
        }
        return jz5.f0.f384359a;
    }
}
