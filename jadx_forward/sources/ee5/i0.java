package ee5;

/* loaded from: classes9.dex */
public final class i0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd5.k f333456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ae5.a f333457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.n0 f333458f;

    public i0(zd5.k kVar, ae5.a aVar, ee5.n0 n0Var) {
        this.f333456d = kVar;
        this.f333457e = aVar;
        this.f333458f = n0Var;
    }

    @Override // l01.u
    public void b() {
        n11.a.b().h(this.f333457e.f85918n, ((ee5.a) this.f333456d).f333322m, this.f333458f.f333510s);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "SEARCH#" + ik1.i0.a(this);
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        zd5.k kVar = this.f333456d;
        if (bitmap == null || bitmap.isRecycled()) {
            n11.a.b().h(this.f333457e.f85918n, ((ee5.a) kVar).f333322m, this.f333458f.f333510s);
        } else {
            ((ee5.a) kVar).f333322m.setImageBitmap(bitmap);
        }
    }
}
