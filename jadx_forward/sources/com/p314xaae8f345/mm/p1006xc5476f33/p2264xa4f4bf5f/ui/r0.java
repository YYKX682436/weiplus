package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 f255767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255768e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 h1Var, android.content.Context context) {
        this.f255767d = h1Var;
        this.f255768e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 h1Var = this.f255767d;
        ((cj4.a0) h1Var.T).e0(this.f255768e);
        qj4.s sVar = qj4.s.f445491a;
        int i17 = 1;
        java.lang.String valueOf = java.lang.String.valueOf(si4.a.g(ai4.m0.f86706a.G(), null, 1, null));
        int i18 = h1Var.f255479y1.f102624a;
        if (i18 == 1) {
            i17 = 2;
        } else if (i18 == 2) {
            i17 = 3;
        }
        qj4.s.l(sVar, 21L, valueOf, null, i17, null, 0L, 52, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
