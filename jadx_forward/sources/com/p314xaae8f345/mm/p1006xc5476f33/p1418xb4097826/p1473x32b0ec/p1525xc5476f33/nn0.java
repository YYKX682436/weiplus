package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class nn0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 f195197d;

    public nn0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var) {
        this.f195197d = wn0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        dm.o4 o4Var = (dm.o4) obj;
        if (o4Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWishPanelPlug", "panelGiftSelect: " + o4Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var = this.f195197d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.t0 z17 = wn0Var.z1();
            java.lang.String field_rewardProductId = o4Var.f67814x2c488eb6;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_rewardProductId, "field_rewardProductId");
            z17.getClass();
            if (!z17.f202318v.containsKey(field_rewardProductId)) {
                wn0Var.z1().y().mo7808x76db6cb1(new ln2.f(((ce2.i) o4Var).c1(), 10L, 0L));
            } else {
                android.view.ViewGroup viewGroup = wn0Var.f446856d;
                db5.t7.g(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eks));
            }
        }
    }
}
