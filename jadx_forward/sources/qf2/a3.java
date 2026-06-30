package qf2;

/* loaded from: classes10.dex */
public final class a3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f443818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f443819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(qf2.c3 c3Var, java.lang.String str) {
        super(0);
        this.f443818d = c3Var;
        this.f443819e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qf2.c3 c3Var = this.f443818d;
        ((mm2.y2) c3Var.m56788xbba4bfc0(mm2.y2.class)).f411099s = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na naVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na) c3Var.R6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.na.class);
        if (naVar != null) {
            naVar.B1();
        }
        ((mm2.o4) c3Var.m56788xbba4bfc0(mm2.o4.class)).Z = null;
        c3Var.d7(this.f443819e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = c3Var.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) ubVar : null;
        if (k0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57621xc099750c(k0Var, ((mm2.c1) c3Var.m56788xbba4bfc0(mm2.c1.class)).f410385o, false, 2, null);
        }
        if (((mm2.e1) c3Var.m56788xbba4bfc0(mm2.e1.class)).g7()) {
            c3Var.f7(-1);
        } else if (zl2.r4.f555483a.x1()) {
            if (c3Var.f443846o == 2) {
                c3Var.f443846o = 1;
            }
            if (c3Var.f443846o == 4) {
                c3Var.f443846o = 3;
            }
            if (c3Var.f443846o == 10) {
                c3Var.f443846o = 9;
            }
            tn0.w0 Q6 = c3Var.Q6();
            if (Q6 != null) {
                Q6.i0(c3Var.f443846o, "");
            }
        }
        return jz5.f0.f384359a;
    }
}
