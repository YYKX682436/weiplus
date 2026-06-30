package ak0;

/* loaded from: classes12.dex */
public final class x extends ak0.a {

    /* renamed from: k, reason: collision with root package name */
    public static volatile boolean f87081k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.Object f87082l = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7 f87083a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f87084b = {-1};

    /* renamed from: c, reason: collision with root package name */
    public tv5.b f87085c = null;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f87086d = {-1};

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object[] f87087e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object[] f87088f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object[] f87089g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object[] f87090h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object[] f87091i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f87092j;

    public x(com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7 abstractC26587x7a37b8e7) {
        java.lang.Object obj = f87082l;
        this.f87087e = new java.lang.Object[]{obj};
        this.f87088f = new java.lang.Object[]{obj};
        this.f87089g = new java.lang.Object[]{obj};
        this.f87090h = new java.lang.Object[]{obj};
        this.f87091i = new java.lang.Object[]{obj};
        this.f87092j = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f87083a = abstractC26587x7a37b8e7;
    }

    @Override // ak0.a
    public java.lang.String a() {
        java.lang.Object[] objArr = this.f87087e;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = f87082l;
        if (obj != obj2) {
            return (java.lang.String) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = this.f87087e[0];
            if (obj3 != obj2) {
                return (java.lang.String) obj3;
            }
            java.lang.String m104654x7e63ed49 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104654x7e63ed49(this.f87083a.m104443xced0bce(), com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.f55873x6affac7f);
            this.f87087e[0] = m104654x7e63ed49;
            return m104654x7e63ed49;
        }
    }

    public final java.util.Map b() {
        java.lang.Object[] objArr = this.f87088f;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = f87082l;
        if (obj != obj2) {
            return (java.util.Map) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = this.f87088f[0];
            if (obj3 != obj2) {
                return (java.util.Map) obj3;
            }
            android.content.Intent m104443xced0bce = this.f87083a.m104443xced0bce();
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = null;
            if (m104443xced0bce != null && com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104650xc7992e6f(m104443xced0bce) == 0) {
                hashMap = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104645x1d734ab6(m104443xced0bce);
            }
            this.f87088f[0] = hashMap;
            return hashMap;
        }
    }
}
