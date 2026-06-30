package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class y implements java.lang.Iterable, java.io.Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.protobuf.y f45712e = new com.google.protobuf.w(com.google.protobuf.w6.f45650c);

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.protobuf.u f45713f;

    /* renamed from: d, reason: collision with root package name */
    public int f45714d = 0;

    static {
        f45713f = com.google.protobuf.i.a() ? new com.google.protobuf.x(null) : new com.google.protobuf.s(null);
    }

    public static int e(int i17, int i18, int i19) {
        int i27 = i18 - i17;
        if ((i17 | i18 | i27 | (i19 - i18)) >= 0) {
            return i27;
        }
        if (i17 < 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(32);
            sb6.append("Beginning index: ");
            sb6.append(i17);
            sb6.append(" < 0");
            throw new java.lang.IndexOutOfBoundsException(sb6.toString());
        }
        if (i18 < i17) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(66);
            sb7.append("Beginning index larger than ending index: ");
            sb7.append(i17);
            sb7.append(", ");
            sb7.append(i18);
            throw new java.lang.IndexOutOfBoundsException(sb7.toString());
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(37);
        sb8.append("End index: ");
        sb8.append(i18);
        sb8.append(" >= ");
        sb8.append(i19);
        throw new java.lang.IndexOutOfBoundsException(sb8.toString());
    }

    public static com.google.protobuf.y g(byte[] bArr, int i17, int i18) {
        e(i17, i17 + i18, bArr.length);
        return new com.google.protobuf.w(f45713f.a(bArr, i17, i18));
    }

    public static com.google.protobuf.y h(java.lang.String str) {
        return new com.google.protobuf.w(str.getBytes(com.google.protobuf.w6.f45648a));
    }

    public abstract byte d(int i17);

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int i17 = this.f45714d;
        if (i17 == 0) {
            int size = size();
            i17 = n(size, 0, size);
            if (i17 == 0) {
                i17 = 1;
            }
            this.f45714d = i17;
        }
        return i17;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract void j(byte[] bArr, int i17, int i18, int i19);

    public abstract byte k(int i17);

    public abstract boolean l();

    public abstract com.google.protobuf.d0 m();

    public abstract int n(int i17, int i18, int i19);

    public abstract com.google.protobuf.y o(int i17, int i18);

    public abstract java.lang.String p(java.nio.charset.Charset charset);

    public final java.lang.String r() {
        return size() == 0 ? "" : p(com.google.protobuf.w6.f45648a);
    }

    public abstract void s(com.google.protobuf.p pVar);

    public abstract int size();

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(size());
        objArr[2] = size() <= 50 ? com.google.protobuf.ma.a(this) : java.lang.String.valueOf(com.google.protobuf.ma.a(o(0, 47))).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
