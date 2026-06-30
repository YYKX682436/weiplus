package b03;

/* loaded from: classes11.dex */
public final class b extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b03.l f16824b;

    public b(b03.l lVar) {
        this.f16824b = lVar;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        com.tencent.mars.xlog.Log.i(this.f16824b.f16842e, "backgroundCallback onEnterBackground");
        b03.l lVar = this.f16824b;
        if (lVar.f16841d != null) {
            synchronized (lVar.f16845h) {
                wu5.c cVar = lVar.f16844g;
                if (cVar != null) {
                    cVar.cancel(false);
                    lVar.f16844g = null;
                }
            }
        }
        this.f16824b.a(0L, b03.b0.f16826e);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        b03.l lVar = this.f16824b;
        com.tencent.mars.xlog.Log.i(lVar.f16842e, "backgroundCallback onExitBackground");
        lVar.b();
        if (lVar.f16840c) {
            ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).aj(true);
        }
    }
}
