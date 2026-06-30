package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class ym extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f229282h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d f229283i;

    public ym(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d, int i17) {
        this.f229283i = activityC16390x60cac25d;
        this.f229282h = i17;
    }

    @Override // in5.q0, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo8162x34789575(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rm rmVar) {
        if (rmVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co coVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co) rmVar;
            com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b0 = coVar.f228352r;
            if (c10389xffc30b0 != null && c10389xffc30b0.getVisibility() == 0) {
                com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b02 = coVar.f228352r;
                c10389xffc30b02.n();
                c10389xffc30b02.i(coVar.f228353s);
                coVar.f228353s = null;
            }
            com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b03 = coVar.f228347m;
            if (c10389xffc30b03 != null && c10389xffc30b03.getVisibility() == 0) {
                c10389xffc30b03.n();
                c10389xffc30b03.i(coVar.f228348n);
                c10389xffc30b03.j(coVar.f228349o);
                coVar.f228348n = null;
                coVar.f228349o = null;
            }
            com.p314xaae8f345.mm.p653x55bb7a46.p655xac8f1cfd.C10389xffc30b0 c10389xffc30b04 = coVar.f228358x;
            if (c10389xffc30b04 != null && c10389xffc30b04.getVisibility() == 0) {
                c10389xffc30b04.n();
                c10389xffc30b04.i(coVar.f228359y);
                coVar.f228359y = null;
            }
        }
        super.mo8162x34789575(rmVar);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return ((java.util.ArrayList) this.f229283i.f228065t).size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) this.f229283i.f228065t).get(i17)).hashCode();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm zmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) this.f229283i.f228065t).get(i17);
        if (zmVar.f229327c) {
            return 3;
        }
        int i18 = zmVar.f229326b.f471039o;
        if (i18 == 3) {
            return 2;
        }
        return i18 == 4 ? 4 : 1;
    }

    @Override // in5.q0
    public void x(in5.r0 r0Var, int i17) {
        new java.util.ArrayList();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rm) r0Var).l((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) this.f229283i.f228065t).get(i17), i17);
    }

    @Override // in5.q0
    public void y(in5.r0 r0Var, int i17, java.util.List list) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.rm) r0Var).l((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.zm) ((java.util.ArrayList) this.f229283i.f228065t).get(i17), i17);
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup viewGroup, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d activityC16390x60cac25d = this.f229283i;
        int i18 = this.f229282h;
        if (i17 == 1) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.co(activityC16390x60cac25d, i18 == 1 ? android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570778bv2, viewGroup, false) : android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570776bv0, viewGroup, false), i18);
        }
        if (i17 == 2) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.vm(activityC16390x60cac25d, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bux, viewGroup, false), i18);
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(22302, 1);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.bn(activityC16390x60cac25d, i18 == 1 ? android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.buz, viewGroup, false) : android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.buy, viewGroup, false), i18);
        }
        if (i17 == 4) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.xm(activityC16390x60cac25d, i18 == 1 ? android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570775bu5, viewGroup, false) : android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570774bu4, viewGroup, false), i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "wrong type: %s", java.lang.Integer.valueOf(i17));
        return null;
    }
}
