package lc5;

/* loaded from: classes8.dex */
public final class t implements gp1.y {

    /* renamed from: d, reason: collision with root package name */
    public static final lc5.t f399565d = new lc5.t();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.LinkedList f399566e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f399567f;

    @Override // gp1.y
    public void X(java.util.List ballInfoList, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfoList, "ballInfoList");
        java.util.HashSet Q0 = kz5.n0.Q0(ballInfoList);
        java.util.Iterator it = f399566e.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            lc5.s sVar = (lc5.s) next;
            if (!Q0.contains(sVar.f399563b)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFloatBallMgr", "remove msgId=" + sVar.f399562a + ", talker=" + sVar.f399564c);
                it.remove();
            }
        }
        a();
    }

    public final void a() {
        if (f399566e.isEmpty()) {
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().n(this);
            f399567f = false;
        }
    }

    public final void b(long j17, java.lang.String str) {
        java.util.Iterator it = f399566e.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            lc5.s sVar = (lc5.s) next;
            if (sVar.f399562a == j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar.f399564c, str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFloatBallMgr", "deleteImageFloatBall msgId: " + j17 + ", talker: " + str);
                ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(sVar.f399563b);
                it.remove();
                a();
                return;
            }
        }
        a();
    }
}
