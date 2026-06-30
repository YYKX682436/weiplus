package gb;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.TimeZone f351477a = java.util.TimeZone.getTimeZone("UTC");

    public static boolean a(java.lang.String str, int i17, char c17) {
        return i17 < str.length() && str.charAt(i17) == c17;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[Catch: IllegalArgumentException -> 0x00b4, NumberFormatException -> 0x00b7, IndexOutOfBoundsException -> 0x00ba, TRY_LEAVE, TryCatch #2 {IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:38:0x009c, B:40:0x00a2, B:44:0x00af, B:47:0x00c2, B:52:0x00e5, B:54:0x00eb, B:59:0x01a3, B:64:0x0100, B:65:0x011b, B:66:0x011c, B:69:0x0138, B:71:0x0145, B:74:0x014e, B:76:0x016d, B:79:0x017c, B:80:0x019e, B:82:0x0127, B:83:0x01d4, B:84:0x01db, B:85:0x00d2, B:86:0x00d5, B:89:0x00bd), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d4 A[Catch: IllegalArgumentException -> 0x00b4, NumberFormatException -> 0x00b7, IndexOutOfBoundsException -> 0x00ba, TryCatch #2 {IndexOutOfBoundsException -> 0x00ba, NumberFormatException -> 0x00b7, IllegalArgumentException -> 0x00b4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:18:0x0050, B:20:0x0060, B:21:0x0062, B:23:0x006e, B:24:0x0070, B:26:0x0076, B:30:0x0080, B:35:0x0090, B:37:0x0098, B:38:0x009c, B:40:0x00a2, B:44:0x00af, B:47:0x00c2, B:52:0x00e5, B:54:0x00eb, B:59:0x01a3, B:64:0x0100, B:65:0x011b, B:66:0x011c, B:69:0x0138, B:71:0x0145, B:74:0x014e, B:76:0x016d, B:79:0x017c, B:80:0x019e, B:82:0x0127, B:83:0x01d4, B:84:0x01db, B:85:0x00d2, B:86:0x00d5, B:89:0x00bd), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date b(java.lang.String r18, java.text.ParsePosition r19) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.a.b(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static int c(java.lang.String str, int i17, int i18) {
        int i19;
        int i27;
        if (i17 < 0 || i18 > str.length() || i17 > i18) {
            throw new java.lang.NumberFormatException(str);
        }
        if (i17 < i18) {
            i27 = i17 + 1;
            int digit = java.lang.Character.digit(str.charAt(i17), 10);
            if (digit < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i17, i18));
            }
            i19 = -digit;
        } else {
            i19 = 0;
            i27 = i17;
        }
        while (i27 < i18) {
            int i28 = i27 + 1;
            int digit2 = java.lang.Character.digit(str.charAt(i27), 10);
            if (digit2 < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i17, i18));
            }
            i19 = (i19 * 10) - digit2;
            i27 = i28;
        }
        return -i19;
    }
}
