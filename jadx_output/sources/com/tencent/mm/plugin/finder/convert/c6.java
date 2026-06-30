package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class c6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f103026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f103027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f103026d = imageView;
        this.f103027e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f103026d.setImageBitmap(this.f103027e);
        return jz5.f0.f302826a;
    }
}
