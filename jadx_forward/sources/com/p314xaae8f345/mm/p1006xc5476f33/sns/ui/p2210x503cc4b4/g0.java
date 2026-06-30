package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class g0 implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f251315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w64.x f251316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251318d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, java.lang.Object obj, w64.x xVar, android.view.View view) {
        this.f251318d = iVar;
        this.f251315a = obj;
        this.f251316b = xVar;
        this.f251317c = view;
    }

    @Override // w64.l
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
        java.lang.Object obj = this.f251315a;
        boolean z17 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder;
        w64.x xVar = this.f251316b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = this.f251318d;
        if (z17) {
            iVar.P((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder) obj, xVar);
        } else if (obj instanceof dc4.v) {
            iVar.L((dc4.v) obj, xVar);
        } else if (xVar != null) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.n(iVar) == 0) {
                iVar.P(null, xVar);
            } else {
                iVar.L(null, xVar);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
    }

    @Override // w64.l
    public android.view.View b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
        return this.f251317c;
    }
}
