package fx3;

/* loaded from: classes10.dex */
public final /* synthetic */ class o extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public o(java.lang.Object obj) {
        super(1, obj, fx3.q.class, "observeState", "observeState(Lcom/tencent/mm/plugin/repairer/ui/monitor/RepairerMonitorState;)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fx3.r p07 = (fx3.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        fx3.q qVar = (fx3.q) this.f72685xcfcbe9ef;
        qVar.getClass();
        j75.d dVar = p07.f379599d;
        if (dVar != null && (dVar instanceof fx3.g)) {
            fx3.g gVar = (fx3.g) dVar;
            jz5.g gVar2 = qVar.f348679d;
            ((em.g3) ((jz5.n) gVar2).mo141623x754a37bb()).a().mo7967x900dcbe1(new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d(qVar.m158354x19263085()));
            qVar.f348680e = new xm3.t0(new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(new fx3.b(gVar.f348669b), new xm3.n0(), qVar.m158354x19263085(), null, null, 24, null), new in5.s() { // from class: com.tencent.mm.plugin.repairer.ui.monitor.RepairerMonitorListUIC$buildItemConvertFactory$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return new fx3.j();
                }
            }, false);
            ((em.g3) ((jz5.n) gVar2).mo141623x754a37bb()).a().mo7960x6cab2c8d(qVar.f348680e);
            xm3.t0 t0Var = qVar.f348680e;
            if (t0Var != null) {
                t0Var.B = new fx3.l(qVar);
            }
            ((em.g3) ((jz5.n) gVar2).mo141623x754a37bb()).a().post(new fx3.m(qVar, gVar));
        }
        return jz5.f0.f384359a;
    }
}
