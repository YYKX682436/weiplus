package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class me implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d f251447d;

    public me(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d abstractActivityC18013x6b7f831d) {
        this.f251447d = abstractActivityC18013x6b7f831d;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d abstractActivityC18013x6b7f831d = this.f251447d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = abstractActivityC18013x6b7f831d.f248343o;
        if (c18064xe6e1a3b3 == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$3");
            return false;
        }
        r45.jj4 mo70574x2d3ab571 = c18064xe6e1a3b3.mo70574x2d3ab571();
        if (mo70574x2d3ab571 != null && mo70574x2d3ab571.f459389e == 2) {
            abstractActivityC18013x6b7f831d.n7(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(abstractActivityC18013x6b7f831d.f248343o.mo70574x2d3ab571()), true);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI$3");
        return false;
    }
}
