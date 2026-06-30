package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class p7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm3.u f232893d;

    public p7(fm3.u uVar) {
        this.f232893d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC$initLocalPostStats$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Long l17 = this.f232893d.f345654a;
        if (l17 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = cu2.u.f303974a.f(l17.longValue());
            if (f17 != null) {
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                mv2.f0.f413094a.s(f17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvShareUIC$initLocalPostStats$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
