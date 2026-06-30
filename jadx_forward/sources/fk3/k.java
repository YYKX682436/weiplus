package fk3;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kk3.d f345106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f345108g;

    public k(fk3.o oVar, kk3.d dVar, android.graphics.Bitmap bitmap, int i17) {
        this.f345105d = oVar;
        this.f345106e = dVar;
        this.f345107f = bitmap;
        this.f345108g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fk3.o oVar = this.f345105d;
        ek3.e eVar = oVar.f345121d;
        if (eVar != null) {
            eVar.setTranslationX(0.0f);
        }
        ek3.e eVar2 = oVar.f345121d;
        if (eVar2 != null) {
            eVar2.setTranslationY(0.0f);
        }
        ek3.e eVar3 = oVar.f345121d;
        if (eVar3 != null) {
            eVar3.setScaleX(1.0f);
        }
        ek3.e eVar4 = oVar.f345121d;
        if (eVar4 != null) {
            eVar4.setScaleY(1.0f);
        }
        kk3.d dVar = this.f345106e;
        if (dVar != null) {
            dVar.d(this.f345107f, false, this.f345108g);
        }
    }
}
