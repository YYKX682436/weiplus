package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt1.h f176667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt1.k f176668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3 f176669f;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3 s3Var, xt1.h hVar, xt1.k kVar) {
        this.f176669f = s3Var;
        this.f176667d = hVar;
        this.f176668e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        xt1.h hVar = this.f176667d;
        int i17 = hVar.f538018e;
        xt1.k kVar = this.f176668e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.s3 s3Var = this.f176669f;
        if (i17 == 0) {
            intent.setClass(s3Var.f176692q.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13047x63b575f5.class);
            intent.putExtra("key_card_id", hVar.f538016c);
            intent.putExtra("key_card_ext", hVar.f538017d);
            intent.putExtra("key_from_scene", 17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a6365 = s3Var.f176692q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC13057x768a6365, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC13057x768a6365.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC13057x768a6365, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i17 == 1) {
            intent.setClass(s3Var.f176692q.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1312xa1bac36f.ui.ActivityC13041xc416088b.class);
            intent.putExtra("key_card_id", kVar.f68121x95970a65);
            intent.putExtra("key_from_scene", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13057x768a6365 activityC13057x768a63652 = s3Var.f176692q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(activityC13057x768a63652, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC13057x768a63652.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(activityC13057x768a63652, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11941, 8, kVar.f68121x95970a65, kVar.f68122xf4648834, kVar.f68130x6583d7e, hVar.f538016c);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
