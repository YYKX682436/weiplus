package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.RestorationChannel */
/* loaded from: classes15.dex */
public class C28667xaf6b2a5 {
    private static final java.lang.String TAG = "RestorationChannel";

    /* renamed from: channel */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71454x2c0b7d03;

    /* renamed from: engineHasProvidedData */
    private boolean f71455x766f4145;

    /* renamed from: frameworkHasRequestedData */
    private boolean f71456xede835dc;

    /* renamed from: handler */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71457x294b574a;

    /* renamed from: pendingFrameworkRestorationChannelRequest */
    private io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result f71458x1ae90be3;

    /* renamed from: restorationData */
    private byte[] f71459xcf6bb568;

    /* renamed from: waitForRestorationData */
    public final boolean f71460x41324fb4;

    public C28667xaf6b2a5(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192, boolean z17) {
        this(new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/restoration", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495), z17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: packageData */
    public java.util.Map<java.lang.String, java.lang.Object> m138303x36260510(byte[] bArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("enabled", java.lang.Boolean.TRUE);
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, bArr);
        return hashMap;
    }

    /* renamed from: clearData */
    public void m138304xb4382b97() {
        this.f71459xcf6bb568 = null;
    }

    /* renamed from: getRestorationData */
    public byte[] m138305xb3cd8732() {
        return this.f71459xcf6bb568;
    }

    /* renamed from: setRestorationData */
    public void m138306xeaa420a6(final byte[] bArr) {
        this.f71455x766f4145 = true;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result = this.f71458x1ae90be3;
        if (result != null) {
            result.mo65720x90b54003(m138303x36260510(bArr));
            this.f71458x1ae90be3 = null;
            this.f71459xcf6bb568 = bArr;
        } else if (this.f71456xede835dc) {
            this.f71454x2c0b7d03.m138439xd8c5c779(com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63, m138303x36260510(bArr), new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.1
                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
                /* renamed from: error */
                public void mo65718x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
                    io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5.TAG, "Error " + str + " while sending restoration data to framework: " + str2);
                }

                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
                /* renamed from: notImplemented */
                public void mo65719xbc9fa82f() {
                }

                @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
                /* renamed from: success */
                public void mo65720x90b54003(java.lang.Object obj) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5.this.f71459xcf6bb568 = bArr;
                }
            });
        } else {
            this.f71459xcf6bb568 = bArr;
        }
    }

    public C28667xaf6b2a5(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2, boolean z17) {
        this.f71455x766f4145 = false;
        this.f71456xede835dc = false;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.RestorationChannel.2
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
                java.lang.Object obj = c28687x4bb242ff.f71609x86ac7956;
                str.getClass();
                if (!str.equals("get")) {
                    if (!str.equals("put")) {
                        result.mo65719xbc9fa82f();
                        return;
                    }
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5.this.f71459xcf6bb568 = (byte[]) obj;
                    result.mo65720x90b54003(null);
                    return;
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5.this.f71456xede835dc = true;
                if (!io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5.this.f71455x766f4145) {
                    io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5 c28667xaf6b2a5 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5.this;
                    if (c28667xaf6b2a5.f71460x41324fb4) {
                        c28667xaf6b2a5.f71458x1ae90be3 = result;
                        return;
                    }
                }
                io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5 c28667xaf6b2a52 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28667xaf6b2a5.this;
                result.mo65720x90b54003(c28667xaf6b2a52.m138303x36260510(c28667xaf6b2a52.f71459xcf6bb568));
            }
        };
        this.f71457x294b574a = methodCallHandler;
        this.f71454x2c0b7d03 = c28688xe8dbe4c2;
        this.f71460x41324fb4 = z17;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }
}
