package i7;

/* loaded from: classes13.dex */
public class d implements i7.e {
    @Override // i7.e
    public w6.z0 a(w6.z0 z0Var, t6.l lVar) {
        byte[] bArr;
        java.nio.ByteBuffer asReadOnlyBuffer = ((s6.f) ((h7.f) z0Var.get()).f360866d.f360865a.f360882a).f484829d.asReadOnlyBuffer();
        java.util.concurrent.atomic.AtomicReference atomicReference = q7.c.f441823a;
        q7.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new q7.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.f441820a == 0) {
            if (bVar.f441821b == bVar.f441822c.length) {
                bArr = asReadOnlyBuffer.array();
                return new e7.c(bArr);
            }
        }
        java.nio.ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        asReadOnlyBuffer2.position(0);
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new e7.c(bArr);
    }
}
