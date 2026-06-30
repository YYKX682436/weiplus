package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43;

/* loaded from: classes.dex */
final class j0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private j0() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaMapViewFactoryWC", "ipc IsOverseaUserTask");
            boolean equalsIgnoreCase = "CN".equalsIgnoreCase((java.lang.String) gm0.j1.u().c().l(274436, null));
            boolean z17 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaMapViewFactoryWC", "chinaReg:%b", java.lang.Boolean.valueOf(equalsIgnoreCase));
            if (equalsIgnoreCase) {
                z17 = false;
            }
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(z17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxaMapViewFactoryWC", e17, "ipc IsOverseaUserTask task", new java.lang.Object[0]);
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false);
        }
    }
}
