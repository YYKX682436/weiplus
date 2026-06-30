package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class eg extends zd4.o {

    /* renamed from: b, reason: collision with root package name */
    public final int f255384b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.CharSequence f255385c;

    public eg(int i17, java.lang.CharSequence lastRangeDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastRangeDesc, "lastRangeDesc");
        this.f255384b = i17;
        this.f255385c = lastRangeDesc;
    }

    @Override // zd4.o
    public java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new zd4.q(2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jbz, com.p314xaae8f345.mm.R.C30867xcad56011.f574749jc1));
        arrayList.add(new zd4.q(2, 1, com.p314xaae8f345.mm.R.C30867xcad56011.jbt, com.p314xaae8f345.mm.R.C30867xcad56011.jbk));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new zd4.q(3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.jbz, com.p314xaae8f345.mm.R.C30867xcad56011.f574748jc0));
        arrayList2.add(new zd4.q(3, 1, com.p314xaae8f345.mm.R.C30867xcad56011.jbt, com.p314xaae8f345.mm.R.C30867xcad56011.jbb));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        kz5.p0 p0Var = kz5.p0.f395529d;
        arrayList3.add(new zd4.r(0, com.p314xaae8f345.mm.R.C30867xcad56011.jbq, com.p314xaae8f345.mm.R.C30867xcad56011.jbr, p0Var, null, null, 48, null));
        arrayList3.add(new zd4.r(1, com.p314xaae8f345.mm.R.C30867xcad56011.jbo, com.p314xaae8f345.mm.R.C30867xcad56011.jbp, p0Var, null, null, 48, null));
        arrayList3.add(new zd4.r(2, com.p314xaae8f345.mm.R.C30867xcad56011.jbj, com.p314xaae8f345.mm.R.C30867xcad56011.jbk, arrayList, null, null, 48, null));
        java.lang.CharSequence charSequence = this.f255385c;
        int i17 = this.f255384b;
        if (i17 == 2 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(charSequence, "")) {
            arrayList3.add(new zd4.r(5, 0, 0, p0Var, charSequence, null, 32, null));
        }
        arrayList3.add(new zd4.r(3, com.p314xaae8f345.mm.R.C30867xcad56011.jba, com.p314xaae8f345.mm.R.C30867xcad56011.jbb, arrayList2, null, null, 48, null));
        if (i17 == 3 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(charSequence, "")) {
            arrayList3.add(new zd4.r(5, 0, 0, p0Var, charSequence, null, 32, null));
        }
        return arrayList3;
    }

    @Override // zd4.o
    public int f(int i17) {
        return i17 == 5 ? i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp) : super.f(i17);
    }

    @Override // zd4.o
    public int j(int i17) {
        if (i17 == 5) {
            return 8;
        }
        super.j(i17);
        return 0;
    }

    @Override // zd4.o
    public int k(int i17) {
        return i17 == 5 ? i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj) : super.k(i17);
    }

    @Override // zd4.o
    public int m(int i17) {
        if (i17 == 0 || i17 == 1) {
            return 0;
        }
        return i17 != 2 ? 8 : 8;
    }
}
