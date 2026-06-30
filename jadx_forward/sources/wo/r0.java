package wo;

/* loaded from: classes12.dex */
public abstract class r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f529326c = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final wo.q0 f529327a;

    /* renamed from: b, reason: collision with root package name */
    public final wo.v0 f529328b;

    public r0(wo.q0 q0Var) {
        int andIncrement = f529326c.getAndIncrement();
        this.f529327a = q0Var;
        this.f529328b = new wo.v0("cached_string_" + android.os.Process.myUid() + "_" + andIncrement);
    }

    public final java.lang.String a() {
        wo.v0 v0Var = this.f529328b;
        try {
            v0Var.a();
            java.lang.String a17 = this.f529327a.a(null);
            if (android.text.TextUtils.isEmpty(a17)) {
                d();
                return e();
            }
            c();
            return a17;
        } finally {
            v0Var.c();
        }
    }

    public abstract java.lang.String b();

    public void c() {
    }

    public void d() {
    }

    public final java.lang.String e() {
        wo.v0 v0Var = this.f529328b;
        try {
            v0Var.a();
            java.lang.String b17 = b();
            if (!android.text.TextUtils.isEmpty(b17)) {
                this.f529327a.d(b17);
            }
            return b17;
        } finally {
            v0Var.c();
        }
    }

    public final void f() {
        wo.v0 v0Var = this.f529328b;
        try {
            v0Var.a();
            wo.q0 q0Var = this.f529327a;
            synchronized (q0Var.f529322c) {
                q0Var.f529320a = false;
                q0Var.f529321b = null;
                q0Var.c(null);
            }
        } finally {
            v0Var.c();
        }
    }
}
