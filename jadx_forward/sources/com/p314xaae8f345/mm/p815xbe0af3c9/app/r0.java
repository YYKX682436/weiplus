package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public class r0 extends hm0.x {
    public r0(com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 c10820x69adf850) {
    }

    @Override // hm0.t
    public void b() {
        synchronized (com.p314xaae8f345.mm.app.p5.f135117b) {
            java.util.List list = com.p314xaae8f345.mm.app.p5.f135116a;
            synchronized (list) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    ((com.p314xaae8f345.mm.app.l5) it.next()).a();
                }
            }
            com.p314xaae8f345.mm.app.p5.f135117b[0] = true;
        }
    }
}
