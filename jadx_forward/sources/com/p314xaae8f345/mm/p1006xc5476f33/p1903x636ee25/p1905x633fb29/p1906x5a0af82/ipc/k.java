package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc;

/* loaded from: classes7.dex */
final class k implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private k() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1904x5a0af82.ipc.C16622x2811239c c16622x2811239c = (com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1904x5a0af82.ipc.C16622x2811239c) obj;
        try {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = c16622x2811239c.f232153d;
            objArr[1] = java.lang.Boolean.valueOf(c16622x2811239c.f232156g != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc updateMusicFileIndexBitCache Task, musicId:%s, bitset is valid:%b", objArr);
            com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc.o.e(c16622x2811239c.f232153d, c16622x2811239c.f232156g);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc updateMusicFileIndexBitCache task", new java.lang.Object[0]);
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
    }
}
