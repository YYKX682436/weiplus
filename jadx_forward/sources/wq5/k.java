package wq5;

/* loaded from: classes13.dex */
public class k extends wq5.h {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f530258i;

    static {
        java.util.HashMap hashMap = new java.util.HashMap(8);
        f530258i = hashMap;
        hashMap.put("amp", wq5.i.f530244a);
        hashMap.put("apos", wq5.i.f530245b);
        hashMap.put("gt", wq5.i.f530248e);
        hashMap.put("lt", wq5.i.f530249f);
        hashMap.put("quot", wq5.i.f530251h);
    }

    public java.lang.Object g(char c17) {
        char c18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            c18 = c();
            if (!java.lang.Character.isLetterOrDigit(c18) && c18 != '#') {
                break;
            }
            sb6.append(java.lang.Character.toLowerCase(c18));
        }
        if (c18 != ';') {
            throw f("Missing ';' in XML entity: &" + ((java.lang.Object) sb6));
        }
        java.lang.String sb7 = sb6.toString();
        if (sb7 == null || sb7.isEmpty()) {
            return "";
        }
        if (sb7.charAt(0) == '#') {
            return new java.lang.String(new int[]{(sb7.charAt(1) == 'x' || sb7.charAt(1) == 'X') ? java.lang.Integer.parseInt(sb7.substring(2), 16) : java.lang.Integer.parseInt(sb7.substring(1))}, 0, 1);
        }
        java.lang.Character ch6 = (java.lang.Character) f530258i.get(sb7);
        if (ch6 != null) {
            return ch6.toString();
        }
        return "&" + sb7 + ';';
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        throw f("Bad character in a name");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0048. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h() {
        /*
            r7 = this;
        L0:
            char r0 = r7.c()
            boolean r1 = java.lang.Character.isWhitespace(r0)
            if (r1 != 0) goto L0
            if (r0 == 0) goto L9f
            r1 = 39
            if (r0 == r1) goto L76
            r2 = 47
            if (r0 == r2) goto L73
            r3 = 33
            if (r0 == r3) goto L70
            r4 = 34
            if (r0 == r4) goto L76
            switch(r0) {
                case 60: goto L69;
                case 61: goto L66;
                case 62: goto L63;
                case 63: goto L60;
                default: goto L1f;
            }
        L1f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L24:
            r5.append(r0)
            char r0 = r7.c()
            boolean r6 = java.lang.Character.isWhitespace(r0)
            if (r6 == 0) goto L36
            java.lang.String r0 = r5.toString()
            return r0
        L36:
            if (r0 == 0) goto L5b
            if (r0 == r1) goto L54
            if (r0 == r2) goto L4c
            r6 = 91
            if (r0 == r6) goto L4c
            r6 = 93
            if (r0 == r6) goto L4c
            if (r0 == r3) goto L4c
            if (r0 == r4) goto L54
            switch(r0) {
                case 60: goto L54;
                case 61: goto L4c;
                case 62: goto L4c;
                case 63: goto L4c;
                default: goto L4b;
            }
        L4b:
            goto L24
        L4c:
            r7.a()
            java.lang.String r0 = r5.toString()
            return r0
        L54:
            java.lang.String r0 = "Bad character in a name"
            wq5.b r0 = r7.f(r0)
            throw r0
        L5b:
            java.lang.String r0 = r5.toString()
            return r0
        L60:
            java.lang.Character r0 = wq5.i.f530250g
            return r0
        L63:
            java.lang.Character r0 = wq5.i.f530248e
            return r0
        L66:
            java.lang.Character r0 = wq5.i.f530247d
            return r0
        L69:
            java.lang.String r0 = "Misplaced '<'"
            wq5.b r0 = r7.f(r0)
            throw r0
        L70:
            java.lang.Character r0 = wq5.i.f530246c
            return r0
        L73:
            java.lang.Character r0 = wq5.i.f530252i
            return r0
        L76:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L7b:
            char r2 = r7.c()
            if (r2 == 0) goto L98
            if (r2 != r0) goto L88
            java.lang.String r0 = r1.toString()
            return r0
        L88:
            r3 = 38
            if (r2 != r3) goto L94
            java.lang.Object r2 = r7.g(r2)
            r1.append(r2)
            goto L7b
        L94:
            r1.append(r2)
            goto L7b
        L98:
            java.lang.String r0 = "Unterminated string"
            wq5.b r0 = r7.f(r0)
            throw r0
        L9f:
            java.lang.String r0 = "Misshaped element"
            wq5.b r0 = r7.f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wq5.k.h():java.lang.Object");
    }

    public void i(java.lang.String str) {
        boolean z17;
        char c17;
        int length = str.length();
        char[] cArr = new char[length];
        for (int i17 = 0; i17 < length; i17++) {
            char c18 = c();
            if (c18 == 0) {
                return;
            }
            cArr[i17] = c18;
        }
        int i18 = 0;
        while (true) {
            int i19 = 0;
            int i27 = i18;
            while (true) {
                if (i19 >= length) {
                    z17 = true;
                    break;
                } else {
                    if (cArr[i27] != str.charAt(i19)) {
                        z17 = false;
                        break;
                    }
                    i27++;
                    if (i27 >= length) {
                        i27 -= length;
                    }
                    i19++;
                }
            }
            if (z17 || (c17 = c()) == 0) {
                return;
            }
            cArr[i18] = c17;
            i18++;
            if (i18 >= length) {
                i18 -= length;
            }
        }
    }
}
