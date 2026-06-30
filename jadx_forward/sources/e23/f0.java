package e23;

/* loaded from: classes12.dex */
public class f0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.g0 f328379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e23.g0 g0Var) {
        super(g0Var);
        this.f328379b = g0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        android.view.View.OnClickListener onClickListener;
        e23.e0 e0Var = (e23.e0) eVar;
        e23.g0 g0Var = this.f328379b;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(g0Var.f328386q, e0Var.f328360b);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.b(g0Var.f328387r, e0Var.f328361c);
        android.widget.TextView textView = e0Var.f328361c;
        if (textView != null && (onClickListener = g0Var.f328388s) != null) {
            textView.setOnClickListener(onClickListener);
            java.lang.String i17 = g0Var.i();
            java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.f219908a;
            ((ku5.t0) ku5.t0.f394148d).k(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w2(1, i17), 100L);
        }
        if (g0Var.f505292b == 0) {
            android.view.View view = e0Var.f328362d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = e0Var.f328362d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/item/FTSHeaderDataItem$FTSHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = e0Var.f328359a;
        if (g0Var.f505294d) {
            view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        } else {
            view3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bc_, viewGroup, false);
        e23.e0 e0Var = (e23.e0) this.f328379b.o();
        e0Var.f328360b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gzf);
        e0Var.f328361c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gyu);
        e0Var.f328362d = inflate.findViewById(com.p314xaae8f345.mm.R.id.knz);
        e0Var.f328359a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mem);
        inflate.setTag(e0Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
