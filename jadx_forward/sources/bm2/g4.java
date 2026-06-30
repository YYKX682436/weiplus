package bm2;

/* loaded from: classes8.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.i4 f103447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103448e;

    public g4(bm2.i4 i4Var, int i17) {
        this.f103447d = i4Var;
        this.f103448e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveLinkInviteAnchorSearchAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.i4 i4Var = this.f103447d;
        java.util.ArrayList arrayList2 = i4Var.f103505d;
        int i17 = this.f103448e;
        r45.mu2 mu2Var = (r45.mu2) kz5.n0.a0(arrayList2, i17);
        if (mu2Var != null && (pVar = i4Var.f103509h) != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), mu2Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveLinkInviteAnchorSearchAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
