package xu;

/* loaded from: classes9.dex */
public final /* synthetic */ class n extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public n(java.lang.Object obj) {
        super(1, obj, xu.p.class, "observeState", "observeState(Lcom/tencent/mm/feature/appmsg/record/detail/RecordDetailState;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hu.e p07 = (hu.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        xu.p pVar = (xu.p) this.f72685xcfcbe9ef;
        pVar.getClass();
        j75.d dVar = p07.f379599d;
        if (dVar != null && (dVar instanceof hu.a)) {
            jz5.g gVar = pVar.f538716d;
            em.r2 r2Var = (em.r2) ((jz5.n) gVar).mo141623x754a37bb();
            if (r2Var.f336291b == null) {
                r2Var.f336291b = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) r2Var.f336290a.findViewById(com.p314xaae8f345.mm.R.id.lqa);
            }
            r2Var.f336291b.mo7967x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(pVar.m158354x19263085()));
            s15.w wVar = p07.f366536f;
            if (wVar == null) {
                wVar = new s15.w();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(new uu.d(wVar), new xm3.n0(), pVar.m158354x19263085(), null, null, 24, null);
            pVar.f538717e = new xm3.t0(c16718x7059cefe, new com.p314xaae8f345.mm.p689xc5a27af6.p694xabe4edc0.ui.uic.C10462x9905918c(p07.f366535e, c16718x7059cefe), false);
            em.r2 r2Var2 = (em.r2) ((jz5.n) gVar).mo141623x754a37bb();
            if (r2Var2.f336291b == null) {
                r2Var2.f336291b = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) r2Var2.f336290a.findViewById(com.p314xaae8f345.mm.R.id.lqa);
            }
            r2Var2.f336291b.mo7960x6cab2c8d(pVar.f538717e);
            xm3.t0 t0Var = pVar.f538717e;
            if (t0Var != null) {
                t0Var.B = new xu.l(pVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
