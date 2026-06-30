package dy4;

/* loaded from: classes8.dex */
public final class p0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326228a;

    public p0(dy4.f1 f1Var) {
        this.f326228a = f1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a9, code lost:
    
        if (r26.i0.q(r3.B, r5.m75945x2fec8307(20), false, 2, null) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        r3.getClass();
        r14 = r3.f326160n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b2, code lost:
    
        if ((r14 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b4, code lost:
    
        r13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v) r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b7, code lost:
    
        if (r13 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r13.F(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r13, android.os.Bundle r14) {
        /*
            r12 = this;
            java.lang.String r0 = "onExitFinderFullscreen mLocalFeedId: "
            r1 = 2
            if (r13 != r1) goto Lc9
            r13 = 0
            r2 = 0
            dy4.f1 r3 = r12.f326228a
            if (r14 == 0) goto L13
            java.lang.String r4 = "videoInfoForMp"
            byte[] r4 = r14.getByteArray(r4)     // Catch: java.lang.Exception -> Lbd
            goto L14
        L13:
            r4 = r13
        L14:
            if (r4 == 0) goto Lc9
            r45.n23 r5 = new r45.n23     // Catch: java.lang.Exception -> Lbd
            r5.<init>()     // Catch: java.lang.Exception -> Lbd
            r5.mo11468x92b714fd(r4)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r4 = "playbackTime"
            r6 = 0
            float r14 = r14.getFloat(r4, r6)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r4 = r3.x()     // Catch: java.lang.Exception -> Lbd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbd
            r6.<init>(r0)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = r3.B     // Catch: java.lang.Exception -> Lbd
            r6.append(r0)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = ", feedKey: %s, playBackTime: %s, cacheSize: %s, totalSize: %s, playBackTime: %sisMoovReady: %s, state: %s"
            r6.append(r0)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> Lbd
            r6 = 7
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lbd
            r7 = 20
            java.lang.String r8 = r5.m75945x2fec8307(r7)     // Catch: java.lang.Exception -> Lbd
            r6[r2] = r8     // Catch: java.lang.Exception -> Lbd
            r8 = 16
            int r8 = r5.m75939xb282bd08(r8)     // Catch: java.lang.Exception -> Lbd
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Lbd
            r9 = 1
            r6[r9] = r8     // Catch: java.lang.Exception -> Lbd
            r8 = 11
            long r10 = r5.m75942xfb822ef2(r8)     // Catch: java.lang.Exception -> Lbd
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Exception -> Lbd
            r6[r1] = r8     // Catch: java.lang.Exception -> Lbd
            r8 = 12
            long r10 = r5.m75942xfb822ef2(r8)     // Catch: java.lang.Exception -> Lbd
            java.lang.Long r8 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Exception -> Lbd
            r10 = 3
            r6[r10] = r8     // Catch: java.lang.Exception -> Lbd
            r8 = 21
            boolean r8 = r5.m75933x41a8a7f2(r8)     // Catch: java.lang.Exception -> Lbd
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> Lbd
            r10 = 4
            r6[r10] = r8     // Catch: java.lang.Exception -> Lbd
            r8 = 14
            int r8 = r5.m75939xb282bd08(r8)     // Catch: java.lang.Exception -> Lbd
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Lbd
            r10 = 5
            r6[r10] = r8     // Catch: java.lang.Exception -> Lbd
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch: java.lang.Exception -> Lbd
            r8 = 6
            r6[r8] = r14     // Catch: java.lang.Exception -> Lbd
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0, r6)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r14 = r3.B     // Catch: java.lang.Exception -> Lbd
            if (r14 == 0) goto L9d
            int r14 = r14.length()     // Catch: java.lang.Exception -> Lbd
            if (r14 != 0) goto L9c
            goto L9d
        L9c:
            r9 = r2
        L9d:
            if (r9 != 0) goto Lc9
            java.lang.String r14 = r3.B     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = r5.m75945x2fec8307(r7)     // Catch: java.lang.Exception -> Lbd
            boolean r14 = r26.i0.q(r14, r0, r2, r1, r13)     // Catch: java.lang.Exception -> Lbd
            if (r14 == 0) goto Lc9
            r3.getClass()     // Catch: java.lang.Exception -> Lbd
            ye1.e r14 = r3.f326160n     // Catch: java.lang.Exception -> Lbd
            boolean r0 = r14 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto Lb7
            r13 = r14
            com.tencent.mm.plugin.appbrand.video.player.thumb.v r13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.v) r13     // Catch: java.lang.Exception -> Lbd
        Lb7:
            if (r13 == 0) goto Lc9
            r13.F(r5)     // Catch: java.lang.Exception -> Lbd
            goto Lc9
        Lbd:
            r13 = move-exception
            java.lang.String r14 = r3.x()
            java.lang.String r0 = "onExitFinderFullscreen exception"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r14, r13, r0, r1)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dy4.p0.a(int, android.os.Bundle):void");
    }
}
