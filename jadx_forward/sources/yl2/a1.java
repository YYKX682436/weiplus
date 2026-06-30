package yl2;

/* loaded from: classes3.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f544501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f544502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f544503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f544504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f544505h;

    public a1(android.widget.TextView textView, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, yl2.g1 g1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, v65.n nVar) {
        this.f544501d = textView;
        this.f544502e = c19786x6a1e2862;
        this.f544503f = g1Var;
        this.f544504g = y1Var;
        this.f544505h = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ui/livepost/FinderLivePostHelper$showEligibilityDialog$2$1$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLivePostHelper", "eligibilityJumpInfo click ok");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = this.f544501d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = this.f544502e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        xc2.y2 y2Var = xc2.y2.f534876a;
        xc2.p0 p0Var = new xc2.p0(info);
        p0Var.f534785n = 0;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        yl2.g1 g1Var = this.f544503f;
        g1Var.f544546f.a();
        pm0.v.V(1000L, new yl2.z0(g1Var, this.f544504g, this.f544505h));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ui/livepost/FinderLivePostHelper$showEligibilityDialog$2$1$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
