package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.a1 f90177d;

    public z0(com.tencent.mm.plugin.appbrand.ui.recents.a1 a1Var) {
        this.f90177d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.a1 a1Var = this.f90177d;
        if (a1Var.f90026g.f90054p.getContext() == null) {
            return;
        }
        db5.t7.h(a1Var.f90026g.f90054p.getContext(), a1Var.f90026g.f90054p.getContext().getResources().getString(com.tencent.mm.R.string.f490331s0));
    }
}
