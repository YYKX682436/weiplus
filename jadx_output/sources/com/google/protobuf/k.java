package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class k {
    public static int a(byte[] bArr, int i17, com.google.protobuf.j jVar) {
        int l17 = l(bArr, i17, jVar);
        int i18 = jVar.f45211a;
        if (i18 < 0) {
            throw com.google.protobuf.y6.f();
        }
        if (i18 > bArr.length - l17) {
            throw com.google.protobuf.y6.i();
        }
        if (i18 == 0) {
            jVar.f45213c = com.google.protobuf.y.f45712e;
            return l17;
        }
        jVar.f45213c = com.google.protobuf.y.g(bArr, l17, i18);
        return l17 + i18;
    }

    public static int b(byte[] bArr, int i17) {
        return ((bArr[i17 + 3] & 255) << 24) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16);
    }

    public static long c(byte[] bArr, int i17) {
        return ((bArr[i17 + 7] & 255) << 56) | (bArr[i17] & 255) | ((bArr[i17 + 1] & 255) << 8) | ((bArr[i17 + 2] & 255) << 16) | ((bArr[i17 + 3] & 255) << 24) | ((bArr[i17 + 4] & 255) << 32) | ((bArr[i17 + 5] & 255) << 40) | ((bArr[i17 + 6] & 255) << 48);
    }

    public static int d(com.google.protobuf.q9 q9Var, byte[] bArr, int i17, int i18, int i19, com.google.protobuf.j jVar) {
        com.google.protobuf.x8 x8Var = (com.google.protobuf.x8) q9Var;
        java.lang.Object g17 = x8Var.g();
        int E = x8Var.E(g17, bArr, i17, i18, i19, jVar);
        x8Var.e(g17);
        jVar.f45213c = g17;
        return E;
    }

    public static int e(com.google.protobuf.q9 q9Var, byte[] bArr, int i17, int i18, com.google.protobuf.j jVar) {
        int i19 = i17 + 1;
        int i27 = bArr[i17];
        if (i27 < 0) {
            i19 = k(i27, bArr, i19, jVar);
            i27 = jVar.f45211a;
        }
        int i28 = i19;
        if (i27 < 0 || i27 > i18 - i28) {
            throw com.google.protobuf.y6.i();
        }
        java.lang.Object g17 = q9Var.g();
        int i29 = i27 + i28;
        q9Var.d(g17, bArr, i28, i29, jVar);
        q9Var.e(g17);
        jVar.f45213c = g17;
        return i29;
    }

    public static int f(com.google.protobuf.q9 q9Var, int i17, byte[] bArr, int i18, int i19, com.google.protobuf.v6 v6Var, com.google.protobuf.j jVar) {
        int e17 = e(q9Var, bArr, i18, i19, jVar);
        v6Var.add(jVar.f45213c);
        while (e17 < i19) {
            int l17 = l(bArr, e17, jVar);
            if (i17 != jVar.f45211a) {
                break;
            }
            e17 = e(q9Var, bArr, l17, i19, jVar);
            v6Var.add(jVar.f45213c);
        }
        return e17;
    }

    public static int g(byte[] bArr, int i17, com.google.protobuf.v6 v6Var, com.google.protobuf.j jVar) {
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) v6Var;
        int l17 = l(bArr, i17, jVar);
        int i18 = jVar.f45211a + l17;
        while (l17 < i18) {
            l17 = l(bArr, l17, jVar);
            m6Var.e(jVar.f45211a);
        }
        if (l17 == i18) {
            return l17;
        }
        throw com.google.protobuf.y6.i();
    }

    public static int h(byte[] bArr, int i17, com.google.protobuf.j jVar) {
        int l17 = l(bArr, i17, jVar);
        int i18 = jVar.f45211a;
        if (i18 < 0) {
            throw com.google.protobuf.y6.f();
        }
        if (i18 == 0) {
            jVar.f45213c = "";
            return l17;
        }
        jVar.f45213c = new java.lang.String(bArr, l17, i18, com.google.protobuf.w6.f45648a);
        return l17 + i18;
    }

    public static int i(byte[] bArr, int i17, com.google.protobuf.j jVar) {
        int l17 = l(bArr, i17, jVar);
        int i18 = jVar.f45211a;
        if (i18 < 0) {
            throw com.google.protobuf.y6.f();
        }
        if (i18 == 0) {
            jVar.f45213c = "";
            return l17;
        }
        jVar.f45213c = com.google.protobuf.ob.f45371a.a(bArr, l17, i18);
        return l17 + i18;
    }

    public static int j(int i17, byte[] bArr, int i18, int i19, com.google.protobuf.xa xaVar, com.google.protobuf.j jVar) {
        if ((i17 >>> 3) == 0) {
            throw com.google.protobuf.y6.b();
        }
        int i27 = i17 & 7;
        if (i27 == 0) {
            int n17 = n(bArr, i18, jVar);
            xaVar.d(i17, java.lang.Long.valueOf(jVar.f45212b));
            return n17;
        }
        if (i27 == 1) {
            xaVar.d(i17, java.lang.Long.valueOf(c(bArr, i18)));
            return i18 + 8;
        }
        if (i27 == 2) {
            int l17 = l(bArr, i18, jVar);
            int i28 = jVar.f45211a;
            if (i28 < 0) {
                throw com.google.protobuf.y6.f();
            }
            if (i28 > bArr.length - l17) {
                throw com.google.protobuf.y6.i();
            }
            if (i28 == 0) {
                xaVar.d(i17, com.google.protobuf.y.f45712e);
            } else {
                xaVar.d(i17, com.google.protobuf.y.g(bArr, l17, i28));
            }
            return l17 + i28;
        }
        if (i27 != 3) {
            if (i27 != 5) {
                throw com.google.protobuf.y6.b();
            }
            xaVar.d(i17, java.lang.Integer.valueOf(b(bArr, i18)));
            return i18 + 4;
        }
        com.google.protobuf.xa xaVar2 = new com.google.protobuf.xa();
        int i29 = (i17 & (-8)) | 4;
        int i37 = 0;
        while (true) {
            if (i18 >= i19) {
                break;
            }
            int l18 = l(bArr, i18, jVar);
            int i38 = jVar.f45211a;
            if (i38 == i29) {
                i37 = i38;
                i18 = l18;
                break;
            }
            i37 = i38;
            i18 = j(i38, bArr, l18, i19, xaVar2, jVar);
        }
        if (i18 > i19 || i37 != i29) {
            throw com.google.protobuf.y6.g();
        }
        xaVar.d(i17, xaVar2);
        return i18;
    }

    public static int k(int i17, byte[] bArr, int i18, com.google.protobuf.j jVar) {
        int i19 = i17 & 127;
        int i27 = i18 + 1;
        byte b17 = bArr[i18];
        if (b17 >= 0) {
            jVar.f45211a = i19 | (b17 << 7);
            return i27;
        }
        int i28 = i19 | ((b17 & Byte.MAX_VALUE) << 7);
        int i29 = i27 + 1;
        byte b18 = bArr[i27];
        if (b18 >= 0) {
            jVar.f45211a = i28 | (b18 << 14);
            return i29;
        }
        int i37 = i28 | ((b18 & Byte.MAX_VALUE) << 14);
        int i38 = i29 + 1;
        byte b19 = bArr[i29];
        if (b19 >= 0) {
            jVar.f45211a = i37 | (b19 << 21);
            return i38;
        }
        int i39 = i37 | ((b19 & Byte.MAX_VALUE) << 21);
        int i47 = i38 + 1;
        byte b27 = bArr[i38];
        if (b27 >= 0) {
            jVar.f45211a = i39 | (b27 << 28);
            return i47;
        }
        int i48 = i39 | ((b27 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i49 = i47 + 1;
            if (bArr[i47] >= 0) {
                jVar.f45211a = i48;
                return i49;
            }
            i47 = i49;
        }
    }

    public static int l(byte[] bArr, int i17, com.google.protobuf.j jVar) {
        int i18 = i17 + 1;
        byte b17 = bArr[i17];
        if (b17 < 0) {
            return k(b17, bArr, i18, jVar);
        }
        jVar.f45211a = b17;
        return i18;
    }

    public static int m(int i17, byte[] bArr, int i18, int i19, com.google.protobuf.v6 v6Var, com.google.protobuf.j jVar) {
        com.google.protobuf.m6 m6Var = (com.google.protobuf.m6) v6Var;
        int l17 = l(bArr, i18, jVar);
        m6Var.e(jVar.f45211a);
        while (l17 < i19) {
            int l18 = l(bArr, l17, jVar);
            if (i17 != jVar.f45211a) {
                break;
            }
            l17 = l(bArr, l18, jVar);
            m6Var.e(jVar.f45211a);
        }
        return l17;
    }

    public static int n(byte[] bArr, int i17, com.google.protobuf.j jVar) {
        int i18 = i17 + 1;
        long j17 = bArr[i17];
        if (j17 >= 0) {
            jVar.f45212b = j17;
            return i18;
        }
        int i19 = i18 + 1;
        byte b17 = bArr[i18];
        long j18 = (j17 & 127) | ((b17 & Byte.MAX_VALUE) << 7);
        int i27 = 7;
        while (b17 < 0) {
            int i28 = i19 + 1;
            i27 += 7;
            j18 |= (r10 & Byte.MAX_VALUE) << i27;
            b17 = bArr[i19];
            i19 = i28;
        }
        jVar.f45212b = j18;
        return i19;
    }

    public static int o(int i17, byte[] bArr, int i18, int i19, com.google.protobuf.j jVar) {
        if ((i17 >>> 3) == 0) {
            throw com.google.protobuf.y6.b();
        }
        int i27 = i17 & 7;
        if (i27 == 0) {
            return n(bArr, i18, jVar);
        }
        if (i27 == 1) {
            return i18 + 8;
        }
        if (i27 == 2) {
            return l(bArr, i18, jVar) + jVar.f45211a;
        }
        if (i27 != 3) {
            if (i27 == 5) {
                return i18 + 4;
            }
            throw com.google.protobuf.y6.b();
        }
        int i28 = (i17 & (-8)) | 4;
        int i29 = 0;
        while (i18 < i19) {
            i18 = l(bArr, i18, jVar);
            i29 = jVar.f45211a;
            if (i29 == i28) {
                break;
            }
            i18 = o(i29, bArr, i18, i19, jVar);
        }
        if (i18 > i19 || i29 != i28) {
            throw com.google.protobuf.y6.g();
        }
        return i18;
    }
}
