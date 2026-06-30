package e23;

/* loaded from: classes12.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f328531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.b1 f328532e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jo0 f328533f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f328534g;

    public y0(android.view.View view, e23.b1 b1Var, r45.jo0 jo0Var, int i17) {
        this.f328531d = view;
        this.f328532e = b1Var;
        this.f328533f = jo0Var;
        this.f328534g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f m67437x4bd5310;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$updateRelevantSearchBar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f328531d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(context);
        if (a17 != null && (m67437x4bd5310 = a17.m67437x4bd5310()) != null) {
            e23.b1 b1Var = this.f328532e;
            java.lang.String i17 = b1Var.i();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getQuery(...)");
            b1Var.getClass();
            m67437x4bd5310.B3(new fi0.f(i17, o13.p.f423784d, b1Var.f505299i, this.f328533f, this.f328534g, 32, b1Var.f505306p, false, 128, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$updateRelevantSearchBar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
