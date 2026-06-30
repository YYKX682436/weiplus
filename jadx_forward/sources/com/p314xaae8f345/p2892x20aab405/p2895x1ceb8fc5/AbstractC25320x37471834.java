package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.BaseMediaPlayer */
/* loaded from: classes13.dex */
public abstract class AbstractC25320x37471834 {

    /* renamed from: DECODER_TYPE_ANDROID_MEDIA_PLAYER */
    public static final int f45527x48325736 = 0;

    /* renamed from: DECODER_TYPE_MEDIA_CODEC */
    public static final int f45528x94b8e4f1 = 2;

    /* renamed from: DECODER_TYPE_SOFT */
    public static final int f45529xfe4ee7b4 = 1;
    private static final java.lang.String TAG = "BaseMediaPlayer";

    /* renamed from: startTime */
    private long f45533x81158a4f = 0;

    /* renamed from: duration */
    private long f45530x89444d94 = 0;

    /* renamed from: isPaused */
    private boolean f45531xecd98af8 = false;

    /* renamed from: mCacheDir */
    protected java.lang.String f45532xb26bd38 = null;

    /* renamed from: TransferStateTo */
    public abstract void mo93629xaa26d861(int i17);

    /* renamed from: addAudioListener */
    public abstract void mo93630xd94b1389(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1);

    /* renamed from: createSeekTable */
    public abstract com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 mo93631xd979a29a();

    /* renamed from: flush */
    public abstract void mo93632x5d03b04();

    /* renamed from: getCurPlayTime */
    public long m93633x8e27854b() {
        if (this.f45533x81158a4f <= 0) {
            return 0L;
        }
        return this.f45531xecd98af8 ? this.f45530x89444d94 : (this.f45530x89444d94 + android.os.SystemClock.elapsedRealtime()) - this.f45533x81158a4f;
    }

    /* renamed from: getCurrentAudioInformation */
    public abstract com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 mo93634x7ad436d9();

    /* renamed from: getCurrentPosition */
    public abstract long mo93635x9746038c();

    /* renamed from: getCurrentPositionFromFile */
    public abstract long mo93636x8da3b7f2();

    /* renamed from: getDecoderType */
    public abstract int mo93637x21f63468();

    /* renamed from: getDuration */
    public abstract int mo93638x51e8b0a();

    /* renamed from: getPlayerState */
    public abstract int mo93639xfa6224fa();

    /* renamed from: getSessionId */
    public abstract int mo93640x23a7af9b();

    /* renamed from: isPlaying */
    public abstract boolean mo93641xc00617a4();

    /* renamed from: notifyPauseSong */
    public void m93642x39654ee2() {
        this.f45531xecd98af8 = true;
        if (this.f45533x81158a4f > 0) {
            this.f45530x89444d94 += android.os.SystemClock.elapsedRealtime() - this.f45533x81158a4f;
        }
    }

    /* renamed from: notifyStartPlaySong */
    public void m93643xe2b25822() {
        this.f45531xecd98af8 = false;
        this.f45533x81158a4f = android.os.SystemClock.elapsedRealtime();
    }

    /* renamed from: pause */
    public abstract void mo93644x65825f6();

    /* renamed from: pauseRealTime */
    public abstract void mo93645x5cbb55a1();

    /* renamed from: prepare */
    public abstract void mo93646xed060d07();

    /* renamed from: prepareAsync */
    public abstract void mo93647x857611b5();

    /* renamed from: release */
    public abstract void mo93648x41012807();

    /* renamed from: removeAudioListener */
    public abstract void mo93649xde51bc86(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2896xd8960b28.InterfaceC25354x74ec3ce1 interfaceC25354x74ec3ce1);

    /* renamed from: reset */
    public abstract void mo93650x6761d4f();

    /* renamed from: seekTo */
    public abstract void mo93651xc9fc1b13(int i17);

    /* renamed from: setAudioStreamType */
    public abstract void mo93652x7389228e(int i17);

    /* renamed from: setDataSource */
    public abstract void mo93653x683d6267(android.content.Context context, android.net.Uri uri);

    /* renamed from: setDataSource */
    public abstract void mo93654x683d6267(android.content.Context context, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25452xb767407f interfaceC25452xb767407f);

    /* renamed from: setDataSource */
    public abstract void mo93655x683d6267(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2897xf8fde7a8.C25358xa2ed4c79 c25358xa2ed4c79);

    /* renamed from: setDataSource */
    public abstract void mo93656x683d6267(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2908x6de15a2e.InterfaceC25397x444b4112 interfaceC25397x444b4112, android.net.Uri uri);

    /* renamed from: setDataSource */
    public abstract void mo93657x683d6267(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25440x33a05b9c interfaceC25440x33a05b9c);

    /* renamed from: setDataSource */
    public abstract void mo93658x683d6267(java.io.FileDescriptor fileDescriptor);

    /* renamed from: setDataSource */
    public abstract void mo93659x683d6267(java.lang.String str);

    /* renamed from: setLeastCommonMultiple */
    public void mo93660x9425e422(int i17) {
    }

    /* renamed from: setOnlinePlayCacheDir */
    public void m93661x807b9af4(java.lang.String str) {
        if (new java.io.File(str).isDirectory()) {
            this.f45532xb26bd38 = str;
            return;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, "setOnlinePlayCacheDir cacheDir is invalid! cacheDir = " + str);
    }

    /* renamed from: setPlayLocalPath */
    public void mo93662xf9731c1a(java.lang.String str) {
    }

    /* renamed from: setPlayerListenerCallback */
    public abstract void mo93663xfada651c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a interfaceC25343x8e10fe3a);

    /* renamed from: setVolume */
    public abstract void mo93664x27f73e1c(float f17, float f18);

    /* renamed from: setWakeMode */
    public abstract void mo93665x87c56be9(android.content.Context context, int i17);

    /* renamed from: start */
    public abstract void mo93666x68ac462();

    /* renamed from: stop */
    public abstract void mo93667x360802();
}
