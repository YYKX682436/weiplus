package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes4.dex */
public final class v extends com.tencent.mm.pluginsdk.ui.span.z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.card.ui.v3.CouponCardListUI couponCardListUI, int i17, int i18, com.tencent.mm.pluginsdk.ui.span.a0 listener) {
        super(i17, i18);
        kotlin.jvm.internal.o.g(listener, "listener");
        this.mClickListener = listener;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CardSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.pluginsdk.ui.span.a0 a0Var = this.mClickListener;
        if (a0Var != null) {
            a0Var.a(widget, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v3/CouponCardListUI$CardSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
