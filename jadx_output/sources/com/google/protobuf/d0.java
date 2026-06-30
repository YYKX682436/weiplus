package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f44991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44992b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f44993c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public com.google.protobuf.e0 f44994d;

    public d0(com.google.protobuf.z zVar) {
    }

    public static int b(int i17) {
        return (-(i17 & 1)) ^ (i17 >>> 1);
    }

    public static long c(long j17) {
        return (-(j17 & 1)) ^ (j17 >>> 1);
    }

    public static com.google.protobuf.d0 g(java.io.InputStream inputStream) {
        if (inputStream != null) {
            return new com.google.protobuf.b0(inputStream, 4096, null);
        }
        byte[] bArr = com.google.protobuf.w6.f45650c;
        return i(bArr, 0, bArr.length, false);
    }

    public static com.google.protobuf.d0 h(java.nio.ByteBuffer byteBuffer, boolean z17) {
        if (byteBuffer.hasArray()) {
            return i(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z17);
        }
        if (byteBuffer.isDirect() && com.google.protobuf.ib.f45206e) {
            return new com.google.protobuf.c0(byteBuffer, z17, null);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return i(bArr, 0, remaining, true);
    }

    public static com.google.protobuf.d0 i(byte[] bArr, int i17, int i18, boolean z17) {
        com.google.protobuf.a0 a0Var = new com.google.protobuf.a0(bArr, i17, i18, z17, null);
        try {
            a0Var.k(i18);
            return a0Var;
        } catch (com.google.protobuf.y6 e17) {
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
                throw com.google.protobuf.y6.i();
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
                throw com.google.protobuf.y6.i();
            }
            if ((read2 & 128) == 0) {
                return i18;
            }
            i19 += 7;
        }
        throw com.google.protobuf.y6.e();
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

    public abstract com.google.protobuf.y m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract void s(int i17, com.google.protobuf.n8 n8Var, com.google.protobuf.t4 t4Var);

    public abstract int t();

    public abstract long u();

    public abstract com.google.protobuf.o8 v(com.google.protobuf.e9 e9Var, com.google.protobuf.t4 t4Var);

    public abstract void w(com.google.protobuf.n8 n8Var, com.google.protobuf.t4 t4Var);

    public abstract int x();

    public abstract int z();
}
