package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel */
/* loaded from: classes15.dex */
public class C28663x5531dee8 {
    private static final java.lang.String TAG = "PlatformViewsChannel";

    /* renamed from: cachedParsingHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.CachedParsingHandler f71377xe7441c3c;

    /* renamed from: channel */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71378x2c0b7d03;

    /* renamed from: handler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler f71379x294b574a;

    /* renamed from: parsingHandler */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71380xc029b27a;

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass1 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {
        public AnonymousClass1() {
        }

        /* renamed from: clearFocus */
        private void m138252xd2ef968b(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a.mo138267xd2ef968b(((java.lang.Integer) c28687x4bb242ff.m138434x86ac7956()).intValue());
                result.mo65720x90b54003(null);
            } catch (java.lang.IllegalStateException e17) {
                result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.m138246x1d3dd270(e17), null);
            }
        }

        /* renamed from: create */
        private void m138253xaf65a0fc(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            java.util.Map map = (java.util.Map) c28687x4bb242ff.m138434x86ac7956();
            boolean z17 = true;
            boolean z18 = map.containsKey("hybrid") && ((java.lang.Boolean) map.get("hybrid")).booleanValue();
            java.nio.ByteBuffer wrap = map.containsKey("params") ? java.nio.ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z18) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a.mo138268xa2344fcc(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest(((java.lang.Integer) map.get(dm.i4.f66865x76d1ec5a)).intValue(), (java.lang.String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((java.lang.Integer) map.get(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0)).intValue(), io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest.RequestedDisplayMode.HYBRID_ONLY, wrap));
                    result.mo65720x90b54003(null);
                    return;
                }
                if (!map.containsKey("hybridFallback") || !((java.lang.Boolean) map.get("hybridFallback")).booleanValue()) {
                    z17 = false;
                }
                long mo138269x96d983c3 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a.mo138269x96d983c3(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest(((java.lang.Integer) map.get(dm.i4.f66865x76d1ec5a)).intValue(), (java.lang.String) map.get("viewType"), map.containsKey("top") ? ((java.lang.Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((java.lang.Double) map.get("left")).doubleValue() : 0.0d, ((java.lang.Double) map.get("width")).doubleValue(), ((java.lang.Double) map.get("height")).doubleValue(), ((java.lang.Integer) map.get(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0)).intValue(), z17 ? io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK : io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                if (mo138269x96d983c3 != -2) {
                    result.mo65720x90b54003(java.lang.Long.valueOf(mo138269x96d983c3));
                } else {
                    if (!z17) {
                        throw new java.lang.AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    result.mo65720x90b54003(null);
                }
            } catch (java.lang.IllegalStateException e17) {
                result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.m138246x1d3dd270(e17), null);
            }
        }

        /* renamed from: dispose */
        private void m138254x63a5261f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a.mo138270x63a5261f(((java.lang.Integer) ((java.util.Map) c28687x4bb242ff.m138434x86ac7956()).get(dm.i4.f66865x76d1ec5a)).intValue());
                result.mo65720x90b54003(null);
            } catch (java.lang.IllegalStateException e17) {
                result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.m138246x1d3dd270(e17), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$resize$0 */
        public static /* synthetic */ void m138255x7b87dc7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferSize platformViewBufferSize) {
            if (platformViewBufferSize == null) {
                result.mo65718x5c4d208("error", "Failed to resize the platform view", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("width", java.lang.Double.valueOf(platformViewBufferSize.f71386x6be2dc6));
            hashMap.put("height", java.lang.Double.valueOf(platformViewBufferSize.f71385xb7389127));
            result.mo65720x90b54003(hashMap);
        }

        /* renamed from: offset */
        private void m138256xc3376493(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            java.util.Map map = (java.util.Map) c28687x4bb242ff.m138434x86ac7956();
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a.mo138271xc3376493(((java.lang.Integer) map.get(dm.i4.f66865x76d1ec5a)).intValue(), ((java.lang.Double) map.get("top")).doubleValue(), ((java.lang.Double) map.get("left")).doubleValue());
                result.mo65720x90b54003(null);
            } catch (java.lang.IllegalStateException e17) {
                result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.m138246x1d3dd270(e17), null);
            }
        }

        /* renamed from: resize */
        private void m138257xc84d9cb4(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            java.util.Map map = (java.util.Map) c28687x4bb242ff.m138434x86ac7956();
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a.mo138273xc84d9cb4(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewResizeRequest(((java.lang.Integer) map.get(dm.i4.f66865x76d1ec5a)).intValue(), ((java.lang.Double) map.get("width")).doubleValue(), ((java.lang.Double) map.get("height")).doubleValue()), new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferResized() { // from class: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$1$$a
                    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferResized
                    public final void run(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferSize platformViewBufferSize) {
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.AnonymousClass1.m138255x7b87dc7d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result.this, platformViewBufferSize);
                    }
                });
            } catch (java.lang.IllegalStateException e17) {
                result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.m138246x1d3dd270(e17), null);
            }
        }

        /* renamed from: setDirection */
        private void m138258x2261393d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            java.util.Map map = (java.util.Map) c28687x4bb242ff.m138434x86ac7956();
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a.mo138274x2261393d(((java.lang.Integer) map.get(dm.i4.f66865x76d1ec5a)).intValue(), ((java.lang.Integer) map.get(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0)).intValue());
                result.mo65720x90b54003(null);
            } catch (java.lang.IllegalStateException e17) {
                result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.m138246x1d3dd270(e17), null);
            }
        }

        /* renamed from: synchronizeToNativeViewHierarchy */
        private void m138259xed95344e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a.mo138275xed95344e(((java.lang.Boolean) c28687x4bb242ff.m138434x86ac7956()).booleanValue());
                result.mo65720x90b54003(null);
            } catch (java.lang.IllegalStateException e17) {
                result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.m138246x1d3dd270(e17), null);
            }
        }

        /* renamed from: touch */
        private void m138260x696df3f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result2;
            java.util.List list = (java.util.List) c28687x4bb242ff.m138434x86ac7956();
            try {
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a.mo138272xb05cb4a0(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewTouch(((java.lang.Integer) list.get(0)).intValue(), (java.lang.Number) list.get(1), (java.lang.Number) list.get(2), ((java.lang.Integer) list.get(3)).intValue(), ((java.lang.Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((java.lang.Integer) list.get(7)).intValue(), ((java.lang.Integer) list.get(8)).intValue(), (float) ((java.lang.Double) list.get(9)).doubleValue(), (float) ((java.lang.Double) list.get(10)).doubleValue(), ((java.lang.Integer) list.get(11)).intValue(), ((java.lang.Integer) list.get(12)).intValue(), ((java.lang.Integer) list.get(13)).intValue(), ((java.lang.Integer) list.get(14)).intValue(), ((java.lang.Number) list.get(15)).longValue()));
                result2 = result;
            } catch (java.lang.IllegalStateException e17) {
                e = e17;
                result2 = result;
            }
            try {
                result2.mo65720x90b54003(null);
            } catch (java.lang.IllegalStateException e18) {
                e = e18;
                result2.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.m138246x1d3dd270(e), null);
            }
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
        /* renamed from: onMethodCall */
        public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.this.f71379x294b574a == null) {
                return;
            }
            io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.TAG, "Received '" + c28687x4bb242ff.f71610xbfc5d0e1 + "' message.");
            java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
            str.getClass();
            char c17 = 65535;
            switch (str.hashCode()) {
                case -1352294148:
                    if (str.equals("create")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case -1019779949:
                    if (str.equals("offset")) {
                        c17 = 1;
                        break;
                    }
                    break;
                case -934437708:
                    if (str.equals("resize")) {
                        c17 = 2;
                        break;
                    }
                    break;
                case -756050293:
                    if (str.equals("clearFocus")) {
                        c17 = 3;
                        break;
                    }
                    break;
                case -308988850:
                    if (str.equals("synchronizeToNativeViewHierarchy")) {
                        c17 = 4;
                        break;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        c17 = 5;
                        break;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        c17 = 6;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        c17 = 7;
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                    m138253xaf65a0fc(c28687x4bb242ff, result);
                    return;
                case 1:
                    m138256xc3376493(c28687x4bb242ff, result);
                    return;
                case 2:
                    m138257xc84d9cb4(c28687x4bb242ff, result);
                    return;
                case 3:
                    m138252xd2ef968b(c28687x4bb242ff, result);
                    return;
                case 4:
                    m138259xed95344e(c28687x4bb242ff, result);
                    return;
                case 5:
                    m138260x696df3f(c28687x4bb242ff, result);
                    return;
                case 6:
                    m138258x2261393d(c28687x4bb242ff, result);
                    return;
                case 7:
                    m138254x63a5261f(c28687x4bb242ff, result);
                    return;
                default:
                    result.mo65719xbc9fa82f();
                    return;
            }
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewBufferResized */
    /* loaded from: classes15.dex */
    public interface PlatformViewBufferResized {
        void run(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferSize platformViewBufferSize);
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewBufferSize */
    /* loaded from: classes15.dex */
    public static class PlatformViewBufferSize {

        /* renamed from: height */
        public final int f71385xb7389127;

        /* renamed from: width */
        public final int f71386x6be2dc6;

        public PlatformViewBufferSize(int i17, int i18) {
            this.f71386x6be2dc6 = i17;
            this.f71385xb7389127 = i18;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewCreationRequest */
    /* loaded from: classes15.dex */
    public static class PlatformViewCreationRequest {

        /* renamed from: direction */
        public final int f71387xc6a0077f;

        /* renamed from: displayMode */
        public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest.RequestedDisplayMode f71388x662b9585;

        /* renamed from: logicalHeight */
        public final double f71389x93f82e90;

        /* renamed from: logicalLeft */
        public final double f71390x1fdc83b0;

        /* renamed from: logicalTop */
        public final double f71391x8528448c;

        /* renamed from: logicalWidth */
        public final double f71392xdc50bf3d;

        /* renamed from: params */
        public final java.nio.ByteBuffer f71393xc4aaf986;

        /* renamed from: viewId */
        public final int f71394xcf532ea0;

        /* renamed from: viewType */
        public final java.lang.String f71395x4747637f;

        /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewCreationRequest$RequestedDisplayMode */
        /* loaded from: classes15.dex */
        public enum RequestedDisplayMode {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public PlatformViewCreationRequest(int i17, java.lang.String str, double d17, double d18, double d19, double d27, int i18, java.nio.ByteBuffer byteBuffer) {
            this(i17, str, d17, d18, d19, d27, i18, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
        }

        public PlatformViewCreationRequest(int i17, java.lang.String str, double d17, double d18, double d19, double d27, int i18, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest.RequestedDisplayMode requestedDisplayMode, java.nio.ByteBuffer byteBuffer) {
            this.f71394xcf532ea0 = i17;
            this.f71395x4747637f = str;
            this.f71391x8528448c = d17;
            this.f71390x1fdc83b0 = d18;
            this.f71392xdc50bf3d = d19;
            this.f71389x93f82e90 = d27;
            this.f71387xc6a0077f = i18;
            this.f71388x662b9585 = requestedDisplayMode;
            this.f71393xc4aaf986 = byteBuffer;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewResizeRequest */
    /* loaded from: classes15.dex */
    public static class PlatformViewResizeRequest {

        /* renamed from: newLogicalHeight */
        public final double f71400x21ee58d0;

        /* renamed from: newLogicalWidth */
        public final double f71401x7dcc4cfd;

        /* renamed from: viewId */
        public final int f71402xcf532ea0;

        public PlatformViewResizeRequest(int i17, double d17, double d18) {
            this.f71402xcf532ea0 = i17;
            this.f71401x7dcc4cfd = d17;
            this.f71400x21ee58d0 = d18;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewTouch */
    /* loaded from: classes15.dex */
    public static class PlatformViewTouch {

        /* renamed from: action */
        public final int f71403xab2f7e36;

        /* renamed from: buttonState */
        public final int f71404x96785c7f;

        /* renamed from: deviceId */
        public final int f71405x421cea11;

        /* renamed from: downTime */
        public final java.lang.Number f71406x550fca8f;

        /* renamed from: edgeFlags */
        public final int f71407xbfd9eca;

        /* renamed from: eventTime */
        public final java.lang.Number f71408x1df5c87;

        /* renamed from: flags */
        public final int f71409x5cfee87;

        /* renamed from: metaState */
        public final int f71410xbf9ab98c;

        /* renamed from: motionEventId */
        public final long f71411x8b2b1cbf;

        /* renamed from: pointerCount */
        public final int f71412x8bb380d2;

        /* renamed from: rawPointerCoords */
        public final java.lang.Object f71413x9789e573;

        /* renamed from: rawPointerPropertiesList */
        public final java.lang.Object f71414xc1e37cc6;

        /* renamed from: source */
        public final int f71415xca90681b;

        /* renamed from: viewId */
        public final int f71416xcf532ea0;

        /* renamed from: xPrecision */
        public final float f71417xa7d85ae6;

        /* renamed from: yPrecision */
        public final float f71418x9c21cc05;

        public PlatformViewTouch(int i17, java.lang.Number number, java.lang.Number number2, int i18, int i19, java.lang.Object obj, java.lang.Object obj2, int i27, int i28, float f17, float f18, int i29, int i37, int i38, int i39, long j17) {
            this.f71416xcf532ea0 = i17;
            this.f71406x550fca8f = number;
            this.f71408x1df5c87 = number2;
            this.f71403xab2f7e36 = i18;
            this.f71412x8bb380d2 = i19;
            this.f71414xc1e37cc6 = obj;
            this.f71413x9789e573 = obj2;
            this.f71410xbf9ab98c = i27;
            this.f71404x96785c7f = i28;
            this.f71417xa7d85ae6 = f17;
            this.f71418x9c21cc05 = f18;
            this.f71405x421cea11 = i29;
            this.f71407xbfd9eca = i37;
            this.f71415xca90681b = i38;
            this.f71409x5cfee87 = i39;
            this.f71411x8b2b1cbf = j17;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewsHandler */
    /* loaded from: classes15.dex */
    public interface PlatformViewsHandler {

        /* renamed from: NON_TEXTURE_FALLBACK */
        public static final long f71419x7a0f14f8 = -2;

        /* renamed from: clearFocus */
        void mo138267xd2ef968b(int i17);

        /* renamed from: createForPlatformViewLayer */
        void mo138268xa2344fcc(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest);

        /* renamed from: createForTextureLayer */
        long mo138269x96d983c3(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewCreationRequest platformViewCreationRequest);

        /* renamed from: dispose */
        void mo138270x63a5261f(int i17);

        /* renamed from: offset */
        void mo138271xc3376493(int i17, double d17, double d18);

        /* renamed from: onTouch */
        void mo138272xb05cb4a0(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewTouch platformViewTouch);

        /* renamed from: resize */
        void mo138273xc84d9cb4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewResizeRequest platformViewResizeRequest, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewBufferResized platformViewBufferResized);

        /* renamed from: setDirection */
        void mo138274x2261393d(int i17, int i18);

        /* renamed from: synchronizeToNativeViewHierarchy */
        void mo138275xed95344e(boolean z17);
    }

    public C28663x5531dee8(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.AnonymousClass1 anonymousClass1 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.AnonymousClass1();
        this.f71380xc029b27a = anonymousClass1;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/platform_views", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
        this.f71378x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(anonymousClass1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: detailedExceptionString */
    public static java.lang.String m138246x1d3dd270(java.lang.Exception exc) {
        return io.p3284xd2ae381c.Log.m136959x2d915d84(exc);
    }

    /* renamed from: clearCachedCalls */
    public void m138247xac32f546() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.CachedParsingHandler cachedParsingHandler = this.f71377xe7441c3c;
        if (cachedParsingHandler == null) {
            return;
        }
        cachedParsingHandler.m138261x5a5b64d();
        this.f71377xe7441c3c = null;
    }

    /* renamed from: enableCaching */
    public void m138248x62ecbcbc() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.CachedParsingHandler cachedParsingHandler = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.CachedParsingHandler(null);
        this.f71377xe7441c3c = cachedParsingHandler;
        this.f71378x2c0b7d03.m138441xdf757329(cachedParsingHandler);
    }

    /* renamed from: flushCachedCalls */
    public void m138249xe70b282f() {
        if (this.f71377xe7441c3c == null) {
            return;
        }
        this.f71378x2c0b7d03.m138441xdf757329(this.f71380xc029b27a);
        io.p3284xd2ae381c.Log.i(TAG, "flushCachedCalls: pendingCalls count = " + this.f71377xe7441c3c.m138262x691950f4().size());
        for (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.CachedParsingHandler.PendingCall pendingCall : this.f71377xe7441c3c.m138262x691950f4()) {
            this.f71380xc029b27a.mo294x9bfdc61e(pendingCall.f71383x2e7a5e, pendingCall.f71384xc84dc81d);
        }
        this.f71377xe7441c3c = null;
    }

    /* renamed from: invokeViewFocused */
    public void m138250x5027fd7a(int i17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f71378x2c0b7d03;
        if (c28688xe8dbe4c2 == null) {
            return;
        }
        c28688xe8dbe4c2.m138438xd8c5c779("viewFocused", java.lang.Integer.valueOf(i17));
    }

    /* renamed from: setPlatformViewsHandler */
    public void m138251x6ecb7091(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.PlatformViewsHandler platformViewsHandler) {
        this.f71379x294b574a = platformViewsHandler;
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$CachedParsingHandler */
    /* loaded from: classes15.dex */
    public static class CachedParsingHandler implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {
        private static final java.lang.String TAG = "CachedParsingHandler";

        /* renamed from: pendingCalls */
        private final java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.CachedParsingHandler.PendingCall> f71382x826be7e;

        /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$CachedParsingHandler$PendingCall */
        /* loaded from: classes15.dex */
        public static class PendingCall {

            /* renamed from: call */
            final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff f71383x2e7a5e;

            /* renamed from: result */
            final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result f71384xc84dc81d;

            public PendingCall(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                this.f71383x2e7a5e = c28687x4bb242ff;
                this.f71384xc84dc81d = result;
            }
        }

        private CachedParsingHandler() {
            this.f71382x826be7e = new java.util.ArrayList();
        }

        /* renamed from: clear */
        public void m138261x5a5b64d() {
            java.util.Iterator<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.CachedParsingHandler.PendingCall> it = this.f71382x826be7e.iterator();
            while (it.hasNext()) {
                it.next().f71384xc84dc81d.mo65718x5c4d208("error", "Platform views handler is not available", null);
            }
            this.f71382x826be7e.clear();
        }

        /* renamed from: getPendingCalls */
        public java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.CachedParsingHandler.PendingCall> m138262x691950f4() {
            return this.f71382x826be7e;
        }

        @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
        /* renamed from: onMethodCall */
        public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
            io.p3284xd2ae381c.Log.i(TAG, "Caching platform view method call: " + c28687x4bb242ff.f71610xbfc5d0e1);
            this.f71382x826be7e.add(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.CachedParsingHandler.PendingCall(c28687x4bb242ff, result));
        }

        public /* synthetic */ CachedParsingHandler(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28663x5531dee8.AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
