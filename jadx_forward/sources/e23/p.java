package e23;

/* loaded from: classes12.dex */
public class p extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.r f328457b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e23.r rVar) {
        super(rVar);
        this.f328457b = rVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.q qVar = (e23.q) eVar;
        e23.r rVar = this.f328457b;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(rVar.f328481v, qVar.f328469b);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(qVar.f328470c, rVar.f328482w, null);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(rVar.f328483x, qVar.f328471d);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(rVar.f328484y)) {
            qVar.f328472e.setVisibility(8);
        } else {
            qVar.f328472e.setVisibility(0);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(qVar.f328472e, rVar.f328484y, null);
        }
        android.view.View view = qVar.f328468a;
        if (rVar.f505294d) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        } else {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
        }
        if (rVar.f505292b == 0) {
            android.view.View view2 = qVar.f328474g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = qVar.f328474g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/item/FTSConvTalkerHeaderDataItem$FTSConvTalkerHeaderViewItem", "fillingViewItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem$FTSViewHolder;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        qVar.f328473f.setVisibility(0);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbz, viewGroup, false);
        e23.q qVar = this.f328457b.C;
        qVar.f328469b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566751gy3);
        qVar.f328470c = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9p);
        qVar.f328471d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566752gy4);
        qVar.f328472e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9r);
        qVar.f328473f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hcv);
        qVar.f328468a = inflate.findViewById(com.p314xaae8f345.mm.R.id.mem);
        qVar.f328474g = inflate.findViewById(com.p314xaae8f345.mm.R.id.knz);
        inflate.setTag(qVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        return false;
    }
}
