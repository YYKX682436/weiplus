package a9;

/* loaded from: classes15.dex */
public final class b implements z8.b {
    @Override // z8.b
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f a(z8.e eVar) {
        java.nio.ByteBuffer byteBuffer = eVar.f425143f;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        t9.p pVar = new t9.p(array, limit);
        java.lang.String i17 = pVar.i();
        java.lang.String i18 = pVar.i();
        long n17 = pVar.n();
        pVar.x(4);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f(new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.p180x2f90fc.C1604x78d9382d(i17, i18, (pVar.n() * 1000) / n17, pVar.n(), java.util.Arrays.copyOfRange(array, pVar.f498074b, limit)));
    }
}
