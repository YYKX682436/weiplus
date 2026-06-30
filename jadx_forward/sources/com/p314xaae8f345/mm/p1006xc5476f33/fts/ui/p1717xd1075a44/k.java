package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v f219819d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g23.f f219820e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar, g23.f fVar) {
        this.f219819d = vVar;
        this.f219820e = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initActionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f219819d;
        ((android.view.inputmethod.InputMethodManager) vVar.getContext().getSystemService("input_method")).hideSoftInputFromWindow(vVar.f291495e.getWindowToken(), 0);
        g23.f inputActionConfig = this.f219820e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inputActionConfig, "$inputActionConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var = vVar.f219866y;
        a0Var.getClass();
        long j17 = inputActionConfig.f349444d * 1000;
        if (((java.util.ArrayList) inputActionConfig.f349446f).size() > 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(a0Var.f219775a, false, 1);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.x(inputActionConfig);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.y(inputActionConfig, j17, a0Var);
            k0Var.C = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.z(inputActionConfig, a0Var);
            k0Var.v();
        } else {
            g23.i iVar = inputActionConfig.f349445e;
            if (iVar != null) {
                z50.b bVar = z50.c.f551695a;
                android.content.Context context = a0Var.f219775a;
                z13.f fVar = a0Var.f219776b;
                bVar.c(iVar, j17, context, fVar.c7(), fVar.a7(), fVar.f550934g);
            }
        }
        java.lang.String str = inputActionConfig.f349442b;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "add");
        z50.d dVar = z50.e.f551696a;
        if (b17) {
            dVar.b(vu4.a.I, vu4.b.f521799p, a0Var.f219776b.a7(), a0Var.f219776b.f550934g);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "photo")) {
            dVar.b(vu4.a.I, vu4.b.f521795i, a0Var.f219776b.a7(), a0Var.f219776b.f550934g);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initActionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
