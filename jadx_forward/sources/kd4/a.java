package kd4;

/* loaded from: classes4.dex */
public final class a implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040 f388408a;

    public a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040 c6071x2b665040) {
        this.f388408a = c6071x2b665040;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fail", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1$callback$1");
        android.content.Intent intent = new android.content.Intent();
        am.dw dwVar = this.f388408a.f136354g;
        long j17 = dwVar.f88037b;
        java.lang.String str = dwVar.f88036a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineItemClickEventCenter", "expose id " + j17 + ' ' + str);
        intent.putExtra("k_expose_msg_id", j17);
        intent.putExtra("k_username", str);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.p314xaae8f345.mm.ui.n2.f290931a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{33}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        kd4.b.a();
        j45.l.j(null, "webview", ".ui.tools.WebViewUI", intent, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fail", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1$callback$1");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1$callback$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineItemClickEventCenter", "OpenLiteApp success");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter$reportJumperListener$1$callback$1");
    }
}
