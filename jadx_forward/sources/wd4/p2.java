package wd4;

/* loaded from: classes.dex */
public final class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f f526535d;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f) {
        this.f526535d = dialogC18384xa272e02f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initContentView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f526535d.cancel();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initContentView$1");
    }
}
