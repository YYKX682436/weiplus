package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hk implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f194353d;

    public hk(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar) {
        this.f194353d = hmVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        mm2.r2 r2Var = (mm2.r2) obj;
        if (r2Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = this.f194353d;
        java.lang.String str = r2Var.f410906d;
        if (hmVar.I1(str, null)) {
            qo0.b bVar = qo0.b.Z1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_GIFT_ID", str);
            bundle.putSerializable("PARAM_FINDER_LIVE_SEND_GIFT_DATA", r2Var);
            hmVar.f194360p.mo46557x60d69242(bVar, bundle);
        }
    }
}
