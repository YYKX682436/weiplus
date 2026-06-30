package hq0;

/* loaded from: classes7.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iq0.e f364603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f364604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f364605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hq0.b0 b0Var, iq0.e eVar, double d17, double d18) {
        super(0);
        this.f364602d = b0Var;
        this.f364603e = eVar;
        this.f364604f = d17;
        this.f364605g = d18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d : hq0.b0.J1(this.f364602d, this.f364603e, wq0.b.f530027d)) {
            c10867x3e50a04d.getLocationInWindow(new int[2]);
            double c17 = i65.a.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) (r2[1] - this.f364604f));
            fq0.x frameSet = c10867x3e50a04d.getFrameSet();
            if (frameSet != null) {
                frameSet.g(this.f364605g, c17);
            }
        }
        return jz5.f0.f384359a;
    }
}
