package bw4;

/* loaded from: classes8.dex */
public class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar f24941d;

    public g(com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar) {
        this.f24941d = webSearchWebVideoViewControlBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = this.f24941d;
        webSearchWebVideoViewControlBar.setVisibility(8);
        webSearchWebVideoViewControlBar.L.d();
        return false;
    }
}
