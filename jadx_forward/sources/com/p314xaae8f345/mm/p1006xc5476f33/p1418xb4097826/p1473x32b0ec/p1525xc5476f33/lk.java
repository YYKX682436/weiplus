package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class lk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f194939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f194940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f194941f;

    public lk(bm2.a4 a4Var, java.lang.String str, java.lang.String str2) {
        this.f194939d = a4Var;
        this.f194940e = str;
        this.f194941f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.n3 n3Var;
        bm2.a4 a4Var = this.f194939d;
        a4Var.getClass();
        java.lang.String giftId = this.f194940e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "curGiftId");
        java.util.ArrayList arrayList = a4Var.f103300g;
        int size = arrayList.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                n3Var = null;
                break;
            }
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            ce2.i iVar = (ce2.i) obj;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = a4Var.f103298e.p0(i17);
            n3Var = p07 instanceof bm2.n3 ? (bm2.n3) p07 : null;
            if (n3Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar.f67814x2c488eb6, giftId)) {
                break;
            } else {
                i17++;
            }
        }
        if (n3Var != null) {
            android.view.View view = n3Var.f103753d;
            if (view != null) {
                view.performClick();
            }
            java.lang.String str = this.f194941f;
            if (str != null) {
                java.lang.String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftId, "giftId");
                    n3Var.i(giftId, 2);
                    n3Var.f103670q.m57343x1daec333(str2);
                }
            }
        }
    }
}
