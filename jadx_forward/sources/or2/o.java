package or2;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final or2.o f429197a = new or2.o();

    /* renamed from: b, reason: collision with root package name */
    public static final int f429198b = oj.d.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).f427215d;

    public final void a(java.lang.String scene, org.json.JSONObject info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(26986, scene, info, 6);
    }

    public final void b(java.util.concurrent.ConcurrentLinkedDeque pendingReportList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pendingReportList, "pendingReportList");
        if (pendingReportList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(pendingReportList);
        pendingReportList.clear();
        pm0.v.O("Finder.FinderFpsReporter", new or2.l(arrayList));
    }
}
