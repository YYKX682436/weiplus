package a56;

/* loaded from: classes16.dex */
public class j extends a56.e {
    public j(a56.i iVar, a56.d dVar, long j17) {
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
        allocate.order(dVar.f83158a ? java.nio.ByteOrder.BIG_ENDIAN : java.nio.ByteOrder.LITTLE_ENDIAN);
        long j18 = dVar.f83159b + (j17 * dVar.f83161d);
        this.f83164a = iVar.f(allocate, j18);
        this.f83165b = iVar.f(allocate, 4 + j18);
        this.f83166c = iVar.f(allocate, 8 + j18);
        this.f83167d = iVar.f(allocate, j18 + 20);
    }
}
