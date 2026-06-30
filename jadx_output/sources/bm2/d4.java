package bm2;

/* loaded from: classes11.dex */
public final class d4 implements com.tencent.mm.ui.contact.item.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.e4 f21845a;

    public d4(bm2.e4 e4Var) {
        this.f21845a = e4Var;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup parent, android.view.View view) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ck9, parent, false);
        bm2.c4 c4Var = this.f21845a.E;
        kotlin.jvm.internal.o.e(c4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveHeaderDataItem.HeaderViewHolder");
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gzf) : null;
        kotlin.jvm.internal.o.e(textView, "null cannot be cast to non-null type android.widget.TextView");
        c4Var.f21813a = textView;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.gzg) : null;
        c4Var.f21814b = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveHeaderDataItem$HeaderViewItem", "inflateView", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveHeaderDataItem$HeaderViewItem", "inflateView", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (inflate != null) {
            inflate.setTag(c4Var);
        }
        return inflate;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public boolean b(android.content.Context context, android.view.View v17, com.tencent.mm.ui.contact.item.d data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(data, "data");
        return false;
    }

    @Override // com.tencent.mm.ui.contact.item.c
    public void c(android.content.Context context, com.tencent.mm.ui.contact.item.b holder, com.tencent.mm.ui.contact.item.d data, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(data, "data");
        u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
        java.lang.String str = ((bm2.e4) data).C;
        android.widget.TextView textView = ((bm2.c4) holder).f21813a;
        ((s50.r0) yVar).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(str, textView);
    }
}
