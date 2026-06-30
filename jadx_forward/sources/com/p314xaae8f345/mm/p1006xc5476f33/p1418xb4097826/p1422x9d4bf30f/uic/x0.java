package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183504d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var) {
        this.f183504d = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f183504d.I;
        if (f5Var != null) {
            f5Var.f();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("keyboardHeightProvider");
            throw null;
        }
    }
}
