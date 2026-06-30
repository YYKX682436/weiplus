package zv2;

/* loaded from: classes10.dex */
public final class p0 extends zv2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 jumpView) {
        super(activity, jumpView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        r45.ew0 ew0Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        r45.k74 m76504xa819f0c7;
        g92.b bVar = g92.b.f351302e;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f557928d;
        m92.b j37 = g92.a.j3(bVar, xy2.c.e(context), false, 2, null);
        if (j37 == null || (ew0Var = (r45.ew0) j37.u0().m75936x14adae67(57)) == null || (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) ew0Var.m75936x14adae67(1)) == null || (m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7()) == null) {
            return;
        }
        m76504xa819f0c7.m75945x2fec8307(0);
        m76504xa819f0c7.m75945x2fec8307(1);
        m76504xa819f0c7.m75945x2fec8307(2);
        m76504xa819f0c7.m75933x41a8a7f2(7);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zv2.m0 m0Var = new zv2.m0(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534786o = null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
        h0Var.f391656d = sVar;
        sVar.f225700d = new ya2.n0(m0Var, h0Var);
        xc2.y2.L(xc2.y2.f534876a, context, p0Var, null, sVar, null, 16, null);
    }

    @Override // zv2.b
    public void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        java.lang.String m76523x98b23862 = jumpInfo.m76523x98b23862();
        if (m76523x98b23862 == null) {
            m76523x98b23862 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(this.f557929e, m76523x98b23862, false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f557928d;
        java.lang.String string = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ozo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        c15305x8b2e5786.m62140x6fd9aa19(string);
        c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f79062xdcc30124);
        c15305x8b2e5786.m62141xb8c4b266(activityC0065xcd7aa112.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f482931a.a(this.f557928d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.n0(this), null, 22, null), new ry2.f(2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, 0, new zv2.o0(this), null, 20, null)), null);
    }
}
