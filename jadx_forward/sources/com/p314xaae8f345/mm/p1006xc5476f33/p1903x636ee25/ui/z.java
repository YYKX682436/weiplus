package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes10.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 f232389d;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872) {
        this.f232389d = activityC16633xa26a1872;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/MusicMainUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872.I;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872 = this.f232389d;
        activityC16633xa26a1872.getClass();
        b21.r j17 = kl3.t.g().j();
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicMainUI", "doJumpToApp wrapper is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "doJumpToApp MusicType:%d, SongWebUrl:%s, AppId:%s, srcUsername:%s", java.lang.Integer.valueOf(j17.f98878d), j17.f98887p, j17.f98891t, j17.I);
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = j17.f98891t;
            ((kt.c) i0Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
            if (h17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "packageName:%s", h17.f67386xa1e9e82c);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicMainUI", "appInfo is null");
            }
            activityC16633xa26a1872.f232251w = true;
            if (j17.f98878d == 11) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5446xcf24c050 c5446xcf24c050 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5446xcf24c050();
                c5446xcf24c050.e();
                am.ja jaVar = c5446xcf24c050.f135786g;
                java.lang.String str2 = jaVar.f88551a;
                java.lang.String str3 = jaVar.f88553c;
                java.lang.String str4 = jaVar.f88552b;
                int i18 = jaVar.f88554d;
                if (android.text.TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "from app brand, appId:%s, brandName:%s, pkgType:%d, appUserName:%s", str2, str3, java.lang.Integer.valueOf(i18), str4);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "launch app brand Application");
                ll3.j2.g(str2, str4, i18);
            } else if (android.text.TextUtils.isEmpty(j17.f98891t) || !j17.f98891t.equals("wx485a97c844086dc9")) {
                if (!android.text.TextUtils.isEmpty(j17.f98891t) && h17 != null && !android.text.TextUtils.isEmpty(h17.f67386xa1e9e82c)) {
                    lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str5 = j17.f98891t;
                    ((kt.c) i0Var2).getClass();
                    if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(activityC16633xa26a1872, str5)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "launch third party app, package name:%s", h17.f67386xa1e9e82c);
                        android.content.Intent launchIntentForPackage = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getPackageManager().getLaunchIntentForPackage(h17.f67386xa1e9e82c);
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.addFlags(268435456);
                            lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                            java.lang.String str6 = h17.f67372x453d1e07;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.w(activityC16633xa26a1872);
                            ((kt.c) i0Var3).getClass();
                            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.v(activityC16633xa26a1872, launchIntentForPackage, str6, wVar, null);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicMainUI", "launchApp fail intent is null");
                        }
                    }
                }
                if (android.text.TextUtils.isEmpty(j17.I)) {
                    java.lang.String str7 = j17.f98887p;
                    if (str7 == null) {
                        str7 = j17.f98885n;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "launch H5 url:%s", str7);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str7);
                    j45.l.j(activityC16633xa26a1872, "webview", ".ui.tools.WebViewUI", intent, null);
                } else {
                    java.lang.String str8 = j17.f98887p;
                    if (str8 == null) {
                        str8 = j17.f98885n;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "launch biz H5 url:%s", str8);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", str8);
                    j45.l.j(activityC16633xa26a1872, "webview", ".ui.tools.WebViewUI", intent2, null);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "launch qq music Application");
                activityC16633xa26a1872.T6(256, j17, ll3.j2.b(j17, activityC16633xa26a1872));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicMainUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
