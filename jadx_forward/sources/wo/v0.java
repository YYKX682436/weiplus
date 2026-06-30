package wo;

/* loaded from: classes12.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f529351a;

    /* renamed from: b, reason: collision with root package name */
    public volatile android.net.LocalServerSocket f529352b = null;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f529353c = 0;

    public v0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("lockName is null or empty.");
        }
        synchronized (this) {
            this.f529351a = str;
        }
    }

    public synchronized void a() {
        while (!b()) {
            try {
                java.lang.Thread.sleep(10L);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public synchronized boolean b() {
        if (this.f529352b != null) {
            this.f529353c++;
            return true;
        }
        try {
            this.f529352b = new android.net.LocalServerSocket(this.f529351a);
            this.f529353c++;
            return true;
        } catch (java.lang.Throwable unused) {
            this.f529352b = null;
            return false;
        }
    }

    public synchronized void c() {
        if (this.f529353c > 0) {
            this.f529353c--;
        }
        if (this.f529353c == 0 && this.f529352b != null) {
            try {
                this.f529352b.close();
            } catch (java.lang.Throwable unused) {
            }
            this.f529352b = null;
        }
    }
}
