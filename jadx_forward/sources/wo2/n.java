package wo2;

/* loaded from: classes2.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hy {

    /* renamed from: g, reason: collision with root package name */
    public r45.f03 f529636g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f529637h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hy
    public java.lang.String O6() {
        return !c92.g.f121271a.b() ? "NearbyEntrance" : "FinderLiveEntrance";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hy
    public boolean P6() {
        if (c92.g.f121271a.b()) {
            boolean E = ((c61.l7) i95.n0.c(c61.l7.class)).nk().E();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotUIJumpUIC", "[isIgnore] isEnableShowFinderLiveEntranceRedDot=" + E);
            if (!E) {
                return true;
            }
        } else {
            boolean v17 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().v();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotUIJumpUIC", "[isIgnore] isEnableShowNearByEntranceRedDot=" + v17);
            if (!v17) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hy
    public void Q6() {
        r45.xs2 xs2Var = this.f216210d;
        int m75939xb282bd08 = xs2Var != null ? xs2Var.m75939xb282bd08(12) : 0;
        if (m75939xb282bd08 == 0) {
            ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
            m75939xb282bd08 = wo2.n0.f529638a.c(94);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotUIJumpUIC", "prepareLiveSquare use last cache targetTabId=" + m75939xb282bd08);
        }
        int Di = ((v40.s) ((uc.n) i95.n0.c(uc.n.class))).Di(94, 0);
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        int i17 = 1005000 + m75939xb282bd08 + Di;
        if (P6()) {
            return;
        }
        ey2.o0 N6 = this.f216212f.N6(i17);
        N6.a(ey2.q0.f339005e);
        N6.f338981h = 0L;
        ((wo2.k) ((ws5.g) i95.n0.c(ws5.g.class))).getClass();
        r45.dd2 dd2Var = new r45.dd2();
        dd2Var.set(0, java.lang.Integer.valueOf(m75939xb282bd08));
        pq2.e c17 = nq2.d.f420513a.c(dd2Var);
        if (c17 != null) {
            c17.i();
        }
    }

    public final void R6() {
        if (c92.g.f121271a.b()) {
            this.f529636g = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("FinderLiveEntrance");
            this.f529637h = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderLiveEntrance");
        } else {
            this.f529636g = ((c61.l7) i95.n0.c(c61.l7.class)).nk().I0("NearbyEntrance");
            this.f529637h = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("NearbyEntrance");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
    }
}
