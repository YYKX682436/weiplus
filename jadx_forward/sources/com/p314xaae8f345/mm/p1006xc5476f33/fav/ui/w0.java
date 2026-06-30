package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x0 f183037d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x0 x0Var) {
        this.f183037d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x0 x0Var = this.f183037d;
        arrayList.add(x0Var.f183124e.f183144d);
        x0Var.f183124e.f183145e.f181840e.d(arrayList);
        x0Var.f183124e.f183145e.f181840e.notifyDataSetChanged();
        arrayList.forEach(new java.util.function.Consumer() { // from class: com.tencent.mm.plugin.fav.ui.w0$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w0.this.f183037d.f183124e.f183145e.f181855w).put((o72.r2) obj, 0);
            }
        });
        x0Var.f183123d.dismiss();
    }

    /* renamed from: toString */
    public java.lang.String m55384x9616526c() {
        return super.toString() + "|batchDelFavItems";
    }
}
