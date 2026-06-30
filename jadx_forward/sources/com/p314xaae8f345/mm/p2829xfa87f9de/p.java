package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public class p implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f296397e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3210x3857dc.j f296398f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f296396d = false;

    /* renamed from: g, reason: collision with root package name */
    public int f296399g = -1;

    public p(java.lang.String str, com.p314xaae8f345.p3210x3857dc.j jVar) {
        this.f296397e = str;
        this.f296398f = jVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnCompletionListener
    /* renamed from: onCompletion */
    public void mo53280xa6db431b(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 b17;
        com.p314xaae8f345.mm.p2829xfa87f9de.C22988x4db43e47 c22988x4db43e47;
        java.lang.Runnable runnable;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "onCompletion");
            if (interfaceC26164x73fc6bc6.mo100922x6b2cfdb1() == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "onCompletion, is sys audio player, try stopAsync");
                interfaceC26164x73fc6bc6.mo100977x5f82bb9a();
            }
            if (!com.p314xaae8f345.mm.p2829xfa87f9de.q.b(this.f296397e) || (b17 = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a.b()) == null || (c22988x4db43e47 = b17.f296346i) == null || (runnable = b17.f296349o) == null) {
                return;
            }
            c22988x4db43e47.postDelayed(runnable, 5L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onCompletion error: " + th6.getMessage());
            com.p314xaae8f345.mm.p2829xfa87f9de.q.d("onCompletion error ", th6);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onError, errorType = %d, errorCode = %d, arg1 = %d, arg2 = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        if (!com.p314xaae8f345.mm.p2829xfa87f9de.q.b(this.f296397e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onError, sCurrentParams invalid");
        } else {
            com.p314xaae8f345.mm.p2829xfa87f9de.r rVar = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a;
            com.p314xaae8f345.mm.p2829xfa87f9de.q.c(rVar.f296407e, rVar.f296415m, i18, rVar.a(), this.f296398f);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "onInfo what = %d, arg1 = %d, arg2 = %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "onPrepared");
            if (!com.p314xaae8f345.mm.p2829xfa87f9de.q.b(this.f296397e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onPrepared, sCurrentParams invalid");
                return;
            }
            com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 b17 = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a.b();
            if (b17 != null) {
                b17.m83868x395891ef(interfaceC26164x73fc6bc6.mo100917x37a7fa50());
            }
            int i17 = this.f296399g;
            if (i17 > 0 && i17 <= interfaceC26164x73fc6bc6.mo100917x37a7fa50()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "onPrepared, seek to " + this.f296399g);
                interfaceC26164x73fc6bc6.mo100936xc9fc1b13(this.f296399g);
            }
            interfaceC26164x73fc6bc6.mo100975x68ac462();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onPrepared error: " + th6.getMessage());
            com.p314xaae8f345.mm.p2829xfa87f9de.q.d("onPrepared error ", th6);
            com.p314xaae8f345.mm.p2829xfa87f9de.r rVar = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a;
            com.p314xaae8f345.mm.p2829xfa87f9de.q.c(rVar.f296407e, rVar.f296415m, -10, rVar.a(), this.f296398f);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public void mo53282x4799dc42(int i17, int i18) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "onStateChange from %d to %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (!com.p314xaae8f345.mm.p2829xfa87f9de.q.b(this.f296397e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onStateChange, sCurrentParams invalid");
                return;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf a17 = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a.a();
            if (a17 != null && !a17.isFinishing()) {
                com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 b17 = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a.b();
                if (b17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onStateChange, progressBarInParams invalid");
                    return;
                }
                com.p314xaae8f345.mm.p2829xfa87f9de.r rVar = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a;
                fp.e eVar = rVar.f296412j;
                if (eVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onStateChange, audioFocusHelper invalid");
                    return;
                }
                java.lang.ref.WeakReference weakReference = rVar.f296404b;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = weakReference == null ? null : (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) weakReference.get();
                if (c22699x3dcdb352 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onStateChange, playBtn invalid");
                    return;
                }
                if (i18 != 5) {
                    eVar.a();
                    if (b17.f296348n != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerProgress", "stopTimer");
                        b17.f296348n.cancel(false);
                        b17.f296348n = null;
                    }
                    android.graphics.drawable.Drawable drawable = a17.getDrawable(com.p314xaae8f345.mm.R.raw.f79865xc8527e4c);
                    com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
                    c22699x3dcdb352.setImageDrawable(drawable);
                    return;
                }
                eVar.b();
                if (b17.f296348n == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerProgress", "startTimer");
                    b17.f296348n = ((ku5.t0) ku5.t0.f394148d).d(new com.p314xaae8f345.mm.p2829xfa87f9de.t(b17), 5L, 250L);
                }
                android.graphics.drawable.Drawable drawable2 = a17.getDrawable(com.p314xaae8f345.mm.R.raw.f79844x41f895de);
                com.p314xaae8f345.mm.ui.uk.f(drawable2, -1);
                c22699x3dcdb352.setImageDrawable(drawable2);
                if (this.f296396d) {
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "onStateChange, first start state");
                this.f296396d = true;
                c22699x3dcdb352.postDelayed(new com.p314xaae8f345.mm.p2829xfa87f9de.o(this), 2000L);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onStateChange, activity invalid, try finishCurrentPlay");
            com.p314xaae8f345.mm.p2829xfa87f9de.r rVar2 = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a;
            if (rVar2 == null) {
                return;
            }
            com.p314xaae8f345.mm.p2829xfa87f9de.q.a(rVar2.f296408f, rVar2.f296406d);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onStateChange error: " + th6.getMessage());
            com.p314xaae8f345.mm.p2829xfa87f9de.q.d("onStateChange error ", th6);
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStopAsyncCompleteListener
    /* renamed from: onStopAsyncComplete */
    public void mo83876x5a35e2d4(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        com.p314xaae8f345.mm.p2829xfa87f9de.C22987x97ad1828 b17;
        com.p314xaae8f345.mm.p2829xfa87f9de.C22988x4db43e47 c22988x4db43e47;
        java.lang.Runnable runnable;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "onStopAsyncComplete");
            if (!com.p314xaae8f345.mm.p2829xfa87f9de.q.b(this.f296397e) || (b17 = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a.b()) == null || (c22988x4db43e47 = b17.f296346i) == null || (runnable = b17.f296349o) == null) {
                return;
            }
            c22988x4db43e47.postDelayed(runnable, 5L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "onStopAsyncComplete error: " + th6.getMessage());
            com.p314xaae8f345.mm.p2829xfa87f9de.q.d("onStopAsyncComplete error ", th6);
        }
    }
}
