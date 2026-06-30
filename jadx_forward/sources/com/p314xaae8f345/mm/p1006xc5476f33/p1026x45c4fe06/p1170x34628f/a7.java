package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class a7 extends android.widget.RelativeLayout implements pq5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f167932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, android.content.Context context) {
        super(context);
        this.f167932d = v5Var;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f167932d;
        android.graphics.Bitmap R1 = v5Var.R1();
        if (R1 != null) {
            canvas.drawBitmap(R1, 0.0f, v5Var.I.getTop(), (android.graphics.Paint) null);
        }
        al1.b bVar = v5Var.H;
        if (bVar != null && !bVar.f87279w) {
            v5Var.G.draw(canvas);
        }
        if (!v5Var.t3().N0()) {
            return true;
        }
        android.view.ViewGroup m17 = v5Var.mo51311x3eebbc35().m();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ie.a(m17, m17, canvas);
        return true;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f167932d;
        v5Var.f168696p0 = true;
        super.onMeasure(i17, i18);
        v5Var.f168696p0 = false;
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        if (this.f167932d.E2(this, runnable)) {
            return true;
        }
        return super.post(runnable);
    }

    @Override // android.view.View
    public boolean postDelayed(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return false;
        }
        if (this.f167932d.F2(this, runnable, j17)) {
            return true;
        }
        return super.postDelayed(runnable, j17);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        super.setBackgroundColor(i17);
    }
}
