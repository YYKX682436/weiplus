package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271962d;

    public j2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271962d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        sb5.i0 i0Var;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gp gpVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        u35.b.f505963b = 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271962d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = c19666xfd6e2f33.f271488a3;
        if (y4Var != null && y4Var.a() != null && (i0Var = (sb5.i0) c19666xfd6e2f33.f271488a3.a().f542241c.a(sb5.i0.class)) != null && (gpVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) i0Var).f281838z) != null) {
            gpVar.c();
        }
        if (c19666xfd6e2f33.V1 == 1) {
            c19666xfd6e2f33.m75502x764d6925(2);
        } else {
            c19666xfd6e2f33.m75502x764d6925(1);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 k5Var = c19666xfd6e2f33.f271623x0;
            if (k5Var != null) {
                k5Var.l(true);
                c19666xfd6e2f33.f271623x0.i(null, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
