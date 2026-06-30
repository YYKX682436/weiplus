package xl;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioRecord f536625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536626b;

    /* renamed from: c, reason: collision with root package name */
    public final int f536627c;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f536630f;

    /* renamed from: h, reason: collision with root package name */
    public xl.f f536632h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f536628d = java.util.concurrent.Executors.newSingleThreadExecutor();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f536629e = new xl.e(this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f536631g = false;

    public g(int i17, int i18, int i19, int i27, int i28) {
        this.f536626b = 12;
        if (i19 == 2) {
            this.f536626b = 12;
        } else {
            this.f536626b = 16;
        }
        int minBufferSize = android.media.AudioRecord.getMinBufferSize(i18, this.f536626b, i27) * i28;
        this.f536627c = minBufferSize;
        this.f536625a = new android.media.AudioRecord(i17, i18, this.f536626b, i27, minBufferSize);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecorderPcm", "mAudioSource:%d, mSampleRate:%d mAudioChannel:%d mAudioFormat:%d mBufferSize:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f536626b), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(minBufferSize));
    }
}
