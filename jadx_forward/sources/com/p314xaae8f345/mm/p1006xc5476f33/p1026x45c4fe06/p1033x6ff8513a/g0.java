package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class g0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1 {

    /* renamed from: h, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a0 f157714h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a0(null);

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f157715i = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.w1 f157716d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f157717e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f157718f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.p f157719g;

    public g0(long j17, java.lang.String storageFileNamePrefix) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageFileNamePrefix, "storageFileNamePrefix");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandMMKVStorage", "getMMKV uin:" + j17);
        if (storageFileNamePrefix.length() > 0) {
            M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(storageFileNamePrefix + j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        } else {
            M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("AppBrandMMKVStorage" + j17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
        }
        this.f157717e = M;
        this.f157718f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.d0(this);
        this.f157719g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.f0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public java.util.List G(int i17, java.lang.String str, java.util.List keys) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = keys.iterator();
        while (it.hasNext()) {
            arrayList.add(o(i17, str, (java.lang.String) it.next()));
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public int K(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        int i17 = 0;
        for (int i18 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.f(appId, this.f157718f, this.f157719g)) {
            i17 += c(i18, appId);
        }
        return i17;
    }

    public void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        yz5.l getter = this.f157718f;
        yz5.p setter = this.f157719g;
        for (int i17 : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.f(str, getter, setter)) {
            h(i17, str, 0);
        }
        d(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.c0(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(getter, "getter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setter, "setter");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.f0) setter).mo149xb9724478(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.d(str, "@@@TOTAL@STORAGE@ID@@@"), "");
    }

    public final int b(java.lang.String str) {
        java.lang.String string = this.f157717e.getString(str, "");
        try {
            return java.lang.Integer.parseInt(i(string != null ? string : "").f157679c);
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    public final int c(int i17, java.lang.String str) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f157717e.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.e(i17, str, "@@@TOTAL@DATA@SIZE@@@", "++"), ""), 0);
    }

    public final void d(java.lang.String appId, yz5.l block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        java.lang.String pattern = "^([1-9]\\d*__)?" + appId + "__.+$";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String[] b17 = this.f157717e.b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        for (java.lang.String str : b17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            if (compile.matcher(str).matches()) {
                block.mo146xb9724478(str);
            }
        }
    }

    public int e(java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        d(appId, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.e0(f0Var));
        return f0Var.f391649d;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 f(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String dataType, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataType, "dataType");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.MISSING_PARAMS;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
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
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 g(int r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, java.lang.String r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0.g(int, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean):com.tencent.mm.plugin.appbrand.appstorage.o1");
    }

    public final void h(int i17, java.lang.String str, int i18) {
        this.f157717e.putString(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.e(i17, str, "@@@TOTAL@DATA@SIZE@@@", "++"), java.lang.String.valueOf(i18));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.b0 i(java.lang.String str) {
        java.lang.String[] strArr = (java.lang.String[]) new r26.t("#").g(str, 3).toArray(new java.lang.String[0]);
        return strArr.length == 3 ? new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.b0(strArr[2], strArr[0], strArr[1]) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.b0("", "", "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public void k(int i17, java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.lang.String str2 = i17 == 0 ? str + "__" : i17 + "__" + str + "__";
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f157717e;
        java.lang.String[] b17 = o4Var.b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        for (java.lang.String str3 : b17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            if (r26.i0.y(str3, str2, false)) {
                o4Var.remove(str3);
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        h(i17, str, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.h(str, i17, this.f157718f, this.f157719g);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 l(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String dataType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataType, "dataType");
        return f(i17, str, str2, str3, dataType, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.b(str2, str3));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019d  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object[] o(int r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.g0.o(int, java.lang.String, java.lang.String):java.lang.Object[]");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 q(int i17, java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.MISSING_PARAMS;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.e(i17, str, str2, "__");
        int max = java.lang.Math.max(0, c(i17, str) + (-b(e17)));
        h(i17, str, max);
        this.f157717e.remove(e17);
        if (max <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.h(str, i17, this.f157718f, this.f157719g);
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public java.lang.Object[] t(int i17, java.lang.String str) {
        if (str == null) {
            return new java.lang.Object[]{kz5.p0.f395529d, 0, 0};
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String concat = i17 == 0 ? str.concat("__") : i17 + "__" + str + "__";
        java.lang.String[] b17 = this.f157717e.b();
        if (b17 == null) {
            b17 = new java.lang.String[0];
        }
        for (java.lang.String str2 : b17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            if (r26.i0.y(str2, concat, false)) {
                arrayList.add(r26.i0.t(str2, concat, "", false));
            }
        }
        return new java.lang.Object[]{arrayList, java.lang.Integer.valueOf(c(i17, str)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.g(i17, str))};
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1 z(int i17, java.lang.String str, java.util.List kvInfo) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kvInfo, "kvInfo");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (!kvInfo.isEmpty()) {
                java.util.Iterator it = kvInfo.iterator();
                while (it.hasNext()) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p1) it.next()).f157834a)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                java.util.Iterator it6 = kvInfo.iterator();
                int i18 = 0;
                int i19 = 0;
                while (it6.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p1 p1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p1) it6.next();
                    i18 += com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.b(p1Var.f157834a, p1Var.f157835b);
                    java.lang.String str2 = p1Var.f157834a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    i19 += b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.e(i17, str, str2, "__"));
                }
                if (c(i17, str) + (i18 - i19) >= com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.g(i17, str)) {
                    return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.QUOTA_REACHED;
                }
                java.util.Iterator it7 = kvInfo.iterator();
                while (it7.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p1 p1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p1) it7.next();
                    java.lang.String str3 = p1Var2.f157834a;
                    java.lang.String str4 = p1Var2.f157835b;
                    int b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.b(str3, str4);
                    java.lang.String dataType = p1Var2.f157836c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dataType, "dataType");
                    g(i17, str, str3, str4, b17, dataType, false);
                }
                return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE;
            }
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.MISSING_PARAMS;
    }
}
