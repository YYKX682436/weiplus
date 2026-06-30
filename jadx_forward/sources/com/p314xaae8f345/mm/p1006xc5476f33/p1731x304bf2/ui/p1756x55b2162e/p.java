package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C15999x9db057c5 f222836d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C15999x9db057c5 c15999x9db057c5) {
        this.f222836d = c15999x9db057c5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.C15999x9db057c5 c15999x9db057c5 = this.f222836d;
        android.content.Intent intent = new android.content.Intent(c15999x9db057c5.getContext(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.ActivityC16045xfe36c025.class);
        android.content.Context context = c15999x9db057c5.getContext();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/chat_tab/ChatTabTopArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
