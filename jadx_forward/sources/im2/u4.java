package im2;

/* loaded from: classes2.dex */
public final class u4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.v4 f374106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f374107e;

    public u4(im2.v4 v4Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f374106d = v4Var;
        this.f374107e = c19786x6a1e2862;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC$refreshLiveOrder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("FinderOrderCenter");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = this.f374106d.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f374107e;
        if (c19786x6a1e2862 != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ya.b.f77502x92235c1b, 1);
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            p0Var.f534768a0 = hashMap;
            xc2.y2.P(y2Var, context, p0Var, 0, false, null, 0.0f, 60, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveSelfUIC$refreshLiveOrder$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
