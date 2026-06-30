package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2 f249929d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2 h2Var) {
        this.f249929d = h2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/ExceprtWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2 h2Var = this.f249929d;
        java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.h2.o(h2Var);
        if (o17 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            throw null;
        }
        arrayList2.add(o17);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(h2Var.f251490c, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18130x2cb2ef37.class);
        intent.putExtra("sns_gallery_position", 0);
        intent.putExtra("sns_gallery_temp_paths", arrayList2);
        intent.putExtra("key_from_scene", 7);
        intent.putExtra("k_need_delete", h2Var.f251490c.getIntent().getBooleanExtra("k_need_delete", true));
        h2Var.f251490c.startActivityForResult(intent, 7);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/ExceprtWidget$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.ExceprtWidget$initView$2");
    }
}
