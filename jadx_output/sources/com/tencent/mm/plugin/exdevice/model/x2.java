package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes9.dex */
public class x2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.n2 f99103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.y2 f99104e;

    public x2(com.tencent.mm.plugin.exdevice.model.y2 y2Var, com.tencent.mm.plugin.exdevice.model.n2 n2Var) {
        this.f99104e = y2Var;
        this.f99103d = n2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.n().f273288b.d(this.f99103d);
        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = this.f99104e.f99112e;
        java.lang.Runnable runnable = getA8KeyRedirectEvent.f192364d;
        if (runnable != null) {
            getA8KeyRedirectEvent.f54377h.f6554a = 1;
            runnable.run();
        }
    }
}
