package bg2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static long f101440b;

    /* renamed from: a, reason: collision with root package name */
    public static final bg2.a f101439a = new bg2.a();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f101441c = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f101442d = {1, 20002, 1000066, 10001, 10018};

    public final java.util.List a(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long j18 = f101440b;
        java.util.List list = f101441c;
        if (j18 == j17) {
            arrayList.addAll(list);
        }
        list.clear();
        f101440b = 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentDataTransfer", "getCache liveId:" + pm0.v.u(j17) + ", cache size:" + arrayList.size());
        return arrayList;
    }
}
