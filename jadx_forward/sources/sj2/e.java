package sj2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj2.f f489916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f489917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sj2.f fVar, boolean z17) {
        super(0);
        this.f489916d = fVar;
        this.f489917e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f489917e;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        sj2.f fVar = this.f489916d;
        fVar.P = valueOf;
        fg2.o0 o0Var = fVar.N;
        if (z17) {
            o0Var.f343722l.setVisibility(0);
            if (!o0Var.f343722l.f()) {
                o0Var.f343722l.g();
            }
        } else {
            o0Var.f343722l.setVisibility(4);
            o0Var.f343722l.n();
        }
        return jz5.f0.f384359a;
    }
}
