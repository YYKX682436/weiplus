package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes8.dex */
public class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f223213d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b f223214e;

    /* renamed from: f, reason: collision with root package name */
    public int f223215f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f223216g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f223217h;

    public n6(android.content.Context context) {
        this.f223213d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameTMAssistClickListener", "No GameAppInfo");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f223214e = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) view.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTMAssistClickListener", "Clicked appid = " + this.f223214e.f67370x28d45f97);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f223214e.f67370x28d45f97;
        ((kt.c) i0Var).getClass();
        android.content.Context context = this.f223213d;
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(context, str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = this.f223214e;
            java.lang.String str2 = bVar.f67370x28d45f97;
            java.lang.String str3 = bVar.f67386xa1e9e82c;
            java.lang.String str4 = bVar.f67384x996f3ea;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(this.f223213d, bVar.f221745o2, bVar.f221746p2, bVar.f221747q2, 3, str2, this.f223215f, this.f223216g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.f.j(context, this.f223214e.f67370x28d45f97);
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z3 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z3.a();
        java.lang.String str5 = this.f223214e.V;
        a17.getClass();
        int i17 = -1;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
        } else {
            try {
                com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 mo105023xc45041ae = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z3.a().b().mo105023xc45041ae(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.y3(null).a(str5));
                if (mo105023xc45041ae != null) {
                    i17 = mo105023xc45041ae.f56062xbec81024;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus failed : %s", e17.getMessage());
            }
        }
        this.f223217h = i17;
        java.lang.String str6 = this.f223214e.V;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
            str6 = str6.replace("ANDROIDWX.GAMECENTER", "ANDROIDWX.YYB.GAMECENTER");
        }
        if (this.f223214e.f221737g2 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z3.a().getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "queryQQDownloadTaskStatus, params is null or nil");
            } else {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z3.a().b().mo105028x597fd7f8(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.y3(null).a(str6), "1");
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "startToAuthorized fail, ex = %s", e18.getMessage());
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z3.a().getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, params is null or nil");
            } else if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QQDownloaderSDKWrapper", "add download task failed, context is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QQDownloaderSDKWrapper", "add download task to qqdownloader:[%s]", str6);
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.z3.a().b().mo105041x6ef71d08(context, new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.y3(null).a(str6), true, true);
                } catch (java.lang.Exception e19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QQDownloaderSDKWrapper", e19, "", new java.lang.Object[0]);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar2 = this.f223214e;
        int i18 = bVar2.f221737g2 == 3 ? 10 : 5;
        if (this.f223217h == 4) {
            i18 = 8;
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.g(this.f223213d, bVar2.f221745o2, bVar2.f221746p2, bVar2.f221747q2, i18, bVar2.f67370x28d45f97, this.f223215f, bVar2.f221743m2, this.f223216g);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameTMAssistClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
