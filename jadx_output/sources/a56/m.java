package a56;

/* loaded from: classes16.dex */
public class m extends a56.f {
    public m(a56.i iVar, a56.d dVar, int i17) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(8);
        allocate.order(dVar.f1625a ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
        this.f1635a = iVar.f(allocate, dVar.f1627c + (i17 * dVar.f1630f) + 44);
    }
}
