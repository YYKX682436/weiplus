package ei3;

/* loaded from: classes12.dex */
public class w implements ei3.j {

    /* renamed from: a, reason: collision with root package name */
    public android.media.MediaRecorder f334686a;

    /* renamed from: b, reason: collision with root package name */
    public ei3.h f334687b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f334688c = false;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f334689d = new ei3.v(this);

    /* renamed from: e, reason: collision with root package name */
    public final int f334690e;

    /* renamed from: f, reason: collision with root package name */
    public final int f334691f;

    /* renamed from: g, reason: collision with root package name */
    public final int f334692g;

    public w(int i17, int i18, int i19) {
        this.f334690e = i17;
        this.f334691f = i18;
        this.f334692g = i19;
        if (i19 <= 0) {
            this.f334692g = 1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder, sampleRate: %s, bitrate: %s, audioChannelCount: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // ei3.j
    public void a(boolean z17) {
        this.f334688c = z17;
    }

    @Override // ei3.j
    public int b(ei3.h hVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f334689d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaRecorder", "start, onPcmReady: %s", hVar);
        this.f334687b = hVar;
        try {
            try {
                android.media.MediaRecorder mediaRecorder = this.f334686a;
                if (mediaRecorder != null && !this.f334688c) {
                    mediaRecorder.start();
                }
                return 0;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightAACMediaRecorder", e17, "start record aac.mp4 error:%s", e17.getMessage());
                n3Var.mo50305x3d8a09a2(0);
                return -1;
            }
        } finally {
            n3Var.mo50305x3d8a09a2(0);
        }
    }

    @Override // ei3.j
    public int c(int i17, java.lang.String str) {
        int i18 = this.f334690e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaRecorder", "MMSightAACMediaRecorder init tempPath[%s], sampleRate[%d]", str, java.lang.Integer.valueOf(i18));
        gp.e eVar = new gp.e();
        this.f334686a = eVar;
        eVar.setAudioSource(1);
        this.f334686a.setOutputFormat(2);
        this.f334686a.setAudioEncoder(3);
        this.f334686a.setAudioChannels(this.f334692g);
        this.f334686a.setAudioEncodingBitRate(this.f334691f);
        this.f334686a.setAudioSamplingRate(i18);
        this.f334686a.setOutputFile(str);
        try {
            this.f334686a.prepare();
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightAACMediaRecorder", e17, "mediaRecorder prepare error: %s", e17.getMessage());
            return -1;
        }
    }

    @Override // ei3.j
    /* renamed from: clear */
    public void mo127741x5a5b64d() {
        try {
            android.media.MediaRecorder mediaRecorder = this.f334686a;
            if (mediaRecorder != null) {
                if (!this.f334688c) {
                    mediaRecorder.stop();
                    this.f334686a.release();
                }
                this.f334686a = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightAACMediaRecorder", e17, "clear error: %s", e17.getMessage());
        }
    }

    @Override // ei3.j
    public void d() {
    }

    @Override // ei3.j
    public tl.v e() {
        return null;
    }

    @Override // ei3.j
    public int f(ei3.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightAACMediaRecorder", "stop, mediaRecorder: %s, callback: %s", this.f334686a, iVar);
        android.media.MediaRecorder mediaRecorder = this.f334686a;
        if (mediaRecorder == null) {
            if (iVar != null) {
                iVar.a();
            }
            return 0;
        }
        try {
            if (!this.f334688c) {
                mediaRecorder.stop();
                this.f334686a.release();
            }
            this.f334686a = null;
            if (iVar != null) {
                iVar.a();
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMSightAACMediaRecorder", e17, "stop record aac.mp4 error:%s", e17.getMessage());
            return -1;
        }
    }
}
