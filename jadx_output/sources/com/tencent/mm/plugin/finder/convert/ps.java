package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ps implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js2.b f104285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104288g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104289h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f104290i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f104291m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f104292n;

    public ps(js2.b bVar, in5.s0 s0Var, android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f104285d = bVar;
        this.f104286e = s0Var;
        this.f104287f = view;
        this.f104288g = view2;
        this.f104289h = view3;
        this.f104290i = view4;
        this.f104291m = textView;
        this.f104292n = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileAllHeaderConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        js2.b bVar = this.f104285d;
        bVar.f301515o = true;
        yz5.l lVar = bVar.f301518r;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(bVar.f301507d));
        }
        com.tencent.mm.plugin.finder.convert.qs.o(this.f104287f, this.f104285d, this.f104288g, this.f104289h, this.f104290i, this.f104291m, this.f104292n);
        this.f104286e.itemView.setOnClickListener(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileAllHeaderConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
