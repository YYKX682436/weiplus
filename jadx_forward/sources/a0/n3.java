package a0;

/* loaded from: classes14.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.o3 f81774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f81776f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(a0.o3 o3Var, int i17, s1.o1 o1Var) {
        super(1);
        this.f81774d = o3Var;
        this.f81775e = i17;
        this.f81776f = o1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        a0.o3 o3Var = this.f81774d;
        a0.m3 m3Var = o3Var.f81791d;
        n0.v2 v2Var = m3Var.f81762c;
        int i17 = this.f81775e;
        ((n0.q4) v2Var).mo148714x53d8522f(java.lang.Integer.valueOf(i17));
        if (m3Var.d() > i17) {
            ((n0.q4) m3Var.f81760a).mo148714x53d8522f(java.lang.Integer.valueOf(i17));
        }
        int f17 = e06.p.f(o3Var.f81791d.d(), 0, i17);
        int i18 = o3Var.f81792e ? f17 - i17 : -f17;
        boolean z17 = o3Var.f81793f;
        s1.n1.f(layout, this.f81776f, z17 ? 0 : i18, z17 ? i18 : 0, 0.0f, null, 12, null);
        return jz5.f0.f384359a;
    }
}
