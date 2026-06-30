package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u0 f182976d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u0 u0Var) {
        this.f182976d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u0 u0Var = this.f182976d;
        u0Var.f182996f.f183012d.f181840e.d(u0Var.f182994d);
        u0Var.f182994d.forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.fav.ui.t0$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t0.this.f182976d.f182996f.f183012d.f181855w).put((o72.r2) obj, 1);
            }
        });
        u0Var.f182996f.f183012d.f181840e.notifyDataSetChanged();
        u0Var.f182996f.f183012d.W6();
        u0Var.f182995e.dismiss();
    }

    /* renamed from: toString */
    public java.lang.String m55378x9616526c() {
        return super.toString() + "|batchDelFavItems";
    }
}
