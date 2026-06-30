package jq4;

/* loaded from: classes2.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f382744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f382746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f382747g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(android.widget.ImageView imageView, android.view.View view, android.view.View view2, android.graphics.Bitmap bitmap, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382744d = imageView;
        this.f382745e = view;
        this.f382746f = view2;
        this.f382747g = bitmap;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jq4.w0(this.f382744d, this.f382745e, this.f382746f, this.f382747g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jq4.w0 w0Var = (jq4.w0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        w0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.widget.ImageView imageView = this.f382744d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.view.View view = this.f382746f;
        layoutParams.width = view.getWidth();
        layoutParams.height = view.getHeight();
        imageView.setLayoutParams(layoutParams);
        android.view.View view2 = this.f382745e;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.width = view.getWidth();
        layoutParams2.height = view.getHeight();
        view2.setLayoutParams(layoutParams2);
        view2.setBackground(new android.graphics.drawable.BitmapDrawable(view.getResources(), this.f382747g));
        return jz5.f0.f384359a;
    }
}
