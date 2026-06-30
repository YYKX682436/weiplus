package x21;

/* loaded from: classes14.dex */
public final class b implements android.media.AudioTrack.OnPlaybackPositionUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x21.c f533044a;

    public b(x21.c cVar) {
        this.f533044a = cVar;
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(android.media.AudioTrack audioTrack) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.AudioTrackAudioPlayer", "reach end");
        if (audioTrack != null) {
            x21.c cVar = this.f533044a;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                audioTrack.pause();
                audioTrack.flush();
                audioTrack.release();
                if (cVar.f533046b) {
                    f25.m0 m0Var = cVar.f533055k;
                    if (m0Var != null) {
                        i95.m c17 = i95.n0.c(f25.n0.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        ((f25.n0) c17).yg(m0Var);
                    }
                    cVar.f533055k = null;
                }
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MSP.AudioTrackAudioPlayer", "stop audio track error", m143898xd4a2fc34);
            }
            p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
        }
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(android.media.AudioTrack audioTrack) {
    }
}
