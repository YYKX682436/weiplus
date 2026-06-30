package c4;

/* loaded from: classes15.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f38349a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38350b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38351c;

    /* renamed from: d, reason: collision with root package name */
    public int f38352d;

    public z(java.lang.Object obj) {
        this.f38349a = obj;
    }

    public void a() {
        boolean z17 = this.f38350b;
        java.lang.Object obj = this.f38349a;
        if (z17) {
            throw new java.lang.IllegalStateException("detach() called when detach() had already been called for: " + obj);
        }
        if (!this.f38351c) {
            this.f38350b = true;
        } else {
            throw new java.lang.IllegalStateException("detach() called when sendResult() had already been called for: " + obj);
        }
    }

    public boolean b() {
        return this.f38350b || this.f38351c;
    }

    public abstract void c(java.lang.Object obj);

    public void d(java.lang.Object obj) {
        if (this.f38351c) {
            throw new java.lang.IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f38349a);
        }
        this.f38351c = true;
        c(obj);
    }
}
