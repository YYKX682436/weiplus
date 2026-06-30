package com.tencent.mm.plugin.ext.voicecontrol;

/* loaded from: classes11.dex */
public class ExtControlProviderVoiceControl extends com.tencent.mm.plugin.ext.provider.ExtContentProviderBase implements com.tencent.mm.modelbase.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f99919z = 0;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String[] f99920o;

    /* renamed from: p, reason: collision with root package name */
    public final int f99921p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f99922q;

    /* renamed from: s, reason: collision with root package name */
    public long f99924s;

    /* renamed from: t, reason: collision with root package name */
    public long f99925t;

    /* renamed from: u, reason: collision with root package name */
    public long f99926u;

    /* renamed from: x, reason: collision with root package name */
    public boolean f99929x;

    /* renamed from: r, reason: collision with root package name */
    public int f99923r = 4;

    /* renamed from: v, reason: collision with root package name */
    public final v25.b f99927v = new v25.b();

    /* renamed from: w, reason: collision with root package name */
    public long f99928w = 0;

    /* renamed from: y, reason: collision with root package name */
    public final wb.d f99930y = new y62.e(this);

    public ExtControlProviderVoiceControl(java.lang.String[] strArr, int i17, android.content.Context context) {
        this.f99920o = null;
        this.f99921p = -1;
        this.f99920o = strArr;
        this.f99921p = i17;
        this.f99922q = context;
    }

    public boolean n(int i17, java.lang.String str, com.tencent.mm.protobuf.g gVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getVoiceControlResult voiceId=%s, appId=%s", java.lang.Integer.valueOf(i17), str);
        if (this.f99925t == 0) {
            this.f99925t = java.lang.System.currentTimeMillis();
        }
        this.f99926u = java.lang.System.currentTimeMillis();
        r45.ea eaVar = new r45.ea();
        eaVar.f373183d = gVar;
        c01.d9.e().g(new y62.g(2, i17, str, 1, null, eaVar, this.f99925t));
        return true;
    }

    public final void o(java.lang.String str) {
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        v25.b bVar = this.f99927v;
        if (n17 == null || !n17.r2()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] username is not contact, countDown");
            this.f99923r = 3505;
            bVar.a();
        } else {
            y62.f fVar = new y62.f(this, str);
            if (fp.h.c(11)) {
                fVar.a();
            }
            this.f99923r = 1;
            com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] jump to chattingUI : %s, countDown", str);
            bVar.a();
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] onSceneEnd errType=%s, errCode=%s, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        v25.b bVar = this.f99927v;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene null, countDown");
            this.f99923r = 3506;
            bVar.a();
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] errType、errCode not ok, countDown");
            this.f99923r = 3507;
            bVar.a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene.getType()=%s", java.lang.Integer.valueOf(m1Var.getType()));
        if (m1Var.getType() == 985) {
            if (this.f99929x) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] localVoiceControlSucess, no need to process");
                return;
            }
            y62.g gVar = (y62.g) m1Var;
            com.tencent.mm.modelbase.o oVar = gVar.f459638e;
            r45.ga gaVar = (oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.ga) fVar;
            if (gaVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp null, countDown");
                this.f99923r = 3508;
                bVar.a();
                return;
            }
            gVar.f459642i = gaVar.f375032f;
            java.lang.Object[] objArr = new java.lang.Object[2];
            int i19 = gVar.f459639f;
            objArr[0] = java.lang.Integer.valueOf(i19);
            com.tencent.mm.protobuf.g gVar2 = gaVar.f375032f;
            objArr[1] = gVar2 == null ? "null" : new java.lang.String(gVar2.f192156a);
            com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] opCode=%s, resp.Cookies=%s", objArr);
            if (i19 == 1) {
                if (gaVar.f375033g == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp.UploadCtx is null");
                    this.f99923r = 3508;
                    bVar.a();
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadMode resp: Interval=%s, Timeout=%s, StartPos=%s, DataLen=%s", java.lang.Integer.valueOf(gaVar.f375030d), java.lang.Integer.valueOf(gaVar.f375031e), java.lang.Integer.valueOf(gaVar.f375033g.f379267e), java.lang.Integer.valueOf(gaVar.f375033g.f379268f));
                int i27 = gaVar.f375033g.f379267e;
                int i28 = gVar.f459644n;
                if (i27 >= i28) {
                    com.tencent.mm.sdk.platformtools.u3.i(new y62.b(this, gVar, gaVar), gaVar.f375030d);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] continue upload voice");
                r45.la laVar = gaVar.f375033g;
                int i29 = laVar.f379267e;
                if (i29 != 0 && i29 == gVar.f459643m) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] avoid duplicate doscene");
                    return;
                }
                gVar.f459643m = i29;
                int i37 = laVar.f379268f;
                if (i29 + i37 < i28) {
                    if (p(gVar, i29, i37)) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail1, countDown");
                    this.f99923r = 3510;
                    bVar.a();
                    return;
                }
                if (p(gVar, i29, i28 - i29)) {
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail2, countDown");
                this.f99923r = 3510;
                bVar.a();
                return;
            }
            if (i19 == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "");
                long currentTimeMillis = java.lang.System.currentTimeMillis() - gVar.f459650t;
                if (currentTimeMillis > gVar.f459649s) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] isGetResultTimeOut %s, %s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(gVar.f459649s));
                    z17 = true;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] time %s, %s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(gVar.f459649s));
                    z17 = false;
                }
                if (z17) {
                    this.f99923r = 3509;
                    bVar.a();
                    return;
                }
                r45.ha haVar = gaVar.f375034h;
                if (haVar != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode resp VoiceId=%s, RecognizeRet=%s", java.lang.Integer.valueOf(haVar.f375971d), java.lang.Integer.valueOf(gaVar.f375034h.f375973f));
                }
                r45.ha haVar2 = gaVar.f375034h;
                if (haVar2 == null || haVar2.f375973f != 0) {
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f99926u;
                    int i38 = gaVar.f375030d;
                    if (currentTimeMillis2 >= i38) {
                        com.tencent.mm.sdk.platformtools.u3.h(new y62.c(this, gVar));
                        return;
                    }
                    long currentTimeMillis3 = i38 - (java.lang.System.currentTimeMillis() - this.f99926u);
                    int i39 = gaVar.f375030d;
                    if (currentTimeMillis3 > i39) {
                        currentTimeMillis3 = i39;
                    }
                    com.tencent.mm.sdk.platformtools.u3.i(new y62.d(this, gVar), currentTimeMillis3);
                    return;
                }
                r45.ia iaVar = haVar2.f375974g;
                if (iaVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo null, countDown");
                    this.f99923r = 3511;
                    bVar.a();
                    return;
                }
                java.util.LinkedList linkedList = iaVar.f376865d;
                if (linkedList == null || linkedList.size() <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo.Items null, countDown");
                    this.f99923r = 3511;
                    bVar.a();
                    return;
                }
                if (gaVar.f375034h.f375974g.f376865d.size() == 0) {
                    this.f99923r = 3511;
                    bVar.a();
                    return;
                }
                if (gaVar.f375034h.f375974g.f376865d.size() == 1) {
                    o(((r45.ja) gaVar.f375034h.f375974g.f376865d.get(0)).f377676d);
                    return;
                }
                int size = gaVar.f375034h.f375974g.f376865d.size();
                java.lang.String[] strArr = new java.lang.String[size];
                for (int i47 = 0; i47 < size; i47++) {
                    java.lang.String str2 = ((r45.ja) gaVar.f375034h.f375974g.f376865d.get(i47)).f377676d;
                    strArr[i47] = str2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp result item: %s", str2);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("VoiceSearchResultUI_Resultlist", strArr);
                intent.putExtra("VoiceSearchResultUI_VoiceId", gVar.f459641h);
                intent.putExtra("VoiceSearchResultUI_IsVoiceControl", true);
                intent.setFlags(67108864);
                intent.putExtra("VoiceSearchResultUI_ShowType", 1);
                j45.l.u(this.f99922q, ".ui.voicesearch.VoiceSearchResultUI", intent, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene end countDown");
                this.f99923r = 1;
                bVar.a();
            }
        }
    }

    public boolean p(y62.g gVar, int i17, int i18) {
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue netscene null");
            return false;
        }
        r45.ka kaVar = gVar.f459647q;
        if (kaVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue uploadCmd null");
            return false;
        }
        if (kaVar.f378524e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue UploadCtx null");
            return false;
        }
        new r45.ka();
        r45.la laVar = kaVar.f378524e;
        laVar.f379267e = i17;
        laVar.f379268f = i18;
        java.lang.String str = gVar.f459646p;
        byte[] N = com.tencent.mm.vfs.w6.N(str, i17, i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue %s, startPos=%s, dataLen=%s", java.lang.Integer.valueOf(gVar.f459641h), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (N == null || N.length <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] buf empty, %s", str);
            return false;
        }
        kaVar.f378525f = com.tencent.mm.protobuf.g.b(N);
        y62.g gVar2 = new y62.g(1, gVar.f459641h, gVar.f459640g, 1, gVar.f459644n, gVar.f459646p, kaVar, null);
        gVar2.f459643m = gVar.f459643m;
        c01.d9.e().g(gVar2);
        return true;
    }

    @Override // com.tencent.mm.plugin.ext.provider.ExtContentProviderBase, android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i17 = this.f99921p;
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] query(), ApiId=%s", java.lang.Integer.valueOf(i17));
        this.f99924s = 0L;
        this.f99925t = 0L;
        e(uri, this.f99922q, i17, this.f99920o);
        if (uri == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "uri == null");
            l(3, 5);
            return v25.a.a(5);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99875g)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "AppID == null");
            l(3, 7);
            return v25.a.a(7);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(d())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "PkgName == null");
            l(3, 6);
            return v25.a.a(6);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis();
        int h17 = h();
        if (h17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "invalid appid ! return code = " + h17);
            l(2, h17);
            return v25.a.a(h17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] getAppIdAndPkg = %s, checkIsLogin = %s", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(currentTimeMillis3));
        if (i17 != 29) {
            l(3, 15);
            return v25.a.a(15);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "voiceControl");
        if (strArr2 == null || strArr2.length < 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
            l(3, 3501);
            this.f99923r = 3501;
            return v25.a.a(3501);
        }
        java.lang.String str3 = strArr2[0];
        java.lang.String str4 = strArr2[1];
        java.lang.String str5 = strArr2[2];
        java.lang.String str6 = strArr2[3];
        java.lang.String str7 = strArr2[4];
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] args: %s, %s, %s, %s %s", str3, str4, str5, str6, str7);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3) || com.tencent.mm.sdk.platformtools.t8.K0(str4) || com.tencent.mm.sdk.platformtools.t8.K0(str5) || com.tencent.mm.sdk.platformtools.t8.K0(str6) || com.tencent.mm.sdk.platformtools.t8.K0(str7)) {
            l(3, 3502);
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
            return v25.a.a(3502);
        }
        if (!com.tencent.mm.vfs.w6.j(str7)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] speex file not exist");
            l(3, 3503);
            return v25.a.a(3503);
        }
        this.f99924s = java.lang.System.currentTimeMillis();
        c01.d9.e().a(985, this);
        this.f99927v.b(13000L, new y62.a(this, str3, str7, str4, str5, str6));
        com.tencent.mars.xlog.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] finish uploadVoice = %s, getResult = %s", java.lang.Long.valueOf(this.f99925t - this.f99924s), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f99925t));
        c01.d9.e().q(985, this);
        j(10, 0, 1);
        if (1 != this.f99923r) {
            j(11, 4, 1);
        } else {
            j(10, 0, 1);
        }
        k(0);
        return v25.a.a(this.f99923r);
    }
}
