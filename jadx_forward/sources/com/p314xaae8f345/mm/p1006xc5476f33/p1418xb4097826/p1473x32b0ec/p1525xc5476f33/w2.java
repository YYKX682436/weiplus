package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f196393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f196394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yf1 f196395f;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, r45.yf1 yf1Var) {
        this.f196394e = v3Var;
        this.f196395f = yf1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.yf1 yf1Var = this.f196395f;
        java.lang.Object obj = yf1Var.m75941xfb821914(0).get(this.f196393d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var = this.f196394e;
        v3Var.y1((r45.zf1) obj);
        this.f196393d = (this.f196393d + 1) % yf1Var.m75941xfb821914(0).size();
        v3Var.L.postDelayed(this, (yf1Var.m75939xb282bd08(1) > 0 ? java.lang.Integer.valueOf(yf1Var.m75939xb282bd08(1)) : java.lang.Float.valueOf(1000.0f)).longValue());
    }
}
