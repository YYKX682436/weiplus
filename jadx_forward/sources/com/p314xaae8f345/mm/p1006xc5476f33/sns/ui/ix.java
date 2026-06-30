package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes.dex */
public class ix implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f250987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f250988b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f250989c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 f250990d;

    public ix(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean z17, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i2 i2Var) {
        this.f250987a = u3Var;
        this.f250988b = z17;
        this.f250989c = context;
        this.f250990d = i2Var;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$30");
        boolean z17 = this.f250988b;
        android.content.Context context = this.f250989c;
        if (z17) {
            android.view.View view = new android.view.View(context);
            view.setTag(this.f250990d);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kw.D.onClick(view);
        } else {
            db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.ggb, 0).show();
        }
        this.f250987a.cancel();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fail", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$30");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$30");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 33L, 1L);
        this.f250987a.cancel();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$30");
    }
}
