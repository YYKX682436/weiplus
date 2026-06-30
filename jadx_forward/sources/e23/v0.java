package e23;

/* loaded from: classes12.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z13.f f328504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jo0 f328505e;

    public v0(z13.f fVar, r45.jo0 jo0Var) {
        this.f328504d = fVar;
        this.f328505e = jo0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.di6 di6Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem$switchArrowUp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.jo0 jo0Var = this.f328505e;
        this.f328504d.g7(java.lang.String.valueOf((jo0Var == null || (di6Var = jo0Var.f459519d) == null) ? null : di6Var.f454045d));
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem$switchArrowUp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
