package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public abstract class d2 extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.i1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296024a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k1 f296025b = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.c2(this);

    public abstract int[] a(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var, android.view.View view);

    public abstract android.view.View b(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var);

    public void c() {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 m83599xfd37656d;
        android.view.View b17;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296024a;
        if (c22949xf1deaba4 == null || (m83599xfd37656d = c22949xf1deaba4.m83599xfd37656d()) == null || (b17 = b(m83599xfd37656d)) == null) {
            return;
        }
        int[] a17 = a(m83599xfd37656d, b17);
        int i17 = a17[0];
        if (i17 == 0 && a17[1] == 0) {
            return;
        }
        this.f296024a.d0(i17, a17[1], null, Integer.MIN_VALUE, false);
    }
}
