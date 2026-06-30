package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes9.dex */
public final class a6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f232560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e8 f232562f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e8 e8Var) {
        super(0);
        this.f232560d = bitmap;
        this.f232561e = imageView;
        this.f232562f = e8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f232561e.setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.W(this.f232560d, 0.5f, 15, false, -1L));
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e8 e8Var = this.f232562f;
        if (e8Var != null) {
            android.graphics.Bitmap bitmap = this.f232560d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bitmap, "$bitmap");
            e8Var.a(bitmap);
        }
        return jz5.f0.f384359a;
    }
}
