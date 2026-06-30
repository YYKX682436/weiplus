package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app;

/* loaded from: classes7.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f156725a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseIntArray f156726b;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.l0 l0Var) {
        this.f156725a = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t7.h() && bm5.f1.a().equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.z0.f170755n);
        this.f156726b = new android.util.SparseIntArray();
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n0 n0Var, android.app.Activity activity) {
        if (activity == null) {
            n0Var.getClass();
            return;
        }
        android.util.SparseIntArray sparseIntArray = n0Var.f156726b;
        sparseIntArray.delete(activity.hashCode());
        if (sparseIntArray.size() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.n0 n0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.o0.f156736a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "setSkipMiscPreload %b", java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.o0.f156737b = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessProfileInit[applaunch][PreloadProfile][preload]", "alive activity count %d", java.lang.Integer.valueOf(n0Var.f156726b.size()));
    }
}
