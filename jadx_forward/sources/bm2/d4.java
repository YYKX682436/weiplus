package bm2;

/* loaded from: classes11.dex */
public final class d4 implements com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.e4 f103378a;

    public d4(bm2.e4 e4Var) {
        this.f103378a = e4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public android.view.View a(android.content.Context context, android.view.ViewGroup parent, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ck9, parent, false);
        bm2.c4 c4Var = this.f103378a.E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c4Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.adapter.FinderLiveHeaderDataItem.HeaderViewHolder");
        android.widget.TextView textView = inflate != null ? (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gzf) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(textView, "null cannot be cast to non-null type android.widget.TextView");
        c4Var.f103346a = textView;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.gzg) : null;
        c4Var.f103347b = findViewById;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public boolean b(android.content.Context context, android.view.View v17, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c
    public void c(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b holder, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d data, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        u50.y yVar = (u50.y) i95.n0.c(u50.y.class);
        java.lang.String str = ((bm2.e4) data).C;
        android.widget.TextView textView = ((bm2.c4) holder).f103346a;
        ((s50.r0) yVar).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(str, textView);
    }
}
