package on2;

/* loaded from: classes3.dex */
public final class c1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f428388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f428389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f428390f;

    public c1(on2.j1 j1Var, r45.dz1 dz1Var, int i17) {
        this.f428388d = j1Var;
        this.f428389e = dz1Var;
        this.f428390f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.q qVar = this.f428388d.f428481g;
        if (qVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            qVar.mo147xb9724478(this.f428389e, view, java.lang.Integer.valueOf(this.f428390f));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryPanelListAdapter$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
