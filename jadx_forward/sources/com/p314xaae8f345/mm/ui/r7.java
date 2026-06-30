package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public final class r7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f291133d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21410x67d80e90 f291134e;

    public r7(android.content.Context context, com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90) {
        this.f291133d = context;
        this.f291134e = c21410x67d80e90;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/HomeUISearchEntranceHelper$provideTopBarEntranceView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.t7 t7Var = com.p314xaae8f345.mm.ui.t7.f291414a;
        com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = this.f291134e;
        int i17 = c21410x67d80e90 != null ? c21410x67d80e90.f278458e : 0;
        if (i17 == 0) {
            if ((c21410x67d80e90 != null ? c21410x67d80e90.g() : null) instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) {
                com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 g17 = c21410x67d80e90.g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.ui.conversation.MainUI");
            }
        }
        u50.v vVar = (u50.v) i95.n0.c(u50.v.class);
        android.content.Context context = this.f291133d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((s50.g0) vVar).Bi((android.app.Activity) context, i17);
        yj0.a.h(this, "com/tencent/mm/ui/HomeUISearchEntranceHelper$provideTopBarEntranceView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
