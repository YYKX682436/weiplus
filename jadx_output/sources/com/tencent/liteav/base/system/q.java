package com.tencent.liteav.base.system;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f46416a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ba, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01d8: MOVE (r3 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:97:0x01d8 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167 A[Catch: all -> 0x019d, Exception -> 0x01a0, TryCatch #13 {Exception -> 0x01a0, all -> 0x019d, blocks: (B:36:0x0147, B:38:0x0167, B:39:0x016a, B:41:0x0188, B:42:0x018b), top: B:35:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188 A[Catch: all -> 0x019d, Exception -> 0x01a0, TryCatch #13 {Exception -> 0x01a0, all -> 0x019d, blocks: (B:36:0x0147, B:38:0x0167, B:39:0x016a, B:41:0x0188, B:42:0x018b), top: B:35:0x0147 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bd A[LOOP:0: B:66:0x00b7->B:68:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ec A[LOOP:1: B:71:0x00ea->B:72:0x00ec, LOOP_END] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.base.system.q.a(java.lang.String):java.lang.String");
    }

    private static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        try {
            byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(str.getBytes(com.tencent.mapsdk.internal.rv.f51270c));
            char[] cArr = new char[digest.length << 1];
            int i17 = 0;
            for (byte b17 : digest) {
                int i18 = i17 + 1;
                char[] cArr2 = f46416a;
                cArr[i17] = cArr2[(b17 & 240) >>> 4];
                i17 = i18 + 1;
                cArr[i18] = cArr2[b17 & 15];
            }
            return new java.lang.String(cArr);
        } catch (java.lang.Exception e17) {
            com.tencent.liteav.base.Log.e("UUID", "stringToMd5 failed.", e17);
            return "";
        }
    }
}
