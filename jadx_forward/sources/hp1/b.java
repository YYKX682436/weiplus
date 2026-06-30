package hp1;

/* loaded from: classes14.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 f364449d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f364450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 surfaceHolderCallbackC12878x44b43bc9, android.graphics.Bitmap bitmap) {
        super(0);
        this.f364449d = surfaceHolderCallbackC12878x44b43bc9;
        this.f364450e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1270x45c4fe06.SurfaceHolderCallbackC12878x44b43bc9 surfaceHolderCallbackC12878x44b43bc9 = this.f364449d;
        android.widget.ImageView imageView = surfaceHolderCallbackC12878x44b43bc9.f174511d;
        if (imageView != null) {
            imageView.setImageBitmap(this.f364450e);
        }
        android.widget.ImageView imageView2 = surfaceHolderCallbackC12878x44b43bc9.f174512e;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
