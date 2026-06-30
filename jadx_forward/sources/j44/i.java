package j44;

/* loaded from: classes4.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j44.j f379215d;

    public i(j44.j jVar) {
        this.f379215d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Integer e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j44.j jVar = this.f379215d;
        jVar.l();
        j44.a j17 = jVar.j();
        if (j17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76 c17706xd71a0a76 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76) j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteDownloadingApk", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            h44.b bVar = c17706xd71a0a76.f244174e;
            if (bVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.TAG, "deleteDownloadingApk, mDownloadParams is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteDownloadingApk", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
            } else {
                java.lang.String b17 = bVar.b();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.TAG, "deleteDownloadingApk, appId is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteDownloadingApk", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                } else {
                    android.content.Context context = c17706xd71a0a76.f244173d;
                    if (context != null) {
                        if (c17706xd71a0a76.f244186t == null) {
                            c17706xd71a0a76.f244186t = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j6s), false, true, null);
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = c17706xd71a0a76.f244186t;
                        if (u3Var != null) {
                            u3Var.show();
                        }
                    }
                    p3325xe03a0797.p3326xc267989b.y0 y0Var = c17706xd71a0a76.f244181o;
                    if (y0Var != null) {
                        p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
                    }
                    p3325xe03a0797.p3326xc267989b.y0 b18 = p3325xe03a0797.p3326xc267989b.z0.b();
                    c17706xd71a0a76.f244181o = b18;
                    ku5.f j18 = c17706xd71a0a76.j();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j18, "<get-mDownloadExecutorService>(...)");
                    p3325xe03a0797.p3326xc267989b.l.d(b18, new p3325xe03a0797.p3326xc267989b.g2(j18).mo7096x348d9a(c17706xd71a0a76.f244187u), null, new a44.p(b17, c17706xd71a0a76, null), 2, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteDownloadingApk", "com.tencent.mm.plugin.sns.ad.download.DownloadHelper");
                }
            }
        }
        ca4.d e18 = jVar.e();
        if (e18 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
            e18.f121393j = 5;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDownloadScene", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
        }
        l44.z.h(jVar.e());
        h44.b f17 = jVar.f();
        a44.m.c((f17 == null || (e17 = f17.e()) == null) ? 0 : e17.intValue(), 11, jVar.f(), null, 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$8");
    }
}
