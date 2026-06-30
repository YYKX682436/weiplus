package fk3;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk3.o f345076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f345077e;

    public b(fk3.o oVar, android.graphics.Bitmap bitmap) {
        this.f345076d = oVar;
        this.f345077e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kk3.d dVar = this.f345076d.f345122e;
        if (dVar != null) {
            dVar.b(this.f345077e, 3);
        }
    }
}
