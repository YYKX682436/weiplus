package fh1;

/* loaded from: classes7.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f344120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344121e;

    public q0(fq0.x xVar, int i17) {
        this.f344120d = xVar;
        this.f344121e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.lang.Integer num = (java.lang.Integer) fh1.x0.K.get(this.f344120d.f347011b);
        fh1.o0 o0Var = (fh1.o0) fh1.x0.f344154J.get(num);
        jc3.o oVar = fh1.x0.P;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasIdAndFrameSetIdBind canvasId:" + this.f344121e + ", textureId:" + num + ", surfaceTexture:" + o0Var + ", canvasEventConsumer:" + oVar);
        if (o0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclMBFrameBiz", "mbFrameSurface is null, return");
            return;
        }
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicSclMBFrameBiz", "canvasEventConsumer is null when runnable executes, canvasId:" + this.f344121e + ", return");
            return;
        }
        int i17 = this.f344121e;
        o0Var.f344106b = i17;
        o0Var.f344107c = oVar;
        ((rc3.w0) oVar).pg(i17, (android.view.Surface) ((jz5.n) o0Var.f344108d).mo141623x754a37bb(), 100, 100);
        android.util.SparseIntArray sparseIntArray = fh1.x0.M;
        int i18 = this.f344121e;
        synchronized (sparseIntArray) {
            int indexOfKey = sparseIntArray.indexOfKey(i18);
            if (indexOfKey >= 0) {
                sparseIntArray.removeAt(indexOfKey);
                z17 = true;
            } else {
                z17 = false;
            }
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasIdAndFrameSetIdBind redraw for canvasId:" + this.f344121e);
            this.f344120d.f();
        }
    }
}
