package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v f219822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f219823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g23.g f219824f;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar, android.widget.CheckBox checkBox, g23.g gVar) {
        this.f219822d = vVar;
        this.f219823e = checkBox;
        this.f219824f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.n1 n1Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.n1.f219839f;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f219822d;
        vVar.m63652x82c606ea(n1Var);
        android.widget.CheckBox checkBox = this.f219823e;
        boolean z17 = !checkBox.isChecked();
        checkBox.setChecked(z17);
        g23.g gVar = this.f219824f;
        gVar.f349449c = z17;
        vVar.D = z17;
        vVar.C.mo146xb9724478(java.lang.Boolean.valueOf(z17));
        vVar.q();
        if (vVar.v()) {
            vVar.f(false);
            vVar.s();
        }
        java.lang.String str = gVar.f349447a;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "globalSearchAskRealPeople");
        z50.d dVar = z50.e.f551696a;
        if (b17) {
            if (z17) {
                dVar.b(vu4.a.B, vu4.b.f521794h, vVar.f219866y.f219776b.a7(), vVar.f219866y.f219776b.f550934g);
            } else {
                dVar.b(vu4.a.C, vu4.b.f521794h, vVar.f219866y.f219776b.a7(), vVar.f219866y.f219776b.f550934g);
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "globalSearchDeepThink")) {
            if (z17) {
                dVar.b(vu4.a.B, vu4.b.f521793g, vVar.f219866y.f219776b.a7(), vVar.f219866y.f219776b.f550934g);
            } else {
                dVar.b(vu4.a.C, vu4.b.f521793g, vVar.f219866y.f219776b.a7(), vVar.f219866y.f219776b.f550934g);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$initCheckBox$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
