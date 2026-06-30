package a7;

/* loaded from: classes13.dex */
public class r1 implements a7.p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f1855b = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a, reason: collision with root package name */
    public final a7.p1 f1856a;

    public r1(a7.p1 p1Var) {
        this.f1856a = p1Var;
    }

    @Override // a7.p0
    public boolean a(java.lang.Object obj) {
        return f1855b.contains(((android.net.Uri) obj).getScheme());
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        android.net.Uri uri = (android.net.Uri) obj;
        return new a7.o0(new p7.b(uri), this.f1856a.a(uri));
    }
}
