package vq4;

/* loaded from: classes14.dex */
public final class j0 implements nq4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vq4.m0 f520850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f520851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f520852c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f520853d;

    public j0(vq4.m0 m0Var, java.lang.String str, boolean z17, boolean z18) {
        this.f520850a = m0Var;
        this.f520851b = str;
        this.f520852c = z17;
        this.f520853d = z18;
    }

    @Override // nq4.a
    /* renamed from: onDone */
    public void mo143892xc3989e01() {
        vq4.m0 m0Var = this.f520850a;
        vq4.o0 o0Var = m0Var.f520882m;
        if (o0Var != null) {
            java.lang.Integer valueOf = o0Var != null ? java.lang.Integer.valueOf(o0Var.f520902a) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            if (vq4.n0.e(valueOf.intValue())) {
                m0Var.e(this.f520851b, this.f520852c, this.f520853d);
            }
        }
    }
}
