package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/square/page/NearbyLiveSquareTabFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment */
/* loaded from: classes2.dex */
public final class C14521x246f2bd extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 {

    /* renamed from: s, reason: collision with root package name */
    public final r45.dd2 f203052s;

    /* renamed from: t, reason: collision with root package name */
    public r45.dd2 f203053t;

    /* renamed from: u, reason: collision with root package name */
    public int f203054u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14521x246f2bd(r45.dd2 tabInfo, r45.dd2 dd2Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(com.p314xaae8f345.mm.R.C30867xcad56011.h7d, 1005);
        dd2Var = (i17 & 2) != 0 ? null : dd2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabInfo, "tabInfo");
        this.f203052s = tabInfo;
        this.f203053t = dd2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, op2.e.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        super.o0();
        rq2.x.f480447a.c(this);
        ip2.a.f375145a.b(this);
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            rq2.w wVar = (rq2.w) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(rq2.w.class);
            wVar.f480440i = "";
            wVar.f480441m = 0L;
            wVar.f480442n = true;
        }
        n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
        java.lang.String valueOf = java.lang.String.valueOf(getF203048s());
        ((m30.m) qVar).getClass();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = a52.a.f83106a;
        a52.a.f83118m = valueOf != null ? valueOf : "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyLiveSquareTabFragment);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.FinderLive);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "NearbyLiveSquareTabFragment");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new op2.b(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View mo7503x18bad100 = super.mo7503x18bad100(inflater, viewGroup, bundle);
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        boolean z17 = true;
        if (m7436x8619eaa0 != null) {
            m7436x8619eaa0.getInt("key_use_dark_style", 1);
        }
        android.os.Bundle m7436x8619eaa02 = m7436x8619eaa0();
        if (m7436x8619eaa02 != null) {
            int i17 = m7436x8619eaa02.getInt("key_from_comment_scene");
            if (i17 != 9500001 && i17 != 9500002 && i17 != 9500004 && i17 != 9500003) {
                z17 = false;
            }
            r45.dd2 dd2Var = this.f203052s;
            if (!z17) {
                i17 = (i17 * 100000) + dd2Var.m75939xb282bd08(0);
            }
            this.f203054u = i17;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n = this.f203054u;
            nq2.d dVar = nq2.d.f420513a;
            nq2.d.f420518f.put(dd2Var.m75939xb282bd08(0), java.lang.Integer.valueOf(this.f203054u));
        }
        android.os.Bundle m7436x8619eaa03 = m7436x8619eaa0();
        if (m7436x8619eaa03 != null && (string = m7436x8619eaa03.getString("key_click_tab_context_id")) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216919r = string;
        }
        android.os.Bundle m7436x8619eaa04 = m7436x8619eaa0();
        if (m7436x8619eaa04 == null || (str = m7436x8619eaa04.getString("key_click_tab_id")) == null) {
            str = "";
        }
        this.f202994q = str;
        return mo7503x18bad100;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onRequestPermissionsResult */
    public void mo7516x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        super.mo7516x953457f1(i17, permissions, grantResults);
        ((op2.e) j0(op2.e.class)).mo2282x953457f1(i17, permissions, grantResults);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).mo451xac79a11b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        super.p0();
        rq2.x.f480447a.d(this);
        ip2.a.f375145a.c(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getF203048s() {
        return mo7430x19263085() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n : this.f203054u;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public java.lang.String t0() {
        return java.lang.String.valueOf(this.f203052s.m75939xb282bd08(0));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public java.lang.String w0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getF203048s());
        sb6.append('-');
        r45.dd2 dd2Var = this.f203052s;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)) : "");
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public int x0() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public void y0() {
        op2.c cVar = ((op2.e) j0(op2.e.class)).f428774e;
        if (cVar != null) {
            cVar.B(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public void z0() {
        op2.c cVar = ((op2.e) j0(op2.e.class)).f428774e;
        if (cVar != null) {
            cVar.B(true);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
    }
}
