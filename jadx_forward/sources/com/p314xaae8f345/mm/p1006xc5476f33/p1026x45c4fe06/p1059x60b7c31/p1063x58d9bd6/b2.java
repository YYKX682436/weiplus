package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public class b2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160681d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160682e;

    /* renamed from: f, reason: collision with root package name */
    public final int f160683f;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 f160690p;

    /* renamed from: r, reason: collision with root package name */
    public double f160692r;

    /* renamed from: s, reason: collision with root package name */
    public double f160693s;

    /* renamed from: t, reason: collision with root package name */
    public long f160694t;

    /* renamed from: u, reason: collision with root package name */
    public long f160695u;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f160699y;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f160684g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f160685h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160686i = "";

    /* renamed from: m, reason: collision with root package name */
    public int f160687m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160688n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160689o = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f160691q = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f160696v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f160697w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f160698x = false;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f160681d = k0Var;
        this.f160682e = lVar;
        this.f160683f = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.u
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetAudioState", "SetAudioTask runTask");
        this.f160698x = false;
        this.f160699y = "";
        n01.b c17 = n01.c.c(this.f160685h);
        n01.b bVar = new n01.b();
        bVar.f415369a = this.f160685h;
        java.lang.String str = this.f160686i;
        bVar.f415370b = str;
        int i17 = this.f160687m;
        bVar.f415372d = i17;
        bVar.f415373e = i17;
        bVar.f415375g = this.f160688n;
        bVar.f415376h = this.f160689o;
        bVar.f415379k = this.f160691q;
        bVar.f415380l = this.f160692r;
        bVar.f415382n = this.f160684g;
        bVar.f415377i = 0;
        bVar.f415381m = this.f160693s;
        bVar.f415386r = this.f160694t;
        bVar.f415387s = this.f160695u;
        bVar.f415390v = this.f160696v;
        bVar.f415391w = this.f160697w;
        if (c17 != null && str.equalsIgnoreCase(c17.f415370b)) {
            java.lang.String str2 = this.f160685h;
            am.f0 f0Var = new am.f0();
            am.d0 d0Var = f0Var.f88154a;
            d0Var.f87946a = 7;
            d0Var.f87947b = str2;
            dl3.c.a(f0Var);
            if (f0Var.f88155b.f88045a) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetAudioState", "same src is playing audio, not to start again, but setAudioParam to update");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerHelper", "setAudioParam, audioId:%s, src:%s", bVar.f415369a, bVar.f415370b);
                am.f0 f0Var2 = new am.f0();
                am.d0 d0Var2 = f0Var2.f88154a;
                d0Var2.f87946a = 18;
                d0Var2.f87947b = bVar.f415369a;
                d0Var2.f87950e = bVar;
                dl3.c.a(f0Var2);
                if (!f0Var2.f88155b.f88045a) {
                    this.f160698x = true;
                    this.f160699y = "not to set audio param, the audioId is err";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiSetAudioState", "not to set audio param, the audioId is err");
                }
                b();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetAudioState", "appId:%s, audioId:%s, src:%s, startTime:%d", this.f160684g, this.f160685h, this.f160686i, java.lang.Integer.valueOf(this.f160687m));
        if (this.f160686i.startsWith("file://")) {
            java.lang.String substring = this.f160686i.substring(7);
            bVar.f415371c = substring;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetAudioState", "filePath:%s", substring);
        } else if (this.f160686i.contains("base64") && this.f160686i.startsWith("data:audio")) {
            java.lang.String str3 = this.f160686i;
            java.lang.String b17 = jh1.d.b(str3.substring(str3.indexOf("base64,") + 7).trim());
            bVar.f415371c = b17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetAudioState", "base64 decode filePath:%s", b17);
        } else if (this.f160686i.startsWith("wxblob://")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d dVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d.INSTANCE;
            if (!dVar.f160707e.containsKey(this.f160684g)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160682e;
                java.lang.String str4 = this.f160684g;
                n01.e eVar = dl3.i.s().V;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioInstanceContext", "registerIBufferURLManager");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.d1 H = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v) lVar.getF229341e().h0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.v.class)).H();
                if (H != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c(dVar, eVar);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.a) H;
                    synchronized (aVar.f165496a) {
                        aVar.f165496a.add(cVar);
                    }
                    dVar.f160707e.put(str4, cVar);
                }
            }
            ik1.b0 b0Var = new ik1.b0();
            if (this.f160682e.mo50354x59eafec1().mo49307xcc440832(this.f160686i, b0Var) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                bVar.B = (java.nio.ByteBuffer) b0Var.f373357a;
                bVar.f415371c = this.f160686i;
                n01.e eVar2 = dl3.i.s().V;
                java.lang.String str5 = this.f160686i;
                dl3.j jVar = (dl3.j) eVar2;
                synchronized (jVar.f316867a.U) {
                    if (!((java.util.HashSet) jVar.f316867a.f316855o).contains(str5)) {
                        ((java.util.HashSet) jVar.f316867a.f316855o).add(str5);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.JsApiSetAudioState", "wxblob read ok");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiSetAudioState", "wxblob read fail");
                com.p314xaae8f345.mm.vfs.r6 mo49621x2f1a0d80 = this.f160682e.mo50354x59eafec1().mo49621x2f1a0d80(this.f160686i);
                if (mo49621x2f1a0d80 == null || !mo49621x2f1a0d80.m()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiSetAudioState", "wxblob localFile is null");
                    this.f160698x = true;
                    this.f160699y = "wxblob localFile is null";
                } else {
                    bVar.f415371c = mo49621x2f1a0d80.o();
                }
            }
        } else if (!this.f160686i.startsWith("http://") && !this.f160686i.startsWith("https://")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11663x8e8dee46 c11663x8e8dee46 = this.f160690p;
            jh1.c cVar2 = c11663x8e8dee46 == null ? null : new jh1.c(c11663x8e8dee46.f156922e, c11663x8e8dee46.f156921d);
            if (cVar2 != null) {
                if (cVar2.f381334f != null) {
                    if (c17 == null || !this.f160686i.equalsIgnoreCase(c17.f415370b) || android.text.TextUtils.isEmpty(c17.f415371c)) {
                        bVar.f415371c = jh1.d.a(this.f160682e, this.f160686i);
                    } else {
                        bVar.f415371c = c17.f415371c;
                    }
                    bVar.f415393y = cVar2;
                }
            }
            s46.d.a(cVar2);
            this.f160698x = true;
            this.f160699y = "the file not exist for src";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiSetAudioState", "the wxa audioDataSource not found for src %s", this.f160686i);
            b();
            return;
        }
        if (!this.f160698x) {
            n01.c.g(bVar);
        }
        b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.a
    public void b() {
        super.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160682e;
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.JsApiSetAudioState", "server is null");
            return;
        }
        boolean z17 = this.f160698x;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160681d;
        int i17 = this.f160683f;
        if (!z17) {
            lVar.a(i17, k0Var.o("ok"));
            return;
        }
        lVar.a(i17, k0Var.o("fail:" + this.f160699y));
    }
}
