package aw1;

/* loaded from: classes9.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96236d;

    public y0(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        this.f96236d = c26987xeef691ab;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        long j17;
        java.lang.String str;
        java.lang.Class<tg3.u0> cls;
        java.lang.String str2 = "getService(...)";
        java.lang.Class<tg3.u0> cls2 = tg3.u0.class;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportImageAndVideoService", "scanC2CVideo");
            android.database.Cursor B = gm0.j1.u().f354686f.B("SELECT filename, msglocalid, user, msg_talker FROM videoinfo2", null);
            if (B == null) {
                return;
            }
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui();
            long j18 = 0;
            long j19 = 0;
            long j27 = 0;
            long j28 = 0;
            while (true) {
                z17 = false;
                if (!B.moveToNext()) {
                    j17 = j28;
                    break;
                }
                try {
                    com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f96236d;
                    if (c26987xeef691ab != null && c26987xeef691ab.m108008xc9602be3()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportImageAndVideoService", "scanC2CVideo cursor.moveToNext break");
                        z17 = true;
                        j17 = j28;
                        break;
                    }
                    java.lang.String string = B.getString(0);
                    long j29 = j28;
                    long j37 = B.getLong(1);
                    B.getString(2);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(B.getString(3), j37);
                    i95.m c17 = i95.n0.c(cls2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, str2);
                    java.lang.String e86 = tg3.u0.e8((tg3.u0) c17, k17, bm5.f0.f104104s, string, false, 8, null);
                    i95.m c18 = i95.n0.c(cls2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, str2);
                    java.lang.String e87 = tg3.u0.e8((tg3.u0) c18, k17, bm5.f0.f104103r, string, false, 8, null);
                    i95.m c19 = i95.n0.c(cls2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, str2);
                    java.lang.String L4 = tg3.u0.L4((tg3.u0) c19, k17, string, false, 4, null);
                    if (com.p314xaae8f345.mm.vfs.w6.j(L4)) {
                        com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(L4);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
                        str = str2;
                        cls = cls2;
                        j18 += m17.f294767d;
                    } else {
                        str = str2;
                        cls = cls2;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    if (!r26.i0.n(string, ya.b.f77495x8b74a326, false)) {
                        if (com.p314xaae8f345.mm.vfs.w6.j(e87)) {
                            com.p314xaae8f345.mm.vfs.x1 m18 = com.p314xaae8f345.mm.vfs.w6.m(e87);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m18);
                            j19 += m18.f294767d;
                        }
                        if (com.p314xaae8f345.mm.vfs.w6.j(e87) && com.p314xaae8f345.mm.vfs.w6.j(e86)) {
                            com.p314xaae8f345.mm.vfs.x1 m19 = com.p314xaae8f345.mm.vfs.w6.m(e86);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m19);
                            j27 += m19.f294767d;
                        } else if (com.p314xaae8f345.mm.vfs.w6.j(e86)) {
                            com.p314xaae8f345.mm.vfs.x1 m27 = com.p314xaae8f345.mm.vfs.w6.m(e86);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m27);
                            j28 = j29 + m27.f294767d;
                            str2 = str;
                            cls2 = cls;
                        }
                    }
                    str2 = str;
                    cls2 = cls;
                    j28 = j29;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReportImageAndVideoService", "compressC2C error t = " + th.getMessage());
                    return;
                }
            }
            B.close();
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportImageAndVideoService", "scanC2CVideo cursor.moveToNext return");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("imageSize = ");
            sb6.append(j18);
            sb6.append(", yuantuVideoSize = ");
            sb6.append(j19);
            sb6.append(", yuantuCompressVideoSize = ");
            sb6.append(j27);
            sb6.append(", compressVideoSize = ");
            long j38 = j17;
            sb6.append(j38);
            sb6.append(", canceled = ");
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportImageAndVideoService", sb6.toString());
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportImageAndVideoService", "videoNameList forEach, break");
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("video_report_imageSize", j18);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("video_report_yuantuVideoSize", j19);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("video_report_yuantuCompressVideoSize", j27);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("video_report_compressVideoSize", j38);
            long j39 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("extreme_storage_wechat_total", -1L);
            if (j39 > 0) {
                float f17 = (float) j39;
                float f18 = 100;
                int i17 = (int) ((((float) j18) / f17) * f18);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("video_report_imageSizeRatio", i17);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("video_report_yuantuVideoSizeRatio", (int) ((((float) j19) / f17) * f18));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("video_report_yuantuCompressVideoSizeRatio", (int) ((((float) j27) / f17) * f18));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().A("video_report_compressVideoSizeRatio", (int) ((((float) j38) / f17) * f18));
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().B("LastCompressC2CVideoTime", java.lang.System.currentTimeMillis());
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
