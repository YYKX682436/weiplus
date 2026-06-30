package zc;

/* loaded from: classes.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f552907e;

    public v(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, long j17) {
        this.f552906d = c3646xcf902238;
        this.f552907e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Vibrator vibrator = (android.os.Vibrator) this.f552906d.f127508q.getSystemService("vibrator");
        if (vibrator == null) {
            return;
        }
        vibrator.vibrate(this.f552907e);
    }
}
