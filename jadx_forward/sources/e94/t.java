package e94;

/* loaded from: classes4.dex */
public class t implements q44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 f331922a;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb5) {
        this.f331922a = c17821xa501ffb5;
    }

    public void a(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb5 = this.f331922a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r rVar = c17821xa501ffb5.f245454i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (rVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TwistCoverView", "onDegreeChange, twistInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
            return;
        }
        boolean z17 = rVar.f247645i;
        if (z17 && f18 > 0.0f) {
            f18 = 0.0f;
        }
        float f19 = (z17 || f18 >= 0.0f) ? f18 : 0.0f;
        float abs = java.lang.Math.abs(f19 / rVar.f247644h);
        float abs2 = java.lang.Math.abs(f19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb52 = this.f331922a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        float f27 = c17821xa501ffb52.f245468z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        if (abs2 > f27) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb53 = this.f331922a;
            float abs3 = java.lang.Math.abs(f19);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$502", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
            c17821xa501ffb53.f245468z = abs3;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$502", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17821xa501ffb5 c17821xa501ffb54 = this.f331922a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        android.os.Handler handler = c17821xa501ffb54.f245467y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView");
        android.os.Message obtain = android.os.Message.obtain(handler, 2);
        obtain.arg1 = (int) (abs * 1000.0f);
        obtain.sendToTarget();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDegreeChange", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistCoverView$3");
    }
}
