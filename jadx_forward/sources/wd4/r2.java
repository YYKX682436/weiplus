package wd4;

/* loaded from: classes4.dex */
public final class r2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f f526551d;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f) {
        this.f526551d = dialogC18384xa272e02f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f.M;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2219x6855d5f.DialogC18384xa272e02f dialogC18384xa272e02f = this.f526551d;
        dialogC18384xa272e02f.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        dialogC18384xa272e02f.H = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToSnsLabelUI mLocalId:");
        int i18 = dialogC18384xa272e02f.f251995s;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsGroupDialog", sb6.toString());
        gc4.k kVar = gc4.k.f351992a;
        android.content.Context context = dialogC18384xa272e02f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        kVar.a(context, i18, dialogC18384xa272e02f.f251997u);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        dialogC18384xa272e02f.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initView$1");
    }
}
