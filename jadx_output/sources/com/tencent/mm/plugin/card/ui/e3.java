package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.g3 f94997d;

    public e3(com.tencent.mm.plugin.card.ui.g3 g3Var) {
        this.f94997d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardMsgEntranceController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.ui.g3 g3Var = this.f94997d;
        lu1.d.b(g3Var.f95012e, false);
        xt1.t0.Ui().d();
        g3Var.a();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11324, "CardMsgCenterView", 0, "", "", 1, 0, "", 0, "");
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardMsgEntranceController$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
