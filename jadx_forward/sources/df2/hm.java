package df2;

/* loaded from: classes3.dex */
public final class hm extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311868m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f311869n;

    /* renamed from: o, reason: collision with root package name */
    public int f311870o;

    /* renamed from: p, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311871p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311868m = "Finder.LiveHeatController";
    }

    public static final void Z6(df2.hm hmVar) {
        android.view.ViewGroup viewGroup;
        java.lang.Object obj = hmVar.f372632e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view == null || (viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.f567119i92)) == null) {
            return;
        }
        p012xc85e97e9.p112x993b6d55.C1172x76e7e484 c1172x76e7e484 = new p012xc85e97e9.p112x993b6d55.C1172x76e7e484();
        c1172x76e7e484.Z(300L);
        u4.g1.a(viewGroup, c1172x76e7e484);
    }

    public static final android.view.ViewGroup a7(df2.hm hmVar) {
        android.view.ViewGroup viewGroup;
        java.lang.Object obj = hmVar.f372632e;
        if ((obj instanceof android.view.View ? (android.view.View) obj : null) == null) {
            return null;
        }
        android.view.View b76 = hmVar.b7();
        if (b76 instanceof android.view.ViewStub) {
            android.view.View inflate = ((android.view.ViewStub) b76).inflate();
            if (!(inflate instanceof android.view.ViewGroup)) {
                return null;
            }
            viewGroup = (android.view.ViewGroup) inflate;
        } else {
            if (!(b76 instanceof android.view.ViewGroup)) {
                return null;
            }
            viewGroup = (android.view.ViewGroup) b76;
        }
        return viewGroup;
    }

    public final android.view.View b7() {
        android.view.View findViewById;
        java.lang.Object obj = this.f372632e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view == null) {
            return null;
        }
        if (zl2.r4.f555483a.v1(view)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.f567172ig1);
            if (viewGroup == null) {
                return null;
            }
            findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.i_o);
        } else {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.f567122i95);
            if (viewGroup2 == null) {
                return null;
            }
            findViewById = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.i_o);
        }
        return findViewById;
    }

    public final void c7() {
        boolean z17 = this.f311869n;
        java.lang.String str = this.f311868m;
        if (z17 || !((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPolling isPolling:" + this.f311869n + ", liveStarted:" + ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).a8());
            return;
        }
        this.f311869n = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPolling");
        if (zl2.r4.f555483a.w1()) {
            r45.ub2 ub2Var = new r45.ub2();
            ub2Var.set(0, c01.z1.r());
            ub2Var.set(1, java.lang.Long.valueOf(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m));
            ub2Var.set(2, xy2.c.e(O6()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPolling anchor, username:" + ub2Var.m75945x2fec8307(0) + ", object_id:" + pm0.v.u(ub2Var.m75942xfb822ef2(1)) + ", finder_username:" + ub2Var.m75945x2fec8307(2));
            dk2.ef efVar = dk2.ef.f314905a;
            dk2.ef.f314925k.e(22, ub2Var, new df2.tl(this, r45.vb2.class), false);
            return;
        }
        r45.sb2 sb2Var = new r45.sb2();
        sb2Var.set(0, c01.z1.r());
        sb2Var.set(1, java.lang.Long.valueOf(((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m));
        sb2Var.set(2, ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).f410385o);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "startPolling visitor, username:" + sb2Var.m75945x2fec8307(0) + ", object_id:" + pm0.v.u(sb2Var.m75942xfb822ef2(1)) + ", finder_username:" + sb2Var.m75945x2fec8307(2));
        dk2.ef efVar2 = dk2.ef.f314905a;
        dk2.ef.f314925k.e(21, sb2Var, new df2.ul(this, r45.tb2.class), false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        c7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        c7();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311868m, "stopPolling");
        this.f311869n = false;
        dk2.tb tbVar = dk2.ef.f314925k;
        tbVar.f(22);
        tbVar.f(21);
        this.f311870o = 0;
        this.f311871p = null;
    }
}
