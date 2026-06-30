package a5;

/* loaded from: classes13.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static a5.a0 f82896a;

    public a0(int i17) {
    }

    public static synchronized a5.a0 c() {
        a5.a0 a0Var;
        synchronized (a5.a0.class) {
            if (f82896a == null) {
                f82896a = new a5.z(3);
            }
            a0Var = f82896a;
        }
        return a0Var;
    }

    public static java.lang.String e(java.lang.String str) {
        int length = str.length();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(23);
        sb6.append("WM-");
        if (length >= 20) {
            sb6.append(str.substring(0, 20));
        } else {
            sb6.append(str);
        }
        return sb6.toString();
    }

    public abstract void a(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr);

    public abstract void b(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr);

    public abstract void d(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr);

    public abstract void f(java.lang.String str, java.lang.String str2, java.lang.Throwable... thArr);
}
