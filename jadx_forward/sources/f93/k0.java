package f93;

/* loaded from: classes11.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea f341902d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea) {
        this.f341902d = activityC16165x57283aea;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi6 = b93.r.wi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16165x57283aea activityC16165x57283aea = this.f341902d;
        java.util.ArrayList P1 = wi6.P1(activityC16165x57283aea.f224729i);
        if (P1 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC16165x57283aea.f224724d, "result is null");
            return;
        }
        int size = P1.size();
        for (int i17 = 0; i17 < size; i17++) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) P1.get(i17), true), "get(...)");
        }
        activityC16165x57283aea.f224734q = P1;
        java.util.ArrayList arrayList = activityC16165x57283aea.f224735r;
        if (arrayList == null) {
            activityC16165x57283aea.f224735r = new java.util.ArrayList();
        } else {
            arrayList.clear();
        }
        activityC16165x57283aea.f224735r.addAll(P1);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = activityC16165x57283aea.E;
        if (n3Var != null) {
            n3Var.mo50305x3d8a09a2(activityC16165x57283aea.f224726f);
        }
    }
}
