package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f126524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126525b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f126526c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.e0 f126527d;

    public d0(com.p176xb6135e39.p283xc50a8b8b.z zVar) {
    }

    public static int b(int i17) {
        return (-(i17 & 1)) ^ (i17 >>> 1);
    }

    public static long c(long j17) {
        return (-(j17 & 1)) ^ (j17 >>> 1);
    }

    public static com.p176xb6135e39.p283xc50a8b8b.d0 g(java.io.InputStream inputStream) {
        if (inputStream != null) {
            return new com.p176xb6135e39.p283xc50a8b8b.b0(inputStream, 4096, null);
        }
        byte[] bArr = com.p176xb6135e39.p283xc50a8b8b.w6.f127183c;
        return i(bArr, 0, bArr.length, false);
    }

    public static com.p176xb6135e39.p283xc50a8b8b.d0 h(java.nio.ByteBuffer byteBuffer, boolean z17) {
        if (byteBuffer.hasArray()) {
            return i(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z17);
        }
        if (byteBuffer.isDirect() && com.p176xb6135e39.p283xc50a8b8b.ib.f126739e) {
            return new com.p176xb6135e39.p283xc50a8b8b.c0(byteBuffer, z17, null);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return i(bArr, 0, remaining, true);
    }

    public static com.p176xb6135e39.p283xc50a8b8b.d0 i(byte[] bArr, int i17, int i18, boolean z17) {
        com.p176xb6135e39.p283xc50a8b8b.a0 a0Var = new com.p176xb6135e39.p283xc50a8b8b.a0(bArr, i17, i18, z17, null);
        try {
            a0Var.k(i18);
            return a0Var;
        } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
            throw new java.lang.IllegalArgumentException(e17);
        }
    }

    public static int y(int i17, java.io.InputStream inputStream) {
        if ((i17 & 128) == 0) {
            return i17;
        }
        int i18 = i17 & 127;
        int i19 = 7;
        while (i19 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
            }
            i18 |= (read & 127) << i19;
            if ((read & 128) == 0) {
                return i18;
            }
            i19 += 7;
        }
        while (i19 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw com.p176xb6135e39.p283xc50a8b8b.y6.i();
            }
            if ((read2 & 128) == 0) {
                return i18;
            }
            i19 += 7;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.y6.e();
    }

    public abstract long A();

    public abstract int B();

    public abstract long C();

    public abstract java.lang.String D();

    public abstract java.lang.String E();

    public abstract int F();

    public abstract int G();

    public abstract long H();

    public abstract boolean I(int i17);

    public abstract void a(int i17);

    public abstract int d();

    public abstract int e();

    public abstract boolean f();

    public abstract void j(int i17);

    public abstract int k(int i17);

    public abstract boolean l();

    public abstract com.p176xb6135e39.p283xc50a8b8b.y m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract void s(int i17, com.p176xb6135e39.p283xc50a8b8b.n8 n8Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var);

    public abstract int t();

    public abstract long u();

    public abstract com.p176xb6135e39.p283xc50a8b8b.o8 v(com.p176xb6135e39.p283xc50a8b8b.e9 e9Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var);

    public abstract void w(com.p176xb6135e39.p283xc50a8b8b.n8 n8Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var);

    public abstract int x();

    public abstract int z();
}
