package c23;

/* loaded from: classes12.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.c0 f119594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jo0 f119595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f119596f;

    public w(c23.c0 c0Var, r45.jo0 jo0Var, int i17) {
        this.f119594d = c0Var;
        this.f119595e = jo0Var;
        this.f119596f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f m67437x4bd5310;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC$addSugItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c23.c0 c0Var = this.f119594d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = c0Var.P6();
        if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
            m67437x4bd5310.B3(new fi0.f(c0Var.f119539e, c0Var.f119540f, -1, this.f119595e, this.f119596f, 23, c0Var.f119547p, false, 128, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC$addSugItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
