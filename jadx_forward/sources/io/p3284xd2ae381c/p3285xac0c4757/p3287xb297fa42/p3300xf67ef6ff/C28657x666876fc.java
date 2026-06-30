package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.KeyboardChannel */
/* loaded from: classes15.dex */
public class C28657x666876fc {

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71298x2c0b7d03;

    /* renamed from: keyboardMethodHandler */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28657x666876fc.KeyboardMethodHandler f71299xb2891a82;

    /* renamed from: parsingMethodHandler */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71300xf115c659;

    /* renamed from: io.flutter.embedding.engine.systemchannels.KeyboardChannel$KeyboardMethodHandler */
    /* loaded from: classes15.dex */
    public interface KeyboardMethodHandler {
        /* renamed from: getKeyboardState */
        java.util.Map<java.lang.Long, java.lang.Long> mo44270x3f607534();
    }

    public C28657x666876fc(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.KeyboardChannel.1

            /* renamed from: pressedState */
            java.util.Map<java.lang.Long, java.lang.Long> f71301xdfb06d8f = new java.util.HashMap();

            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                if (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28657x666876fc.this.f71299xb2891a82 == null) {
                    result.mo65720x90b54003(this.f71301xdfb06d8f);
                    return;
                }
                java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
                str.getClass();
                if (!str.equals("getKeyboardState")) {
                    result.mo65719xbc9fa82f();
                    return;
                }
                try {
                    this.f71301xdfb06d8f = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28657x666876fc.this.f71299xb2891a82.mo44270x3f607534();
                } catch (java.lang.IllegalStateException e17) {
                    result.mo65718x5c4d208("error", e17.getMessage(), null);
                }
                result.mo65720x90b54003(this.f71301xdfb06d8f);
            }
        };
        this.f71300xf115c659 = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(interfaceC28679x1b8c77f2, "flutter/keyboard", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
        this.f71298x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* renamed from: setKeyboardMethodHandler */
    public void m138169x8e479f40(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28657x666876fc.KeyboardMethodHandler keyboardMethodHandler) {
        this.f71299xb2891a82 = keyboardMethodHandler;
    }
}
