package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f104768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104769e;

    public v5(com.tencent.mm.plugin.finder.convert.q6 q6Var, in5.s0 s0Var) {
        this.f104768d = q6Var;
        this.f104769e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yw2.a0 a0Var = this.f104768d.f104340e.f106216o;
        if (a0Var != null) {
            int height = a0Var.s().getRecyclerView().getHeight();
            in5.s0 s0Var = this.f104769e;
            double height2 = (((height - s0Var.itemView.getHeight()) * 0.3d) + s0Var.itemView.getHeight()) - (a0Var.q().getHeight() / 2);
            android.view.View findViewById = a0Var.p().findViewById(com.tencent.mm.R.id.rge);
            if (findViewById != null) {
                findViewById.setPadding(findViewById.getPaddingLeft(), (int) height2, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
            }
        }
    }
}
