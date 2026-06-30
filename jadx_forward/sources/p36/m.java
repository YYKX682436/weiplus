package p36;

/* loaded from: classes16.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final l36.r0 f433274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f433275b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f433276c;

    public m(l36.r0 r0Var, int i17, java.lang.String str) {
        this.f433274a = r0Var;
        this.f433275b = i17;
        this.f433276c = str;
    }

    public static p36.m a(java.lang.String str) {
        int i17;
        java.lang.String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        l36.r0 r0Var = l36.r0.HTTP_1_0;
        if (startsWith) {
            i17 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
                }
                r0Var = l36.r0.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
            }
            i17 = 4;
        }
        int i18 = i17 + 3;
        if (str.length() < i18) {
            throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = java.lang.Integer.parseInt(str.substring(i17, i18));
            if (str.length() <= i18) {
                str2 = "";
            } else {
                if (str.charAt(i18) != ' ') {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i17 + 4);
            }
            return new p36.m(r0Var, parseInt, str2);
        } catch (java.lang.NumberFormatException unused) {
            throw new java.net.ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* renamed from: toString */
    public java.lang.String m157822x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f433274a == l36.r0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb6.append(' ');
        sb6.append(this.f433275b);
        java.lang.String str = this.f433276c;
        if (str != null) {
            sb6.append(' ');
            sb6.append(str);
        }
        return sb6.toString();
    }
}
