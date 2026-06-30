package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class ah implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f210396a;

    public ah(ya2.b2 b2Var) {
        this.f210396a = b2Var;
    }

    public final void a(java.lang.String str, android.widget.ImageView imageView, boolean z17) {
        ya2.b2 b2Var = this.f210396a;
        if (b2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderSettingInfoUI", "error self contact is null");
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b2Var);
        mn2.n nVar = new mn2.n(b2Var.f69301x81118c51, null, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
    }
}
