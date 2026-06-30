package zi0;

/* loaded from: classes13.dex */
public class f implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f554621d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding f554622e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f554623f = new java.util.HashMap();

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(flutterPluginBinding.m137983x3b5b91dc(), "com.tencent.mm.flutter/videoPlayer");
        this.f554621d = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(this);
        this.f554622e = flutterPluginBinding;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding flutterPluginBinding) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f554621d;
        if (c28688xe8dbe4c2 == null) {
            return;
        }
        c28688xe8dbe4c2.m138441xdf757329(null);
        this.f554621d = null;
        java.util.HashMap hashMap = (java.util.HashMap) this.f554623f;
        java.util.Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((zi0.e) it.next()).a();
        }
        hashMap.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        char c17;
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 m137988x3128f042 = this.f554622e.m137988x3128f042();
        if (m137988x3128f042 == null) {
            result.mo65718x5c4d208("no_activity", "video_player plugin requires a foreground activity", null);
            return;
        }
        java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
        str.getClass();
        if (str.equals("create")) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceTextureEntry mo138022xdee757ca = m137988x3128f042.mo138022xdee757ca();
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529 c28681x6bf9b529 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529(this.f554622e.m137983x3b5b91dc(), "com.tencent.mm.flutter/videoPlayer/videoEvents" + mo138022xdee757ca.id());
            if (c28687x4bb242ff.m138433xa13f5ebd("asset") == null) {
                new zi0.e(this, this.f554622e.m137982x6e669035(), c28681x6bf9b529, mo138022xdee757ca, (java.lang.String) c28687x4bb242ff.m138433xa13f5ebd("uri"), result, null);
                throw null;
            }
            new zi0.e(this, this.f554622e.m137982x6e669035(), c28681x6bf9b529, mo138022xdee757ca, (java.lang.String) c28687x4bb242ff.m138433xa13f5ebd("asset"), result, null);
            throw null;
        }
        boolean equals = str.equals(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        java.util.Map map = this.f554623f;
        if (equals) {
            java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
            while (it.hasNext()) {
                ((zi0.e) it.next()).a();
            }
            ((java.util.HashMap) map).clear();
            return;
        }
        long longValue = ((java.lang.Number) c28687x4bb242ff.m138433xa13f5ebd("textureId")).longValue();
        zi0.e eVar = (zi0.e) ((java.util.HashMap) map).get(java.lang.Long.valueOf(longValue));
        if (eVar == null) {
            result.mo65718x5c4d208("Unknown textureId", "No video player associated with texture id " + longValue, null);
            return;
        }
        java.lang.String str2 = c28687x4bb242ff.f71610xbfc5d0e1;
        str2.getClass();
        switch (str2.hashCode()) {
            case -971364356:
                if (str2.equals("setLooping")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -906224877:
                if (str2.equals("seekTo")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case -797672260:
                if (str2.equals("setOutputMute")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 3443508:
                if (str2.equals(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47246x9aae7f27)) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 106440182:
                if (str2.equals("pause")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 670514716:
                if (str2.equals(be1.x0.f4239x24728b)) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            case 747804969:
                if (str2.equals("position")) {
                    c17 = 6;
                    break;
                }
                c17 = 65535;
                break;
            case 1671767583:
                if (str2.equals("dispose")) {
                    c17 = 7;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                ((java.lang.Boolean) c28687x4bb242ff.m138433xa13f5ebd("looping")).booleanValue();
                throw null;
            case 1:
                ((java.lang.Number) c28687x4bb242ff.m138433xa13f5ebd(ya.b.f77489x9ff58fb5)).intValue();
                throw null;
            case 2:
                ((java.lang.Boolean) c28687x4bb242ff.m138433xa13f5ebd("outputMute")).booleanValue();
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, ((java.lang.Double) c28687x4bb242ff.m138433xa13f5ebd("volume")).doubleValue()));
                throw null;
            case 6:
                throw null;
            case 7:
                eVar.a();
                ((java.util.HashMap) map).remove(java.lang.Long.valueOf(longValue));
                result.mo65720x90b54003(null);
                return;
            default:
                result.mo65719xbc9fa82f();
                return;
        }
    }
}
