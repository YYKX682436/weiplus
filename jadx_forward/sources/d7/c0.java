package d7;

/* loaded from: classes13.dex */
public final class c0 implements t6.f {
    @Override // t6.f
    public com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498 a(java.io.InputStream inputStream) {
        return com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.UNKNOWN;
    }

    @Override // t6.f
    public com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498 b(java.nio.ByteBuffer byteBuffer) {
        return com.p147xb1cd08cc.p148x5de23a5.p149x32c4e6.EnumC1427x7be2d498.UNKNOWN;
    }

    @Override // t6.f
    public int c(java.io.InputStream inputStream, x6.b bVar) {
        int attributeInt = new android.media.ExifInterface(inputStream).getAttributeInt(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3264x118c46b, 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }
}
