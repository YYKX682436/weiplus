package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class s70 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 f195761d;

    public s70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var) {
        this.f195761d = v70Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String format;
        long longValue = ((java.lang.Number) obj).longValue();
        android.widget.TextView textView = this.f195761d.f196223x;
        if (longValue < 0) {
            format = "00:00";
        } else if (longValue >= 59999000) {
            format = "999:59";
        } else {
            long j17 = longValue / 1000;
            long j18 = 60;
            format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) (j17 / j18)), java.lang.Integer.valueOf((int) (j17 % j18))}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        }
        textView.setText(format);
        return jz5.f0.f384359a;
    }
}
