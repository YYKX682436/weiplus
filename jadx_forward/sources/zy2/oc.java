package zy2;

/* loaded from: classes10.dex */
public final class oc {

    /* renamed from: a, reason: collision with root package name */
    public static final zy2.oc f559058a = new zy2.oc();

    public static final void b(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6773x3bf523d8 struct) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(struct, "struct");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicActionReportLogic", "reportMvMusicCardAction, action:" + struct.f140989j + ", scene:" + struct.f140990k);
        b21.r j17 = kl3.t.g().j();
        if (j17 != null) {
            java.lang.String str = j17.f98881g;
            struct.f140984e = struct.b("SongName", str != null ? r26.i0.t(str, ",", " ", false) : null, true);
            java.lang.String str2 = j17.f98882h;
            struct.f140988i = struct.b("Singer", str2 != null ? r26.i0.t(str2, ",", " ", false) : null, true);
            struct.f140986g = struct.b("WebUrl", j17.f98887p, true);
            struct.f140987h = struct.b("DataUrl", j17.f98885n, true);
            struct.f140992m = struct.b("AppId", j17.f98891t, true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicActionReportLogic", "song:" + struct.f140984e + ", singer:" + struct.f140988i + ", appId:" + struct.f140992m);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicActionReportLogic", "buildCommonReportStruct, musicWrapper must not be null");
        }
        struct.k();
        struct.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r4, boolean r5, boolean r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.String r5 = "msg"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r5)
            java.lang.String r5 = "fromSourceId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r5)
            com.tencent.mm.autogen.mmdata.rpt.MvShareReportStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.MvShareReportStruct
            r5.<init>()
            java.lang.String r4 = r4.U1()
            ot0.q r4 = ot0.q.v(r4)
            r0 = 1
            if (r4 == 0) goto L77
            java.lang.String r1 = r4.f430187f
            java.lang.String r2 = "SongName"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f141116e = r1
            java.lang.String r1 = r4.f430191g
            java.lang.String r2 = "Singer"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f141127p = r1
            java.lang.String r1 = r4.f430207k
            java.lang.String r2 = "WebUrl"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f141118g = r1
            java.lang.String r1 = r4.V
            java.lang.String r2 = "DataUrl"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f141119h = r1
            java.lang.String r1 = r4.f430179d
            java.lang.String r2 = "AppId"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f141124m = r1
            java.lang.Class<com.tencent.mm.pluginsdk.ui.tools.i0> r1 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0.class
            ot0.h r4 = r4.y(r1)
            com.tencent.mm.pluginsdk.ui.tools.i0 r4 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.i0) r4
            if (r4 == 0) goto L77
            java.lang.String r1 = r4.f273225d
            java.lang.String r2 = "MvObjectId"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f141121j = r1
            java.lang.String r1 = r4.f273226e
            java.lang.String r2 = "MvNonceId"
            java.lang.String r1 = r5.b(r2, r1, r0)
            r5.f141122k = r1
            java.lang.String r4 = r4.f273228g
            java.lang.String r1 = "MvUserId"
            java.lang.String r4 = r5.b(r1, r4, r0)
            r5.f141123l = r4
            jz5.f0 r4 = jz5.f0.f384359a
            goto L78
        L77:
            r4 = 0
        L78:
            if (r4 != 0) goto L7b
            return
        L7b:
            java.lang.String r4 = "FromSourceId"
            java.lang.String r4 = r5.b(r4, r7, r0)
            r5.f141126o = r4
            r0 = 3
            r5.f141120i = r0
            r0 = 2
            r5.f141125n = r0
            if (r6 == 0) goto L8e
            goto L90
        L8e:
            r0 = 1
        L90:
            r5.f141128q = r0
            r5.k()
            r5.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zy2.oc.a(com.tencent.mm.storage.f9, boolean, boolean, java.lang.String):void");
    }
}
