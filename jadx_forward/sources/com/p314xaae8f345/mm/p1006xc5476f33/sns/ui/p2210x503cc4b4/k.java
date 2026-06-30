package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class k implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f251362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.l f251363b;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f251363b = lVar;
        this.f251362a = c17933xe8d1b226;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fail", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f251362a;
        intent.putExtra("k_expose_msg_id", c17933xe8d1b226 == null ? 0L : c17933xe8d1b226.f68891x29d1292e);
        intent.putExtra("k_username", c17933xe8d1b226 == null ? "" : c17933xe8d1b226.f68896xdde069b);
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.n2.f290931a, 33));
        j45.l.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(this.f251363b.f251368g.f251370d), "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fail", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "OpenLiteApp success");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$2$1");
    }
}
