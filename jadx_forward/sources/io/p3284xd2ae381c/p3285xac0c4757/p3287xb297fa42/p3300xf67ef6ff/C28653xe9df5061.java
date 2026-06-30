package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff;

/* renamed from: io.flutter.embedding.engine.systemchannels.BackGestureChannel */
/* loaded from: classes15.dex */
public class C28653xe9df5061 {
    private static final java.lang.String TAG = "BackGestureChannel";

    /* renamed from: channel */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f71287x2c0b7d03;

    /* renamed from: defaultHandler */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler f71288xa0bfbdc9;

    public C28653xe9df5061(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.BackGestureChannel.1
            @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
            /* renamed from: onMethodCall */
            public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
                result.mo65720x90b54003(null);
            }
        };
        this.f71288xa0bfbdc9 = methodCallHandler;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = new io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2(c28604xeb2eb192, "flutter/backgesture", io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28692x4e7b5c98.f71637x4fbc8495);
        this.f71287x2c0b7d03 = c28688xe8dbe4c2;
        c28688xe8dbe4c2.m138441xdf757329(methodCallHandler);
    }

    /* renamed from: backEventToJsonMap */
    private java.util.Map<java.lang.String, java.lang.Object> m138153xe6533ba6(android.window.BackEvent backEvent) {
        java.util.HashMap hashMap = new java.util.HashMap(3);
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (java.lang.Float.isNaN(touchX) || java.lang.Float.isNaN(touchY)) ? null : java.util.Arrays.asList(java.lang.Float.valueOf(touchX), java.lang.Float.valueOf(touchY)));
        hashMap.put("progress", java.lang.Float.valueOf(backEvent.getProgress()));
        hashMap.put("swipeEdge", java.lang.Integer.valueOf(backEvent.getSwipeEdge()));
        return hashMap;
    }

    /* renamed from: cancelBackGesture */
    public void m138154xac37788() {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to cancel back gesture");
        this.f71287x2c0b7d03.m138438xd8c5c779("cancelBackGesture", null);
    }

    /* renamed from: commitBackGesture */
    public void m138155xd12554ab() {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to commit back gesture");
        this.f71287x2c0b7d03.m138438xd8c5c779("commitBackGesture", null);
    }

    /* renamed from: setMethodCallHandler */
    public void m138156xdf757329(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler) {
        this.f71287x2c0b7d03.m138441xdf757329(methodCallHandler);
    }

    /* renamed from: startBackGesture */
    public void m138157x66f1a0a0(android.window.BackEvent backEvent) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to start back gesture");
        this.f71287x2c0b7d03.m138438xd8c5c779("startBackGesture", m138153xe6533ba6(backEvent));
    }

    /* renamed from: updateBackGestureProgress */
    public void m138158x77f17326(android.window.BackEvent backEvent) {
        io.p3284xd2ae381c.Log.v(TAG, "Sending message to update back gesture progress");
        this.f71287x2c0b7d03.m138438xd8c5c779("updateBackGestureProgress", m138153xe6533ba6(backEvent));
    }
}
