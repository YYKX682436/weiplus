package ht0;

/* loaded from: classes10.dex */
public class k implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.s f366237d;

    public k(ht0.s sVar) {
        this.f366237d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecGLInitFailed");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(985L, 15L, 1L);
        }
        java.lang.Object obj2 = ht0.s.f366284a0;
        synchronized (obj2) {
            try {
                this.f366237d.V = true;
                obj2.notifyAll();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Media.MediaCodecMP4MuxRecorder", e17, "[" + hashCode() + "] initSurfaceLock notify error", new java.lang.Object[0]);
            }
        }
        return null;
    }
}
