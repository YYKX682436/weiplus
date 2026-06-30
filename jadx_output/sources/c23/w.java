package c23;

/* loaded from: classes12.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c23.c0 f38061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jo0 f38062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38063f;

    public w(c23.c0 c0Var, r45.jo0 jo0Var, int i17) {
        this.f38061d = c0Var;
        this.f38062e = jo0Var;
        this.f38063f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f stateCenter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC$addSugItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c23.c0 c0Var = this.f38061d;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = c0Var.P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.B3(new fi0.f(c0Var.f38006e, c0Var.f38007f, -1, this.f38062e, this.f38063f, 23, c0Var.f38014p, false, 128, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/hotsearch/uic/FTSRelevantSearchFooterUIC$addSugItemView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
