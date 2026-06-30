package ph;

/* loaded from: classes12.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f435790d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f435791e;

    /* renamed from: f, reason: collision with root package name */
    public int f435792f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f435793g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f435794h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ph.t f435795i;

    public d(ph.t tVar, java.lang.String action, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f435795i = tVar;
        this.f435793g = action;
        this.f435794h = z17;
        this.f435790d = new android.os.Handler(tVar.m().getLooper());
        this.f435792f = 1;
    }

    public final void a() {
        synchronized (this) {
            oj.j.f("Matrix.battery.LifeCycle", "ChargeStatusRestore cancel", new java.lang.Object[0]);
            this.f435790d.removeCallbacksAndMessages(null);
            if (this.f435791e) {
                this.f435795i.getClass();
            }
            this.f435791e = false;
            this.f435795i.f435826h = null;
        }
    }

    public final int b(int i17) {
        if (i17 <= 1) {
            return i17;
        }
        return b(i17 - 2) + b(i17 - 1);
    }

    public final void c() {
        synchronized (this) {
            if (this.f435791e) {
                oj.j.f("Matrix.battery.LifeCycle", "ChargeStatusRestore post: already running", new java.lang.Object[0]);
                return;
            }
            this.f435792f = 1;
            this.f435791e = true;
            long b17 = b(1) * 1000;
            oj.j.f("Matrix.battery.LifeCycle", "ChargeStatusRestore post: round=" + this.f435792f + ", delayMs=" + b17 + ", action=" + this.f435793g, new java.lang.Object[0]);
            this.f435790d.postDelayed(this, b17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.d.run():void");
    }
}
