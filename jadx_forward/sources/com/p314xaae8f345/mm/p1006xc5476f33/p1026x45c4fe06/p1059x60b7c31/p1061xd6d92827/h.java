package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes7.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o f160281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f160283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160285h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f160286i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, int i17) {
        super(1);
        this.f160281d = oVar;
        this.f160282e = lVar;
        this.f160283f = jSONObject;
        this.f160284g = str;
        this.f160285h = str2;
        this.f160286i = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Class cls;
        java.lang.Object m143895xf1229813;
        java.lang.String a17;
        java.lang.String implSource = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(implSource, "implSource");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] originImpl impl:" + implSource + ", strategy:" + this.f160281d.E());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o oVar = this.f160281d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160282e;
        org.json.JSONObject jSONObject = this.f160283f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.g(implSource, this.f160284g, this.f160285h, lVar, this.f160286i, oVar, jSONObject);
        oVar.getClass();
        java.lang.String optString = jSONObject.optString("envVersion");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b bVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.RELEASE;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(optString, bVar).f163727d;
        s40.r0 r0Var = (s40.r0) i95.n0.c(s40.r0.class);
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        boolean Ai = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.m1) r0Var).Ai(jSONObject, i17, mo48798x74292566);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (Ai) {
            gVar.mo147xb9724478(java.lang.Boolean.TRUE, "", java.lang.Boolean.FALSE);
            return f0Var;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("mode"), "halfPage");
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = jSONObject.optString("appId");
        b1Var.f398545a = jSONObject.optString("userName");
        b1Var.f398555f = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        b1Var.f398565k = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String mo48798x742925662 = lVar.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x742925662, "getAppId(...)");
        java.lang.String appId = b1Var.f398547b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
        java.lang.String optString2 = jSONObject.optString("sceneNote");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo48798x742925662, "MagicAdMiniProgram")) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(appId);
            sb6.append(':');
            java.lang.String[] strArr = new java.lang.String[5];
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                a17 = gm0.j1.b().j();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            } else {
                a17 = kk.v.a(gm0.m.i());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            }
            java.lang.String str2 = a17;
            str = "[MBAd] keepAlive check: bizName=";
            strArr[0] = "hash=".concat(str2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ts=");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            cls = s40.r0.class;
            sb7.append(java.lang.System.currentTimeMillis());
            strArr[1] = sb7.toString();
            strArr[2] = "host=";
            strArr[3] = "version=" + o45.wf.f424562g;
            strArr[4] = "device=2";
            sb6.append(u46.l.k(strArr, "&"));
            sb6.append("::");
            sb6.append(optString2);
            optString2 = sb6.toString();
        } else {
            str = "[MBAd] keepAlive check: bizName=";
            cls = s40.r0.class;
        }
        b1Var.f398567l = optString2;
        b1Var.f398549c = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.b.a(jSONObject.optString("envVersion"), bVar).f163727d;
        b1Var.f398568m = jSONObject.optInt("preScene", 0);
        b1Var.f398569n = jSONObject.optString("preSceneNote");
        b1Var.f398562i0 = jSONObject.optString("adInfo");
        if (jSONObject.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099) || jSONObject.has("privateExtraData")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
            c11812xa040dc98.f158856e = lVar.mo48798x74292566();
            c11812xa040dc98.f158857f = jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, "{}");
            c11812xa040dc98.f158858g = jSONObject.optString("privateExtraData", "{}");
            c11812xa040dc98.f158855d = 1;
            b1Var.f398574s = c11812xa040dc98;
        }
        if (jSONObject.has("devuin")) {
            b1Var.f398553e = kk.v.b(jSONObject.optString("devuin"));
        }
        if (jSONObject.has("adUxInfo")) {
            android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
            persistableBundle.putString("adUxInfo", jSONObject.optString("adUxInfo"));
            b1Var.f398563j = persistableBundle;
        }
        if (b17) {
            b1Var.G = oVar.C(jSONObject);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "launch: appId:" + b1Var.f398547b + ", enterPath: " + b1Var.f398555f + ", scene: " + b1Var.f398565k + ", sceneNote:" + b1Var.f398567l + ", version: " + b1Var.f398551d + ", prescene: " + b1Var.f398568m + ", presceneNote:" + b1Var.f398569n + ", halfScreenConfig: " + b1Var.G);
        android.content.Context f229340d = lVar.getF229340d();
        if (f229340d.getResources().getConfiguration().orientation != 1 && !b17) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.m1) ((s40.r0) i95.n0.c(cls))).wi();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.k kVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.k(f229340d, b1Var, gVar);
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar.mo48798x74292566(), "MagicAdMiniProgram")) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(str);
                sb8.append(lVar.mo48798x74292566());
                sb8.append(", expt_enabled=");
                jz5.g gVar2 = oVar.f160302h;
                sb8.append(((java.lang.Boolean) ((jz5.n) gVar2).mo141623x754a37bb()).booleanValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", sb8.toString());
                if (((java.lang.Boolean) ((jz5.n) gVar2).mo141623x754a37bb()).booleanValue()) {
                    ((com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.k) ((com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.i) i95.n0.c(com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.i.class))).wi(lVar, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.j(kVar));
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive skipped, reason=expt_disabled");
                    kVar.mo146xb9724478(java.lang.Boolean.FALSE);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive skipped, reason=not_magic_ad");
                kVar.mo146xb9724478(java.lang.Boolean.FALSE);
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 == null) {
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] keepAlive block exception, reason=exception: " + m143898xd4a2fc34);
        kVar.mo146xb9724478(java.lang.Boolean.FALSE);
        return f0Var;
    }
}
