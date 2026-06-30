package pi0;

/* loaded from: classes11.dex */
public final class k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final pi0.i0 f436162c = new pi0.i0(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f436163d = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa f436164a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f436165b;

    public k0(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 dartExecutor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dartExecutor, "dartExecutor");
        this.f436165b = "";
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa c28677x2598ceaa = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28677x2598ceaa(dartExecutor, "mmflutter/hybrid_nav_page_state", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28693x7d6ca65.f71639x4fbc8495);
        this.f436164a = c28677x2598ceaa;
        c28677x2598ceaa.m138401x3bedc6cf(10);
    }

    public final void a(java.lang.String str) {
        io.p3284xd2ae381c.Log.i("MicroMsg.HybridNavPageStateChannel", "onMessage " + str + ' ' + this.f436165b);
        this.f436164a.m138402x35cf88(str);
    }
}
