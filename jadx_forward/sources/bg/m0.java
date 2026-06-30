package bg;

/* loaded from: classes7.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f101350d;

    public m0(bg.f fVar) {
        this.f101350d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f101350d;
        if (fVar.f101297h != null) {
            if (fVar.T1.get() && fVar.S) {
                java.lang.String A = fVar.A();
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(fVar.D1 != null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A, "applySurface setSurface mSurfacePipSet:%b", objArr);
                if (fVar.D1 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "applySurface setSurface:%d", java.lang.Integer.valueOf(fVar.D1.hashCode()));
                }
                fVar.f101297h.mo1864x42c875eb(fVar.D1);
                return;
            }
            if (fVar.S) {
                return;
            }
            java.lang.String A2 = fVar.A();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Boolean.valueOf(fVar.f101296g != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(A2, "applySurface setSurface mSurface:%b", objArr2);
            fVar.f101297h.mo1864x42c875eb(fVar.f101296g);
        }
    }
}
