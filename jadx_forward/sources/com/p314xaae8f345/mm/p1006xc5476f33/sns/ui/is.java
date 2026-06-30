package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class is implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs f250779d;

    public is(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar) {
        this.f250779d = bsVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar = this.f250779d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getParent() == null || !(view.getParent() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18412x8f28cefe)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18412x8f28cefe) view.getParent()).getTag() == null || !(((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18412x8f28cefe) view.getParent()).getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1 u1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u1) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18412x8f28cefe) view.getParent()).getTag();
        if (u1Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
            return;
        }
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("sns_text_show", u1Var.f252088c);
            intent.putExtra("sns_local_id", u1Var.f252086a);
            intent.putExtra("sns_comment_buf", u1Var.f252090e.mo14344x5f01b1f6());
            intent.putExtra("sns_content_source", 2);
            intent.setClass(bsVar.f249575h, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18111x49668b66.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = bsVar.f249575h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsTimeLineBaseAdapter", e17, "commentCollapse click exception.", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$8");
    }
}
