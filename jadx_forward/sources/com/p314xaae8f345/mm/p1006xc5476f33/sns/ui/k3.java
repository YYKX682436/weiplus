package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3 f251140d;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3 o3Var) {
        this.f251140d = o3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3 o3Var = this.f251140d;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3.d(o3Var) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.d0) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o3.d(o3Var);
            d0Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17938x24b60f25 activityC17938x24b60f25 = d0Var.f249682a;
            r45.jj4 mo70574x2d3ab571 = activityC17938x24b60f25.f248343o.mo70574x2d3ab571();
            if (mo70574x2d3ab571 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
            } else {
                m21.w.d(723);
                if (com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), mo70574x2d3ab571.f459388d) + ca4.z0.J(mo70574x2d3ab571))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Nj().p(mo70574x2d3ab571);
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClass(activityC17938x24b60f25, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17994x10b0558a.class);
                    intent.setFlags(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.f58223x264a8965);
                    intent.addFlags(67108864);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC17938x24b60f25 activityC17938x24b60f252 = d0Var.f249682a;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(activityC17938x24b60f252, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$3", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC17938x24b60f252.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(activityC17938x24b60f252, "com/tencent/mm/plugin/sns/ui/ArtistBrowseUI$3", "onSetBgFinish", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC17938x24b60f25.finish();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSetBgFinish", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$3");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/GalleryFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.GalleryFooter$4");
    }
}
