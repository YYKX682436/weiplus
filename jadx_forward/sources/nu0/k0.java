package nu0;

/* loaded from: classes5.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f421526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f421527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f421528g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(nu0.q0 q0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, int i17, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(1);
        this.f421525d = q0Var;
        this.f421526e = f0Var;
        this.f421527f = i17;
        this.f421528g = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        nu0.q0 q0Var = this.f421525d;
        ((java.util.ArrayList) q0Var.f421610t).add(path);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f421526e;
        int i17 = f0Var.f391649d + 1;
        f0Var.f391649d = i17;
        if (i17 == this.f421527f) {
            ((p3325xe03a0797.p3326xc267989b.r) this.f421528g).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
            nu0.q0.W6(q0Var);
        }
        return jz5.f0.f384359a;
    }
}
