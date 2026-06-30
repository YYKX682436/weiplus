package rq2;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static long f480413b;

    /* renamed from: c, reason: collision with root package name */
    public static long f480414c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f480415d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f480416e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f480417f;

    /* renamed from: i, reason: collision with root package name */
    public static long f480420i;

    /* renamed from: j, reason: collision with root package name */
    public static long f480421j;

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.s f480412a = new rq2.s();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f480418g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashSet f480419h = new java.util.HashSet();

    public final boolean a() {
        return ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0(c92.g.f121271a.b() ? "FinderLiveEntrance" : "NearbyEntrance") != null;
    }

    public final rq2.q b(int i17) {
        return (rq2.q) f480418g.get(java.lang.Integer.valueOf(i17));
    }

    public final void c(boolean z17, boolean z18) {
        f480415d = z17;
        f480413b = c01.id.c();
        f480416e = !z18 && a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "saveClickEnterTime isFromClick : " + z17 + " isFromRedClick: " + f480416e + " isFromNearby: " + z18);
    }

    public final void d(int i17, int i18, java.lang.String tabName) {
        long c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabName, "tabName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "checkPullType: " + i17);
        boolean z17 = (i17 == 1 || i17 == 0) ? false : true;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f480418g;
        if (z17) {
            concurrentHashMap.remove(java.lang.Integer.valueOf(i18));
            return;
        }
        if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(i18))) {
            rq2.q qVar = new rq2.q();
            qVar.f480402j = i18;
            qVar.f480401i = i17;
            qVar.f480403k = tabName;
            concurrentHashMap.put(java.lang.Integer.valueOf(i18), qVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNearbyLiveLoadingReporter", "tickReportStart pullTypeParams: " + i17 + " tabType: " + i18 + " tabName: " + tabName);
        rq2.q b17 = b(i18);
        if (b17 != null) {
            if (i17 == 0) {
                c17 = f480413b;
            } else {
                f480415d = false;
                f480416e = false;
                c17 = c01.id.c();
            }
            b17.f480393a = c17;
        }
    }
}
