package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc;

/* loaded from: classes7.dex */
final class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private e() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        b21.v b17;
        try {
            b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.o.b(((com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj).f149939d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc getPieceMusicInfo task", new java.lang.Object[0]);
        }
        if (b17 != null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1904x5a0af82.ipc.C16623xdd3b04d4(b17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "pmInfo is null");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1904x5a0af82.ipc.C16623xdd3b04d4();
    }
}
