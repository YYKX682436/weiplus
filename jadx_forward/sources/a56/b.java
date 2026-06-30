package a56;

/* loaded from: classes16.dex */
public class b extends a56.c {
    public b(a56.i iVar, a56.d dVar, long j17, int i17) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.order(dVar.f83158a ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
        long j18 = j17 + (i17 * 16);
        iVar.a(allocate, j18, 8);
        this.f83156a = allocate.getLong();
        iVar.a(allocate, j18 + 8, 8);
        this.f83157b = allocate.getLong();
    }
}
