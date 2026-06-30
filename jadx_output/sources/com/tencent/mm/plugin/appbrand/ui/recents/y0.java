package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.a1 f90173d;

    public y0(com.tencent.mm.plugin.appbrand.ui.recents.a1 a1Var) {
        this.f90173d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.a1 a1Var = this.f90173d;
        if (a1Var.f90026g.f90054p.getContext() == null) {
            return;
        }
        db5.t7.h(a1Var.f90026g.f90054p.getContext(), a1Var.f90026g.f90054p.getContext().getResources().getString(com.tencent.mm.R.string.f490330rz));
    }
}
