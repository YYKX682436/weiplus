package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.a1 f90171d;

    public x0(com.tencent.mm.plugin.appbrand.ui.recents.a1 a1Var) {
        this.f90171d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.a1 a1Var = this.f90171d;
        if (a1Var.f90026g.f90054p.getActivity() == null) {
            return;
        }
        db5.e1.E(a1Var.f90026g.f90054p.getActivity(), a1Var.f90026g.f90054p.getResources().getString(com.tencent.mm.R.string.f490102ky, java.lang.Integer.valueOf(a1Var.f90026g.f90054p.f90000h)), "", a1Var.f90026g.f90054p.getResources().getString(com.tencent.mm.R.string.f490507x1), false, null);
    }
}
