package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes2.dex */
public final class x2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f197279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f197280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(android.graphics.Bitmap bitmap, android.view.View view, java.lang.String str) {
        super(0);
        this.f197279d = bitmap;
        this.f197280e = view;
        this.f197281f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f197279d;
        if (bitmap != null) {
            android.view.View view = this.f197280e;
            view.setBackgroundDrawable(new android.graphics.drawable.BitmapDrawable(view.getContext().getResources(), bitmap));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SquareConvertUtil", "bindHighTagView background resource is null, url = " + this.f197281f);
        }
        return jz5.f0.f384359a;
    }
}
