package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class qw implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yw f104433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.i f104435f;

    public qw(com.tencent.mm.plugin.finder.convert.yw ywVar, in5.s0 s0Var, so2.i iVar) {
        this.f104433d = ywVar;
        this.f104434e = s0Var;
        this.f104435f = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert$refreshExpandAggregatedBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f104434e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.convert.yw.n(this.f104433d, context, this.f104435f.f410411d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderSupportAggregatedMsgConvert$refreshExpandAggregatedBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
