package t34;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final t34.f f496964a = new t34.f(null);

    public t34.g a(s34.x xVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("animationInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f496964a.f496959e = xVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("animationInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g b(w64.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f496964a.f496960f = lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("cardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickActionInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f496964a.f496958d = c17702x544f64e9;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickActionInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g d(i64.b1 b1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("snsAdStatistic", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f496964a.f496957c = b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsAdStatistic", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("snsInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f496964a.f496956b = c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsInfo", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public t34.g f(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(ya.b.f77502x92235c1b, "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        this.f496964a.f496955a = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(ya.b.f77502x92235c1b, "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        return this;
    }

    public void g(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnim", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
        t34.f fVar = this.f496964a;
        fVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValid", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$AnimEnv");
        boolean z17 = (fVar.f496956b == null || fVar.f496957c == null || fVar.f496958d == null) ? false : true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$AnimEnv");
        if (!z17 || activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAdAnimProxyUI", "startAnimProxyUI, param error");
            t34.f fVar2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396.f244161m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396.f244161m = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396.T6(35);
        } else {
            if ((activity.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0) {
                fVar.f496961g = false;
            } else {
                fVar.f496961g = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAdAnimProxyUI", "startAnim, source=" + fVar.f496955a + ", isDarkStatusBar=" + fVar.f496961g);
            t34.f fVar3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396.f244161m;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$402", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396.f244161m = fVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$402", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396.class);
            intent.putExtra("params_anim_env_hashcode", fVar.hashCode());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/animproxy/SnsAdAnimProxyUI$Builder", "startAnim", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/sns/ad/animproxy/SnsAdAnimProxyUI$Builder", "startAnim", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2089x437daafd.ActivityC17704xe73e9396.T6(1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.animproxy.SnsAdAnimProxyUI$Builder");
    }
}
