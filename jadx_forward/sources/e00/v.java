package e00;

/* loaded from: classes9.dex */
public final class v implements e00.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f327354a;

    /* renamed from: b, reason: collision with root package name */
    public final w05.h f327355b;

    /* renamed from: c, reason: collision with root package name */
    public final int f327356c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f327357d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f327358e;

    public v(java.lang.String path, w05.h reqInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reqInfo, "reqInfo");
        this.f327354a = path;
        this.f327355b = reqInfo;
        this.f327356c = i17;
        this.f327358e = jz5.h.b(new e00.u(this));
    }

    @Override // e00.n
    public boolean a() {
        return false;
    }

    @Override // e00.n
    public int b() {
        return this.f327356c;
    }

    @Override // e00.n
    public int c() {
        return 1;
    }

    @Override // e00.n
    public void d() {
        bw5.ye0 ye0Var = new bw5.ye0();
        ye0Var.f116989d = this.f327354a;
        boolean[] zArr = ye0Var.f116994i;
        zArr[2] = true;
        w05.h hVar = this.f327355b;
        ye0Var.f116990e = hVar.y();
        zArr[3] = true;
        ye0Var.f116991f = hVar.j();
        zArr[4] = true;
        ye0Var.f116992g = hVar.l();
        zArr[5] = true;
        ye0Var.f116993h = this.f327356c;
        zArr[6] = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ye0Var;
        lVar.f152198b = new bw5.ze0();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_getecjumpinfo";
        lVar.f152200d = 13462;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new e00.t(this, ye0Var, currentTimeMillis));
    }

    @Override // e00.n
    /* renamed from: getCardType */
    public java.lang.String mo126543x7b5cb3e0() {
        return "BulkBuyCard";
    }

    @Override // e00.n
    /* renamed from: getKey */
    public java.lang.String mo126544xb5884f29() {
        return (java.lang.String) ((jz5.n) this.f327358e).mo141623x754a37bb();
    }
}
