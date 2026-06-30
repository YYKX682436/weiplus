package df2;

/* loaded from: classes10.dex */
public final class w1 extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f313182m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f313183n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yc f313184o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313182m = new p012xc85e97e9.p093xedfae76a.j0();
        this.f313183n = new java.util.HashSet();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveMsg */
    public void mo14867x5aa1c816(r45.r71 r71Var) {
        r45.tm1 tm1Var;
        super.mo14867x5aa1c816(r71Var);
        if (r71Var == null || (tm1Var = (r45.tm1) r71Var.m75936x14adae67(43)) == null || tm1Var.m75939xb282bd08(0) != 5) {
            return;
        }
        this.f313182m.mo7808x76db6cb1(tm1Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        this.f313182m.mo7806x9d92d11c((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) pluginLayout, new df2.s1(this));
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.yc ycVar = this.f313184o;
        if (ycVar != null) {
            ycVar.f201967c.dismiss();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = ycVar.f201971g;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
        this.f313184o = null;
        this.f372636i = null;
    }
}
