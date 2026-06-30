package r02;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 f449856d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5) {
        this.f449856d = activityC13242xdf6880d5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r0 = r8.f449856d
            com.tencent.mm.plugin.downloader_app.model.n0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.a()
            r0.f178910i = r1
            r02.p r0 = new r02.p
            r0.<init>(r8)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r0)
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r0 = r8.f449856d
            java.lang.String r1 = r0.f178911m
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r1)
            r3 = 1
            if (r2 == 0) goto L1c
            goto L80
        L1c:
            boolean r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.b(r1)
            if (r2 == 0) goto L82
            com.tencent.mm.plugin.downloader_app.model.n0 r2 = r0.f178910i
            if (r2 != 0) goto L27
            goto L82
        L27:
            java.util.Map r2 = r2.f178840b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r1 = r2.get(r1)
            com.tencent.mm.plugin.downloader_app.model.r0 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) r1
            if (r1 != 0) goto L34
            goto L82
        L34:
            boolean r2 = r0.f178912n
            r4 = 200(0xc8, double:9.9E-322)
            if (r2 != 0) goto L78
            d02.c r2 = r1.f178857m
            java.lang.String r2 = r2.f306810e
            android.content.pm.PackageInfo r2 = ik1.b.a(r0, r2)
            if (r2 == 0) goto L55
            int r2 = r2.versionCode
            d02.c r6 = r1.f178857m
            int r6 = r6.f306814i
            if (r2 < r6) goto L55
            r02.s r1 = new r02.s
            r1.<init>(r0)
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.d(r1, r4)
            goto L80
        L55:
            java.lang.String r2 = r0.f178911m
            h02.a r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.d(r2)
            if (r2 == 0) goto L6c
            int r6 = r2.f68441x10a0fed7
            r7 = 3
            if (r6 != r7) goto L6c
            boolean r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.o.d(r0, r1)
            if (r1 == 0) goto L80
            r0.finish()
            goto L80
        L6c:
            ku5.u0 r6 = ku5.t0.f394148d
            r02.t r7 = new r02.t
            r7.<init>(r0, r2, r1)
            ku5.t0 r6 = (ku5.t0) r6
            r6.k(r7, r4)
        L78:
            r02.u r1 = new r02.u
            r1.<init>(r0)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(r1, r4)
        L80:
            r0 = r3
            goto L83
        L82:
            r0 = 0
        L83:
            if (r0 == 0) goto L98
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r0 = r8.f449856d
            java.util.LinkedList r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.c()
            r0.getClass()
            r02.j r2 = new r02.j
            r3 = 0
            r2.<init>(r0, r3)
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.b(r1, r2)
            goto Lc1
        L98:
            java.util.LinkedList r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.s0.c()
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r1 = r8.f449856d
            java.lang.String r1 = r1.f178911m
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lad
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r1 = r8.f449856d
            java.lang.String r1 = r1.f178911m
            r0.add(r1)
        Lad:
            com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI r1 = r8.f449856d
            java.lang.String r2 = r1.f178911m
            r02.j r4 = new r02.j
            r4.<init>(r1, r2)
            com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.q0.b(r0, r4)
            r02.q r0 = new r02.q
            r0.<init>(r8)
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(r3, r0)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r02.r.run():void");
    }
}
