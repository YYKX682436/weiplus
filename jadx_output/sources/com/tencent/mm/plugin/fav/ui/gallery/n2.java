package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public final class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.q2 f101019d;

    public n2(com.tencent.mm.plugin.fav.ui.gallery.q2 q2Var) {
        this.f101019d = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        int u07;
        com.tencent.mm.plugin.fav.ui.gallery.o1 x17;
        com.tencent.mm.plugin.fav.ui.gallery.q2 q2Var = this.f101019d;
        if (!q2Var.f101069x || (recyclerView = q2Var.f101067v) == null || recyclerView == null) {
            return;
        }
        int d17 = q2Var.d(q2Var.f101063r, recyclerView);
        if (d17 == 0) {
            q2Var.f101069x = false;
            return;
        }
        recyclerView.scrollBy(0, d17);
        android.view.View k07 = recyclerView.k0(q2Var.f101062q, q2Var.f101063r);
        if (k07 != null && (u07 = recyclerView.u0(k07)) != -1 && u07 != q2Var.f101060o && (x17 = q2Var.f101053e.x(u07)) != null && x17.f101037c != Integer.MAX_VALUE) {
            q2Var.f101060o = u07;
            q2Var.f();
        }
        q2Var.f101068w.postDelayed(this, q2Var.f101055g.f101007c);
    }
}
