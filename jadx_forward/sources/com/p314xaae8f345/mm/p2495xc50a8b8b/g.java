package com.p314xaae8f345.mm.p2495xc50a8b8b;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2495xc50a8b8b.g f273688b = new com.p314xaae8f345.mm.p2495xc50a8b8b.g();

    /* renamed from: a, reason: collision with root package name */
    public byte[] f273689a;

    public g() {
        this(new byte[0], 0, 0);
    }

    public static com.p314xaae8f345.mm.p2495xc50a8b8b.g a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = new com.p314xaae8f345.mm.p2495xc50a8b8b.g();
        gVar.f273689a = str.getBytes(str2);
        return gVar;
    }

    public static com.p314xaae8f345.mm.p2495xc50a8b8b.g b(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new com.p314xaae8f345.mm.p2495xc50a8b8b.g(bArr, 0, bArr.length);
    }

    public static com.p314xaae8f345.mm.p2495xc50a8b8b.g c(java.lang.String str) {
        try {
            return a(str, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException e17) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
        }
    }

    public void d(byte[] bArr, int i17) {
        byte[] bArr2 = this.f273689a;
        java.lang.System.arraycopy(bArr2, 0, bArr, i17, bArr2.length);
    }

    public byte[] e() {
        return this.f273689a;
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f(int i17) {
        byte[] bArr = new byte[i17];
        byte[] bArr2 = this.f273689a;
        if (bArr2.length >= i17) {
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, i17 - 1);
            this.f273689a = bArr;
        } else {
            java.lang.System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            this.f273689a = bArr;
        }
        return this;
    }

    public byte[] g() {
        byte[] bArr = this.f273689a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public java.lang.String h(java.lang.String str) {
        return new java.lang.String(this.f273689a, str);
    }

    public java.lang.String i() {
        byte[] bArr;
        int i17 = 0;
        while (true) {
            try {
                bArr = this.f273689a;
                if (i17 >= bArr.length || bArr[i17] == 0) {
                    break;
                }
                i17++;
            } catch (java.io.UnsupportedEncodingException unused) {
                throw new java.lang.RuntimeException("UTF-8 not supported?");
            }
        }
        return new java.lang.String(bArr, 0, i17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
    }

    public g(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public g(byte[] bArr, int i17, int i18) {
        byte[] bArr2 = new byte[i18];
        this.f273689a = bArr2;
        java.lang.System.arraycopy(bArr, i17, bArr2, 0, i18);
    }
}
