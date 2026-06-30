package lf4;

/* loaded from: classes4.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f399983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf4.j f399984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f399985f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f399986g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ if4.f f399987h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(boolean z17, nf4.j jVar, lf4.q0 q0Var, int i17, if4.f fVar) {
        super(0);
        this.f399983d = z17;
        this.f399984e = jVar;
        this.f399985f = q0Var;
        this.f399986g = i17;
        this.f399987h = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f399983d && !this.f399984e.z0()) {
            lf4.q0 q0Var = this.f399985f;
            java.util.ArrayList arrayList = q0Var.f399998i;
            int i17 = this.f399986g;
            arrayList.set(i17, this.f399987h);
            java.util.ArrayList arrayList2 = q0Var.f399998i;
            lf4.h hVar = q0Var.f399995f;
            ((sf4.a1) hVar).h(0, arrayList2);
            ((sf4.a1) hVar).e(0, i17, 1);
            ((sf4.a1) hVar).d();
            q0Var.n();
        }
        return jz5.f0.f384359a;
    }
}
