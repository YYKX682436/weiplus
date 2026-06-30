package b7;

/* loaded from: classes13.dex */
public class d implements a7.p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f18176b = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final a7.p0 f18177a;

    public d(a7.p0 p0Var) {
        this.f18177a = p0Var;
    }

    @Override // a7.p0
    public boolean a(java.lang.Object obj) {
        return f18176b.contains(((android.net.Uri) obj).getScheme());
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        return this.f18177a.b(new a7.c0(((android.net.Uri) obj).toString()), i17, i18, lVar);
    }
}
