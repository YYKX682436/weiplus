package e00;

/* loaded from: classes9.dex */
public final class e0 implements e00.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f327289a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f327290b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f327291c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f327292d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f327293e;

    public e0(int i17, java.util.List reqInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        this.f327289a = i17;
        this.f327290b = reqInfo;
        this.f327291c = z17;
        this.f327293e = jz5.h.b(new e00.d0(this));
    }

    @Override // e00.n
    public boolean a() {
        return this.f327291c;
    }

    @Override // e00.n
    public int b() {
        return this.f327289a;
    }

    @Override // e00.n
    public int c() {
        return this.f327290b.size();
    }

    @Override // e00.n
    public void d() {
        bw5.te0 te0Var = new bw5.te0();
        te0Var.f114947e = this.f327289a;
        te0Var.f114948f[3] = true;
        te0Var.f114946d.addAll(this.f327290b);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = te0Var;
        lVar.f152198b = new bw5.ve0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_batchgetshopcard";
        lVar.f152200d = 15872;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new e00.c0(this, te0Var, currentTimeMillis));
    }

    @Override // e00.n
    /* renamed from: getCardType */
    public java.lang.String mo126543x7b5cb3e0() {
        return "shopCard";
    }

    @Override // e00.n
    /* renamed from: getKey */
    public java.lang.String mo126544xb5884f29() {
        return (java.lang.String) ((jz5.n) this.f327293e).mo141623x754a37bb();
    }
}
