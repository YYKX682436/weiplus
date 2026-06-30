package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f;

/* loaded from: classes7.dex */
public final class e0 {

    /* renamed from: g, reason: collision with root package name */
    public static final android.util.SparseArray f169112g = new android.util.SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f169113h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f169114a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f169115b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4 f169116c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f169117d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 f169118e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f169119f;

    public e0(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f169114a = "MicroMsg.AppBrand.AppBrandOrientationObservable#" + hashCode();
        this.f169115b = activity.getApplicationContext();
        this.f169116c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f4.NONE;
        this.f169117d = new java.lang.Object();
        this.f169119f = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0 b(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0 e0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (!f169113h.getAndSet(true)) {
            activity.getApplication().registerActivityLifecycleCallbacks(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.c0());
        }
        int hashCode = activity.hashCode();
        android.util.SparseArray sparseArray = f169112g;
        synchronized (sparseArray) {
            e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0) sparseArray.get(hashCode);
            if (e0Var == null) {
                e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.e0(activity);
                sparseArray.put(hashCode, e0Var);
            }
        }
        return e0Var;
    }

    public final void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4 h4Var;
        synchronized (this.f169117d) {
            if (z17) {
                if (this.f169118e == null) {
                    this.f169118e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h4(this.f169115b, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.d0(this));
                }
                h4Var = this.f169118e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h4Var);
            } else {
                h4Var = this.f169118e;
            }
            if (h4Var != null) {
                h4Var.enable();
            }
        }
    }
}
