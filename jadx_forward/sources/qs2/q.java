package qs2;

@j95.b
/* loaded from: classes10.dex */
public final class q extends i95.w implements w40.e {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f447850d = jz5.h.b(qs2.j.f447838d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f447851e = jz5.h.b(qs2.p.f447849d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f447852f = jz5.h.b(new qs2.o(this));

    public boolean Ai(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        long longValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209571y8).mo141623x754a37bb()).r()).longValue();
        boolean z17 = j17 >= longValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "checkVideoEnableFinderPost: enableShowFinderPost=" + z17 + ", durationMs=" + j17 + ", durationLimit=" + longValue);
        return z17;
    }

    public void Bi() {
        mv2.q qVar = mv2.q.f413151a;
        synchronized (mv2.q.f413152b) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            java.util.Set<java.lang.String> stringSet = L.getStringSet("MARK_DEL_FILES", new java.util.HashSet());
            if (stringSet != null) {
                for (java.lang.String str : stringSet) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "FinderFileTrack clearMarkFiles " + str);
                    com.p314xaae8f345.mm.vfs.w6.h(str);
                }
            }
            L.putStringSet("MARK_DEL_FILES", new java.util.HashSet());
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
            if (stringSet != null && stringSet.size() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.C(1267L, 5L, 1L);
                g0Var.C(1267L, 6L, elapsedRealtime2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostFileManager", "clearMarkFolder cost:" + elapsedRealtime2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Di(android.content.Context r17, r45.q23 r18, long r19, int r21, android.content.Intent r22, org.json.JSONObject r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs2.q.Di(android.content.Context, r45.q23, long, int, android.content.Intent, org.json.JSONObject, int, boolean):void");
    }

    public final void Ni(android.content.Context context, android.content.Intent intent, int i17, long j17, r45.zi2 zi2Var, r45.rz6 rz6Var, java.lang.String str, java.lang.String str2) {
        r45.q23 q23Var = new r45.q23();
        q23Var.f465118d = rz6Var.f466853d;
        q23Var.f465119e = rz6Var.f466854e;
        q23Var.f465120f = rz6Var.f466855f;
        q23Var.f465124m = str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_feedid", pm0.v.u(j17));
        jSONObject.put("source_songid", zi2Var != null ? zi2Var.m75945x2fec8307(12) : null);
        jSONObject.put("source_audioid", str2);
        jSONObject.put("source_templateid", rz6Var.f466853d);
        jSONObject.put("source_template_type", rz6Var.f466854e);
        Di(context, q23Var, j17, i17, intent, jSONObject, 0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00ab A[Catch: JSONException -> 0x008d, TryCatch #2 {JSONException -> 0x008d, blocks: (B:231:0x0086, B:167:0x009b, B:169:0x009f, B:174:0x00ab, B:175:0x00b3, B:177:0x00b7), top: B:230:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b7 A[Catch: JSONException -> 0x008d, TRY_LEAVE, TryCatch #2 {JSONException -> 0x008d, blocks: (B:231:0x0086, B:167:0x009b, B:169:0x009f, B:174:0x00ab, B:175:0x00b3, B:177:0x00b7), top: B:230:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00c5 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00df A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00eb A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00f7 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0103 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x010f A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0124 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0132 A[Catch: JSONException -> 0x0147, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0140 A[Catch: JSONException -> 0x0147, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0147, blocks: (B:184:0x00bf, B:186:0x00c5, B:187:0x00cf, B:189:0x00d3, B:194:0x00df, B:195:0x00e7, B:197:0x00eb, B:202:0x00f7, B:203:0x00ff, B:205:0x0103, B:210:0x010f, B:211:0x0117, B:215:0x0124, B:216:0x012c, B:218:0x0132, B:219:0x013c, B:221:0x0140), top: B:183:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0337  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ri(android.content.Context r20, qs2.e r21, android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs2.q.Ri(android.content.Context, qs2.e, android.content.Intent):void");
    }

    public final void Ui(android.content.Intent intent, r45.ze2 ze2Var) {
        intent.putExtra("saveLocation", true);
        intent.putExtra("get_poi_name", ze2Var.m75945x2fec8307(3));
        intent.putExtra("get_city", ze2Var.m75945x2fec8307(2));
        intent.putExtra("get_lat", ze2Var.m75938x746dc8a6(1));
        intent.putExtra("get_lng", ze2Var.m75938x746dc8a6(0));
        intent.putExtra("get_poi_address", ze2Var.m75945x2fec8307(4));
        intent.putExtra("get_poi_classify_id", ze2Var.m75945x2fec8307(5));
    }

    public r45.qb4 Vi() {
        r45.qb4 qb4Var = new r45.qb4();
        qb4Var.set(0, "FinderLocal_" + java.lang.System.nanoTime());
        return qb4Var;
    }

    public java.lang.String Zi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183677m);
        byte[] bytes = java.lang.String.valueOf(java.lang.System.currentTimeMillis()).getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        return sb6.toString();
    }

    public java.lang.String aj(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9 e9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183665a;
        java.lang.String feedId = "audio_".concat(pm0.v.u(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183676l + feedId;
    }

    public int bj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209237g).mo141623x754a37bb()).r()).intValue();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209256h).mo141623x754a37bb()).r()).intValue();
        if (!pj()) {
            intValue = intValue2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "[getAlbumMaxVideoDuration] maxDuration:" + intValue);
        return intValue;
    }

    public long cj() {
        long t17;
        mv2.f0 f0Var = mv2.f0.f413094a;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.f90.f208290i) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FINDERITEM_MAXID_LONG_SYNC;
            t17 = c17.t(u3Var, 1L);
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(1 + t17));
        }
        return t17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 fj(android.content.Context context, java.lang.String username, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b96, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbf);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9m);
            ya2.b2 b17 = ya2.h.f542017a.b(username);
            if (b17 != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String w07 = b17.w0();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, w07));
                mn2.g1 g1Var = mn2.g1.f411508a;
                vo0.d a17 = g1Var.a();
                int i18 = 2;
                mn2.n nVar = new mn2.n(b17.f69301x81118c51, y90Var, i18, objArr3 == true ? 1 : 0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                mn2.f1 f1Var = mn2.f1.f411490h;
                a17.c(nVar, imageView, g1Var.h(f1Var));
                java.lang.Object[] objArr4 = ya2.d.b(b17, true) != null;
                android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f564958as3);
                if (findViewById != null) {
                    int i19 = objArr4 != false ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/publish/FinderPublishFeatureService", "checkPostDialogHeader", "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/publish/FinderPublishFeatureService", "checkPostDialogHeader", "(Lcom/tencent/mm/plugin/finder/api/LocalFinderContact;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obh);
                if (textView2 != null) {
                    textView2.setText(objArr4 != false ? com.p314xaae8f345.mm.R.C30867xcad56011.f59 : com.p314xaae8f345.mm.R.C30867xcad56011.f58);
                }
                r45.xk b18 = ya2.d.b(b17, true);
                if (b18 != null) {
                    android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.kbf);
                    if (textView3 != null) {
                        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                        java.lang.String m75945x2fec8307 = b18.m75945x2fec8307(1);
                        ((ke0.e) xVar2).getClass();
                        textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context2, m75945x2fec8307));
                    }
                    android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a9m);
                    if (imageView2 != null) {
                        g1Var.a().c(new mn2.n(b18.m75945x2fec8307(2), objArr2 == true ? 1 : 0, i18, objArr == true ? 1 : 0), imageView2, g1Var.h(f1Var));
                    }
                }
                k0Var.s(inflate, true);
            }
        }
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        us2.u.n(i17, false);
        return k0Var;
    }

    public java.lang.String hj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        java.lang.String m76317x2a881cd1 = c19783xd9a946b7 != null ? c19783xd9a946b7.m76317x2a881cd1() : null;
        return m76317x2a881cd1 == null ? "" : m76317x2a881cd1;
    }

    public long ij() {
        long Ui;
        if (pj()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_to_dynamic_bitrate_video_max_size, 943718400L);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_finder_post_to_dynamic_bitrate_video_max_size_low, 943718400L);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "[getPostToDynamicBitrateVideoMaxSize] maxSize:" + Ui);
        return Ui;
    }

    public java.lang.String mj(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.String d17 = cu2.f0.f303924a.d("FinderObjectDynamicItemKey_SnsPostEntry");
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jdu) : d17 == null ? "" : d17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "getSnsPostEntranceTips: text = " + string + ", dynamicWording=" + d17);
        return string;
    }

    public int nj(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 reportInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfo, "reportInfo");
        java.lang.Integer num = (java.lang.Integer) reportInfo.b("KEY_MEDIA_SOURCE_INT", 0);
        int i17 = (num == null || num.intValue() != 0) ? (num != null && num.intValue() == 1) ? 2 : 3 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "[getVideoSource] videoSource:" + i17 + " mediaSource:" + num);
        return i17;
    }

    public boolean oj(ya2.b2 b2Var) {
        r45.aw0 aw0Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).m60126x74219ae7()) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.R8).mo141623x754a37bb()).r()).intValue() == 1;
        if (b2Var != null && (aw0Var = b2Var.f69303xb62cee) != null && (m75941xfb821914 = aw0Var.m75941xfb821914(0)) != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.zv0) obj).m75939xb282bd08(0) == 5) {
                    break;
                }
            }
            r45.zv0 zv0Var = (r45.zv0) obj;
            if (zv0Var != null && ((r45.uw2) zv0Var.m75936x14adae67(5)) != null) {
                return true;
            }
        }
        return z17;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        mv2.f0 f0Var = mv2.f0.f413094a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        f0Var.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206779j);
        pm0.v.X(new mv2.r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b0.f206496c));
        f0Var.a((sr2.v) ((jz5.n) this.f447850d).mo141623x754a37bb());
        f0Var.a(sr2.t.f493251d);
        ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
        if (z65.c.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "setup");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257099t.mo48813x58998cd();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.t(p2Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f2(null), 3, null);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        mv2.f0 f0Var = mv2.f0.f413094a;
        f0Var.t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206779j);
        pm0.v.X(new mv2.b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b0.f206496c));
        f0Var.t((sr2.v) ((jz5.n) this.f447850d).mo141623x754a37bb());
        f0Var.t(sr2.t.f493251d);
        ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "destroy");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257099t.mo48814x2efc64();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65441xd8c9faef("finderPost", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1615xf1f89d0f.C14926xb3371085.class);
    }

    public final boolean pj() {
        jz5.l Bi = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Bi();
        float floatValue = ((java.lang.Number) Bi.f384366d).floatValue();
        float floatValue2 = ((java.lang.Number) Bi.f384367e).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209275i).mo141623x754a37bb()).r()).intValue();
        int intValue2 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209293j).mo141623x754a37bb()).r()).intValue();
        boolean z17 = floatValue >= ((float) intValue) && floatValue2 >= ((float) intValue2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "[isNotLowDevice] notLow:" + z17 + "  [cpuScore:" + floatValue + ",cpuBenchmark:" + intValue + "] [gpuScore:" + floatValue2 + ",gpuBenchmark:" + intValue2 + ']');
        return z17;
    }

    public boolean qj() {
        r45.ls2 ls2Var = (r45.ls2) g92.b.f351302e.k2().d().m75936x14adae67(26);
        java.util.LinkedList m75941xfb821914 = ls2Var != null ? ls2Var.m75941xfb821914(1) : null;
        if (m75941xfb821914 == null || !m75941xfb821914.contains(4)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.B8).mo141623x754a37bb()).r()).intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    public void rj(java.lang.String moduleName, java.lang.String str, java.lang.String str2, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a, moduleName, str, str2, i17, 0L, 16, null);
    }

    public final void sj(android.content.Context context, int i17, int i18, java.lang.String str, java.lang.String str2, android.content.Intent intent, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "[openCameraOrAlbum] enterScene:" + i17 + " routerFrom:" + i18 + " isOpenCamera:" + z17);
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (z17) {
            intent.putExtra("key_finder_post_router", 2);
            if (((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Zi(false)) {
                ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ui("FinderPersonalProfilePagePostingButton", i17, 0, ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj(), true);
                intent.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
            }
        } else {
            intent.putExtra("key_finder_post_router", 3);
        }
        intent.putExtra("key_finder_post_from", i18);
        intent.putExtra("key_finder_post_id", str2);
        intent.putExtra("KEY_FINDER_USERNAME_SELF", str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).gk(context, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if ((r8 != null ? (r45.yu0) r8.m75936x14adae67(1) : null) == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        if (r11.m75939xb282bd08(0) == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if ((r5 != null ? (r45.at0) r5.m75936x14adae67(0) : null) != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0067, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "parsesFinderDynamicAbility: notFinderUser=" + r1 + ", is not sns post relative ability");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[LOOP:1: B:39:0x00aa->B:53:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tj(r45.q11 r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs2.q.tj(r45.q11, java.lang.String):void");
    }

    public boolean uj() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209499u8).mo141623x754a37bb()).r()).intValue() == 1;
        ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).getClass();
        boolean a17 = py0.b.f440504a.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "photoToVideo: ret " + z17 + ", deviceSupport " + a17);
        return z17 && a17;
    }

    public java.lang.String vj(android.content.Context context, java.lang.String videoPath, java.lang.String desc, int i17, r45.ze2 ze2Var, long j17, long j18, r45.q23 q23Var, android.content.Intent intent, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(videoPath)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderPublishFeatureService", "postSnsOriginVideoDirectly: video path is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postSnsOriginVideoDirectly: videoPath=");
        sb6.append(videoPath);
        sb6.append(", desc=");
        sb6.append(desc);
        sb6.append(" videoSource=");
        sb6.append(i17);
        sb6.append(" location=");
        if (ze2Var == null || (str = ze2Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(" videoTemplateInfo=(");
        sb6.append(q23Var != null ? q23Var.f465118d : null);
        sb6.append(',');
        sb6.append(q23Var != null ? q23Var.f465124m : null);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", sb6.toString());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 29, 74, intent);
        intent.putExtra("key_finder_post_router", 6);
        intent.putExtra("key_finder_post_from", 20);
        java.lang.String str2 = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        intent.putExtra("edit_id", str2);
        intent.putExtra("post_id", str2);
        intent.putExtra("postType", 4);
        intent.putExtra("postMediaList", kz5.c0.d(videoPath));
        intent.putExtra("postTypeList", kz5.c0.d(4));
        intent.putExtra("isLongVideoPost", false);
        intent.putExtra("saveDesc", desc);
        intent.putExtra("KEY_SHOW_FINDER_ACTION_BAR_TITLE", true);
        intent.putExtra("KEY_SNS_SERVER_FEED_ID", j17);
        intent.putExtra("KEY_SNS_LOCAL_FEED_ID", j18);
        if (q23Var != null) {
            intent.putExtra("KEY_POST_VIDEO_TEMPLATE", q23Var.mo14344x5f01b1f6());
        }
        if (ze2Var != null) {
            Ui(intent, ze2Var);
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
            p2Var.W(p2Var.i(context, 27, false));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
            p2Var2.W(p2Var2.i(context, 16, false));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var3.B(4);
        if (q23Var != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("template_id", q23Var.f465118d);
            jSONObject.put("music_id", q23Var.f465124m);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            p2Var3.V(r26.i0.t(jSONObject2, ",", ";", false));
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).hk(context, intent);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        wj(true, j17, Ri == null ? "" : Ri, j18, false, z17);
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wi(boolean r13) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qs2.q.wi(boolean):boolean");
    }

    public void wj(boolean z17, long j17, java.lang.String sessionId, long j18, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPublishFeatureService", "reportSnsPostEntrance: isClick=" + z17 + ", snsFeedId=" + pm0.v.u(j17) + ", snsLocalId=" + j18);
        if (j17 != 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6903xb8bbdc4e c6903xb8bbdc4e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6903xb8bbdc4e();
            c6903xb8bbdc4e.f142225d = z17 ? 2L : 1L;
            c6903xb8bbdc4e.f142226e = c6903xb8bbdc4e.b("snsfeedid", pm0.v.u(j17), true);
            c6903xb8bbdc4e.f142227f = c6903xb8bbdc4e.b("FinderPublishSessionId", sessionId, true);
            c6903xb8bbdc4e.f142229h = z18 ? 1L : 15L;
            c6903xb8bbdc4e.f142230i = z19 ? 2L : 1L;
            c6903xb8bbdc4e.k();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6903xb8bbdc4e);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.d dVar = com.p314xaae8f345.mm.sdk.p2600x5c6729a.d.f273903d;
        jz5.g gVar = this.f447852f;
        if (!dVar.b((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1615xf1f89d0f.C14925x9a2e912b) ((jz5.n) gVar).mo141623x754a37bb())) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1615xf1f89d0f.C14925x9a2e912b) ((jz5.n) gVar).mo141623x754a37bb()).mo48813x58998cd();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6903xb8bbdc4e c6903xb8bbdc4e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6903xb8bbdc4e();
        c6903xb8bbdc4e2.f142225d = z17 ? 2L : 1L;
        c6903xb8bbdc4e2.f142230i = z19 ? 2L : 1L;
        c6903xb8bbdc4e2.f142227f = c6903xb8bbdc4e2.b("FinderPublishSessionId", sessionId, true);
        c6903xb8bbdc4e2.f142229h = z18 ? 1L : 15L;
        ((java.util.ArrayList) ((jz5.n) this.f447851e).mo141623x754a37bb()).add(new jz5.l(java.lang.Long.valueOf(j18), c6903xb8bbdc4e2));
    }

    public void xj(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (qj()) {
            intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
            intent.putExtra("KEY_FINDER_IS_NEED_REFRESH_TAB", true);
            intent.putExtra("KEY_TARGET_TAB_TYPE", 4);
        } else {
            intent.putExtra("KEY_FINDER_JUMP_FOLLOW_TAB", true);
        }
        intent.putExtra("KEY_FINDER_JUMP_FROM_POST", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.B8).mo141623x754a37bb()).l();
    }
}
