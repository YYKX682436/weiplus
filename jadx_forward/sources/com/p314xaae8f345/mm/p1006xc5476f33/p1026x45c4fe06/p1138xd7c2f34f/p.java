package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes4.dex */
public final class p implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f166411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f166412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166413g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f166414h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f166415i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f166416m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166417n;

    public p(java.lang.String str, int i17, int[] iArr, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, int i18, long j17, java.lang.String str3) {
        this.f166410d = str;
        this.f166411e = i17;
        this.f166412f = iArr;
        this.f166413g = str2;
        this.f166414h = interfaceC11702x4ae7c33;
        this.f166415i = i18;
        this.f166416m = j17;
        this.f166417n = str3;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.String str;
        r45.k50 k50Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.j50 j50Var = new r45.j50();
        j50Var.f459118e = this.f166410d;
        int i17 = this.f166411e;
        j50Var.f459117d = i17;
        boolean z17 = true;
        j50Var.f459122i = 1;
        int[] iArr = this.f166412f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iArr);
        int length = iArr.length;
        int i18 = 0;
        while (true) {
            str = this.f166413g;
            if (i18 >= length) {
                break;
            }
            int i19 = iArr[i18];
            java.util.LinkedList linkedList = j50Var.f459121h;
            r45.es0 es0Var = new r45.es0();
            es0Var.f455231d = i19;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33 = this.f166414h;
            int[] iArr2 = iArr;
            int i27 = this.f166415i;
            if (i19 == 1) {
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(interfaceC11702x4ae7c33 != null ? interfaceC11702x4ae7c33.qe("privacyApiVersion") : null, 0);
                if (interfaceC11702x4ae7c33 != null) {
                    interfaceC11702x4ae7c33.W0();
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("popup_type", 2);
                jSONObject.put("version_type", i17);
                jSONObject.put("version", P);
                jSONObject.put("use_privacy_check", true);
                jSONObject.put("app_version", i27);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                es0Var.f455232e = jSONObject2;
            } else if (i19 == 2) {
                int a17 = k91.g3.f387125a.a(str);
                if (a17 != 0) {
                    es0Var.f455232e = new org.json.JSONObject().put("ext_flag", a17).toString();
                }
            } else if (i19 == 4) {
                java.lang.String W0 = interfaceC11702x4ae7c33 != null ? interfaceC11702x4ae7c33.W0() : null;
                if (W0 == null) {
                    W0 = "";
                }
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("lib_version", W0);
                jSONObject3.put("app_version", i27);
                java.lang.String jSONObject4 = jSONObject3.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                es0Var.f455232e = jSONObject4;
            }
            linkedList.add(es0Var);
            i18++;
            iArr = iArr2;
        }
        lVar.f152197a = j50Var;
        lVar.f152198b = new r45.k50();
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/coldstartfetchdata";
        lVar.f152200d = 4024;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.f b17 = com.p314xaae8f345.mm.p944x882e457a.l3.b(lVar.a(), com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f166416m;
        java.util.LinkedList<r45.cb0> linkedList2 = (b17 == null || (k50Var = (r45.k50) b17.f152151d) == null) ? null : k50Var.f459913e;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            z17 = false;
        }
        java.lang.String str2 = this.f166417n;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", "batchPrefetch for instanceId:" + str2 + ", appId:" + str + ", get empty resp, cost:" + elapsedRealtime + "ms");
        } else {
            for (r45.cb0 cb0Var : linkedList2) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("batchPrefetch for instanceId:");
                sb6.append(str2);
                sb6.append(", appId:");
                sb6.append(str);
                sb6.append(", get resp:");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cb0Var);
                sb6.append("{errcode:" + cb0Var.f452958f + ", fetch_type:" + cb0Var.f452956d + ", resp_data:" + cb0Var.f452957e + '}');
                sb6.append(", cost:");
                sb6.append(elapsedRealtime);
                sb6.append("ms");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", sb6.toString());
            }
        }
        return b17;
    }
}
