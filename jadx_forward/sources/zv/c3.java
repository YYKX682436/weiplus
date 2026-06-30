package zv;

/* loaded from: classes9.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f557457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f557458e;

    public c3(yz5.l lVar, java.util.List list) {
        this.f557457d = lVar;
        this.f557458e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        java.util.List list = this.f557458e;
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : list) {
            java.lang.String userName = (java.lang.String) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f c23529x1b784d5f = new com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f(yw.h1.f547865a.h(userName), null, null, 6, null);
            com.p314xaae8f345.mm.p2621x8fb0427b.l4 p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(userName);
            if ((p17 != null ? p17.d1() : 0) > 0) {
                c23529x1b784d5f = com.p314xaae8f345.p2845xc516c4b6.p2848x4c39767d.C23529x1b784d5f.m87034x75149012(c23529x1b784d5f, null, java.lang.Boolean.TRUE, null, 5, null);
            }
            linkedHashMap.put(obj, c23529x1b784d5f);
        }
        this.f557457d.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.c1.t(linkedHashMap))));
    }
}
