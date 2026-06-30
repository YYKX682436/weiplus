package pd3;

/* loaded from: classes7.dex */
public final class c implements jc3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public org.json.JSONObject f435084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pd3.d f435085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435086c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435089f;

    public c(pd3.d dVar, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3) {
        this.f435085b = dVar;
        this.f435086c = str;
        this.f435087d = str2;
        this.f435088e = z17;
        this.f435089f = str3;
    }

    @Override // jc3.x0
    public void a(int i17, java.lang.String str, java.lang.Object obj, org.json.JSONObject jSONObject, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q4.class))).wi(this.f435085b.e().f425864a);
        if (wi6 == null) {
            this.f435085b.w(this.f435086c, this.f435087d, 303304, "fail:get file system error");
            return;
        }
        java.lang.Object obj2 = map != null ? map.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str6 = (java.lang.String) obj2;
        java.lang.Object obj3 = map != null ? map.get("mimeType") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str7 = (java.lang.String) obj3;
        java.lang.Object obj4 = map != null ? map.get("dataLength") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) obj4).longValue();
        java.lang.Object obj5 = map != null ? map.get("statusCode") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) obj5).intValue();
        java.lang.String p17 = this.f435088e ? com.p314xaae8f345.mm.vfs.w6.p(str6) : null;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f435089f);
        java.lang.String str8 = p17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (K0) {
            pd3.d dVar = this.f435085b;
            dVar.getClass();
            java.lang.String a17 = q75.g.a(str7);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                str2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54257xb16332e8, str7)) {
                    a17 = "mp4";
                }
            } else {
                str2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589;
            }
            ik1.b0 b0Var = new ik1.b0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.j) wi6).mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str6)), a17, true, b0Var);
            if (mo49619x6aa75256 != j1Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(dVar.f435090f, "saveDownloadFile fail ret: " + mo49619x6aa75256);
                str3 = null;
            } else {
                str3 = (java.lang.String) b0Var.f373357a;
            }
            if (str3 == null) {
                if (pd3.d.v(this.f435085b, this.f435086c, this.f435087d)) {
                    return;
                }
                this.f435085b.w(this.f435086c, this.f435087d, 303300, mo49619x6aa75256 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE ? "temp file size exceed limit" : "download fail save file fail");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f435085b.f435090f, "onDownloadResultWithCode localId %s", str3);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("downloadTaskId", this.f435087d);
            jSONObject2.put("state", ya.b.f77504xbb80cbe3);
            jSONObject2.put("tempFilePath", str3);
            jSONObject2.put("dataLength", longValue);
            jSONObject2.put("statusCode", intValue);
            org.json.JSONObject jSONObject3 = this.f435084a;
            if (jSONObject3 != null) {
                jSONObject2.put("header", jSONObject3);
            }
            if (map2 != null && (!map2.isEmpty())) {
                jSONObject2.put(str2, map2);
            }
            if (str8 != null) {
                jSONObject2.put("calcuatedMd5", str8);
            }
            java.lang.String jSONObject4 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            pd3.d dVar2 = this.f435085b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39 c16445x71489a39 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39();
            c16445x71489a39.f229415e = jSONObject4;
            dVar2.u(c16445x71489a39);
            return;
        }
        pd3.d dVar3 = this.f435085b;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str6));
        java.lang.String dstPath = this.f435089f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dstPath, "$dstPath");
        dVar3.getClass();
        if (r6Var.m()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49303x5fd6f23 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l) wi6).mo49303x5fd6f23(dstPath);
            str4 = "statusCode";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49303x5fd6f23, "isdir(...)");
            if (mo49303x5fd6f23 != j1Var) {
                try {
                    mo49303x5fd6f23 = wi6.mo49631x84702499(r6Var, dstPath, new ik1.b0());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49303x5fd6f23, "saveFile(...)");
                } catch (java.lang.Exception e17) {
                    str5 = "fail:writeFile exception: " + e17;
                }
            }
            int ordinal = mo49303x5fd6f23.ordinal();
            if (ordinal == 0) {
                str5 = "ok";
            } else if (ordinal == 9) {
                str5 = java.lang.String.format("fail illegal operation on a directory, open \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "format(...)");
            } else if (ordinal == 15) {
                str5 = "fail the maximum size of the file storage limit is exceeded";
            } else if (ordinal == 3) {
                str5 = java.lang.String.format("fail no such file or directory \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "format(...)");
            } else if (ordinal != 4) {
                str5 = "fail " + mo49303x5fd6f23.name();
            } else {
                str5 = java.lang.String.format("fail permission denied, open \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str5, "format(...)");
            }
        } else {
            str5 = "fail:file not exists";
            str4 = "statusCode";
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("ok", str5)) {
            if (pd3.d.v(this.f435085b, this.f435086c, this.f435087d)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f435085b.f435090f, "onDownloadResultWithCode saveErrMsg:%s,filePath:%s", str5, str6);
            this.f435085b.w(this.f435086c, this.f435087d, 303300, "fail:download save file error");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f435085b.f435090f, "onDownloadResultWithCode dstPath %s", this.f435089f);
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        java.lang.String str9 = this.f435087d;
        java.lang.String str10 = this.f435089f;
        jSONObject5.put("downloadTaskId", str9);
        jSONObject5.put("state", ya.b.f77504xbb80cbe3);
        jSONObject5.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str10);
        jSONObject5.put("dataLength", longValue);
        jSONObject5.put(str4, intValue);
        org.json.JSONObject jSONObject6 = this.f435084a;
        if (jSONObject6 != null) {
            jSONObject5.put("header", jSONObject6);
        }
        if (map2 != null && (!map2.isEmpty())) {
            jSONObject5.put(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, map2);
        }
        if (str8 != null) {
            jSONObject5.put("calcuatedMd5", str8);
        }
        java.lang.String jSONObject7 = jSONObject5.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject7, "toString(...)");
        pd3.d dVar4 = this.f435085b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39 c16445x71489a392 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39();
        c16445x71489a392.f229415e = jSONObject7;
        dVar4.u(c16445x71489a392);
    }

    @Override // jc3.x0
    public void b(org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            return;
        }
        this.f435084a = jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("downloadTaskId", this.f435087d);
        jSONObject2.put("state", "headersReceived");
        jSONObject2.put("header", this.f435084a);
        java.lang.String jSONObject3 = jSONObject2.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39 c16445x71489a39 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39();
        c16445x71489a39.f229415e = jSONObject3;
        this.f435085b.u(c16445x71489a39);
    }

    @Override // jc3.x0
    public void c(int i17, java.lang.String str, java.lang.String str2, java.util.Map map) {
        pd3.d dVar = this.f435085b;
        java.lang.String str3 = this.f435086c;
        java.lang.String str4 = this.f435087d;
        if (pd3.d.v(dVar, str3, str4)) {
            return;
        }
        dVar.w(str3, str4, i17, str);
    }

    @Override // jc3.x0
    public void d(int i17, long j17, long j18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("downloadTaskId", this.f435087d);
        jSONObject.put("state", "progressUpdate");
        jSONObject.put("progress", i17);
        jSONObject.put("totalBytesWritten", j17);
        jSONObject.put("totalBytesExpectedToWrite", j18);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39 c16445x71489a39 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16445x71489a39();
        c16445x71489a39.f229415e = jSONObject2;
        this.f435085b.u(c16445x71489a39);
    }
}
