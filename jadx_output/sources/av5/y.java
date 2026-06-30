package av5;

/* loaded from: classes16.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final short[] f14461e = new short[0];

    /* renamed from: a, reason: collision with root package name */
    public final av5.o0 f14462a;

    /* renamed from: b, reason: collision with root package name */
    public final av5.v f14463b;

    /* renamed from: c, reason: collision with root package name */
    public java.nio.ByteBuffer f14464c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f14465d;

    public y(int i17) {
        av5.o0 o0Var = new av5.o0();
        this.f14462a = o0Var;
        this.f14463b = new av5.v(this, null);
        new av5.w(this, null);
        new av5.x(this, null);
        new av5.t(this, null);
        new av5.q(this, null);
        new av5.s(this, null);
        new av5.o(this, null);
        new av5.r(this, null);
        new av5.p(this, null);
        this.f14465d = null;
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(new byte[i17]);
        this.f14464c = wrap;
        wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        o0Var.f14448y = i17;
    }

    public static void a(int i17, int i18) {
        if (i17 < 0 || i17 >= i18) {
            throw new java.lang.IndexOutOfBoundsException("index:" + i17 + ", length=" + i18);
        }
    }

    public byte[] b(boolean z17) {
        byte[] bArr = this.f14465d;
        if (bArr != null && !z17) {
            return bArr;
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
            byte[] bArr2 = new byte[8192];
            java.nio.ByteBuffer duplicate = this.f14464c.duplicate();
            duplicate.limit(duplicate.capacity());
            duplicate.position(32);
            while (duplicate.hasRemaining()) {
                int min = java.lang.Math.min(8192, duplicate.remaining());
                duplicate.get(bArr2, 0, min);
                messageDigest.update(bArr2, 0, min);
            }
            byte[] digest = messageDigest.digest();
            this.f14465d = digest;
            return digest;
        } catch (java.security.NoSuchAlgorithmException unused) {
            throw new java.lang.AssertionError();
        }
    }

    public av5.u c(int i17) {
        if (i17 < 0 || i17 >= this.f14464c.capacity()) {
            throw new java.lang.IllegalArgumentException("position=" + i17 + " length=" + this.f14464c.capacity());
        }
        java.nio.ByteBuffer duplicate = this.f14464c.duplicate();
        duplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        duplicate.position(i17);
        duplicate.limit(this.f14464c.capacity());
        return new av5.u(this, "temp-section", duplicate, null);
    }

    public av5.u d(av5.n0 n0Var) {
        int i17 = n0Var.f14421g;
        if (i17 < 0 || i17 >= this.f14464c.capacity()) {
            throw new java.lang.IllegalArgumentException("position=" + i17 + " length=" + this.f14464c.capacity());
        }
        java.nio.ByteBuffer duplicate = this.f14464c.duplicate();
        duplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        duplicate.position(i17);
        duplicate.limit(i17 + n0Var.f14422h);
        return new av5.u(this, "section", duplicate, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ce, code lost:
    
        throw new av5.z("Unexpected map value for 0x" + java.lang.Integer.toHexString(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d6, code lost:
    
        if (r5.equals("039") != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(java.io.InputStream r15) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: av5.y.<init>(java.io.InputStream):void");
    }
}
