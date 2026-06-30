package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242;

/* loaded from: classes7.dex */
public final /* synthetic */ class l extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public l(java.lang.Object obj) {
        super(0, obj, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o.class, "checkIsAppBrandVOIPInUse", "checkIsAppBrandVOIPInUse()Z", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1035x88350242.o) this.f72685xcfcbe9ef).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0 x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.x0.class);
        if (x0Var != null) {
            java.util.Iterator it = ((java.util.ArrayList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.b1) x0Var).Bi()).iterator();
            while (it.hasNext()) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.w.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.C11735xd37b16d6) it.next()).f158456f, 16)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AVDeviceUsageDatas", "checkIsAppBrandVOIPInUse, " + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
