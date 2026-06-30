package in5;

/* loaded from: classes.dex */
public final class g1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f374586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.c f374589g;

    public g1(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, int i17, android.view.View view, in5.c cVar) {
        this.f374586d = c22848x6ddd90cf;
        this.f374587e = i17;
        this.f374588f = view;
        this.f374589g = cVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f374586d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c22848x6ddd90cf.b0().m0(view);
        int m8183xf806b362 = m07 != null ? m07.m8183xf806b362() : this.f374587e;
        in5.u uVar = c22848x6ddd90cf.B;
        boolean v17 = uVar != null ? uVar.v(this.f374588f, this.f374589g, m8183xf806b362) : false;
        yj0.a.i(v17, this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return v17;
    }
}
