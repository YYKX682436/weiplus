package a56;

/* loaded from: classes16.dex */
public class g extends a56.d {

    /* renamed from: g, reason: collision with root package name */
    public final a56.i f1636g;

    public g(boolean z17, a56.i iVar) {
        this.f1625a = z17;
        this.f1636g = iVar;
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(z17 ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
        iVar.b(allocate, 16L);
        this.f1626b = iVar.f(allocate, 28L);
        this.f1627c = iVar.f(allocate, 32L);
        this.f1628d = iVar.b(allocate, 42L);
        this.f1629e = iVar.b(allocate, 44L);
        this.f1630f = iVar.b(allocate, 46L);
        iVar.b(allocate, 48L);
        iVar.b(allocate, 50L);
    }

    @Override // a56.d
    public a56.c a(long j17, int i17) {
        return new a56.a(this.f1636g, this, j17, i17);
    }

    @Override // a56.d
    public a56.e b(long j17) {
        return new a56.j(this.f1636g, this, j17);
    }

    @Override // a56.d
    public a56.f c(int i17) {
        return new a56.l(this.f1636g, this, i17);
    }
}
