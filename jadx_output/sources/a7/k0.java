package a7;

/* loaded from: classes13.dex */
public final class k0 implements a7.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f1835a;

    public k0(android.content.Context context) {
        this.f1835a = context;
    }

    @Override // a7.p0
    public boolean a(java.lang.Object obj) {
        return v6.b.a((android.net.Uri) obj);
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        android.net.Uri uri = (android.net.Uri) obj;
        return new a7.o0(new p7.b(uri), new a7.j0(this.f1835a, uri));
    }
}
