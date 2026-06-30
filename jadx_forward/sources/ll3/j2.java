package ll3;

/* loaded from: classes11.dex */
public abstract class j2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f400718a = 0;

    static {
        new java.util.HashMap();
        new java.util.HashMap();
    }

    public static void a(b21.r rVar, android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10910, "3");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(5);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).bj(d(rVar))) {
            jq0Var.b(d(rVar));
        }
        gp0Var.I0(rVar.f98885n);
        gp0Var.J0(rVar.f98886o);
        gp0Var.K0(rVar.f98887p);
        ql3.a y07 = ll3.o2.Ai().y0(xl3.c.a(rVar));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y07.f66995x4a6948ee)) {
            gp0Var.o0(y07.f66995x4a6948ee);
        } else {
            gp0Var.o0(y07.f66992xe65a7da);
        }
        gp0Var.x0(true);
        java.lang.String f17 = f(rVar);
        if (com.p314xaae8f345.mm.vfs.w6.j(f17)) {
            gp0Var.B0(f17);
        } else {
            gp0Var.z0(true);
        }
        gp0Var.O0(rVar.f98881g);
        gp0Var.m0(rVar.f98882h);
        gp0Var.h0(7);
        gp0Var.D0(rVar.f98895x);
        gp0Var.E0(rVar.f98888q);
        java.lang.String str = rVar.f98881g;
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87851d = str;
        c4Var.f87852e = rVar.f98882h;
        c4Var.f87848a = bq0Var;
        c4Var.f87850c = 7;
        bq0Var.o(jq0Var);
        bq0Var.f452497f.add(gp0Var);
        c4Var.f87856i = activity;
        c4Var.f87860m = 3;
        c5303xc75d2f73.e();
    }

    public static boolean b(b21.r rVar, android.app.Activity activity) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10910, "4");
        if (rVar == null) {
            return false;
        }
        java.lang.String str2 = rVar.f98887p;
        java.lang.String f17 = xl3.f.f(str2);
        java.lang.String g17 = xl3.f.g(str2);
        if (android.text.TextUtils.isEmpty(g17) && android.text.TextUtils.isEmpty(f17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Music.MusicUtil", "get qq music data fail, url %s", str2);
            str = "qqmusic://qq.com/ui/pageVisibility";
        } else if (!android.text.TextUtils.isEmpty(g17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUtil", "get qq music songmid %s", g17);
            str = "qqmusic://qq.com/media/playSonglist?p=%7B%22song%22%3A%5B%7B%22songmid%22%3A%22" + g17 + "%22%7D%5D%7D";
        } else if (android.text.TextUtils.isEmpty(f17)) {
            str = "qqmusic://qq.com/media/playSonglist?p=%7B%22song%22%3A%5B%7B%22songid%22%3A%22" + f17 + "%22%7D%5D%7D";
        } else {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUtil", "qqMusicActionUrl:%s", str);
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.MusicUtil", "parse qq music action url fail, url %s", str);
            return false;
        }
        b21.m.j();
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", parse);
        intent.addFlags(268435456);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.I0(activity, intent, false, false)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str2);
            j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent2, null);
            return false;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/music/model/MusicUtil", "doOpenInQQMusic", "(Lcom/tencent/mm/modelmusic/MusicWrapper;Landroid/app/Activity;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/music/model/MusicUtil", "doOpenInQQMusic", "(Lcom/tencent/mm/modelmusic/MusicWrapper;Landroid/app/Activity;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (java.lang.Exception unused) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", str2);
            j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent3, null);
            return false;
        }
    }

    public static void c(b21.r rVar, android.app.Activity activity) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423 c11288x597a4423 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11288x597a4423();
        c11288x597a4423.f33185x324c710a = rVar.f98887p;
        c11288x597a4423.f33182xc58aab80 = rVar.f98885n;
        java.lang.String str = rVar.f98886o;
        c11288x597a4423.f33184xc6370d0b = str;
        c11288x597a4423.f33183xead55f01 = str;
        c11288x597a4423.f33186x239f8b5 = rVar.f98895x;
        c11288x597a4423.f33187x1478a44a = rVar.f98888q;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        c11286x34a5504.f33122xe4128443 = c11288x597a4423;
        c11286x34a5504.f33130x6942258 = rVar.f98881g;
        c11286x34a5504.f33121x993583fc = rVar.f98882h;
        java.lang.String f17 = f(rVar);
        if (f17 == null || !com.p314xaae8f345.mm.vfs.w6.j(f17)) {
            bitmap = null;
        } else {
            int dimension = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3);
            bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(f17, dimension, dimension, 0.0f);
        }
        if (bitmap != null) {
            c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a(bitmap, true);
        } else {
            c11286x34a5504.f33128x4f3b3aa0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.c0(com.p314xaae8f345.mm.R.C30861xcebc809e.f562876c15), true);
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.f33049x38eb0007 = c11286x34a5504;
        req.mo48427x792022dd(bundle);
        intent.putExtra("Ksnsupload_timeline", bundle);
        intent.putExtra("Ksnsupload_musicid", rVar.f98879e);
        java.lang.String d17 = d(rVar);
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).bj(d17)) {
            intent.putExtra("Ksnsupload_appid", d17);
        }
        intent.putExtra("Ksnsupload_appname", e(rVar));
        java.lang.String a17 = c01.n2.a("music_player");
        c01.n2.d().c(a17, true).i("prePublishId", "music_player");
        intent.putExtra("reportSessionId", a17);
        intent.putExtra("ksnsis_music", true);
        if (i(d17)) {
            intent.putExtra("Ksnsupload_type", 25);
        } else {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1) {
                intent.putExtra("Ksnsupload_type", 26);
            } else {
                intent.putExtra("Ksnsupload_type", 2);
            }
        }
        j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity, ".plugin.sns.ui.SnsUploadUI", intent, 1001, new ll3.i2());
    }

    public static java.lang.String d(b21.r rVar) {
        java.lang.String str = rVar.f98891t;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str;
        }
        int i17 = rVar.f98878d;
        return i17 != 4 ? i17 != 5 ? str : "wx482a4001c37e2b74" : "wx485a97c844086dc9";
    }

    public static java.lang.String e(b21.r rVar) {
        int i17 = rVar.f98878d;
        if (i17 != 0 && i17 != 1) {
            if (i17 == 4) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j2z);
            }
            if (i17 == 5) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_j);
            }
            if (i17 != 8) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bnx);
            }
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jcz);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r5 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(b21.r r5) {
        /*
            java.lang.String r0 = r5.f98889r
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            r0 = r1
        L9:
            ql3.b r2 = ll3.o2.Ai()
            java.lang.String r3 = xl3.c.a(r5)
            ql3.a r2 = r2.y0(r3)
            if (r2 != 0) goto L1e
            boolean r2 = com.p314xaae8f345.mm.vfs.w6.j(r0)
            if (r2 == 0) goto L1e
            return r0
        L1e:
            java.lang.String r0 = r5.f98879e
            r2 = 1
            java.lang.String r0 = xl3.c.e(r0, r2)
            boolean r3 = com.p314xaae8f345.mm.vfs.w6.j(r0)
            if (r3 != 0) goto Lcb
            int r3 = r5.f98878d
            r4 = 0
            if (r3 == 0) goto Lb6
            r2 = 4
            if (r3 == r2) goto L8b
            r2 = 5
            if (r3 == r2) goto L83
            r2 = 6
            if (r3 == r2) goto L7e
            r2 = 7
            if (r3 == r2) goto L79
            r2 = 10
            if (r3 == r2) goto L79
            r2 = 11
            if (r3 == r2) goto L79
            p94.j0 r1 = p94.w0.c()
            if (r1 == 0) goto Lcb
            r45.jj4 r0 = new r45.jj4
            r0.<init>()
            java.lang.String r1 = r5.f98894w
            r0.f459388d = r1
            java.lang.String r1 = r5.f98884m
            r0.f459393i = r1
            int r5 = r5.f98892u
            r0.f459395m = r5
            r0.f459391g = r1
            java.lang.Class<fe0.o4> r5 = fe0.o4.class
            i95.m r5 = i95.n0.c(r5)
            fe0.o4 r5 = (fe0.o4) r5
            ee0.v4 r5 = (ee0.v4) r5
            r5.getClass()
            java.lang.String r5 = "getSnsDirectThumbPath"
            java.lang.String r1 = "com.tencent.mm.feature.sns.SnsUtilService"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r1)
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.t(r0)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r1)
            goto Lcb
        L79:
            java.lang.String r5 = r5.f98889r
            if (r5 != 0) goto L88
            goto L89
        L7e:
            java.lang.String r5 = r5.f98889r
            if (r5 != 0) goto L88
            goto L89
        L83:
            java.lang.String r5 = r5.f98889r
            if (r5 != 0) goto L88
            goto L89
        L88:
            r1 = r5
        L89:
            r0 = r1
            goto Lcb
        L8b:
            com.tencent.mm.autogen.events.MusicActionEvent r0 = new com.tencent.mm.autogen.events.MusicActionEvent
            r0.<init>()
            r1 = 12
            am.gk r2 = r0.f136042g
            r2.f88303a = r1
            java.lang.String r1 = r5.f98884m
            r2.f88309g = r1
            r0.e()
            am.hk r0 = r0.f136043h
            java.lang.String r0 = r0.f88374e
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0)
            if (r1 == 0) goto La9
            java.lang.String r0 = r5.f98889r
        La9:
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r0)
            if (r1 != 0) goto Lcb
            java.lang.String r5 = r5.f98879e
            java.lang.String r0 = xl3.c.e(r5, r4)
            goto Lcb
        Lb6:
            java.lang.Class<tg3.u0> r0 = tg3.u0.class
            i95.m r0 = i95.n0.c(r0)
            tg3.u0 r0 = (tg3.u0) r0
            oi3.g r1 = new oi3.g
            r1.<init>()
            java.lang.String r5 = r5.f98889r
            k90.b r0 = (k90.b) r0
            java.lang.String r0 = r0.oj(r1, r5, r2, r4)
        Lcb:
            java.lang.String r5 = "real album path = %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r2 = "MicroMsg.Music.MusicUtil"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ll3.j2.f(b21.r):java.lang.String");
    }

    public static void g(java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicUtil", "gotoAppbrand(), appId:%s, appUserName:%s, pkgType:%d", str, str2, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625 c6113xa3727625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6113xa3727625();
        am.nx nxVar = c6113xa3727625.f136390g;
        nxVar.f89006h = str;
        nxVar.f89007i = -1;
        nxVar.f89001c = i17;
        nxVar.f88999a = str2;
        nxVar.f89002d = yc1.s.f77529x366c91de;
        if (i17 == 1) {
            nxVar.f89011m = true;
        }
        c6113xa3727625.e();
    }

    public static boolean h(dm.i8 i8Var) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i8Var.f67005xdaf47629) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i8Var.f67006x45670355) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i8Var.f67008x6e8dd380)) ? false : true;
    }

    public static final boolean i(java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b("wx5aa333606550dfd5", str);
    }

    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j(android.content.Context context, int i17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
        i0Var.g(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv);
        i0Var.d(i17);
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
        aVar.E = null;
        aVar.A = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        a17.show();
        return a17;
    }
}
