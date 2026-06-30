package rb2;

/* loaded from: classes2.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.m60 f475155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rb2.m0 f475158g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475159h;

    public f0(r45.m60 m60Var, java.lang.String str, in5.s0 s0Var, rb2.m0 m0Var, so2.y0 y0Var) {
        this.f475155d = m60Var;
        this.f475156e = str;
        this.f475157f = s0Var;
        this.f475158g = m0Var;
        this.f475159h = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$refreshRefFeed$1$3$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) this.f475155d.m75936x14adae67(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19786x6a1e2862);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "onItemClick click, " + this.f475156e + " jumpInfo=" + hc2.g0.d(c19786x6a1e2862));
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = this.f475157f.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534777f = this.f475158g.f475219e.f0();
        p0Var.f534778g = this.f475159h.f492236d.t0();
        p0Var.f534788q = com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.f17687x39c51edd;
        xc2.y2.i(y2Var, context, p0Var, 0, this.f475157f, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert$refreshRefFeed$1$3$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
