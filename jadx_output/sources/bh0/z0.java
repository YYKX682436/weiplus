package bh0;

/* loaded from: classes.dex */
public class z0 extends com.tencent.mm.sdk.event.n {
    public z0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent onSearchSearchBoxCtrlInfoChangedEvent = (com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent) iEvent;
        if (onSearchSearchBoxCtrlInfoChangedEvent.f54583g.f6362a == 0) {
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181424d = 0;
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181425e = null;
        } else {
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181424d = 1;
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181425e = new r45.v97();
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181425e.f388014d = 1L;
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181425e.f388015e = new r45.yn();
            r45.yn ynVar = ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181425e.f388015e;
            am.cn cnVar = onSearchSearchBoxCtrlInfoChangedEvent.f54583g;
            ynVar.f391222d = cnVar.f6363b;
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181425e.f388015e.f391223e = cnVar.f6364c;
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181425e.f388015e.f391224f = cnVar.f6365d;
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).f181425e.f388015e.f391225g = cnVar.f6366e;
        }
        return false;
    }
}
