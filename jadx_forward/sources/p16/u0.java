package p16;

/* loaded from: classes15.dex */
public class u0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f432891d = -1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f432892e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Iterator f432893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p16.w0 f432894g;

    public u0(p16.w0 w0Var, p16.p0 p0Var) {
        this.f432894g = w0Var;
    }

    public final java.util.Iterator a() {
        if (this.f432893f == null) {
            this.f432893f = this.f432894g.f432899f.entrySet().iterator();
        }
        return this.f432893f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432891d + 1 < this.f432894g.f432898e.size() || a().hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        this.f432892e = true;
        int i17 = this.f432891d + 1;
        this.f432891d = i17;
        p16.w0 w0Var = this.f432894g;
        return i17 < w0Var.f432898e.size() ? (java.util.Map.Entry) w0Var.f432898e.get(this.f432891d) : (java.util.Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f432892e) {
            throw new java.lang.IllegalStateException("remove() was called before next()");
        }
        this.f432892e = false;
        int i17 = p16.w0.f432896i;
        p16.w0 w0Var = this.f432894g;
        w0Var.b();
        if (this.f432891d >= w0Var.f432898e.size()) {
            a().remove();
            return;
        }
        int i18 = this.f432891d;
        this.f432891d = i18 - 1;
        w0Var.f(i18);
    }
}
