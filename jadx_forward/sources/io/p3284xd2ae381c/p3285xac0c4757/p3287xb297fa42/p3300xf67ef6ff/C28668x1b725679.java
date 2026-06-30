package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.ScribeChannel */
/* loaded from: classes15.dex */
public class C28668x1b725679 {

    /* renamed from: METHOD_IS_FEATURE_AVAILABLE */
    public static final java.lang.String f71464xac432149 = "Scribe.isFeatureAvailable";

    /* renamed from: METHOD_IS_STYLUS_HANDWRITING_AVAILABLE */
    public static final java.lang.String f71465xd162f841 = "Scribe.isStylusHandwritingAvailable";

    /* renamed from: METHOD_START_STYLUS_HANDWRITING */
    public static final java.lang.String f71466x3e31203b = "Scribe.startStylusHandwriting";
    private static final java.lang.String TAG = "ScribeChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71467x2c0b7d03;

    /* renamed from: parsingMethodHandler */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71468xf115c659;

    /* renamed from: scribeMethodHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.ScribeMethodHandler f71469x4108303f;

    /* renamed from: io.flutter.embedding.engine.systemchannels.ScribeChannel$ScribeMethodHandler */
    /* loaded from: classes15.dex */
    public interface ScribeMethodHandler {
        /* renamed from: isFeatureAvailable */
        boolean mo138315x24b5e1bd();

        /* renamed from: isStylusHandwritingAvailable */
        boolean mo138316xeb564678();

        /* renamed from: startStylusHandwriting */
        void mo138317x3edeaf19();
    }

    public C28668x1b725679(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.ScribeChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.this.f71469x4108303f == null) {
                    io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.TAG, "No ScribeMethodHandler registered. Scribe call not handled.");
                    return;
                }
                java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.TAG, "Received '" + str + "' message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -705821951:
                        if (str.equals(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.f71464xac432149)) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case 1759284829:
                        if (str.equals(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.f71466x3e31203b)) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 2119738044:
                        if (str.equals(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.f71465xd162f841)) {
                            c17 = 2;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.this.m138311x24b5e1bd(c28687x4bb242ff, result);
                        return;
                    case 1:
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.this.m138313x3edeaf19(c28687x4bb242ff, result);
                        return;
                    case 2:
                        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.this.m138312xeb564678(c28687x4bb242ff, result);
                        return;
                    default:
                        result.mo65719xbc9fa82f();
                        return;
                }
            }
        };
        this.f71468xf115c659 = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/scribe", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28684x5180d5ad.f71608x4fbc8495);
        this.f71467x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isFeatureAvailable */
    public void m138311x24b5e1bd(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        try {
            result.mo65720x90b54003(java.lang.Boolean.valueOf(this.f71469x4108303f.mo138315x24b5e1bd()));
        } catch (java.lang.IllegalStateException e17) {
            result.mo65718x5c4d208("error", e17.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isStylusHandwritingAvailable */
    public void m138312xeb564678(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (android.os.Build.VERSION.SDK_INT < 34) {
            result.mo65718x5c4d208("error", "Requires API level 34 or higher.", null);
            return;
        }
        try {
            result.mo65720x90b54003(java.lang.Boolean.valueOf(this.f71469x4108303f.mo138316xeb564678()));
        } catch (java.lang.IllegalStateException e17) {
            result.mo65718x5c4d208("error", e17.getMessage(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startStylusHandwriting */
    public void m138313x3edeaf19(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        if (android.os.Build.VERSION.SDK_INT < 33) {
            result.mo65718x5c4d208("error", "Requires API level 33 or higher.", null);
            return;
        }
        try {
            this.f71469x4108303f.mo138317x3edeaf19();
            result.mo65720x90b54003(null);
        } catch (java.lang.IllegalStateException e17) {
            result.mo65718x5c4d208("error", e17.getMessage(), null);
        }
    }

    /* renamed from: setScribeMethodHandler */
    public void m138314xe77ccc7d(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.ScribeMethodHandler scribeMethodHandler) {
        this.f71469x4108303f = scribeMethodHandler;
    }
}
