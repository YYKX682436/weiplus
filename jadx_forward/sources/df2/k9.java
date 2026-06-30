package df2;

/* loaded from: classes10.dex */
public final class k9 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f312092m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f312093n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f312094o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f312095p;

    /* renamed from: q, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f312096q;

    /* renamed from: r, reason: collision with root package name */
    public if2.d0 f312097r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f312098s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312092m = "Finder.HotCommentAnimationController";
        this.f312093n = "hotcommentanimation";
        this.f312094o = new java.util.ArrayList();
        this.f312095p = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public final void Z6(r45.ii1 animationInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationInfo, "animationInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addAnimation ");
        boolean z17 = false;
        sb6.append(animationInfo.m75945x2fec8307(0));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f312092m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f312095p;
        concurrentLinkedQueue.add(animationInfo);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f312096q;
        if ((r2Var == null || ((p3325xe03a0797.p3326xc267989b.c3) r2Var).mo143975x62a56b47()) ? false : true) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f312096q;
            if (r2Var2 != null && !((p3325xe03a0797.p3326xc267989b.c3) r2Var2).A()) {
                z17 = true;
            }
            if (z17) {
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkStartJob launch, animationPlayQueue size:" + concurrentLinkedQueue.size());
        this.f312096q = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.h9(this, null), 2, null);
    }

    public final void a7() {
        java.lang.String str = this.f312092m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkInitView");
        if (!(!this.f312094o.isEmpty())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkInitView but animationResourceList is empty, ignore");
            return;
        }
        android.view.View T6 = T6(com.p314xaae8f345.mm.R.id.f4u, com.p314xaae8f345.mm.R.id.f4t);
        if (T6 != null) {
            this.f312097r = new if2.d0(T6, this);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) T6.findViewById(com.p314xaae8f345.mm.R.id.h1a);
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.L1));
            this.f312098s = c22789xd23e9a9b;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkInitView pagView:");
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = this.f312098s;
            sb6.append(c22789xd23e9a9b2 != null ? c22789xd23e9a9b2.hashCode() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.kw1 kw1Var;
        java.util.LinkedList m75941xfb821914;
        super.mo14863x39a513b7(hc1Var);
        java.util.ArrayList arrayList = this.f312094o;
        arrayList.clear();
        if (hc1Var != null && (kw1Var = (r45.kw1) hc1Var.m75936x14adae67(62)) != null && (m75941xfb821914 = kw1Var.m75941xfb821914(0)) != null) {
            arrayList.addAll(m75941xfb821914);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f312092m, "onLiveStart animationList:".concat(kz5.n0.g0(arrayList, null, null, null, 0, null, df2.i9.f311918d, 31, null)));
        a7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        this.f312095p.clear();
        this.f372636i = new df2.j9(this);
        a7();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        this.f312095p.clear();
        this.f312098s = null;
    }
}
