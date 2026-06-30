package com.tencent.mm.plugin.downloader_app.model;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class k0 implements com.tencent.mm.ipcinvoker.j {
    private k0() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17 = ((android.os.Bundle) obj).getBoolean("show");
        java.util.Iterator it = com.tencent.mm.plugin.downloader_app.model.l0.D.iterator();
        while (it.hasNext()) {
            ((m02.u) it.next()).a(z17);
        }
    }
}
