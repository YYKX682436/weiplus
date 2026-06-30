package m16;

/* loaded from: classes12.dex */
public abstract class a {
    static {
        java.lang.String str;
        try {
            str = java.lang.System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 1 || i17 == 3 || i17 == 6 || i17 == 8 || i17 == 10 || i17 == 12 || i17 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 1 || i17 == 3 || i17 == 6 || i17 == 8 || i17 == 10 || i17 == 12 || i17 == 14) ? 2 : 3];
        if (i17 == 1 || i17 == 3 || i17 == 6 || i17 == 8 || i17 == 10 || i17 == 12 || i17 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306;
        }
        if (i17 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i17 == 3) {
            objArr[1] = "encode8to7";
        } else if (i17 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i17 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i17 == 10) {
            objArr[1] = "dropMarker";
        } else if (i17 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i17 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i17) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 1 && i17 != 3 && i17 != 6 && i17 != 8 && i17 != 10 && i17 != 12 && i17 != 14) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static byte[] b(java.lang.String[] strArr) {
        if (strArr == null) {
            a(7);
            throw null;
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
                strArr2[0] = strArr2[0].substring(1);
                int i17 = 0;
                for (java.lang.String str : strArr2) {
                    i17 += str.length();
                }
                byte[] bArr = new byte[i17];
                int i18 = 0;
                for (java.lang.String str2 : strArr2) {
                    int length = str2.length();
                    int i19 = 0;
                    while (i19 < length) {
                        bArr[i18] = (byte) str2.charAt(i19);
                        i19++;
                        i18++;
                    }
                }
                return bArr;
            }
            if (charAt == 65535) {
                strArr = (java.lang.String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int i27 = 0;
        for (java.lang.String str3 : strArr) {
            i27 += str3.length();
        }
        byte[] bArr2 = new byte[i27];
        int i28 = 0;
        for (java.lang.String str4 : strArr) {
            int length2 = str4.length();
            int i29 = 0;
            while (i29 < length2) {
                bArr2[i28] = (byte) str4.charAt(i29);
                i29++;
                i28++;
            }
        }
        for (int i37 = 0; i37 < i27; i37++) {
            bArr2[i37] = (byte) ((bArr2[i37] + Byte.MAX_VALUE) & 127);
        }
        int i38 = (i27 * 7) / 8;
        byte[] bArr3 = new byte[i38];
        int i39 = 0;
        int i47 = 0;
        for (int i48 = 0; i48 < i38; i48++) {
            int i49 = (bArr2[i39] & 255) >>> i47;
            i39++;
            int i57 = i47 + 1;
            bArr3[i48] = (byte) (i49 + ((bArr2[i39] & ((1 << i57) - 1)) << (7 - i47)));
            if (i47 == 6) {
                i39++;
                i47 = 0;
            } else {
                i47 = i57;
            }
        }
        return bArr3;
    }
}
