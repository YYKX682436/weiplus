package nx0;

/* loaded from: classes5.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx0.r1 f422596d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.q1 f422597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f422598f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(nx0.r1 r1Var, nx0.q1 q1Var, int i17) {
        super(0);
        this.f422596d = r1Var;
        this.f422597e = q1Var;
        this.f422598f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nx0.r1 r1Var = this.f422596d;
        if (r1Var.f422747e) {
            r1Var.f422748f = true;
            nx0.q1 q1Var = this.f422597e;
            java.util.List list = q1Var.f422735d;
            int i17 = this.f422598f;
            ((nx0.r1) list.get(i17)).f422747e = false;
            q1Var.m8147xed6e4d18(i17);
        }
        return jz5.f0.f384359a;
    }
}
