package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class w0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f86002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.u0 f86004f;

    public w0(java.lang.Runnable runnable, com.tencent.mm.plugin.appbrand.page.n7 n7Var, com.tencent.mm.plugin.appbrand.menu.u0 u0Var) {
        this.f86002d = runnable;
        this.f86003e = n7Var;
        this.f86004f = u0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f86002d;
        if (runnable != null) {
            runnable.run();
        }
        com.tencent.mm.plugin.appbrand.menu.z0.a(this.f86003e, this.f86004f);
    }
}
