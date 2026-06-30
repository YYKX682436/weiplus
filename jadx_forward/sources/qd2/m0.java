package qd2;

/* loaded from: classes.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f443330d;

    public m0(qd2.g1 g1Var) {
        this.f443330d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd2.g1 g1Var = this.f443330d;
        g1Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderOriginalDeclareHelpUrl");
        if (d17 == null) {
            d17 = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/Vc24Lkjri1oIRvRM#1-6-%E5%8E%9F%E5%88%9B%E4%BF%9D%E6%8A%A4";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderConfig", "FINDER_ORIGINAL_DECLARE_HELP_URL info = ".concat(d17));
        intent.putExtra("rawUrl", d17);
        j45.l.j(g1Var.f443280a, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
