package bd3;

/* loaded from: classes7.dex */
public final class b extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final bd3.a f100820a;

    /* renamed from: b, reason: collision with root package name */
    public int f100821b;

    /* renamed from: c, reason: collision with root package name */
    public int f100822c;

    /* renamed from: d, reason: collision with root package name */
    public long f100823d;

    /* renamed from: e, reason: collision with root package name */
    public int f100824e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r1, bd3.a r2, int r3, int r4, p3321xbce91901.jvm.p3324x21ffc6bd.i r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 3
        L5:
            java.lang.String r4 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r4)
            java.lang.String r4 = "callback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r4)
            r0.<init>(r1, r3)
            r0.f100820a = r2
            r1 = -1
            r0.f100821b = r1
            r0.f100822c = r1
            r0.f100824e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bd3.b.<init>(android.content.Context, bd3.a, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        int i18 = this.f100824e;
        bd3.a aVar = this.f100820a;
        if (i18 == -1) {
            this.f100824e = i17;
            if (i17 <= 60 || i17 >= 300) {
                if (i17 <= 30 || i17 >= 330) {
                    this.f100824e = 0;
                }
            } else if (i17 <= 150) {
                if (i17 <= 120) {
                    this.f100824e = 90;
                }
            } else if (i17 > 240) {
                this.f100824e = 270;
            } else if (i17 <= 210) {
                this.f100824e = 180;
            }
            ((ad3.a) aVar).c(this.f100824e);
        }
        if (i17 < 0 || i17 > 360) {
            return;
        }
        if (java.lang.Math.abs(this.f100821b - i17) < 30) {
            long j17 = this.f100823d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (android.os.SystemClock.elapsedRealtime() - j17 < 300) {
                return;
            }
        }
        this.f100821b = i17;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f100823d = android.os.SystemClock.elapsedRealtime();
        if (i17 <= 60 || i17 >= 300) {
            if (i17 <= 30 || i17 >= 330) {
                this.f100822c = 0;
            }
        } else if (i17 <= 150) {
            if (i17 <= 120) {
                this.f100822c = 90;
            }
        } else if (i17 > 240) {
            this.f100822c = 270;
        } else if (i17 <= 210) {
            this.f100822c = 180;
        }
        ((ad3.a) aVar).c(this.f100822c);
    }
}
