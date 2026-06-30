package ch0;

/* loaded from: classes8.dex */
public final class y implements tg0.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ch0.z f41258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI f41259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene$bindActivity$observer$1 f41260c;

    public y(ch0.z zVar, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI, com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene$bindActivity$observer$1 platformWSFScene$bindActivity$observer$1) {
        this.f41258a = zVar;
        this.f41259b = preLoadWebViewUI;
        this.f41260c = platformWSFScene$bindActivity$observer$1;
    }

    public void a() {
        java.lang.String content = "removing lifecycle observer for activity: " + this.f41258a.f41265e;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        this.f41259b.mo133getLifecycle().c(this.f41260c);
    }
}
