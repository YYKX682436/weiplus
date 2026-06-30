package aq1;

/* loaded from: classes11.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq1.q0 f13067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f13068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f13069f;

    public m0(aq1.q0 q0Var, long j17, long j18) {
        this.f13067d = q0Var;
        this.f13068e = j17;
        this.f13069f = j18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (r5 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            aq1.q0 r0 = r9.f13067d
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "voip-handle-"
            r1.<init>(r2)
            long r2 = r9.f13068e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.mm.sdk.platformtools.o4 r4 = r0.Bi()
            r5 = 0
            long r7 = r4.getLong(r1, r5)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            java.lang.String r4 = "MicroMsg.proc.LightPushServiceImpl"
            if (r1 > 0) goto L88
            com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo r1 = new com.tencent.mm.plugin.zero.api.ILightPushService$VoipInviteInfo
            r1.<init>()
            r1.f188622e = r2
            long r5 = r9.f13069f
            r1.f188623f = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "voipInviteInspect store last voipInviteInfo: "
            r5.<init>(r6)
            long r6 = r1.f188622e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "voip-invite-"
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.mm.sdk.platformtools.o4 r0 = r0.Bi()
            r3 = 0
            r4 = 0
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r1.writeToParcel(r5, r3)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6a
            byte[] r1 = r5.marshall()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6a
            r4 = r1
            goto L7b
        L67:
            r0 = move-exception
            r4 = r5
            goto L82
        L6a:
            r1 = move-exception
            goto L70
        L6c:
            r0 = move-exception
            goto L82
        L6e:
            r1 = move-exception
            r5 = r4
        L70:
            java.lang.String r6 = "MicroMsg.proc.ILightPushService"
            java.lang.String r7 = "encode err"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L67
            com.tencent.mars.xlog.Log.printErrStackTrace(r6, r1, r7, r3)     // Catch: java.lang.Throwable -> L67
            if (r5 == 0) goto L7e
        L7b:
            r5.recycle()
        L7e:
            r0.H(r2, r4)
            goto La2
        L82:
            if (r4 == 0) goto L87
            r4.recycle()
        L87:
            throw r0
        L88:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "voipInviteInspect store skip: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", handled at "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r4, r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aq1.m0.run():void");
    }
}
