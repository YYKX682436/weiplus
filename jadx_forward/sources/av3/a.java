package av3;

/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Matrix f95744a;

    /* renamed from: b, reason: collision with root package name */
    public long f95745b;

    /* renamed from: c, reason: collision with root package name */
    public r45.bi0 f95746c;

    /* renamed from: d, reason: collision with root package name */
    public long f95747d;

    public a(android.graphics.Matrix matrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f95744a = matrix;
    }

    public long a(long j17) {
        while (true) {
            long j18 = this.f95745b;
            if (j18 > j17) {
                long j19 = j18 - j17;
                this.f95745b = j19;
                return j19;
            }
            this.f95745b = j18 + e();
        }
    }

    public abstract void b();

    public abstract void c(android.graphics.Canvas canvas, android.graphics.Paint paint);

    public abstract void d();

    public abstract long e();

    public void f(long j17) {
        this.f95747d = j17;
    }

    public final boolean g() {
        r45.bi0 bi0Var = this.f95746c;
        if (bi0Var == null) {
            return true;
        }
        long j17 = this.f95747d;
        return j17 >= bi0Var.f452305d && j17 <= bi0Var.f452306e;
    }
}
