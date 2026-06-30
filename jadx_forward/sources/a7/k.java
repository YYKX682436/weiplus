package a7;

/* loaded from: classes13.dex */
public class k implements a7.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final a7.g f83367a;

    public k(a7.g gVar) {
        this.f83367a = gVar;
    }

    @Override // a7.p0
    public /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return true;
    }

    @Override // a7.p0
    public a7.o0 b(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        byte[] bArr = (byte[]) obj;
        return new a7.o0(new p7.b(bArr), new a7.h(bArr, this.f83367a));
    }
}
