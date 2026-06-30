package mr3;

/* loaded from: classes5.dex */
public final class t implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f412431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f412432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mr3.v f412433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mr3.l f412434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f412435h;

    public t(android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d, mr3.v vVar, mr3.l lVar, in5.s0 s0Var) {
        this.f412431d = context;
        this.f412432e = c22628xfde5d61d;
        this.f412433f = vVar;
        this.f412434g = lVar;
        this.f412435h = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f412432e;
        android.content.Context context = this.f412431d;
        rl5.r rVar = new rl5.r(context, c22628xfde5d61d);
        rVar.f478884u = new mr3.r(context);
        rVar.f478887x = new mr3.s(this.f412433f, this.f412434g, this.f412435h);
        boolean n17 = rVar.n(0, 0);
        yj0.a.i(n17, this, "com/tencent/mm/plugin/profile/ui/mod/desc_image/DescImageItemConvert$onBindViewHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return n17;
    }
}
