package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes12.dex */
public class p2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f152268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f152270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f152271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f152272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152273i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.q2 f152274m;

    public p2(com.p314xaae8f345.mm.p944x882e457a.q2 q2Var, int i17, int i18, int i19, int i27, byte[] bArr, java.lang.String str) {
        this.f152274m = q2Var;
        this.f152268d = i17;
        this.f152269e = i18;
        this.f152270f = i19;
        this.f152271g = i27;
        this.f152272h = bArr;
        this.f152273i = str;
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
            com.tencent.mm.modelbase.q2 r1 = r0.f152274m
            boolean r2 = r1.f152284g
            int r3 = r0.f152268d
            java.lang.String r4 = "MicroMsg.RemoteOnGYNetEnd"
            if (r2 == 0) goto L1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "netId:%d has been canceled"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r2, r1)
            return
        L1b:
            r2 = 10016(0x2720, float:1.4035E-41)
            int r5 = x51.o1.f533597q
            if (r2 != r5) goto L72
            java.lang.String r2 = x51.o1.f533599s
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r2 != 0) goto L72
            java.lang.String r2 = x51.o1.f533599s
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "onGYNetEnd DK TEST SET : %s "
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r2)
            java.lang.String r2 = x51.o1.f533599s
            java.lang.String r5 = ","
            java.lang.String[] r2 = r2.split(r5)
            if (r2 == 0) goto L72
            int r5 = r2.length
            r6 = 3
            if (r5 != r6) goto L72
            r5 = 0
            r6 = r2[r5]
            r7 = -1
            int r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6, r7)
            com.tencent.mm.modelbase.m1 r7 = r1.f152285h
            int r7 = r7.mo808xfb85f7b0()
            if (r6 != r7) goto L72
            r6 = 1
            r6 = r2[r6]
            int r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r6, r5)
            r7 = 2
            r2 = r2[r7]
            int r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r2, r5)
            r5 = 999(0x3e7, float:1.4E-42)
            if (r6 != r5) goto L76
            java.lang.String r1 = x51.o1.f533599s
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "onGYNetEnd DK TEST SET syncservice : %s  NOT  CALLBACK !!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r2, r1)
            return
        L72:
            int r6 = r0.f152269e
            int r2 = r0.f152270f
        L76:
            r10 = r2
            r9 = r6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            int r2 = r0.f152271g
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r2 = r1.f152284g
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r2)
            com.tencent.mm.modelbase.m1 r2 = r1.f152285h
            int r2 = r2.hashCode()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r11, r12, r13, r14, r15, r16}
            java.lang.String r3 = "onGYNetEnd after post to worker netId:%d, sceneType:%s errType:%d, errCode:%d, isCancel:%b, hashcode:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3, r2)
            byte[] r2 = r0.f152272h
            boolean r2 = com.p314xaae8f345.mm.p944x882e457a.q2.d(r1, r2)
            if (r2 != 0) goto Lb9
            com.tencent.mm.network.l0 r7 = r1.f152282e
            int r8 = r0.f152268d
            java.lang.String r11 = r0.f152273i
            com.tencent.mm.network.v0 r12 = r1.f152281d
            byte[] r13 = r0.f152272h
            r7.mo804x5f9cdc6f(r8, r9, r10, r11, r12, r13)
        Lb9:
            com.tencent.mm.modelbase.m1 r2 = r1.f152285h
            boolean r2 = r2.mo48009xb05ac77()
            if (r2 == 0) goto Le2
            com.tencent.mm.modelbase.m1 r2 = r1.f152285h
            boolean r2 = r2.m48004x89d68537()
            if (r2 != 0) goto Le2
            com.tencent.mm.modelbase.m1 r1 = r1.f152285h
            int r1 = r1.mo808xfb85f7b0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "the netscene hasn't call callback to onSceneEnd, type:%d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r2, r1)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd()
            java.lang.String r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p944x882e457a.p2.run():void");
    }
}
