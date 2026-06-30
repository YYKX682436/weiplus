package a7;

/* loaded from: classes13.dex */
public class o1 implements a7.q0, a7.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f83382a;

    public o1(android.content.ContentResolver contentResolver) {
        this.f83382a = contentResolver;
    }

    @Override // a7.p1
    public u6.e a(android.net.Uri uri) {
        return new u6.m(this.f83382a, uri);
    }

    @Override // a7.q0
    public a7.p0 b(a7.z0 z0Var) {
        return new a7.r1(this);
    }
}
