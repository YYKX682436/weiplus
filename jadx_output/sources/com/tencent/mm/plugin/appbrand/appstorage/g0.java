package com.tencent.mm.plugin.appbrand.appstorage;

/* loaded from: classes7.dex */
public final class g0 implements com.tencent.mm.plugin.appbrand.appstorage.q1 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.appstorage.a0 f76181h = new com.tencent.mm.plugin.appbrand.appstorage.a0(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f76182i = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.w1 f76183d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f76184e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f76185f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f76186g;

    public g0(long j17, java.lang.String storageFileNamePrefix) {
        com.tencent.mm.sdk.platformtools.o4 M;
        kotlin.jvm.internal.o.g(storageFileNamePrefix, "storageFileNamePrefix");
        com.tencent.mars.xlog.Log.i("AppBrandMMKVStorage", "getMMKV uin:" + j17);
        if (storageFileNamePrefix.length() > 0) {
            M = com.tencent.mm.sdk.platformtools.o4.M(storageFileNamePrefix + j17);
            kotlin.jvm.internal.o.d(M);
        } else {
            M = com.tencent.mm.sdk.platformtools.o4.M("AppBrandMMKVStorage" + j17);
            kotlin.jvm.internal.o.d(M);
        }
        this.f76184e = M;
        this.f76185f = new com.tencent.mm.plugin.appbrand.appstorage.d0(this);
        this.f76186g = new com.tencent.mm.plugin.appbrand.appstorage.f0(this);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public java.util.List G(int i17, java.lang.String str, java.util.List keys) {
        kotlin.jvm.internal.o.g(keys, "keys");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = keys.iterator();
        while (it.hasNext()) {
            arrayList.add(o(i17, str, (java.lang.String) it.next()));
        }
        return arrayList;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public int K(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        int i17 = 0;
        for (int i18 : com.tencent.mm.plugin.appbrand.appstorage.a2.f(appId, this.f76185f, this.f76186g)) {
            i17 += c(i18, appId);
        }
        return i17;
    }

    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        kotlin.jvm.internal.o.d(str);
        yz5.l getter = this.f76185f;
        yz5.p setter = this.f76186g;
        for (int i17 : com.tencent.mm.plugin.appbrand.appstorage.a2.f(str, getter, setter)) {
            h(i17, str, 0);
        }
        d(str, new com.tencent.mm.plugin.appbrand.appstorage.c0(this));
        kotlin.jvm.internal.o.g(getter, "getter");
        kotlin.jvm.internal.o.g(setter, "setter");
        ((com.tencent.mm.plugin.appbrand.appstorage.f0) setter).invoke(com.tencent.mm.plugin.appbrand.appstorage.a2.d(str, "@@@TOTAL@STORAGE@ID@@@"), "");
    }

    public final int b(java.lang.String str) {
        java.lang.String string = this.f76184e.getString(str, "");
        try {
            return java.lang.Integer.parseInt(i(string != null ? string : "").f76146c);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public final int c(int i17, java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.P(this.f76184e.getString(com.tencent.mm.plugin.appbrand.appstorage.a2.e(i17, str, "@@@TOTAL@DATA@SIZE@@@", "++"), ""), 0);
    }

    public final void d(java.lang.String appId, yz5.l block) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(block, "block");
        java.lang.String pattern = "^([1-9]\\d*__)?" + appId + "__.+$";
        kotlin.jvm.internal.o.g(pattern, "pattern");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String[] b17 = this.f76184e.b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        for (java.lang.String str : b17) {
            kotlin.jvm.internal.o.d(str);
            if (compile.matcher(str).matches()) {
                block.invoke(str);
            }
        }
    }

    public int e(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        d(appId, new com.tencent.mm.plugin.appbrand.appstorage.e0(f0Var));
        return f0Var.f310116d;
    }

    public com.tencent.mm.plugin.appbrand.appstorage.o1 f(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String dataType, int i18) {
        kotlin.jvm.internal.o.g(dataType, "dataType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return com.tencent.mm.plugin.appbrand.appstorage.o1.MISSING_PARAMS;
        }
        kotlin.jvm.internal.o.d(str);
        return g(i17, str, str2, str3, i18, dataType, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x011c, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.appbrand.appstorage.o1 g(int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, java.lang.String r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appstorage.g0.g(int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean):com.tencent.mm.plugin.appbrand.appstorage.o1");
    }

    public final void h(int i17, java.lang.String str, int i18) {
        this.f76184e.putString(com.tencent.mm.plugin.appbrand.appstorage.a2.e(i17, str, "@@@TOTAL@DATA@SIZE@@@", "++"), java.lang.String.valueOf(i18));
    }

    public final com.tencent.mm.plugin.appbrand.appstorage.b0 i(java.lang.String str) {
        java.lang.String[] strArr = (java.lang.String[]) new r26.t("#").g(str, 3).toArray(new java.lang.String[0]);
        return strArr.length == 3 ? new com.tencent.mm.plugin.appbrand.appstorage.b0(strArr[2], strArr[0], strArr[1]) : new com.tencent.mm.plugin.appbrand.appstorage.b0("", "", "");
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public void k(int i17, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.String str2 = i17 == 0 ? str + "__" : i17 + "__" + str + "__";
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f76184e;
        java.lang.String[] b17 = o4Var.b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        for (java.lang.String str3 : b17) {
            kotlin.jvm.internal.o.d(str3);
            if (r26.i0.y(str3, str2, false)) {
                o4Var.remove(str3);
            }
        }
        kotlin.jvm.internal.o.d(str);
        h(i17, str, 0);
        com.tencent.mm.plugin.appbrand.appstorage.a2.h(str, i17, this.f76185f, this.f76186g);
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public com.tencent.mm.plugin.appbrand.appstorage.o1 l(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String dataType) {
        kotlin.jvm.internal.o.g(dataType, "dataType");
        return f(i17, str, str2, str3, dataType, com.tencent.mm.plugin.appbrand.appstorage.a2.b(str2, str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object[] o(int r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appstorage.g0.o(int, java.lang.String, java.lang.String):java.lang.Object[]");
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public com.tencent.mm.plugin.appbrand.appstorage.o1 q(int i17, java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return com.tencent.mm.plugin.appbrand.appstorage.o1.MISSING_PARAMS;
        }
        kotlin.jvm.internal.o.d(str);
        kotlin.jvm.internal.o.d(str2);
        java.lang.String e17 = com.tencent.mm.plugin.appbrand.appstorage.a2.e(i17, str, str2, "__");
        int max = java.lang.Math.max(0, c(i17, str) + (-b(e17)));
        h(i17, str, max);
        this.f76184e.remove(e17);
        if (max <= 0) {
            com.tencent.mm.plugin.appbrand.appstorage.a2.h(str, i17, this.f76185f, this.f76186g);
        }
        return com.tencent.mm.plugin.appbrand.appstorage.o1.NONE;
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public java.lang.Object[] t(int i17, java.lang.String str) {
        if (str == null) {
            return new java.lang.Object[]{kz5.p0.f313996d, 0, 0};
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String concat = i17 == 0 ? str.concat("__") : i17 + "__" + str + "__";
        java.lang.String[] b17 = this.f76184e.b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        for (java.lang.String str2 : b17) {
            kotlin.jvm.internal.o.d(str2);
            if (r26.i0.y(str2, concat, false)) {
                arrayList.add(r26.i0.t(str2, concat, "", false));
            }
        }
        return new java.lang.Object[]{arrayList, java.lang.Integer.valueOf(c(i17, str)), java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.appstorage.a2.g(i17, str))};
    }

    @Override // com.tencent.mm.plugin.appbrand.appstorage.q1
    public com.tencent.mm.plugin.appbrand.appstorage.o1 z(int i17, java.lang.String str, java.util.List kvInfo) {
        boolean z17;
        kotlin.jvm.internal.o.g(kvInfo, "kvInfo");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (!kvInfo.isEmpty()) {
                java.util.Iterator it = kvInfo.iterator();
                while (it.hasNext()) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.appbrand.appstorage.p1) it.next()).f76301a)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                kotlin.jvm.internal.o.d(str);
                java.util.Iterator it6 = kvInfo.iterator();
                int i18 = 0;
                int i19 = 0;
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.appbrand.appstorage.p1 p1Var = (com.tencent.mm.plugin.appbrand.appstorage.p1) it6.next();
                    i18 += com.tencent.mm.plugin.appbrand.appstorage.a2.b(p1Var.f76301a, p1Var.f76302b);
                    java.lang.String str2 = p1Var.f76301a;
                    kotlin.jvm.internal.o.d(str2);
                    i19 += b(com.tencent.mm.plugin.appbrand.appstorage.a2.e(i17, str, str2, "__"));
                }
                if (c(i17, str) + (i18 - i19) >= com.tencent.mm.plugin.appbrand.appstorage.a2.g(i17, str)) {
                    return com.tencent.mm.plugin.appbrand.appstorage.o1.QUOTA_REACHED;
                }
                java.util.Iterator it7 = kvInfo.iterator();
                while (it7.hasNext()) {
                    com.tencent.mm.plugin.appbrand.appstorage.p1 p1Var2 = (com.tencent.mm.plugin.appbrand.appstorage.p1) it7.next();
                    java.lang.String str3 = p1Var2.f76301a;
                    java.lang.String str4 = p1Var2.f76302b;
                    int b17 = com.tencent.mm.plugin.appbrand.appstorage.a2.b(str3, str4);
                    java.lang.String dataType = p1Var2.f76303c;
                    kotlin.jvm.internal.o.f(dataType, "dataType");
                    g(i17, str, str3, str4, b17, dataType, false);
                }
                return com.tencent.mm.plugin.appbrand.appstorage.o1.NONE;
            }
        }
        return com.tencent.mm.plugin.appbrand.appstorage.o1.MISSING_PARAMS;
    }
}
