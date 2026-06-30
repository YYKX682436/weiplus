package bm5;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.Future[] f104241a = {null};

    /* renamed from: b, reason: collision with root package name */
    public final bm5.s f104242b = new bm5.t(null);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f104243c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public volatile bm5.r f104244d;

    public java.lang.Object a() {
        java.lang.Object obj;
        if (((bm5.t) this.f104242b).f104266a.get()) {
            return ((bm5.t) this.f104242b).f104267b.get();
        }
        try {
            java.util.concurrent.Future[] futureArr = this.f104241a;
            java.util.concurrent.Future future = futureArr[0];
            if (future != null) {
                return future.get();
            }
            synchronized (futureArr) {
                java.util.Objects.requireNonNull(this.f104241a[0]);
                obj = this.f104241a[0].get();
            }
            return obj;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AsyncComputedValue", "get() exception(%s) occurs", e17);
            return null;
        }
    }
}
