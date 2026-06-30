package e00;

/* loaded from: classes9.dex */
public final class y implements e00.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f327363a;

    /* renamed from: b, reason: collision with root package name */
    public final w05.h f327364b;

    /* renamed from: c, reason: collision with root package name */
    public final int f327365c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f327366d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f327367e;

    public y(java.lang.String path, w05.h reqInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        this.f327363a = path;
        this.f327364b = reqInfo;
        this.f327365c = i17;
        this.f327367e = jz5.h.b(new e00.x(this));
    }

    @Override // e00.n
    public boolean a() {
        return false;
    }

    @Override // e00.n
    public int b() {
        return this.f327365c;
    }

    @Override // e00.n
    public int c() {
        return 1;
    }

    @Override // e00.n
    public void d() {
        bw5.p10 p10Var = new bw5.p10();
        w05.h hVar = this.f327364b;
        p10Var.f112965d = hVar.n();
        boolean[] zArr = p10Var.f112969h;
        zArr[2] = true;
        p10Var.f112966e = hVar.x();
        zArr[3] = true;
        p10Var.f112967f = this.f327363a;
        zArr[4] = true;
        p10Var.f112968g = this.f327365c;
        zArr[5] = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = p10Var;
        lVar.f152198b = new bw5.q10();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_getcardecsjumpinfo";
        lVar.f152200d = 29379;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new e00.w(this, p10Var, currentTimeMillis));
    }

    @Override // e00.n
    /* renamed from: getCardType */
    public java.lang.String mo126543x7b5cb3e0() {
        return "NativeAppMsgCard";
    }

    @Override // e00.n
    /* renamed from: getKey */
    public java.lang.String mo126544xb5884f29() {
        return (java.lang.String) ((jz5.n) this.f327367e).mo141623x754a37bb();
    }
}
