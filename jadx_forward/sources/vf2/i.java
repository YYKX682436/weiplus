package vf2;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vf2.q f517873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vf2.q qVar) {
        super(0);
        this.f517873d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String m75945x2fec8307;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).Gj(4);
        vf2.q qVar = this.f517873d;
        if (qVar.f517887m == null) {
            r45.xq1 xq1Var = ((mm2.c1) qVar.m56788xbba4bfc0(mm2.c1.class)).C2;
            if (xq1Var != null && (m75945x2fec8307 = xq1Var.m75945x2fec8307(2)) != null) {
                java.lang.String str = m75945x2fec8307.length() > 0 ? m75945x2fec8307 : null;
                if (str != null) {
                    ke2.y yVar = new ke2.y(str, 0, false, null, false, null, 60, null);
                    yVar.t(qVar.O6(), qVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 0L);
                    pq5.g l17 = yVar.l();
                    l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) qVar.O6());
                    l17.K(new vf2.k(qVar, str));
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(qVar, null, null, new vf2.l(qVar, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
