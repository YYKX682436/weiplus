package a94;

/* loaded from: classes4.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f83992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c f83993f;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c c17811x4de2598c, java.lang.String str, java.lang.String str2) {
        this.f83993f = c17811x4de2598c;
        this.f83991d = str;
        this.f83992e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f83991d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c c17811x4de2598c = this.f83993f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$2");
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c.b(c17811x4de2598c)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c.a(c17811x4de2598c).m82581x764e93a7("assets://sns/sns_ad_shake_landing_page_anim_low.pag");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "initPagAnimViewData, force use local low file");
            } else {
                java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.b(str, this.f83992e);
                if (android.text.TextUtils.isEmpty(b17)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69836xe799858a(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c.a(c17811x4de2598c).m82581x764e93a7("assets://sns/sns_ad_shake_landing_page_anim_low.pag");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "initPagAnimViewData, use local file");
                } else {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c.a(c17811x4de2598c).getUseRfx()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c.a(c17811x4de2598c).mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77392x243906(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.e(b17)));
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c.a(c17811x4de2598c).mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312.m154717x243906(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.l0.e(b17)));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShakeCardAnimView", "initPagAnimViewData, use sever file");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c.a(c17811x4de2598c).m82584xebcf33cb(3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17811x4de2598c.a(c17811x4de2598c).m82583xcde73672(1);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShakeCardAnimView", "initPagAnimViewData , exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCardAnimView$2");
    }
}
