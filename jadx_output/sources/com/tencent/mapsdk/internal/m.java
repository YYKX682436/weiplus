package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    protected java.lang.String f50407a = "GBK";

    /* renamed from: b, reason: collision with root package name */
    private java.nio.ByteBuffer f50408b;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public byte f50409a;

        /* renamed from: b, reason: collision with root package name */
        public int f50410b;

        private void a() {
            this.f50409a = (byte) 0;
            this.f50410b = 0;
        }
    }

    public m() {
    }

    private void b(byte[] bArr) {
        a(bArr);
    }

    private java.util.Map<java.lang.String, java.lang.String> d(int i17, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (b(i17)) {
            com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
            a(aVar);
            if (aVar.f50409a != 8) {
                throw new com.tencent.mapsdk.internal.j("type mismatch.");
            }
            int a17 = a(0, 0, true);
            if (a17 < 0) {
                throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
            }
            for (int i18 = 0; i18 < a17; i18++) {
                hashMap.put(b(0, true), b(1, true));
            }
        } else if (z17) {
            throw new com.tencent.mapsdk.internal.j("require field not exist.");
        }
        return hashMap;
    }

    private java.util.List e(int i17, boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (b(i17)) {
            com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
            a(aVar);
            if (aVar.f50409a != 9) {
                throw new com.tencent.mapsdk.internal.j("type mismatch.");
            }
            int a17 = a(0, 0, true);
            if (a17 < 0) {
                throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
            }
            for (int i18 = 0; i18 < a17; i18++) {
                com.tencent.mapsdk.internal.m.a aVar2 = new com.tencent.mapsdk.internal.m.a();
                a(aVar2);
                switch (aVar2.f50409a) {
                    case 0:
                        a(1);
                        break;
                    case 1:
                        a(2);
                        break;
                    case 2:
                        a(4);
                        break;
                    case 3:
                        a(8);
                        break;
                    case 4:
                        a(4);
                        break;
                    case 5:
                        a(8);
                        break;
                    case 6:
                        int i19 = this.f50408b.get();
                        if (i19 < 0) {
                            i19 += 256;
                        }
                        a(i19);
                        break;
                    case 7:
                        a(this.f50408b.getInt());
                        break;
                    case 8:
                    case 9:
                        break;
                    case 10:
                        try {
                            com.tencent.mapsdk.internal.p pVar = (com.tencent.mapsdk.internal.p) java.lang.Class.forName(com.tencent.mapsdk.internal.p.class.getName()).getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                            pVar.readFrom(this);
                            a();
                            arrayList.add(pVar);
                            break;
                        } catch (java.lang.Exception e17) {
                            throw new com.tencent.mapsdk.internal.j("type mismatch.".concat(java.lang.String.valueOf(e17)));
                        }
                    case 11:
                    default:
                        throw new com.tencent.mapsdk.internal.j("type mismatch.");
                    case 12:
                        arrayList.add(0);
                        break;
                }
            }
        } else if (z17) {
            throw new com.tencent.mapsdk.internal.j("require field not exist.");
        }
        return arrayList;
    }

    private boolean[] f(int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        if (aVar.f50409a != 9) {
            throw new com.tencent.mapsdk.internal.j("type mismatch.");
        }
        int a17 = a(0, 0, true);
        if (a17 < 0) {
            throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
        }
        boolean[] zArr = new boolean[a17];
        for (int i18 = 0; i18 < a17; i18++) {
            zArr[i18] = a(0, true);
        }
        return zArr;
    }

    private short[] g(int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        if (aVar.f50409a != 9) {
            throw new com.tencent.mapsdk.internal.j("type mismatch.");
        }
        int a17 = a(0, 0, true);
        if (a17 < 0) {
            throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
        }
        short[] sArr = new short[a17];
        for (int i18 = 0; i18 < a17; i18++) {
            sArr[i18] = a(sArr[0], 0, true);
        }
        return sArr;
    }

    private int[] h(int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        if (aVar.f50409a != 9) {
            throw new com.tencent.mapsdk.internal.j("type mismatch.");
        }
        int a17 = a(0, 0, true);
        if (a17 < 0) {
            throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
        }
        int[] iArr = new int[a17];
        for (int i18 = 0; i18 < a17; i18++) {
            iArr[i18] = a(iArr[0], 0, true);
        }
        return iArr;
    }

    private long[] i(int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        if (aVar.f50409a != 9) {
            throw new com.tencent.mapsdk.internal.j("type mismatch.");
        }
        int a17 = a(0, 0, true);
        if (a17 < 0) {
            throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
        }
        long[] jArr = new long[a17];
        for (int i18 = 0; i18 < a17; i18++) {
            jArr[i18] = a(jArr[0], 0, true);
        }
        return jArr;
    }

    private float[] j(int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        if (aVar.f50409a != 9) {
            throw new com.tencent.mapsdk.internal.j("type mismatch.");
        }
        int a17 = a(0, 0, true);
        if (a17 < 0) {
            throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
        }
        float[] fArr = new float[a17];
        for (int i18 = 0; i18 < a17; i18++) {
            fArr[i18] = a(fArr[0], 0, true);
        }
        return fArr;
    }

    private double[] k(int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        if (aVar.f50409a != 9) {
            throw new com.tencent.mapsdk.internal.j("type mismatch.");
        }
        int a17 = a(0, 0, true);
        if (a17 < 0) {
            throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
        }
        double[] dArr = new double[a17];
        for (int i18 = 0; i18 < a17; i18++) {
            dArr[i18] = a(dArr[0], 0, true);
        }
        return dArr;
    }

    public final void a(byte[] bArr) {
        this.f50408b = java.nio.ByteBuffer.wrap(bArr);
    }

    public final byte[] c(int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b17 = aVar.f50409a;
        if (b17 == 9) {
            int a17 = a(0, 0, true);
            if (a17 >= 0 && a17 <= this.f50408b.capacity()) {
                byte[] bArr = new byte[a17];
                for (int i18 = 0; i18 < a17; i18++) {
                    bArr[i18] = a(bArr[0], 0, true);
                }
                return bArr;
            }
            throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
        }
        if (b17 == 13) {
            com.tencent.mapsdk.internal.m.a aVar2 = new com.tencent.mapsdk.internal.m.a();
            a(aVar2);
            if (aVar2.f50409a == 0) {
                int a18 = a(0, 0, true);
                if (a18 >= 0 && a18 <= this.f50408b.capacity()) {
                    byte[] bArr2 = new byte[a18];
                    this.f50408b.get(bArr2);
                    return bArr2;
                }
                throw new com.tencent.mapsdk.internal.j("invalid size, tag: " + i17 + ", type: " + ((int) aVar.f50409a) + ", " + ((int) aVar2.f50409a) + ", size: " + a18);
            }
            throw new com.tencent.mapsdk.internal.j("type mismatch, tag: " + i17 + ", type: " + ((int) aVar.f50409a) + ", " + ((int) aVar2.f50409a));
        }
        throw new com.tencent.mapsdk.internal.j("type mismatch.");
    }

    private static int a(com.tencent.mapsdk.internal.m.a aVar, java.nio.ByteBuffer byteBuffer) {
        byte b17 = byteBuffer.get();
        aVar.f50409a = (byte) (b17 & 15);
        int i17 = (b17 & 240) >> 4;
        aVar.f50410b = i17;
        if (i17 != 15) {
            return 1;
        }
        aVar.f50410b = byteBuffer.get() & 255;
        return 2;
    }

    private int b(com.tencent.mapsdk.internal.m.a aVar) {
        return a(aVar, this.f50408b.duplicate());
    }

    private m(java.nio.ByteBuffer byteBuffer) {
        this.f50408b = byteBuffer;
    }

    private boolean b(int i17) {
        com.tencent.mapsdk.internal.m.a aVar;
        int i18;
        try {
            aVar = new com.tencent.mapsdk.internal.m.a();
            while (true) {
                int a17 = a(aVar, this.f50408b.duplicate());
                i18 = aVar.f50410b;
                if (i17 <= i18 || aVar.f50409a == 11) {
                    break;
                }
                a(a17);
                a(aVar.f50409a);
            }
        } catch (com.tencent.mapsdk.internal.j | java.nio.BufferUnderflowException unused) {
        }
        return aVar.f50409a != 11 && i17 == i18;
    }

    public m(byte[] bArr) {
        this.f50408b = java.nio.ByteBuffer.wrap(bArr);
    }

    private void a(com.tencent.mapsdk.internal.m.a aVar) {
        a(aVar, this.f50408b);
    }

    private void a(int i17) {
        java.nio.ByteBuffer byteBuffer = this.f50408b;
        byteBuffer.position(byteBuffer.position() + i17);
    }

    private void a() {
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        do {
            a(aVar);
            a(aVar.f50409a);
        } while (aVar.f50409a != 11);
    }

    public m(byte[] bArr, byte b17) {
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        this.f50408b = wrap;
        wrap.position(4);
    }

    private void b() {
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        a(aVar.f50409a);
    }

    private void a(byte b17) {
        int i17 = 0;
        switch (b17) {
            case 0:
                a(1);
                return;
            case 1:
                a(2);
                return;
            case 2:
                a(4);
                return;
            case 3:
                a(8);
                return;
            case 4:
                a(4);
                return;
            case 5:
                a(8);
                return;
            case 6:
                int i18 = this.f50408b.get();
                if (i18 < 0) {
                    i18 += 256;
                }
                a(i18);
                return;
            case 7:
                a(this.f50408b.getInt());
                return;
            case 8:
                int a17 = a(0, 0, true);
                while (i17 < a17 * 2) {
                    b();
                    i17++;
                }
                return;
            case 9:
                int a18 = a(0, 0, true);
                while (i17 < a18) {
                    b();
                    i17++;
                }
                return;
            case 10:
                a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
                a(aVar);
                if (aVar.f50409a == 0) {
                    a(a(0, 0, true));
                    return;
                }
                throw new com.tencent.mapsdk.internal.j("skipField with invalid type, type value: " + ((int) b17) + ", " + ((int) aVar.f50409a));
            default:
                throw new com.tencent.mapsdk.internal.j("invalid type.");
        }
    }

    private java.lang.String b(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return str;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b17 = aVar.f50409a;
        if (b17 == 6) {
            int i18 = this.f50408b.get();
            if (i18 < 0) {
                i18 += 256;
            }
            byte[] bArr = new byte[i18];
            this.f50408b.get(bArr);
            try {
                str2 = new java.lang.String(bArr, this.f50407a);
            } catch (java.io.UnsupportedEncodingException unused) {
                str2 = new java.lang.String(bArr);
            }
        } else if (b17 == 7) {
            int i19 = this.f50408b.getInt();
            if (i19 <= 104857600 && i19 >= 0 && i19 <= this.f50408b.capacity()) {
                byte[] bArr2 = new byte[i19];
                this.f50408b.get(bArr2);
                try {
                    str2 = new java.lang.String(bArr2, this.f50407a);
                } catch (java.io.UnsupportedEncodingException unused2) {
                    str2 = new java.lang.String(bArr2);
                }
            } else {
                throw new com.tencent.mapsdk.internal.j("String too long: ".concat(java.lang.String.valueOf(i19)));
            }
        } else {
            throw new com.tencent.mapsdk.internal.j("type mismatch.");
        }
        return str2;
    }

    private java.nio.ByteBuffer c() {
        return this.f50408b;
    }

    public final java.lang.String b(int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b17 = aVar.f50409a;
        if (b17 == 6) {
            int i18 = this.f50408b.get();
            if (i18 < 0) {
                i18 += 256;
            }
            byte[] bArr = new byte[i18];
            this.f50408b.get(bArr);
            try {
                return new java.lang.String(bArr, this.f50407a);
            } catch (java.io.UnsupportedEncodingException unused) {
                return new java.lang.String(bArr);
            }
        }
        if (b17 == 7) {
            int i19 = this.f50408b.getInt();
            if (i19 <= 104857600 && i19 >= 0 && i19 <= this.f50408b.capacity()) {
                byte[] bArr2 = new byte[i19];
                this.f50408b.get(bArr2);
                try {
                    return new java.lang.String(bArr2, this.f50407a);
                } catch (java.io.UnsupportedEncodingException unused2) {
                    return new java.lang.String(bArr2);
                }
            }
            throw new com.tencent.mapsdk.internal.j("String too long: ".concat(java.lang.String.valueOf(i19)));
        }
        throw new com.tencent.mapsdk.internal.j("type mismatch.");
    }

    public final boolean a(int i17, boolean z17) {
        return a((byte) 0, i17, z17) != 0;
    }

    public final byte a(byte b17, int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return b17;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b18 = aVar.f50409a;
        if (b18 == 0) {
            return this.f50408b.get();
        }
        if (b18 == 12) {
            return (byte) 0;
        }
        throw new com.tencent.mapsdk.internal.j("type mismatch.");
    }

    public final short a(short s17, int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return s17;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b17 = aVar.f50409a;
        if (b17 == 0) {
            return this.f50408b.get();
        }
        if (b17 == 1) {
            return this.f50408b.getShort();
        }
        if (b17 == 12) {
            return (short) 0;
        }
        throw new com.tencent.mapsdk.internal.j("type mismatch.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] b(T t17, int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        if (aVar.f50409a == 9) {
            int a17 = a(0, 0, true);
            if (a17 >= 0) {
                T[] tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(t17.getClass(), a17));
                for (int i18 = 0; i18 < a17; i18++) {
                    tArr[i18] = a((com.tencent.mapsdk.internal.m) t17, 0, true);
                }
                return tArr;
            }
            throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
        }
        throw new com.tencent.mapsdk.internal.j("type mismatch.");
    }

    public final int a(int i17, int i18, boolean z17) {
        if (!b(i18)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return i17;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b17 = aVar.f50409a;
        if (b17 == 0) {
            return this.f50408b.get();
        }
        if (b17 == 1) {
            return this.f50408b.getShort();
        }
        if (b17 == 2) {
            return this.f50408b.getInt();
        }
        if (b17 == 12) {
            return 0;
        }
        throw new com.tencent.mapsdk.internal.j("type mismatch.");
    }

    public final long a(long j17, int i17, boolean z17) {
        int i18;
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return j17;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b17 = aVar.f50409a;
        if (b17 == 0) {
            i18 = this.f50408b.get();
        } else if (b17 == 1) {
            i18 = this.f50408b.getShort();
        } else {
            if (b17 != 2) {
                if (b17 == 3) {
                    return this.f50408b.getLong();
                }
                if (b17 == 12) {
                    return 0L;
                }
                throw new com.tencent.mapsdk.internal.j("type mismatch.");
            }
            i18 = this.f50408b.getInt();
        }
        return i18;
    }

    public final float a(float f17, int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return f17;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b17 = aVar.f50409a;
        if (b17 == 4) {
            return this.f50408b.getFloat();
        }
        if (b17 == 12) {
            return 0.0f;
        }
        throw new com.tencent.mapsdk.internal.j("type mismatch.");
    }

    public final double a(double d17, int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return d17;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b17 = aVar.f50409a;
        if (b17 == 4) {
            return this.f50408b.getFloat();
        }
        if (b17 == 5) {
            return this.f50408b.getDouble();
        }
        if (b17 == 12) {
            return 0.0d;
        }
        throw new com.tencent.mapsdk.internal.j("type mismatch.");
    }

    private java.lang.String a(java.lang.String str, int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return str;
        }
        com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
        a(aVar);
        byte b17 = aVar.f50409a;
        if (b17 == 6) {
            int i18 = this.f50408b.get();
            if (i18 < 0) {
                i18 += 256;
            }
            byte[] bArr = new byte[i18];
            this.f50408b.get(bArr);
            return com.tencent.mapsdk.internal.i.a(bArr);
        }
        if (b17 == 7) {
            int i19 = this.f50408b.getInt();
            if (i19 <= 104857600 && i19 >= 0 && i19 <= this.f50408b.capacity()) {
                byte[] bArr2 = new byte[i19];
                this.f50408b.get(bArr2);
                return com.tencent.mapsdk.internal.i.a(bArr2);
            }
            throw new com.tencent.mapsdk.internal.j("String too long: ".concat(java.lang.String.valueOf(i19)));
        }
        throw new com.tencent.mapsdk.internal.j("type mismatch.");
    }

    private java.lang.String[] a(java.lang.String[] strArr, int i17, boolean z17) {
        return (java.lang.String[]) a((java.lang.Object[]) strArr, i17, z17);
    }

    public final <K, V> java.util.HashMap<K, V> a(java.util.Map<K, V> map, int i17, boolean z17) {
        return (java.util.HashMap) a(new java.util.HashMap(), map, i17, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> java.util.Map<K, V> a(java.util.Map<K, V> map, java.util.Map<K, V> map2, int i17, boolean z17) {
        if (map2 != null && !map2.isEmpty()) {
            java.util.Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (b(i17)) {
                com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
                a(aVar);
                if (aVar.f50409a == 8) {
                    int a17 = a(0, 0, true);
                    if (a17 < 0) {
                        throw new com.tencent.mapsdk.internal.j("size invalid: ".concat(java.lang.String.valueOf(a17)));
                    }
                    for (int i18 = 0; i18 < a17; i18++) {
                        map.put(a((com.tencent.mapsdk.internal.m) key, 0, true), a((com.tencent.mapsdk.internal.m) value, 1, true));
                    }
                } else {
                    throw new com.tencent.mapsdk.internal.j("type mismatch.");
                }
            } else if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return map;
        }
        return new java.util.HashMap();
    }

    private <T> T[] a(T[] tArr, int i17, boolean z17) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) b((com.tencent.mapsdk.internal.m) tArr[0], i17, z17);
        }
        throw new com.tencent.mapsdk.internal.j("unable to get type of key and value.");
    }

    private <T> java.util.List<T> a(java.util.List<T> list, int i17, boolean z17) {
        if (list != null && !list.isEmpty()) {
            java.lang.Object[] b17 = b((com.tencent.mapsdk.internal.m) list.get(0), i17, z17);
            if (b17 == null) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : b17) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        return new java.util.ArrayList();
    }

    public final com.tencent.mapsdk.internal.p a(com.tencent.mapsdk.internal.p pVar) {
        if (b(0)) {
            try {
                com.tencent.mapsdk.internal.p newInit = pVar.newInit();
                com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
                a(aVar);
                if (aVar.f50409a == 10) {
                    newInit.readFrom(this);
                    a();
                    return newInit;
                }
                throw new com.tencent.mapsdk.internal.j("type mismatch.");
            } catch (java.lang.Exception e17) {
                throw new com.tencent.mapsdk.internal.j(e17.getMessage());
            }
        }
        throw new com.tencent.mapsdk.internal.j("require field not exist.");
    }

    public final com.tencent.mapsdk.internal.p a(com.tencent.mapsdk.internal.p pVar, int i17, boolean z17) {
        if (!b(i17)) {
            if (z17) {
                throw new com.tencent.mapsdk.internal.j("require field not exist.");
            }
            return null;
        }
        try {
            com.tencent.mapsdk.internal.p pVar2 = (com.tencent.mapsdk.internal.p) pVar.getClass().newInstance();
            com.tencent.mapsdk.internal.m.a aVar = new com.tencent.mapsdk.internal.m.a();
            a(aVar);
            if (aVar.f50409a == 10) {
                pVar2.readFrom(this);
                a();
                return pVar2;
            }
            throw new com.tencent.mapsdk.internal.j("type mismatch.");
        } catch (java.lang.Exception e17) {
            throw new com.tencent.mapsdk.internal.j(e17.getMessage());
        }
    }

    private com.tencent.mapsdk.internal.p[] a(com.tencent.mapsdk.internal.p[] pVarArr, int i17, boolean z17) {
        return (com.tencent.mapsdk.internal.p[]) a((java.lang.Object[]) pVarArr, i17, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> java.lang.Object a(T t17, int i17, boolean z17) {
        if (t17 instanceof java.lang.Byte) {
            return java.lang.Byte.valueOf(a((byte) 0, i17, z17));
        }
        if (t17 instanceof java.lang.Boolean) {
            return java.lang.Boolean.valueOf(a(i17, z17));
        }
        if (t17 instanceof java.lang.Short) {
            return java.lang.Short.valueOf(a((short) 0, i17, z17));
        }
        if (t17 instanceof java.lang.Integer) {
            return java.lang.Integer.valueOf(a(0, i17, z17));
        }
        if (t17 instanceof java.lang.Long) {
            return java.lang.Long.valueOf(a(0L, i17, z17));
        }
        if (t17 instanceof java.lang.Float) {
            return java.lang.Float.valueOf(a(0.0f, i17, z17));
        }
        if (t17 instanceof java.lang.Double) {
            return java.lang.Double.valueOf(a(0.0d, i17, z17));
        }
        if (t17 instanceof java.lang.String) {
            return b(i17, z17);
        }
        if (t17 instanceof java.util.Map) {
            return a((java.util.Map) t17, i17, z17);
        }
        if (t17 instanceof java.util.List) {
            return a((java.util.List) t17, i17, z17);
        }
        if (t17 instanceof com.tencent.mapsdk.internal.p) {
            return a((com.tencent.mapsdk.internal.p) t17, i17, z17);
        }
        if (t17.getClass().isArray()) {
            if (!(t17 instanceof byte[]) && !(t17 instanceof java.lang.Byte[])) {
                if (t17 instanceof boolean[]) {
                    return f(i17, z17);
                }
                if (t17 instanceof short[]) {
                    return g(i17, z17);
                }
                if (t17 instanceof int[]) {
                    return h(i17, z17);
                }
                if (t17 instanceof long[]) {
                    return i(i17, z17);
                }
                if (t17 instanceof float[]) {
                    return j(i17, z17);
                }
                if (t17 instanceof double[]) {
                    return k(i17, z17);
                }
                return a((java.lang.Object[]) t17, i17, z17);
            }
            return c(i17, z17);
        }
        throw new com.tencent.mapsdk.internal.j("read object error: unsupport type.");
    }

    public final int a(java.lang.String str) {
        this.f50407a = str;
        return 0;
    }
}
