package com.p314xaae8f345.mm.p2617xca9a2a67;

/* renamed from: com.tencent.mm.splash.SplashFallbackActivity */
/* loaded from: classes12.dex */
public class ActivityC21043xea5568b8 extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f275165f = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Handler f275166d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f275167e = new com.p314xaae8f345.mm.p2617xca9a2a67.o(this);

    @Override // android.app.Activity
    public void onBackPressed() {
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("MicroMsg.FallbackSplash", "block onBackPressed", new java.lang.Object[0]);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p2617xca9a2a67.j.d("MicroMsg.FallbackSplash", "onCreate", new java.lang.Object[0]);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("splash-activity");
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.f275166d = handler;
        handler.postDelayed(this.f275167e, 100L);
    }
}
