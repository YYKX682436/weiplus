package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.SensitiveContentChannel */
/* loaded from: classes14.dex */
public class C28669x8d394a60 {

    /* renamed from: AUTO_SENSITIVE_CONTENT_SENSITIVITY */
    public static final int f71471x24ed1c0 = 0;

    /* renamed from: NOT_SENSITIVE_CONTENT_SENSITIVITY */
    public static final int f71472xcbf28bc4 = 2;

    /* renamed from: SENSITIVE_CONTENT_SENSITIVITY */
    public static final int f71473x50de2850 = 1;
    private static final java.lang.String TAG = "SensitiveContentChannel";

    /* renamed from: UNKNOWN_CONTENT_SENSITIVITY */
    public static final int f71474x61002004 = 3;

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71475x2c0b7d03;

    /* renamed from: parsingMethodHandler */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71476xf115c659;

    /* renamed from: sensitiveContentMethodHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.SensitiveContentMethodHandler f71477x80fcb2e6;

    /* renamed from: io.flutter.embedding.engine.systemchannels.SensitiveContentChannel$SensitiveContentMethodHandler */
    /* loaded from: classes14.dex */
    public interface SensitiveContentMethodHandler {
        /* renamed from: getContentSensitivity */
        int mo138324x4fe19e5c();

        /* renamed from: isSupported */
        boolean mo138325x450f16a4();

        /* renamed from: setContentSensitivity */
        void mo138326xe70d2068(int i17);
    }

    public C28669x8d394a60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.SensitiveContentChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.this.f71477x80fcb2e6 == null) {
                    return;
                }
                java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
                io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.TAG, "Received '" + str + "' message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1937987631:
                        if (str.equals("SensitiveContent.getContentSensitivity")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case 598223325:
                        if (str.equals("SensitiveContent.setContentSensitivity")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 1615625817:
                        if (str.equals("SensitiveContent.isSupported")) {
                            c17 = 2;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        try {
                            result.mo65720x90b54003(java.lang.Integer.valueOf(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.this.m138322xede26766(java.lang.Integer.valueOf(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.this.f71477x80fcb2e6.mo138324x4fe19e5c()).intValue())));
                            return;
                        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e17) {
                            result.mo65718x5c4d208("error", e17.getMessage(), null);
                            return;
                        }
                    case 1:
                        try {
                            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.this.f71477x80fcb2e6.mo138326xe70d2068(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.this.m138321x138f9245(((java.lang.Integer) c28687x4bb242ff.m138434x86ac7956()).intValue()));
                            return;
                        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e18) {
                            result.mo65718x5c4d208("error", e18.getMessage(), null);
                            return;
                        }
                    case 2:
                        result.mo65720x90b54003(java.lang.Boolean.valueOf(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.this.f71477x80fcb2e6.mo138325x450f16a4()));
                        return;
                    default:
                        io.p3284xd2ae381c.Log.v(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.TAG, "Method " + str + " is not implemented for the SensitiveContentChannel.");
                        result.mo65719xbc9fa82f();
                        return;
                }
            }
        };
        this.f71476xf115c659 = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/sensitivecontent", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
        this.f71475x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: deserializeContentSensitivity */
    public int m138321x138f9245(int i17) {
        if (i17 == 0) {
            return 0;
        }
        if (i17 == 1) {
            return 1;
        }
        if (i17 == 2) {
            return 2;
        }
        throw new java.lang.IllegalArgumentException("contentSensitivityIndex " + i17 + " not known to the SensitiveContentChannel.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: serializeContentSensitivity */
    public int m138322xede26766(int i17) {
        if (i17 == 0) {
            return 0;
        }
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 3;
            }
        }
        return i18;
    }

    /* renamed from: setSensitiveContentMethodHandler */
    public void m138323x12c199a4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28669x8d394a60.SensitiveContentMethodHandler sensitiveContentMethodHandler) {
        this.f71477x80fcb2e6 = sensitiveContentMethodHandler;
    }
}
