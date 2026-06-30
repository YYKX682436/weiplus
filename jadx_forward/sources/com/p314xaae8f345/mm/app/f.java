package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.w f134946e;

    public f(com.p314xaae8f345.mm.app.w wVar, java.lang.String str) {
        this.f134946e = wVar;
        this.f134945d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE");
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", this.f134945d);
        this.f134946e.f135423o.f135309b.onReceive(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent);
    }
}
