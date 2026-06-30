package yw3;

/* loaded from: classes11.dex */
public final /* synthetic */ class y6 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public y6(java.lang.Object obj) {
        super(1, obj, yw3.a7.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerSvgDemoState;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yw3.b7 p07 = (yw3.b7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        yw3.a7 a7Var = (yw3.a7) this.f72685xcfcbe9ef;
        a7Var.getClass();
        j75.d dVar = p07.f379599d;
        if (dVar != null && (dVar instanceof yw3.r6)) {
            yw3.r6 r6Var = (yw3.r6) dVar;
            jz5.g gVar = a7Var.f548226d;
            em.p3 p3Var = (em.p3) ((jz5.n) gVar).mo141623x754a37bb();
            if (p3Var.f336239b == null) {
                p3Var.f336239b = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) p3Var.f336238a.findViewById(com.p314xaae8f345.mm.R.id.lqa);
            }
            p3Var.f336239b.mo7967x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(a7Var.m158354x19263085()));
            a7Var.f548227e = new xm3.t0(new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(new yw3.l6(r6Var.f548402b), new xm3.n0(), a7Var.m158354x19263085(), null, null, 24, null), new in5.s() { // from class: com.tencent.mm.plugin.repairer.ui.demo.RepairerSvgDemoListUIC$buildItemConvertFactory$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new yw3.u6();
                }
            }, false);
            em.p3 p3Var2 = (em.p3) ((jz5.n) gVar).mo141623x754a37bb();
            if (p3Var2.f336239b == null) {
                p3Var2.f336239b = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) p3Var2.f336238a.findViewById(com.p314xaae8f345.mm.R.id.lqa);
            }
            p3Var2.f336239b.mo7960x6cab2c8d(a7Var.f548227e);
            xm3.t0 t0Var = a7Var.f548227e;
            if (t0Var != null) {
                t0Var.B = new yw3.w6(a7Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
