package d95;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f309133a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f309134b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f309135c;

    static {
        boolean z17 = true;
        if (android.os.Build.VERSION.SDK_INT == 28 && android.os.Build.BRAND.equals("samsung")) {
            java.lang.String lowerCase = android.os.Build.HARDWARE.toLowerCase();
            lowerCase.getClass();
            char c17 = 65535;
            switch (lowerCase.hashCode()) {
                case -1359763720:
                    if (lowerCase.equals("exynos7884a")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case -1359763719:
                    if (lowerCase.equals("exynos7884b")) {
                        c17 = 1;
                        break;
                    }
                    break;
                case 2034346633:
                    if (lowerCase.equals("exynos7884")) {
                        c17 = 2;
                        break;
                    }
                    break;
                case 2034346634:
                    if (lowerCase.equals("exynos7885")) {
                        c17 = 3;
                        break;
                    }
                    break;
                case 2034347346:
                    if (lowerCase.equals("exynos7904")) {
                        c17 = 4;
                        break;
                    }
                    break;
                case 2034347347:
                    if (lowerCase.equals("exynos7905")) {
                        c17 = 5;
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    z17 = false;
                    break;
            }
        }
        f309133a = z17;
        f309134b = new java.lang.String[]{"", " OR ROLLBACK", " OR ABORT", " OR FAIL", " OR IGNORE", " OR REPLACE"};
        f309135c = new java.lang.String[]{"", "-journal", "-wal"};
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab A[Catch: all -> 0x013f, TryCatch #3 {all -> 0x013f, blocks: (B:6:0x0016, B:8:0x002f, B:14:0x0044, B:16:0x004a, B:23:0x0062, B:24:0x0071, B:26:0x007e, B:29:0x0089, B:32:0x008d, B:33:0x00a2, B:34:0x00a5, B:36:0x00ab, B:38:0x00b4, B:42:0x00bc, B:40:0x00c1, B:44:0x00c4, B:47:0x00c7, B:48:0x00eb, B:50:0x00f1, B:52:0x0100, B:53:0x0110, B:55:0x0116, B:57:0x011e, B:61:0x009e), top: B:5:0x0016, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1 A[Catch: all -> 0x013f, LOOP:3: B:48:0x00eb->B:50:0x00f1, LOOP_END, TryCatch #3 {all -> 0x013f, blocks: (B:6:0x0016, B:8:0x002f, B:14:0x0044, B:16:0x004a, B:23:0x0062, B:24:0x0071, B:26:0x007e, B:29:0x0089, B:32:0x008d, B:33:0x00a2, B:34:0x00a5, B:36:0x00ab, B:38:0x00b4, B:42:0x00bc, B:40:0x00c1, B:44:0x00c4, B:47:0x00c7, B:48:0x00eb, B:50:0x00f1, B:52:0x0100, B:53:0x0110, B:55:0x0116, B:57:0x011e, B:61:0x009e), top: B:5:0x0016, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116 A[Catch: all -> 0x013f, LOOP:4: B:53:0x0110->B:55:0x0116, LOOP_END, TryCatch #3 {all -> 0x013f, blocks: (B:6:0x0016, B:8:0x002f, B:14:0x0044, B:16:0x004a, B:23:0x0062, B:24:0x0071, B:26:0x007e, B:29:0x0089, B:32:0x008d, B:33:0x00a2, B:34:0x00a5, B:36:0x00ab, B:38:0x00b4, B:42:0x00bc, B:40:0x00c1, B:44:0x00c4, B:47:0x00c7, B:48:0x00eb, B:50:0x00f1, B:52:0x0100, B:53:0x0110, B:55:0x0116, B:57:0x011e, B:61:0x009e), top: B:5:0x0016, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b r14, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b r15, final java.lang.String r16, int r17, boolean r18, boolean r19, java.lang.String[] r20, java.lang.String r21, android.os.CancellationSignal r22) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.b.a(com.tencent.wcdb.core.Database, com.tencent.wcdb.core.Database, java.lang.String, int, boolean, boolean, java.lang.String[], java.lang.String, android.os.CancellationSignal):int");
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x01f8: MOVE (r10 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:144:0x01f6 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01f1 A[Catch: all -> 0x01f5, TRY_ENTER, TryCatch #1 {all -> 0x01f5, blocks: (B:14:0x0049, B:16:0x004e, B:27:0x0070, B:28:0x0080, B:127:0x01d5, B:140:0x01f1, B:141:0x01f4), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5 A[Catch: all -> 0x01b8, TryCatch #3 {all -> 0x01b8, blocks: (B:30:0x008c, B:32:0x0092, B:35:0x0096, B:36:0x00ab, B:37:0x00af, B:39:0x00b5, B:40:0x00bc, B:42:0x00bf, B:46:0x00c7, B:44:0x00cc, B:48:0x00cf, B:51:0x00d2, B:52:0x00f6, B:54:0x00fc, B:56:0x010b, B:57:0x011c, B:59:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0145, B:65:0x0149, B:67:0x014c, B:71:0x0185, B:72:0x0151, B:82:0x0162, B:84:0x016a, B:86:0x0172, B:88:0x017a, B:90:0x0182, B:93:0x0188, B:95:0x018e, B:106:0x00a7), top: B:29:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc A[Catch: all -> 0x01b8, LOOP:2: B:52:0x00f6->B:54:0x00fc, LOOP_END, TryCatch #3 {all -> 0x01b8, blocks: (B:30:0x008c, B:32:0x0092, B:35:0x0096, B:36:0x00ab, B:37:0x00af, B:39:0x00b5, B:40:0x00bc, B:42:0x00bf, B:46:0x00c7, B:44:0x00cc, B:48:0x00cf, B:51:0x00d2, B:52:0x00f6, B:54:0x00fc, B:56:0x010b, B:57:0x011c, B:59:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0145, B:65:0x0149, B:67:0x014c, B:71:0x0185, B:72:0x0151, B:82:0x0162, B:84:0x016a, B:86:0x0172, B:88:0x017a, B:90:0x0182, B:93:0x0188, B:95:0x018e, B:106:0x00a7), top: B:29:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122 A[Catch: all -> 0x01b8, LOOP:3: B:57:0x011c->B:59:0x0122, LOOP_END, TryCatch #3 {all -> 0x01b8, blocks: (B:30:0x008c, B:32:0x0092, B:35:0x0096, B:36:0x00ab, B:37:0x00af, B:39:0x00b5, B:40:0x00bc, B:42:0x00bf, B:46:0x00c7, B:44:0x00cc, B:48:0x00cf, B:51:0x00d2, B:52:0x00f6, B:54:0x00fc, B:56:0x010b, B:57:0x011c, B:59:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0145, B:65:0x0149, B:67:0x014c, B:71:0x0185, B:72:0x0151, B:82:0x0162, B:84:0x016a, B:86:0x0172, B:88:0x017a, B:90:0x0182, B:93:0x0188, B:95:0x018e, B:106:0x00a7), top: B:29:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145 A[Catch: all -> 0x01b8, TryCatch #3 {all -> 0x01b8, blocks: (B:30:0x008c, B:32:0x0092, B:35:0x0096, B:36:0x00ab, B:37:0x00af, B:39:0x00b5, B:40:0x00bc, B:42:0x00bf, B:46:0x00c7, B:44:0x00cc, B:48:0x00cf, B:51:0x00d2, B:52:0x00f6, B:54:0x00fc, B:56:0x010b, B:57:0x011c, B:59:0x0122, B:61:0x012a, B:62:0x013e, B:64:0x0145, B:65:0x0149, B:67:0x014c, B:71:0x0185, B:72:0x0151, B:82:0x0162, B:84:0x016a, B:86:0x0172, B:88:0x017a, B:90:0x0182, B:93:0x0188, B:95:0x018e, B:106:0x00a7), top: B:29:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a6  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(l75.k0 r17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 r18, java.lang.String r19, int r20, boolean r21, boolean r22, java.lang.String[] r23, java.lang.String r24, android.os.CancellationSignal r25) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d95.b.b(l75.k0, com.tencent.wcdb.database.SQLiteDatabase, java.lang.String, int, boolean, boolean, java.lang.String[], java.lang.String, android.os.CancellationSignal):int");
    }

    public static android.database.Cursor c(l75.k0 k0Var, java.lang.String str, java.lang.String[] strArr) {
        java.lang.String[] strArr2 = null;
        if (k0Var instanceof d95.z) {
            return tp5.a.g(((d95.z) k0Var).f309251a.m106493xb22e551e(), str, strArr, null);
        }
        if (k0Var instanceof d95.b0) {
            return k0Var.o(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26954x879c8aeb.f58282xe9b6bcea, str, strArr, "", null);
        }
        if (strArr != null) {
            strArr2 = new java.lang.String[strArr.length];
            for (int i17 = 0; i17 < strArr.length; i17++) {
                strArr2[i17] = strArr[i17].toString();
            }
        }
        return k0Var.B(str, strArr2);
    }
}
