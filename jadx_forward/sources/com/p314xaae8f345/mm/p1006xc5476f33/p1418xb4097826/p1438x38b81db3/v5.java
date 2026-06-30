package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 f186301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186302e;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.q6 q6Var, in5.s0 s0Var) {
        this.f186301d = q6Var;
        this.f186302e = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yw2.a0 a0Var = this.f186301d.f185873e.f187749o;
        if (a0Var != null) {
            int height = a0Var.s().m82555x4905e9fa().getHeight();
            in5.s0 s0Var = this.f186302e;
            double height2 = (((height - s0Var.f3639x46306858.getHeight()) * 0.3d) + s0Var.f3639x46306858.getHeight()) - (a0Var.q().getHeight() / 2);
            android.view.View findViewById = a0Var.p().findViewById(com.p314xaae8f345.mm.R.id.rge);
            if (findViewById != null) {
                findViewById.setPadding(findViewById.getPaddingLeft(), (int) height2, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
            }
        }
    }
}
