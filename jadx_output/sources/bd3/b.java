package bd3;

/* loaded from: classes7.dex */
public final class b extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final bd3.a f19287a;

    /* renamed from: b, reason: collision with root package name */
    public int f19288b;

    /* renamed from: c, reason: collision with root package name */
    public int f19289c;

    /* renamed from: d, reason: collision with root package name */
    public long f19290d;

    /* renamed from: e, reason: collision with root package name */
    public int f19291e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r1, bd3.a r2, int r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 3
        L5:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.o.g(r1, r4)
            java.lang.String r4 = "callback"
            kotlin.jvm.internal.o.g(r2, r4)
            r0.<init>(r1, r3)
            r0.f19287a = r2
            r1 = -1
            r0.f19288b = r1
            r0.f19289c = r1
            r0.f19291e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bd3.b.<init>(android.content.Context, bd3.a, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        int i18 = this.f19291e;
        bd3.a aVar = this.f19287a;
        if (i18 == -1) {
            this.f19291e = i17;
            if (i17 <= 60 || i17 >= 300) {
                if (i17 <= 30 || i17 >= 330) {
                    this.f19291e = 0;
                }
            } else if (i17 <= 150) {
                if (i17 <= 120) {
                    this.f19291e = 90;
                }
            } else if (i17 > 240) {
                this.f19291e = 270;
            } else if (i17 <= 210) {
                this.f19291e = 180;
            }
            ((ad3.a) aVar).c(this.f19291e);
        }
        if (i17 < 0 || i17 > 360) {
            return;
        }
        if (java.lang.Math.abs(this.f19288b - i17) < 30) {
            long j17 = this.f19290d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (android.os.SystemClock.elapsedRealtime() - j17 < 300) {
                return;
            }
        }
        this.f19288b = i17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f19290d = android.os.SystemClock.elapsedRealtime();
        if (i17 <= 60 || i17 >= 300) {
            if (i17 <= 30 || i17 >= 330) {
                this.f19289c = 0;
            }
        } else if (i17 <= 150) {
            if (i17 <= 120) {
                this.f19289c = 90;
            }
        } else if (i17 > 240) {
            this.f19289c = 270;
        } else if (i17 <= 210) {
            this.f19289c = 180;
        }
        ((ad3.a) aVar).c(this.f19289c);
    }
}
