package jp3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final jp3.g f382533a = new jp3.g();

    public static /* synthetic */ void c(jp3.g gVar, android.app.Activity activity, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i18, java.lang.Object obj) {
        gVar.b(activity, i17, str, (i18 & 8) != 0 ? null : str2, (i18 & 16) != 0 ? null : str3, (i18 & 32) != 0 ? null : str4, (i18 & 64) != 0 ? null : str5, (i18 & 128) != 0 ? null : str6, (i18 & 256) != 0 ? null : str7, (i18 & 512) != 0 ? null : str8);
    }

    public final void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[deleteFile] error, path is empty!");
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.h(str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[deleteFile] error, file is not exits, path: " + str + '!');
    }

    public final void b(android.app.Activity activity, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        ((ku5.t0) ku5.t0.f394148d).B(new jp3.e(i17, str, activity, str2, str3, str4, str5, str6, str7, str8));
    }

    public final jz5.l d(byte[] bArr) {
        if (!(bArr == null)) {
            if (!(bArr.length == 0)) {
                byte[] m121938xd4b76d68 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121938xd4b76d68(16);
                byte[] m121938xd4b76d682 = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121938xd4b76d68(12);
                if (!(m121938xd4b76d68 == null)) {
                    if (!(m121938xd4b76d682 == null)) {
                        byte[][] m121957xff14d6ce = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121957xff14d6ce(bArr, m121938xd4b76d68, m121938xd4b76d682, new byte[0]);
                        int m121936x75feee5c = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121936x75feee5c();
                        if ((m121957xff14d6ce == null) || m121957xff14d6ce.length < 2 || m121936x75feee5c != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[doSm4Encrypt] sm4GcmEncrypt failed, errorCode: " + m121936x75feee5c);
                            return null;
                        }
                        byte[] bArr2 = m121957xff14d6ce[0];
                        byte[] bArr3 = m121957xff14d6ce[1];
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintHelper", "[doSm4Encrypt] sm4GcmEncrypt suc, cipher.len: " + bArr2.length + ", tag.len: " + bArr3.length);
                        byte[] bArr4 = new byte[m121938xd4b76d682.length + bArr2.length + bArr3.length];
                        java.lang.System.arraycopy(m121938xd4b76d682, 0, bArr4, 0, m121938xd4b76d682.length);
                        java.lang.System.arraycopy(bArr2, 0, bArr4, m121938xd4b76d682.length, bArr2.length);
                        java.lang.System.arraycopy(bArr3, 0, bArr4, m121938xd4b76d682.length + bArr2.length, bArr3.length);
                        return new jz5.l(bArr4, m121938xd4b76d68);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[doSm4Encrypt] generate random key or iv fail");
                return null;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[doSm4Encrypt] data is null or empty");
        return null;
    }

    public final r45.s45 e(kp3.h hVar, java.lang.String str) {
        byte[] N;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[getCdnPalmFile] error, registerResult is null");
            return null;
        }
        if (str == null || r26.n0.N(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PalmPrintHelper", "[getCdnPalmFile] warning, videoPath is isNullOrBlank");
            N = null;
        } else {
            N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        }
        r45.s45 s45Var = new r45.s45();
        jp3.g gVar = f382533a;
        com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult imageDataResult = hVar.f392526b;
        s45Var.set(0, gVar.h(imageDataResult != null ? imageDataResult.f61426x2eefaa : null));
        s45Var.set(1, gVar.h(N));
        com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.ImageDataResult imageDataResult2 = hVar.f392527c;
        s45Var.set(2, gVar.h(imageDataResult2 != null ? imageDataResult2.f61426x2eefaa : null));
        s45Var.set(3, hVar.f392525a);
        return s45Var;
    }

    public final java.lang.String f(byte[] bArr, java.lang.String str) {
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0)) {
                if (!(str == null || str.length() == 0)) {
                    byte[] m121941x2b87a22d = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121941x2b87a22d(bArr, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str));
                    int m121936x75feee5c = com.p3249xcbb51f6b.ndk.C28022x73d433fe.m121931x9cf0d20b().m121936x75feee5c();
                    if (m121941x2b87a22d == null || m121936x75feee5c != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "getEncryptKey failed, sm2Encrypt errorCode: " + m121936x75feee5c);
                        return "";
                    }
                    java.lang.String encodeToString = android.util.Base64.encodeToString(m121941x2b87a22d, 2);
                    if (encodeToString != null && encodeToString.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        return encodeToString;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "getEncryptKey failed：base64 failed");
                    return "";
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "getEncryptKey failed, data or publicKey is null or empty!");
        return "";
    }

    public final java.lang.String g(byte[] bArr, java.lang.String str) {
        if (bArr != null) {
            boolean z17 = true;
            if (!(bArr.length == 0)) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    try {
                        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                            com.p314xaae8f345.mm.vfs.w6.h(str);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.l(bArr, str);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintHelper", "[saveDataToFile] path: " + str + ", fileSize: " + com.p314xaae8f345.mm.vfs.w6.k(str));
                        return str;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[saveDataToFile] error, msg：" + e17.getMessage());
                        return "";
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintHelper", "[saveDataToFile] error, data or path is empty!");
        return "";
    }

    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g h(byte[] bArr) {
        if (bArr == null) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g DEFAULT_INSTANCE = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(DEFAULT_INSTANCE, "DEFAULT_INSTANCE");
            return DEFAULT_INSTANCE;
        }
        if (!(bArr.length == 0)) {
            return com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bArr);
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.g DEFAULT_INSTANCE2 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(DEFAULT_INSTANCE2, "DEFAULT_INSTANCE");
        return DEFAULT_INSTANCE2;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0220 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.app.Activity r18, int r19, java.lang.String r20, kp3.h r21, kp3.g r22) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jp3.g.i(android.app.Activity, int, java.lang.String, kp3.h, kp3.g):void");
    }
}
