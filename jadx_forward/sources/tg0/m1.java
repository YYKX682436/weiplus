package tg0;

/* loaded from: classes8.dex */
public abstract class m1 {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.lang.String r10) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            int r0 = r10.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            if (r0 == 0) goto L13
            return r10
        L13:
            int r0 = r10.length()
            r3 = r2
        L18:
            r4 = 9
            r5 = 13
            r6 = 10
            r7 = 34
            r8 = 92
            if (r3 >= r0) goto L36
            char r9 = r10.charAt(r3)
            if (r9 == r8) goto L37
            if (r9 == r7) goto L37
            if (r9 == r6) goto L37
            if (r9 == r5) goto L37
            if (r9 != r4) goto L33
            goto L37
        L33:
            int r3 = r3 + 1
            goto L18
        L36:
            r1 = r2
        L37:
            if (r1 != 0) goto L3a
            return r10
        L3a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r10.length()
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r10.length()
        L49:
            if (r2 >= r1) goto L7d
            char r3 = r10.charAt(r2)
            if (r3 != r8) goto L57
            java.lang.String r3 = "\\\\"
            r0.append(r3)
            goto L7a
        L57:
            if (r3 != r7) goto L5f
            java.lang.String r3 = "\\\""
            r0.append(r3)
            goto L7a
        L5f:
            if (r3 != r6) goto L67
            java.lang.String r3 = "\\n"
            r0.append(r3)
            goto L7a
        L67:
            if (r3 != r5) goto L6f
            java.lang.String r3 = "\\r"
            r0.append(r3)
            goto L7a
        L6f:
            if (r3 != r4) goto L77
            java.lang.String r3 = "\\t"
            r0.append(r3)
            goto L7a
        L77:
            r0.append(r3)
        L7a:
            int r2 = r2 + 1
            goto L49
        L7d:
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tg0.m1.a(java.lang.String):java.lang.String");
    }

    public static final java.lang.String b(java.util.Map map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "<this>");
        if (map.size() == 0) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(30100);
        sb6.append("{");
        boolean z17 = true;
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (!z17) {
                sb6.append(",");
            }
            sb6.append("\"");
            sb6.append(str);
            sb6.append("\":");
            if (value instanceof java.lang.String) {
                java.lang.String a17 = a((java.lang.String) value);
                sb6.append('\"');
                sb6.append(a17);
                sb6.append('\"');
            } else if (value instanceof java.lang.Number ? true : value instanceof java.lang.Boolean) {
                sb6.append(value);
            } else if (value == null) {
                sb6.append("null");
            } else {
                java.lang.String a18 = a(value.toString());
                sb6.append('\"');
                sb6.append(a18);
                sb6.append('\"');
            }
            z17 = false;
        }
        sb6.append("}");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public static final java.lang.String c(tg0.c1 c1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(30000);
        sb6.append("{\"sugVisible\":\"");
        sb6.append(c1Var.f500562a);
        sb6.append("\",\"query\":\"");
        sb6.append(c1Var.f500565d);
        sb6.append("\",\"resultJson\":");
        sb6.append(c1Var.f500566e);
        sb6.append(",\"businessType\":\"");
        sb6.append(c1Var.f500567f);
        sb6.append("\",\"offset\":\"0\",\"requestId\":\"");
        sb6.append(c1Var.f500569h);
        sb6.append("\",\"parentSearchId\":\"");
        sb6.append(c1Var.f500570i);
        sb6.append("\"}");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
