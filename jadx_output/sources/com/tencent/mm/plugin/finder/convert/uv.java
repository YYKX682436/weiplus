package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class uv implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ew f104743e;

    public uv(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.ew ewVar) {
        this.f104742d = s0Var;
        this.f104743e = ewVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f104742d;
        if (!((com.tencent.mm.plugin.finder.feed.ys) s0Var.f293125i).f111194f.isEmpty()) {
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.convert.ew.o(this.f104743e, context, 4, s0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
