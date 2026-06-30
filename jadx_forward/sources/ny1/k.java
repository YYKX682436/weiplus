package ny1;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f422946k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f422947a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f422948b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f422949c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f422950d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f422951e;

    /* renamed from: f, reason: collision with root package name */
    public long f422952f;

    /* renamed from: g, reason: collision with root package name */
    public int f422953g;

    /* renamed from: h, reason: collision with root package name */
    public int f422954h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f422955i;

    /* renamed from: j, reason: collision with root package name */
    public long f422956j;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1, 29309);
        hashMap.put(2, 29309);
        hashMap.put(3, 29205);
        hashMap.put(4, 29572);
        hashMap.put(5, 29771);
        hashMap.put(9, 29771);
        hashMap.put(6, 30149);
        hashMap.put(7, 30481);
        hashMap.put(8, 30482);
        hashMap.put(10, 31502);
    }

    public k(int i17, java.lang.Long l17) {
        this.f422947a = 0;
        this.f422948b = "";
        this.f422951e = false;
        this.f422952f = -1L;
        this.f422953g = -1;
        this.f422954h = 0;
        this.f422955i = new java.util.LinkedList();
        this.f422956j = 0L;
        this.f422947a = i17;
        this.f422956j = l17.longValue();
        this.f422949c = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f422950d = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public boolean a(r45.uc4 uc4Var) {
        r45.pq5 pq5Var;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f422950d;
        if (concurrentLinkedQueue2 != null) {
            concurrentLinkedQueue2.add(java.lang.Long.valueOf(uc4Var.f468754h));
        }
        if (uc4Var == null || (pq5Var = uc4Var.f468751e) == null || (concurrentLinkedQueue = this.f422949c) == null) {
            return false;
        }
        concurrentLinkedQueue.add(pq5Var);
        return true;
    }

    public k(int i17, java.lang.String str, r45.uc4 uc4Var, boolean z17, java.lang.Long l17) {
        this.f422947a = 0;
        this.f422948b = "";
        this.f422951e = false;
        this.f422952f = -1L;
        this.f422953g = -1;
        this.f422954h = 0;
        this.f422955i = new java.util.LinkedList();
        this.f422956j = 0L;
        if (str == null || str.equals("")) {
            return;
        }
        this.f422947a = i17;
        this.f422948b = str;
        this.f422951e = z17;
        this.f422956j = l17.longValue();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f422949c = concurrentLinkedQueue;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f422950d = concurrentLinkedQueue2;
        concurrentLinkedQueue2.add(java.lang.Long.valueOf(uc4Var.f468754h));
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        concurrentLinkedQueue.add(uc4Var.f468751e);
    }
}
