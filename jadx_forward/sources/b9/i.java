package b9;

/* loaded from: classes15.dex */
public final class i implements z8.b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f99889a = t9.d0.f("ID3");

    public i(b9.g gVar) {
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1605x77519d44 c(t9.p pVar, int i17, int i18) {
        int r17;
        java.lang.String concat;
        int m17 = pVar.m();
        java.lang.String o17 = o(m17);
        int i19 = i17 - 1;
        byte[] bArr = new byte[i19];
        pVar.b(bArr, 0, i19);
        if (i18 == 2) {
            concat = "image/" + t9.d0.j(new java.lang.String(bArr, 0, 3, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
            if (concat.equals("image/jpg")) {
                concat = "image/jpeg";
            }
            r17 = 2;
        } else {
            r17 = r(bArr, 0);
            java.lang.String j17 = t9.d0.j(new java.lang.String(bArr, 0, r17, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
            concat = j17.indexOf(47) == -1 ? "image/".concat(j17) : j17;
        }
        int i27 = bArr[r17 + 1] & 255;
        int i28 = r17 + 2;
        int q17 = q(bArr, i28, m17);
        java.lang.String str = new java.lang.String(bArr, i28, q17 - i28, o17);
        int n17 = q17 + n(m17);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1605x77519d44(concat, str, i27, i19 <= n17 ? new byte[0] : java.util.Arrays.copyOfRange(bArr, n17, i19));
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1607xa5a13940 d(t9.p pVar, int i17, int i18, boolean z17, int i19, b9.g gVar) {
        int i27 = pVar.f498074b;
        int r17 = r(pVar.f498073a, i27);
        java.lang.String str = new java.lang.String(pVar.f498073a, i27, r17 - i27, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
        pVar.w(r17 + 1);
        int c17 = pVar.c();
        int c18 = pVar.c();
        long n17 = pVar.n();
        long j17 = n17 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 ? -1L : n17;
        long n18 = pVar.n();
        long j18 = n18 == io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 ? -1L : n18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i28 = i27 + i17;
        while (pVar.f498074b < i28) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 g17 = g(i18, pVar, z17, i19, gVar);
            if (g17 != null) {
                arrayList.add(g17);
            }
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[] abstractC1611xa43bd1f5Arr = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[arrayList.size()];
        arrayList.toArray(abstractC1611xa43bd1f5Arr);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1607xa5a13940(str, c17, c18, j17, j18, abstractC1611xa43bd1f5Arr);
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1608x95ae8052 e(t9.p pVar, int i17, int i18, boolean z17, int i19, b9.g gVar) {
        int i27 = pVar.f498074b;
        int r17 = r(pVar.f498073a, i27);
        java.lang.String str = new java.lang.String(pVar.f498073a, i27, r17 - i27, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
        pVar.w(r17 + 1);
        int m17 = pVar.m();
        boolean z18 = (m17 & 2) != 0;
        boolean z19 = (m17 & 1) != 0;
        int m18 = pVar.m();
        java.lang.String[] strArr = new java.lang.String[m18];
        for (int i28 = 0; i28 < m18; i28++) {
            int i29 = pVar.f498074b;
            int r18 = r(pVar.f498073a, i29);
            strArr[i28] = new java.lang.String(pVar.f498073a, i29, r18 - i29, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
            pVar.w(r18 + 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i37 = i27 + i17;
        while (pVar.f498074b < i37) {
            com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 g17 = g(i18, pVar, z17, i19, gVar);
            if (g17 != null) {
                arrayList.add(g17);
            }
        }
        com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[] abstractC1611xa43bd1f5Arr = new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5[arrayList.size()];
        arrayList.toArray(abstractC1611xa43bd1f5Arr);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1608x95ae8052(str, z18, z19, strArr, abstractC1611xa43bd1f5Arr);
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1609x37d6426e f(t9.p pVar, int i17) {
        if (i17 < 4) {
            return null;
        }
        int m17 = pVar.m();
        java.lang.String o17 = o(m17);
        byte[] bArr = new byte[3];
        pVar.b(bArr, 0, 3);
        java.lang.String str = new java.lang.String(bArr, 0, 3);
        int i18 = i17 - 4;
        byte[] bArr2 = new byte[i18];
        pVar.b(bArr2, 0, i18);
        int q17 = q(bArr2, 0, m17);
        java.lang.String str2 = new java.lang.String(bArr2, 0, q17, o17);
        int n17 = q17 + n(m17);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1609x37d6426e(str, str2, n17 < i18 ? new java.lang.String(bArr2, n17, q(bArr2, n17, m17) - n17, o17) : "");
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0182, code lost:
    
        if (r11 == 67) goto L137;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.AbstractC1611xa43bd1f5 g(int r20, t9.p r21, boolean r22, int r23, b9.g r24) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.i.g(int, t9.p, boolean, int, b9.g):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1610xb5efd49c h(t9.p pVar, int i17) {
        int m17 = pVar.m();
        java.lang.String o17 = o(m17);
        int i18 = i17 - 1;
        byte[] bArr = new byte[i18];
        pVar.b(bArr, 0, i18);
        int r17 = r(bArr, 0);
        java.lang.String str = new java.lang.String(bArr, 0, r17, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
        int i19 = r17 + 1;
        int q17 = q(bArr, i19, m17);
        java.lang.String str2 = new java.lang.String(bArr, i19, q17 - i19, o17);
        int n17 = q17 + n(m17);
        int q18 = q(bArr, n17, m17);
        java.lang.String str3 = new java.lang.String(bArr, n17, q18 - n17, o17);
        int n18 = q18 + n(m17);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1610xb5efd49c(str, str2, str3, i18 <= n18 ? new byte[0] : java.util.Arrays.copyOfRange(bArr, n18, i18));
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1612x17828bde i(t9.p pVar, int i17) {
        byte[] bArr = new byte[i17];
        pVar.b(bArr, 0, i17);
        int r17 = r(bArr, 0);
        java.lang.String str = new java.lang.String(bArr, 0, r17, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a);
        int i18 = r17 + 1;
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1612x17828bde(str, i17 <= i18 ? new byte[0] : java.util.Arrays.copyOfRange(bArr, i18, i17));
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e j(t9.p pVar, int i17, java.lang.String str) {
        if (i17 < 1) {
            return null;
        }
        int m17 = pVar.m();
        java.lang.String o17 = o(m17);
        int i18 = i17 - 1;
        byte[] bArr = new byte[i18];
        pVar.b(bArr, 0, i18);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e(str, null, new java.lang.String(bArr, 0, q(bArr, 0, m17), o17));
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e k(t9.p pVar, int i17) {
        if (i17 < 1) {
            return null;
        }
        int m17 = pVar.m();
        java.lang.String o17 = o(m17);
        int i18 = i17 - 1;
        byte[] bArr = new byte[i18];
        pVar.b(bArr, 0, i18);
        int q17 = q(bArr, 0, m17);
        java.lang.String str = new java.lang.String(bArr, 0, q17, o17);
        int n17 = q17 + n(m17);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1613xb01630e("TXXX", str, n17 < i18 ? new java.lang.String(bArr, n17, q(bArr, n17, m17) - n17, o17) : "");
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104 l(t9.p pVar, int i17, java.lang.String str) {
        byte[] bArr = new byte[i17];
        pVar.b(bArr, 0, i17);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104(str, null, new java.lang.String(bArr, 0, r(bArr, 0), com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a));
    }

    public static com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104 m(t9.p pVar, int i17) {
        if (i17 < 1) {
            return null;
        }
        int m17 = pVar.m();
        java.lang.String o17 = o(m17);
        int i18 = i17 - 1;
        byte[] bArr = new byte[i18];
        pVar.b(bArr, 0, i18);
        int q17 = q(bArr, 0, m17);
        java.lang.String str = new java.lang.String(bArr, 0, q17, o17);
        int n17 = q17 + n(m17);
        return new com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.id3.C1614xf5104("WXXX", str, n17 < i18 ? new java.lang.String(bArr, n17, r(bArr, n17) - n17, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a) : "");
    }

    public static int n(int i17) {
        return (i17 == 0 || i17 == 3) ? 1 : 2;
    }

    public static java.lang.String o(int i17) {
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3125x9fd75533.f11976x3730806a : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c : "UTF-16BE" : "UTF-16";
    }

    public static java.lang.String p(int i17, int i18, int i19, int i27, int i28) {
        return i17 == 2 ? java.lang.String.format(java.util.Locale.US, "%c%c%c", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27)) : java.lang.String.format(java.util.Locale.US, "%c%c%c%c", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
    }

    public static int q(byte[] bArr, int i17, int i18) {
        int r17 = r(bArr, i17);
        if (i18 == 0 || i18 == 3) {
            return r17;
        }
        while (r17 < bArr.length - 1) {
            if (r17 % 2 == 0 && bArr[r17 + 1] == 0) {
                return r17;
            }
            r17 = r(bArr, r17 + 1);
        }
        return bArr.length;
    }

    public static int r(byte[] bArr, int i17) {
        while (i17 < bArr.length) {
            if (bArr[i17] == 0) {
                return i17;
            }
            i17++;
        }
        return bArr.length;
    }

    public static int s(t9.p pVar, int i17) {
        byte[] bArr = pVar.f498073a;
        int i18 = pVar.f498074b;
        while (true) {
            int i19 = i18 + 1;
            if (i19 >= i17) {
                return i17;
            }
            if ((bArr[i18] & 255) == 255 && bArr[i19] == 0) {
                java.lang.System.arraycopy(bArr, i18 + 2, bArr, i19, (i17 - i18) - 2);
                i17--;
            }
            i18 = i19;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0085, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t(t9.p r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.i.t(t9.p, int, int, boolean):boolean");
    }

    @Override // z8.b
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f a(z8.e eVar) {
        java.nio.ByteBuffer byteBuffer = eVar.f425143f;
        return b(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003c, code lost:
    
        if (((r7 & 64) != 0) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.p179xe52d7b2f.C1603xe907df4f b(byte[] r12, int r13) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.i.b(byte[], int):com.google.android.exoplayer2.metadata.Metadata");
    }
}
