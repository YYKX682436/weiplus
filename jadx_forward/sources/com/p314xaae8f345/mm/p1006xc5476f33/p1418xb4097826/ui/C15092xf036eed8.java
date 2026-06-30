package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J \u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¨\u0006\u0010"}, d2 = {"com/tencent/mm/plugin/finder/ui/ShareRelPresenter$buildItemCoverts$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Lin5/s0;", "holder", "position", "Ljz5/f0;", "addListener", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "item", "Lr45/nv2;", "shareUserInfo", "refreshThankForwardButton", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1 */
/* loaded from: classes2.dex */
public final class C15092xf036eed8 implements in5.s {

    /* renamed from: _hellAccFlag_ */
    private byte f36225x7f11beae;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm f36226xcbdd23aa;

    public C15092xf036eed8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar) {
        this.f36226xcbdd23aa = qmVar;
    }

    /* renamed from: addListener */
    public final void m60902x162a7075(final in5.s0 holder, final int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.g2e) != null) {
            return;
        }
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = this.f36226xcbdd23aa;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5532x6b57699a> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5532x6b57699a>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1$addListener$1
            {
                this.f39173x3fe91575 = -1456508534;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5532x6b57699a c5532x6b57699a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5532x6b57699a event = c5532x6b57699a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.dd ddVar = event.f135857g;
                if (ddVar != null) {
                    if (i17 == ddVar.f87976a) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qmVar.f211282x0, "type:" + ddVar.f87977b + " position:" + ddVar.f87976a);
                        in5.s0 s0Var = holder;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
                        if (ddVar.f87977b == 1) {
                            if (c15196x85976f5f != null) {
                                cw2.v9.j(c15196x85976f5f, false, 1, null);
                            }
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.g2r);
                            if (frameLayout != null) {
                                frameLayout.setVisibility(0);
                            }
                        } else {
                            if (c15196x85976f5f != null) {
                                cw2.v9.n(c15196x85976f5f, 0, null, null, 7, null);
                            }
                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) s0Var.p(com.p314xaae8f345.mm.R.id.g2r);
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility(8);
                            }
                        }
                    }
                }
                return true;
            }
        };
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.g2e, abstractC20980x9b9ad01d);
        this.f36226xcbdd23aa.f211279l1.add(abstractC20980x9b9ad01d);
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    @Override // in5.s
    /* renamed from: getItemConvert */
    public in5.r mo43555xf2bb75ea(int type) {
        if (type == 2016) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f36226xcbdd23aa.f188103t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader");
            java.util.List list = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13861xc72e20d8) abstractC13919x46aff122).Q;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f36226xcbdd23aa.f187954d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wr(nyVar != null ? nyVar.V6() : null, this.f36226xcbdd23aa.f187960m, list);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = this.f36226xcbdd23aa;
        qmVar.getClass();
        in5.r mo43555xf2bb75ea = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13773x966c9085(qmVar).mo43555xf2bb75ea(type);
        if (mo43555xf2bb75ea instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar2 = this.f36226xcbdd23aa;
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fm(this.f36226xcbdd23aa, this, qmVar2.f187962o, qmVar2.f190580z, qmVar2.f187960m);
        }
        if (!(mo43555xf2bb75ea instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df)) {
            return mo43555xf2bb75ea;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar3 = this.f36226xcbdd23aa;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.gm(this.f36226xcbdd23aa, qmVar3.f190580z, qmVar3.f187960m);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* renamed from: refreshThankForwardButton */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m60903x111401c8(in5.s0 r40, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r41, r45.nv2 r42) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.C15092xf036eed8.m60903x111401c8(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, r45.nv2):void");
    }
}
