package com.tencent.mm.plugin.downloader.event;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class b implements com.tencent.mm.ipcinvoker.j {
    private b() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.downloader.event.c.f96910g).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.luggage.d) ((vz.j1) it.next())).a(bundle);
        }
    }
}
