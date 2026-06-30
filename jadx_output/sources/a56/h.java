package a56;

/* loaded from: classes16.dex */
public class h extends a56.d {

    /* renamed from: g, reason: collision with root package name */
    public final a56.i f1637g;

    public h(boolean z17, a56.i iVar) {
        this.f1625a = z17;
        this.f1637g = iVar;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.order(z17 ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
        iVar.b(allocate, 16L);
        iVar.a(allocate, 32L, 8);
        this.f1626b = allocate.getLong();
        iVar.a(allocate, 40L, 8);
        this.f1627c = allocate.getLong();
        this.f1628d = iVar.b(allocate, 54L);
        this.f1629e = iVar.b(allocate, 56L);
        this.f1630f = iVar.b(allocate, 58L);
        iVar.b(allocate, 60L);
        iVar.b(allocate, 62L);
    }

    @Override // a56.d
    public a56.c a(long j17, int i17) {
        return new a56.b(this.f1637g, this, j17, i17);
    }

    @Override // a56.d
    public a56.e b(long j17) {
        return new a56.k(this.f1637g, this, j17);
    }

    @Override // a56.d
    public a56.f c(int i17) {
        return new a56.m(this.f1637g, this, i17);
    }
}
