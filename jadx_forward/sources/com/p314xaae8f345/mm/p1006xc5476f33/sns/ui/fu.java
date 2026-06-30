package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class fu implements fl5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu f249893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf f249894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fl5.i f249895c;

    public fu(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu huVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf, fl5.i iVar) {
        this.f249893a = huVar;
        this.f249894b = abstractC18397x5bc42bbf;
        this.f249895c = iVar;
    }

    @Override // fl5.h
    public final void a(int i17, int i18, android.text.Layout layout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSelectionChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu huVar = this.f249893a;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu.c(huVar), "onSelectionChanged: selStart = selEnd = 0, skip");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectionChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$2");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18397x5bc42bbf abstractC18397x5bc42bbf = this.f249894b;
        int i19 = pm0.v.r(abstractC18397x5bc42bbf).top;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu.c(huVar);
        this.f249895c.j().getScrollY();
        if (abstractC18397x5bc42bbf.getVisibility() != 0 || i19 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            huVar.f250072f = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setNeedScrollCursorOnInputPanelChange$p", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu.c(huVar);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu.b(huVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.hu.a(huVar, i17, layout, i19));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectionChanged", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$2");
    }
}
