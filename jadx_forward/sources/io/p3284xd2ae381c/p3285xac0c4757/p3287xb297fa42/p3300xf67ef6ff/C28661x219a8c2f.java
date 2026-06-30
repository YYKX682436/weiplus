package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.NavigationChannel */
/* loaded from: classes15.dex */
public class C28661x219a8c2f {
    private static final java.lang.String TAG = "NavigationChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71323x2c0b7d03;

    /* renamed from: defaultHandler */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71324xa0bfbdc9;

    public C28661x219a8c2f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.NavigationChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                result.mo65720x90b54003(null);
            }
        };
        this.f71324xa0bfbdc9 = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/navigation", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28684x5180d5ad.f71608x4fbc8495);
        this.f71323x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* renamed from: popRoute */
    public void m138190x262dda78() {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to pop route.");
        this.f71323x2c0b7d03.m138438xd8c5c779("popRoute", null);
    }

    /* renamed from: pushRoute */
    public void m138191xd176734f(java.lang.String str) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to push route '" + str + "'");
        this.f71323x2c0b7d03.m138438xd8c5c779("pushRoute", str);
    }

    /* renamed from: pushRouteInformation */
    public void m138192xcea5d25d(java.lang.String str) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to push route information '" + str + "'");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.f77489x9ff58fb5, str);
        this.f71323x2c0b7d03.m138438xd8c5c779("pushRouteInformation", hashMap);
    }

    /* renamed from: setInitialRoute */
    public void m138193x7e19e2e7(java.lang.String str) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to set initial route to '" + str + "'");
        this.f71323x2c0b7d03.m138438xd8c5c779("setInitialRoute", str);
    }

    /* renamed from: setMethodCallHandler */
    public void m138194xdf757329(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler) {
        this.f71323x2c0b7d03.m138441xdf757329(methodCallHandler);
    }
}
