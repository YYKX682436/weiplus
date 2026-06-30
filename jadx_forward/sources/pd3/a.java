package pd3;

/* loaded from: classes7.dex */
public final class a implements jc3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pd3.b f435079a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435081c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435082d;

    public a(pd3.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f435079a = bVar;
        this.f435080b = str;
        this.f435081c = str2;
        this.f435082d = str3;
    }

    @Override // jc3.x0
    public void a(int i17, java.lang.String str, java.lang.Object obj, org.json.JSONObject jSONObject, java.util.Map map, java.util.Map map2, java.util.Map map3) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.y5) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.q4.class))).wi(this.f435079a.e().f425864a);
        if (wi6 == null) {
            this.f435079a.w(this.f435080b, this.f435081c, 303304, "fail:get file system error");
            return;
        }
        java.lang.Object obj2 = map != null ? map.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37650x1214b17) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str3 = (java.lang.String) obj2;
        java.lang.Object obj3 = map != null ? map.get("mimeType") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str4 = (java.lang.String) obj3;
        java.lang.Object obj4 = map != null ? map.get("dataLength") : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) obj4).longValue();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f435082d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 j1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK;
        if (K0) {
            this.f435079a.getClass();
            java.lang.String a17 = q75.g.a(str4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54257xb16332e8, str4)) {
                a17 = "mp4";
            }
            ik1.b0 b0Var = new ik1.b0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49619x6aa75256 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.j) wi6).mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3)), a17, true, b0Var);
            java.lang.String str5 = mo49619x6aa75256 == j1Var ? (java.lang.String) b0Var.f373357a : null;
            if (str5 == null) {
                if (pd3.b.v(this.f435079a, this.f435080b, this.f435081c)) {
                    return;
                }
                this.f435079a.w(this.f435080b, this.f435081c, 303300, mo49619x6aa75256 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.ERR_EXCEED_DIRECTORY_MAX_SIZE ? "temp file size exceed limit" : "download fail save file fail");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f435079a.f435083f, "onDownloadResultWithCode localId %s", str5);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("downloadTaskId", this.f435081c);
            jSONObject2.put("state", ya.b.f77504xbb80cbe3);
            jSONObject2.put("tempFilePath", str5);
            jSONObject2.put("dataLength", longValue);
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            pd3.b bVar = this.f435079a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16444x6bb88322 c16444x6bb88322 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16444x6bb88322();
            c16444x6bb88322.f229415e = jSONObject3;
            bVar.u(c16444x6bb88322);
            return;
        }
        pd3.b bVar2 = this.f435079a;
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str3));
        java.lang.String dstPath = this.f435082d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dstPath, "$dstPath");
        bVar2.getClass();
        if (r6Var.m()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49303x5fd6f23 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.fs.l) wi6).mo49303x5fd6f23(dstPath);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49303x5fd6f23, "isdir(...)");
            if (mo49303x5fd6f23 != j1Var) {
                try {
                    mo49303x5fd6f23 = wi6.mo49631x84702499(r6Var, dstPath, new ik1.b0());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49303x5fd6f23, "saveFile(...)");
                } catch (java.lang.Exception e17) {
                    str2 = "fail:writeFile exception: " + e17;
                }
            }
            int ordinal = mo49303x5fd6f23.ordinal();
            if (ordinal == 0) {
                str2 = "ok";
            } else if (ordinal == 9) {
                str2 = java.lang.String.format("fail illegal operation on a directory, open \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "format(...)");
            } else if (ordinal == 15) {
                str2 = "fail the maximum size of the file storage limit is exceeded";
            } else if (ordinal == 3) {
                str2 = java.lang.String.format("fail no such file or directory \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "format(...)");
            } else if (ordinal != 4) {
                str2 = "fail " + mo49303x5fd6f23.name();
            } else {
                str2 = java.lang.String.format("fail permission denied, open \"%s\"", java.util.Arrays.copyOf(new java.lang.Object[]{dstPath}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "format(...)");
            }
        } else {
            str2 = "fail:file not exists";
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b("ok", str2)) {
            if (pd3.b.v(this.f435079a, this.f435080b, this.f435081c)) {
                return;
            }
            this.f435079a.w(this.f435080b, this.f435081c, 303300, "fail:download save file error");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f435079a.f435083f, "onDownloadResultWithCode filePath %s", this.f435082d);
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        java.lang.String str6 = this.f435081c;
        java.lang.String str7 = this.f435082d;
        jSONObject4.put("downloadTaskId", str6);
        jSONObject4.put("state", ya.b.f77504xbb80cbe3);
        jSONObject4.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str7);
        jSONObject4.put("dataLength", longValue);
        java.lang.String jSONObject5 = jSONObject4.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
        pd3.b bVar3 = this.f435079a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16444x6bb88322 c16444x6bb883222 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16444x6bb88322();
        c16444x6bb883222.f229415e = jSONObject5;
        bVar3.u(c16444x6bb883222);
    }

    @Override // jc3.x0
    public void b(org.json.JSONObject jSONObject, int i17) {
    }

    @Override // jc3.x0
    public void c(int i17, java.lang.String str, java.lang.String str2, java.util.Map map) {
        pd3.b bVar = this.f435079a;
        java.lang.String str3 = this.f435080b;
        java.lang.String str4 = this.f435081c;
        if (pd3.b.v(bVar, str3, str4)) {
            return;
        }
        bVar.w(str3, str4, i17, str);
    }

    @Override // jc3.x0
    public void d(int i17, long j17, long j18) {
    }
}
