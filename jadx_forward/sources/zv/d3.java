package zv;

/* loaded from: classes9.dex */
public final class d3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f557465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f557466e;

    public d3(long j17, yz5.l lVar) {
        this.f557465d = j17;
        this.f557466e = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0075, code lost:
    
        r13 = new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23575x685aa6c0(r9, r10, java.lang.Boolean.valueOf(r7), java.lang.Boolean.valueOf(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0086, code lost:
    
        if (r6.d1() <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0088, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        r0.add(new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23539x998b3e4d(r13, java.lang.Boolean.valueOf(r12), java.lang.Long.valueOf(r6.w0())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:
    
        if (r2.moveToNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        vz5.b.a(r2, null);
        r14.f557466e.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r2.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        r6 = new com.p314xaae8f345.mm.p2621x8fb0427b.l4();
        r6.mo9015xbf5d97fd(r2);
        r7 = r1.n(r6.h1(), true);
        r9 = r6.h1();
        r10 = r6.h1();
        r11 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r6.h1());
        ((sg3.a) r3).getClass();
        r10 = c01.a2.d(r7, r10, r11);
        r11 = r6.g2();
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x006a, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0070, code lost:
    
        if (r7.r2() != true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0072, code lost:
    
        r7 = true;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            lm0.a r2 = gm0.j1.s(r1)
            vg3.x3 r2 = (vg3.x3) r2
            com.tencent.mm.plugin.messenger.foundation.h2 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r2
            com.tencent.mm.storage.m4 r2 = r2.Di()
            long r3 = r14.f557465d
            int r3 = (int) r3
            r4 = 1
            r5 = 0
            java.lang.String r6 = "service_officialaccounts"
            android.database.Cursor r2 = r2.s(r4, r5, r6, r3)
            lm0.a r1 = gm0.j1.s(r1)
            vg3.x3 r1 = (vg3.x3) r1
            com.tencent.mm.plugin.messenger.foundation.h2 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r1
            com.tencent.mm.storage.k4 r1 = r1.Bi()
            java.lang.Class<tg3.v0> r3 = tg3.v0.class
            i95.m r3 = i95.n0.c(r3)
            tg3.v0 r3 = (tg3.v0) r3
            boolean r6 = r2.moveToFirst()     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto La1
        L39:
            com.tencent.mm.storage.l4 r6 = new com.tencent.mm.storage.l4     // Catch: java.lang.Throwable -> Lb2
            r6.<init>()     // Catch: java.lang.Throwable -> Lb2
            r6.mo9015xbf5d97fd(r2)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r7 = r6.h1()     // Catch: java.lang.Throwable -> Lb2
            com.tencent.mm.storage.z3 r7 = r1.n(r7, r4)     // Catch: java.lang.Throwable -> Lb2
            com.tencent.pigeon.brand_service.BrandServiceAccountInfo r8 = new com.tencent.pigeon.brand_service.BrandServiceAccountInfo     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r9 = r6.h1()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r10 = r6.h1()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r11 = r6.h1()     // Catch: java.lang.Throwable -> Lb2
            boolean r11 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(r11)     // Catch: java.lang.Throwable -> Lb2
            r12 = r3
            sg3.a r12 = (sg3.a) r12     // Catch: java.lang.Throwable -> Lb2
            r12.getClass()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r10 = c01.a2.d(r7, r10, r11)     // Catch: java.lang.Throwable -> Lb2
            boolean r11 = r6.g2()     // Catch: java.lang.Throwable -> Lb2
            r12 = 0
            if (r7 == 0) goto L74
            boolean r7 = r7.r2()     // Catch: java.lang.Throwable -> Lb2
            if (r7 != r4) goto L74
            r7 = r4
            goto L75
        L74:
            r7 = r12
        L75:
            com.tencent.pigeon.brand_service.BrandServiceContactInfo r13 = new com.tencent.pigeon.brand_service.BrandServiceContactInfo     // Catch: java.lang.Throwable -> Lb2
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> Lb2
            r13.<init>(r9, r10, r7, r11)     // Catch: java.lang.Throwable -> Lb2
            int r7 = r6.d1()     // Catch: java.lang.Throwable -> Lb2
            if (r7 <= 0) goto L89
            r12 = r4
        L89:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> Lb2
            long r9 = r6.w0()     // Catch: java.lang.Throwable -> Lb2
            java.lang.Long r6 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lb2
            r8.<init>(r13, r7, r6)     // Catch: java.lang.Throwable -> Lb2
            r0.add(r8)     // Catch: java.lang.Throwable -> Lb2
            boolean r6 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb2
            if (r6 != 0) goto L39
        La1:
            vz5.b.a(r2, r5)
            java.lang.Object r0 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0)
            kotlin.Result r0 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r0)
            yz5.l r1 = r14.f557466e
            r1.mo146xb9724478(r0)
            return
        Lb2:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r1 = move-exception
            vz5.b.a(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zv.d3.run():void");
    }
}
