package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ts implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.q5 f104644d;

    public ts(bw5.q5 q5Var) {
        this.f104644d = q5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderProfileAllShopConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pq.a aVar = new pq.a(context);
        byte[] byteArray = this.f104644d.b().toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        pq.q.hf((pq.q) c17, aVar, byteArray, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderProfileAllShopConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
