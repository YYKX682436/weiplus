package bg;

/* loaded from: classes7.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg.f f19817d;

    public m0(bg.f fVar) {
        this.f19817d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        bg.f fVar = this.f19817d;
        if (fVar.f19764h != null) {
            if (fVar.T1.get() && fVar.S) {
                java.lang.String A = fVar.A();
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(fVar.D1 != null);
                com.tencent.mars.xlog.Log.i(A, "applySurface setSurface mSurfacePipSet:%b", objArr);
                if (fVar.D1 != null) {
                    com.tencent.mars.xlog.Log.i(fVar.A(), "applySurface setSurface:%d", java.lang.Integer.valueOf(fVar.D1.hashCode()));
                }
                fVar.f19764h.setSurface(fVar.D1);
                return;
            }
            if (fVar.S) {
                return;
            }
            java.lang.String A2 = fVar.A();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Boolean.valueOf(fVar.f19763g != null);
            com.tencent.mars.xlog.Log.i(A2, "applySurface setSurface mSurface:%b", objArr2);
            fVar.f19764h.setSurface(fVar.f19763g);
        }
    }
}
