package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1575xb830cb56;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/nearby/live/localcity/NearbyLiveLocalCityFragment;", "Lcom/tencent/mm/plugin/finder/nearby/base/AbsNearByFragment;", "<init>", "()V", "plugin-finder-nearby_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment */
/* loaded from: classes2.dex */
public final class C14507xc6c296fb extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 {

    /* renamed from: s, reason: collision with root package name */
    public r45.dd2 f203019s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f203020t;

    public C14507xc6c296fb() {
        super(com.p314xaae8f345.mm.R.C30867xcad56011.h7d, 1006);
        this.f203020t = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, fp2.d.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        super.o0();
        r45.dd2 dd2Var = this.f203019s;
        ip2.a aVar = ip2.a.f375145a;
        if (dd2Var == null) {
            r45.dd2 dd2Var2 = new r45.dd2();
            this.f203019s = dd2Var2;
            dd2Var2.set(0, 88889);
            java.lang.String str = "8003-" + c01.id.c();
            rq2.x xVar = rq2.x.f480447a;
            aVar.a(rq2.x.f480448b, this, str, "");
        }
        rq2.x.f480447a.c(this);
        aVar.b(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.NearbyLiveLocalCityFragment);
        aVar.Rj(this, iy1.a.PeopleNearby);
        aVar.ck(this, true);
        aVar.ik(this, 40, 24184);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        ip2.a.f375146b = "";
        ip2.a.f375148d = "";
        ip2.a.f375147c = "";
        ip2.a.f375149e = true;
        ip2.a.f375153i = false;
        ip2.a.f375150f = "";
        ip2.a.f375151g = -1;
        ip2.a.f375152h = -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        if (mo7430x19263085() != null) {
            ip2.a.f375145a.c(this);
        }
        ip2.a.f375153i = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        if (!this.f203020t && mo7430x19263085() != null) {
            ip2.a.f375145a.b(this);
        }
        this.f203020t = false;
        ip2.a.f375153i = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void p0() {
        super.p0();
        rq2.x.f480447a.d(this);
        ip2.a.f375145a.c(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getB() {
        return 112;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public java.lang.String t0() {
        r45.dd2 dd2Var = this.f203019s;
        return java.lang.String.valueOf(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)) : null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    /* renamed from: u0 */
    public java.lang.String getF203049t() {
        return "8003";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public java.lang.String w0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("112-");
        r45.dd2 dd2Var = this.f203019s;
        sb6.append(dd2Var != null ? java.lang.Integer.valueOf(dd2Var.m75939xb282bd08(0)) : "");
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public int x0() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public void y0() {
        fp2.a aVar = ((fp2.d) j0(fp2.d.class)).f346833e;
        if (aVar != null) {
            aVar.B(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301
    public void z0() {
        fp2.a aVar = ((fp2.d) j0(fp2.d.class)).f346833e;
        if (aVar != null) {
            aVar.B(true);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveFriendsPresenter");
            throw null;
        }
    }
}
