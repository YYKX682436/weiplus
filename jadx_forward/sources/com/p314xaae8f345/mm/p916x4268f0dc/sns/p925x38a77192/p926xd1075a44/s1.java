package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 f151753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1 f151754e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 t2Var, com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1 e1Var) {
        super(0);
        this.f151753d = t2Var;
        this.f151754e = e1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicSearchPanel", "MusicList: ");
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 t2Var = this.f151753d;
        t2Var.getClass();
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1 snsMusicInfoWrapper = this.f151754e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsMusicInfoWrapper, "snsMusicInfoWrapper");
        r45.k96 k96Var = (r45.k96) snsMusicInfoWrapper.f151471a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicSearchPanel", "selectedMusic: " + k96Var.f460050d);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.k96) ((com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1) ((n0.q4) t2Var.f151774n).mo128745x754a37bb()).f151471a).f460050d, k96Var.f460050d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MusicSearchPanel", "selectedMusic: already selected this music, skip");
        } else {
            java.lang.String str = k96Var.f460050d;
            if (!(str == null || str.length() == 0)) {
                java.lang.String str2 = k96Var.f460051e;
                if (!(str2 == null || str2.length() == 0)) {
                    ((n0.q4) t2Var.f151773m).mo148714x53d8522f(snsMusicInfoWrapper);
                    com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t0 t0Var = t2Var.f151770g;
                    if (t0Var != null) {
                        java.lang.String music_id = k96Var.f460050d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(music_id, "music_id");
                        t0Var.d(music_id);
                    }
                    p3325xe03a0797.p3326xc267989b.l.d(t2Var.f151767d, null, null, new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.s2(t2Var, k96Var, null), 3, null);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MusicSearchPanel", "selectedMusic: musicId or musicUrl is null, " + k96Var.f460050d + ", " + k96Var.f460051e);
        }
        return jz5.f0.f384359a;
    }
}
