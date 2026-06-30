package com.tencent.mars.xlog;

/* loaded from: classes12.dex */
public class MMXlog extends com.tencent.mars.xlog.Xlog {
    private static boolean crashXlog;
    public static com.tencent.mm.sdk.platformtools.p2 logDecryptor;
    private static com.tencent.mars.xlog.LogMonitor monitor;

    public MMXlog() {
        this(false);
    }

    private static java.lang.String decryptTag(java.lang.String str) {
        byte[] bArr;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Exception e17;
        com.tencent.mm.sdk.platformtools.p2 p2Var = logDecryptor;
        if (p2Var == null || str == null || str.length() == 0) {
            return str;
        }
        int charAt = str.charAt(0) ^ 56506;
        if (charAt == 9030) {
            java.lang.String substring = str.substring(0, str.length());
            com.tencent.mm.sdk.platformtools.r2 r2Var = p2Var.f192912b;
            if (r2Var.m(substring)) {
                return (java.lang.String) r2Var.get(substring);
            }
            int indexOf = str.indexOf(64, 1);
            int i17 = indexOf + 1;
            try {
                byte[] decode = android.util.Base64.decode(str.substring(i17, java.lang.Integer.parseInt(str.substring(1, indexOf)) + i17), 0);
                byte[] bArr2 = p2Var.f192911a;
                if (decode != null && bArr2 != null) {
                    bArr = kk.p.a(decode, bArr2);
                    str2 = new java.lang.String(bArr, com.tencent.mapsdk.internal.rv.f51270c);
                    r2Var.put(substring, str2);
                }
                bArr = null;
                str2 = new java.lang.String(bArr, com.tencent.mapsdk.internal.rv.f51270c);
                r2Var.put(substring, str2);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LogDecryptor", e18, "", new java.lang.Object[0]);
                return "[TD]" + substring;
            }
        } else {
            if (charAt != 56475) {
                return str;
            }
            com.tencent.mm.sdk.platformtools.f8 f8Var = p2Var.f192913c;
            f8Var.getClass();
            try {
                if (!str.startsWith("!")) {
                    return str;
                }
                com.tencent.mm.sdk.platformtools.r2 r2Var2 = f8Var.f192674b;
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
                        str2 = f8Var.f192673a.a(substring2) + str3.substring(str4.length() + 1 + intValue);
                        r2Var2.put(str, str2);
                    } catch (java.lang.Exception e19) {
                        e17 = e19;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TagDecrypter", e17, "", new java.lang.Object[0]);
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

    private static void logMonitor(long j17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, long j18, long j19, java.lang.String str4) {
        if (i17 < com.tencent.mars.xlog.Xlog.MONITOR_LEVEL || monitor.monitor(str, str4)) {
            com.tencent.mars.xlog.Xlog.logWrite2(j17, i17, str, str2, str3, i18, i19, j18, j19, str4);
            if (crashXlog) {
                java.lang.String valueOf = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                if (str4.length() > 1024) {
                    str4 = str4.substring(0, 1024);
                }
                java.util.concurrent.ConcurrentLinkedDeque<java.lang.String> concurrentLinkedDeque = com.tencent.mars.xlog.Xlog.recentLogs;
                java.lang.Object[] objArr = new java.lang.Object[7];
                objArr[0] = valueOf;
                objArr[1] = java.lang.Integer.valueOf(i19);
                objArr[2] = java.lang.Long.valueOf(j18);
                objArr[3] = j18 == j19 ? "*" : "";
                objArr[4] = com.tencent.mars.xlog.Xlog.levelToString(i17);
                objArr[5] = str;
                objArr[6] = str4;
                concurrentLinkedDeque.offerLast(java.lang.String.format("[ts%s][%d-%d%s][%s][%s]: %s", objArr));
                int size = concurrentLinkedDeque.size() - 100;
                for (int i27 = 0; i27 < size; i27++) {
                    com.tencent.mars.xlog.Xlog.recentLogs.pollFirst();
                }
            }
        }
    }

    public static void logWrite2(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, int i19, long j17, long j18, java.lang.String str4) {
        logMonitor(0L, i17, str, str2, str3, i18, i19, j17, j18, str4);
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logD(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (monitor != null) {
            logMonitor(j17, 1, decryptTag(str), str2, str3, i17, i18, j18, j19, com.tencent.mars.xlog.LogLogic.appendMemLog(str4));
        } else {
            com.tencent.mars.xlog.Xlog.logWrite2(j17, 1, decryptTag(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logE(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (monitor != null) {
            logMonitor(j17, 4, decryptTag(str), str2, str3, i17, i18, j18, j19, com.tencent.mars.xlog.LogLogic.appendMemLog(str4));
        } else {
            com.tencent.mars.xlog.Xlog.logWrite2(j17, 4, decryptTag(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logF(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (monitor != null) {
            logMonitor(j17, 5, decryptTag(str), str2, str3, i17, i18, j18, j19, com.tencent.mars.xlog.LogLogic.appendMemLog(str4));
        } else {
            com.tencent.mars.xlog.Xlog.logWrite2(j17, 5, decryptTag(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logI(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (monitor != null) {
            logMonitor(j17, 2, decryptTag(str), str2, str3, i17, i18, j18, j19, com.tencent.mars.xlog.LogLogic.appendMemLog(str4));
        } else {
            com.tencent.mars.xlog.Xlog.logWrite2(j17, 2, decryptTag(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logV(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (monitor != null) {
            logMonitor(j17, 0, decryptTag(str), str2, str3, i17, i18, j18, j19, str4);
        } else {
            com.tencent.mars.xlog.Xlog.logWrite2(j17, 0, decryptTag(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void logW(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, long j18, long j19, java.lang.String str4) {
        if (monitor != null) {
            logMonitor(j17, 3, decryptTag(str), str2, str3, i17, i18, j18, j19, com.tencent.mars.xlog.LogLogic.appendMemLog(str4));
        } else {
            com.tencent.mars.xlog.Xlog.logWrite2(j17, 3, decryptTag(str), str2, str3, i17, i18, j18, j19, str4);
        }
    }

    @Override // com.tencent.mars.xlog.Log.LogImp
    public void moveLogsFromCacheDirToLogDir() {
        java.lang.String str = com.tencent.mars.xlog.Xlog.mCacheDir;
        if (str == null || com.tencent.mars.xlog.Xlog.mLogDir == null || str.length() == 0 || com.tencent.mars.xlog.Xlog.mLogDir.length() == 0) {
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mars.xlog.Xlog.mCacheDir);
        if (r6Var.m()) {
            com.tencent.mm.vfs.r6[] H = r6Var.H(new com.tencent.mm.vfs.t6() { // from class: com.tencent.mars.xlog.MMXlog.1
                @Override // com.tencent.mm.vfs.t6
                public boolean accept(com.tencent.mm.vfs.r6 r6Var2) {
                    if (r6Var2.y()) {
                        return false;
                    }
                    return r6Var2.getName().toLowerCase().endsWith(".xlog");
                }
            });
            if (H.length == 0) {
                return;
            }
            for (com.tencent.mm.vfs.r6 r6Var2 : H) {
                com.tencent.mm.vfs.w6.w(r6Var2.u(), com.tencent.mars.xlog.Xlog.mLogDir + "/" + r6Var2.getName());
            }
        }
    }

    public MMXlog(boolean z17) {
        if (z17) {
            return;
        }
        monitor = new com.tencent.mars.xlog.LogMonitor();
        crashXlog = true;
    }
}
