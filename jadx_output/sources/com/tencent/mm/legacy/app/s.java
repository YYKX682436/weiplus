package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class s {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.legacy.app.s f68518d;

    /* renamed from: a, reason: collision with root package name */
    public final android.os.HandlerThread f68519a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f68520b;

    /* renamed from: c, reason: collision with root package name */
    public final lm5.d f68521c;

    public s(java.lang.String str, int i17) {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread(str, i17);
        this.f68519a = handlerThread;
        handlerThread.start();
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3(handlerThread.getLooper());
        this.f68520b = n3Var;
        this.f68521c = new lm5.j(new pq5.e(n3Var), str);
    }
}
