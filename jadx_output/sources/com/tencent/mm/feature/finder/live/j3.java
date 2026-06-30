package com.tencent.mm.feature.finder.live;

/* loaded from: classes2.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f66785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f66786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, yz5.l lVar) {
        super(0);
        this.f66785d = imageView;
        this.f66786e = bitmap;
        this.f66787f = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f66785d;
        int i17 = imageView.getLayoutParams().height;
        android.graphics.Bitmap bitmap = this.f66786e;
        if (i17 > 0) {
            imageView.getLayoutParams().width = (int) java.lang.Math.ceil((imageView.getLayoutParams().height * bitmap.getWidth()) / bitmap.getHeight());
        }
        imageView.setImageBitmap(bitmap);
        imageView.setVisibility(0);
        yz5.l lVar = this.f66787f;
        if (lVar != null) {
            lVar.invoke(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
