package c23;

/* loaded from: classes12.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z13.f f38001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jo0 f38002e;

    public b0(z13.f fVar, r45.jo0 jo0Var) {
        this.f38001d = fVar;
        this.f38002e = jo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC$switchArrowUp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.di6 di6Var = this.f38002e.f377986d;
        this.f38001d.g7(java.lang.String.valueOf(di6Var != null ? di6Var.f372512d : null));
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC$switchArrowUp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
