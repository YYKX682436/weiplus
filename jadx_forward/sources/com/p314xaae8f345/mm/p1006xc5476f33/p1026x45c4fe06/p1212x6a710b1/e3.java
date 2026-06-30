package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes7.dex */
public abstract class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f171948a = {"app-service.js", "common.app.js", "appservice.app.js", "game.js"};

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f171949b;

    public static java.lang.String a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f171949b)) {
            f171949b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getAbsolutePath() + "/wasae.dat";
        }
        return f171949b;
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, java.lang.String str, java.lang.String[] strArr, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 b3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 y3Var;
        java.lang.String str2;
        int i17;
        if (e9Var == null || tVar == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.l0.class);
        java.util.Objects.requireNonNull(l0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3 M0 = e9Var.M0();
        java.util.Objects.requireNonNull(M0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsValidationInjectorWC", "batchInjectUsrJsFiles start assemble requests, appId:%s, key:%s, paths.size:%d", mo48798x74292566, str, java.lang.Integer.valueOf(strArr.length));
        java.lang.String g17 = g(e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3.USR);
        boolean b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(e9Var.t3().f156338p.f158814g);
        int length = strArr.length;
        int i18 = 0;
        while (i18 < length) {
            java.lang.String str3 = strArr[i18];
            if (!android.text.TextUtils.isEmpty(str3)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 mo49254xc00e82af = M0.mo49254xc00e82af(str3);
                if (mo49254xc00e82af == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsValidationInjectorWC", "batchInjectUsrJsFiles for appId(%s) path(%s) not found", mo48798x74292566, str3);
                } else {
                    y3Var = M0;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(g17);
                    i17 = length;
                    sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(str3));
                    java.lang.String sb7 = sb6.toString();
                    if (!b17) {
                        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.nf.a(e9Var.t3(), str3, g17);
                        if (!android.text.TextUtils.isEmpty(a17)) {
                            str2 = g17;
                            com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9 = new com.p159x477cd522.p160x333422.C1481x17e6a5e9();
                            c1481x17e6a5e9.f4814xcdd22c98 = a17;
                            c1481x17e6a5e9.f4815xcdd276a5 = 3;
                            linkedList.addLast(c1481x17e6a5e9);
                            linkedList2.addLast(d(str3, mo49254xc00e82af, sb7));
                            i18++;
                            M0 = y3Var;
                            length = i17;
                            g17 = str2;
                        }
                    }
                    str2 = g17;
                    linkedList2.addLast(d(str3, mo49254xc00e82af, sb7));
                    i18++;
                    M0 = y3Var;
                    length = i17;
                    g17 = str2;
                }
            }
            y3Var = M0;
            str2 = g17;
            i17 = length;
            i18++;
            M0 = y3Var;
            length = i17;
            g17 = str2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedList.size() + linkedList2.size() + 1);
        arrayList.addAll(linkedList);
        arrayList.addAll(linkedList2);
        arrayList.add(c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsValidationInjectorWC", "batchInjectUsrJsFiles start invoke batchEvaluateJavascript, appId:%s, key:%s, paths.size:%d", mo48798x74292566, str, java.lang.Integer.valueOf(strArr.length));
        l0Var.l0(arrayList, a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.g3(str, b3Var, currentTimeMillis));
    }

    public static com.p159x477cd522.p160x333422.C1481x17e6a5e9 c() {
        com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9 = new com.p159x477cd522.p160x333422.C1481x17e6a5e9();
        c1481x17e6a5e9.f4815xcdd276a5 = 3;
        c1481x17e6a5e9.f4814xcdd22c98 = java.lang.String.format(java.util.Locale.ENGLISH, "\n;(function(){return %d;})();", 11111);
        return c1481x17e6a5e9;
    }

    public static com.p159x477cd522.p160x333422.C1481x17e6a5e9 d(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x3 x3Var, java.lang.String str2) {
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(x3Var.f157578f).replace('/', '_') + "_" + x3Var.f157573a;
        java.lang.String str4 = x3Var.f157575c;
        com.p159x477cd522.p160x333422.C1481x17e6a5e9 c1481x17e6a5e9 = new com.p159x477cd522.p160x333422.C1481x17e6a5e9();
        c1481x17e6a5e9.f4815xcdd276a5 = 2;
        com.p159x477cd522.p160x333422.C1485x5683f13e c1485x5683f13e = new com.p159x477cd522.p160x333422.C1485x5683f13e();
        c1481x17e6a5e9.f4816xeca5f473 = c1485x5683f13e;
        c1485x5683f13e.f4828xaee3fa51 = x3Var.f157577e;
        c1485x5683f13e.f4827xbeaa57e7 = x3Var.f157578f;
        c1481x17e6a5e9.f4813xcdcf61f6 = str2;
        c1481x17e6a5e9.f4811xec61b05d = 0;
        c1481x17e6a5e9.f4808x7f1f2ea0 = str3;
        c1481x17e6a5e9.f4809xe6292f7d = str4;
        c1481x17e6a5e9.f4810xdf0121dc = 0;
        return c1481x17e6a5e9;
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, java.lang.String str) {
        try {
            tVar.R(new java.net.URL(str + "break.js"), "breakprogram();", null);
        } catch (java.net.MalformedURLException unused) {
        }
    }

    public static void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w.class);
        if (wVar == null) {
            return;
        }
        cl.a aVar = (cl.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) wVar).n0().f124257b;
        aVar.f124121u.add(new cl.l1(new cl.q1(aVar.f124101a, aVar)));
    }

    public static java.lang.String g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3 i3Var) {
        return i3Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3.LIB ? e9Var.X0() : i3Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3.USR ? e9Var.b1() : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 r16, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21, java.lang.String r22, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3 r23, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 r24) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.h(com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsruntime.t, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, com.tencent.mm.plugin.appbrand.utils.i3, com.tencent.mm.plugin.appbrand.utils.b3):void");
    }

    public static void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t tVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3 i3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 b3Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            if (b3Var != null) {
                b3Var.b("isNullOrNil script");
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w) tVar.h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.w.class);
        if (wVar == null) {
            return;
        }
        java.lang.String str3 = str2 + java.lang.String.format(java.util.Locale.ENGLISH, "\n;(function(){return %d;})();", 11111);
        try {
            java.lang.String url = new java.net.URL(g(e9Var, i3Var) + str).toString();
            cl.q0 n07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.n) wVar).n0();
            n07.getClass();
            ((cl.a) n07.f124257b).h(new cl.a1(n07, str3, url), false);
        } catch (java.net.MalformedURLException unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:7|(10:11|12|13|14|15|16|17|18|19|(2:21|22)(4:24|(1:26)(1:29)|27|28))|47|13|14|15|16|17|18|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsValidationInjectorWC", "createEvalRequestForAssetFd, convert scriptFd to v8Fd, get exception:%s", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 r15, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, android.content.res.AssetFileDescriptor r21, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i3 r22, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3 r23) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e3.j(com.tencent.mm.plugin.appbrand.e9, com.tencent.mm.plugin.appbrand.jsruntime.t, java.lang.String, java.lang.String, java.lang.String, int, android.content.res.AssetFileDescriptor, com.tencent.mm.plugin.appbrand.utils.i3, com.tencent.mm.plugin.appbrand.utils.b3):void");
    }
}
