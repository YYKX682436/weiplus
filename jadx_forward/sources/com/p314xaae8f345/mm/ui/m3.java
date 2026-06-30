package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.h3 f290622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f290623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f290624f;

    public m3(db5.h3 h3Var, android.content.Context context, java.lang.Runnable runnable) {
        this.f290622d = h3Var;
        this.f290623e = context;
        this.f290624f = runnable;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/DismissConversationHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f290622d.B();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CONVERSATION_DISMISS_INTRO_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.ui.o3.a(this.f290623e, this.f290624f);
        yj0.a.h(this, "com/tencent/mm/ui/DismissConversationHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
