package av3;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f14211a;

    /* renamed from: b, reason: collision with root package name */
    public long f14212b;

    /* renamed from: c, reason: collision with root package name */
    public r45.bi0 f14213c;

    /* renamed from: d, reason: collision with root package name */
    public long f14214d;

    public a(android.graphics.Matrix matrix) {
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f14211a = matrix;
    }

    public long a(long j17) {
        while (true) {
            long j18 = this.f14212b;
            if (j18 > j17) {
                long j19 = j18 - j17;
                this.f14212b = j19;
                return j19;
            }
            this.f14212b = j18 + e();
        }
    }

    public abstract void b();

    public abstract void c(android.graphics.Canvas canvas, android.graphics.Paint paint);

    public abstract void d();

    public abstract long e();

    public void f(long j17) {
        this.f14214d = j17;
    }

    public final boolean g() {
        r45.bi0 bi0Var = this.f14213c;
        if (bi0Var == null) {
            return true;
        }
        long j17 = this.f14214d;
        return j17 >= bi0Var.f370772d && j17 <= bi0Var.f370773e;
    }
}
