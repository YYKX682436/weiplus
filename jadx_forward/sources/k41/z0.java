package k41;

/* loaded from: classes9.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final k41.z0 f385590d = new k41.z0();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r4.length() != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r4 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r2.add(r3.h1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r1.moveToNext() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r1.isAfterLast() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r1.close();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConversationLogic", "deleteAllOpenImKefuConversation conversation list size: %s", java.lang.Integer.valueOf(r2.size()));
        r1 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r1.hasNext() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        c01.w9.h((java.lang.String) r1.next(), new k41.y0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        r3 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        r3.mo9015xbf5d97fd(r1);
        r4 = r3.h1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r4 == null) goto L13;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r6 = this;
            java.lang.Class<vg3.x3> r0 = vg3.x3.class
            lm0.a r1 = gm0.j1.s(r0)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r1
            com.tencent.mm.storage.m4 r1 = r1.Di()
            r2 = -1
            r3 = 6
            r4 = 0
            java.lang.String r5 = "opencustomerservicemsg"
            android.database.Cursor r1 = r1.s(r3, r4, r5, r2)
            if (r1 != 0) goto L1a
            return
        L1a:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L53
        L25:
            com.tencent.mm.storage.l4 r3 = new com.tencent.mm.storage.l4
            r3.<init>()
            r3.mo9015xbf5d97fd(r1)
            java.lang.String r4 = r3.h1()
            if (r4 == 0) goto L3c
            int r4 = r4.length()
            if (r4 != 0) goto L3a
            goto L3c
        L3a:
            r4 = 0
            goto L3d
        L3c:
            r4 = 1
        L3d:
            if (r4 == 0) goto L40
            goto L47
        L40:
            java.lang.String r3 = r3.h1()
            r2.add(r3)
        L47:
            boolean r3 = r1.moveToNext()
            if (r3 == 0) goto L53
            boolean r3 = r1.isAfterLast()
            if (r3 == 0) goto L25
        L53:
            r1.close()
            int r1 = r2.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "MicroMsg.OpenIMKefuConversationLogic"
            java.lang.String r4 = "deleteAllOpenImKefuConversation conversation list size: %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r1)
            java.util.Iterator r1 = r2.iterator()
        L6d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L82
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            k41.y0 r4 = new k41.y0
            r4.<init>()
            c01.w9.h(r3, r4)
            goto L6d
        L82:
            lm0.a r0 = gm0.j1.s(r0)
            vg3.x3 r0 = (vg3.x3) r0
            com.tencent.mm.plugin.messenger.foundation.h2 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r0
            com.tencent.mm.storage.m4 r0 = r0.Di()
            r0.m(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k41.z0.run():void");
    }
}
