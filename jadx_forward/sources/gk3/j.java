package gk3;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f354048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f354049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f354050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gk3.m f354051g;

    public j(kk3.d dVar, android.graphics.Bitmap bitmap, int i17, gk3.m mVar) {
        this.f354048d = dVar;
        this.f354049e = bitmap;
        this.f354050f = i17;
        this.f354051g = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f354048d;
        if (dVar != null) {
            dVar.b(this.f354049e, this.f354050f);
        }
        gk3.m mVar = this.f354051g;
        ek3.e eVar = mVar.f354061d;
        if (eVar != null) {
            if ((eVar != null ? eVar.getParent() : null) != null) {
                ek3.e eVar2 = mVar.f354061d;
                android.view.ViewParent parent = eVar2 != null ? eVar2.getParent() : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(mVar.f354061d);
            }
        }
    }
}
