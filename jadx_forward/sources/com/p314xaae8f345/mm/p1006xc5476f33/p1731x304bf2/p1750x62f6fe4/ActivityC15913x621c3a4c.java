package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI */
/* loaded from: classes8.dex */
public class ActivityC15913x621c3a4c extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: w, reason: collision with root package name */
    public static final java.lang.String f221616w = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_MONTH) + "haowan/";

    /* renamed from: e, reason: collision with root package name */
    public android.content.Context f221617e;

    /* renamed from: f, reason: collision with root package name */
    public int f221618f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f221619g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f221620h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f221621i;

    /* renamed from: m, reason: collision with root package name */
    public android.util.SparseArray f221622m;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f221624o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b f221625p;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2 f221623n = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f221626q = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f221627r = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f221628s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f221629t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f221630u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final ut3.d f221631v = new i53.d4(this);

    public final java.lang.String O6(java.lang.String str, java.lang.String str2) {
        m53.t1 t1Var;
        java.lang.String str3;
        java.lang.String str4;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e() != null) {
            t1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a.f36957xece5c2e4;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s();
            t1Var = null;
        }
        if (t1Var != null) {
            java.util.LinkedList linkedList = t1Var.f405602d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    m53.o3 o3Var = (m53.o3) it.next();
                    if (o3Var.f405471d == 2 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o3Var.f405473f)) {
                        str3 = o3Var.f405473f;
                        break;
                    }
                }
            }
        }
        str3 = "https://game.weixin.qq.com/cgi-bin/h5/static/appcenter/publish.html?ssid=5&scene=5";
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str3);
        stringBuffer.append("?video_info=");
        if (str2 == null) {
            cl0.g gVar = new cl0.g();
            try {
                gVar.h("videoUrl", str);
                gVar.h("thumbUrl", getIntent().getStringExtra("thumb_url"));
            } catch (cl0.f unused) {
            }
            str4 = gVar.toString();
        } else {
            try {
                str4 = new org.json.JSONArray(str2).getJSONObject(0).toString();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "json_err:%s", e17.getMessage());
                str4 = "";
            }
        }
        stringBuffer.append(java.net.URLEncoder.encode(str4));
        stringBuffer.append("&from=");
        stringBuffer.append(this.f221618f);
        stringBuffer.append("&appid=");
        stringBuffer.append(this.f221620h);
        stringBuffer.append("&game_info=");
        stringBuffer.append(getIntent().getStringExtra("game_info"));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "publish url:%s", stringBuffer.toString());
        return stringBuffer.toString();
    }

    public final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d P6() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d mj6;
        m53.q1 q1Var;
        int i17 = this.f221618f;
        if (i17 == 3 || i17 == 5) {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            mj6 = d11.s.fj().mj(1);
        } else {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            mj6 = d11.s.fj().mj(0);
        }
        m53.q1 q1Var2 = null;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e() != null) {
            q1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a.f36955xb27064ab;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s();
            q1Var = null;
        }
        if (q1Var != null) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.e() != null) {
                q1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.f220914a.f36955xb27064ab;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.i.s();
            }
            mj6.f152724d = (int) q1Var2.f405514e;
            mj6.f152725e = (int) q1Var2.f405515f;
            mj6.f152727g = (int) q1Var2.f405513d;
            mj6.f152731n = (int) q1Var2.f405516g;
            mj6.f152728h = (int) q1Var2.f405517h;
        }
        return mj6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0090, code lost:
    
        if (r3.f243918d >= r3.f243917c) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x009b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0099, code lost:
    
        if (r3.f243917c >= r3.f243918d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6() {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15913x621c3a4c.Q6():void");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        int i27 = i18;
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 == 121) {
            if (i27 == -1) {
                if (intent != null && (this.f221618f == 3 || this.f221629t)) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new i53.e4(this, null, intent.getStringExtra("key_video_info")), 0L);
                    setResult(-1);
                    return;
                }
            } else if (i27 == 0 || i27 == 3000 || i27 == 3001) {
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(this, 87, 8763, 1, 2, this.f221630u, lj0.a.a(this.f221618f, null));
            } else if (i27 == 888) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "video edit in background");
                java.lang.String b17 = j53.d.b(intent.getStringExtra("key_thumb_path"), this.f221621i);
                java.lang.String stringExtra = intent.getStringExtra("key_bg_mix_task_id");
                int V1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V1(intent.getIntExtra("key_video_duration", 0));
                com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar = this.f221625p;
                int i28 = bVar.f243917c;
                int i29 = bVar.f243918d;
                int i37 = bVar.f243928n;
                if (i37 == 90 || i37 == 270) {
                    i19 = i29;
                    i29 = i28;
                } else {
                    i19 = i28;
                }
                java.lang.String i38 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.i("weixin://bgmixid/" + stringExtra, b17, V1, i29, i19, 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "videoInfo:%s", i38);
                intent.putExtra("key_video_info", i38);
                if (this.f221618f == 3 || this.f221629t) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new i53.e4(this, null, intent.getStringExtra("key_video_info")), 0L);
                    return;
                }
                i27 = -1;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video check error: [%d]", java.lang.Integer.valueOf(i18));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("failid", java.lang.Integer.valueOf(i18));
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(this.f221617e, 87, 8763, 2, 56, this.f221630u, lj0.a.a(this.f221618f, hashMap));
                db5.t7.m123882x26a183b(this.f221617e, com.p314xaae8f345.mm.R.C30867xcad56011.f573767fq3, 1).show();
                if (this.f221618f == 3) {
                    setResult(i27, intent);
                    finish();
                    ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(this.f221619g, "Invalid video format", this.f221620h, -3, "Invalid video format");
                    return;
                }
            }
        }
        setResult(i27, intent);
        finish();
        if (this.f221618f == 3) {
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(this.f221619g, "", this.f221620h, 0, "");
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String i17;
        super.onCreate(bundle);
        this.f221617e = this;
        this.f221618f = getIntent().getIntExtra("from", -1);
        this.f221619g = getIntent().getStringExtra("business_type");
        this.f221620h = getIntent().getStringExtra("appid");
        this.f221621i = getIntent().getStringExtra("video_path");
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("ext_data");
        if (bundleExtra != null) {
            this.f221629t = bundleExtra.getBoolean("game_straight_to_publish", false);
        }
        this.f221630u = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        boolean equals = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GAME_VIDEO_IS_BG_MIX_STRING, "1").equals("1");
        boolean z17 = ((kj0.i) ((kj0.l) i95.n0.c(kj0.l.class))).wi(e42.d0.clicfg_game_video_open_bg_mix, 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "video bg mix, debugOpen:%b, xLabOpen:%b", java.lang.Boolean.valueOf(equals), java.lang.Boolean.valueOf(z17));
        if (equals && z17) {
            this.f221628s = true;
        } else {
            this.f221628s = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "video_path:%s", this.f221621i);
        com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o oVar = (com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.o.class);
        java.lang.String str = this.f221621i;
        ((be0.e) oVar).getClass();
        this.f221625p = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(str, true);
        if (getIntent().getBooleanExtra("need_edit", false)) {
            if (this.f221625p == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video is error");
                finish();
            } else {
                Q6();
            }
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f221621i)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new i53.e4(this, getIntent().getStringExtra("video_url"), null), 0L);
        } else if (this.f221625p == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video is error");
            finish();
        } else {
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d P6 = P6();
            if (com.p314xaae8f345.mm.vfs.w6.k(this.f221621i) > com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26666xd71a0a76.f56078x428b3be8 || P6.f152728h < this.f221625p.a()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "videoLength(%d) > %d or videoDuration(%d) > paramDuration(%d), needEdit is invalid", java.lang.Long.valueOf(com.p314xaae8f345.mm.vfs.w6.k(this.f221621i)), 104857600, java.lang.Integer.valueOf(this.f221625p.a()), java.lang.Integer.valueOf(P6.f152728h));
                Q6();
            } else {
                java.lang.String str2 = f221616w + "vsg_output_" + java.lang.System.currentTimeMillis() + ".mp4";
                java.lang.String str3 = this.f221621i;
                if (!str3.equals(str2)) {
                    com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(str2));
                    com.p314xaae8f345.mm.vfs.w6.c(str3, str2);
                }
                this.f221621i = str2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.C19287x4a9b6f36 c17 = j53.d.c(str2);
                if (c17 == null) {
                    i17 = null;
                } else {
                    java.lang.String b17 = j53.d.b(null, str2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.AbstractC19284xdca64a7 b18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l4.f264535b.b(b17);
                    if (b18 != null) {
                        c17.f264270f = b18.f264271g;
                    }
                    c17.f264283v.putInt("mark_edit_flag", 0);
                    i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.o5.i(c17.f264269e, b17, c17.f264287w, c17.f264278q, c17.f264277p, c17.f264276o);
                }
                if (i17 == null) {
                    finish();
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new i53.e4(this, null, i17), 0L);
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "onCreate");
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
