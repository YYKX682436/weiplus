package com.p314xaae8f345.p542x3306d5.p550x382fcc;

/* renamed from: com.tencent.mars.xlog.MMXlog */
/* loaded from: classes12.dex */
public class C4611x87cbdd8c extends com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec {

    /* renamed from: crashXlog */
    private static boolean f19752x6e19dc13;

    /* renamed from: logDecryptor */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.p2 f19753xb41b214c;

    /* renamed from: monitor */
    private static com.p314xaae8f345.p542x3306d5.p550x382fcc.C4607x47fc1996 f19754x49b0bd5a;

    public C4611x87cbdd8c() {
        this(false);
    }

    /* renamed from: decryptTag */
    private static java.lang.String m40604x7b2566cd(java.lang.String str) {
        byte[] bArr;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Exception e17;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.p2 p2Var = f19753xb41b214c;
        if (p2Var == null || str == null || str.length() == 0) {
            return str;
        }
        int charAt = str.charAt(0) ^ 56506;
        if (charAt == 9030) {
            java.lang.String substring = str.substring(0, str.length());
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = p2Var.f274445b;
            if (r2Var.m(substring)) {
                return (java.lang.String) r2Var.get(substring);
            }
            int indexOf = str.indexOf(64, 1);
            int i17 = indexOf + 1;
            try {
                byte[] decode = android.util.Base64.decode(str.substring(i17, java.lang.Integer.parseInt(str.substring(1, indexOf)) + i17), 0);
                byte[] bArr2 = p2Var.f274444a;
                if (decode != null && bArr2 != null) {
                    bArr = kk.p.a(decode, bArr2);
                    str2 = new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    r2Var.put(substring, str2);
                }
                bArr = null;
                str2 = new java.lang.String(bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                r2Var.put(substring, str2);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LogDecryptor", e18, "", new java.lang.Object[0]);
                return "[TD]" + substring;
            }
        } else {
            if (charAt != 56475) {
                return str;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.f8 f8Var = p2Var.f274446c;
            f8Var.getClass();
            try {
                if (!str.startsWith("!")) {
                    return str;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var2 = f8Var.f274207b;
                if (r2Var2.k(str)) {
                    str2 = (java.lang.String) r2Var2.get(str);
                } else {
                    str3 = str.substring(1);
                    try {
                        java.lang.String[] split = str3.split("@");
                        if (split.length <= 1) {
                            return str3;
                        }
                        java.lang.String str4 = split[0];
                        int intValue = java.lang.Integer.valueOf(str4).intValue();
                        java.lang.String substring2 = str3.substring(str4.length() + 1, str4.length() + 1 + intValue);
                        str2 = f8Var.f274206a.a(substring2) + str3.substring(str4.length() + 1 + intValue);
                        r2Var2.put(str, str2);
                    } catch (java.lang.Exception e19) {
                        e17 = e19;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TagDecrypter", e17, "", new java.lang.Object[0]);
                        return "[td]" + str3;
                    }
                }
            } catch (java.lang.Exception e27) {
                str3 = str;
                e17 = e27;
            }
        }
        return str2;
    }

    /* renamed from: logMonitor */
    private static void m40605xd12a3d76(long j17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, long j18, long j19, java.lang.String str4) {
        if (i17 < com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.f19783x70f6fc1f || f19754x49b0bd5a.m40602x49b0bd5a(str, str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40618x7b10b097(j17, i17, str, str2, str3, i18, i19, j18, j19, str4);
            if (f19752x6e19dc13) {
                java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                if (str4.length() > 1024) {
                    str4 = str4.substring(0, 1024);
                }
                java.util.concurrent.ConcurrentLinkedDeque<java.lang.String> concurrentLinkedDeque = com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.f19797x14d9daaa;
                java.lang.Object[] objArr = new java.lang.Object[7];
                objArr[0] = valueOf;
                objArr[1] = java.lang.Integer.valueOf(i19);
                objArr[2] = java.lang.Long.valueOf(j18);
                objArr[3] = j18 == j19 ? "*" : "";
                objArr[4] = com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40616xd1908e10(i17);
                objArr[5] = str;
                objArr[6] = str4;
                concurrentLinkedDeque.offerLast(java.lang.String.format("[ts%s][%d-%d%s][%s][%s]: %s", objArr));
                int size = concurrentLinkedDeque.size() - 100;
                for (int i27 = 0; i27 < size; i27++) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.f19797x14d9daaa.pollFirst();
                }
            }
        }
    }

    /* renamed from: logWrite2 */
    public static void m40606x7b10b097(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, long j17, long j18, java.lang.String str4) {
        m40605xd12a3d76(0L, i17, str, str2, str3, i18, i19, j17, j18, str4);
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logD */
    public void mo40552x32c580(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (f19754x49b0bd5a != null) {
            m40605xd12a3d76(j17, 1, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, com.p314xaae8f345.p542x3306d5.p550x382fcc.C4606x7ad32a9a.m40579x4356b8e9(str4));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40618x7b10b097(j17, 1, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logE */
    public void mo40553x32c581(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (f19754x49b0bd5a != null) {
            m40605xd12a3d76(j17, 4, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, com.p314xaae8f345.p542x3306d5.p550x382fcc.C4606x7ad32a9a.m40579x4356b8e9(str4));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40618x7b10b097(j17, 4, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logF */
    public void mo40554x32c582(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (f19754x49b0bd5a != null) {
            m40605xd12a3d76(j17, 5, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, com.p314xaae8f345.p542x3306d5.p550x382fcc.C4606x7ad32a9a.m40579x4356b8e9(str4));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40618x7b10b097(j17, 5, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logI */
    public void mo40555x32c585(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (f19754x49b0bd5a != null) {
            m40605xd12a3d76(j17, 2, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, com.p314xaae8f345.p542x3306d5.p550x382fcc.C4606x7ad32a9a.m40579x4356b8e9(str4));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40618x7b10b097(j17, 2, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logV */
    public void mo40556x32c592(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (f19754x49b0bd5a != null) {
            m40605xd12a3d76(j17, 0, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, str4);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40618x7b10b097(j17, 0, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: logW */
    public void mo40557x32c593(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (f19754x49b0bd5a != null) {
            m40605xd12a3d76(j17, 3, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, com.p314xaae8f345.p542x3306d5.p550x382fcc.C4606x7ad32a9a.m40579x4356b8e9(str4));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.m40618x7b10b097(j17, 3, m40604x7b2566cd(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.InterfaceC4601x87fc7208
    /* renamed from: moveLogsFromCacheDirToLogDir */
    public void mo40558x580354d9() {
        java.lang.String str = com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.f19795xb26bd38;
        if (str == null || com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.f19796xe039976 == null || str.length() == 0 || com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.f19796xe039976.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.f19795xb26bd38);
        if (r6Var.m()) {
            com.p314xaae8f345.mm.vfs.r6[] H = r6Var.H(new com.p314xaae8f345.mm.vfs.t6() { // from class: com.tencent.mars.xlog.MMXlog.1
                @Override // com.p314xaae8f345.mm.vfs.t6
                /* renamed from: accept */
                public boolean mo40607xab27b508(com.p314xaae8f345.mm.vfs.r6 r6Var2) {
                    if (r6Var2.y()) {
                        return false;
                    }
                    return r6Var2.m82467xfb82e301().toLowerCase().endsWith(".xlog");
                }
            });
            if (H.length == 0) {
                return;
            }
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : H) {
                com.p314xaae8f345.mm.vfs.w6.w(r6Var2.u(), com.p314xaae8f345.p542x3306d5.p550x382fcc.AbstractC4613x29a3ec.f19796xe039976 + "/" + r6Var2.m82467xfb82e301());
            }
        }
    }

    public C4611x87cbdd8c(boolean z17) {
        if (z17) {
            return;
        }
        f19754x49b0bd5a = new com.p314xaae8f345.p542x3306d5.p550x382fcc.C4607x47fc1996();
        f19752x6e19dc13 = true;
    }
}
