package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class h0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i0 f250006a;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i0 i0Var) {
        this.f250006a = i0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2
    public void a(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2$1");
        if (ca4.z0.f(bitmap)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.i0 i0Var = this.f250006a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.c(i0Var.f250080d, bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4 = i0Var.f250080d;
            android.widget.ProgressBar progressBar = c17939xe65f30d4.f247731h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            progressBar.setVisibility(4);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            android.view.View view = c17939xe65f30d4.f247732i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistHeader$2$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/ArtistHeader$2$1", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$2$1");
    }
}
