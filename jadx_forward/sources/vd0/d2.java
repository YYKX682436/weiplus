package vd0;

@j95.b
/* loaded from: classes5.dex */
public final class d2 extends i95.w implements wd0.m1 {

    /* renamed from: d, reason: collision with root package name */
    public f25.m0 f516919d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.AudioManager f516920e;

    /* renamed from: f, reason: collision with root package name */
    public final vd0.b2 f516921f = new vd0.b2(this);

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.C10681xf0c095ab f516922g;

    public void Ai(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "releaseAudioFocus audioFocusSession:%s", this.f516919d);
        f25.m0 m0Var = this.f516919d;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f516919d = null;
        if (z17) {
            Di();
        }
    }

    public void Bi(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "requestAudioFocus audioMgr:%s, audioFocusSession:%s", this.f516920e, this.f516919d);
        if (this.f516919d == null) {
            this.f516919d = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.r.f340643c, null);
        }
        if (z17) {
            Ri(0);
            j65.e.m(false);
        }
    }

    public final void Di() {
        if (this.f516920e == null) {
            this.f516920e = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        }
        if (this.f516920e != null) {
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_MUTE_VOLUME_INT, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "releaseAudioFocus beforeVolum:%s", java.lang.Integer.valueOf(r17));
            to.a.c(this.f516920e, 3, r17, 1);
        }
    }

    public void Ni() {
        if (this.f516920e == null) {
            this.f516920e = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        }
        android.media.AudioManager audioManager = this.f516920e;
        if (audioManager != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(audioManager);
            int streamVolume = audioManager.getStreamVolume(3);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_CARE_MODE_MUTE_VOLUME_INT, java.lang.Integer.valueOf(streamVolume));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "save current Volum:%s", java.lang.Integer.valueOf(streamVolume));
        }
    }

    public void Ri(int i17) {
        if (this.f516920e == null) {
            this.f516920e = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        }
        android.media.AudioManager audioManager = this.f516920e;
        if (audioManager != null) {
            to.a.c(audioManager, 3, i17, 1);
        }
    }

    public void Ui() {
        if (this.f516922g != null) {
            try {
                d75.b.g(new vd0.c2(this));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MuteModeService", th6, "unregisterContentObserver", new java.lang.Object[0]);
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "onAccountInitialized");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(this.f516921f);
        if (j65.e.b() && j65.e.g()) {
            wi();
        }
        if (j65.e.b() && j65.e.g()) {
            Bi(false);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "onAccountReleased");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this.f516921f);
        if (j65.e.b() && j65.e.g()) {
            Ai(true);
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        this.f516920e = (android.media.AudioManager) context.getSystemService("audio");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MuteModeService", "onCreate");
    }

    public void wi() {
        if (this.f516922g != null) {
            return;
        }
        this.f516922g = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.C10681xf0c095ab(new java.lang.ref.WeakReference(this));
        try {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            if (fp.h.a(33)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f516922g, intentFilter);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this.f516922g, intentFilter, 2);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MuteModeService", th6, "initBrightnessObserver", new java.lang.Object[0]);
        }
    }
}
