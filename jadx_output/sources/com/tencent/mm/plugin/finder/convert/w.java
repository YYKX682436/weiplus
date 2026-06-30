package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.c0 f104822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f104824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104825g;

    public w(com.tencent.mm.plugin.finder.convert.c0 c0Var, in5.s0 s0Var, long j17, java.lang.String str) {
        this.f104822d = c0Var;
        this.f104823e = s0Var;
        this.f104824f = j17;
        this.f104825g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.convert.c0.n(this.f104822d, this.f104823e, true, this.f104824f, this.f104825g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderCollectionFilterConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
