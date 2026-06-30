package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class j3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f251010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3 f251011e;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3 o3Var, android.content.Context context) {
        this.f251011e = o3Var;
        this.f251010d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3 o3Var = this.f251011e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3.c(o3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$3");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11989, 3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3.c(o3Var).f68891x29d1292e == 0 ? "" : ca4.z0.t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3.c(o3Var).f68891x29d1292e), 0);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3.c(o3Var).f38324x142bbdc6;
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f251010d;
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.class);
        intent.putExtra("INTENT_TALKER", com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3.c(o3Var).m70374x6bf53a6c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        boolean z17 = o3Var.f251619q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.GalleryFooter");
        intent.putExtra("INTENT_STAR_LIST", z17);
        intent.putExtra("INTENT_SNS_LOCAL_ID", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", i17));
        intent.putExtra("INTENT_FROMGALLERY", true);
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).startActivityForResult(intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.Q().f141984k = 1L;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$3");
    }
}
