package t9;

/* loaded from: classes12.dex */
public abstract class b0 {
    public static int[] a(java.lang.String str) {
        int i17;
        int[] iArr = new int[4];
        if (android.text.TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i18 = indexOf4 + 2;
        if (i18 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i18) == '/') {
            i17 = str.indexOf(47, indexOf4 + 3);
            if (i17 == -1 || i17 > indexOf2) {
                i17 = indexOf2;
            }
        } else {
            i17 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i17;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static java.lang.String b(java.lang.StringBuilder sb6, int i17, int i18) {
        int i19;
        int i27;
        if (i17 >= i18) {
            return sb6.toString();
        }
        if (sb6.charAt(i17) == '/') {
            i17++;
        }
        int i28 = i17;
        int i29 = i28;
        while (i28 <= i18) {
            if (i28 == i18) {
                i19 = i28;
            } else if (sb6.charAt(i28) == '/') {
                i19 = i28 + 1;
            } else {
                i28++;
            }
            int i37 = i29 + 1;
            if (i28 == i37 && sb6.charAt(i29) == '.') {
                sb6.delete(i29, i19);
                i18 -= i19 - i29;
            } else {
                if (i28 == i29 + 2 && sb6.charAt(i29) == '.' && sb6.charAt(i37) == '.') {
                    i27 = sb6.lastIndexOf("/", i29 - 2) + 1;
                    int i38 = i27 > i17 ? i27 : i17;
                    sb6.delete(i38, i19);
                    i18 -= i19 - i38;
                } else {
                    i27 = i28 + 1;
                }
                i29 = i27;
            }
            i28 = i29;
        }
        return sb6.toString();
    }

    public static android.net.Uri c(java.lang.String str, java.lang.String str2) {
        java.lang.String b17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] a17 = a(str2);
        if (a17[0] != -1) {
            sb6.append(str2);
            b(sb6, a17[1], a17[2]);
            b17 = sb6.toString();
        } else {
            int[] a18 = a(str);
            if (a17[3] == 0) {
                sb6.append((java.lang.CharSequence) str, 0, a18[3]);
                sb6.append(str2);
                b17 = sb6.toString();
            } else if (a17[2] == 0) {
                sb6.append((java.lang.CharSequence) str, 0, a18[2]);
                sb6.append(str2);
                b17 = sb6.toString();
            } else {
                int i17 = a17[1];
                if (i17 != 0) {
                    int i18 = a18[0] + 1;
                    sb6.append((java.lang.CharSequence) str, 0, i18);
                    sb6.append(str2);
                    b17 = b(sb6, a17[1] + i18, i18 + a17[2]);
                } else if (str2.charAt(i17) == '/') {
                    sb6.append((java.lang.CharSequence) str, 0, a18[1]);
                    sb6.append(str2);
                    int i19 = a18[1];
                    b17 = b(sb6, i19, a17[2] + i19);
                } else {
                    int i27 = a18[0] + 2;
                    int i28 = a18[1];
                    if (i27 >= i28 || i28 != a18[2]) {
                        int lastIndexOf = str.lastIndexOf(47, a18[2] - 1);
                        int i29 = lastIndexOf == -1 ? a18[1] : lastIndexOf + 1;
                        sb6.append((java.lang.CharSequence) str, 0, i29);
                        sb6.append(str2);
                        b17 = b(sb6, a18[1], i29 + a17[2]);
                    } else {
                        sb6.append((java.lang.CharSequence) str, 0, i28);
                        sb6.append('/');
                        sb6.append(str2);
                        int i37 = a18[1];
                        b17 = b(sb6, i37, a17[2] + i37 + 1);
                    }
                }
            }
        }
        return android.net.Uri.parse(b17);
    }
}
