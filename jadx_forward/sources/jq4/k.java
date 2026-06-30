package jq4;

/* loaded from: classes5.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f382693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f382694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382693d = imageView;
        this.f382694e = bitmap;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jq4.k(this.f382693d, this.f382694e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jq4.k kVar = (jq4.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources(), this.f382694e);
        bitmapDrawable.setAlpha(230);
        bitmapDrawable.setFilterBitmap(true);
        this.f382693d.setBackground(bitmapDrawable);
        return jz5.f0.f384359a;
    }
}
