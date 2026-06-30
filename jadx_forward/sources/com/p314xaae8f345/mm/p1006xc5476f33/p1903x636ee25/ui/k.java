package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.j f232295d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.j jVar) {
        this.f232295d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.j jVar = this.f232295d;
        boolean z17 = jVar.f232289r;
        java.lang.ref.WeakReference weakReference = jVar.f484375g;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicBanner", "enterTingPlayer from MusicBanner");
            qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
            if (g9Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicBanner", "enterTingPlayer tingService is null");
            } else {
                ql4.a aVar = ql4.a.f446119a;
                b66.h hVar = b66.i.f99700d;
                b66.g gVar = (b66.g) p3380x6a61f93.p3382xf513feca.C30532x21b415b4.m169639x21b0e175();
                if (gVar != null) {
                    wl4.w.f528637a.a(((b66.i) gVar).m9897x74292566(), null).a();
                }
                jm4.i4 Zi = ((rk4.z8) g9Var).Zi();
                if (Zi != null) {
                    ((jm4.k4) Zi).d(bw5.yq0.TingReportAction_ClickWeixinHomeMusicBanner, bw5.ar0.TingScene_WeixinHomeMusicBanner, aVar.a(), null, null);
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        b21.r b17 = b21.m.b();
        if (b17 != null && b17.G && !android.text.TextUtils.isEmpty(b17.H)) {
            java.lang.String str3 = b17.H;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicBanner", "barBackToWebView is true, start to jump Url:%s", str3);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str3);
            j45.l.j((android.content.Context) weakReference.get(), "webview", ".ui.tools.WebViewUI", intent, null);
        } else {
            if (b17 == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11992, 1);
            intent2.putExtra("key_scene", 1);
            if (b17.T) {
                str = "mv";
                str2 = ".ui.MusicMvMainUI";
            } else {
                str = "music";
                str2 = ".ui.MusicMainUI";
            }
            j45.l.j((android.content.Context) weakReference.get(), str, str2, intent2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
