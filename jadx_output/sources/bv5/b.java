package bv5;

/* loaded from: classes16.dex */
public class b implements cv5.a, cv5.b {

    /* renamed from: c, reason: collision with root package name */
    public static final short[] f24759c = new short[0];

    /* renamed from: d, reason: collision with root package name */
    public static final av5.k[] f24760d = new av5.k[0];

    /* renamed from: e, reason: collision with root package name */
    public static final av5.j[] f24761e = new av5.j[0];

    /* renamed from: a, reason: collision with root package name */
    public java.nio.ByteBuffer f24762a;

    /* renamed from: b, reason: collision with root package name */
    public int f24763b;

    public b(java.nio.ByteBuffer byteBuffer) {
        this.f24762a = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        this.f24763b = byteBuffer.limit();
    }

    public final void a(int i17) {
        this.f24762a.position();
        this.f24762a.limit();
    }

    public av5.a b() {
        int position = this.f24762a.position();
        byte readByte = readByte();
        int position2 = this.f24762a.position();
        new av5.d0(this, 29).f();
        byte[] bArr = new byte[this.f24762a.position() - position2];
        this.f24762a.position(position2);
        this.f24762a.get(bArr);
        return new av5.a(position, readByte, new av5.b0(position2, bArr));
    }

    public av5.b c() {
        int position = this.f24762a.position();
        int m17 = m();
        int[] iArr = new int[m17];
        for (int i17 = 0; i17 < m17; i17++) {
            iArr[i17] = m();
        }
        return new av5.b(position, iArr);
    }

    public av5.c d() {
        int position = this.f24762a.position();
        int m17 = m();
        int[] iArr = new int[m17];
        for (int i17 = 0; i17 < m17; i17++) {
            iArr[i17] = m();
        }
        return new av5.c(position, iArr);
    }

    @Override // cv5.b
    public void e(int i17) {
        a(1);
        this.f24762a.put((byte) i17);
        if (this.f24762a.position() > this.f24763b) {
            this.f24763b = this.f24762a.position();
        }
    }

    public av5.d f() {
        int position = this.f24762a.position();
        int m17 = m();
        int m18 = m();
        int m19 = m();
        int m27 = m();
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, m18, 2);
        for (int i17 = 0; i17 < m18; i17++) {
            iArr[i17][0] = m();
            iArr[i17][1] = m();
        }
        int[][] iArr2 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, m19, 2);
        for (int i18 = 0; i18 < m19; i18++) {
            iArr2[i18][0] = m();
            iArr2[i18][1] = m();
        }
        int[][] iArr3 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, m27, 2);
        for (int i19 = 0; i19 < m27; i19++) {
            iArr3[i19][0] = m();
            iArr3[i19][1] = m();
        }
        return new av5.d(position, m17, iArr, iArr2, iArr3);
    }

    public av5.h g() {
        int position = this.f24762a.position();
        int b17 = av5.f0.b(this);
        int b18 = av5.f0.b(this);
        int b19 = av5.f0.b(this);
        int b27 = av5.f0.b(this);
        av5.f[] fVarArr = new av5.f[b17];
        int i17 = 0;
        for (int i18 = 0; i18 < b17; i18++) {
            i17 += av5.f0.b(this);
            fVarArr[i18] = new av5.f(i17, av5.f0.b(this));
        }
        av5.f[] fVarArr2 = new av5.f[b18];
        int i19 = 0;
        for (int i27 = 0; i27 < b18; i27++) {
            i19 += av5.f0.b(this);
            fVarArr2[i27] = new av5.f(i19, av5.f0.b(this));
        }
        return new av5.h(position, fVarArr, fVarArr2, p(b19), p(b27));
    }

    public av5.i h() {
        return new av5.i(this.f24762a.position(), m(), m(), m(), m(), m(), m(), m(), m());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        r2[r8] = new av5.k(r9, r10, r14);
        r8 = r8 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public av5.l i() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bv5.b.i():av5.l");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0035. Please report as an issue. */
    public av5.m j() {
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        int position = this.f24762a.position();
        int b17 = av5.f0.b(this);
        int b18 = av5.f0.b(this);
        int[] iArr = new int[b18];
        for (int i17 = 0; i17 < b18; i17++) {
            iArr[i17] = av5.f0.b(this) - 1;
        }
        try {
            byteArrayOutputStream = new java.io.ByteArrayOutputStream(64);
        } catch (java.lang.Throwable th6) {
            th = th6;
            byteArrayOutputStream = null;
        }
        try {
            bv5.a aVar = new bv5.a(this, byteArrayOutputStream);
            while (true) {
                byte readByte = readByte();
                byteArrayOutputStream.write(readByte);
                if (readByte != 9) {
                    switch (readByte) {
                        case 1:
                            av5.f0.d(aVar, av5.f0.b(this));
                            break;
                        case 2:
                            av5.f0.c(aVar, av5.f0.a(this));
                            break;
                        case 3:
                        case 4:
                            av5.f0.d(aVar, av5.f0.b(this));
                            av5.f0.d(aVar, (av5.f0.b(this) - 1) + 1);
                            av5.f0.d(aVar, (av5.f0.b(this) - 1) + 1);
                            if (readByte == 4) {
                                av5.f0.d(aVar, (av5.f0.b(this) - 1) + 1);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                        case 6:
                            av5.f0.d(aVar, av5.f0.b(this));
                            break;
                    }
                    av5.m mVar = new av5.m(position, b17, iArr, byteArrayOutputStream.toByteArray());
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Exception unused) {
                    }
                    return mVar;
                }
                av5.f0.d(aVar, (av5.f0.b(this) - 1) + 1);
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th;
        }
    }

    public av5.b0 k() {
        int position = this.f24762a.position();
        new av5.d0(this, 28).f();
        byte[] bArr = new byte[this.f24762a.position() - position];
        this.f24762a.position(position);
        this.f24762a.get(bArr);
        return new av5.b0(position, bArr);
    }

    public av5.e0 l() {
        return new av5.e0(this.f24762a.position(), t(), t(), m());
    }

    public int m() {
        return this.f24762a.getInt();
    }

    public av5.h0 n() {
        int position = this.f24762a.position();
        int t17 = t();
        for (av5.g0 g0Var : av5.g0.values()) {
            if (g0Var.f14376d == t17) {
                return new av5.h0(position, g0Var, t(), t(), t());
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(t17));
    }

    public av5.i0 o() {
        return new av5.i0(this.f24762a.position(), t(), t(), m());
    }

    public final av5.g[] p(int i17) {
        av5.g[] gVarArr = new av5.g[i17];
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            i18 += av5.f0.b(this);
            gVarArr[i19] = new av5.g(i18, av5.f0.b(this), av5.f0.b(this));
        }
        return gVarArr;
    }

    public av5.k0 q() {
        return new av5.k0(this.f24762a.position(), m(), m(), m());
    }

    public av5.l0 r() {
        int position = this.f24762a.position();
        try {
            int b17 = av5.f0.b(this);
            java.lang.String a17 = av5.j0.a(this, new char[b17]);
            if (a17.length() == b17) {
                return new av5.l0(position, a17);
            }
            throw new av5.z("Declared length " + b17 + " doesn't match decoded length of " + a17.length());
        } catch (java.io.UTFDataFormatException e17) {
            throw new av5.z(e17);
        }
    }

    @Override // cv5.a
    public byte readByte() {
        return this.f24762a.get();
    }

    public av5.p0 s() {
        short[] sArr;
        int position = this.f24762a.position();
        int m17 = m();
        if (m17 == 0) {
            sArr = f24759c;
        } else {
            short[] sArr2 = new short[m17];
            for (int i17 = 0; i17 < m17; i17++) {
                sArr2[i17] = this.f24762a.getShort();
            }
            sArr = sArr2;
        }
        return new av5.p0(position, sArr);
    }

    public int t() {
        return this.f24762a.getShort() & 65535;
    }

    public void u(int i17) {
        if (i17 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        java.nio.ByteBuffer byteBuffer = this.f24762a;
        byteBuffer.position(byteBuffer.position() + i17);
    }

    public void v(byte[] bArr) {
        a(bArr.length * 1);
        this.f24762a.put(bArr);
        if (this.f24762a.position() > this.f24763b) {
            this.f24763b = this.f24762a.position();
        }
    }

    public void w(int i17) {
        a(4);
        this.f24762a.putInt(i17);
        if (this.f24762a.position() > this.f24763b) {
            this.f24763b = this.f24762a.position();
        }
    }

    public final void x(av5.g[] gVarArr) {
        int length = gVarArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            av5.g gVar = gVarArr[i17];
            av5.f0.d(this, gVar.f14372d - i18);
            av5.f0.d(this, gVar.f14373e);
            av5.f0.d(this, gVar.f14374f);
            i17++;
            i18 = gVar.f14372d;
        }
    }

    public void y(short s17) {
        a(2);
        this.f24762a.putShort(s17);
        if (this.f24762a.position() > this.f24763b) {
            this.f24763b = this.f24762a.position();
        }
    }

    public void z(int i17) {
        short s17 = (short) i17;
        if (i17 == (65535 & s17)) {
            y(s17);
        } else {
            throw new java.lang.IllegalArgumentException("Expected an unsigned short: " + i17);
        }
    }
}
