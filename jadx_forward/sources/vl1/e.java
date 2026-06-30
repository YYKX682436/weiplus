package vl1;

/* loaded from: classes11.dex */
public class e implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f519323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f519324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vl1.g f519325f;

    public e(vl1.g gVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        this.f519325f = gVar;
        this.f519323d = k3Var;
        this.f519324e = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        vl1.q qVar = this.f519325f.f519333m;
        if (qVar == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f519323d;
        android.view.View view2 = k3Var.f3639x46306858;
        long m8184x1ed62e84 = k3Var.m8184x1ed62e84();
        int i17 = this.f519324e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a071 = ((vl1.m) qVar).f519342a;
        vl1.o oVar = c12809xaf47a071.f173633d2;
        boolean a17 = oVar != null ? oVar.a(c12809xaf47a071, view2, i17, m8184x1ed62e84) : false;
        yj0.a.i(a17, this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return a17;
    }
}
