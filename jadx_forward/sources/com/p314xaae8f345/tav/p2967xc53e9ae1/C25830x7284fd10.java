package com.p314xaae8f345.tav.p2967xc53e9ae1;

/* renamed from: com.tencent.tav.player.AudioFocusHelper */
/* loaded from: classes16.dex */
public class C25830x7284fd10 {

    /* renamed from: mAudioFocusListener */
    private android.media.AudioManager.OnAudioFocusChangeListener f48571xf60d80c3;

    /* renamed from: mAudioManager */
    private android.media.AudioManager f48572x6ad04804;

    /* renamed from: mContext */
    private android.content.Context f48573xd6cfe882;

    /* renamed from: mIsAudioFocus */
    private boolean f48574x73f6d479;

    /* renamed from: mPlayer */
    private com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 f48575x14aac1ae;

    public C25830x7284fd10(android.content.Context context, com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701) {
        this.f48573xd6cfe882 = context;
        this.f48575x14aac1ae = c25839x8ea38701;
    }

    /* renamed from: ensureAudioManager */
    private void m98012x27d5b255() {
        if (this.f48572x6ad04804 == null) {
            this.f48572x6ad04804 = (android.media.AudioManager) this.f48573xd6cfe882.getSystemService("audio");
        }
    }

    /* renamed from: getAudioFocusChangeListener */
    private android.media.AudioManager.OnAudioFocusChangeListener m98013xddb6653c() {
        if (this.f48571xf60d80c3 == null) {
            this.f48571xf60d80c3 = new android.media.AudioManager.OnAudioFocusChangeListener() { // from class: com.tencent.tav.player.AudioFocusHelper.1
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public void onAudioFocusChange(int i17) {
                    if (com.p314xaae8f345.tav.p2967xc53e9ae1.C25830x7284fd10.this.f48575x14aac1ae == null) {
                        return;
                    }
                    try {
                        if (i17 == -2) {
                            com.p314xaae8f345.tav.p2967xc53e9ae1.C25830x7284fd10.this.m98014x9d4480a4(true);
                        } else {
                            if (i17 != -1) {
                                if (i17 == 1) {
                                    com.p314xaae8f345.tav.p2967xc53e9ae1.C25830x7284fd10.this.f48574x73f6d479 = true;
                                }
                            }
                            com.p314xaae8f345.tav.p2967xc53e9ae1.C25830x7284fd10.this.m98014x9d4480a4(false);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            };
        }
        return this.f48571xf60d80c3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAudioFocusLoss */
    public void m98014x9d4480a4(boolean z17) {
        if (!z17) {
            this.f48572x6ad04804.abandonAudioFocus(this.f48571xf60d80c3);
            this.f48574x73f6d479 = false;
        }
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25839x8ea38701 c25839x8ea38701 = this.f48575x14aac1ae;
        if (c25839x8ea38701 == null || !c25839x8ea38701.mo98032xc00617a4()) {
            return;
        }
        this.f48575x14aac1ae.mo98033x65825f6();
    }

    /* renamed from: release */
    public void m98015x41012807() {
        android.media.AudioManager audioManager = this.f48572x6ad04804;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.f48571xf60d80c3);
            this.f48572x6ad04804 = null;
            this.f48571xf60d80c3 = null;
            this.f48574x73f6d479 = false;
        }
        if (this.f48575x14aac1ae != null) {
            this.f48575x14aac1ae = null;
        }
    }

    /* renamed from: requestFocus */
    public void m98016x4c4bb389() {
        m98012x27d5b255();
        if (this.f48574x73f6d479) {
            return;
        }
        this.f48574x73f6d479 = this.f48572x6ad04804.requestAudioFocus(m98013xddb6653c(), 3, 1) == 1;
    }
}
