package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f252264d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 f252265e;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 p3Var, android.content.Context context) {
        this.f252265e = p3Var;
        this.f252264d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3 p3Var = this.f252265e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f38324x142bbdc6;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_comment_localId", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        int i18 = p3Var.f251678n;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew");
        intent.putExtra("sns_source", i18);
        intent.setClass(this.f252264d, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb.class);
        java.lang.String t07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f68891x29d1292e == 0 ? "" : ca4.z0.t0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var).f68891x29d1292e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryFooterNew", "comment cmd id:%s", t07);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11989, 2, t07, 0);
        android.content.Context context = this.f252264d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k7.f245900a.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p3.c(p3Var), 3);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$6");
    }
}
