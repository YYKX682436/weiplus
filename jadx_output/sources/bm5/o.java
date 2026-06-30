package bm5;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Future[] f22708a = {null};

    /* renamed from: b, reason: collision with root package name */
    public final bm5.s f22709b = new bm5.t(null);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f22710c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public volatile bm5.r f22711d;

    public java.lang.Object a() {
        java.lang.Object obj;
        if (((bm5.t) this.f22709b).f22733a.get()) {
            return ((bm5.t) this.f22709b).f22734b.get();
        }
        try {
            java.util.concurrent.Future[] futureArr = this.f22708a;
            java.util.concurrent.Future future = futureArr[0];
            if (future != null) {
                return future.get();
            }
            synchronized (futureArr) {
                java.util.Objects.requireNonNull(this.f22708a[0]);
                obj = this.f22708a[0].get();
            }
            return obj;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AsyncComputedValue", "get() exception(%s) occurs", e17);
            return null;
        }
    }
}
