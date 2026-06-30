package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tv extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f196011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f196012e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f196011d = owVar;
        this.f196012e = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f196011d;
        java.lang.String str = owVar.f195320p;
        android.widget.FrameLayout A1 = owVar.A1();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f196012e;
        A1.removeView((android.view.View) h0Var.f391656d);
        ((android.widget.ImageView) h0Var.f391656d).setImageBitmap(null);
        return java.lang.Boolean.valueOf(owVar.Z.offer(h0Var.f391656d));
    }
}
