package ph4;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f436009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ph4.b f436010e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f436011f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ph4.j f436012g;

    public g(android.graphics.Bitmap bitmap, ph4.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, ph4.j jVar) {
        this.f436009d = bitmap;
        this.f436010e = bVar;
        this.f436011f = c16601x7ed0e40c;
        this.f436012g = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph4.b bVar = this.f436010e;
        android.graphics.Bitmap bitmap = this.f436009d;
        if (bitmap != null) {
            bVar.f435995e.setImageBitmap(bitmap);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "loadFallbackImage[bitmap is null] " + this.f436011f.f66791xc8a07680);
        this.f436012g.c(bVar);
    }
}
