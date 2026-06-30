package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v f219777d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar) {
        this.f219777d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f219777d;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.a0 a0Var = vVar.f219866y;
        java.lang.String query = vVar.f291495e.getText().toString();
        a0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        z13.f fVar = a0Var.f219776b;
        int i17 = k23.s2.a(fVar.f550939o) ? com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5 : 17;
        org.json.JSONObject a76 = fVar.a7();
        org.json.JSONObject c76 = fVar.c7();
        k23.r2 r2Var = fVar.f550939o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2Var, "<this>");
        z50.c.f551695a.e(a0Var.f219775a, query, i17, r2Var == k23.r2.f385218g ? 238 : 3, a76, c76);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
