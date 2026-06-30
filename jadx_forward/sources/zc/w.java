package zc;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f552909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f552910f;

    public w(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, long j17, int i17) {
        this.f552908d = c3646xcf902238;
        this.f552909e = j17;
        this.f552910f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f552908d.f127508q.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        long j17 = this.f552909e;
        if (i17 < 26 || !vibrator.hasAmplitudeControl()) {
            vibrator.vibrate(j17);
        } else {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j17, this.f552910f));
        }
    }
}
