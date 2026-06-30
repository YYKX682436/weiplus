package bm2;

/* loaded from: classes3.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.b0 f21878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f21879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f21880f;

    public f0(bm2.b0 b0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, bm2.v0 v0Var) {
        this.f21878d = b0Var;
        this.f21879e = finderJumpInfo;
        this.f21880f = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.plugin.gq gqVar = com.tencent.mm.plugin.finder.live.plugin.jq.f113154p;
        android.content.Context context = this.f21878d.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        gqVar.a(context, this.f21879e);
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            wt2.a aVar = this.f21880f.f22368n;
            boolean z17 = false;
            if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                z17 = true;
            }
            bf2.c.b(bf2.c.f19598a, eVar, z17 ? 8 : 6, 8, null, 0, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
