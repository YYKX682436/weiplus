package com.tencent.mm.plugin.appbrand.widget.input.autofill;

/* loaded from: classes15.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f91311d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f91312e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f91313f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f91314g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f91315h;

    /* renamed from: i, reason: collision with root package name */
    public pl1.b f91316i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.autofill.c f91317m;

    public b(com.tencent.mm.plugin.appbrand.widget.input.autofill.c cVar, android.view.View view) {
        this.f91317m = cVar;
        this.f91311d = view;
        this.f91312e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.f91313f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cgi);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bys);
        this.f91314g = findViewById;
        this.f91315h = view.findViewById(com.tencent.mm.R.id.d0v);
        view.setBackgroundResource(com.tencent.mm.R.drawable.auo);
        view.setOnClickListener(this);
        findViewById.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.appbrand.widget.input.autofill.e0 e0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter$AutoFillViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f91316i != null) {
            int id6 = view.getId();
            com.tencent.mm.plugin.appbrand.widget.input.autofill.c cVar = this.f91317m;
            if (id6 == com.tencent.mm.R.id.bys) {
                cVar.remove(this.f91316i);
                com.tencent.mm.plugin.appbrand.widget.input.autofill.e0 e0Var2 = cVar.f91323f;
                if (e0Var2 != null) {
                    e0Var2.a(this.f91316i.f356577a, com.tencent.mm.plugin.appbrand.widget.input.autofill.d0.DELETE);
                }
            } else if (view == this.f91311d && (e0Var = cVar.f91323f) != null) {
                pl1.b bVar = this.f91316i;
                if (bVar != null) {
                    e0Var.a(bVar.f356577a, com.tencent.mm.plugin.appbrand.widget.input.autofill.d0.SELECT);
                }
                cVar.f91324g = true;
                com.tencent.mm.plugin.appbrand.widget.input.autofill.k kVar = cVar.f91322e;
                if (kVar != null) {
                    ((com.tencent.mm.plugin.appbrand.widget.input.e4) kVar.f91337a).getView().clearFocus();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/autofill/AutoFillAdapter$AutoFillViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
