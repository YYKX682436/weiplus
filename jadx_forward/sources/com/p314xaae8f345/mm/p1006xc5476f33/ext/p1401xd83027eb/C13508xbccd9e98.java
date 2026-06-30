package com.p314xaae8f345.mm.p1006xc5476f33.ext.p1401xd83027eb;

/* renamed from: com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl */
/* loaded from: classes11.dex */
public class C13508xbccd9e98 extends com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f181452z = 0;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String[] f181453o;

    /* renamed from: p, reason: collision with root package name */
    public final int f181454p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f181455q;

    /* renamed from: s, reason: collision with root package name */
    public long f181457s;

    /* renamed from: t, reason: collision with root package name */
    public long f181458t;

    /* renamed from: u, reason: collision with root package name */
    public long f181459u;

    /* renamed from: x, reason: collision with root package name */
    public boolean f181462x;

    /* renamed from: r, reason: collision with root package name */
    public int f181456r = 4;

    /* renamed from: v, reason: collision with root package name */
    public final v25.b f181460v = new v25.b();

    /* renamed from: w, reason: collision with root package name */
    public long f181461w = 0;

    /* renamed from: y, reason: collision with root package name */
    public final wb.d f181463y = new y62.e(this);

    public C13508xbccd9e98(java.lang.String[] strArr, int i17, android.content.Context context) {
        this.f181453o = null;
        this.f181454p = -1;
        this.f181453o = strArr;
        this.f181454p = i17;
        this.f181455q = context;
    }

    public boolean n(int i17, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getVoiceControlResult voiceId=%s, appId=%s", java.lang.Integer.valueOf(i17), str);
        if (this.f181458t == 0) {
            this.f181458t = java.lang.System.currentTimeMillis();
        }
        this.f181459u = java.lang.System.currentTimeMillis();
        r45.ea eaVar = new r45.ea();
        eaVar.f454716d = gVar;
        c01.d9.e().g(new y62.g(2, i17, str, 1, null, eaVar, this.f181458t));
        return true;
    }

    public final void o(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(str, true);
        v25.b bVar = this.f181460v;
        if (n17 == null || !n17.r2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] username is not contact, countDown");
            this.f181456r = 3505;
            bVar.a();
        } else {
            y62.f fVar = new y62.f(this, str);
            if (fp.h.c(11)) {
                fVar.a();
            }
            this.f181456r = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] jump to chattingUI : %s, countDown", str);
            bVar.a();
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        boolean z17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] onSceneEnd errType=%s, errCode=%s, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        v25.b bVar = this.f181460v;
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene null, countDown");
            this.f181456r = 3506;
            bVar.a();
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] errType、errCode not ok, countDown");
            this.f181456r = 3507;
            bVar.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene.getType()=%s", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        if (m1Var.mo808xfb85f7b0() == 985) {
            if (this.f181462x) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] localVoiceControlSucess, no need to process");
                return;
            }
            y62.g gVar = (y62.g) m1Var;
            com.p314xaae8f345.mm.p944x882e457a.o oVar = gVar.f541171e;
            r45.ga gaVar = (oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.ga) fVar;
            if (gaVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp null, countDown");
                this.f181456r = 3508;
                bVar.a();
                return;
            }
            gVar.f541175i = gaVar.f456565f;
            java.lang.Object[] objArr = new java.lang.Object[2];
            int i19 = gVar.f541172f;
            objArr[0] = java.lang.Integer.valueOf(i19);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = gaVar.f456565f;
            objArr[1] = gVar2 == null ? "null" : new java.lang.String(gVar2.f273689a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] opCode=%s, resp.Cookies=%s", objArr);
            if (i19 == 1) {
                if (gaVar.f456566g == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp.UploadCtx is null");
                    this.f181456r = 3508;
                    bVar.a();
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadMode resp: Interval=%s, Timeout=%s, StartPos=%s, DataLen=%s", java.lang.Integer.valueOf(gaVar.f456563d), java.lang.Integer.valueOf(gaVar.f456564e), java.lang.Integer.valueOf(gaVar.f456566g.f460800e), java.lang.Integer.valueOf(gaVar.f456566g.f460801f));
                int i27 = gaVar.f456566g.f460800e;
                int i28 = gVar.f541177n;
                if (i27 >= i28) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new y62.b(this, gVar, gaVar), gaVar.f456563d);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] continue upload voice");
                r45.la laVar = gaVar.f456566g;
                int i29 = laVar.f460800e;
                if (i29 != 0 && i29 == gVar.f541176m) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] avoid duplicate doscene");
                    return;
                }
                gVar.f541176m = i29;
                int i37 = laVar.f460801f;
                if (i29 + i37 < i28) {
                    if (p(gVar, i29, i37)) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail1, countDown");
                    this.f181456r = 3510;
                    bVar.a();
                    return;
                }
                if (p(gVar, i29, i28 - i29)) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue fail2, countDown");
                this.f181456r = 3510;
                bVar.a();
                return;
            }
            if (i19 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "");
                long currentTimeMillis = java.lang.System.currentTimeMillis() - gVar.f541183t;
                if (currentTimeMillis > gVar.f541182s) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] isGetResultTimeOut %s, %s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(gVar.f541182s));
                    z17 = true;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.NetSceneAppVoiceControl", "[voiceControl] time %s, %s", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(gVar.f541182s));
                    z17 = false;
                }
                if (z17) {
                    this.f181456r = 3509;
                    bVar.a();
                    return;
                }
                r45.ha haVar = gaVar.f456567h;
                if (haVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] getResultMode resp VoiceId=%s, RecognizeRet=%s", java.lang.Integer.valueOf(haVar.f457504d), java.lang.Integer.valueOf(gaVar.f456567h.f457506f));
                }
                r45.ha haVar2 = gaVar.f456567h;
                if (haVar2 == null || haVar2.f457506f != 0) {
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f181459u;
                    int i38 = gaVar.f456563d;
                    if (currentTimeMillis2 >= i38) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new y62.c(this, gVar));
                        return;
                    }
                    long currentTimeMillis3 = i38 - (java.lang.System.currentTimeMillis() - this.f181459u);
                    int i39 = gaVar.f456563d;
                    if (currentTimeMillis3 > i39) {
                        currentTimeMillis3 = i39;
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new y62.d(this, gVar), currentTimeMillis3);
                    return;
                }
                r45.ia iaVar = haVar2.f457507g;
                if (iaVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo null, countDown");
                    this.f181456r = 3511;
                    bVar.a();
                    return;
                }
                java.util.LinkedList linkedList = iaVar.f458398d;
                if (linkedList == null || linkedList.size() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] SearchContactResultInfo.Items null, countDown");
                    this.f181456r = 3511;
                    bVar.a();
                    return;
                }
                if (gaVar.f456567h.f457507g.f458398d.size() == 0) {
                    this.f181456r = 3511;
                    bVar.a();
                    return;
                }
                if (gaVar.f456567h.f457507g.f458398d.size() == 1) {
                    o(((r45.ja) gaVar.f456567h.f457507g.f458398d.get(0)).f459209d);
                    return;
                }
                int size = gaVar.f456567h.f457507g.f458398d.size();
                java.lang.String[] strArr = new java.lang.String[size];
                for (int i47 = 0; i47 < size; i47++) {
                    java.lang.String str2 = ((r45.ja) gaVar.f456567h.f457507g.f458398d.get(i47)).f459209d;
                    strArr[i47] = str2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] resp result item: %s", str2);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("VoiceSearchResultUI_Resultlist", strArr);
                intent.putExtra("VoiceSearchResultUI_VoiceId", gVar.f541174h);
                intent.putExtra("VoiceSearchResultUI_IsVoiceControl", true);
                intent.setFlags(67108864);
                intent.putExtra("VoiceSearchResultUI_ShowType", 1);
                j45.l.u(this.f181455q, ".ui.voicesearch.VoiceSearchResultUI", intent, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] scene end countDown");
                this.f181456r = 1;
                bVar.a();
            }
        }
    }

    public boolean p(y62.g gVar, int i17, int i18) {
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue netscene null");
            return false;
        }
        r45.ka kaVar = gVar.f541180q;
        if (kaVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue uploadCmd null");
            return false;
        }
        if (kaVar.f460057e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue UploadCtx null");
            return false;
        }
        new r45.ka();
        r45.la laVar = kaVar.f460057e;
        laVar.f460800e = i17;
        laVar.f460801f = i18;
        java.lang.String str = gVar.f541179p;
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, i17, i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] uploadVoiceContinue %s, startPos=%s, dataLen=%s", java.lang.Integer.valueOf(gVar.f541174h), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (N == null || N.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] buf empty, %s", str);
            return false;
        }
        kaVar.f460058f = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(N);
        y62.g gVar2 = new y62.g(1, gVar.f541174h, gVar.f541173g, 1, gVar.f541177n, gVar.f541179p, kaVar, null);
        gVar2.f541176m = gVar.f541176m;
        c01.d9.e().g(gVar2);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.ext.p1400xc52405f1.C13499x920707ba, android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i17 = this.f181454p;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] query(), ApiId=%s", java.lang.Integer.valueOf(i17));
        this.f181457s = 0L;
        this.f181458t = 0L;
        e(uri, this.f181455q, i17, this.f181453o);
        if (uri == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "uri == null");
            l(3, 5);
            return v25.a.a(5);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f181408g)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "AppID == null");
            l(3, 7);
            return v25.a.a(7);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "PkgName == null");
            l(3, 6);
            return v25.a.a(6);
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - java.lang.System.currentTimeMillis();
        int h17 = h();
        if (h17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "invalid appid ! return code = " + h17);
            l(2, h17);
            return v25.a.a(h17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] getAppIdAndPkg = %s, checkIsLogin = %s", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Long.valueOf(currentTimeMillis3));
        if (i17 != 29) {
            l(3, 15);
            return v25.a.a(15);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "voiceControl");
        if (strArr2 == null || strArr2.length < 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
            l(3, 3501);
            this.f181456r = 3501;
            return v25.a.a(3501);
        }
        java.lang.String str3 = strArr2[0];
        java.lang.String str4 = strArr2[1];
        java.lang.String str5 = strArr2[2];
        java.lang.String str6 = strArr2[3];
        java.lang.String str7 = strArr2[4];
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] args: %s, %s, %s, %s %s", str3, str4, str5, str6, str7);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
            l(3, 3502);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] wrong args");
            return v25.a.a(3502);
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(str7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] speex file not exist");
            l(3, 3503);
            return v25.a.a(3503);
        }
        this.f181457s = java.lang.System.currentTimeMillis();
        c01.d9.e().a(985, this);
        this.f181460v.b(13000L, new y62.a(this, str3, str7, str4, str5, str6));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[extApiCost][voiceControl] finish uploadVoice = %s, getResult = %s", java.lang.Long.valueOf(this.f181458t - this.f181457s), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f181458t));
        c01.d9.e().q(985, this);
        j(10, 0, 1);
        if (1 != this.f181456r) {
            j(11, 4, 1);
        } else {
            j(10, 0, 1);
        }
        k(0);
        return v25.a.a(this.f181456r);
    }
}
