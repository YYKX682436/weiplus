package q82;

/* loaded from: classes12.dex */
public class b extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q82.c f442270b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q82.c cVar) {
        super(cVar);
        this.f442270b = cVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        q82.a aVar = (q82.a) eVar;
        q82.c cVar = (q82.c) gVar;
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = aVar.f442265a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.k(context, c21405x85fc1ce0, cVar.f442277w, cVar.f442276v, cVar.f442278x, false, c21405x85fc1ce0.getMeasuredWidth(), aVar.f442265a.getMeasuredHeight());
        android.widget.TextView textView = aVar.f442266b;
        android.widget.TextView textView2 = aVar.f442267c;
        q82.c cVar2 = this.f442270b;
        java.lang.CharSequence charSequence = cVar2.f442273s;
        java.lang.CharSequence charSequence2 = cVar2.f442274t;
        try {
            if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, textView)) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence2, textView2)) {
                    textView.setMaxLines(1);
                    textView2.setMaxLines(1);
                } else {
                    textView.setMaxLines(2);
                }
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence2, textView2)) {
                textView2.setMaxLines(2);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSFavoriteDataItem", e17, "fillingCommonItemTitleAndDesc", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(cVar2.f442275u, aVar.f442268d);
        if (cVar2.f442272r) {
            android.view.View view = aVar.f442269e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = aVar.f442269e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/fts/FTSFavoriteDataItem$FTSFavoriteViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bc7, viewGroup, false);
        q82.a aVar = this.f442270b.f442280z;
        aVar.f442265a = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) inflate.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        aVar.f442266b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odf);
        aVar.f442267c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f563864bl);
        aVar.f442268d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568633ni2);
        aVar.f442269e = inflate.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        inflate.setTag(aVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 10;
        z9Var.f90065e = ((q82.c) gVar).f442271q.f432719d;
        z9Var.f90068h = context;
        z9Var.f90079s = new r45.dq0();
        q82.c cVar = this.f442270b;
        if (cVar.f505296f == 1) {
            z9Var.f90079s.f454186d = 3;
        } else {
            z9Var.f90079s.f454186d = 4;
        }
        r45.dq0 dq0Var = z9Var.f90079s;
        dq0Var.f454187e = 3;
        dq0Var.f454188f = cVar.f505300j;
        c5432x35bb364f.e();
        return true;
    }
}
