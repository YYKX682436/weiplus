package hk0;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f363244a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f363245b;

    public c1(int i17, boolean z17) {
        this.f363244a = i17;
        this.f363245b = z17;
    }

    /* renamed from: equals */
    public boolean m133620xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.c1)) {
            return false;
        }
        hk0.c1 c1Var = (hk0.c1) obj;
        return this.f363244a == c1Var.f363244a && this.f363245b == c1Var.f363245b;
    }

    /* renamed from: hashCode */
    public int m133621x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f363244a) * 31) + java.lang.Boolean.hashCode(this.f363245b);
    }

    /* renamed from: toString */
    public java.lang.String m133622x9616526c() {
        return "ViewState(viewId=" + this.f363244a + ", isShow=" + this.f363245b + ')';
    }
}
