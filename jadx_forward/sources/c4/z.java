package c4;

/* loaded from: classes15.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f119882a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f119883b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f119884c;

    /* renamed from: d, reason: collision with root package name */
    public int f119885d;

    public z(java.lang.Object obj) {
        this.f119882a = obj;
    }

    public void a() {
        boolean z17 = this.f119883b;
        java.lang.Object obj = this.f119882a;
        if (z17) {
            throw new java.lang.IllegalStateException("detach() called when detach() had already been called for: " + obj);
        }
        if (!this.f119884c) {
            this.f119883b = true;
        } else {
            throw new java.lang.IllegalStateException("detach() called when sendResult() had already been called for: " + obj);
        }
    }

    public boolean b() {
        return this.f119883b || this.f119884c;
    }

    public abstract void c(java.lang.Object obj);

    public void d(java.lang.Object obj) {
        if (this.f119884c) {
            throw new java.lang.IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f119882a);
        }
        this.f119884c = true;
        c(obj);
    }
}
