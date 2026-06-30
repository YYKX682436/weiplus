package um2;

/* loaded from: classes3.dex */
public final class c4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ no0.a f510277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(um2.x5 x5Var, no0.a aVar) {
        super(0);
        this.f510276d = x5Var;
        this.f510277e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        um2.x5 x5Var = this.f510276d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dk0 dk0Var = x5Var.f510574i;
        if (dk0Var != null) {
            dk0Var.K0(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = x5Var.f510571h;
        if (ob0Var != null) {
            ob0Var.K0(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var2 = x5Var.f510571h;
        if (ob0Var2 != null) {
            ob0Var2.H1(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vi0 vi0Var = x5Var.f510584l0;
        if (vi0Var != null) {
            vi0Var.v1();
        }
        no0.a aVar = this.f510277e;
        java.lang.Integer num = aVar.f420243k;
        if (num != null && num.intValue() == 1) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, ml2.n4.f409275i, ml2.s2.f409453f, 0, 4, null);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_anchor_pass_link_event", x5Var.f101139c, kz5.b1.e(new jz5.l("link_type", 1)), 25561);
        } else {
            java.lang.Integer num2 = aVar.f420243k;
            if (num2 != null && num2.intValue() == 2) {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.ik((ml2.r0) c18, ml2.n4.f409275i, ml2.s2.f409454g, 0, 4, null);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_anchor_pass_link_event", x5Var.f101139c, kz5.b1.e(new jz5.l("link_type", 1)), 25561);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "onAcceptLinkMicSelf CDN invalid micType:" + num2);
            }
        }
        return jz5.f0.f384359a;
    }
}
