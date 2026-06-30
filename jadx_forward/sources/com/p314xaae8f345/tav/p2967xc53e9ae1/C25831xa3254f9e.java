package com.p314xaae8f345.tav.p2967xc53e9ae1;

/* renamed from: com.tencent.tav.player.AudioTrackWrapper */
/* loaded from: classes15.dex */
public class C25831xa3254f9e {
    private static final java.lang.String TAG = "AudioTrackWrapper";

    /* renamed from: mAudioTrack */
    private android.media.AudioTrack f48577x37ef5362;

    /* renamed from: com.tencent.tav.player.AudioTrackWrapper$AudioTrackConfig */
    /* loaded from: classes15.dex */
    public static class AudioTrackConfig {

        /* renamed from: sampleRateInHz */
        int f48582xebf541e1;

        /* renamed from: streamType */
        int f48583xb8c992da = 3;

        /* renamed from: channelConfig */
        int f48580x3a10de25 = 12;

        /* renamed from: audioFormat */
        int f48578x3e7c76d = 2;

        /* renamed from: mode */
        int f48581x3339a3 = 1;

        /* renamed from: bufferSizeInBytes */
        int f48579x3d3902a5 = 8192;

        public AudioTrackConfig(int i17, int i18) {
            this.f48582xebf541e1 = m98025xda8d0ed7(i17, i18);
        }

        /* renamed from: getSampleRateInHz */
        private int m98025xda8d0ed7(int i17, int i18) {
            return i18 == 1 ? i17 / 2 : i17;
        }

        /* renamed from: toString */
        public java.lang.String m98026x9616526c() {
            return "AudioTrackConfig{streamType=" + this.f48583xb8c992da + ", sampleRateInHz=" + this.f48582xebf541e1 + ", channelConfig=" + this.f48580x3a10de25 + ", audioFormat=" + this.f48578x3e7c76d + ", bufferSizeInBytes=" + this.f48579x3d3902a5 + ", mode=" + this.f48581x3339a3 + '}';
        }
    }

    public C25831xa3254f9e(android.media.MediaFormat mediaFormat) {
        try {
            m98017x316510(mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: init */
    private void m98017x316510(int i17, int i18) {
        if (i17 <= 0) {
            return;
        }
        com.p314xaae8f345.tav.p2967xc53e9ae1.C25831xa3254f9e.AudioTrackConfig audioTrackConfig = new com.p314xaae8f345.tav.p2967xc53e9ae1.C25831xa3254f9e.AudioTrackConfig(i17, i18);
        com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "init:--> " + this);
        try {
            this.f48577x37ef5362 = new android.media.AudioTrack(audioTrackConfig.f48583xb8c992da, audioTrackConfig.f48582xebf541e1, audioTrackConfig.f48580x3a10de25, audioTrackConfig.f48578x3e7c76d, audioTrackConfig.f48579x3d3902a5, audioTrackConfig.f48581x3339a3);
        } catch (java.lang.IllegalArgumentException unused) {
            this.f48577x37ef5362 = null;
        }
        android.media.AudioTrack audioTrack = this.f48577x37ef5362;
        if (audioTrack != null) {
            audioTrack.play();
        }
    }

    /* renamed from: allow */
    public boolean m98018x589a349() {
        return this.f48577x37ef5362 != null;
    }

    /* renamed from: flush */
    public void m98019x5d03b04() {
        if (m98018x589a349()) {
            try {
                android.media.AudioTrack audioTrack = this.f48577x37ef5362;
                if (audioTrack != null) {
                    audioTrack.flush();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.e(TAG, "flush: ", e17);
            }
        }
    }

    /* renamed from: parse */
    public void m98020x6581ab3() {
        android.media.AudioTrack audioTrack;
        if (m98018x589a349() && (audioTrack = this.f48577x37ef5362) != null && audioTrack.getPlayState() == 3) {
            this.f48577x37ef5362.pause();
        }
    }

    /* renamed from: release */
    public void m98021x41012807() {
        if (m98018x589a349()) {
            m98023x360802();
            this.f48577x37ef5362.release();
            com.p314xaae8f345.tav.p2959x5befac44.p2962xbe97f590.C25798x87fce1b0.d(TAG, "release:--> " + this);
        }
    }

    /* renamed from: setVolume */
    public void m98022x27f73e1c(float f17) {
        if (m98018x589a349()) {
            this.f48577x37ef5362.setVolume(f17);
        }
    }

    /* renamed from: stop */
    public void m98023x360802() {
        if (m98018x589a349()) {
            if (this.f48577x37ef5362.getState() == 3 || this.f48577x37ef5362.getState() == 2) {
                this.f48577x37ef5362.stop();
            }
        }
    }

    /* renamed from: writeData */
    public void m98024xac25b429(byte[] bArr, int i17, int i18) {
        android.media.AudioTrack audioTrack;
        if (m98018x589a349() && (audioTrack = this.f48577x37ef5362) != null) {
            try {
                audioTrack.write(bArr, i17, i18);
                if (this.f48577x37ef5362.getPlayState() != 3) {
                    this.f48577x37ef5362.play();
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public C25831xa3254f9e(int i17, int i18) {
        try {
            m98017x316510(i17, i18);
        } catch (java.lang.Exception unused) {
        }
    }
}
