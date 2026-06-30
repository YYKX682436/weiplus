package md3;

/* loaded from: classes7.dex */
public final class p extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "navigateToMiniProgram";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r26.n0.B(r1, r0, false) != false) goto L14;
     */
    @Override // lc3.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(lc3.a0 r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: md3.p.t(lc3.a0):void");
    }

    public final void u(lc3.a0 a0Var, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        mq0.a aVar;
        jz5.l[] lVarArr;
        try {
            java.lang.String str4 = e().f425864a;
            java.lang.String s07 = str4 == null ? "MagicAdMiniProgram" : r26.n0.s0(str4, "-", str4);
            l81.b1 b1Var = new l81.b1();
            b1Var.f398547b = a0Var.optString("appId");
            b1Var.f398545a = a0Var.optString("userName");
            b1Var.f398555f = a0Var.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            b1Var.f398565k = a0Var.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
            java.lang.String appId = b1Var.f398547b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
            java.lang.String optString = a0Var.optString("sceneNote");
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
                b1Var.f398567l = v(s07, appId, optString);
                b1Var.f398549c = a0Var.optInt("envVersionType", 0);
                b1Var.f398568m = a0Var.optInt("preScene", 0);
                b1Var.f398569n = a0Var.optString("preSceneNote");
                b1Var.f398562i0 = a0Var.optString("adInfo");
                if (a0Var.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099) || a0Var.has("privateExtraData")) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
                    c11812xa040dc98.f158856e = s07;
                    c11812xa040dc98.f158857f = a0Var.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, "{}");
                    c11812xa040dc98.f158858g = a0Var.optString("privateExtraData", "{}");
                    c11812xa040dc98.f158855d = 1;
                    b1Var.f398574s = c11812xa040dc98;
                }
                if (a0Var.has("devuin")) {
                    b1Var.f398553e = kk.v.b(a0Var.optString("devuin"));
                }
                if (a0Var.has("adUxInfo")) {
                    android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                    persistableBundle.putString("adUxInfo", a0Var.optString("adUxInfo"));
                    b1Var.f398563j = persistableBundle;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiNavigateToMiniProgramServer", "[MBAd] directLaunch: appId:" + b1Var.f398547b + ", enterPath:" + b1Var.f398555f + ", scene:" + b1Var.f398565k + ", sceneNote:" + b1Var.f398567l + ", prescene:" + b1Var.f398568m + ", presceneNote:" + b1Var.f398569n);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
                s().mo146xb9724478(k());
                aVar = mq0.a.f412051m;
                lVarArr = new jz5.l[2];
                lVarArr[0] = new jz5.l("impl", str);
                str3 = str2;
            } catch (java.lang.Exception e17) {
                e = e17;
                str3 = str2;
            }
            try {
                lVarArr[1] = new jz5.l("strategy", str3);
                w(a0Var, aVar, kz5.c1.k(lVarArr));
            } catch (java.lang.Exception e18) {
                e = e18;
                java.lang.String obj = e.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiNavigateToMiniProgramServer", "[MBAd] directLaunch failed: " + obj, e);
                s().mo146xb9724478(h(-1, obj));
                w(a0Var, mq0.a.f412052n, kz5.c1.k(new jz5.l("errMsg", "fail: " + obj), new jz5.l("impl", str), new jz5.l("strategy", str3)));
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            str3 = str2;
        }
    }

    public final java.lang.String v(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String a17;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "MagicAdMiniProgram")) {
            return str3;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        sb6.append(':');
        java.lang.String[] strArr = new java.lang.String[5];
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            a17 = gm0.j1.b().j();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        } else {
            a17 = kk.v.a(gm0.m.i());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        }
        strArr[0] = "hash=".concat(a17);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ts=");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb7.append(java.lang.System.currentTimeMillis());
        strArr[1] = sb7.toString();
        strArr[2] = "host=";
        strArr[3] = "version=" + o45.wf.f424562g;
        strArr[4] = "device=2";
        sb6.append(u46.l.k(strArr, "&"));
        sb6.append("::");
        sb6.append(str3);
        return sb6.toString();
    }

    public final void w(lc3.a0 a0Var, mq0.a aVar, java.util.Map map) {
        mq0.z zVar;
        java.lang.String str;
        if (a0Var.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) != 1095) {
            return;
        }
        java.lang.String str2 = "";
        java.lang.String optString = a0Var.optString("adUxInfo", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            return;
        }
        java.util.Map m17 = kz5.c1.m(kz5.b1.e(new jz5.l("uxinfo", optString)), map == null ? kz5.q0.f395534d : map);
        i95.m c17 = i95.n0.c(mq0.d0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        mq0.d0.M3((mq0.d0) c17, aVar, m17, null, 4, null);
        try {
            java.lang.String optString2 = a0Var.optString("traceId", "");
            java.lang.String optString3 = a0Var.optString("frameSetName", "");
            java.lang.String optString4 = a0Var.optString("implType", "");
            java.lang.String optString5 = a0Var.optString("bizName", "");
            java.lang.String optString6 = a0Var.optString("bizScene", "");
            switch (aVar.ordinal()) {
                case 19:
                    zVar = mq0.z.f412180u;
                    break;
                case 20:
                    zVar = mq0.z.f412181v;
                    break;
                case 21:
                    zVar = mq0.z.f412182w;
                    break;
                default:
                    zVar = null;
                    break;
            }
            mq0.z zVar2 = zVar;
            if (zVar2 != null) {
                java.util.Map l17 = kz5.c1.l(new jz5.l("apiName", "navigateToMiniProgram"));
                if (optString.length() > 0) {
                    l17.put("uxinfo", optString);
                }
                if (map != null && (str = (java.lang.String) map.get("errMsg")) != null) {
                    str2 = str;
                }
                if (str2.length() > 0) {
                    l17.put("errMsg", str2);
                }
                mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
                if (c0Var != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString4);
                    mq0.c0.ig(c0Var, zVar2, optString5, optString6, optString2, optString3, optString4, null, l17, 64, null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "[MBAd] report full-link failed", e17);
        }
    }
}
