package te2;

/* loaded from: classes3.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f499873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f499874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f499875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.gm1 f499876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f499877h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i17, int i18, te2.p1 p1Var, r45.gm1 gm1Var, yz5.l lVar) {
        super(0);
        this.f499873d = i17;
        this.f499874e = i18;
        this.f499875f = p1Var;
        this.f499876g = gm1Var;
        this.f499877h = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f499873d == 0 && this.f499874e == 0) {
            dk2.p Z6 = ((mm2.c1) this.f499875f.f499820e.a(mm2.c1.class)).Z6();
            r45.gm1 gm1Var = this.f499876g;
            Z6.m(gm1Var);
            java.util.LinkedList m75941xfb821914 = gm1Var.m75941xfb821914(1);
            this.f499877h.mo146xb9724478(java.lang.Integer.valueOf(m75941xfb821914 != null ? m75941xfb821914.size() : 0));
        }
        return jz5.f0.f384359a;
    }
}
