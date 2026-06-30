package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba f210812d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba) {
        this.f210812d = activityC15007xc74afeba;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba activityC15007xc74afeba = this.f210812d;
        android.widget.ImageView imageView = activityC15007xc74afeba.T;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverImageView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (activityC15007xc74afeba.T == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverImageView");
            throw null;
        }
        layoutParams.height = (int) (r4.getWidth() * 1.3333334f);
        android.widget.ImageView imageView2 = activityC15007xc74afeba.T;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverImageView");
            throw null;
        }
    }
}
