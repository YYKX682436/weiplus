package uk;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Properties f510025a = new java.util.Properties();

    /* renamed from: b, reason: collision with root package name */
    public byte[] f510026b;

    public e(uk.d dVar) {
    }

    public void a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        uk.o oVar = uk.f.f510027a;
        oVar.a();
        byte[] bArr2 = new byte[4];
        wrap.get(bArr2);
        java.lang.System.out.println("securityPart: " + new uk.o(bArr2).f510042d);
        boolean m168190xb2c87fbf = oVar.m168190xb2c87fbf(new uk.o(bArr2));
        uk.o oVar2 = uk.f.f510028b;
        if (!m168190xb2c87fbf) {
            if (!oVar2.m168190xb2c87fbf(new uk.o(bArr2))) {
                throw new java.net.ProtocolException("unknow protocl [" + java.util.Arrays.toString(bArr) + "]");
            }
            oVar2.a();
            if (bArr.length - 4 <= 2) {
                java.lang.System.err.println("data.length - oriMarkLength <= 2");
                return;
            }
            byte[] bArr3 = new byte[2];
            wrap.get(bArr3);
            int i17 = ((bArr3[1] << 8) & 65280) + (bArr3[0] & 255);
            if ((bArr.length - 4) - 2 < i17) {
                java.lang.System.err.println("data.length - oriMarkLength - 2 < len");
                java.lang.System.err.println("exit");
                return;
            } else {
                byte[] bArr4 = new byte[i17];
                this.f510026b = bArr4;
                wrap.get(bArr4);
                return;
            }
        }
        if (bArr.length - 4 <= 2) {
            java.lang.System.err.println("data.length - securityMarkLength <= 2");
            return;
        }
        byte[] bArr5 = new byte[2];
        wrap.get(bArr5);
        int i18 = ((bArr5[1] << 8) & 65280) + (bArr5[0] & 255);
        if ((bArr.length - 4) - 2 < i18) {
            java.lang.System.err.println("data.length - securityMarkLength - 2 < len");
            java.lang.System.err.println("exit");
            return;
        }
        byte[] bArr6 = new byte[i18];
        wrap.get(bArr6);
        this.f510025a.load(new java.io.ByteArrayInputStream(bArr6));
        int length = ((bArr.length - 4) - i18) - 2;
        if (length > 0) {
            oVar2.a();
            byte[] bArr7 = new byte[4];
            wrap.get(bArr7);
            if (oVar2.m168190xb2c87fbf(new uk.o(bArr7))) {
                int i19 = length - 4;
                if (i19 <= 2) {
                    java.lang.System.err.println("data.length - oriMarkLength <= 2");
                    return;
                }
                byte[] bArr8 = new byte[2];
                wrap.get(bArr8);
                int i27 = ((bArr8[1] << 8) & 65280) + (bArr8[0] & 255);
                if (i19 - 2 < i27) {
                    java.lang.System.err.println("data.length - oriMarkLength - 2 < len");
                    java.lang.System.err.println("exit");
                } else {
                    byte[] bArr9 = new byte[i27];
                    this.f510026b = bArr9;
                    wrap.get(bArr9);
                }
            }
        }
    }

    public byte[] b() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        java.util.Properties properties = this.f510025a;
        if (properties.size() > 0) {
            byteArrayOutputStream.write(new byte[]{(byte) (84298576 & 255), (byte) ((84298576 & 65280) >> 8), (byte) ((84298576 & 16711680) >> 16), (byte) ((84298576 & 4278190080L) >> 24)});
            java.lang.String str = "";
            for (java.lang.Object obj : properties.keySet()) {
                str = str + obj + "=" + properties.getProperty((java.lang.String) obj) + com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e;
            }
            byte[] bytes = str.getBytes();
            int length = bytes.length;
            byteArrayOutputStream.write(new byte[]{(byte) (length & 255), (byte) ((length & 65280) >> 8)});
            byteArrayOutputStream.write(bytes);
        }
        byte[] bArr = this.f510026b;
        if (bArr != null && bArr.length > 0) {
            byteArrayOutputStream.write(new byte[]{(byte) (50613072 & 255), (byte) ((50613072 & 65280) >> 8), (byte) ((50613072 & 16711680) >> 16), (byte) ((50613072 & 4278190080L) >> 24)});
            int length2 = this.f510026b.length;
            byteArrayOutputStream.write(new byte[]{(byte) (length2 & 255), (byte) ((length2 & 65280) >> 8)});
            byteArrayOutputStream.write(this.f510026b);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
