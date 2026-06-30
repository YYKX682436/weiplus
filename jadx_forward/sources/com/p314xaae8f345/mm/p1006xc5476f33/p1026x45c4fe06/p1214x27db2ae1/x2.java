package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1;

/* loaded from: classes7.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f172371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 f172372e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f172373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f172374g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f172375h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f172376i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 interfaceC11702x4ae7c33, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, boolean z18, yz5.a aVar) {
        super(1);
        this.f172371d = j17;
        this.f172372e = interfaceC11702x4ae7c33;
        this.f172373f = h0Var;
        this.f172374g = z17;
        this.f172375h = z18;
        this.f172376i = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String valueOf;
        java.lang.String str;
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.vfs.x1 m18;
        com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d result = (com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3 j3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.j3.f172276a;
        long j17 = this.f172371d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 commLibReader = this.f172372e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.l3 category = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80) this.f172373f.f391656d).f172201h;
        boolean z17 = this.f172374g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commLibReader, "commLibReader");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        long uptimeMillis = android.os.SystemClock.uptimeMillis() - j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", "onCreateSnapshotEnd, costTimeMs: " + uptimeMillis + ", commLibReader: " + j3Var.t(commLibReader) + ", category: " + category + ", result: " + result + ", isNodeSnapshot: " + z17);
            if (result instanceof com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreateSnapshotEnd, snapshotSize: ");
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(((com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success) result).f5030xc8782c09);
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                sb6.append((m19.a() && (m18 = m19.f294799a.m(m19.f294800b)) != null) ? m18.f294766c : 0L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCommLibV8SnapshotStats", sb6.toString());
            }
        }
        if (j3Var.b()) {
            if (result instanceof com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success) {
                com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(((com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success) result).f5030xc8782c09);
                java.lang.String str3 = a18.f294812f;
                if (str3 != null) {
                    java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!str3.equals(l18)) {
                        a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m27 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                valueOf = java.lang.String.valueOf((m27.a() && (m17 = m27.f294799a.m(m27.f294800b)) != null) ? m17.f294766c : 0L);
                str = "1";
            } else {
                valueOf = result instanceof com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure ? java.lang.String.valueOf(((com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Failure) result).f5026x5c4d1e6) : "-201";
                str = "0";
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007 c6307x4654e007 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6307x4654e007();
            c6307x4654e007.f136643d = 5;
            c6307x4654e007.r(j3Var.t(commLibReader));
            c6307x4654e007.s(cl.x.b());
            c6307x4654e007.f136646g = uptimeMillis;
            c6307x4654e007.p(str);
            c6307x4654e007.q(valueOf);
            c6307x4654e007.f136649j = c6307x4654e007.b("ActionParams3", category.f172308d, true);
            c6307x4654e007.f136650k = c6307x4654e007.b("ActionParams4", z17 ? "1" : "0", true);
            c6307x4654e007.k();
        }
        if (result instanceof com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f172373f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df80 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80) h0Var.f391656d;
            com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success success = (com.p159x477cd522.p160x333422.p163x10fad5c4.AbstractC1516x4fd55f3d.Success) result;
            boolean z18 = this.f172374g;
            c12745x1ee4df80.getClass();
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(success.f5030xc8782c09);
            java.lang.String snapshotPath = success.f5030xc8782c09;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(snapshotPath, "snapshotPath");
            long B = r6Var.B();
            long C = r6Var.C();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.o3 o3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80.f172194v;
            java.lang.String str4 = (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80.f172195w).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "access$getCurSnapshotBaseConfig(...)");
            java.util.Map<java.lang.String, java.lang.Integer> contextNameToSnapshotIndexMap = success.f5029x86815c23;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contextNameToSnapshotIndexMap, "contextNameToSnapshotIndexMap");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : contextNameToSnapshotIndexMap.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue().intValue());
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaPkgV8SnapshotInfo", "generateMetaInfo, failure since " + e17);
            }
            java.lang.String str5 = (java.lang.String) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80.f172196x).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "access$getCurSnapshotNodeFlag(...)");
            h0Var.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80.b(c12745x1ee4df80, 0, null, null, 0, null, snapshotPath, B, C, str4, jSONObject, z18, str5, 0, 0, 0, 24607, null);
            ((ku5.t0) ku5.t0.f394148d).r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.w2(this.f172373f), "MicroMsg.WxaCommLibV8SnapshotServiceImpl");
            if (this.f172375h) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80 c12745x1ee4df802 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.C12745x1ee4df80) this.f172373f.f391656d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172282a.getClass();
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.k2.f172284c) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NodeOnlySnapshotQuickAccessible", "snapshotInfo#set, value: " + c12745x1ee4df802);
                }
                if (c12745x1ee4df802 == null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a19 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
                    if (a19 != null) {
                        a19.remove("NodeOnlySnapshotInfo#" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3.f172353d);
                    }
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a27 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.q0.f156760a.a();
                    if (a27 != null) {
                        java.lang.String str6 = "NodeOnlySnapshotInfo#" + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1214x27db2ae1.s3.f172353d;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("snapshotPath", c12745x1ee4df802.f172202i);
                        jSONObject2.put("snapshotLastModified", c12745x1ee4df802.f172203m);
                        jSONObject2.put("snapshotLength", c12745x1ee4df802.f172204n);
                        jSONObject2.put("snapshotBaseConfig", c12745x1ee4df802.f172205o);
                        jSONObject2.put("snapshotMetaInfo", c12745x1ee4df802.f172206p);
                        jSONObject2.put("snapshotNodeConfig", c12745x1ee4df802.f172208r);
                        a27.putString(str6, jSONObject2.toString());
                    }
                }
            }
        }
        this.f172376i.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
