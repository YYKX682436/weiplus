package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13;

/* loaded from: classes4.dex */
public class o0 implements jb4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 f250930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250931c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0 f250932d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.q0 q0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 p0Var, java.lang.String str2) {
        this.f250932d = q0Var;
        this.f250929a = str;
        this.f250930b = p0Var;
        this.f250931c = str2;
    }

    @Override // jb4.u
    public void a(boolean z17, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
        if (str2 == null || !str2.equals(this.f250929a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.p0 p0Var = this.f250930b;
        if (bitmap != null) {
            p0Var.M0.setImageBitmap(bitmap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "show progressView");
            p0Var.N0.setVisibility(0);
            p0Var.N0.a();
            java.lang.String str3 = this.f250931c;
            if (android.text.TextUtils.isEmpty(str3)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "thumbUrl is empty");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "no shot and thumb cache, start download thumb image");
                za4.t0.c(str3, false, 133, 0, new ed4.w(this));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinish", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
    }

    @Override // jb4.u
    public void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStart", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$4");
    }
}
