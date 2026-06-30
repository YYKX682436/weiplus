package im2;

/* loaded from: classes2.dex */
public final class i6 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f373925d;

    /* renamed from: e, reason: collision with root package name */
    public final so2.v2 f373926e;

    /* renamed from: f, reason: collision with root package name */
    public dk2.qf f373927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f373925d = "FinderLiveVisitorEndDataUIC";
        this.f373926e = new so2.v2();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[Catch: Exception -> 0x0097, TryCatch #2 {Exception -> 0x0097, blocks: (B:14:0x0083, B:16:0x0091, B:17:0x0094), top: B:13:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateBefore */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2277xb2f1ab1a(android.os.Bundle r8) {
        /*
            r7 = this;
            super.mo2277xb2f1ab1a(r8)
            dk2.ef r8 = dk2.ef.f314905a
            gk2.e r8 = dk2.ef.I
            if (r8 != 0) goto L11
            androidx.appcompat.app.AppCompatActivity r8 = r7.m158354x19263085()
            r8.finish()
            return
        L11:
            android.content.Intent r0 = r7.m158359x1e885992()
            java.lang.String r1 = "nearby_live_jump_live_end_page_report_obj_key"
            byte[] r0 = r0.getByteArrayExtra(r1)
            r45.qt2 r1 = new r45.qt2
            r1.<init>()
            java.lang.String r2 = ""
            java.lang.String r3 = "safeParser"
            r4 = 0
            if (r0 != 0) goto L29
        L27:
            r1 = r4
            goto L36
        L29:
            r1.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L2d
            goto L36
        L2d:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r3, r2, r0)
            goto L27
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "onCreateBefore, reportObj = "
            r0.<init>(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = r7.f373925d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)
            android.content.Intent r0 = r7.m158359x1e885992()
            java.lang.String r6 = "nearby_live_jump_live_end_page_base_report_info_key"
            byte[] r0 = r0.getByteArrayExtra(r6)
            r45.o72 r6 = new r45.o72
            r6.<init>()
            if (r0 != 0) goto L5c
        L5a:
            r6 = r4
            goto L69
        L5c:
            r6.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L60
            goto L69
        L60:
            r0 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r3, r2, r0)
            goto L5a
        L69:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onCreateBefore, reportBaseInfo = "
            r0.<init>(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r0)
            dk2.ef r0 = dk2.ef.f314905a
            km2.n r0 = dk2.ef.H
            so2.v2 r2 = r7.f373926e
            r2.a(r8, r0, r1, r6)
            android.content.Intent r8 = r7.m158359x1e885992()     // Catch: java.lang.Exception -> L97
            java.lang.String r0 = "nearby_live_jump_live_end_page_visitor_mic_replay_data"
            java.io.Serializable r8 = r8.getSerializableExtra(r0)     // Catch: java.lang.Exception -> L97
            boolean r0 = r8 instanceof dk2.qf     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L94
            r4 = r8
            dk2.qf r4 = (dk2.qf) r4     // Catch: java.lang.Exception -> L97
        L94:
            r7.f373927f = r4     // Catch: java.lang.Exception -> L97
            goto La9
        L97:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onCreateBefore, getSerializableExtra FinderLiveVisitorMicReplayData error: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r8)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.i6.mo2277xb2f1ab1a(android.os.Bundle):void");
    }
}
