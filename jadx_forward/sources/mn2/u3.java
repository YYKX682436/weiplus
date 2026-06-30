package mn2;

/* loaded from: classes4.dex */
public final class u3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.x3 f411661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f411663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f411664g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(mn2.x3 x3Var, java.lang.String str, int i17, dn.h hVar) {
        super(0);
        this.f411661d = x3Var;
        this.f411662e = str;
        this.f411663f = i17;
        this.f411664g = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mn2.x3 x3Var = this.f411661d;
        t21.h0 h0Var = x3Var.f411693e;
        int i17 = this.f411663f;
        if (h0Var != null) {
            h0Var.o(this.f411662e, i17);
        }
        cw2.eb ebVar = x3Var.f411692d;
        if (ebVar != null) {
            ebVar.q(i17, x3Var.f411694f, this.f411664g);
        }
        return jz5.f0.f384359a;
    }
}
