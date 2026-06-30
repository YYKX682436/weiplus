package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class b implements za4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f245613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f245614b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e f245615c;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e binderC17870x451d307e, long j17, long j18) {
        this.f245615c = binderC17870x451d307e;
        this.f245613a = j17;
        this.f245614b = j18;
    }

    @Override // za4.r1
    public int a(boolean z17, java.lang.String str, java.util.Map map) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$11");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesProxy", "doRequestDynamicCanvasXml callback, isSuccess is " + z17 + ", pageId is " + this.f245613a);
            this.f245615c.m142013x77b46a52("onGetAdCanvasXmlFromNet", java.lang.Long.valueOf(this.f245614b), java.lang.Boolean.valueOf(z17), str);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPagesProxy", "doRequestDynamicCanvasXml callback, exp is " + th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$11");
        return 0;
    }
}
