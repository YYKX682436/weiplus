package a56;

/* loaded from: classes16.dex */
public class a extends a56.c {
    public a(a56.i iVar, a56.d dVar, long j17, int i17) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(dVar.f1625a ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
        long j18 = j17 + (i17 * 8);
        this.f1623a = iVar.f(allocate, j18);
        this.f1624b = iVar.f(allocate, j18 + 4);
    }
}
