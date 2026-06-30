package we5;

/* loaded from: classes9.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f526847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f526848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ we5.n0 f526849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rd5.d f526850g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f526851h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, yb5.d dVar, we5.n0 n0Var, rd5.d dVar2, android.os.Bundle bundle) {
        super(1);
        this.f526847d = f9Var;
        this.f526848e = dVar;
        this.f526849f = n0Var;
        this.f526850g = dVar2;
        this.f526851h = bundle;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao it = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io ioVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.io.NoTransform;
        boolean a17 = com.p314xaae8f345.mm.app.p622xc5476f33.k.a();
        yb5.d dVar = this.f526848e;
        java.lang.String str = null;
        if (a17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f526847d;
            if (f9Var.i2() && f9Var.b2()) {
                str = f9Var.W0();
            }
            ioVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ym) ((sb5.l2) dVar.f542241c.a(sb5.l2.class))).v0(f9Var);
        }
        java.lang.String str2 = str;
        this.f526849f.f0(it, this.f526850g, this.f526851h, str2, ioVar);
        this.f526849f.V(it, this.f526850g, dVar.t(), dVar.D(), this.f526848e, this.f526849f);
        return jz5.f0.f384359a;
    }
}
