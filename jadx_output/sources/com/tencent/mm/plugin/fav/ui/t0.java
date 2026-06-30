package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.u0 f101443d;

    public t0(com.tencent.mm.plugin.fav.ui.u0 u0Var) {
        this.f101443d = u0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.u0 u0Var = this.f101443d;
        u0Var.f101463f.f101479d.f100307e.d(u0Var.f101461d);
        u0Var.f101461d.forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.fav.ui.t0$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.util.HashMap) com.tencent.mm.plugin.fav.ui.t0.this.f101443d.f101463f.f101479d.f100322w).put((o72.r2) obj, 1);
            }
        });
        u0Var.f101463f.f101479d.f100307e.notifyDataSetChanged();
        u0Var.f101463f.f101479d.W6();
        u0Var.f101462e.dismiss();
    }

    public java.lang.String toString() {
        return super.toString() + "|batchDelFavItems";
    }
}
