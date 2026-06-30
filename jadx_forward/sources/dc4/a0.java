package dc4;

/* loaded from: classes.dex */
public class a0 implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dc4.d0 f310249a;

    public a0(dc4.d0 d0Var) {
        this.f310249a = d0Var;
    }

    @Override // za4.e0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloadError", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
    }

    @Override // za4.e0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onStartDownload", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.graphics.Bitmap J2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null)) != null) {
            dc4.d0 d0Var = this.f310249a;
            android.view.View view = d0Var.A;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$5", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem$5", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = (android.widget.ImageView) d0Var.A.findViewById(com.p314xaae8f345.mm.R.id.n1w);
            imageView.setImageBitmap(J2);
            imageView.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDownloaded", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem$5");
    }
}
