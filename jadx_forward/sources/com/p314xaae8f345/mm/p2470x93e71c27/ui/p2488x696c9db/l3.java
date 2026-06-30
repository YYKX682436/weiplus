package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public final class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f273293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f273294g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f273295h;

    public l3(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, java.lang.String str3, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f) {
        this.f273291d = str;
        this.f273292e = str2;
        this.f273293f = f4Var;
        this.f273294g = str3;
        this.f273295h = activityC19730xa7b9756f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r0 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: Exception -> 0x0098, TryCatch #0 {Exception -> 0x0098, blocks: (B:14:0x0015, B:16:0x0039, B:20:0x0044, B:22:0x004f, B:23:0x0052, B:25:0x0060, B:26:0x0080), top: B:13:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[Catch: Exception -> 0x0098, TryCatch #0 {Exception -> 0x0098, blocks: (B:14:0x0015, B:16:0x0039, B:20:0x0044, B:22:0x004f, B:23:0x0052, B:25:0x0060, B:26:0x0080), top: B:13:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[Catch: Exception -> 0x0098, TRY_LEAVE, TryCatch #0 {Exception -> 0x0098, blocks: (B:14:0x0015, B:16:0x0039, B:20:0x0044, B:22:0x004f, B:23:0x0052, B:25:0x0060, B:26:0x0080), top: B:13:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "[MultiTalkScreenShare] copied successfully: "
            java.lang.String r1 = "[MultiTalkScreenShare] failed to copy Content URI, result: "
            java.lang.String r2 = "[MultiTalkScreenShare] content URI detected, try copying to temp file: "
            r3 = 2
            r4 = 0
            java.lang.String r5 = r12.f273291d
            java.lang.String r6 = "content://"
            r7 = 0
            boolean r3 = r26.i0.A(r5, r6, r7, r3, r4)
            java.lang.String r4 = "MicroMsg.FileSelectorUI"
            if (r3 == 0) goto Lb3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r3.<init>(r2)     // Catch: java.lang.Exception -> L98
            r3.append(r5)     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L98
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)     // Catch: java.lang.Exception -> L98
            java.lang.String r2 = "multitalk_screen_share"
            com.tencent.mm.vfs.r7 r3 = com.p314xaae8f345.mm.vfs.q7.f294674a     // Catch: java.lang.Exception -> L98
            com.tencent.mm.vfs.r6 r2 = lp0.b.h0(r2)     // Catch: java.lang.Exception -> L98
            com.tencent.mm.vfs.r6 r3 = new com.tencent.mm.vfs.r6     // Catch: java.lang.Exception -> L98
            java.lang.String r6 = r12.f273292e     // Catch: java.lang.Exception -> L98
            r3.<init>(r2, r6)     // Catch: java.lang.Exception -> L98
            com.tencent.mm.vfs.r6 r2 = r3.s()     // Catch: java.lang.Exception -> L98
            if (r2 == 0) goto L41
            boolean r2 = r2.m()     // Catch: java.lang.Exception -> L98
            r6 = 1
            if (r2 != r6) goto L41
            goto L42
        L41:
            r6 = r7
        L42:
            if (r6 != 0) goto L52
            java.lang.String r2 = "[MultiTalkScreenShare] make parent directory"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)     // Catch: java.lang.Exception -> L98
            com.tencent.mm.vfs.r6 r2 = r3.s()     // Catch: java.lang.Exception -> L98
            if (r2 == 0) goto L52
            r2.J()     // Catch: java.lang.Exception -> L98
        L52:
            java.lang.String r2 = r3.o()     // Catch: java.lang.Exception -> L98
            long r8 = com.p314xaae8f345.mm.vfs.w6.d(r5, r2, r7)     // Catch: java.lang.Exception -> L98
            r10 = 0
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L80
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r1.<init>(r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = r3.o()     // Catch: java.lang.Exception -> L98
            r1.append(r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = ", size: "
            r1.append(r0)     // Catch: java.lang.Exception -> L98
            r1.append(r8)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L98
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r5 = r3.o()     // Catch: java.lang.Exception -> L98
            goto Lb9
        L80:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L98
            r0.<init>(r1)     // Catch: java.lang.Exception -> L98
            r0.append(r8)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L98
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r0)     // Catch: java.lang.Exception -> L98
            java.lang.String r0 = com.p314xaae8f345.mm.vfs.w6.i(r5, r7)     // Catch: java.lang.Exception -> L98
            if (r0 != 0) goto L96
            goto Lb9
        L96:
            r5 = r0
            goto Lb9
        L98:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[MultiTalkScreenShare] exception while copying content URI, fallback to path: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r0, r1, r2)
            java.lang.String r0 = com.p314xaae8f345.mm.vfs.w6.i(r5, r7)
            if (r0 != 0) goto L96
            goto Lb9
        Lb3:
            java.lang.String r0 = com.p314xaae8f345.mm.vfs.w6.i(r5, r7)
            if (r0 != 0) goto Lbb
        Lb9:
            r8 = r5
            goto Lbc
        Lbb:
            r8 = r0
        Lbc:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r0 == 0) goto Lca
            java.lang.String r0 = "goToScreenProfile, exportExternalPath is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r0)
        Lca:
            com.tencent.mm.pluginsdk.ui.tools.k3 r0 = new com.tencent.mm.pluginsdk.ui.tools.k3
            com.tencent.mm.ui.widget.dialog.f4 r7 = r12.f273293f
            java.lang.String r9 = r12.f273294g
            java.lang.String r10 = r12.f273292e
            com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI r11 = r12.f273295h
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            pm0.v.X(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l3.run():void");
    }
}
