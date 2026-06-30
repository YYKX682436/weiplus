package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class b2 extends com.tencent.mm.plugin.appbrand.jsapi.audio.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.k0 f79148d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f79149e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79150f;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info f79157p;

    /* renamed from: r, reason: collision with root package name */
    public double f79159r;

    /* renamed from: s, reason: collision with root package name */
    public double f79160s;

    /* renamed from: t, reason: collision with root package name */
    public long f79161t;

    /* renamed from: u, reason: collision with root package name */
    public long f79162u;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f79166y;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f79151g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f79152h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f79153i = "";

    /* renamed from: m, reason: collision with root package name */
    public int f79154m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f79155n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f79156o = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f79158q = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f79163v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f79164w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f79165x = false;

    public b2(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f79148d = k0Var;
        this.f79149e = lVar;
        this.f79150f = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.u
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetAudioState", "SetAudioTask runTask");
        this.f79165x = false;
        this.f79166y = "";
        n01.b c17 = n01.c.c(this.f79152h);
        n01.b bVar = new n01.b();
        bVar.f333836a = this.f79152h;
        java.lang.String str = this.f79153i;
        bVar.f333837b = str;
        int i17 = this.f79154m;
        bVar.f333839d = i17;
        bVar.f333840e = i17;
        bVar.f333842g = this.f79155n;
        bVar.f333843h = this.f79156o;
        bVar.f333846k = this.f79158q;
        bVar.f333847l = this.f79159r;
        bVar.f333849n = this.f79151g;
        bVar.f333844i = 0;
        bVar.f333848m = this.f79160s;
        bVar.f333853r = this.f79161t;
        bVar.f333854s = this.f79162u;
        bVar.f333857v = this.f79163v;
        bVar.f333858w = this.f79164w;
        if (c17 != null && str.equalsIgnoreCase(c17.f333837b)) {
            java.lang.String str2 = this.f79152h;
            am.f0 f0Var = new am.f0();
            am.d0 d0Var = f0Var.f6621a;
            d0Var.f6413a = 7;
            d0Var.f6414b = str2;
            dl3.c.a(f0Var);
            if (f0Var.f6622b.f6512a) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetAudioState", "same src is playing audio, not to start again, but setAudioParam to update");
                com.tencent.mars.xlog.Log.i("MicroMsg.AudioPlayerHelper", "setAudioParam, audioId:%s, src:%s", bVar.f333836a, bVar.f333837b);
                am.f0 f0Var2 = new am.f0();
                am.d0 d0Var2 = f0Var2.f6621a;
                d0Var2.f6413a = 18;
                d0Var2.f6414b = bVar.f333836a;
                d0Var2.f6417e = bVar;
                dl3.c.a(f0Var2);
                if (!f0Var2.f6622b.f6512a) {
                    this.f79165x = true;
                    this.f79166y = "not to set audio param, the audioId is err";
                    com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiSetAudioState", "not to set audio param, the audioId is err");
                }
                b();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetAudioState", "appId:%s, audioId:%s, src:%s, startTime:%d", this.f79151g, this.f79152h, this.f79153i, java.lang.Integer.valueOf(this.f79154m));
        if (this.f79153i.startsWith("file://")) {
            java.lang.String substring = this.f79153i.substring(7);
            bVar.f333838c = substring;
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetAudioState", "filePath:%s", substring);
        } else if (this.f79153i.contains("base64") && this.f79153i.startsWith("data:audio")) {
            java.lang.String str3 = this.f79153i;
            java.lang.String b17 = jh1.d.b(str3.substring(str3.indexOf("base64,") + 7).trim());
            bVar.f333838c = b17;
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetAudioState", "base64 decode filePath:%s", b17);
        } else if (this.f79153i.startsWith("wxblob://")) {
            com.tencent.mm.plugin.appbrand.jsapi.audio.d dVar = com.tencent.mm.plugin.appbrand.jsapi.audio.d.INSTANCE;
            if (!dVar.f79174e.containsKey(this.f79151g)) {
                com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79149e;
                java.lang.String str4 = this.f79151g;
                n01.e eVar = dl3.i.s().V;
                com.tencent.mars.xlog.Log.i("MicroMsg.AudioInstanceContext", "registerIBufferURLManager");
                com.tencent.mm.plugin.appbrand.jsruntime.d1 H = ((com.tencent.mm.plugin.appbrand.jsruntime.v) lVar.getF147808e().h0(com.tencent.mm.plugin.appbrand.jsruntime.v.class)).H();
                if (H != null) {
                    com.tencent.mm.plugin.appbrand.jsapi.audio.c cVar = new com.tencent.mm.plugin.appbrand.jsapi.audio.c(dVar, eVar);
                    com.tencent.mm.plugin.appbrand.jsruntime.a aVar = (com.tencent.mm.plugin.appbrand.jsruntime.a) H;
                    synchronized (aVar.f83963a) {
                        aVar.f83963a.add(cVar);
                    }
                    dVar.f79174e.put(str4, cVar);
                }
            }
            ik1.b0 b0Var = new ik1.b0();
            if (this.f79149e.getFileSystem().readFile(this.f79153i, b0Var) == com.tencent.mm.plugin.appbrand.appstorage.j1.OK) {
                bVar.B = (java.nio.ByteBuffer) b0Var.f291824a;
                bVar.f333838c = this.f79153i;
                n01.e eVar2 = dl3.i.s().V;
                java.lang.String str5 = this.f79153i;
                dl3.j jVar = (dl3.j) eVar2;
                synchronized (jVar.f235334a.U) {
                    if (!((java.util.HashSet) jVar.f235334a.f235322o).contains(str5)) {
                        ((java.util.HashSet) jVar.f235334a.f235322o).add(str5);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.JsApiSetAudioState", "wxblob read ok");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiSetAudioState", "wxblob read fail");
                com.tencent.mm.vfs.r6 privateAbsoluteFile = this.f79149e.getFileSystem().getPrivateAbsoluteFile(this.f79153i);
                if (privateAbsoluteFile == null || !privateAbsoluteFile.m()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiSetAudioState", "wxblob localFile is null");
                    this.f79165x = true;
                    this.f79166y = "wxblob localFile is null";
                } else {
                    bVar.f333838c = privateAbsoluteFile.o();
                }
            }
        } else if (!this.f79153i.startsWith("http://") && !this.f79153i.startsWith("https://")) {
            com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info = this.f79157p;
            jh1.c cVar2 = wxaPkg$Info == null ? null : new jh1.c(wxaPkg$Info.f75389e, wxaPkg$Info.f75388d);
            if (cVar2 != null) {
                if (cVar2.f299801f != null) {
                    if (c17 == null || !this.f79153i.equalsIgnoreCase(c17.f333837b) || android.text.TextUtils.isEmpty(c17.f333838c)) {
                        bVar.f333838c = jh1.d.a(this.f79149e, this.f79153i);
                    } else {
                        bVar.f333838c = c17.f333838c;
                    }
                    bVar.f333860y = cVar2;
                }
            }
            s46.d.a(cVar2);
            this.f79165x = true;
            this.f79166y = "the file not exist for src";
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiSetAudioState", "the wxa audioDataSource not found for src %s", this.f79153i);
            b();
            return;
        }
        if (!this.f79165x) {
            n01.c.g(bVar);
        }
        b();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.audio.a
    public void b() {
        super.b();
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f79149e;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Audio.JsApiSetAudioState", "server is null");
            return;
        }
        boolean z17 = this.f79165x;
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f79148d;
        int i17 = this.f79150f;
        if (!z17) {
            lVar.a(i17, k0Var.o("ok"));
            return;
        }
        lVar.a(i17, k0Var.o("fail:" + this.f79166y));
    }
}
