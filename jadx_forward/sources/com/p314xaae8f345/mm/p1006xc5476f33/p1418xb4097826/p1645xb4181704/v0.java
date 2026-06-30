package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes5.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b f211964d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b) {
        this.f211964d = c15147x19964f7b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.C15147x19964f7b c15147x19964f7b = this.f211964d;
        c15147x19964f7b.m61024xdb574fcd().requestFocus();
        if (!(c15147x19964f7b.getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c15147x19964f7b.getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(c15147x19964f7b.m61024xdb574fcd(), 0);
                return;
            }
            return;
        }
        android.content.Context context = c15147x19964f7b.getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo26063x7b383410();
        }
    }
}
