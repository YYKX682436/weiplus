package ny;

/* loaded from: classes3.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny.g f422900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f422901e;

    public b(ny.g gVar, android.view.ViewGroup viewGroup) {
        this.f422900d = gVar;
        this.f422901e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ny.g gVar = this.f422900d;
        if (gVar.getParent() != null) {
            this.f422901e.removeView(gVar);
        }
        android.graphics.Bitmap bitmap = gVar.f422909d;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        gVar.f422909d = null;
    }
}
