package a9;

/* loaded from: classes15.dex */
public final class b implements z8.b {
    @Override // z8.b
    public com.google.android.exoplayer2.metadata.Metadata a(z8.e eVar) {
        java.nio.ByteBuffer byteBuffer = eVar.f343610f;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        t9.p pVar = new t9.p(array, limit);
        java.lang.String i17 = pVar.i();
        java.lang.String i18 = pVar.i();
        long n17 = pVar.n();
        pVar.x(4);
        return new com.google.android.exoplayer2.metadata.Metadata(new com.google.android.exoplayer2.metadata.emsg.EventMessage(i17, i18, (pVar.n() * 1000) / n17, pVar.n(), java.util.Arrays.copyOfRange(array, pVar.f416541b, limit)));
    }
}
