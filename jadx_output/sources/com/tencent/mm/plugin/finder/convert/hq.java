package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class hq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f103604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f103605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103606f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(android.graphics.Bitmap bitmap, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, in5.s0 s0Var) {
        super(0);
        this.f103604d = bitmap;
        this.f103605e = weImageView;
        this.f103606f = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f103604d;
        if (bitmap != null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f103605e;
            weImageView.setImageBitmap(bitmap);
            weImageView.setIconColor(i65.a.d(this.f103606f.f293121e, com.tencent.mm.R.color.FG_0));
        }
        return jz5.f0.f302826a;
    }
}
