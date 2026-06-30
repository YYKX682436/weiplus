package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vr implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.wr f104807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f104808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f104809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f104810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104811h;

    public vr(com.tencent.mm.plugin.finder.convert.wr wrVar, kotlin.jvm.internal.f0 f0Var, androidx.recyclerview.widget.RecyclerView recyclerView, android.widget.LinearLayout linearLayout, kotlin.jvm.internal.h0 h0Var) {
        this.f104807d = wrVar;
        this.f104808e = f0Var;
        this.f104809f = recyclerView;
        this.f104810g = linearLayout;
        this.f104811h = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderOpenEntranceTipConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127594a3).getValue()).r()).intValue();
        if (intValue != 0) {
            i17 = 1;
            if (intValue != 1 && intValue == 2) {
                i17 = 4;
            }
        } else {
            i17 = 3;
        }
        com.tencent.mm.plugin.finder.convert.dv.f103202d = i17;
        com.tencent.mm.plugin.finder.convert.dv.f103203e = 0;
        com.tencent.mm.plugin.finder.convert.wr wrVar = this.f104807d;
        int i18 = this.f104808e.f310116d;
        android.content.Context context = this.f104809f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        wrVar.n(intValue, i18, context, this.f104810g.getTag(), (java.lang.String) this.f104811h.f310123d, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderOpenEntranceTipConvert$onCreateViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
