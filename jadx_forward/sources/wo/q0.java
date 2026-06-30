package wo;

/* loaded from: classes12.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f529320a = false;

    /* renamed from: b, reason: collision with root package name */
    public volatile java.lang.String f529321b = null;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f529322c = new byte[0];

    public q0(wo.g0 g0Var) {
    }

    public java.lang.String a(java.lang.String str) {
        if (this.f529320a) {
            return this.f529321b;
        }
        synchronized (this.f529322c) {
            if (this.f529320a) {
                return this.f529321b;
            }
            this.f529321b = b();
            if (this.f529321b == null) {
                return str;
            }
            this.f529320a = true;
            return this.f529321b;
        }
    }

    public abstract java.lang.String b();

    public abstract void c(java.lang.String str);

    public void d(java.lang.String str) {
        synchronized (this.f529322c) {
            if (this.f529320a && android.text.TextUtils.equals(this.f529321b, str)) {
                return;
            }
            this.f529321b = str;
            this.f529320a = true;
            c(str);
        }
    }
}
