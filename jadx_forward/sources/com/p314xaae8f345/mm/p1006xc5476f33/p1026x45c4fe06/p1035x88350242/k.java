package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final /* synthetic */ class k extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public k(java.lang.Object obj) {
        super(0, obj, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.class, "checkIsAppBrandLivePusherInUse", "checkIsAppBrandLivePusherInUse()Z", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        synchronized (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o) this.f72685xcfcbe9ef)) {
            z17 = ((java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.f158257j.get(fb1.d.f342366h)) != null ? !r1.isEmpty() : false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageDatas", "checkIsAppBrandLivePusherInUse, " + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
