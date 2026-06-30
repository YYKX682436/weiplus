package ha3;

/* loaded from: classes15.dex */
public final class k0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f361424d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding f361425e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f361426f = new java.util.concurrent.ConcurrentHashMap();

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onAttachedToActivity");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onAttachedToEngine");
        this.f361425e = binding;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(binding.m137983x3b5b91dc(), "com.tencent.mm.flutter/liteappVideoPlayer");
        this.f361424d = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onDetachedFromActivity");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onDetachedFromActivityForConfigChanges");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onDetachedFromEngine");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f361426f;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            ha3.a aVar = (ha3.a) entry.getValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "dispose player, textureId: " + longValue + ", player: " + aVar);
            aVar.k();
        }
        concurrentHashMap.clear();
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f361424d;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138441xdf757329(null);
        }
        this.f361424d = null;
        this.f361425e = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x025e. Please report as an issue. */
    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff call, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        java.lang.String str;
        ha3.a d0Var;
        boolean z17;
        int integer;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.String str2 = call.f71610xbfc5d0e1;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f361426f;
        boolean z18 = false;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1352294148) {
                if (hashCode != -318476791) {
                    if (hashCode == 3237136 && str2.equals(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82)) {
                        java.util.Collection values = concurrentHashMap.values();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
                        java.util.Iterator it = values.iterator();
                        while (it.hasNext()) {
                            ((ha3.a) it.next()).k();
                        }
                        return;
                    }
                } else if (str2.equals("preload")) {
                    java.lang.String str3 = (java.lang.String) call.m138433xa13f5ebd("url");
                    java.lang.Integer num = (java.lang.Integer) call.m138433xa13f5ebd("ratio");
                    if (num == null) {
                        num = 30;
                    }
                    int intValue = num.intValue();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        ha3.i0 i0Var = ha3.j0.f361419a;
                        ha3.j0.f361420b.d(str3, intValue);
                    }
                    result.mo65720x90b54003(null);
                    return;
                }
            } else if (str2.equals("create")) {
                java.lang.String str4 = (java.lang.String) call.m138433xa13f5ebd("asset");
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = (java.lang.String) call.m138433xa13f5ebd("uri");
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String str6 = (java.lang.String) call.m138433xa13f5ebd("referer");
                java.lang.String str7 = str6 == null ? "" : str6;
                java.lang.Boolean bool = (java.lang.Boolean) call.m138433xa13f5ebd("isLive");
                if (bool == null) {
                    bool = java.lang.Boolean.FALSE;
                }
                boolean booleanValue = bool.booleanValue();
                java.lang.Boolean bool2 = (java.lang.Boolean) call.m138433xa13f5ebd("isHDR");
                if (bool2 == null) {
                    bool2 = java.lang.Boolean.FALSE;
                }
                bool2.booleanValue();
                boolean z19 = str4.length() > 0;
                java.lang.String str8 = (java.lang.String) call.m138433xa13f5ebd("cacheKey");
                java.lang.String str9 = str8 == null ? "" : str8;
                java.lang.Integer num2 = (java.lang.Integer) call.m138433xa13f5ebd("width");
                if (num2 == null) {
                    num2 = r9;
                }
                int intValue2 = num2.intValue();
                java.lang.Integer num3 = (java.lang.Integer) call.m138433xa13f5ebd("height");
                int intValue3 = (num3 != null ? num3 : 0).intValue();
                if (str4.length() > 0) {
                    str = str4;
                } else {
                    str = str5.length() > 0 ? str5 : "";
                }
                if (!(str.length() > 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVideoPlayerPlugin", "dataSource is error.");
                    result.mo65719xbc9fa82f();
                    return;
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding = this.f361425e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(flutterPluginBinding);
                io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer m139631xfdf2a2c3 = flutterPluginBinding.m137988x3128f042().m139631xfdf2a2c3();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m139631xfdf2a2c3, "createSurfaceProducer(...)");
                long id6 = m139631xfdf2a2c3.id();
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding2 = this.f361425e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(flutterPluginBinding2);
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529(flutterPluginBinding2.m137983x3b5b91dc(), "com.tencent.mm.flutter/videoPlayer/liteappVideoEvents" + id6);
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding3 = this.f361425e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(flutterPluginBinding3);
                android.content.Context m137982x6e669035 = flutterPluginBinding3.m137982x6e669035();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137982x6e669035, "getApplicationContext(...)");
                if (r26.i0.y(str, "preview://", false)) {
                    d0Var = new ha3.v(m137982x6e669035, str, str9, booleanValue, str7, intValue2, intValue3, m139631xfdf2a2c3, c28681x6bf9b529);
                } else {
                    if (z19) {
                        gp.c cVar = new gp.c();
                        cVar.k(str);
                        int d17 = cVar.d();
                        int i17 = 0;
                        while (i17 < d17) {
                            android.media.MediaFormat e17 = cVar.e(i17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getTrackFormat(...)");
                            java.lang.String string = e17.getString("mime");
                            if (string != null && r26.i0.y(string, "video/", z18) && ((e17.containsKey("color-transfer") && ((integer = e17.getInteger("color-transfer")) == 6 || integer == 7)) || (e17.containsKey("color-standard") && e17.getInteger("color-standard") == 6))) {
                                z17 = true;
                                break;
                            } else {
                                i17++;
                                z18 = false;
                            }
                        }
                        z17 = false;
                        if (z17) {
                            d0Var = new ha3.g(m137982x6e669035, str, str9, booleanValue, str7, intValue2, intValue3, m139631xfdf2a2c3, c28681x6bf9b529);
                        }
                    }
                    d0Var = new ha3.d0(m137982x6e669035, str, str9, booleanValue, str7, intValue2, intValue3, m139631xfdf2a2c3, c28681x6bf9b529);
                }
                d0Var.j();
                concurrentHashMap.put(java.lang.Long.valueOf(id6), d0Var);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("textureId", java.lang.Long.valueOf(id6));
                result.mo65720x90b54003(hashMap);
                return;
            }
        }
        java.lang.Long valueOf = ((java.lang.Integer) call.m138433xa13f5ebd("textureId")) != null ? java.lang.Long.valueOf(r0.intValue()) : null;
        ha3.a aVar = (ha3.a) concurrentHashMap.get(valueOf);
        if (aVar == null) {
            result.mo65718x5c4d208("Unknown textureId", "No video player associated with texture id " + valueOf, null);
            return;
        }
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -971364356:
                    if (str2.equals("setLooping")) {
                        java.lang.Boolean bool3 = (java.lang.Boolean) call.m138433xa13f5ebd("looping");
                        if (bool3 == null) {
                            bool3 = java.lang.Boolean.FALSE;
                        }
                        aVar.h(bool3.booleanValue());
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
                case -906224877:
                    if (str2.equals("seekTo")) {
                        java.lang.Integer num4 = (java.lang.Integer) call.m138433xa13f5ebd(ya.b.f77489x9ff58fb5);
                        aVar.mo133092xc9fc1b13((num4 != null ? num4 : 0).intValue());
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
                case -797672260:
                    if (str2.equals("setOutputMute")) {
                        java.lang.Boolean bool4 = (java.lang.Boolean) call.m138433xa13f5ebd("outputMute");
                        if (bool4 == null) {
                            bool4 = java.lang.Boolean.FALSE;
                        }
                        aVar.m(bool4.booleanValue());
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
                case -493593704:
                    if (str2.equals("resetPosition")) {
                        if (!aVar.o()) {
                            aVar.n();
                            aVar.i();
                        }
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
                case -402284771:
                    if (str2.equals("setPlaybackRate")) {
                        java.lang.Double d18 = (java.lang.Double) call.m138433xa13f5ebd("playbackRate");
                        if (d18 == null) {
                            d18 = java.lang.Double.valueOf(1.0d);
                        }
                        aVar.g(d18.doubleValue());
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
                case -295960470:
                    if (str2.equals("updateSize")) {
                        java.lang.Integer num5 = (java.lang.Integer) call.m138433xa13f5ebd("width");
                        if (num5 == null) {
                            num5 = r9;
                        }
                        int intValue4 = num5.intValue();
                        java.lang.Integer num6 = (java.lang.Integer) call.m138433xa13f5ebd("height");
                        aVar.f(intValue4, (num6 != null ? num6 : 0).intValue());
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
                case 3443508:
                    if (str2.equals(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
                        aVar.p();
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
                case 106440182:
                    if (str2.equals("pause")) {
                        aVar.i();
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
                case 670514716:
                    if (str2.equals(be1.x0.f4239x24728b)) {
                        java.lang.Double d19 = (java.lang.Double) call.m138433xa13f5ebd("volume");
                        if (d19 == null) {
                            d19 = java.lang.Double.valueOf(1.0d);
                        }
                        aVar.e(d19.doubleValue());
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
                case 747804969:
                    if (str2.equals("position")) {
                        result.mo65720x90b54003(java.lang.Long.valueOf(aVar.q()));
                        return;
                    }
                    break;
                case 1671767583:
                    if (str2.equals("dispose")) {
                        aVar.k();
                        p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(concurrentHashMap).remove(valueOf);
                        result.mo65720x90b54003(null);
                        return;
                    }
                    break;
            }
        }
        result.mo65719xbc9fa82f();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onReattachedToActivityForConfigChanges");
    }
}
