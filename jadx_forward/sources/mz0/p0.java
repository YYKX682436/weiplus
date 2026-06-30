package mz0;

/* loaded from: classes5.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f414551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f414552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f414553f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, mz0.b2 b2Var) {
        super(2);
        this.f414551d = i17;
        this.f414552e = e0Var;
        this.f414553f = b2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        java.lang.String source = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        float max = java.lang.Math.max(0.0f, this.f414551d - floatValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f414552e;
        boolean z17 = true;
        if (!(max == e0Var.f391648d)) {
            e0Var.f391648d = max;
            gz0.i iVar = (gz0.i) this.f414553f.A.mo141623x754a37bb();
            iVar.f359205f = (int) max;
            if (iVar.f359207h <= 0 || (iVar.f359202c <= 0 && iVar.f359203d <= 0)) {
                z17 = false;
            }
            if (z17) {
                iVar.b();
            }
        }
        return jz5.f0.f384359a;
    }
}
