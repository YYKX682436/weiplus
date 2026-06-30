package bm5;

/* loaded from: classes2.dex */
public abstract class j0 {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r26.n0.N((java.lang.CharSequence) r2) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if ((((java.lang.Number) r2).doubleValue() == 0.0d) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.Map r8, java.util.Map r9) {
        /*
            r0 = 0
            r1 = 1
            if (r9 == 0) goto Ld
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 != 0) goto L68
            if (r8 != 0) goto L13
            goto L68
        L13:
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L1b:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r9.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L34
            goto L1b
        L34:
            boolean r4 = r8.containsKey(r3)
            if (r4 == 0) goto L61
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L48
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = r26.n0.N(r4)
            if (r4 != 0) goto L5f
            goto L61
        L48:
            boolean r4 = r2 instanceof java.lang.Number
            if (r4 == 0) goto L61
            r4 = r2
            java.lang.Number r4 = (java.lang.Number) r4
            double r4 = r4.doubleValue()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L5b
            r4 = r1
            goto L5c
        L5b:
            r4 = r0
        L5c:
            if (r4 != 0) goto L5f
            goto L61
        L5f:
            r4 = r0
            goto L62
        L61:
            r4 = r1
        L62:
            if (r4 == 0) goto L1b
            r8.put(r3, r2)
            goto L1b
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bm5.j0.a(java.util.Map, java.util.Map):void");
    }
}
