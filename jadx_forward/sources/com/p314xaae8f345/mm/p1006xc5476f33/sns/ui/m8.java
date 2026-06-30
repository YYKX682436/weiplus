package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes5.dex */
public class m8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f251431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e f251432e;

    public m8(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e c17995x112dd83e, android.view.View.OnClickListener onClickListener) {
        this.f251432e = c17995x112dd83e;
        this.f251431d = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ShowCommentImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.graphics.Bitmap bitmap = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17995x112dd83e.f248160e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$002", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        this.f251432e.f248165d = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$002", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView");
        this.f251431d.onClick(view);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ShowCommentImageView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ShowCommentImageView$1");
    }
}
