package rc5;

/* loaded from: classes11.dex */
public final class b0 extends com.p314xaae8f345.mm.ui.bc {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf f475682e;

    public b0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf c21808xf12b2fdf) {
        this.f475682e = c21808xf12b2fdf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r0.r7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r0.m158359x1e885992().hasExtra("Chat_BackBtnStyle") == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        r0.m158359x1e885992().putExtra("Chat_BackBtnStyle", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a0, code lost:
    
        r0.m158359x1e885992().putExtra("KIsEnterFromHalfScreen", true);
        r11 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        r1 = new rc5.a0(r0);
        r2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf.f283199J;
        r11.mo50297x7c4d7ca2(r1, 50);
        r0.m158354x19263085().finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0086, code lost:
    
        r11 = false;
     */
    @Override // com.p314xaae8f345.mm.ui.bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.view.MenuItem r11) {
        /*
            r10 = this;
            yd5.m r11 = yd5.m.f542654h
            com.tencent.mm.ui.chatting.half.NotificationHalfScreenChattingUIC r0 = r10.f475682e
            r0.B7(r11)
            android.content.Context r11 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.Class<android.app.ActivityManager> r1 = android.app.ActivityManager.class
            java.lang.Object r11 = r11.getSystemService(r1)
            java.lang.String r1 = "getSystemService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r11, r1)
            android.app.ActivityManager r11 = (android.app.ActivityManager) r11
            java.util.List r11 = r11.getAppTasks()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r11)
            java.util.Iterator r11 = r11.iterator()
            r1 = 0
            r2 = r1
        L23:
            boolean r3 = r11.hasNext()
            r4 = 1
            if (r3 == 0) goto L86
            java.lang.Object r3 = r11.next()
            int r5 = r2 + 1
            r6 = 0
            if (r2 < 0) goto L82
            android.app.ActivityManager$AppTask r3 = (android.app.ActivityManager.AppTask) r3
            android.app.ActivityManager$RecentTaskInfo r7 = r3.getTaskInfo()
            android.content.ComponentName r8 = r7.baseActivity
            if (r8 == 0) goto L41
            java.lang.String r6 = r8.getClassName()
        L41:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "checkMainTaskCondition, taskInfo: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = ",  baseActivity: "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "MicroMsg.HalfScreenHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7)
            if (r6 == 0) goto L68
            java.lang.String r7 = "com.tencent.mm.ui.LauncherUI"
            boolean r6 = r26.n0.B(r6, r7, r1)
            if (r6 == 0) goto L68
            r6 = r4
            goto L69
        L68:
            r6 = r1
        L69:
            if (r6 == 0) goto L80
            android.app.ActivityManager$RecentTaskInfo r11 = r3.getTaskInfo()
            int r3 = android.os.Build.VERSION.SDK_INT
            r5 = 32
            if (r3 < r5) goto L7c
            if (r11 == 0) goto L86
            boolean r11 = r11.isVisible()
            goto L87
        L7c:
            if (r2 != 0) goto L86
            r11 = r4
            goto L87
        L80:
            r2 = r5
            goto L23
        L82:
            kz5.c0.p()
            throw r6
        L86:
            r11 = r1
        L87:
            if (r11 == 0) goto L8d
            r0.r7()
            goto Lc1
        L8d:
            android.content.Intent r11 = r0.m158359x1e885992()
            java.lang.String r2 = "Chat_BackBtnStyle"
            boolean r11 = r11.hasExtra(r2)
            if (r11 == 0) goto La0
            android.content.Intent r11 = r0.m158359x1e885992()
            r11.putExtra(r2, r1)
        La0:
            android.content.Intent r11 = r0.m158359x1e885992()
            java.lang.String r1 = "KIsEnterFromHalfScreen"
            r11.putExtra(r1, r4)
            com.tencent.mm.sdk.platformtools.n3 r11 = new com.tencent.mm.sdk.platformtools.n3
            r11.<init>()
            rc5.a0 r1 = new rc5.a0
            r1.<init>(r0)
            int r2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2659x30c033.C21808xf12b2fdf.f283199J
            r2 = 50
            r11.mo50297x7c4d7ca2(r1, r2)
            androidx.appcompat.app.AppCompatActivity r11 = r0.m158354x19263085()
            r11.finish()
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rc5.b0.b(android.view.MenuItem):void");
    }
}
