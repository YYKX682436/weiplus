package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class f0 implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g0 f249818a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g0 g0Var) {
        this.f249818a = g0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.c2
    public void a(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1$2");
        boolean f17 = ca4.z0.f(bitmap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g0 g0Var = this.f249818a;
        if (f17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.c(g0Var.f249927e, bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4 c17939xe65f30d4 = g0Var.f249927e;
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
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistHeader$1$2", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/ArtistHeader$1$2", "onImgDecodeFin", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1 hj6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            r45.jj4 jj4Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17939xe65f30d4.b(g0Var.f249927e).f473378h.f451412d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            android.widget.ImageView imageView = g0Var.f249927e.f247730g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.ArtistHeader");
            hj6.e0(jj4Var, imageView, g0Var.f249926d.hashCode(), com.p314xaae8f345.mm.p2621x8fb0427b.s7.f276840k);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.ArtistHeader$1$2");
    }
}
