package cp2;

/* loaded from: classes2.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f302321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f302323f;

    public e0(cp2.v0 v0Var, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f302321d = v0Var;
        this.f302322e = i17;
        this.f302323f = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cp2.q1 q1Var = (cp2.q1) this.f302321d.z();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = q1Var.o().mo7946xf939df19();
        cp2.z0 z0Var = mo7946xf939df19 instanceof cp2.z0 ? (cp2.z0) mo7946xf939df19 : null;
        int i17 = this.f302322e;
        if (z0Var != null) {
            z0Var.f302491e = i17;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = q1Var.o().mo7946xf939df19();
        if (mo7946xf939df192 != null) {
            mo7946xf939df192.m8146xced61ae5();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f302323f.getLayoutManager();
        if (layoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.mo2420xc593c771(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(layoutManager, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
