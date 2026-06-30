package bt3;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f24284d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f24285e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.d f24286f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24287g;

    /* renamed from: h, reason: collision with root package name */
    public bt3.h0 f24288h;

    public i0(com.tencent.mm.pluginsdk.model.app.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(dVar, str, str2, str3, str4, str5, false, null);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f24284d = u0Var;
        return dispatch(sVar, this.f24285e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 728;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd [%d, %d, %s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
            r45.uz uzVar = (r45.uz) oVar.f70711b.f70700a;
            java.lang.String str2 = uzVar.f387743d;
            com.tencent.mm.pluginsdk.model.app.d dVar = this.f24286f;
            dVar.field_signature = str2;
            dVar.field_fakeAeskey = uzVar.f387745f;
            dVar.field_fakeSignature = uzVar.f387746g;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig onGYNetEnd field_signature[%s], field_fakeAeskey[%s], field_fakeSignature[%s], update[%b]", com.tencent.mm.sdk.platformtools.t8.G1(dVar.field_signature), com.tencent.mm.sdk.platformtools.t8.G1(dVar.field_fakeAeskey), com.tencent.mm.sdk.platformtools.t8.G1(dVar.field_fakeSignature), java.lang.Boolean.valueOf(((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).update(dVar, new java.lang.String[0])));
            if (this.f24287g) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.lang.String str3 = dVar.field_signature;
                objArr[0] = java.lang.Integer.valueOf(str3 == null ? -1 : str3.length());
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckBigFileDownload", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", objArr);
                ((com.tencent.mm.pluginsdk.model.app.d3) ((ct.w2) i95.n0.c(ct.w2.class))).wi(false);
                dVar.field_status = 101;
                dVar.field_lastModifyTime = c01.id.e();
                ((com.tencent.mm.pluginsdk.model.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).update(dVar, new java.lang.String[0]);
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new bt3.l0(dVar.field_msgInfoId, dVar.field_msgInfoTalker, dVar.field_mediaId, null));
            }
            bt3.h0 h0Var = this.f24288h;
            if (h0Var != null) {
                r45.tz tzVar = (r45.tz) oVar.f70710a.f70684a;
                ((ez.b) h0Var).a(str, tzVar.f386875h, tzVar.f386874g, uzVar.f387743d, uzVar.f387745f, uzVar.f387746g, tzVar.f386873f);
                this.f24288h = null;
            }
        } else {
            bt3.h0 h0Var2 = this.f24288h;
            if (h0Var2 != null) {
                ((ez.b) h0Var2).a(str, "", "", "", "", "", 0L);
                this.f24288h = null;
            }
        }
        this.f24284d.onSceneEnd(i18, i19, str, this);
    }

    public i0(com.tencent.mm.pluginsdk.model.app.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, bt3.h0 h0Var) {
        this.f24287g = false;
        this.f24287g = z17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tz();
        lVar.f70665b = new r45.uz();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkbigfiledownload";
        lVar.f70667d = 728;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f24285e = a17;
        this.f24286f = dVar;
        if (h0Var != null) {
            this.f24288h = h0Var;
        }
        r45.tz tzVar = (r45.tz) a17.f70710a.f70684a;
        tzVar.f386874g = str;
        tzVar.f386873f = dVar.field_totalLen;
        tzVar.f386875h = str2;
        tzVar.f386878n = str3;
        tzVar.f386877m = str4;
        tzVar.f386871d = str5;
        tzVar.f386872e = (java.lang.String) gm0.j1.u().c().l(2, "");
        tzVar.f386876i = 7;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckBigFileDownload", "summerbig AESKey[%s] FileMd5[%s] FileName[%s] FileExt[%s] FileSize[%d] FileType[%d] autoDownload[%s] stack[%s]", com.tencent.mm.sdk.platformtools.t8.G1(tzVar.f386874g), tzVar.f386875h, tzVar.f386878n, tzVar.f386877m, java.lang.Long.valueOf(tzVar.f386873f), java.lang.Integer.valueOf(tzVar.f386876i), java.lang.Boolean.valueOf(z17), new com.tencent.mm.sdk.platformtools.z3());
    }
}
