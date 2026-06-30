package bg;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f101278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f101279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f101280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bg.d f101281g;

    public c(bg.d dVar, boolean z17, float f17, float f18) {
        this.f101281g = dVar;
        this.f101278d = z17;
        this.f101279e = f17;
        this.f101280f = f18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c c3961x5e8e15c = (com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c) this.f101281g.f101285c.get();
        if (c3961x5e8e15c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.TextureScaleLogic", "onTextureScale#ui, textureImageViewLike already release");
        } else if (this.f101278d) {
            c3961x5e8e15c.m32291x703ef060(this.f101279e);
        } else {
            c3961x5e8e15c.m32290xf492963d(this.f101280f);
        }
    }
}
