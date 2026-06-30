package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes10.dex */
public final class k7 implements ke2.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 f194733a;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var) {
        this.f194733a = x7Var;
    }

    @Override // ke2.f0
    public void a(int i17, int i18, java.lang.String str, r45.h62 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.x7 x7Var = this.f194733a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x7Var.f196570q, "launchRandomMatch: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        x7Var.R = false;
        if (i17 != 0 || i18 != 0) {
            if (str == null || str.length() == 0) {
                db5.t7.m123883x26a183b(x7Var.f446856d.getContext(), x7Var.f446856d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnm), 0).show();
                return;
            } else {
                db5.t7.m123883x26a183b(x7Var.f446856d.getContext(), str, 0).show();
                return;
            }
        }
        qo0.c cVar = x7Var.f196569p;
        qo0.b bVar = qo0.b.Z3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("PARAM_FINDER_LIVE_RANDOM_MATCH_LINK_MIC_CONTACT_LIST", resp.mo14344x5f01b1f6());
        cVar.mo46557x60d69242(bVar, bundle);
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.j7(x7Var));
    }
}
