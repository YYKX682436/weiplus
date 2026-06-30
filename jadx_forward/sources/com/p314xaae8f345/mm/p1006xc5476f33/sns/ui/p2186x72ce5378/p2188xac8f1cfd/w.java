package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class w implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f250572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f250573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd f250574c;

    public w(long j17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18209x4de00ecd c18209x4de00ecd) {
        this.f250572a = j17;
        this.f250573b = str;
        this.f250574c = c18209x4de00ecd;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fail", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$handleFeedReport$1");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("k_expose_msg_id", this.f250572a);
        intent.putExtra("k_username", this.f250573b);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.p314xaae8f345.mm.ui.n2.f290931a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(this.f250574c.m80379x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fail", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$handleFeedReport$1");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$handleFeedReport$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.EventUIC", "OpenLiteApp success");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC$handleFeedReport$1");
    }
}
