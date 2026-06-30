package mn2;

/* loaded from: classes10.dex */
public final class a4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.c4 f411443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.o f411444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f411445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(mn2.c4 c4Var, dn.o oVar, dn.h hVar) {
        super(0);
        this.f411443d = c4Var;
        this.f411444e = oVar;
        this.f411445f = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mn2.c4 c4Var = this.f411443d;
        cw2.eb ebVar = c4Var.f411462e;
        if (ebVar != null) {
            ebVar.z(c4Var.f411461d, this.f411444e, this.f411445f);
        }
        return jz5.f0.f384359a;
    }
}
