package ge5;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile ge5.d f352540a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f352541b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("AAChattingHelper");

    public d() {
        f352541b.m77789xc5a5549d(false);
    }

    public static ge5.d a() {
        ge5.d dVar;
        if (f352540a != null) {
            return f352540a;
        }
        synchronized (ge5.d.class) {
            if (f352540a == null) {
                f352540a = new ge5.d();
            }
            dVar = f352540a;
        }
        return dVar;
    }

    public static void b(java.lang.CharSequence charSequence, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        if (charSequence instanceof android.text.Spannable) {
            f352541b.m77784x795fa299(new ge5.c(charSequence, f9Var, i17));
        }
    }
}
