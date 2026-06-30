package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class b10 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f193493d;

    public b10(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var) {
        this.f193493d = f10Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.qm1 qm1Var = (r45.qm1) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.f10 f10Var = this.f193493d;
        java.lang.String tag = f10Var.f194014q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curBoxObserver ");
        sb6.append(qm1Var != null ? qm1Var.m75945x2fec8307(1) : null);
        java.lang.String str = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "liveDataLog ".concat(str));
        f10Var.u1("");
    }
}
