package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class m5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f103974d;

    public m5(com.tencent.mm.plugin.finder.convert.q6 q6Var) {
        this.f103974d = q6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshCloseCommentTips$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f103974d.f104340e;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = a7Var.f106212i;
        if (finderItem == null) {
            kotlin.jvm.internal.o.o("feedObj");
            throw null;
        }
        r45.uy0 uy0Var = a7Var.f106225v;
        if (uy0Var == null || (str = uy0Var.getString(2)) == null) {
            str = "";
        }
        zy2.gc gcVar = a7Var.H1;
        android.content.Context context = a7Var.f106207d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488793ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487334ob5)).setText(str);
        k0Var.s(inflate, false);
        k0Var.f211872n = new cu2.k(context);
        k0Var.f211881s = new cu2.l(finderItem, gcVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentHeaderConvert$refreshCloseCommentTips$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
