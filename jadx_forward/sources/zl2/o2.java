package zl2;

/* loaded from: classes2.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f555442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f555443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f555444f;

    public o2(android.app.Activity activity, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f555442d = activity;
        this.f555443e = c19786x6a1e2862;
        this.f555444f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$handleLiveErrPage$2$1$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "eligibilityJumpInfo click ok");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo = this.f555443e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfo, "$jumpInfo");
        android.app.Activity context = this.f555442d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        xc2.y2 y2Var = xc2.y2.f534876a;
        xc2.p0 p0Var = new xc2.p0(jumpInfo);
        p0Var.f534785n = 0;
        xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        this.f555444f.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$handleLiveErrPage$2$1$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
