package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1905x633fb29.p1906x5a0af82.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private a() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "ipc deletePieceMusicInfo Task, musicId:%s", c10756x2a5d7b2d);
            java.lang.String str = c10756x2a5d7b2d.f149939d;
            ql3.d Bi = ll3.o2.Bi();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.PieceMusicInfoStorage", "deletePieceMusicInfo raw=%d musicId=%s", java.lang.Integer.valueOf(Bi.f446118e.mo70514xb06685ab("PieceMusicInfo", "musicId=?", new java.lang.String[]{str})), str);
            ((lt0.f) Bi.f446117d).mo141381xc84af884(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Audio.MusicDataSourceCrossProcessImp", e17, "ipc deletePieceMusicInfo task", new java.lang.Object[0]);
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0();
    }
}
