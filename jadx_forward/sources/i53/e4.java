package i53;

/* loaded from: classes8.dex */
public class e4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15913x621c3a4c f370102f;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15913x621c3a4c activityC15913x621c3a4c, java.lang.String str, java.lang.String str2) {
        this.f370102f = activityC15913x621c3a4c;
        this.f370100d = str;
        this.f370101e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15913x621c3a4c.f221616w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.ActivityC15913x621c3a4c activityC15913x621c3a4c = this.f370102f;
        java.lang.String O6 = activityC15913x621c3a4c.O6(this.f370100d, this.f370101e);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", O6);
        j45.l.n(activityC15913x621c3a4c.f221617e, "webview", ".ui.tools.WebViewUI", intent, 131);
    }
}
