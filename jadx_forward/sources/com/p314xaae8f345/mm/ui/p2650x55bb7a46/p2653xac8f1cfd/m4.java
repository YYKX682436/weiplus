package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes3.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f281010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f281011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f281012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(android.view.ViewGroup viewGroup, android.graphics.drawable.BitmapDrawable bitmapDrawable, android.graphics.Bitmap bitmap) {
        super(0);
        this.f281010d = viewGroup;
        this.f281011e = bitmapDrawable;
        this.f281012f = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f281010d.getOverlay().remove(this.f281011e);
        this.f281012f.recycle();
        return jz5.f0.f384359a;
    }
}
