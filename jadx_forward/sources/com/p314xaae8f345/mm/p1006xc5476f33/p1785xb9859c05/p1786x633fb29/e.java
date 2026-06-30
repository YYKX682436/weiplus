package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29;

/* loaded from: classes8.dex */
public class e extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.g f223997a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.g gVar, android.os.Looper looper) {
        super(looper);
        this.f223997a = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        if (r6.moveToFirst() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        r8 = r6.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r7.containsKey(r8) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        r7.put(r8, java.lang.Boolean.TRUE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (r6.moveToNext() != false) goto L37;
     */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1038x5b586cbf(android.os.Message r17) {
        /*
            r16 = this;
            java.lang.System.currentTimeMillis()
            s83.d r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.wi()
            r1 = r17
            java.lang.Object r1 = r1.obj
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.getClass()
            r2 = -1
            r4 = 0
            if (r1 == 0) goto L96
            int r5 = r1.size()
            if (r5 <= 0) goto L96
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            long r5 = r5.getId()
            l75.k0 r7 = r0.f486405d
            if (r7 == 0) goto L2f
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            long r2 = r7.F(r2)
        L2f:
            java.lang.String r5 = "MicroMsg.IPCallAddressStorage"
            java.lang.String r6 = "getContactIdMap start"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6)
            l75.k0 r7 = r0.f486405d
            java.lang.String r8 = "IPCallAddressItem"
            java.lang.String r6 = "contactId"
            java.lang.String[] r9 = new java.lang.String[]{r6}
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 2
            android.database.Cursor r6 = r7.D(r8, r9, r10, r11, r12, r13, r14, r15)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r6 == 0) goto L6c
            boolean r8 = r6.moveToFirst()
            if (r8 == 0) goto L6c
        L57:
            java.lang.String r8 = r6.getString(r4)
            boolean r9 = r7.containsKey(r8)
            if (r9 != 0) goto L66
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r7.put(r8, r9)
        L66:
            boolean r8 = r6.moveToNext()
            if (r8 != 0) goto L57
        L6c:
            if (r6 == 0) goto L71
            r6.close()
        L71:
            java.lang.String r6 = "getContactIdMap end"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r6)
            java.util.Iterator r1 = r1.iterator()
        L7a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L93
            java.lang.Object r5 = r1.next()
            s83.c r5 = (s83.c) r5
            java.lang.String r6 = r5.f67827x821cd056
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto L8f
            goto L7a
        L8f:
            r0.mo880xb970c2b9(r5)
            goto L7a
        L93:
            r0.y0(r2)
        L96:
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
            r0 = r16
            com.tencent.mm.plugin.ipcall.model.g r1 = r0.f223997a
            r1.f223999a = r4
            r1.getClass()
            r1.getClass()
            java.util.ArrayList r1 = r1.f224000b
            java.util.Iterator r2 = r1.iterator()
        Lae:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc7
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.ipcall.model.f r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.f) r3
            if (r3 == 0) goto Lae
            com.tencent.mm.plugin.ipcall.ui.a1 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.a1) r3
            com.tencent.mm.plugin.ipcall.ui.IPCallContactUI r3 = r3.f224282a
            com.tencent.mm.sdk.platformtools.n3 r3 = r3.f224098w
            r4 = 1
            r3.mo50305x3d8a09a2(r4)
            goto Lae
        Lc7:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.e.mo1038x5b586cbf(android.os.Message):void");
    }
}
