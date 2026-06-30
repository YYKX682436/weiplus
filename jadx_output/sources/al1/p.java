package al1;

/* loaded from: classes7.dex */
public final class p implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f5799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ al1.q f5800e;

    public p(boolean z17, al1.q qVar) {
        this.f5799d = z17;
        this.f5800e = qVar;
    }

    @Override // l01.u
    public void b() {
        this.f5800e.getMOnViewCreated().invoke(null);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "AppBrandTradeOptionView";
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        boolean z17 = this.f5799d;
        al1.q qVar = this.f5800e;
        if (z17) {
            qVar.setMDmBitmap(bitmap);
        } else {
            qVar.setMLmBitmap(bitmap);
        }
        qVar.b(qVar.getMStyleColor());
        if (qVar.getMDmBitmap() != null) {
            if (qVar.getMLmBitmap() != null) {
                qVar.getMOnViewCreated().invoke(qVar);
            }
        }
    }
}
