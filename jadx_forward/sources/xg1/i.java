package xg1;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f535906d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f535907e;

    public i(int i17, java.lang.String TAG) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TAG, "TAG");
        this.f535906d = i17;
        this.f535907e = TAG;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (xg1.h.f535903a.a(this.f535906d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f535907e, "timeout, fallback to legacy logic");
        }
    }
}
