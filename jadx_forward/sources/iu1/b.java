package iu1;

/* loaded from: classes4.dex */
public final class b extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76, int i17, int i18, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a0 listener) {
        super(i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f38844xad90eeef = listener;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a0 a0Var = this.f38844xad90eeef;
        if (a0Var != null) {
            a0Var.a(widget, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
