package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p815xbe0af3c9.app.s f150051d;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f150052a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f150053b;

    /* renamed from: c, reason: collision with root package name */
    public final lm5.d f150054c;

    public s(java.lang.String str, int i17) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(str, i17);
        this.f150052a = handlerThread;
        handlerThread.start();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread.getLooper());
        this.f150053b = n3Var;
        this.f150054c = new lm5.j(new pq5.e(n3Var), str);
    }
}
