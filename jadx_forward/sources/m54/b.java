package m54;

/* loaded from: classes4.dex */
public final class b implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f405777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f405778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f405779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405780d;

    public b(yz5.l lVar, android.os.Bundle bundle, android.content.Context context, java.lang.String str) {
        this.f405777a = lVar;
        this.f405778b = bundle;
        this.f405779c = context;
        this.f405780d = str;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fail", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageReally$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LandPageLauncher", "start lite app failed!!!");
        android.os.Bundle bundle = this.f405778b;
        android.content.Context context = this.f405779c;
        java.lang.String str = this.f405780d;
        try {
            m54.j0.f405820a.b(bundle);
            m54.c0.f405783a.b(context, str, bundle);
            yz5.l lVar = this.f405777a;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("launchDynamicPageReally_fail", th6);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fail", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageReally$1");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageReally$1");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.LandPageLauncher", "start lite app success");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 1);
        yz5.l lVar = this.f405777a;
        if (lVar != null) {
            try {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            } catch (java.lang.Throwable th6) {
                ca4.q.c("launchDynamicPageReally", th6);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(ya.b.f77504xbb80cbe3, "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.DynamicCanvasPageLauncher$launchDynamicPageReally$1");
    }
}
