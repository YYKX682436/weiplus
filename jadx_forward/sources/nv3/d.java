package nv3;

/* loaded from: classes5.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(1:3)|4|(1:6)(1:36)|(3:8|(2:10|(1:14))|(10:16|17|18|19|(1:32)|(1:24)|(1:26)|27|28|29))|35|17|18|19|(1:21)|32|(0)|(0)|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[Catch: all -> 0x008f, TryCatch #0 {all -> 0x008f, blocks: (B:19:0x006b, B:21:0x0074, B:24:0x007d, B:26:0x0084, B:27:0x0089), top: B:18:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[Catch: all -> 0x008f, TryCatch #0 {all -> 0x008f, blocks: (B:19:0x006b, B:21:0x0074, B:24:0x007d, B:26:0x0084, B:27:0x0089), top: B:18:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject a(nv3.d r2, android.app.Activity r3, java.lang.String r4, int r5, java.lang.Object r6) {
        /*
            r5 = r5 & 2
            r6 = 0
            if (r5 == 0) goto L6
            r4 = r6
        L6:
            r2.getClass()
            java.lang.Class<w40.e> r2 = w40.e.class
            i95.m r2 = i95.n0.c(r2)
            w40.e r2 = (w40.e) r2
            qs2.q r2 = (qs2.q) r2
            r2.getClass()
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b
            r5 = 0
            if (r2 == 0) goto L20
            int r2 = r2.m76275xbcc8608a()
            goto L21
        L20:
            r2 = r5
        L21:
            if (r3 == 0) goto L65
            java.lang.Class<pp0.h0> r0 = pp0.h0.class
            i95.m r0 = i95.n0.c(r0)
            pp0.h0 r0 = (pp0.h0) r0
            yy0.m0 r0 = (yy0.m0) r0
            r0.getClass()
            boolean r0 = r3 instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.ActivityC10929xf9779373
            if (r0 != 0) goto L35
            goto L5d
        L35:
            androidx.appcompat.app.AppCompatActivity r3 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r3
            pf5.z r0 = pf5.z.f435481a
            pf5.v r3 = r0.a(r3)
            java.lang.Class<gx0.kh> r0 = gx0.kh.class
            androidx.lifecycle.c1 r3 = r3.a(r0)
            gx0.kh r3 = (gx0.kh) r3
            gx0.kh r3 = r3.W6()
            com.tencent.maas.moviecomposing.Timeline r3 = r3.o7()
            if (r3 == 0) goto L5d
            com.tencent.maas.model.time.MJTime r3 = r3.l()
            if (r3 == 0) goto L5d
            double r0 = r3.m33987xd22e7c2d()
            java.lang.Double r6 = java.lang.Double.valueOf(r0)
        L5d:
            if (r6 == 0) goto L65
            double r0 = r6.doubleValue()
            int r3 = (int) r0
            goto L66
        L65:
            r3 = r5
        L66:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L8f
            java.lang.String r0 = "enter_scene"
            r6.put(r0, r2)     // Catch: java.lang.Throwable -> L8f
            if (r4 == 0) goto L7a
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L7b
        L7a:
            r5 = 1
        L7b:
            if (r5 != 0) goto L82
            java.lang.String r5 = "template_id"
            r6.put(r5, r4)     // Catch: java.lang.Throwable -> L8f
        L82:
            if (r3 <= 0) goto L89
            java.lang.String r5 = "preview_timeline_duration"
            r6.put(r5, r3)     // Catch: java.lang.Throwable -> L8f
        L89:
            jz5.f0 r5 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L8f
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r5)     // Catch: java.lang.Throwable -> L8f
            goto L99
        L8f:
            r5 = move-exception
            kotlin.Result$Companion r0 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r5 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r5)
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r5)
        L99:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "[getRecommendExtraInfo] enterScene:"
            r5.<init>(r0)
            r5.append(r2)
            java.lang.String r2 = " templateId:"
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = " timelineDuration:"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "GetListenVideoBgmListHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nv3.d.a(nv3.d, android.app.Activity, java.lang.String, int, java.lang.Object):org.json.JSONObject");
    }
}
