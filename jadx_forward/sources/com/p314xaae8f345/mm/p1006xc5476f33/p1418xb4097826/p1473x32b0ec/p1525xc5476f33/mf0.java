package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class mf0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f195025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f195026e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf0(android.view.View view, android.graphics.Bitmap bitmap) {
        super(0);
        this.f195025d = view;
        this.f195026e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f195025d;
        view.setBackground(new android.graphics.drawable.BitmapDrawable(view.getContext().getResources(), this.f195026e));
        return jz5.f0.f384359a;
    }
}
