package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.u3 f91457d;

    public g3(com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var) {
        this.f91457d = u3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.widget.input.u3 u3Var = this.f91457d;
        if (u3Var.f91688u && 1 == u3Var.f91682o) {
            com.tencent.mm.plugin.appbrand.widget.input.u3.w(u3Var);
        } else {
            u3Var.z();
        }
    }
}
