package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.x0 f101504d;

    public w0(com.tencent.mm.plugin.fav.ui.x0 x0Var) {
        this.f101504d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.fav.ui.x0 x0Var = this.f101504d;
        arrayList.add(x0Var.f101591e.f101611d);
        x0Var.f101591e.f101612e.f100307e.d(arrayList);
        x0Var.f101591e.f101612e.f100307e.notifyDataSetChanged();
        arrayList.forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.fav.ui.w0$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.util.HashMap) com.tencent.mm.plugin.fav.ui.w0.this.f101504d.f101591e.f101612e.f100322w).put((o72.r2) obj, 0);
            }
        });
        x0Var.f101590d.dismiss();
    }

    public java.lang.String toString() {
        return super.toString() + "|batchDelFavItems";
    }
}
