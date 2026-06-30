package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class s2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t2 f251973d;

    public s2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t2 t2Var) {
        this.f251973d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$initView$1$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/FinderPicWidget$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t2 t2Var = this.f251973d;
        intent.setClass(t2Var.f251490c, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18130x2cb2ef37.class);
        intent.putExtra("k_need_delete", false);
        intent.putExtra("sns_gallery_position", 0);
        intent.putExtra("key_from_scene", 7);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMediaPath$p", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        java.lang.String str = t2Var.L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMediaPath$p", "com.tencent.mm.plugin.sns.ui.FinderPicWidget");
        arrayList2.add(str);
        intent.putExtra("sns_gallery_temp_paths", arrayList2);
        t2Var.f251490c.startActivityForResult(intent, 7);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/FinderPicWidget$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.FinderPicWidget$initView$1$1");
    }
}
