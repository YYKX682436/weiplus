package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class de extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f210601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f210602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f210603f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, android.graphics.Bitmap bitmap, r45.mb4 mb4Var) {
        super(0);
        this.f210601d = activityC15059x3e98c949;
        this.f210602e = bitmap;
        this.f210603f = mb4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = this.f210602e;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.f210201e2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f210601d;
        activityC15059x3e98c949.q7(width, height);
        cw2.aa i76 = activityC15059x3e98c949.i7();
        android.view.View mo122850xfb86a31b = i76 != null ? i76.mo122850xfb86a31b() : null;
        android.widget.ImageView imageView = mo122850xfb86a31b instanceof android.widget.ImageView ? (android.widget.ImageView) mo122850xfb86a31b : null;
        if (imageView == null) {
            imageView = new android.widget.ImageView(activityC15059x3e98c949.mo55332x76847179());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa = activityC15059x3e98c949.f210211u;
        if (c22678xac4e51fa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cropLayout");
            throw null;
        }
        c22678xac4e51fa.G(imageView, bitmap.getWidth(), bitmap.getHeight(), new android.graphics.Matrix(), ml5.k.f409963d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.be.f210481d);
        activityC15059x3e98c949.p7();
        imageView.setImageBitmap(bitmap);
        r45.mb4 mb4Var = this.f210603f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.d7(activityC15059x3e98c949, mb4Var.m75933x41a8a7f2(13), (r45.dd4) mb4Var.m75936x14adae67(14), bitmap);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22678xac4e51fa c22678xac4e51fa2 = activityC15059x3e98c949.f210211u;
        if (c22678xac4e51fa2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cropLayout");
            throw null;
        }
        c22678xac4e51fa2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ce(activityC15059x3e98c949, bitmap));
        android.view.View view = activityC15059x3e98c949.G;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectBtn");
            throw null;
        }
        view.setEnabled(true);
        android.view.View view2 = activityC15059x3e98c949.N;
        if (view2 != null) {
            view2.setEnabled(true);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewBtn");
        throw null;
    }
}
