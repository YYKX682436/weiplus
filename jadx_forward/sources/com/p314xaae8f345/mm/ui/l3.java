package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class l3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.h3 f290595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f290596e;

    public l3(db5.h3 h3Var, java.lang.Runnable runnable) {
        this.f290595d = h3Var;
        this.f290596e = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/DeleteConversationHelper$doDelete$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f290595d.B();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CONVERSATION_DELETE_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        this.f290596e.run();
        yj0.a.h(this, "com/tencent/mm/ui/DeleteConversationHelper$doDelete$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
