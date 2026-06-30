package el2;

/* loaded from: classes3.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(el2.i1 i1Var) {
        super(0);
        this.f335283d = i1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.tp1 tp1Var;
        el2.i1 i1Var = this.f335283d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0 ag0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0) i1Var.f335347f.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ag0.class);
        int I1 = ag0Var != null ? ag0Var.I1(i1Var.f335345d) : 0;
        if (i1Var.f335356r != I1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i1Var.f335348g, "newVisibleSize:" + I1 + ", visibleSize:" + i1Var.f335356r);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = i1Var.f335347f;
            r45.tp1 tp1Var2 = (r45.tp1) ((je2.t) lVar.P0(je2.t.class)).f380801n.mo3195x754a37bb();
            if (tp1Var2 != null) {
                tp1Var = new r45.tp1();
                byte[] mo14344x5f01b1f6 = tp1Var2.mo14344x5f01b1f6();
                if (mo14344x5f01b1f6 != null) {
                    try {
                        tp1Var.mo11468x92b714fd(mo14344x5f01b1f6);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
            } else {
                tp1Var = null;
            }
            ((je2.t) lVar.P0(je2.t.class)).f380801n.mo7808x76db6cb1(tp1Var);
        }
        return jz5.f0.f384359a;
    }
}
