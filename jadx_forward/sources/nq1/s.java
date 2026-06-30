package nq1;

@j95.b
/* loaded from: classes11.dex */
public class s extends i95.w implements oq1.m {

    /* renamed from: d, reason: collision with root package name */
    public pq1.a f420504d;

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        pq1.a aVar = this.f420504d;
        if (aVar != null) {
            aVar.f439102a = new qq1.a(gm0.j1.u().f354686f);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // i95.w
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8845x3e5a77bb(android.content.Context r5) {
        /*
            r4 = this;
            bm5.f1.a()
            pq1.a r5 = pq1.a.f439101b
            if (r5 != 0) goto Le
            pq1.a r5 = new pq1.a
            r5.<init>()
            pq1.a.f439101b = r5
        Le:
            pq1.a r5 = pq1.a.f439101b
            r4.f420504d = r5
            android.content.Context r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            com.tencent.mm.app.v5 r5 = com.p314xaae8f345.mm.app.v5.a(r5)
            com.tencent.mm.app.v5 r0 = com.p314xaae8f345.mm.app.v5.f135384h
            if (r5 != r0) goto L7d
            ak0.a r5 = ak0.o.f87075a
            boolean[] r5 = a83.f.f83790b
            monitor-enter(r5)
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L7a
            r0 = 0
            boolean r1 = r5[r0]     // Catch: java.lang.Throwable -> L77
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L31
            java.lang.String r1 = "MicroMsg.TinkerPatchStatusProbe"
            java.lang.String r2 = "[!] Already installed."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r2)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7a
            goto L3c
        L31:
            r1 = 1
            r5[r0] = r1     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "MicroMsg.TinkerPatchStatusProbe"
            java.lang.String r2 = "[+] install done."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7a
        L3c:
            java.lang.String r1 = "MicroMsg.Boots.PluginBoots"
            java.lang.String r2 = "[+] Trying to trigger tinker patch status report."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            monitor-enter(r5)
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L74
            boolean r0 = r5[r0]     // Catch: java.lang.Throwable -> L71
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L51
            java.lang.String r0 = "MicroMsg.TinkerPatchStatusProbe"
            java.lang.String r1 = "[-] Not installed, skip probe."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)     // Catch: java.lang.Throwable -> L74
        L51:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            ku5.u0 r5 = ku5.t0.f394148d
            java.lang.String r0 = "tinker_patch_status_probe"
            ku5.t0 r5 = (ku5.t0) r5
            r5.A(r0)
            ku5.u0 r5 = ku5.t0.f394148d
            a83.a r0 = new a83.a
            r0.<init>()
            java.lang.String r1 = "tinker_patch_status_probe"
            ku5.t0 r5 = (ku5.t0) r5
            r5.getClass()
            r2 = 5000(0x1388, double:2.4703E-320)
            r5.t(r0, r2, r1)
            goto L7d
        L71:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L71
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L74
            throw r0
        L77:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
            throw r0     // Catch: java.lang.Throwable -> L7a
        L7a:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L7a
            throw r0
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nq1.s.mo8845x3e5a77bb(android.content.Context):void");
    }
}
