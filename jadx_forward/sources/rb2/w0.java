package rb2;

/* loaded from: classes10.dex */
public final class w0 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.OnItemSelectedListener f475338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rb2.y0 f475339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 f475341g;

    public w0(rb2.y0 y0Var, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 c13709xbc18ee15) {
        this.f475339e = y0Var;
        this.f475340f = s0Var;
        this.f475341g = c13709xbc18ee15;
        if (!android.widget.AdapterView.OnItemSelectedListener.class.isInterface()) {
            throw new java.lang.IllegalArgumentException("T must be an interface".toString());
        }
        java.lang.Object newProxyInstance = java.lang.reflect.Proxy.newProxyInstance(android.widget.AdapterView.OnItemSelectedListener.class.getClassLoader(), new java.lang.Class[]{android.widget.AdapterView.OnItemSelectedListener.class}, pm0.v.f438336b);
        if (newProxyInstance == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.AdapterView.OnItemSelectedListener");
        }
        this.f475338d = (android.widget.AdapterView.OnItemSelectedListener) newProxyInstance;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$onCreateViewHolder$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        yz5.p pVar = this.f475339e.f475367m;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f475340f.m8183xf806b362());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.p1439x38a5ee5f.C13709xbc18ee15 gestureGallery = this.f475341g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gestureGallery, "$gestureGallery");
        pVar.mo149xb9724478(valueOf, gestureGallery);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageFlowConvert$onCreateViewHolder$2", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
        this.f475338d.onNothingSelected(adapterView);
    }
}
