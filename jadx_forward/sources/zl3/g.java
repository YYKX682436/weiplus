package zl3;

/* loaded from: classes11.dex */
public final class g extends zl3.n {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f555594h = "MicroMsg.FlutterTingPlayerPlugin";

    /* renamed from: i, reason: collision with root package name */
    public final zl3.f f555595i = new zl3.f(this);

    public final qk.g9 b() {
        i95.m c17 = i95.n0.c(qk.g9.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return (qk.g9) c17;
    }

    public final com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7 c(bw5.lp0 lp0Var) {
        return new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7(lp0Var.b(), null, rk4.j5.c(lp0Var), null, rk4.j5.a(lp0Var), rk4.j5.l(lp0Var), rk4.j5.d(lp0Var), mo91480x51e8b0a(), null, "", null, lp0Var.d().b().c(), lp0Var.d().b().m12207xa822edd3(), null, null, null, 58634, null);
    }

    @Override // zl3.n, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: getCurrentMusic */
    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7 mo91478xb78356a2() {
        bw5.lp0 uj6 = ((rk4.z8) b()).uj();
        return (uj6 == null || !((rk4.z8) b()).nj()) ? new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null) : c(uj6);
    }

    @Override // zl3.n, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: getCurrentPosition */
    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca mo91479x9746038c() {
        return new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca(java.lang.Long.valueOf(((rk4.z8) b()).Di()));
    }

    @Override // zl3.n, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: getDuration */
    public com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca mo91480x51e8b0a() {
        return new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca(java.lang.Long.valueOf(((rk4.z8) b()).Ai()));
    }

    @Override // zl3.n, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.Companion.m91488x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        this.f555603d = new com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24659x1136450(m137983x3b5b91dc2, null, 2, null);
        i95.m c17 = i95.n0.c(qk.u8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((ef0.j3) ((qk.u8) c17)).wi(this.f555595i);
    }

    @Override // zl3.n, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4.Companion.m91488x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        i95.m c17 = i95.n0.c(qk.u8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((ef0.j3) ((qk.u8) c17)).Ai(this.f555595i);
        this.f555603d = null;
    }

    @Override // zl3.n, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: pause */
    public void mo91482x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f555594h, "pause");
        ((rk4.z8) b()).pj();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r1 == null) goto L18;
     */
    @Override // zl3.n, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: play */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo91483x348b34(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24615x764bb7d7 r36) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl3.g.mo91483x348b34(com.tencent.pigeon.mm_foundation.FlutterMusicInfo):void");
    }

    @Override // zl3.n, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: resume */
    public void mo91484xc84dc82d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f555594h, "resume");
        ((rk4.z8) b()).wj();
    }

    @Override // zl3.n, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: seek */
    public void mo91485x35ce78(com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24558x7f89d5ca time) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(time, "time");
        qk.g9 b17 = b();
        java.lang.Long m91045x754a37bb = time.m91045x754a37bb();
        ((rk4.z8) b17).xj(m91045x754a37bb != null ? m91045x754a37bb.longValue() : 0L);
    }

    @Override // zl3.n, com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.InterfaceC24670xf87586f4
    /* renamed from: stop */
    public void mo91486x360802() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f555594h, "stop");
        ((rk4.z8) b()).zj();
    }
}
