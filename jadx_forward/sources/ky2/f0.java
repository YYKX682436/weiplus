package ky2;

/* loaded from: classes3.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ky2.g0 f395067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.l30 f395068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f395069f;

    public f0(ky2.g0 g0Var, r45.l30 l30Var, int i17) {
        this.f395067d = g0Var;
        this.f395068e = l30Var;
        this.f395069f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/vote/adapter/FinderLiveVoteCardAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ky2.g0 g0Var = this.f395067d;
        if (g0Var.f395080m) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveVoteCardAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        g0Var.f395080m = true;
        r45.l30 l30Var = this.f395068e;
        int m75939xb282bd08 = l30Var.m75939xb282bd08(2);
        int i17 = this.f395069f;
        if (m75939xb282bd08 == 1) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (r45.l30 l30Var2 : g0Var.f395076f) {
                if (l30Var2.m75939xb282bd08(2) == 1 && l30Var2.m75939xb282bd08(0) != l30Var.m75939xb282bd08(0)) {
                    arrayList2.add(java.lang.Integer.valueOf(l30Var2.m75939xb282bd08(0)));
                }
            }
            yz5.p pVar = g0Var.f395077g;
            if (pVar != null) {
                pVar.mo149xb9724478(arrayList2, java.lang.Integer.valueOf(i17));
            }
        } else if (g0Var.f395079i) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(l30Var.m75939xb282bd08(0)));
            yz5.p pVar2 = g0Var.f395077g;
            if (pVar2 != null) {
                pVar2.mo149xb9724478(arrayList3, java.lang.Integer.valueOf(i17));
            }
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (r45.l30 l30Var3 : g0Var.f395076f) {
                if (l30Var3.m75939xb282bd08(2) == 1 || l30Var3.m75939xb282bd08(0) == l30Var.m75939xb282bd08(0)) {
                    arrayList4.add(java.lang.Integer.valueOf(l30Var3.m75939xb282bd08(0)));
                }
            }
            yz5.p pVar3 = g0Var.f395077g;
            if (pVar3 != null) {
                pVar3.mo149xb9724478(arrayList4, java.lang.Integer.valueOf(i17));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/vote/adapter/FinderLiveVoteCardAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
