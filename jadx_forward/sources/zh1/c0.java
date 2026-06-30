package zh1;

/* loaded from: classes8.dex */
public final class c0 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.h4 f554400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zh1.r0 f554401e;

    public c0(db5.h4 h4Var, zh1.r0 r0Var) {
        this.f554400d = h4Var;
        this.f554401e = r0Var;
    }

    @Override // l01.u
    public void b() {
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return ik1.i0.a(this);
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "onBitmapLoaded, bitmap is null");
        } else {
            this.f554400d.e(new android.graphics.drawable.BitmapDrawable(this.f554401e.d(bitmap)), 0);
        }
    }
}
