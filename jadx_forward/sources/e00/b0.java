package e00;

/* loaded from: classes9.dex */
public final class b0 implements e00.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f327273a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f327274b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f327275c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f327276d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f327277e;

    public b0(int i17, java.util.List reqInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        this.f327273a = i17;
        this.f327274b = reqInfo;
        this.f327275c = z17;
        this.f327277e = jz5.h.b(new e00.a0(this));
    }

    @Override // e00.n
    public boolean a() {
        return this.f327275c;
    }

    @Override // e00.n
    public int b() {
        return this.f327273a;
    }

    @Override // e00.n
    public int c() {
        return this.f327274b.size();
    }

    @Override // e00.n
    public void d() {
        bw5.oe0 oe0Var = new bw5.oe0();
        oe0Var.f112614e = this.f327273a;
        oe0Var.f112615f[3] = true;
        oe0Var.f112613d.addAll(this.f327274b);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = oe0Var;
        lVar.f152198b = new bw5.re0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_batchgetproductcard";
        lVar.f152200d = 17166;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new e00.z(this, oe0Var, currentTimeMillis));
    }

    @Override // e00.n
    /* renamed from: getCardType */
    public java.lang.String mo126543x7b5cb3e0() {
        return "productCard";
    }

    @Override // e00.n
    /* renamed from: getKey */
    public java.lang.String mo126544xb5884f29() {
        return (java.lang.String) ((jz5.n) this.f327277e).mo141623x754a37bb();
    }
}
