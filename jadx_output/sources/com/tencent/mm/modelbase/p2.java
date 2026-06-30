package com.tencent.mm.modelbase;

/* loaded from: classes12.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f70735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f70736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f70737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f70738g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f70739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f70740i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.q2 f70741m;

    public p2(com.tencent.mm.modelbase.q2 q2Var, int i17, int i18, int i19, int i27, byte[] bArr, java.lang.String str) {
        this.f70741m = q2Var;
        this.f70735d = i17;
        this.f70736e = i18;
        this.f70737f = i19;
        this.f70738g = i27;
        this.f70739h = bArr;
        this.f70740i = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r17 = this;
            r0 = r17
            com.tencent.mm.modelbase.q2 r1 = r0.f70741m
            boolean r2 = r1.f70751g
            int r3 = r0.f70735d
            java.lang.String r4 = "MicroMsg.RemoteOnGYNetEnd"
            if (r2 == 0) goto L1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "netId:%d has been canceled"
            com.tencent.mars.xlog.Log.w(r4, r2, r1)
            return
        L1b:
            r2 = 10016(0x2720, float:1.4035E-41)
            int r5 = x51.o1.f452064q
            if (r2 != r5) goto L72
            java.lang.String r2 = x51.o1.f452066s
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto L72
            java.lang.String r2 = x51.o1.f452066s
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "onGYNetEnd DK TEST SET : %s "
            com.tencent.mars.xlog.Log.i(r4, r5, r2)
            java.lang.String r2 = x51.o1.f452066s
            java.lang.String r5 = ","
            java.lang.String[] r2 = r2.split(r5)
            if (r2 == 0) goto L72
            int r5 = r2.length
            r6 = 3
            if (r5 != r6) goto L72
            r5 = 0
            r6 = r2[r5]
            r7 = -1
            int r6 = com.tencent.mm.sdk.platformtools.t8.P(r6, r7)
            com.tencent.mm.modelbase.m1 r7 = r1.f70752h
            int r7 = r7.getType()
            if (r6 != r7) goto L72
            r6 = 1
            r6 = r2[r6]
            int r6 = com.tencent.mm.sdk.platformtools.t8.P(r6, r5)
            r7 = 2
            r2 = r2[r7]
            int r2 = com.tencent.mm.sdk.platformtools.t8.P(r2, r5)
            r5 = 999(0x3e7, float:1.4E-42)
            if (r6 != r5) goto L76
            java.lang.String r1 = x51.o1.f452066s
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "onGYNetEnd DK TEST SET syncservice : %s  NOT  CALLBACK !!!"
            com.tencent.mars.xlog.Log.w(r4, r2, r1)
            return
        L72:
            int r6 = r0.f70736e
            int r2 = r0.f70737f
        L76:
            r10 = r2
            r9 = r6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            int r2 = r0.f70738g
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r2 = r1.f70751g
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r2)
            com.tencent.mm.modelbase.m1 r2 = r1.f70752h
            int r2 = r2.hashCode()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r11, r12, r13, r14, r15, r16}
            java.lang.String r3 = "onGYNetEnd after post to worker netId:%d, sceneType:%s errType:%d, errCode:%d, isCancel:%b, hashcode:%d"
            com.tencent.mars.xlog.Log.i(r4, r3, r2)
            byte[] r2 = r0.f70739h
            boolean r2 = com.tencent.mm.modelbase.q2.d(r1, r2)
            if (r2 != 0) goto Lb9
            com.tencent.mm.network.l0 r7 = r1.f70749e
            int r8 = r0.f70735d
            java.lang.String r11 = r0.f70740i
            com.tencent.mm.network.v0 r12 = r1.f70748d
            byte[] r13 = r0.f70739h
            r7.onGYNetEnd(r8, r9, r10, r11, r12, r13)
        Lb9:
            com.tencent.mm.modelbase.m1 r2 = r1.f70752h
            boolean r2 = r2.needCheckCallback()
            if (r2 == 0) goto Le2
            com.tencent.mm.modelbase.m1 r2 = r1.f70752h
            boolean r2 = r2.hasCallBackToQueue()
            if (r2 != 0) goto Le2
            com.tencent.mm.modelbase.m1 r1 = r1.f70752h
            int r1 = r1.getType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "the netscene hasn't call callback to onSceneEnd, type:%d"
            com.tencent.mars.xlog.Log.e(r4, r2, r1)
            com.tencent.mars.xlog.Log.appenderFlush()
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z.f193105a
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelbase.p2.run():void");
    }
}
