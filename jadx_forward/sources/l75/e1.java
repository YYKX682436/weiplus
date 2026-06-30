package l75;

/* loaded from: classes12.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f398490a;

    /* renamed from: b, reason: collision with root package name */
    public int f398491b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f398492c;

    /* renamed from: d, reason: collision with root package name */
    public long f398493d;

    public final synchronized l75.e1 a() {
        l75.e1 e1Var;
        e1Var = new l75.e1();
        e1Var.f398490a = this.f398490a;
        e1Var.f398491b = this.f398491b;
        e1Var.f398492c = this.f398492c;
        e1Var.f398493d = this.f398493d;
        return e1Var;
    }

    public final void b(com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 c26914xabb259c7, int i17, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this) {
            this.f398490a = null;
            this.f398491b = i17;
            this.f398492c = str;
            this.f398493d = currentTimeMillis;
        }
    }

    public final void c(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, int i17, java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this) {
            this.f398490a = c26948xabb259c7;
            this.f398491b = i17;
            this.f398492c = str;
            this.f398493d = currentTimeMillis;
        }
    }
}
