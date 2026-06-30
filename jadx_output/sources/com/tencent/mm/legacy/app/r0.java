package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class r0 extends hm0.x {
    public r0(com.tencent.mm.legacy.app.WeChatSplashStartup weChatSplashStartup) {
    }

    @Override // hm0.t
    public void b() {
        synchronized (com.tencent.mm.app.p5.f53584b) {
            java.util.List list = com.tencent.mm.app.p5.f53583a;
            synchronized (list) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((com.tencent.mm.app.l5) it.next()).a();
                }
            }
            com.tencent.mm.app.p5.f53584b[0] = true;
        }
    }
}
