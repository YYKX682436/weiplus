package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ps implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js2.b f185818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185821g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185822h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185823i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f185824m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f185825n;

    public ps(js2.b bVar, in5.s0 s0Var, android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f185818d = bVar;
        this.f185819e = s0Var;
        this.f185820f = view;
        this.f185821g = view2;
        this.f185822h = view3;
        this.f185823i = view4;
        this.f185824m = textView;
        this.f185825n = textView2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileAllHeaderConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        js2.b bVar = this.f185818d;
        bVar.f383048o = true;
        yz5.l lVar = bVar.f383051r;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(bVar.f383040d));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qs.o(this.f185820f, this.f185818d, this.f185821g, this.f185822h, this.f185823i, this.f185824m, this.f185825n);
        this.f185819e.f3639x46306858.setOnClickListener(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileAllHeaderConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
