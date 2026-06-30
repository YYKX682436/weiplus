package ey2;

/* loaded from: classes2.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f339121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ey2.b1 f339122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f339123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.oq2 f339124g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i17, ey2.b1 b1Var, int i18, r45.oq2 oq2Var) {
        super(0);
        this.f339121d = i17;
        this.f339122e = b1Var;
        this.f339123f = i18;
        this.f339124g = oq2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        db2.n3 n3Var = new db2.n3(this.f339121d, 23, null, null, null, false, false, false, 0, false, null, null, null, 8176, null);
        ey2.b1 b1Var = this.f339122e;
        int i17 = this.f339123f;
        int i18 = this.f339121d;
        n3Var.f309625t = new ey2.x0(b1Var, i17, i18);
        n3Var.f309624s = new ey2.y0(i18, b1Var, this.f339124g);
        return n3Var;
    }
}
