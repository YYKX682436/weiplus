package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes.dex */
public final class wl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f211528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cm f211529e;

    public wl(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cm cmVar) {
        this.f211528d = s0Var;
        this.f211529e = cmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f211528d;
        lb2.j jVar = (lb2.j) s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ci ciVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ci.f210527a;
        java.lang.String title = jVar.f399282d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        if (!(title.length() == 0)) {
            java.util.List V0 = kz5.n0.V0(ciVar.a());
            java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
            arrayList2.remove(title);
            arrayList2.add(0, title);
            while (arrayList2.size() > 10) {
                arrayList2.remove(arrayList2.size() - 1);
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ci.f210528b).mo141623x754a37bb()).putString("recent_v1", kz5.n0.g0(V0, "\n", null, null, 0, null, null, 62, null));
        }
        if (!jVar.k().isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cm cmVar = this.f211529e;
            cmVar.getClass();
            java.util.List k17 = jVar.k();
            java.util.List S0 = kz5.n0.S0(kz5.c0.g(k17));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(s0Var.f374654e, 1, true);
            k0Var.q(jVar.f399282d, 17);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.zl(k17, S0);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.bm(cmVar, jVar, s0Var);
            k0Var.v();
        } else {
            jVar.n(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/SettingItemConvert$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
