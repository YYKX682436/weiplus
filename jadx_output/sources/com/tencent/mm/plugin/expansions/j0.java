package com.tencent.mm.plugin.expansions;

/* loaded from: classes12.dex */
public class j0 implements yj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f99757a = qa.a.class.getName().replaceAll("\\.", "/");

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f99758b = com.tencent.mm.plugin.expansions.Delivery.class.getName().replaceAll("\\.", "/");

    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        if (c(str2, str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.exp.asm", "on System.loadLibrary invoke done, caller method = " + str2 + ", caller class = " + str + ", caller obj = " + obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // yj0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.Object r6, java.lang.Object[] r7) {
        /*
            r0 = this;
            boolean r3 = r0.c(r2, r1)
            if (r3 == 0) goto L7
            return
        L7:
            r3 = 0
            if (r7 == 0) goto L16
            int r4 = r7.length
            if (r4 <= 0) goto L16
            r4 = r7[r3]
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L16
            java.lang.String r4 = (java.lang.String) r4
            goto L17
        L16:
            r4 = 0
        L17:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "on System.loadLibrary invoke, caller method = "
            r5.<init>(r7)
            r5.append(r2)
            java.lang.String r2 = ", caller class = "
            r5.append(r2)
            r5.append(r1)
            java.lang.String r1 = ", caller obj = "
            r5.append(r1)
            r5.append(r6)
            java.lang.String r1 = ", libName = "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = "MicroMsg.exp.asm"
            com.tencent.mars.xlog.Log.i(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L4b
        L49:
            r1 = r3
            goto L58
        L4b:
            boolean r1 = com.tencent.mm.plugin.expansions.Delivery.isInstalled()
            if (r1 != 0) goto L52
            goto L49
        L52:
            fp.p r1 = fp.q.f265230a
            boolean r1 = r1.d(r4)
        L58:
            if (r1 == 0) goto L63
            java.lang.String r1 = "try loadLibrary with Delivery"
            com.tencent.mars.xlog.Log.i(r2, r1)
            com.tencent.mm.plugin.expansions.Delivery.tryLoadLibrary(r4, r3)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.expansions.j0.b(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Object, java.lang.Object[]):void");
    }

    public final boolean c(java.lang.String str, java.lang.String str2) {
        if (this.f99757a.equals(str2) || "com/google/android/play/core/splitinstall/SplitInstallHelper".equals(str2) || this.f99758b.equals(str2) || "com/tencent/mm/plugin/expansions/Delivery".equals(str2) || "org/extra/relinker/SystemLibraryLoader".equals(str2)) {
            return true;
        }
        return "loadLibraryFlattWithinDelivery".equals(str);
    }
}
