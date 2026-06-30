package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2 */
/* loaded from: classes15.dex */
public class C28665x5109fe4a {
    private static final java.lang.String TAG = "PlatformViewsChannel2";

    /* renamed from: channel */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71420x2c0b7d03;

    /* renamed from: handler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler f71421x294b574a;

    /* renamed from: parsingHandler */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71422xc029b27a;

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2$PlatformViewCreationRequest */
    /* loaded from: classes15.dex */
    public static class PlatformViewCreationRequest {

        /* renamed from: direction */
        public final int f71424xc6a0077f;

        /* renamed from: logicalHeight */
        public final double f71425x93f82e90;

        /* renamed from: logicalWidth */
        public final double f71426xdc50bf3d;

        /* renamed from: params */
        public final java.nio.ByteBuffer f71427xc4aaf986;

        /* renamed from: viewId */
        public final int f71428xcf532ea0;

        /* renamed from: viewType */
        public final java.lang.String f71429x4747637f;

        public PlatformViewCreationRequest(int i17, java.lang.String str, double d17, double d18, int i18, java.nio.ByteBuffer byteBuffer) {
            this.f71428xcf532ea0 = i17;
            this.f71429x4747637f = str;
            this.f71426xdc50bf3d = d17;
            this.f71425x93f82e90 = d18;
            this.f71424xc6a0077f = i18;
            this.f71427xc4aaf986 = byteBuffer;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2$PlatformViewTouch */
    /* loaded from: classes15.dex */
    public static class PlatformViewTouch {

        /* renamed from: action */
        public final int f71430xab2f7e36;

        /* renamed from: buttonState */
        public final int f71431x96785c7f;

        /* renamed from: deviceId */
        public final int f71432x421cea11;

        /* renamed from: downTime */
        public final java.lang.Number f71433x550fca8f;

        /* renamed from: edgeFlags */
        public final int f71434xbfd9eca;

        /* renamed from: eventTime */
        public final java.lang.Number f71435x1df5c87;

        /* renamed from: flags */
        public final int f71436x5cfee87;

        /* renamed from: metaState */
        public final int f71437xbf9ab98c;

        /* renamed from: motionEventId */
        public final long f71438x8b2b1cbf;

        /* renamed from: pointerCount */
        public final int f71439x8bb380d2;

        /* renamed from: rawPointerCoords */
        public final java.lang.Object f71440x9789e573;

        /* renamed from: rawPointerPropertiesList */
        public final java.lang.Object f71441xc1e37cc6;

        /* renamed from: source */
        public final int f71442xca90681b;

        /* renamed from: viewId */
        public final int f71443xcf532ea0;

        /* renamed from: xPrecision */
        public final float f71444xa7d85ae6;

        /* renamed from: yPrecision */
        public final float f71445x9c21cc05;

        public PlatformViewTouch(int i17, java.lang.Number number, java.lang.Number number2, int i18, int i19, java.lang.Object obj, java.lang.Object obj2, int i27, int i28, float f17, float f18, int i29, int i37, int i38, int i39, long j17) {
            this.f71443xcf532ea0 = i17;
            this.f71433x550fca8f = number;
            this.f71435x1df5c87 = number2;
            this.f71430xab2f7e36 = i18;
            this.f71439x8bb380d2 = i19;
            this.f71441xc1e37cc6 = obj;
            this.f71440x9789e573 = obj2;
            this.f71437xbf9ab98c = i27;
            this.f71431x96785c7f = i28;
            this.f71444xa7d85ae6 = f17;
            this.f71445x9c21cc05 = f18;
            this.f71432x421cea11 = i29;
            this.f71434xbfd9eca = i37;
            this.f71442xca90681b = i38;
            this.f71436x5cfee87 = i39;
            this.f71438x8b2b1cbf = j17;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2$PlatformViewsHandler */
    /* loaded from: classes15.dex */
    public interface PlatformViewsHandler {
        /* renamed from: clearFocus */
        void mo138287xd2ef968b(int i17);

        /* renamed from: createPlatformView */
        void mo138288x800200d4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewCreationRequest platformViewCreationRequest);

        /* renamed from: dispose */
        void mo138289x63a5261f(int i17);

        /* renamed from: isSurfaceControlEnabled */
        boolean mo138290x2cc8f227();

        /* renamed from: onTouch */
        void mo138291xb05cb4a0(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewTouch platformViewTouch);

        /* renamed from: setDirection */
        void mo138292x2261393d(int i17, int i18);
    }

    public C28665x5109fe4a(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.1
            /* renamed from: clearFocus */
            private void m138281xd2ef968b(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                try {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.this.f71421x294b574a.mo138287xd2ef968b(((java.lang.Integer) c28687x4bb242ff.m138434x86ac7956()).intValue());
                    result.mo65720x90b54003(null);
                } catch (java.lang.IllegalStateException e17) {
                    result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.m138278x1d3dd270(e17), null);
                }
            }

            /* renamed from: create */
            private void m138282xaf65a0fc(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                java.util.Map map = (java.util.Map) c28687x4bb242ff.m138434x86ac7956();
                try {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.this.f71421x294b574a.mo138288x800200d4(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewCreationRequest(((java.lang.Integer) map.get(dm.i4.f66865x76d1ec5a)).intValue(), (java.lang.String) map.get("viewType"), 0.0d, 0.0d, ((java.lang.Integer) map.get(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0)).intValue(), map.containsKey("params") ? java.nio.ByteBuffer.wrap((byte[]) map.get("params")) : null));
                    result.mo65720x90b54003(null);
                } catch (java.lang.IllegalStateException e17) {
                    result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.m138278x1d3dd270(e17), null);
                }
            }

            /* renamed from: dispose */
            private void m138283x63a5261f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                try {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.this.f71421x294b574a.mo138289x63a5261f(((java.lang.Integer) ((java.util.Map) c28687x4bb242ff.m138434x86ac7956()).get(dm.i4.f66865x76d1ec5a)).intValue());
                    result.mo65720x90b54003(null);
                } catch (java.lang.IllegalStateException e17) {
                    result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.m138278x1d3dd270(e17), null);
                }
            }

            /* renamed from: isSurfaceControlEnabled */
            private void m138284x2cc8f227(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                result.mo65720x90b54003(java.lang.Boolean.valueOf(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.this.f71421x294b574a.mo138290x2cc8f227()));
            }

            /* renamed from: setDirection */
            private void m138285x2261393d(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                java.util.Map map = (java.util.Map) c28687x4bb242ff.m138434x86ac7956();
                try {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.this.f71421x294b574a.mo138292x2261393d(((java.lang.Integer) map.get(dm.i4.f66865x76d1ec5a)).intValue(), ((java.lang.Integer) map.get(com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.InterfaceC4218x687499fa.f16225x785081d0)).intValue());
                    result.mo65720x90b54003(null);
                } catch (java.lang.IllegalStateException e17) {
                    result.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.m138278x1d3dd270(e17), null);
                }
            }

            /* renamed from: touch */
            private void m138286x696df3f(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result2;
                java.util.List list = (java.util.List) c28687x4bb242ff.m138434x86ac7956();
                try {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.this.f71421x294b574a.mo138291xb05cb4a0(new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewTouch(((java.lang.Integer) list.get(0)).intValue(), (java.lang.Number) list.get(1), (java.lang.Number) list.get(2), ((java.lang.Integer) list.get(3)).intValue(), ((java.lang.Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((java.lang.Integer) list.get(7)).intValue(), ((java.lang.Integer) list.get(8)).intValue(), (float) ((java.lang.Double) list.get(9)).doubleValue(), (float) ((java.lang.Double) list.get(10)).doubleValue(), ((java.lang.Integer) list.get(11)).intValue(), ((java.lang.Integer) list.get(12)).intValue(), ((java.lang.Integer) list.get(13)).intValue(), ((java.lang.Integer) list.get(14)).intValue(), ((java.lang.Number) list.get(15)).longValue()));
                    result2 = result;
                } catch (java.lang.IllegalStateException e17) {
                    e = e17;
                    result2 = result;
                }
                try {
                    result2.mo65720x90b54003(null);
                } catch (java.lang.IllegalStateException e18) {
                    e = e18;
                    result2.mo65718x5c4d208("error", io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.m138278x1d3dd270(e), null);
                }
            }

            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.this.f71421x294b574a == null) {
                    return;
                }
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.TAG, "Received '" + c28687x4bb242ff.f71610xbfc5d0e1 + "' message.");
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
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case 751366695:
                        if (str.equals("isSurfaceControlEnabled")) {
                            c17 = 4;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c17 = 5;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        m138282xaf65a0fc(c28687x4bb242ff, result);
                        return;
                    case 1:
                        m138281xd2ef968b(c28687x4bb242ff, result);
                        return;
                    case 2:
                        m138286x696df3f(c28687x4bb242ff, result);
                        return;
                    case 3:
                        m138285x2261393d(c28687x4bb242ff, result);
                        return;
                    case 4:
                        m138284x2cc8f227(c28687x4bb242ff, result);
                        return;
                    case 5:
                        m138283x63a5261f(c28687x4bb242ff, result);
                        return;
                    default:
                        result.mo65719xbc9fa82f();
                        return;
                }
            }
        };
        this.f71422xc029b27a = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/platform_views_2", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
        this.f71420x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: detailedExceptionString */
    public static java.lang.String m138278x1d3dd270(java.lang.Exception exc) {
        return io.p3284xd2ae381c.Log.m136959x2d915d84(exc);
    }

    /* renamed from: invokeViewFocused */
    public void m138279x5027fd7a(int i17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f71420x2c0b7d03;
        if (c28688xe8dbe4c2 == null) {
            return;
        }
        c28688xe8dbe4c2.m138438xd8c5c779("viewFocused", java.lang.Integer.valueOf(i17));
    }

    /* renamed from: setPlatformViewsHandler */
    public void m138280x6ecb7091(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler platformViewsHandler) {
        this.f71421x294b574a = platformViewsHandler;
    }
}
