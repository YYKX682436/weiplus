package r36;

/* loaded from: classes16.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final x36.o f450924a = x36.o.f533229h.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String[] f450925b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f450926c = new java.lang.String[64];

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f450927d = new java.lang.String[256];

    static {
        int i17 = 0;
        int i18 = 0;
        while (true) {
            java.lang.String[] strArr = f450927d;
            if (i18 >= strArr.length) {
                break;
            }
            strArr[i18] = m36.e.j("%8s", java.lang.Integer.toBinaryString(i18)).replace(' ', '0');
            i18++;
        }
        java.lang.String[] strArr2 = f450926c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i19 = iArr[0];
        strArr2[i19 | 8] = strArr2[i19] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i27 = 0; i27 < 3; i27++) {
            int i28 = iArr2[i27];
            int i29 = iArr[0];
            java.lang.String[] strArr3 = f450926c;
            int i37 = i29 | i28;
            strArr3[i37] = strArr3[i29] + '|' + strArr3[i28];
            strArr3[i37 | 8] = strArr3[i29] + '|' + strArr3[i28] + "|PADDED";
        }
        while (true) {
            java.lang.String[] strArr4 = f450926c;
            if (i17 >= strArr4.length) {
                return;
            }
            if (strArr4[i17] == null) {
                strArr4[i17] = f450927d[i17];
            }
            i17++;
        }
    }

    public static java.lang.String a(boolean z17, int i17, int i18, byte b17, byte b18) {
        java.lang.String str;
        java.lang.String[] strArr = f450925b;
        java.lang.String j17 = b17 < strArr.length ? strArr[b17] : m36.e.j("0x%02x", java.lang.Byte.valueOf(b17));
        if (b18 == 0) {
            str = "";
        } else {
            java.lang.String[] strArr2 = f450927d;
            if (b17 != 2 && b17 != 3) {
                if (b17 == 4 || b17 == 6) {
                    str = b18 == 1 ? "ACK" : strArr2[b18];
                } else if (b17 != 7 && b17 != 8) {
                    java.lang.String[] strArr3 = f450926c;
                    java.lang.String str2 = b18 < strArr3.length ? strArr3[b18] : strArr2[b18];
                    str = (b17 != 5 || (b18 & 4) == 0) ? (b17 != 0 || (b18 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr2[b18];
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = z17 ? "<<" : ">>";
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Integer.valueOf(i18);
        objArr[3] = j17;
        objArr[4] = str;
        return m36.e.j("%s 0x%08x %5d %-13s %s", objArr);
    }

    public static java.io.IOException b(java.lang.String str, java.lang.Object... objArr) {
        throw new java.io.IOException(m36.e.j(str, objArr));
    }
}
