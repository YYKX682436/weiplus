package org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f75074x7118e671 = false;

    /* renamed from: ARRAY_BYTE_BASE_OFFSET */
    static final int f75075x2e6b2650;

    /* renamed from: BIGENDIAN_MESSAGE_BUFFER */
    private static final java.lang.String f75076xdefbb7dc = "org.msgpack.core.buffer.MessageBufferBE";

    /* renamed from: DEFAULT_MESSAGE_BUFFER */
    private static final java.lang.String f75077x7c5f7d76 = "org.msgpack.core.buffer.MessageBuffer";

    /* renamed from: UNIVERSAL_MESSAGE_BUFFER */
    private static final java.lang.String f75078xee74fc2c = "org.msgpack.core.buffer.MessageBufferU";

    /* renamed from: isUniversalBuffer */
    static final boolean f75079xf359cbe1;

    /* renamed from: javaVersion */
    static final int f75080x6290c056;

    /* renamed from: mbArrConstructor */
    private static final java.lang.reflect.Constructor<?> f75081x729b5fce;

    /* renamed from: mbBBConstructor */
    private static final java.lang.reflect.Constructor<?> f75082x37a43c25;

    /* renamed from: unsafe */
    static final sun.misc.Unsafe f75083xcdead9a6;

    /* renamed from: address */
    protected final long f75084xbb979bf4;

    /* renamed from: base */
    protected final java.lang.Object f75085x2e06d1;

    /* renamed from: reference */
    protected final java.nio.ByteBuffer f75086xc8db3f4b;

    /* renamed from: size */
    protected final int f75087x35e001;

    /* JADX WARN: Removed duplicated region for block: B:106:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h.m155042x8c160ea9():void");
    }

    public h(byte[] bArr, int i17, int i18) {
        this.f75085x2e06d1 = bArr;
        this.f75084xbb979bf4 = f75075x2e6b2650 + i17;
        this.f75087x35e001 = i18;
        this.f75086xc8db3f4b = null;
    }

    public static org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h a(java.lang.reflect.Constructor constructor, java.lang.Object... objArr) {
        try {
            return (org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h) constructor.newInstance(objArr);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.IllegalStateException(e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.IllegalStateException(e18);
        } catch (java.lang.reflect.InvocationTargetException e19) {
            if (e19.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e19.getCause());
            }
            if (e19.getCause() instanceof java.lang.Error) {
                throw ((java.lang.Error) e19.getCause());
            }
            throw new java.lang.IllegalStateException(e19.getCause());
        }
    }

    /* renamed from: allocate */
    public static org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h m155043x6c090f3d(int i17) {
        if (i17 >= 0) {
            return m155046x37d04a(new byte[i17]);
        }
        throw new java.lang.IllegalArgumentException("size must not be negative");
    }

    public static org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h b(byte[] bArr, int i17, int i18) {
        bArr.getClass();
        java.lang.reflect.Constructor<?> constructor = f75081x729b5fce;
        return constructor != null ? a(constructor, bArr, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)) : new org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h(bArr, i17, i18);
    }

    /* renamed from: releaseBuffer */
    public static void m155044x9f0f4727(org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar) {
        if (f75079xf359cbe1 || hVar.mo155023x6bd7fdf()) {
            return;
        }
        if (!org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.g.f429385e.isInstance(hVar.f75086xc8db3f4b)) {
            f75083xcdead9a6.freeMemory(hVar.f75084xbb979bf4);
            return;
        }
        java.nio.ByteBuffer byteBuffer = hVar.f75086xc8db3f4b;
        try {
            if (f75080x6290c056 <= 8) {
                org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.g.f429382b.invoke(org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.g.f429381a.invoke(byteBuffer, new java.lang.Object[0]), new java.lang.Object[0]);
            } else {
                org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.g.f429383c.invoke(f75083xcdead9a6, byteBuffer);
            }
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    /* renamed from: wrap */
    public static org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h m155045x37d04a(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        java.lang.reflect.Constructor<?> constructor = f75082x37a43c25;
        if (constructor != null) {
            return a(constructor, byteBuffer);
        }
        return new org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h(byteBuffer);
    }

    /* renamed from: arrayOffset */
    public int m155048x2395dc4c() {
        return ((int) this.f75084xbb979bf4) - f75075x2e6b2650;
    }

    /* renamed from: getByte */
    public byte mo155015xfb7dc97e(int i17) {
        return f75083xcdead9a6.getByte(this.f75085x2e06d1, this.f75084xbb979bf4 + i17);
    }

    /* renamed from: getBytes */
    public void mo155017x743b66b5(int i17, byte[] bArr, int i18, int i19) {
        f75083xcdead9a6.copyMemory(this.f75085x2e06d1, this.f75084xbb979bf4 + i17, bArr, f75075x2e6b2650 + i18, i19);
    }

    /* renamed from: getInt */
    public int mo155020xb58848b9(int i17) {
        return java.lang.Integer.reverseBytes(f75083xcdead9a6.getInt(this.f75085x2e06d1, this.f75084xbb979bf4 + i17));
    }

    /* renamed from: getLong */
    public long mo155021xfb822ef2(int i17) {
        return java.lang.Long.reverseBytes(f75083xcdead9a6.getLong(this.f75085x2e06d1, this.f75084xbb979bf4 + i17));
    }

    /* renamed from: getShort */
    public short mo155022x75232ac6(int i17) {
        return java.lang.Short.reverseBytes(f75083xcdead9a6.getShort(this.f75085x2e06d1, this.f75084xbb979bf4 + i17));
    }

    /* renamed from: hasArray */
    public boolean mo155023x6bd7fdf() {
        return this.f75085x2e06d1 != null;
    }

    /* renamed from: putByte */
    public void mo155025xf2e368b7(int i17, byte b17) {
        f75083xcdead9a6.putByte(this.f75085x2e06d1, this.f75084xbb979bf4 + i17, b17);
    }

    /* renamed from: putByteBuffer */
    public void mo155026xcc8a43d7(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        if (byteBuffer.isDirect()) {
            f75083xcdead9a6.copyMemory((java.lang.Object) null, org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.g.a(byteBuffer) + byteBuffer.position(), this.f75085x2e06d1, this.f75084xbb979bf4 + i17, i18);
            byteBuffer.position(byteBuffer.position() + i18);
            return;
        }
        if (byteBuffer.hasArray()) {
            f75083xcdead9a6.copyMemory(byteBuffer.array(), f75075x2e6b2650 + byteBuffer.position(), this.f75085x2e06d1, this.f75084xbb979bf4 + i17, i18);
            byteBuffer.position(byteBuffer.position() + i18);
        } else {
            if (mo155023x6bd7fdf()) {
                byteBuffer.get((byte[]) this.f75085x2e06d1, i17, i18);
                return;
            }
            for (int i19 = 0; i19 < i18; i19++) {
                f75083xcdead9a6.putByte(this.f75085x2e06d1, this.f75084xbb979bf4 + i17, byteBuffer.get());
            }
        }
    }

    /* renamed from: putBytes */
    public void mo155027x6989ae9c(int i17, byte[] bArr, int i18, int i19) {
        f75083xcdead9a6.copyMemory(bArr, f75075x2e6b2650 + i18, this.f75085x2e06d1, this.f75084xbb979bf4 + i17, i19);
    }

    /* renamed from: putInt */
    public void mo155030xc5c55e60(int i17, int i18) {
        f75083xcdead9a6.putInt(this.f75085x2e06d1, this.f75084xbb979bf4 + i17, java.lang.Integer.reverseBytes(i18));
    }

    /* renamed from: putLong */
    public void mo155031xf2e7ce2b(int i17, long j17) {
        f75083xcdead9a6.putLong(this.f75085x2e06d1, i17 + this.f75084xbb979bf4, java.lang.Long.reverseBytes(j17));
    }

    /* renamed from: putMessageBuffer */
    public void mo155032xcf6e4c58(int i17, org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h hVar, int i18, int i19) {
        f75083xcdead9a6.copyMemory(hVar.f75085x2e06d1, hVar.f75084xbb979bf4 + i18, this.f75085x2e06d1, i17 + this.f75084xbb979bf4, i19);
    }

    /* renamed from: putShort */
    public void mo155033x6a7172ad(int i17, short s17) {
        f75083xcdead9a6.putShort(this.f75085x2e06d1, this.f75084xbb979bf4 + i17, java.lang.Short.reverseBytes(s17));
    }

    /* renamed from: size */
    public int m155049x35e001() {
        return this.f75087x35e001;
    }

    /* renamed from: slice */
    public org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h mo155034x6873d92(int i17, int i18) {
        if (i17 == 0 && i18 == m155049x35e001()) {
            return this;
        }
        if (i17 + i18 <= m155049x35e001()) {
            return new org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h(this.f75085x2e06d1, this.f75084xbb979bf4 + i17, i18);
        }
        throw new java.lang.IllegalArgumentException();
    }

    /* renamed from: sliceAsByteBuffer */
    public java.nio.ByteBuffer mo155036x18a93ec(int i17, int i18) {
        if (mo155023x6bd7fdf()) {
            return java.nio.ByteBuffer.wrap((byte[]) this.f75085x2e06d1, (int) ((this.f75084xbb979bf4 - f75075x2e6b2650) + i17), i18);
        }
        long j17 = this.f75084xbb979bf4;
        java.nio.ByteBuffer byteBuffer = this.f75086xc8db3f4b;
        java.lang.reflect.Constructor constructor = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.g.f429384d;
        if (constructor == null) {
            throw new java.lang.IllegalStateException("Can't create a new DirectByteBuffer. In JDK17+, two JVM options needs to be set: --add-opens=java.base/java.nio=ALL-UNNAMED and --add-opens=java.base/sun.nio.ch=ALL-UNNAMED");
        }
        try {
            int ordinal = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.g.f429386f.ordinal();
            if (ordinal == 0) {
                return (java.nio.ByteBuffer) constructor.newInstance(java.lang.Long.valueOf(j17 + i17), java.lang.Long.valueOf(i18));
            }
            if (ordinal == 1) {
                return (java.nio.ByteBuffer) constructor.newInstance(java.lang.Long.valueOf(j17 + i17), java.lang.Integer.valueOf(i18), byteBuffer);
            }
            if (ordinal == 2) {
                return (java.nio.ByteBuffer) constructor.newInstance(java.lang.Long.valueOf(j17 + i17), java.lang.Integer.valueOf(i18));
            }
            if (ordinal == 3) {
                return (java.nio.ByteBuffer) constructor.newInstance(java.lang.Integer.valueOf(((int) j17) + i17), java.lang.Integer.valueOf(i18));
            }
            if (ordinal == 4) {
                return (java.nio.ByteBuffer) constructor.newInstance(org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.g.f429387g.invoke(null, java.lang.Long.valueOf(j17 + i17), java.lang.Integer.valueOf(i18)), java.lang.Integer.valueOf(i18), 0);
            }
            throw new java.lang.IllegalStateException("Unexpected value");
        } catch (java.lang.Throwable th6) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    /* renamed from: toHexString */
    public java.lang.String m155050x72b50ad1(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 = i17; i19 < i18; i19++) {
            if (i19 != i17) {
                sb6.append(" ");
            }
            sb6.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(mo155015xfb7dc97e(i19))));
        }
        return sb6.toString();
    }

    /* renamed from: wrap */
    public static org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h m155046x37d04a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public h(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            if (f75079xf359cbe1) {
                this.f75085x2e06d1 = null;
                this.f75084xbb979bf4 = 0L;
                this.f75087x35e001 = byteBuffer.remaining();
                this.f75086xc8db3f4b = null;
                return;
            }
            this.f75085x2e06d1 = null;
            this.f75084xbb979bf4 = org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.g.a(byteBuffer) + byteBuffer.position();
            this.f75087x35e001 = byteBuffer.remaining();
            this.f75086xc8db3f4b = byteBuffer;
            return;
        }
        if (byteBuffer.hasArray()) {
            this.f75085x2e06d1 = byteBuffer.array();
            this.f75084xbb979bf4 = f75075x2e6b2650 + byteBuffer.arrayOffset() + byteBuffer.position();
            this.f75087x35e001 = byteBuffer.remaining();
            this.f75086xc8db3f4b = null;
            return;
        }
        throw new java.lang.IllegalArgumentException("Only the array-backed ByteBuffer or DirectBuffer is supported");
    }

    /* renamed from: wrap */
    public static org.p3364x5024611a.p3365x2eaf9f.p3366xaddb9440.h m155047x37d04a(byte[] bArr, int i17, int i18) {
        return b(bArr, i17, i18);
    }

    public h(java.lang.Object obj, long j17, int i17) {
        this.f75085x2e06d1 = obj;
        this.f75084xbb979bf4 = j17;
        this.f75087x35e001 = i17;
        this.f75086xc8db3f4b = null;
    }
}
