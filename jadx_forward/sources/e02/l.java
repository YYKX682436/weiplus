package e02;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    public static final uk.p f327389c = new uk.p(38650);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Properties f327390a = new java.util.Properties();

    /* renamed from: b, reason: collision with root package name */
    public byte[] f327391b;

    public void a(byte[] bArr) {
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Channel.GameComment", "decode, data is null");
            return;
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        uk.p pVar = f327389c;
        byte[] bArr2 = new byte[2];
        wrap.get(bArr2);
        if (!pVar.m168192xb2c87fbf(new uk.p(bArr2))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Channel.GameComment", "decode, unknow protocol");
        }
        if (bArr.length - 2 <= 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Channel.GameComment", "decode, data.length - headLength <= 2");
            return;
        }
        byte[] bArr3 = new byte[2];
        wrap.get(bArr3);
        int i17 = ((bArr3[1] << 8) & 65280) + (bArr3[0] & 255);
        if ((bArr.length - 2) - 2 < i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Channel.GameComment", "decode, cooment content is empty");
            return;
        }
        byte[] bArr4 = new byte[i17];
        wrap.get(bArr4);
        try {
            this.f327390a.load(new java.io.InputStreamReader(new java.io.ByteArrayInputStream(bArr4), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
        } catch (java.io.IOException unused) {
        }
        int length = ((bArr.length - 2) - i17) - 2;
        if (length > 0) {
            byte[] bArr5 = new byte[length];
            this.f327391b = bArr5;
            wrap.get(bArr5);
        }
    }

    /* renamed from: toString */
    public java.lang.String m126559x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GameComment [p=");
        sb6.append(this.f327390a);
        sb6.append(", otherData=");
        byte[] bArr = this.f327391b;
        sb6.append(bArr == null ? "" : new java.lang.String(bArr));
        sb6.append("]");
        return sb6.toString();
    }
}
