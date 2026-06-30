package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes9.dex */
public class x2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.n2 f180636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.y2 f180637e;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.n2 n2Var) {
        this.f180637e = y2Var;
        this.f180636d = n2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.n().f354821b.d(this.f180636d);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = this.f180637e.f180645e;
        java.lang.Runnable runnable = c5587xf7a06bec.f273897d;
        if (runnable != null) {
            c5587xf7a06bec.f135910h.f88087a = 1;
            runnable.run();
        }
    }
}
