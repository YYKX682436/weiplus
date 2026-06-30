package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class km implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103845e;

    public km(java.lang.String str, in5.s0 s0Var) {
        this.f103844d = str;
        this.f103845e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNextLiveContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", this.f103844d);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = this.f103845e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e1Var.w(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderLiveReservedRecordItemConvert$bindNextLiveContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
