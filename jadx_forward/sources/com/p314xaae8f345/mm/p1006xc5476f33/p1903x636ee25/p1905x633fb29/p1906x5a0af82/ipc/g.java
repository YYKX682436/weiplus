package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc;

/* loaded from: classes.dex */
final class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private g() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc isSupportMixAudioByCP task");
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(((java.lang.Boolean) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MUSIC_OPEN_MIX_AUDIO_BOOLEAN_SYNC, java.lang.Boolean.FALSE)).booleanValue());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc isSupportMixAudioByCP task", new java.lang.Object[0]);
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c(false);
        }
    }
}
