package a56;

/* loaded from: classes16.dex */
public class h extends a56.d {

    /* renamed from: g, reason: collision with root package name */
    public final a56.i f83170g;

    public h(boolean z17, a56.i iVar) {
        this.f83158a = z17;
        this.f83170g = iVar;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.order(z17 ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
        iVar.b(allocate, 16L);
        iVar.a(allocate, 32L, 8);
        this.f83159b = allocate.getLong();
        iVar.a(allocate, 40L, 8);
        this.f83160c = allocate.getLong();
        this.f83161d = iVar.b(allocate, 54L);
        this.f83162e = iVar.b(allocate, 56L);
        this.f83163f = iVar.b(allocate, 58L);
        iVar.b(allocate, 60L);
        iVar.b(allocate, 62L);
    }

    @Override // a56.d
    public a56.c a(long j17, int i17) {
        return new a56.b(this.f83170g, this, j17, i17);
    }

    @Override // a56.d
    public a56.e b(long j17) {
        return new a56.k(this.f83170g, this, j17);
    }

    @Override // a56.d
    public a56.f c(int i17) {
        return new a56.m(this.f83170g, this, i17);
    }
}
