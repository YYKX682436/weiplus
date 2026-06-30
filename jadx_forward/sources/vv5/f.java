package vv5;

/* loaded from: classes13.dex */
public class f implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f522085d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f522086e;

    /* renamed from: f, reason: collision with root package name */
    public long f522087f;

    /* renamed from: g, reason: collision with root package name */
    public long f522088g;

    /* renamed from: h, reason: collision with root package name */
    public long f522089h;

    /* renamed from: i, reason: collision with root package name */
    public int f522090i;

    /* renamed from: m, reason: collision with root package name */
    public int f522091m;

    /* renamed from: n, reason: collision with root package name */
    public int f522092n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f522093o;

    /* renamed from: p, reason: collision with root package name */
    public long f522094p;

    /* renamed from: q, reason: collision with root package name */
    public final long f522095q;

    public f(vv5.f fVar) {
        this.f522087f = -1L;
        this.f522088g = -1L;
        this.f522089h = -1L;
        this.f522090i = -1;
        this.f522091m = -1;
        this.f522092n = -1;
        this.f522094p = -1L;
        this.f522095q = -1L;
        this.f522085d = fVar.f522085d;
        this.f522086e = fVar.f522086e;
        this.f522091m = fVar.f522091m;
        this.f522089h = fVar.f522089h;
        this.f522088g = fVar.f522088g;
        this.f522087f = fVar.f522087f;
        this.f522090i = fVar.f522090i;
        this.f522092n = fVar.f522092n;
        this.f522093o = fVar.f522093o;
        this.f522094p = fVar.f522094p;
        this.f522095q = fVar.f522095q;
    }

    public void a(int i17) {
        if (i17 == 0 || i17 == 8) {
            this.f522090i = i17;
        } else {
            throw new java.lang.IllegalArgumentException("Bad method: " + i17);
        }
    }

    public void b(long j17) {
        if (j17 >= 0) {
            this.f522089h = j17;
        } else {
            throw new java.lang.IllegalArgumentException("Bad size: " + j17);
        }
    }

    /* renamed from: clone */
    public java.lang.Object m172721x5a5dd5d() {
        try {
            vv5.f fVar = (vv5.f) super.clone();
            byte[] bArr = this.f522093o;
            fVar.f522093o = bArr != null ? (byte[]) bArr.clone() : null;
            return fVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.AssertionError(e17);
        }
    }

    /* renamed from: equals */
    public boolean m172722xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof vv5.f)) {
            return false;
        }
        return this.f522085d.equals(((vv5.f) obj).f522085d);
    }

    /* renamed from: hashCode */
    public int m172723x8cdac1b() {
        return this.f522085d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172724x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append("name:" + this.f522085d);
        stringBuffer.append("\ncomment:" + this.f522086e);
        stringBuffer.append("\ntime:" + this.f522091m);
        stringBuffer.append("\nsize:" + this.f522089h);
        stringBuffer.append("\ncompressedSize:" + this.f522088g);
        stringBuffer.append("\ncrc:" + this.f522087f);
        stringBuffer.append("\ncompressionMethod:" + this.f522090i);
        stringBuffer.append("\nmodDate:" + this.f522092n);
        stringBuffer.append("\nextra length:" + this.f522093o.length);
        stringBuffer.append("\nlocalHeaderRelOffset:" + this.f522094p);
        stringBuffer.append("\ndataOffset:" + this.f522095q);
        return stringBuffer.toString();
    }

    public f(byte[] bArr, java.io.InputStream inputStream, java.nio.charset.Charset charset, boolean z17) {
        boolean z18;
        this.f522087f = -1L;
        this.f522088g = -1L;
        this.f522089h = -1L;
        this.f522090i = -1;
        this.f522091m = -1;
        this.f522092n = -1;
        this.f522094p = -1L;
        this.f522095q = -1L;
        vv5.e.a(inputStream, bArr, 0, bArr.length);
        vv5.c cVar = new vv5.c(bArr, 0, bArr.length, java.nio.ByteOrder.LITTLE_ENDIAN);
        int a17 = cVar.a();
        if (a17 == 33639248) {
            cVar.f522082d = 8;
            int b17 = cVar.b() & 65535;
            if ((b17 & 1) == 0) {
                charset = (b17 & 2048) != 0 ? java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) : charset;
                this.f522090i = cVar.b() & 65535;
                this.f522091m = cVar.b() & 65535;
                this.f522092n = cVar.b() & 65535;
                this.f522087f = cVar.a() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                this.f522088g = cVar.a() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                this.f522089h = cVar.a() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                int b18 = cVar.b() & 65535;
                int b19 = cVar.b() & 65535;
                int b27 = 65535 & cVar.b();
                cVar.f522082d = 42;
                this.f522094p = cVar.a() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
                byte[] bArr2 = new byte[b18];
                vv5.e.a(inputStream, bArr2, 0, b18);
                int i17 = 0;
                while (true) {
                    if (i17 >= b18) {
                        z18 = false;
                        break;
                    } else {
                        if (bArr2[i17] == 0) {
                            z18 = true;
                            break;
                        }
                        i17++;
                    }
                }
                if (!z18) {
                    this.f522085d = new java.lang.String(bArr2, 0, b18, charset);
                    if (b19 > 0) {
                        byte[] bArr3 = new byte[b19];
                        this.f522093o = bArr3;
                        vv5.e.a(inputStream, bArr3, 0, b19);
                    }
                    if (b27 > 0) {
                        byte[] bArr4 = new byte[b27];
                        vv5.e.a(inputStream, bArr4, 0, b27);
                        this.f522086e = new java.lang.String(bArr4, 0, b27, charset);
                        return;
                    }
                    return;
                }
                throw new java.util.zip.ZipException("Filename contains NUL byte: " + java.util.Arrays.toString(bArr2));
            }
            throw new java.util.zip.ZipException("Invalid General Purpose Bit Flag: " + b17);
        }
        vv5.h.f(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a, inputStream.available(), com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a, 0L, "Central Directory Entry", a17);
        throw null;
    }
}
