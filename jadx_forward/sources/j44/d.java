package j44;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j44.j f379210d;

    public d(j44.j jVar) {
        this.f379210d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Integer e17;
        j44.a j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        j44.j jVar = this.f379210d;
        jVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMCurrentDownloadStatus", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        int i17 = jVar.f379239x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMCurrentDownloadStatus", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper");
        int i18 = 0;
        if (i17 == 1 && (j17 = jVar.j()) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2090x551ac888.C17706xd71a0a76) j17).l(false);
        }
        android.view.View g17 = jVar.g();
        int height = g17 != null ? g17.getHeight() : 0;
        if (height > 0) {
            jVar.t(jVar.i());
            android.view.View i19 = jVar.i();
            android.view.ViewGroup.LayoutParams layoutParams = i19 != null ? i19.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = height;
            }
            android.view.View i27 = jVar.i();
            if (i27 != null) {
                i27.setLayoutParams(layoutParams);
            }
            h44.b f17 = jVar.f();
            if (f17 != null && (e17 = f17.e()) != null) {
                i18 = e17.intValue();
            }
            a44.m.c(i18, 9, jVar.f(), null, 8, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(jVar.k(), "mApkCancelDownload delete click, but height is 0");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/service/HalfScreenDownloadHelper$initContentView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.service.HalfScreenDownloadHelper$initContentView$3");
    }
}
