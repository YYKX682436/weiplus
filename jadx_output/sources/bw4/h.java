package bw4;

/* loaded from: classes8.dex */
public class h implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar f24942d;

    public h(com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar) {
        this.f24942d = webSearchWebVideoViewControlBar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = com.tencent.mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar.P;
        return this.f24942d.A();
    }
}
