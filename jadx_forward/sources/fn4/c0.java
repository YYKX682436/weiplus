package fn4;

/* loaded from: classes15.dex */
public class c0 extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public int f346016a;

    /* renamed from: b, reason: collision with root package name */
    public int f346017b;

    /* renamed from: c, reason: collision with root package name */
    public long f346018c;

    /* renamed from: d, reason: collision with root package name */
    public long f346019d;

    /* renamed from: e, reason: collision with root package name */
    public fn4.b0 f346020e;

    public c0(android.content.Context context) {
        super(context);
        this.f346016a = -1;
        this.f346017b = -1;
        this.f346018c = 0L;
        this.f346019d = 0L;
    }

    @Override // android.view.OrientationEventListener
    public void enable() {
        super.enable();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f346019d = android.os.SystemClock.elapsedRealtime();
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        long j17 = this.f346019d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (android.os.SystemClock.elapsedRealtime() - j17 >= 2000 && java.lang.Math.abs(this.f346016a - i17) >= 60) {
            if (android.os.SystemClock.elapsedRealtime() - this.f346018c >= 1000) {
                this.f346016a = i17;
                this.f346018c = android.os.SystemClock.elapsedRealtime();
                if (i17 <= 60 || i17 >= 300) {
                    if (i17 <= 30 || i17 >= 330) {
                        this.f346017b = 0;
                    }
                } else if (i17 < 30 || i17 > 150) {
                    if (i17 < 120 || i17 > 240) {
                        if (i17 >= 210 && i17 <= 330 && i17 >= 240 && i17 <= 300) {
                            this.f346017b = 270;
                        }
                    } else if (i17 >= 150 && i17 <= 210) {
                        this.f346017b = 180;
                    }
                } else if (i17 >= 60 && i17 <= 120) {
                    this.f346017b = 90;
                }
                fn4.b0 b0Var = this.f346020e;
                if (b0Var != null) {
                    ((fn4.x) b0Var).f346150a.e7(this.f346017b);
                }
            }
        }
    }
}
