package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class q3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt1.h f95134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt1.k f95135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.s3 f95136f;

    public q3(com.tencent.mm.plugin.card.ui.s3 s3Var, xt1.h hVar, xt1.k kVar) {
        this.f95136f = s3Var;
        this.f95134d = hVar;
        this.f95135e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        xt1.h hVar = this.f95134d;
        int i17 = hVar.f456485e;
        xt1.k kVar = this.f95135e;
        com.tencent.mm.plugin.card.ui.s3 s3Var = this.f95136f;
        if (i17 == 0) {
            intent.setClass(s3Var.f95159q.getContext(), com.tencent.mm.plugin.card.ui.CardDetailUI.class);
            intent.putExtra("key_card_id", hVar.f456483c);
            intent.putExtra("key_card_ext", hVar.f456484d);
            intent.putExtra("key_from_scene", 17);
            com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = s3Var.f95159q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(cardNewMsgUI, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            cardNewMsgUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(cardNewMsgUI, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (i17 == 1) {
            intent.setClass(s3Var.f95159q.getContext(), com.tencent.mm.plugin.card.sharecard.ui.CardConsumeSuccessUI.class);
            intent.putExtra("key_card_id", kVar.field_card_id);
            intent.putExtra("key_from_scene", 2);
            com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI2 = s3Var.f95159q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(cardNewMsgUI2, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            cardNewMsgUI2.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(cardNewMsgUI2, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11941, 8, kVar.field_card_id, kVar.field_card_tp_id, kVar.field_msg_id, hVar.f456483c);
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$CardMsgAdaper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
