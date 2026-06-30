package s46;

/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final char f484535a;

    /* renamed from: b, reason: collision with root package name */
    public static final char f484536b;

    static {
        java.lang.Character.toString('.');
        char c17 = java.io.File.separatorChar;
        f484535a = c17;
        if (c17 == '\\') {
            f484536b = '/';
        } else {
            f484536b = '\\';
        }
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        int e17 = e(str2);
        if (e17 < 0) {
            return null;
        }
        if (e17 > 0) {
            return h(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return h(str2);
        }
        if (g(str.charAt(length - 1))) {
            return h(str + str2);
        }
        return h(str + '/' + str2);
    }

    public static void b(java.lang.String str) {
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            if (str.charAt(i17) == 0) {
                throw new java.lang.IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
            }
        }
    }

    public static java.lang.String c(java.lang.String str) {
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (f(str) > lastIndexOf) {
            lastIndexOf = -1;
        }
        return lastIndexOf == -1 ? "" : str.substring(lastIndexOf + 1);
    }

    public static java.lang.String d(java.lang.String str) {
        if (str == null) {
            return null;
        }
        b(str);
        return str.substring(f(str) + 1);
    }

    public static int e(java.lang.String str) {
        int min;
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return g(charAt) ? 1 : 0;
        }
        if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            min = java.lang.Math.min(indexOf, indexOf2);
        } else {
            char charAt2 = str.charAt(1);
            if (charAt2 == ':') {
                char upperCase = java.lang.Character.toUpperCase(charAt);
                return (upperCase < 'A' || upperCase > 'Z') ? upperCase == '/' ? 1 : -1 : (length == 2 || !g(str.charAt(2))) ? 2 : 3;
            }
            if (!g(charAt) || !g(charAt2)) {
                return g(charAt) ? 1 : 0;
            }
            int indexOf3 = str.indexOf(47, 2);
            int indexOf4 = str.indexOf(92, 2);
            if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
                return -1;
            }
            if (indexOf3 == -1) {
                indexOf3 = indexOf4;
            }
            if (indexOf4 == -1) {
                indexOf4 = indexOf3;
            }
            min = java.lang.Math.min(indexOf3, indexOf4);
        }
        return min + 1;
    }

    public static int f(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        return java.lang.Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean g(char c17) {
        return c17 == '/' || c17 == '\\';
    }

    public static java.lang.String h(java.lang.String str) {
        char c17;
        boolean z17;
        if (str != null) {
            b(str);
            int length = str.length();
            if (length == 0) {
                return str;
            }
            int e17 = e(str);
            if (e17 >= 0) {
                int i17 = length + 2;
                char[] cArr = new char[i17];
                str.getChars(0, str.length(), cArr, 0);
                int i18 = 0;
                while (true) {
                    c17 = f484535a;
                    if (i18 >= i17) {
                        break;
                    }
                    if (cArr[i18] == f484536b) {
                        cArr[i18] = c17;
                    }
                    i18++;
                }
                if (cArr[length - 1] != c17) {
                    cArr[length] = c17;
                    length++;
                    z17 = false;
                } else {
                    z17 = true;
                }
                int i19 = e17 + 1;
                int i27 = i19;
                while (i27 < length) {
                    if (cArr[i27] == c17) {
                        int i28 = i27 - 1;
                        if (cArr[i28] == c17) {
                            java.lang.System.arraycopy(cArr, i27, cArr, i28, length - i27);
                            length--;
                            i27 = i28;
                        }
                    }
                    i27++;
                }
                int i29 = i19;
                while (i29 < length) {
                    if (cArr[i29] == c17) {
                        int i37 = i29 - 1;
                        if (cArr[i37] == '.' && (i29 == i19 || cArr[i29 - 2] == c17)) {
                            if (i29 == length - 1) {
                                z17 = true;
                            }
                            java.lang.System.arraycopy(cArr, i29 + 1, cArr, i37, length - i29);
                            length -= 2;
                            i29 = i37;
                        }
                    }
                    i29++;
                }
                int i38 = e17 + 2;
                int i39 = i38;
                while (i39 < length) {
                    if (cArr[i39] == c17 && cArr[i39 - 1] == '.' && cArr[i39 - 2] == '.' && (i39 == i38 || cArr[i39 - 3] == c17)) {
                        if (i39 != i38) {
                            if (i39 == length - 1) {
                                z17 = true;
                            }
                            int i47 = i39 - 4;
                            while (true) {
                                if (i47 < e17) {
                                    int i48 = i39 + 1;
                                    java.lang.System.arraycopy(cArr, i48, cArr, e17, length - i39);
                                    length -= i48 - e17;
                                    i39 = i19;
                                    break;
                                }
                                if (cArr[i47] == c17) {
                                    int i49 = i47 + 1;
                                    java.lang.System.arraycopy(cArr, i39 + 1, cArr, i49, length - i39);
                                    length -= i39 - i47;
                                    i39 = i49;
                                    break;
                                }
                                i47--;
                            }
                        }
                    }
                    i39++;
                }
                if (length <= 0) {
                    return "";
                }
                if (length > e17 && !z17) {
                    return new java.lang.String(cArr, 0, length - 1);
                }
                return new java.lang.String(cArr, 0, length);
            }
        }
        return null;
    }
}
