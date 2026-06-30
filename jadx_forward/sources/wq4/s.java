package wq4;

/* loaded from: classes14.dex */
public class s implements java.lang.Runnable {
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65 c18924x4c862f65) {
    }

    @Override // java.lang.Runnable
    public void run() {
        br4.e b17 = br4.e.b();
        b17.getClass();
        try {
            if (b17.f105253c != null) {
                is0.c cVar = b17.f105252b;
                if (cVar != null) {
                    cVar.close();
                }
                b17.f105253c.release();
                b17.f105253c = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipHardDecodeUtil", "uninit surface texture");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipHardDecodeUtil", e17, "uninitSurfaceTexture error", new java.lang.Object[0]);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenGlRender", "releaseSurfaceTexture call finish");
        java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.D;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e18) {
                int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2349x6b0147b.C18924x4c862f65.A;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("OpenGlRender", e18, "", new java.lang.Object[0]);
            }
        }
    }
}
