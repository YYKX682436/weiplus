package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private c() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc getLastScanMusicPieceFileTime task");
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_MUSIO_LAST_SCAN_MUSIC_PIECE_FILE_TIME_LONG, 0L)).longValue());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc getLastScanMusicPieceFileTime task", new java.lang.Object[0]);
            return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(0L);
        }
    }
}
