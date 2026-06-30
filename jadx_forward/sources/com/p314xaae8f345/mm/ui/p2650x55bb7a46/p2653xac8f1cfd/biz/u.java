package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes8.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.w f280350d;

    public u(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.w wVar) {
        this.f280350d = wVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0037, code lost:
    
        r2.add(r1.getString(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (r1.moveToNext() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        r1.close();
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r9 = this;
            r0 = 1
            c01.z1.S(r0)
            r01.x r1 = r01.q3.cj()
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r5 = "bizinfo"
            java.lang.String r6 = "type"
            java.lang.String r7 = "username"
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r5, r6, r4}
            java.lang.String r5 = "select %s from %s where %s = %d"
            java.lang.String r3 = java.lang.String.format(r3, r5, r4)
            r4 = 0
            java.lang.String[] r5 = new java.lang.String[r4]
            android.database.Cursor r1 = r1.m145256x1d3f4980(r3, r5)
            if (r1 == 0) goto L47
            boolean r3 = r1.moveToFirst()
            if (r3 == 0) goto L44
        L37:
            java.lang.String r3 = r1.getString(r4)
            r2.add(r3)
            boolean r3 = r1.moveToNext()
            if (r3 != 0) goto L37
        L44:
            r1.close()
        L47:
            java.util.Iterator r1 = r2.iterator()
        L4b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = c01.e2.d(r2)
            if (r3 != 0) goto L4b
            com.tencent.mm.ui.chatting.component.biz.w r3 = r9.f280350d
            com.tencent.mm.ui.chatting.component.biz.x r3 = r3.f280353b
            java.util.List r3 = r3.f280355e
            r3.add(r2)
            goto L4b
        L67:
            com.tencent.mm.ui.chatting.component.biz.w r1 = r9.f280350d
            com.tencent.mm.ui.chatting.component.biz.x r1 = r1.f280353b
            java.util.List r1 = r1.f280355e
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L73:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lc2
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class<vg3.x3> r6 = vg3.x3.class
            lm0.a r7 = gm0.j1.s(r6)
            vg3.x3 r7 = (vg3.x3) r7
            com.tencent.mm.plugin.messenger.foundation.h2 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r7
            com.tencent.mm.storage.k4 r7 = r7.Bi()
            com.tencent.mm.storage.z3 r7 = r7.n(r5, r0)
            c01.e2.p0(r7, r4)
            lm0.a r8 = gm0.j1.s(r6)
            vg3.x3 r8 = (vg3.x3) r8
            com.tencent.mm.plugin.messenger.foundation.h2 r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r8
            com.tencent.mm.storage.m4 r8 = r8.Di()
            com.tencent.mm.storage.l4 r8 = r8.p(r5)
            if (r8 == 0) goto L73
            lm0.a r6 = gm0.j1.s(r6)
            vg3.x3 r6 = (vg3.x3) r6
            com.tencent.mm.plugin.messenger.foundation.h2 r6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r6
            com.tencent.mm.storage.m4 r6 = r6.Di()
            r6.W(r8, r5)
            boolean r5 = c01.e2.P(r7)
            if (r5 != 0) goto L73
            int r5 = r8.d1()
            long r5 = (long) r5
            long r2 = r2 + r5
            goto L73
        Lc2:
            ku5.u0 r0 = ku5.t0.f394148d
            com.tencent.mm.ui.chatting.component.biz.t r1 = new com.tencent.mm.ui.chatting.component.biz.t
            r1.<init>(r9)
            ku5.t0 r0 = (ku5.t0) r0
            r0.B(r1)
            com.tencent.mm.autogen.mmdata.rpt.ServiceAcctMuteOpStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.ServiceAcctMuteOpStruct
            r0.<init>()
            r4 = 2
            r0.f141768d = r4
            long r4 = c01.id.a()
            r0.f141769e = r4
            r0.f141770f = r2
            r0.k()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.u.run():void");
    }
}
