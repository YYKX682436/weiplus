package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class hw implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f194406d;

    public hw(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar) {
        this.f194406d = owVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar = this.f194406d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(owVar.f195320p, "[liveBubbleShowStatusLiveData] " + bool);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        int i17 = bool.booleanValue() ? 8 : 0;
        owVar.A1().setVisibility(i17);
        owVar.B1().setVisibility(i17);
        com.p314xaae8f345.mm.p997x94b162ad.SurfaceHolderCallbackC11316x2d046220 surfaceHolderCallbackC11316x2d046220 = owVar.f195327u;
        if (surfaceHolderCallbackC11316x2d046220 == null) {
            return;
        }
        surfaceHolderCallbackC11316x2d046220.setVisibility(i17);
    }
}
