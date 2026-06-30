package z45;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f551678f = bm5.s1.a("\u0091´½\u00ad·\u0094©¼ú\u009d\u0082\u0083\u0080\u009f½§\u0080¢©¦¦\u009d£¥¯ ´\u0084¨¤¡¨");

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f551679g = {0};

    /* renamed from: d, reason: collision with root package name */
    public final y45.a f551680d;

    /* renamed from: e, reason: collision with root package name */
    public r45.f35 f551681e;

    public a(r45.f35 f35Var, y45.a aVar) {
        this.f551681e = f35Var;
        this.f551680d = aVar;
    }

    public static void a(y45.a aVar, r45.f35 f35Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb, java.lang.Throwable th6) {
        java.lang.Object[] objArr = {aVar, java.lang.Integer.valueOf(i17), c16114x800e8cdb, th6};
        java.lang.String str = f551678f;
        d55.u.b(str, "[+] doCallback called: %s,%s,%s,%s", objArr);
        if (aVar != null) {
            try {
                ((y45.p) aVar).a(f35Var, i17, c16114x800e8cdb, th6);
            } catch (java.lang.Throwable th7) {
                d55.u.c(str, "[!] exception occurred in doCallback.", th7, new java.lang.Object[0]);
            }
        }
    }

    public static void b(r45.f35 f35Var, y45.a aVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long[] jArr = f551679g;
        synchronized (jArr) {
            if (currentTimeMillis - jArr[0] < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                d55.u.d(f551678f, "doCheck is called too often.", new java.lang.Object[0]);
            } else {
                jArr[0] = currentTimeMillis;
                y45.u.a().post(new z45.a(f35Var, aVar));
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0166 -> B:34:0x01cc). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public void run() {
        javax.net.ssl.HttpsURLConnection httpsURLConnection;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.mk0();
        lVar.f152198b = new r45.g35();
        lVar.f152199c = bm5.s1.a("Ë\u0086\u0081\u008eÍ\u0083\u008b\u008dó°·¼ª¶·¨³ø´¾¾þ¡¶¯¨ ¬º°º¿´·¥¨®§«¤");
        lVar.f152200d = 3824;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        a17.m48033x97bfc4c(o45.pi.d());
        a17.f152247e = 1;
        r45.f35 f35Var = this.f551681e;
        y45.a aVar = this.f551680d;
        if (f35Var == null) {
            try {
                r45.f35 f35Var2 = new r45.f35();
                this.f551681e = f35Var2;
                java.lang.String str = lp0.a.f401789j;
                if (str == null) {
                    str = "";
                }
                f35Var2.f455520d = str;
                f35Var2.f455521e = lp0.a.a();
                this.f551681e.f455522f = b55.b.b();
                this.f551681e.f455527n = 1;
            } catch (java.lang.Throwable th6) {
                a(aVar, this.f551681e, -6, null, th6);
                return;
            }
        }
        r45.f35 f35Var3 = this.f551681e;
        java.lang.Object[] objArr = {f35Var3.f455520d, f35Var3.f455521e};
        java.lang.String str2 = f551678f;
        d55.u.b(str2, "start check request: %s,%s", objArr);
        try {
            r45.mk0 mk0Var = (r45.mk0) a17.f152243a.f152217a;
            r45.lk0 lk0Var = new r45.lk0();
            lk0Var.f76494x2de60e5e = o45.bh.a(a17.mo47979x2d63726f());
            lk0Var.f461074d = this.f551681e;
            mk0Var.f462134e = lk0Var;
            r45.nk0 nk0Var = new r45.nk0();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0());
            nk0Var.f462990d = cu5Var;
            mk0Var.f462133d = nk0Var;
            byte[] mo14344x5f01b1f6 = mk0Var.mo14344x5f01b1f6();
            if (mo14344x5f01b1f6 == null) {
                throw new java.lang.NullPointerException("reqBuf is null");
            }
            try {
                httpsURLConnection = (javax.net.ssl.HttpsURLConnection) new java.net.URL(bm5.s1.a("\u009a\u0087\u0098\u009d\u009dÕÇÆ\u009a\u0099\u0087\u008a\u0088\u0081\u0089\u0086Ì\u0094¹´¦¶¶÷«ªú¶¹ºÿ²µºá¯§¡ç¾¯©´·¥¨®§«¤")).openConnection();
                try {
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setRequestProperty(bm5.s1.a("\u008b¦¤¿¡«²ê\u0094¸²¦"), bm5.s1.a("³»½\u00ad¿·à§ª¾®°èµ³²¤£®"));
                    httpsURLConnection.setDoOutput(false);
                    httpsURLConnection.setUseCaches(false);
                    httpsURLConnection.setFixedLengthStreamingMode(mo14344x5f01b1f6.length);
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
                    java.io.OutputStream outputStream = httpsURLConnection.getOutputStream();
                    try {
                        outputStream.write(mo14344x5f01b1f6);
                        outputStream.flush();
                        outputStream.close();
                        int responseCode = httpsURLConnection.getResponseCode();
                        if (responseCode != 200) {
                            throw new java.io.IOException("HTTP request failed, code:" + responseCode + ", msg:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e(httpsURLConnection.getErrorStream()));
                        }
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(128);
                        java.io.InputStream inputStream = httpsURLConnection.getInputStream();
                        try {
                            byte[] bArr = new byte[512];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read < 0) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, read);
                                }
                            }
                            byteArrayOutputStream.flush();
                            inputStream.close();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                httpsURLConnection.disconnect();
                            } catch (java.lang.Throwable unused) {
                            }
                            try {
                                r45.g35 g35Var = new r45.g35();
                                g35Var.mo11468x92b714fd(byteArray);
                                r45.j35 j35Var = g35Var.f456386d;
                                if (j35Var == null) {
                                    d55.u.d(str2, "empty node. code:%d", java.lang.Integer.valueOf(g35Var.f456391i));
                                    a(aVar, this.f551681e, -5, null, null);
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb c16114x800e8cdb = new com.p314xaae8f345.mm.p1006xc5476f33.hp.p1781x36f002.C16114x800e8cdb(j35Var);
                                    d55.u.b(str2, "get response successfully: %s,%s", g35Var.f456387e, g35Var.f456388f);
                                    a(aVar, this.f551681e, 0, c16114x800e8cdb, null);
                                }
                            } catch (java.lang.Throwable th7) {
                                a(aVar, this.f551681e, -2, null, th7);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    try {
                        a(aVar, this.f551681e, -1, null, th);
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.disconnect();
                            } catch (java.lang.Throwable unused2) {
                            }
                        }
                    } catch (java.lang.Throwable th9) {
                        if (httpsURLConnection != null) {
                            try {
                                httpsURLConnection.disconnect();
                            } catch (java.lang.Throwable unused3) {
                            }
                        }
                        throw th9;
                    }
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
                httpsURLConnection = null;
            }
        } catch (java.lang.Throwable th11) {
            a(aVar, this.f551681e, -6, null, th11);
        }
    }
}
