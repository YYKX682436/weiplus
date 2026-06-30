package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.q2 f101042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.o1 f101044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f101045g;

    public o2(com.tencent.mm.plugin.fav.ui.gallery.q2 q2Var, int i17, com.tencent.mm.plugin.fav.ui.gallery.o1 o1Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f101042d = q2Var;
        this.f101043e = i17;
        this.f101044f = o1Var;
        this.f101045g = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.gallery.q2 q2Var = this.f101042d;
        if (q2Var.f101057i) {
            int i17 = q2Var.f101066u;
            int i18 = this.f101043e;
            if (i17 == i18) {
                q2Var.f101057i = false;
                q2Var.f101056h = true;
                q2Var.f101059n = i18;
                q2Var.f101060o = i18;
                q2Var.f101061p = kz5.r0.f314002d;
                q2Var.f101058m = !com.tencent.mm.plugin.fav.ui.gallery.d1.f100908a.d(this.f101044f.f101036b);
                com.tencent.mars.xlog.Log.i("SwipeMultiSelectTouchListener", "========== START (LONG PRESS) ==========");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Start=");
                sb6.append(i18);
                sb6.append(", Mode=");
                sb6.append(q2Var.f101058m ? "SELECT" : "DESELECT");
                com.tencent.mars.xlog.Log.i("SwipeMultiSelectTouchListener", sb6.toString());
                android.view.ViewParent parent = this.f101045g.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                q2Var.f();
            }
        }
    }
}
