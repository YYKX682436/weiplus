package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes10.dex */
public final class x0 implements r35.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.n f203553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f203554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a1 f203555c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f203556d;

    public x0(vp2.n nVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a1 a1Var, android.widget.ImageView imageView) {
        this.f203553a = nVar;
        this.f203554b = h0Var;
        this.f203555c = a1Var;
        this.f203556d = imageView;
    }

    public boolean a(android.graphics.Bitmap bitmap) {
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w0 w0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w0(this.f203553a, this.f203554b, this.f203555c, this.f203556d);
        ((ov.p0) j0Var).getClass();
        java.lang.Boolean bool = qp1.w.f447288a;
        if (bitmap != null && !bitmap.isRecycled()) {
            new i4.f(bitmap).a(new qp1.z(w0Var, 0));
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUtil", "getPrimaryColor, bitmap is null");
        w0Var.a(0);
        return true;
    }

    @Override // r35.q3
    /* renamed from: onFinish */
    public void mo58428x42fe6352() {
    }

    @Override // r35.q3
    /* renamed from: onStart */
    public void mo58429xb05099c3() {
    }
}
