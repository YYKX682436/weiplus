package x03;

/* loaded from: classes15.dex */
public class q1 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f532638e;

    /* renamed from: f, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding f532639f;

    /* renamed from: h, reason: collision with root package name */
    public x03.p1 f532641h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f532640g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final x03.y0 f532637d = new x03.y0(this);

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "onAttachedToEngine");
        this.f532639f = flutterPluginBinding;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(flutterPluginBinding.m137983x3b5b91dc(), "com.tencent.mm.flutter/liteappVideoPlayer");
        this.f532638e = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f532637d, new android.content.IntentFilter(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "onDetachedFromEngine");
        this.f532638e.m138441xdf757329(null);
        java.util.HashMap hashMap = (java.util.HashMap) this.f532640g;
        java.util.Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((x03.p1) it.next()).a();
        }
        hashMap.clear();
        x03.v0 v0Var = x03.x0.f532694d;
        java.util.HashMap hashMap2 = v0Var.a().f532698c.f532593d;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        x03.x0 a17 = v0Var.a();
        x03.w0 w0Var = new x03.w0(this);
        kz5.q qVar = a17.f532696a;
        qVar.removeIf(w0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerMgr", "removeFlutterVideoPlayer plugin: " + this + " total size: " + qVar.d());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(this.f532637d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        char c17;
        java.lang.String str;
        x03.p1 p1Var;
        char c18;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 m137988x3128f042 = this.f532639f.m137988x3128f042();
        if (m137988x3128f042 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVideoPlayerPlugin", "texture null");
            result.mo65718x5c4d208("no_activity", "video_player plugin requires a foreground activity", null);
            return;
        }
        java.lang.String str2 = c28687x4bb242ff.f71610xbfc5d0e1;
        str2.getClass();
        int hashCode = str2.hashCode();
        if (hashCode == -1352294148) {
            if (str2.equals("create")) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode != -318476791) {
            if (hashCode == 3237136 && str2.equals(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82)) {
                c17 = 2;
            }
            c17 = 65535;
        } else {
            if (str2.equals("preload")) {
                c17 = 1;
            }
            c17 = 65535;
        }
        x03.v0 v0Var = x03.x0.f532694d;
        if (c17 == 0) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138022xdee757ca = m137988x3128f042.mo138022xdee757ca();
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529(this.f532639f.m137983x3b5b91dc(), "com.tencent.mm.flutter/videoPlayer/liteappVideoEvents" + mo138022xdee757ca.id());
            if (c28687x4bb242ff.m138433xa13f5ebd("asset") != null) {
                str = ", textureId: ";
                p1Var = new x03.p1(this.f532639f.m137982x6e669035(), c28681x6bf9b529, mo138022xdee757ca, (java.lang.String) c28687x4bb242ff.m138433xa13f5ebd("asset"), result);
            } else {
                str = ", textureId: ";
                p1Var = new x03.p1(this.f532639f.m137982x6e669035(), c28681x6bf9b529, mo138022xdee757ca, (java.lang.String) c28687x4bb242ff.m138433xa13f5ebd("uri"), result);
                if (c28687x4bb242ff.m138435x4c941b77("referer")) {
                    p1Var.f532625e = (java.lang.String) c28687x4bb242ff.m138433xa13f5ebd("referer");
                }
                if (c28687x4bb242ff.m138435x4c941b77("isLive")) {
                    p1Var.f532624d = ((java.lang.Boolean) c28687x4bb242ff.m138433xa13f5ebd("isLive")).booleanValue();
                }
                if (c28687x4bb242ff.m138435x4c941b77("cacheKey")) {
                    p1Var.f532623c = (java.lang.String) c28687x4bb242ff.m138433xa13f5ebd("cacheKey");
                }
            }
            long id6 = mo138022xdee757ca.id();
            ((java.util.HashMap) this.f532640g).put(java.lang.Long.valueOf(id6), p1Var);
            ((ku5.t0) ku5.t0.f394148d).g(new x03.j1(p1Var));
            x03.x0 a17 = v0Var.a();
            java.lang.Long valueOf = java.lang.Long.valueOf(id6);
            a17.f532696a.m144678xbb8646d7(new jz5.l(this, valueOf));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerMgr", "addFlutterVideoPlayer plugin: " + this + str + valueOf + ", total size: " + a17.f532696a.d());
            if (a17.f532696a.d() >= 10) {
                jz5.l lVar = (jz5.l) a17.f532696a.m144679xed1b9c8c();
                x03.q1 q1Var = (x03.q1) lVar.f384366d;
                java.lang.Number number = (java.lang.Number) lVar.f384367e;
                x03.p1 p1Var2 = (x03.p1) ((java.util.HashMap) q1Var.f532640g).get(java.lang.Long.valueOf(number.longValue()));
                if (p1Var2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterVideoPlayerPlugin", "videoPlayer is null, textureId: " + number.longValue());
                } else if (p1Var2.f532629i != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("event", "onForceDispose");
                    ((ku5.t0) ku5.t0.f394148d).B(new x03.e1(p1Var2, hashMap));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerMgr", "addFlutterVideoPlayer reach maxSize, need dispose first player. plugin: " + this + str + valueOf + ". total size: " + a17.f532696a.d());
            }
            ((java.util.HashMap) this.f532640g).size();
            return;
        }
        if (c17 == 1) {
            java.lang.String str3 = (java.lang.String) c28687x4bb242ff.m138433xa13f5ebd("url");
            int intValue = ((java.lang.Integer) c28687x4bb242ff.m138433xa13f5ebd("ratio")).intValue();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                return;
            }
            v0Var.a().f532697b.c(str3, intValue);
            return;
        }
        if (c17 == 2) {
            java.util.Iterator it = ((java.util.HashMap) this.f532640g).values().iterator();
            while (it.hasNext()) {
                ((x03.p1) it.next()).a();
            }
            ((java.util.HashMap) this.f532640g).clear();
            v0Var.a();
            java.util.HashMap hashMap2 = v0Var.a().f532698c.f532593d;
            if (hashMap2 != null) {
                hashMap2.clear();
                return;
            }
            return;
        }
        long longValue = ((java.lang.Number) c28687x4bb242ff.m138433xa13f5ebd("textureId")).longValue();
        x03.p1 p1Var3 = (x03.p1) ((java.util.HashMap) this.f532640g).get(java.lang.Long.valueOf(longValue));
        if (p1Var3 == null) {
            result.mo65718x5c4d208("Unknown textureId", "No video player associated with texture id " + longValue, null);
            return;
        }
        java.lang.String str4 = c28687x4bb242ff.f71610xbfc5d0e1;
        str4.getClass();
        switch (str4.hashCode()) {
            case -971364356:
                if (str4.equals("setLooping")) {
                    c18 = 0;
                    break;
                }
                c18 = 65535;
                break;
            case -906224877:
                if (str4.equals("seekTo")) {
                    c18 = 1;
                    break;
                }
                c18 = 65535;
                break;
            case -797672260:
                if (str4.equals("setOutputMute")) {
                    c18 = 2;
                    break;
                }
                c18 = 65535;
                break;
            case -493593704:
                if (str4.equals("resetPosition")) {
                    c18 = 3;
                    break;
                }
                c18 = 65535;
                break;
            case -402284771:
                if (str4.equals("setPlaybackRate")) {
                    c18 = 4;
                    break;
                }
                c18 = 65535;
                break;
            case 3443508:
                if (str4.equals(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
                    c18 = 5;
                    break;
                }
                c18 = 65535;
                break;
            case 106440182:
                if (str4.equals("pause")) {
                    c18 = 6;
                    break;
                }
                c18 = 65535;
                break;
            case 670514716:
                if (str4.equals(be1.x0.f4239x24728b)) {
                    c18 = 7;
                    break;
                }
                c18 = 65535;
                break;
            case 747804969:
                if (str4.equals("position")) {
                    c18 = '\b';
                    break;
                }
                c18 = 65535;
                break;
            case 1671767583:
                if (str4.equals("dispose")) {
                    c18 = '\t';
                    break;
                }
                c18 = 65535;
                break;
            default:
                c18 = 65535;
                break;
        }
        switch (c18) {
            case 0:
                p1Var3.f532626f.b(((java.lang.Boolean) c28687x4bb242ff.m138433xa13f5ebd("looping")).booleanValue());
                result.mo65720x90b54003(null);
                return;
            case 1:
                int intValue2 = ((java.lang.Number) c28687x4bb242ff.m138433xa13f5ebd(ya.b.f77489x9ff58fb5)).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer seekTo %s", java.lang.Integer.valueOf(p1Var3.hashCode()));
                p1Var3.f532626f.a(intValue2);
                result.mo65720x90b54003(null);
                return;
            case 2:
                p1Var3.f532626f.mo158544x764d819b(((java.lang.Boolean) c28687x4bb242ff.m138433xa13f5ebd("outputMute")).booleanValue());
                result.mo65720x90b54003(null);
                return;
            case 3:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer seekTo %s", java.lang.Integer.valueOf(p1Var3.hashCode()));
                p1Var3.f532626f.a(0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer pause %s", java.lang.Integer.valueOf(p1Var3.hashCode()));
                p1Var3.f532626f.mo158541x65825f6();
                result.mo65720x90b54003(null);
                return;
            case 4:
                java.lang.Double d17 = (java.lang.Double) c28687x4bb242ff.m138433xa13f5ebd("playbackRate");
                if (d17 != null) {
                    p1Var3.f532626f.c(d17.floatValue());
                }
                result.mo65720x90b54003(null);
                return;
            case 5:
                this.f532641h = p1Var3;
                if (!p1Var3.f532633m) {
                    p1Var3.f532626f.mo158542xed060d07();
                    p1Var3.f532633m = true;
                }
                x03.p1 p1Var4 = this.f532641h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer play %s", java.lang.Integer.valueOf(p1Var4.hashCode()));
                p1Var4.f532626f.mo158546x68ac462();
                v0Var.a().f532697b.e(this.f532641h.b(), kk.k.g(this.f532641h.b().getBytes()));
                result.mo65720x90b54003(null);
                return;
            case 6:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer pause %s", java.lang.Integer.valueOf(p1Var3.hashCode()));
                p1Var3.f532626f.mo158541x65825f6();
                v0Var.a().f532697b.h(kk.k.g(p1Var3.b().getBytes()), false);
                result.mo65720x90b54003(null);
                return;
            case 7:
                p1Var3.f532626f.e((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, ((java.lang.Double) c28687x4bb242ff.m138433xa13f5ebd("volume")).doubleValue())));
                result.mo65720x90b54003(null);
                return;
            case '\b':
                result.mo65720x90b54003(java.lang.Long.valueOf(p1Var3.f532626f.mo174783x9746038c()));
                return;
            case '\t':
                java.lang.String g17 = kk.k.g(p1Var3.b().getBytes());
                if (this.f532641h == p1Var3) {
                    this.f532641h = null;
                }
                v0Var.a().f532697b.h(g17, p1Var3.f532624d);
                java.util.Map map = v0Var.a().f532697b.f532574g;
                x03.f fVar = (x03.f) map.get(g17);
                if (fVar != null && fVar.f532550f) {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        java.lang.String str5 = (java.lang.String) entry.getKey();
                        x03.f fVar2 = (x03.f) entry.getValue();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                        if (r26.i0.y(str5, g17 + '@', false)) {
                            v0Var.a().f532698c.b(str5);
                            fVar2.f532551g = false;
                        }
                    }
                }
                p1Var3.a();
                java.util.HashMap hashMap3 = (java.util.HashMap) this.f532640g;
                hashMap3.remove(java.lang.Long.valueOf(longValue));
                hashMap3.size();
                x03.x0 a18 = v0Var.a();
                java.lang.Long valueOf2 = java.lang.Long.valueOf(longValue);
                jz5.l lVar2 = new jz5.l(this, valueOf2);
                kz5.q qVar = a18.f532696a;
                qVar.remove(lVar2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVideoPlayerMgr", "removeFlutterVideoPlayer plugin: " + this + ", textureId: " + valueOf2 + ", total size: " + qVar.d());
                result.mo65720x90b54003(null);
                return;
            default:
                result.mo65719xbc9fa82f();
                return;
        }
    }
}
