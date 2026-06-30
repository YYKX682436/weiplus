package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.w f53413e;

    public f(com.tencent.mm.app.w wVar, java.lang.String str) {
        this.f53413e = wVar;
        this.f53412d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.AppForegroundDelegate.ACTION_ACTIVE");
        intent.putExtra("com.tencent.mm.AppForegroundDelegate.ACTIVITY_NAME", this.f53412d);
        this.f53413e.f53890o.f53776b.onReceive(com.tencent.mm.sdk.platformtools.x2.f193071a, intent);
    }
}
