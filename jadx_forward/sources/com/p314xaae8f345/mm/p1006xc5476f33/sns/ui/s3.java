package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class s3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 f251974d;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 p3Var) {
        this.f251974d = p3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 p3Var = this.f251974d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.d(p3Var) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.d(p3Var).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11989, 3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f68891x29d1292e == 0 ? "" : ca4.z0.t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f68891x29d1292e), 0);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f38324x142bbdc6;
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        android.content.Context context = p3Var.f251672e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
        intent.putExtra("INTENT_TALKER", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).m70374x6bf53a6c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        boolean z17 = p3Var.f251682r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.putExtra("INTENT_STAR_LIST", z17);
        intent.putExtra("INTENT_SNS_LOCAL_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", i17));
        intent.putExtra("INTENT_FROMGALLERY", true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        java.lang.String str = p3Var.f251683s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        int i18 = p3Var.f251685u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.putExtra("INTENT_ALBUM_SCENE", i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        android.content.Context context2 = p3Var.f251672e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).startActivityForResult(intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.Q().f141984k = 1L;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$2");
    }
}
