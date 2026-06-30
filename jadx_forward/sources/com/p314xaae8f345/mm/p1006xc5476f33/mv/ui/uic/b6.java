package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes9.dex */
public final class b6 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 f232589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f232590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e8 f232591c;

    public b6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h6 h6Var, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e8 e8Var) {
        this.f232589a = h6Var;
        this.f232590b = imageView;
        this.f232591c = e8Var;
    }

    @Override // p11.h
    public void a(java.lang.String url, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    @Override // p11.h
    public void b(java.lang.String url, android.view.View view, q11.b imageData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        java.lang.String str = this.f232589a.f232712d;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = url;
        objArr[1] = java.lang.Boolean.valueOf(imageData.f441067d != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onImageLoadFinish %s %b", objArr);
        android.graphics.Bitmap bitmap = imageData.f441067d;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.a6(imageData.f441067d, this.f232590b, this.f232591c));
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String url, android.view.View view, q11.b imageData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageData, "imageData");
        return null;
    }
}
