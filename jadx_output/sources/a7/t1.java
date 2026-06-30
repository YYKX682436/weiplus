package a7;

/* loaded from: classes13.dex */
public class t1 implements a7.p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f1862b = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final a7.p0 f1863a;

    public t1(a7.p0 p0Var) {
        this.f1863a = p0Var;
    }

    @Override // a7.p0
    public boolean a(java.lang.Object obj) {
        return f1862b.contains(((android.net.Uri) obj).getScheme());
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        return this.f1863a.b(new a7.c0(((android.net.Uri) obj).toString()), i17, i18, lVar);
    }
}
