package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2;

/* loaded from: classes15.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f172844d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f172845e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f172846f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f172847g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f172848h;

    /* renamed from: i, reason: collision with root package name */
    public pl1.b f172849i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.c f172850m;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.c cVar, android.view.View view) {
        this.f172850m = cVar;
        this.f172844d = view;
        this.f172845e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        this.f172846f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.bys);
        this.f172847g = findViewById;
        this.f172848h = view.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.auo);
        view.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.e0 e0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter$AutoFillViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f172849i != null) {
            int id6 = view.getId();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.c cVar = this.f172850m;
            if (id6 == com.p314xaae8f345.mm.R.id.bys) {
                cVar.remove(this.f172849i);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.e0 e0Var2 = cVar.f172856f;
                if (e0Var2 != null) {
                    e0Var2.a(this.f172849i.f438110a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.d0.DELETE);
                }
            } else if (view == this.f172844d && (e0Var = cVar.f172856f) != null) {
                pl1.b bVar = this.f172849i;
                if (bVar != null) {
                    e0Var.a(bVar.f438110a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.d0.SELECT);
                }
                cVar.f172857g = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.p1226x55c963b2.k kVar = cVar.f172855e;
                if (kVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.e4) kVar.f172870a).m53466xfb86a31b().clearFocus();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter$AutoFillViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
