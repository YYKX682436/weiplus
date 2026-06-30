package nq;

/* loaded from: classes8.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 f420413d;

    public h(com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.C10434xd4fc3d40 c10434xd4fc3d40, nq.g gVar) {
        this.f420413d = c10434xd4fc3d40;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nq.f fVar = this.f420413d.f146411t;
        if (fVar != null) {
            try {
                mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo NativeRender release", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p676x4c4db2ad.p677x633fb29.C10432x58e9524 c10432x58e9524 = fVar.f420400a;
                if (c10432x58e9524 != null) {
                    c10432x58e9524.a();
                }
                fVar.f420404e = null;
                mq.h.b("MicroMsg.DynamicBgSurfaceView", "alvinluo SurfaceView reset and nativeRelease", new java.lang.Object[0]);
                fVar.f420402c = 0;
                fVar.f420403d = 0;
                fVar.f420411l = false;
                fVar.f420405f = false;
                fVar.f420407h = false;
                fVar.f420406g = false;
            } catch (java.lang.Throwable th6) {
                mq.h.c("MicroMsg.DynamicBgSurfaceView", th6, "alvinluo nativeRelease exception", new java.lang.Object[0]);
            }
        }
    }
}
