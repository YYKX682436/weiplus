package fd4;

/* loaded from: classes4.dex */
public class n implements com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fd4.o f342851a;

    public n(fd4.o oVar) {
        this.f342851a = oVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1
    /* renamed from: onCancel */
    public void mo71188x3d6f0539() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCancel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1
    /* renamed from: onClick */
    public void mo71189xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongPressAdBusiness", "SnsAdTouchProgressView onClick");
            this.f342851a.f342822f.f506687o.f249947d.performClick();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongPressAdBusiness", "SnsAdTouchProgressView onClick exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1
    /* renamed from: onFinish */
    public void mo71190x42fe6352() {
        s34.x xVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x xVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        fd4.o oVar = this.f342851a;
        oVar.f342822f.T.f506665b = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar = oVar.f342826m;
        if (nVar == null || nVar.f38341xd41fa323 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongPressAdBusiness", "no gestureClickActionInfo");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("ad_no_click_anim", true);
            oVar.r(bundle);
            oVar.l();
            oVar.k(28);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongPressAdBusiness", "has gestureClickActionInfo");
            if (oVar.f342825i.m70354x74235b3e().f38171x7a21d490 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongPressAdBusiness", "has adEggAnimationInfo");
                xVar = oVar.f342825i.m70354x74235b3e().f38171x7a21d490;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.n nVar2 = oVar.f342826m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasOldLongPressAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
                boolean z17 = (nVar2 == null || (xVar2 = nVar2.f247609k) == null || android.text.TextUtils.isEmpty(xVar2.f247694d)) ? false : true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasOldLongPressAnim", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness");
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongPressAdBusiness", "has oldLongPressAnim");
                    xVar = new s34.x();
                    xVar.f484355a = 5;
                    s34.u uVar = new s34.u();
                    xVar.f76726x352a9be7 = uVar;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x xVar3 = oVar.f342826m.f247609k;
                    uVar.f484315a = xVar3.f247695e;
                    uVar.f484317c = xVar3.f247697g;
                    uVar.f76719x4fc233f9 = xVar3.f247694d;
                    uVar.f484316b = xVar3.f247696f;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongPressAdBusiness", "no adEggAnimationInfo, and no oldLongPressAnim");
                    xVar = null;
                }
            }
            oVar.f342826m.f38341xd41fa323.f244102a = 17;
            t34.g gVar = new t34.g();
            gVar.f(oVar.f342827n);
            gVar.e(oVar.f342825i);
            gVar.c(oVar.f342826m.f38341xd41fa323);
            gVar.d(oVar.f342821e);
            gVar.a(xVar);
            gVar.b(oVar.f342829p);
            u74.d dVar = oVar.f342822f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fullCardWrapViewHolder", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
            t34.f fVar = gVar.f496964a;
            fVar.f496963i = dVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fullCardWrapViewHolder", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = oVar.f342824h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("timelineClickListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
            fVar.f496962h = iVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("timelineClickListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
            gVar.g(oVar.f342820d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.b1
    /* renamed from: onStart */
    public void mo71191xb05099c3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LongPressAdBusiness$1");
    }
}
