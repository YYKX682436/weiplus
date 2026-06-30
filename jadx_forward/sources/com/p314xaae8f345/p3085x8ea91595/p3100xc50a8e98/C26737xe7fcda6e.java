package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98;

/* renamed from: com.tencent.tmassistantsdk.protocol.ProtocolPackage */
/* loaded from: classes13.dex */
public class C26737xe7fcda6e {

    /* renamed from: CRYPT_KEY */
    static final java.lang.String f56572x563bfce = "ji*9^&43U0X-~./(";

    /* renamed from: FLAG_CRYPT */
    static final byte f56573x825fdebb = 2;

    /* renamed from: FLAG_ZIP */
    static final byte f56574x8eebebae = 1;

    /* renamed from: ServerEncoding */
    public static final java.lang.String f56575x346c99d6 = "utf-8";
    private static final java.lang.String TAG = "ProtocolPackage";

    /* renamed from: ZIP_TRIGGER */
    static final int f56576xcee9525a = 256;

    /* renamed from: buildPostData */
    public static byte[] m105148xecf88f8(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26751xa4878a6f c26751xa4878a6f) {
        if (c26751xa4878a6f == null) {
            return null;
        }
        c26751xa4878a6f.f56683x30cde0.f56675x65a71584 = (byte) 0;
        byte[] bArr = c26751xa4878a6f.f56682x2e39a2;
        if (bArr.length > 256) {
            c26751xa4878a6f.f56682x2e39a2 = com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26738xfb9afa30.zip(bArr);
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26750xa473137e c26750xa473137e = c26751xa4878a6f.f56683x30cde0;
            c26750xa473137e.f56675x65a71584 = (byte) (c26750xa473137e.f56675x65a71584 | 1);
        }
        c26751xa4878a6f.f56682x2e39a2 = m105154xa0333265(c26751xa4878a6f.f56682x2e39a2, f56572x563bfce.getBytes());
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26750xa473137e c26750xa473137e2 = c26751xa4878a6f.f56683x30cde0;
        c26750xa473137e2.f56675x65a71584 = (byte) (c26750xa473137e2.f56675x65a71584 | 2);
        return m105157xa76917d5(c26751xa4878a6f);
    }

    /* renamed from: buildReportRequest */
    public static com.qq.taf.jce.AbstractC2861x7aec4921 m105149x1807eed(byte b17, java.util.List<byte[]> list, java.lang.String str, int i17, java.lang.String str2) {
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26748x1478f71f c26748x1478f71f = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26748x1478f71f();
        c26748x1478f71f.f56667x145e649e = b17;
        c26748x1478f71f.f56666x1456c50e = m105155x66ddd117(list);
        c26748x1478f71f.f56663x8acd8ad8 = str;
        c26748x1478f71f.f56664xe89fa33f = i17;
        c26748x1478f71f.f56665xc18c320e = str2;
        return c26748x1478f71f;
    }

    /* renamed from: buildRequest */
    public static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26751xa4878a6f m105150xf6024c41(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        if (abstractC2861x7aec4921 == null) {
            return null;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26751xa4878a6f c26751xa4878a6f = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26751xa4878a6f();
        c26751xa4878a6f.f56683x30cde0 = m105156x7f07b768(abstractC2861x7aec4921);
        c26751xa4878a6f.f56682x2e39a2 = m105157xa76917d5(abstractC2861x7aec4921);
        return c26751xa4878a6f;
    }

    /* renamed from: bytes2JceObj */
    public static com.qq.taf.jce.AbstractC2861x7aec4921 m105151x5686712(byte[] bArr, java.lang.Class<? extends com.qq.taf.jce.AbstractC2861x7aec4921> cls) {
        if (bArr == null) {
            return null;
        }
        try {
            com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e = new com.qq.taf.jce.C2859xe10ac61e(bArr);
            c2859xe10ac61e.m21323x26b402b8(f56575x346c99d6);
            com.qq.taf.jce.AbstractC2861x7aec4921 newInstance = cls.newInstance();
            newInstance.mo21234xcc442a60(c2859xe10ac61e);
            return newInstance;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: createFromRequest */
    private static com.qq.taf.jce.AbstractC2861x7aec4921 m105152x720630e9(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        if (abstractC2861x7aec4921 == null) {
            return null;
        }
        try {
            return (com.qq.taf.jce.AbstractC2861x7aec4921) java.lang.Class.forName(abstractC2861x7aec4921.getClass().getName().substring(0, r6.length() - 7) + "Response").newInstance();
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.IllegalAccessException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e18, "", new java.lang.Object[0]);
            return null;
        } catch (java.lang.InstantiationException e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e19, "", new java.lang.Object[0]);
            return null;
        }
    }

    /* renamed from: decrypt */
    public static byte[] m105153x5bf1598d(byte[] bArr, byte[] bArr2) {
        return new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26776xa1a7bfb1().m105476x5bf1598d(bArr, bArr2);
    }

    /* renamed from: encrypt */
    public static byte[] m105154xa0333265(byte[] bArr, byte[] bArr2) {
        return new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26776xa1a7bfb1().m105478xa0333265(bArr, bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: formatLogData */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m105155x66ddd117(java.util.List<byte[]> r8) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "ProtocolPackage"
            r2 = 0
            r3 = 0
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            r4.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4d
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
        L14:
            boolean r6 = r8.hasNext()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            if (r6 == 0) goto L28
            java.lang.Object r6 = r8.next()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            int r7 = r6.length     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            r5.writeInt(r7)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            r5.write(r6)     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            goto L14
        L28:
            byte[] r8 = r4.toByteArray()     // Catch: java.lang.Exception -> L41 java.lang.Throwable -> L6e
            r4.close()     // Catch: java.io.IOException -> L30
            goto L36
        L30:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r3, r0, r4)
        L36:
            r5.close()     // Catch: java.io.IOException -> L3a
            goto L40
        L3a:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r3, r0, r2)
        L40:
            return r8
        L41:
            r8 = move-exception
            goto L50
        L43:
            r8 = move-exception
            r5 = r3
        L45:
            r3 = r4
            goto L70
        L47:
            r8 = move-exception
            r5 = r3
            goto L50
        L4a:
            r8 = move-exception
            r5 = r3
            goto L70
        L4d:
            r8 = move-exception
            r4 = r3
            r5 = r4
        L50:
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r6)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L61
            r4.close()     // Catch: java.io.IOException -> L5b
            goto L61
        L5b:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r4)
        L61:
            if (r5 == 0) goto L6d
            r5.close()     // Catch: java.io.IOException -> L67
            goto L6d
        L67:
            r8 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r0, r2)
        L6d:
            return r3
        L6e:
            r8 = move-exception
            goto L45
        L70:
            if (r3 == 0) goto L7c
            r3.close()     // Catch: java.io.IOException -> L76
            goto L7c
        L76:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r3, r0, r4)
        L7c:
            if (r5 == 0) goto L88
            r5.close()     // Catch: java.io.IOException -> L82
            goto L88
        L82:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r3, r0, r2)
        L88:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.m105155x66ddd117(java.util.List):byte[]");
    }

    /* renamed from: getReqHead */
    public static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26750xa473137e m105156x7f07b768(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        if (abstractC2861x7aec4921 == null) {
            return null;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26750xa473137e c26750xa473137e = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26750xa473137e();
        c26750xa473137e.f56677x295c940a = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105487x7655dada();
        c26750xa473137e.f56674x5a623f5 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105493x33b0ad8d(abstractC2861x7aec4921.getClass().getSimpleName().substring(0, r3.length() - 7));
        c26750xa473137e.qua = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().f56838x32c710;
        c26750xa473137e.f56676xc2a4e117 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105496xc2125261();
        c26750xa473137e.f56678xb997927c = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26757xbd71f69c();
        c26750xa473137e.f56672x820f0e88 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105497x3f2a2e75();
        c26750xa473137e.f56673xb14d7127 = com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105498x28d5ae1a();
        return c26750xa473137e;
    }

    /* renamed from: jceStructToUTF8Byte */
    public static byte[] m105157xa76917d5(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921) {
        if (abstractC2861x7aec4921 == null) {
            return null;
        }
        com.qq.taf.jce.C2860x6de9642d c2860x6de9642d = new com.qq.taf.jce.C2860x6de9642d();
        c2860x6de9642d.m21333x26b402b8(f56575x346c99d6);
        abstractC2861x7aec4921.mo21235x5f8be6ba(c2860x6de9642d);
        return c2860x6de9642d.m21334x5f01b1f6();
    }

    /* renamed from: unpackPackage */
    public static com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26752xef917861 m105158xf8cb93b4(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26752xef917861 c26752xef917861 = new com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26752xef917861();
            try {
                com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e = new com.qq.taf.jce.C2859xe10ac61e(bArr);
                c2859xe10ac61e.m21323x26b402b8(f56575x346c99d6);
                c26752xef917861.mo21234xcc442a60(c2859xe10ac61e);
                com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26754xbc48d4af c26754xbc48d4af = c26752xef917861.f56688x30cde0;
                if (c26754xbc48d4af.ret == 0) {
                    if ((c26754xbc48d4af.f56698x65a71584 & 2) == 2) {
                        c26752xef917861.f56687x2e39a2 = m105153x5bf1598d(c26752xef917861.f56687x2e39a2, f56572x563bfce.getBytes());
                    }
                    if ((c26752xef917861.f56688x30cde0.f56698x65a71584 & 1) == 1) {
                        c26752xef917861.f56687x2e39a2 = com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26738xfb9afa30.m105160x6a495e8(c26752xef917861.f56687x2e39a2);
                    }
                    com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26777x43a2ba65.m105486x9cf0d20b().m105501x1e6612d5(c26752xef917861.f56688x30cde0.f56699xc2a4e117);
                }
                return c26752xef917861;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    /* renamed from: unpageageJceResponse */
    public static com.qq.taf.jce.AbstractC2861x7aec4921 m105159x878926d6(com.qq.taf.jce.AbstractC2861x7aec4921 abstractC2861x7aec4921, byte[] bArr) {
        com.qq.taf.jce.AbstractC2861x7aec4921 m105152x720630e9;
        if (abstractC2861x7aec4921 != null && bArr != null && (m105152x720630e9 = m105152x720630e9(abstractC2861x7aec4921)) != null) {
            try {
                com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e = new com.qq.taf.jce.C2859xe10ac61e(bArr);
                c2859xe10ac61e.m21323x26b402b8(f56575x346c99d6);
                m105152x720630e9.mo21234xcc442a60(c2859xe10ac61e);
                return m105152x720630e9;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
