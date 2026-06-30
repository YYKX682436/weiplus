package o45;

/* loaded from: classes8.dex */
public class oi extends o45.ah implements o45.yg {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f424525a = "";

    /* renamed from: b, reason: collision with root package name */
    public int f424526b = 0;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f424527c = new byte[0];

    @Override // o45.yg
    /* renamed from: fromProtoBuf */
    public int mo13863x347f4535(byte[] bArr) {
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTypingSend", "parse tail failed, empty buf");
        } else {
            try {
                java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.ByteArrayInputStream(bArr));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTypingSend", "parseTailFields funId:%s", java.lang.Integer.valueOf(dataInputStream.readInt()));
                int readShort = dataInputStream.readShort();
                if (readShort < 0) {
                    throw new java.io.IOException("content empty");
                }
                byte[] bArr2 = new byte[readShort];
                this.f424527c = bArr2;
                dataInputStream.readFully(bArr2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTypingSend", "content len=" + this.f424527c.length);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTypingSend", "direct parse all failed, err=" + e17.getMessage());
            }
        }
        gm0.j1.i();
        long h17 = gm0.j1.b().h() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        gm0.j1.i();
        byte[] m46283x8bf68b4b = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46283x8bf68b4b(com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46299x21dcc5(java.lang.String.valueOf(h17).getBytes(), gm0.j1.n().c(1), "TYPING_MSG", 32), this.f424527c);
        if (m46283x8bf68b4b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTypingSend", "parse content failed, empty buf");
            return -1;
        }
        r45.wl5 wl5Var = new r45.wl5();
        wl5Var.mo11468x92b714fd(m46283x8bf68b4b);
        java.lang.String i17 = wl5Var.f470793f.i();
        this.f424525a = i17;
        int i18 = wl5Var.f470792e;
        this.f424526b = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMTypingSend", "fromProtoBuf sender:%s, status:%s", i17, java.lang.Integer.valueOf(i18));
        return 0;
    }

    @Override // o45.ah
    /* renamed from: getCmdId */
    public int mo13864x7443ca3f() {
        return 1000000637;
    }

    @Override // o45.ah, o45.yg
    /* renamed from: isRawData */
    public boolean mo150581x182b0f68() {
        return true;
    }
}
