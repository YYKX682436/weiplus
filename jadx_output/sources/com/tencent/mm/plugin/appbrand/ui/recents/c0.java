package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.c0 f90043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.d0 f90044e;

    public c0(com.tencent.mm.plugin.appbrand.ui.recents.d0 d0Var, androidx.recyclerview.widget.c0 c0Var) {
        this.f90044e = d0Var;
        this.f90043d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.recents.d0 d0Var = this.f90044e;
        com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var = d0Var.f90063f.f90017z;
        com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var2 = d0Var.f90062e;
        synchronized (o1Var) {
            o1Var.h(o1Var2.f90134d, o1Var2.f90135e);
        }
        com.tencent.mm.sdk.platformtools.u3.m(-8);
        this.f90043d.b(this.f90044e.f90063f.f90016y);
        com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList.s0(this.f90044e.f90063f);
    }
}
