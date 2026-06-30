package a56;

/* loaded from: classes16.dex */
public class l extends a56.f {
    public l(a56.i iVar, a56.d dVar, int i17) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(dVar.f83158a ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
        this.f83168a = iVar.f(allocate, dVar.f83160c + (i17 * dVar.f83163f) + 28);
    }
}
