package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes10.dex */
public final class w0 implements pv.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.n f203527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f203528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a1 f203529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f203530d;

    public w0(vp2.n nVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a1 a1Var, android.widget.ImageView imageView) {
        this.f203527a = nVar;
        this.f203528b = h0Var;
        this.f203529c = a1Var;
        this.f203530d = imageView;
    }

    public final void a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#bind nickName=");
        vp2.n nVar = this.f203527a;
        sb6.append(nVar.getFeedObject().m59273x80025a04());
        sb6.append(" load with url onProcessBitmap: color=");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeadLivingConvert", sb6.toString());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a1.f203097h).put(this.f203528b.f391656d, valueOf);
        this.f203529c.n(i17, this.f203530d, nVar);
    }
}
