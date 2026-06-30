package dw3;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.k f325752a = new dw3.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f325753b = jz5.h.b(dw3.i.f325747d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f325754c = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r11, int r12, java.lang.String r13) {
        /*
            r10 = this;
            com.tencent.mm.autogen.mmdata.rpt.MediaFileReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.MediaFileReportStruct
            r0.<init>()
            r0.f140670i = r12
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r2 = com.p314xaae8f345.mm.vfs.z7.a(r11)
            r1.<init>(r2)
            java.lang.String r2 = r1.r()
            java.lang.String r3 = "MediaDirPath"
            r4 = 1
            java.lang.String r2 = r0.b(r3, r2, r4)
            r0.f140665d = r2
            java.lang.String r2 = r1.m82467xfb82e301()
            java.lang.String r3 = "MediaFilePath"
            java.lang.String r2 = r0.b(r3, r2, r4)
            r0.f140666e = r2
            long r2 = r1.B()
            r0.f140668g = r2
            java.util.Date r2 = new java.util.Date
            long r5 = r1.B()
            r2.<init>(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ModifiedTimeStr"
            java.lang.String r2 = r0.b(r3, r2, r4)
            r0.f140667f = r2
            boolean r2 = r1.y()
            if (r2 == 0) goto L73
            com.tencent.mm.vfs.r6[] r1 = r1.G()
            r2 = 0
            if (r1 == 0) goto L5c
            int r3 = r1.length
            if (r3 != 0) goto L56
            r3 = r4
            goto L57
        L56:
            r3 = r2
        L57:
            if (r3 == 0) goto L5a
            goto L5c
        L5a:
            r3 = r2
            goto L5d
        L5c:
            r3 = r4
        L5d:
            if (r3 != 0) goto L79
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            int r3 = r1.length
        L63:
            if (r2 >= r3) goto L79
            r5 = r1[r2]
            long r6 = r0.f140669h
            long r8 = r5.C()
            long r6 = r6 + r8
            r0.f140669h = r6
            int r2 = r2 + 1
            goto L63
        L73:
            long r1 = r1.C()
            r0.f140669h = r1
        L79:
            java.lang.String r1 = "SessionId"
            java.lang.String r1 = r0.b(r1, r13, r4)
            r0.f140671j = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "report type:"
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r2 = " path:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " modified time:"
            r1.append(r2)
            java.lang.String r2 = r0.f140667f
            r1.append(r2)
            java.lang.String r2 = " size:"
            r1.append(r2)
            long r2 = r0.f140669h
            r1.append(r2)
            java.lang.String r2 = " sessionId: "
            r1.append(r2)
            r1.append(r13)
            r13 = 32
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            java.lang.String r1 = "MicroMsg.MediaFileReporter"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r13)
            if (r12 != r4) goto Lc4
            r0.k()
            goto Lc9
        Lc4:
            java.util.concurrent.ConcurrentHashMap r12 = dw3.k.f325754c
            r12.put(r11, r0)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dw3.k.a(java.lang.String, int, java.lang.String):void");
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 b() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) f325753b).mo141623x754a37bb();
    }

    public final void c(java.lang.String path, java.lang.String sessionId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_media_clean_report_enale, true)) {
            a(path, 2, sessionId);
        }
    }

    public final void d(java.lang.String dir) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dir, "dir");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileReporter", "registerDailyReport dir:".concat(dir));
        java.util.Set w17 = b().w("MicroMsg.MediaFileReporter", new java.util.HashSet());
        w17.add(dir);
        b().F("MicroMsg.MediaFileReporter", w17);
        int i17 = 0;
        for (java.lang.Object obj : w17) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileReporter", "currernt register index:" + i17 + " dir:" + ((java.lang.String) obj));
            i17 = i18;
        }
    }

    public final void e(java.lang.String path, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileReporter", "setDeleteCostTimeToReport >> " + path + ". " + j17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f325754c;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6729xcd82c1a9 c6729xcd82c1a9 = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6729xcd82c1a9) concurrentHashMap.get(path);
        if (c6729xcd82c1a9 != null) {
            c6729xcd82c1a9.f140672k = j17;
            c6729xcd82c1a9.k();
        }
    }
}
