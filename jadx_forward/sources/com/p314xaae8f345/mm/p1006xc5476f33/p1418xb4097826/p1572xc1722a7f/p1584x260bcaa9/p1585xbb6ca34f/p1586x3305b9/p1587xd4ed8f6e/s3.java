package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class s3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t3 f203466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f203467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t3 t3Var, int i17) {
        super(1);
        this.f203466d = t3Var;
        this.f203467e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.ViewGroup.LayoutParams layoutParams = it.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = this.f203466d.f203481e;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = it.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = this.f203467e;
        }
        return jz5.f0.f384359a;
    }
}
