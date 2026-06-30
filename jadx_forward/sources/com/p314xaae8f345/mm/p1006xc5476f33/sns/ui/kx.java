package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class kx implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f251227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f251228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 f251229c;

    public kx(android.content.Context context, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var) {
        this.f251227a = context;
        this.f251228b = z17;
        this.f251229c = i2Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$32");
        boolean z17 = this.f251228b;
        android.content.Context context = this.f251227a;
        if (z17) {
            android.view.View view = new android.view.View(context);
            view.setTag(this.f251229c);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.D.onClick(view);
        } else {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.ggb, 0).show();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$32");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$32");
        db5.t7.m123882x26a183b(this.f251227a, com.p314xaae8f345.mm.R.C30867xcad56011.ggd, 0).show();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$32");
    }
}
