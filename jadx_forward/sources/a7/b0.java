package a7;

/* loaded from: classes13.dex */
public class b0 implements a7.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final a7.y f83337a;

    public b0(a7.y yVar) {
        this.f83337a = yVar;
    }

    @Override // a7.p0
    public /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return true;
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        java.io.File file = (java.io.File) obj;
        return new a7.o0(new p7.b(file), new a7.x(file, this.f83337a));
    }
}
