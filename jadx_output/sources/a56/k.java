package a56;

/* loaded from: classes16.dex */
public class k extends a56.e {
    public k(a56.i iVar, a56.d dVar, long j17) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.order(dVar.f1625a ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
        long j18 = dVar.f1626b + (j17 * dVar.f1628d);
        this.f1631a = iVar.f(allocate, j18);
        iVar.a(allocate, 8 + j18, 8);
        this.f1632b = allocate.getLong();
        iVar.a(allocate, 16 + j18, 8);
        this.f1633c = allocate.getLong();
        iVar.a(allocate, j18 + 40, 8);
        this.f1634d = allocate.getLong();
    }
}
