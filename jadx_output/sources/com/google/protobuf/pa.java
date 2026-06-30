package com.google.protobuf;

/* loaded from: classes10.dex */
public class pa extends java.lang.RuntimeException {
    public pa(com.google.protobuf.o8 o8Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pa(java.util.List r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Message missing required fields: "
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
            r1 = 1
        Lc:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r1 == 0) goto L1c
            r1 = 0
            goto L21
        L1c:
            java.lang.String r3 = ", "
            r0.append(r3)
        L21:
            r0.append(r2)
            goto Lc
        L25:
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.pa.<init>(java.util.List):void");
    }
}
