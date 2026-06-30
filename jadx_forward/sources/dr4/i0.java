package dr4;

/* loaded from: classes14.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.n0 f324178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f324179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f324180f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f324181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(dr4.n0 n0Var, int i17, int i18, java.nio.ByteBuffer byteBuffer) {
        super(0);
        this.f324178d = n0Var;
        this.f324179e = i17;
        this.f324180f = i18;
        this.f324181g = byteBuffer;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dr4.n0 n0Var = this.f324178d;
        dr4.r1 r1Var = n0Var.f324219l;
        if (r1Var != null) {
            r1Var.E(0);
        }
        is0.c cVar = n0Var.f324220m;
        if (cVar != null) {
            dr4.r1 r1Var2 = n0Var.f324219l;
            int i17 = this.f324180f;
            int i18 = this.f324179e;
            if (r1Var2 != null) {
                r1Var2.w(i18, i17);
            }
            dr4.r1 r1Var3 = n0Var.f324219l;
            if (r1Var3 != null) {
                r1Var3.s(90);
            }
            dr4.r1 r1Var4 = n0Var.f324219l;
            if (r1Var4 != null) {
                r1Var4.j(false);
            }
            gq4.v.wi().f447515p = new android.util.Size(i18, i17);
            dr4.r1 r1Var5 = n0Var.f324219l;
            if (r1Var5 != null) {
                r1Var5.y(this.f324181g, i18, i17);
            }
            n0Var.i(cVar);
        }
        return jz5.f0.f384359a;
    }
}
