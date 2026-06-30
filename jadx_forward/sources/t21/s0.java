package t21;

/* loaded from: classes12.dex */
public class s0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.v0 f496483d;

    public s0(t21.v0 v0Var) {
        this.f496483d = v0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        t21.v0 v0Var = this.f496483d;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetScenePreloadVideoFake", "%d preload video error startRet[%d]", java.lang.Integer.valueOf(v0Var.hashCode()), java.lang.Integer.valueOf(i17));
            t21.u0 u0Var = v0Var.f496527r;
            if (u0Var != null) {
                u0Var.a(v0Var, false, 0, 0);
            }
        }
        if (gVar != null) {
            v0Var.hashCode();
        }
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video error [%d]", java.lang.Integer.valueOf(v0Var.hashCode()), java.lang.Integer.valueOf(hVar.f69553xb5f54fe9));
            if (hVar.f69553xb5f54fe9 != 0) {
                t21.u0 u0Var2 = v0Var.f496527r;
                if (u0Var2 != null) {
                    u0Var2.a(v0Var, false, 0, 0);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetScenePreloadVideoFake", "%d preload video download all video file", java.lang.Integer.valueOf(v0Var.hashCode()));
                v0Var.f(v0Var.f496515f, (int) hVar.f69523x17c343e7, v0Var.f496516g);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
