package xq4;

/* loaded from: classes14.dex */
public class c extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public int f537643a;

    /* renamed from: b, reason: collision with root package name */
    public long f537644b;

    /* renamed from: c, reason: collision with root package name */
    public xq4.b f537645c;

    public c(xq4.b bVar) {
        super(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f537643a = -1;
        this.f537644b = 0L;
        if (bVar == null) {
            return;
        }
        this.f537645c = bVar;
        enable();
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        int i18;
        xq4.b bVar;
        if (i17 < 0 || i17 > 360) {
            return;
        }
        if (java.lang.Math.abs(this.f537643a - i17) < 30) {
            long j17 = this.f537644b;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (android.os.SystemClock.elapsedRealtime() - j17 < 300) {
                return;
            }
        }
        this.f537643a = i17;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f537644b = android.os.SystemClock.elapsedRealtime();
        if (i17 <= 60 || i17 >= 300) {
            if (i17 <= 30 || i17 >= 330) {
                i18 = 1;
            }
            i18 = -1;
        } else if (i17 >= 30 && i17 <= 150) {
            if (i17 >= 60 && i17 <= 120) {
                i18 = 2;
            }
            i18 = -1;
        } else if (i17 < 120 || i17 > 240) {
            if (i17 >= 210 && i17 <= 330 && i17 >= 240 && i17 <= 300) {
                i18 = 4;
            }
            i18 = -1;
        } else {
            if (i17 >= 150 && i17 <= 210) {
                i18 = 3;
            }
            i18 = -1;
        }
        if (i18 == -1 || (bVar = this.f537645c) == null) {
            return;
        }
        bVar.e(i18);
    }
}
