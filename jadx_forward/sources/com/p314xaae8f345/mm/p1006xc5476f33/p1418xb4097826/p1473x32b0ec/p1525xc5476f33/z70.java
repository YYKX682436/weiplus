package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class z70 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a80 f196839d;

    public z70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a80 a80Var) {
        this.f196839d = a80Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a80 a80Var = this.f196839d;
        int i17 = a80Var.f193368v;
        a80Var.getClass();
        if (i17 > 0) {
            android.widget.TextView textView = a80Var.f193366t;
            textView.setVisibility(0);
            textView.setText(java.lang.String.valueOf(a80Var.f193368v));
            a80Var.f193368v--;
            return true;
        }
        a80Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.f184110w.f184073b, null, false, false, 14, null);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.c1) a80Var.S0().a(mm2.c1.class)).G5).k(java.lang.Boolean.TRUE);
        az2.f fVar = a80Var.f193367u;
        if (fVar != null) {
            fVar.a();
        }
        a80Var.f193366t.setVisibility(8);
        a80Var.f193365s.setVisibility(8);
        return false;
    }
}
