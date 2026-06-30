package ny;

/* loaded from: classes3.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny.g f422902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f422903e;

    public c(ny.g gVar, android.view.ViewGroup viewGroup) {
        this.f422902d = gVar;
        this.f422903e = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ny.g gVar = this.f422902d;
        if (gVar.getParent() != null) {
            this.f422903e.removeView(gVar);
        }
        android.graphics.Bitmap bitmap = gVar.f422909d;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        gVar.f422909d = null;
    }
}
