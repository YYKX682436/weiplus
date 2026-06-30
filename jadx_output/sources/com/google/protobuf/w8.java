package com.google.protobuf;

/* loaded from: classes16.dex */
public abstract class w8 {
    public static java.lang.String a(java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (sb6.length() > 0) {
                sb6.append(", ");
            }
            sb6.append(str);
        }
        return sb6.toString();
    }

    public static void b(com.google.protobuf.r8 r8Var, java.lang.String str, java.util.List list) {
        for (com.google.protobuf.b4 b4Var : r8Var.getDescriptorForType().n()) {
            if (b4Var.s() && !r8Var.hasField(b4Var)) {
                java.lang.String valueOf = java.lang.String.valueOf(str);
                java.lang.String valueOf2 = java.lang.String.valueOf(b4Var.getName());
                list.add(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf));
            }
        }
        for (java.util.Map.Entry entry : r8Var.getAllFields().entrySet()) {
            com.google.protobuf.b4 b4Var2 = (com.google.protobuf.b4) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (b4Var2.f44914m.f44859d == com.google.protobuf.z3.MESSAGE) {
                if (b4Var2.d1()) {
                    java.util.Iterator it = ((java.util.List) value).iterator();
                    int i17 = 0;
                    while (it.hasNext()) {
                        b((com.google.protobuf.r8) it.next(), d(str, b4Var2, i17), list);
                        i17++;
                    }
                } else if (r8Var.hasField(b4Var2)) {
                    b((com.google.protobuf.r8) value, d(str, b4Var2, -1), list);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(com.google.protobuf.d0 r7, com.google.protobuf.sa r8, com.google.protobuf.t4 r9, com.google.protobuf.r3 r10, com.google.protobuf.v8 r11, int r12) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w8.c(com.google.protobuf.d0, com.google.protobuf.sa, com.google.protobuf.t4, com.google.protobuf.r3, com.google.protobuf.v8, int):boolean");
    }

    public static java.lang.String d(java.lang.String str, com.google.protobuf.b4 b4Var, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str);
        if (b4Var.o()) {
            sb6.append('(');
            sb6.append(b4Var.f44910f);
            sb6.append(')');
        } else {
            sb6.append(b4Var.getName());
        }
        if (i17 != -1) {
            sb6.append('[');
            sb6.append(i17);
            sb6.append(']');
        }
        sb6.append('.');
        return sb6.toString();
    }
}
