package z64;

/* loaded from: classes4.dex */
public class d implements y64.b {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 f551987a;

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0076. Please report as an issue. */
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9;
        int i18;
        boolean z17;
        x64.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17703x743924d4 c17703x743924d4;
        s34.p0 p0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        if (view == null || c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "view or snsInfo or adXml is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 m70347x10413e67 = c17933xe8d1b226.m70347x10413e67(i17);
        if (m70347x10413e67 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "adInfo is null and source is " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e92 = m70354x74235b3e.f38249x8bd81309;
        this.f551987a = c17702x544f64e92;
        if (c17702x544f64e92 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "mHeadAdClickActionInfo is null and source is " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return false;
        }
        com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = dVar != null ? (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("ext_sns_ad_click", null) : null;
        android.content.Context context = view.getContext();
        try {
            c17702x544f64e9 = this.f551987a;
            i18 = c17702x544f64e9.f244104b;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "doAction exp=" + android.util.Log.getStackTraceString(th6));
        }
        if (i18 != 22) {
            if (i18 != 27) {
                switch (i18) {
                    case 17:
                        boolean a17 = n74.u.a(c17702x544f64e9, m70347x10413e67);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                        return a17;
                    case 18:
                        z17 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
                        uVar = x64.u.f533866a;
                        if (z17 || (c17703x743924d4 = this.f551987a.A0) == null || !c17703x743924d4.d()) {
                            uVar.c(this.f551987a, c17933xe8d1b226, context);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                            return true;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e93 = this.f551987a;
                        if (c17702x544f64e93.f244108d == 0) {
                            uVar.a(view, c17702x544f64e93, context, c17933xe8d1b226, 0, i17, c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc, 23);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                            return true;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "click avatar, kefu do not jump half screen");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                        return false;
                    case 19:
                        if (context != null) {
                            a84.u0.a(c11137xb05b06ad, 39);
                            boolean a18 = n74.v.a(context, this.f551987a, i17, c11137xb05b06ad);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                            return a18;
                        }
                        break;
                    default:
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                        return false;
                }
            }
            if (context != null && (p0Var = c17702x544f64e9.f244153z0) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                if (!p0Var.f484265a.isEmpty()) {
                    boolean a19 = n74.x.a(context, this.f551987a.f244153z0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                    return a19;
                }
            }
        }
        java.lang.String str = c17933xe8d1b226.m70347x10413e67(i17).f38104xce64ddf1;
        java.lang.String m70355xb5882a06 = c17933xe8d1b226.m70355xb5882a06();
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e94 = this.f551987a;
        s34.p1 p1Var = c17702x544f64e94.f244145v0;
        if (p1Var == null || !(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "click avatar, qrClickActionInfo is null or context is not MMActivity");
        } else {
            if (c17702x544f64e94.f244108d == 0) {
                l44.p3.d(p1Var, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, str, m70355xb5882a06, t07, i17, m70354x74235b3e.f38172xd73c98cc);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "click avatar, do not jump half screen");
        }
        z17 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        uVar = x64.u.f533866a;
        if (z17) {
        }
        uVar.c(this.f551987a, c17933xe8d1b226, context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        return true;
    }

    @Override // y64.b
    public void b(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, v64.d dVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        if (view == null || c17933xe8d1b226 == null || c17933xe8d1b226.m70354x74235b3e() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "afterAction, view or snsInfo or adXml is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return;
        }
        if (c17933xe8d1b226.m70347x10413e67(i17) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "afterAction, adInfo is null and source is " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17702x544f64e9 = c17933xe8d1b226.m70354x74235b3e().f38249x8bd81309;
        this.f551987a = c17702x544f64e9;
        if (c17702x544f64e9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "afterAction, mHeadAdClickActionInfo is null and source is " + i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return;
        }
        if (dVar != null) {
            try {
                com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = (com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad) dVar.a("ext_sns_ad_click", null);
                if (c11137xb05b06ad != null) {
                    int i18 = this.f551987a.f244104b;
                    if (i18 == 22) {
                        a84.u0.a(c11137xb05b06ad, 54);
                        ca4.z0.x0(c11137xb05b06ad);
                    } else if (i18 != 27) {
                        switch (i18) {
                            case 17:
                                a84.u0.a(c11137xb05b06ad, 51);
                                ca4.z0.x0(c11137xb05b06ad);
                                break;
                            case 18:
                                a84.u0.a(c11137xb05b06ad, 64);
                                ca4.z0.x0(c11137xb05b06ad);
                                break;
                            case 19:
                                a84.u0.a(c11137xb05b06ad, 39);
                                ca4.z0.x0(c11137xb05b06ad);
                                break;
                        }
                    } else {
                        a84.u0.a(c11137xb05b06ad, 65);
                        ca4.z0.x0(c11137xb05b06ad);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.AdGeneralAvatarAction", "afterAction exp=" + android.util.Log.getStackTraceString(th6));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
    }
}
