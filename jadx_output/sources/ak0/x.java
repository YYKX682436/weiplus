package ak0;

/* loaded from: classes12.dex */
public final class x extends ak0.a {

    /* renamed from: k, reason: collision with root package name */
    public static volatile boolean f5548k;

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.Object f5549l = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tinker.entry.ApplicationLike f5550a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f5551b = {-1};

    /* renamed from: c, reason: collision with root package name */
    public tv5.b f5552c = null;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f5553d = {-1};

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object[] f5554e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object[] f5555f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object[] f5556g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object[] f5557h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object[] f5558i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f5559j;

    public x(com.tencent.tinker.entry.ApplicationLike applicationLike) {
        java.lang.Object obj = f5549l;
        this.f5554e = new java.lang.Object[]{obj};
        this.f5555f = new java.lang.Object[]{obj};
        this.f5556g = new java.lang.Object[]{obj};
        this.f5557h = new java.lang.Object[]{obj};
        this.f5558i = new java.lang.Object[]{obj};
        this.f5559j = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f5550a = applicationLike;
    }

    @Override // ak0.a
    public java.lang.String a() {
        java.lang.Object[] objArr = this.f5554e;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = f5549l;
        if (obj != obj2) {
            return (java.lang.String) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = this.f5554e[0];
            if (obj3 != obj2) {
                return (java.lang.String) obj3;
            }
            java.lang.String stringExtra = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getStringExtra(this.f5550a.getTinkerResultIntent(), com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_NEW_VERSION);
            this.f5554e[0] = stringExtra;
            return stringExtra;
        }
    }

    public final java.util.Map b() {
        java.lang.Object[] objArr = this.f5555f;
        java.lang.Object obj = objArr[0];
        java.lang.Object obj2 = f5549l;
        if (obj != obj2) {
            return (java.util.Map) obj;
        }
        synchronized (objArr) {
            java.lang.Object obj3 = this.f5555f[0];
            if (obj3 != obj2) {
                return (java.util.Map) obj3;
            }
            android.content.Intent tinkerResultIntent = this.f5550a.getTinkerResultIntent();
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = null;
            if (tinkerResultIntent != null && com.tencent.tinker.loader.shareutil.ShareIntentUtil.getIntentReturnCode(tinkerResultIntent) == 0) {
                hashMap = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getIntentPackageConfig(tinkerResultIntent);
            }
            this.f5555f[0] = hashMap;
            return hashMap;
        }
    }
}
