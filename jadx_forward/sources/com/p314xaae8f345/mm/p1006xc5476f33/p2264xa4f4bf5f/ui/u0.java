package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 f255869d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 h1Var) {
        this.f255869d = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$addStatusListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        if (bi4.v1.g()) {
            gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TEXT_STATUS_NEW_TIPS_SHOW_BOOLEAN, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 h1Var = this.f255869d;
        android.widget.ImageView imageView = h1Var.f255474x;
        if (imageView != null && imageView.getVisibility() == 0) {
            z17 = true;
        }
        qj4.s sVar = qj4.s.f445491a;
        if (z17) {
            java.lang.String str = h1Var.U;
            if (str != null) {
                qj4.s.l(sVar, 32L, str, null, 0L, null, 0L, 60, null);
                bk4.i.a().T(str);
            }
            bk4.i.a().S(c01.id.a() / 1000);
        } else {
            qj4.s.l(sVar, 32L, "", null, 0L, null, 0L, 60, null);
        }
        new android.os.Bundle();
        bi4.d1 d1Var = new bi4.d1();
        d1Var.f436474h = h1Var.Y;
        d1Var.f436475i = h1Var.f255480z == null ? 3L : 4L;
        d1Var.f436489z = bk4.i.a().H();
        bi4.o1.f102608a.a(h1Var.f255459i, d1Var, null);
        qj4.s.l(sVar, 16L, null, null, 0L, null, 0L, 62, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$addStatusListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
