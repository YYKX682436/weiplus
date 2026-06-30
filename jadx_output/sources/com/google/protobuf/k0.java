package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class k0 extends com.google.protobuf.p {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.logging.Logger f45246b = java.util.logging.Logger.getLogger(com.google.protobuf.k0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f45247c = com.google.protobuf.ib.f45207f;

    /* renamed from: a, reason: collision with root package name */
    public com.google.protobuf.l0 f45248a;

    public k0(com.google.protobuf.f0 f0Var) {
    }

    public static int b(int i17, boolean z17) {
        return p(i17) + 1;
    }

    public static int c(int i17, com.google.protobuf.y yVar) {
        int p17 = p(i17);
        int size = yVar.size();
        return p17 + r(size) + size;
    }

    public static int d(com.google.protobuf.y yVar) {
        int size = yVar.size();
        return r(size) + size;
    }

    public static int e(int i17, double d17) {
        return p(i17) + 8;
    }

    public static int f(int i17, int i18) {
        return p(i17) + l(i18);
    }

    public static int g(int i17, int i18) {
        return p(i17) + 4;
    }

    public static int h(int i17, long j17) {
        return p(i17) + 8;
    }

    public static int i(int i17, float f17) {
        return p(i17) + 4;
    }

    public static int j(int i17, com.google.protobuf.o8 o8Var, com.google.protobuf.q9 q9Var) {
        return (p(i17) * 2) + ((com.google.protobuf.f) o8Var).getSerializedSize(q9Var);
    }

    public static int k(int i17, int i18) {
        return p(i17) + l(i18);
    }

    public static int l(int i17) {
        if (i17 >= 0) {
            return r(i17);
        }
        return 10;
    }

    public static int m(int i17, long j17) {
        return p(i17) + t(j17);
    }

    public static int n(int i17, com.google.protobuf.o8 o8Var) {
        int p17 = p(i17);
        int serializedSize = o8Var.getSerializedSize();
        return p17 + r(serializedSize) + serializedSize;
    }

    public static int o(java.lang.String str) {
        int length;
        try {
            length = com.google.protobuf.ob.b(str);
        } catch (com.google.protobuf.mb unused) {
            length = str.getBytes(com.google.protobuf.w6.f45648a).length;
        }
        return r(length) + length;
    }

    public static int p(int i17) {
        return r((i17 << 3) | 0);
    }

    public static int q(int i17, int i18) {
        return p(i17) + r(i18);
    }

    public static int r(int i17) {
        if ((i17 & (-128)) == 0) {
            return 1;
        }
        if ((i17 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i17) == 0) {
            return 3;
        }
        return (i17 & com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHF_MASKPROC) == 0 ? 4 : 5;
    }

    public static int s(int i17, long j17) {
        return p(i17) + t(j17);
    }

    public static int t(long j17) {
        int i17;
        if (((-128) & j17) == 0) {
            return 1;
        }
        if (j17 < 0) {
            return 10;
        }
        if (((-34359738368L) & j17) != 0) {
            j17 >>>= 28;
            i17 = 6;
        } else {
            i17 = 2;
        }
        if (((-2097152) & j17) != 0) {
            i17 += 2;
            j17 >>>= 14;
        }
        return (j17 & (-16384)) != 0 ? i17 + 1 : i17;
    }

    public abstract void A(com.google.protobuf.y yVar);

    public final void B(int i17, double d17) {
        E(i17, java.lang.Double.doubleToRawLongBits(d17));
    }

    public abstract void C(int i17, int i18);

    public abstract void D(int i17);

    public abstract void E(int i17, long j17);

    public abstract void F(long j17);

    public final void G(int i17, float f17) {
        C(i17, java.lang.Float.floatToRawIntBits(f17));
    }

    public abstract void H(int i17, int i18);

    public abstract void I(int i17);

    public abstract void J(int i17, com.google.protobuf.o8 o8Var);

    public abstract void K(int i17, com.google.protobuf.o8 o8Var, com.google.protobuf.q9 q9Var);

    public abstract void L(com.google.protobuf.o8 o8Var);

    public abstract void M(int i17, com.google.protobuf.o8 o8Var);

    public abstract void N(int i17, com.google.protobuf.y yVar);

    public abstract void O(int i17, java.lang.String str);

    public abstract void P(java.lang.String str);

    public abstract void Q(int i17, int i18);

    public abstract void R(int i17, int i18);

    public abstract void S(int i17);

    public abstract void T(int i17, long j17);

    public abstract void U(long j17);

    public final void u(java.lang.String str, com.google.protobuf.mb mbVar) {
        f45246b.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) mbVar);
        byte[] bytes = str.getBytes(com.google.protobuf.w6.f45648a);
        try {
            S(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (com.google.protobuf.i0 e17) {
            throw e17;
        } catch (java.lang.IndexOutOfBoundsException e18) {
            throw new com.google.protobuf.i0(e18);
        }
    }

    public abstract int v();

    public abstract void w(byte b17);

    public abstract void x(int i17, boolean z17);

    public abstract void y(byte[] bArr, int i17, int i18);

    public abstract void z(int i17, com.google.protobuf.y yVar);
}
