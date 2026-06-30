package bm2;

/* loaded from: classes3.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f22173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f22174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.b0 f22175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f22176g;

    public o0(android.content.Context context, r45.h32 h32Var, bm2.b0 b0Var, bm2.v0 v0Var) {
        this.f22173d = context;
        this.f22174e = h32Var;
        this.f22175f = b0Var;
        this.f22176g = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f22173d;
        kotlin.jvm.internal.o.f(context, "$context");
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", xy2.c.e(context));
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", this.f22174e.toByteArray());
        boolean z17 = false;
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false);
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        android.content.Context context2 = this.f22175f.itemView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        ((com.tencent.mm.plugin.finder.assist.i0) ubVar).Hj(context2, intent, 1013);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            wt2.a aVar = this.f22176g.f22368n;
            if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                z17 = true;
            }
            bf2.c.b(bf2.c.f19598a, eVar, z17 ? 8 : 6, 1, null, 0, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
