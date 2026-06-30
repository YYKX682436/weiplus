package e23;

/* loaded from: classes12.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f328412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.k1 f328413e;

    public j1(e23.k1 k1Var, android.content.Context context) {
        this.f328413e = k1Var;
        this.f328412d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifySenderHeaderDataItem$FTSServiceNotifySenderHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Search_Scene", 4);
        intent.putExtra("Search_Str", this.f328413e.f328419b.f505295e.f432662a);
        o13.n.q(this.f328412d, ".ui.FTSServiceNotifyUI", intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23903, 5, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), null, 0, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.e3.f219579a);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSServiceNotifySenderHeaderDataItem$FTSServiceNotifySenderHeaderViewItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
