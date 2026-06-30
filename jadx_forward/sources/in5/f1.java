package in5;

/* loaded from: classes.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f374577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374578e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374579f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.c f374580g;

    public f1(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, int i17, android.view.View view, in5.c cVar) {
        this.f374577d = c22848x6ddd90cf;
        this.f374578e = i17;
        this.f374579f = view;
        this.f374580g = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f374577d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c22848x6ddd90cf.b0().m0(view);
        int m8183xf806b362 = m07 != null ? m07.m8183xf806b362() : this.f374578e;
        in5.u uVar = c22848x6ddd90cf.B;
        if (uVar != null) {
            uVar.g(this.f374579f, this.f374580g, m8183xf806b362);
        }
        yj0.a.h(this, "com/tencent/mm/view/recyclerview/WxRecyclerAdapter$bindViewListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
