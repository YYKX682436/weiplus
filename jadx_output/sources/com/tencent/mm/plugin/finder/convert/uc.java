package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class uc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f104697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f104698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104699f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, in5.s0 s0Var) {
        super(0);
        this.f104697d = bitmap;
        this.f104698e = weImageView;
        this.f104699f = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f104697d;
        if (bitmap != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f104698e;
            weImageView.setLayerPaint(null);
            weImageView.setIconColor(0);
            weImageView.setImageBitmap(bitmap);
            weImageView.setIconColor(i65.a.d(this.f104699f.f293121e, com.tencent.mm.R.color.f479254u6));
        }
        return jz5.f0.f302826a;
    }
}
