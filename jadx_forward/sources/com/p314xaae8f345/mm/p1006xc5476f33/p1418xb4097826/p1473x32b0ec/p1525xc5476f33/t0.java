package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class t0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0 f195856d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0 w0Var) {
        this.f195856d = w0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.k kVar = (mm2.k) obj;
        long j17 = kVar.f410719b;
        if (j17 > 0) {
            long j18 = (j17 - kVar.f410718a) / 1000;
            long j19 = 60;
            java.lang.String format = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j18 / j19)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            java.lang.String format2 = java.lang.String.format("%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j18 % j19)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.w0 w0Var = this.f195856d;
            java.lang.String string = w0Var.f196367p.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2u);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            w0Var.f196368q.setText(string + ' ' + format + ':' + format2);
        }
    }
}
