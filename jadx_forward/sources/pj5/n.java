package pj5;

/* loaded from: classes9.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f436925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lo5 f436926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pj5.l f436927f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f436928g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z01.d0 f436929h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22089x7f01e429 f436930i;

    public n(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, r45.lo5 lo5Var, pj5.l lVar, in5.s0 s0Var, z01.d0 d0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22089x7f01e429 c22089x7f01e429) {
        this.f436925d = f9Var;
        this.f436926e = lo5Var;
        this.f436927f = lVar;
        this.f436928g = s0Var;
        this.f436929h = d0Var;
        this.f436930i = c22089x7f01e429;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pj5.k kVar = pj5.k.f436919a;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        kVar.e(context, this.f436925d, 3, this.f436926e.f461208d, new pj5.m(this.f436927f, this.f436928g, this.f436929h, this.f436930i));
        yj0.a.h(this, "com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
