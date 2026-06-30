package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public abstract class q8 {
    public static final java.lang.String a(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            if (java.lang.Character.isUpperCase(charAt)) {
                sb6.append("_");
            }
            sb6.append(java.lang.Character.toLowerCase(charAt));
        }
        return sb6.toString();
    }

    public static final void b(java.lang.StringBuilder sb6, int i17, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.util.List) {
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                b(sb6, i17, str, it.next());
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it6 = ((java.util.Map) obj).entrySet().iterator();
            while (it6.hasNext()) {
                b(sb6, i17, str, (java.util.Map.Entry) it6.next());
            }
            return;
        }
        sb6.append('\n');
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            sb6.append(' ');
        }
        sb6.append(str);
        if (obj instanceof java.lang.String) {
            sb6.append(": \"");
            sb6.append(com.p176xb6135e39.p283xc50a8b8b.ma.a(com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj)));
            sb6.append('\"');
            return;
        }
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.y) {
            sb6.append(": \"");
            sb6.append(com.p176xb6135e39.p283xc50a8b8b.ma.a((com.p176xb6135e39.p283xc50a8b8b.y) obj));
            sb6.append('\"');
            return;
        }
        if (obj instanceof com.p176xb6135e39.p283xc50a8b8b.n5) {
            sb6.append(" {");
            c((com.p176xb6135e39.p283xc50a8b8b.n5) obj, sb6, i17 + 2);
            sb6.append("\n");
            while (i18 < i17) {
                sb6.append(' ');
                i18++;
            }
            sb6.append("}");
            return;
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            sb6.append(": ");
            sb6.append(obj.toString());
            return;
        }
        sb6.append(" {");
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int i27 = i17 + 2;
        b(sb6, i27, "key", entry.getKey());
        b(sb6, i27, "value", entry.getValue());
        sb6.append("\n");
        while (i18 < i17) {
            sb6.append(' ');
            i18++;
        }
        sb6.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x021c, code lost:
    
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f6, code lost:
    
        if (((java.lang.Integer) r4).intValue() == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01f8, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020a, code lost:
    
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.p176xb6135e39.p283xc50a8b8b.o8 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p283xc50a8b8b.q8.c(com.google.protobuf.o8, java.lang.StringBuilder, int):void");
    }
}
