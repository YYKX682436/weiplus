package vl1;

/* loaded from: classes8.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f519320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f519321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vl1.g f519322f;

    public d(vl1.g gVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        this.f519322f = gVar;
        this.f519320d = k3Var;
        this.f519321e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vl1.p pVar = this.f519322f.f519332i;
        if (pVar != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f519320d;
            pVar.a(k3Var.f3639x46306858, this.f519321e, k3Var.m8184x1ed62e84());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/recyclerview/FixedRecyclerViewAdapter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
