package g25;

/* loaded from: classes14.dex */
public final class b implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f25.l0 f349498d;

    public b(f25.l0 l0Var) {
        this.f349498d = l0Var;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i17) {
        boolean z17 = g25.d.f349509o;
        f25.l0 l0Var = this.f349498d;
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(l0Var, "<this>");
            if (!((l0Var.f340638b & 2) == 2) && i17 == -3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "genAudioFocusRequest: intercept AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK call");
                return;
            }
        }
        if (g25.d.f349508n) {
            g25.d dVar = g25.d.f349501d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + l0Var + ", " + i17);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = g25.d.f349505h;
            g25.e eVar = (g25.e) concurrentHashMap.get(l0Var);
            if (eVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + l0Var + " not contains in sessionMap");
                return;
            }
            f25.f fVar = eVar.f349516f;
            if (i17 == -3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + eVar + " dispatch onPause can duck");
                if (fVar != null) {
                    fVar.c(true);
                }
                dVar.f(eVar, false, false);
                return;
            }
            if (i17 == -2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + eVar + " dispatch onPause");
                if (fVar != null) {
                    fVar.c(false);
                }
                dVar.f(eVar, false, false);
                return;
            }
            if (i17 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + eVar + " dispatch onStop");
                if (fVar != null) {
                    fVar.mo44162xc39f8281();
                }
                concurrentHashMap.remove(l0Var);
                dVar.b(l0Var);
                dVar.f(eVar, false, false);
                return;
            }
            if (i17 != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: un expected focusChange value " + i17);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChangeOld: " + eVar + " dispatch onResume");
            if (fVar != null) {
                fVar.mo44161x57429eec();
            }
            dVar.f(eVar, true, true);
            return;
        }
        g25.d dVar2 = g25.d.f349501d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + l0Var + ", " + i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = g25.d.f349505h;
        g25.e eVar2 = (g25.e) concurrentHashMap2.get(l0Var);
        if (eVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + l0Var + " not contains in sessionMap");
            return;
        }
        f25.f fVar2 = eVar2.f349516f;
        if (i17 == -3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + eVar2 + " dispatch onPause can duck");
            dVar2.f(eVar2, false, false);
            if (fVar2 != null) {
                fVar2.c(true);
                return;
            }
            return;
        }
        if (i17 == -2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + eVar2 + " dispatch onPause");
            dVar2.f(eVar2, false, false);
            if (fVar2 != null) {
                fVar2.c(false);
                return;
            }
            return;
        }
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + eVar2 + " dispatch onStop");
            concurrentHashMap2.remove(l0Var);
            dVar2.b(l0Var);
            dVar2.f(eVar2, false, false);
            if (fVar2 != null) {
                fVar2.mo44162xc39f8281();
                return;
            }
            return;
        }
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: un expected focusChange value " + i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AFS.AudioFocusManagerImpl", "onAudioFocusChange: " + eVar2 + " dispatch onResume");
        dVar2.f(eVar2, true, true);
        if (fVar2 != null) {
            fVar2.mo44161x57429eec();
        }
    }
}
