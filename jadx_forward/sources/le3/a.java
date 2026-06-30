package le3;

/* loaded from: classes7.dex */
public final class a extends hq0.i0 {

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f399677x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Collection f399678y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f399679z;

    public a() {
        super(null, 1, null);
        this.f399677x = "MagicSclNativeDemoBiz";
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5 f5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) c17;
        this.f399678y = kz5.n0.t0(kz5.b0.c(new lq0.g()), ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4.class))).Ni("MagicSclNativeDemo"));
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb();
        this.f399679z = kz5.p1.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.eb.class.getName(), f5Var.Vc(969).getClass().getName(), f5Var.Vc(970).getClass().getName(), f5Var.Vc(984).getClass().getName(), f5Var.Vc(1065).getClass().getName(), f5Var.Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.r.f34013x366c91de).getClass().getName(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.g0.class.getName(), f5Var.Vc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33740x366c91de).getClass().getName());
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        return new tp0.l();
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicSclNativeDemo";
    }

    @Override // hq0.i0
    public void X0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399677x, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        super.X0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b(null, null, null, null, false, false, false, null, false, null, 1023, null);
        c16416x87606a7b.f229367x = this;
        c16416x87606a7b.f229354h = z65.c.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y4.a(c16416x87606a7b, this.f399679z);
        c16416x87606a7b.a(this.f399678y);
        I1(c16416x87606a7b);
        mo123044x68ac462();
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399677x, "onMainScriptInjected");
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        super.mo123043xac79a11b(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f399677x, "onDestroy");
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String concat = "onBind: info is ".concat(info);
        java.lang.String str = this.f399677x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, concat);
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = frameSet.f347021l;
        if (c10867x3e50a04d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "sclView empty, addCustomView error");
        } else if (frameSet.f347025p == 0) {
            int C0 = C0(c10867x3e50a04d);
            frameSet.f347025p = C0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "viewId is assigned:" + C0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "viewId is already assigned:" + frameSet.f347025p);
        }
        super.s1(root, frameSet, info);
    }
}
