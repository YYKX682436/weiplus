package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public class g implements pd1.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f87460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f87461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.pip.i f87462c;

    public g(com.tencent.mm.plugin.appbrand.pip.i iVar, android.graphics.Point point, java.lang.Runnable runnable) {
        this.f87462c = iVar;
        this.f87460a = point;
        this.f87461b = runnable;
    }

    @Override // pd1.i
    public void a(int i17, int i18) {
        if (this.f87462c.f87479i) {
            com.tencent.mars.xlog.Log.i(this.f87462c.f87471a, "handleVideoPage2PipStart, onVideoPositionGot, released");
            return;
        }
        android.graphics.Point point = this.f87460a;
        point.x = i17;
        point.y = i18;
        this.f87461b.run();
    }
}
