package k23;

/* loaded from: classes12.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f385158a;

    /* renamed from: b, reason: collision with root package name */
    public final long f385159b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f385160c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f385161d;

    /* renamed from: e, reason: collision with root package name */
    public long f385162e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f385163f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f385164g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385165h;

    public n1(k23.j2 j2Var, java.lang.String tag, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f385165h = j2Var;
        this.f385158a = tag;
        this.f385159b = j17;
    }

    public final void a(float f17) {
        java.lang.Runnable runnable = this.f385164g;
        k23.j2 j2Var = this.f385165h;
        if (runnable != null) {
            j2Var.removeCallbacks(runnable);
        }
        this.f385164g = null;
        this.f385161d = false;
        this.f385160c = false;
        this.f385162e = 0L;
        k23.l1 l1Var = new k23.l1(this, j2Var);
        this.f385163f = l1Var;
        j2Var.postDelayed(l1Var, this.f385159b);
    }

    public final void b(float f17) {
        float m141811xe7f5958e;
        float m141811xe7f5958e2;
        if (this.f385161d) {
            k23.j2 j2Var = this.f385165h;
            m141811xe7f5958e = j2Var.m141811xe7f5958e();
            if (f17 < m141811xe7f5958e && !this.f385160c) {
                this.f385160c = true;
                k23.k1 k1Var = j2Var.f385129n;
                if (k1Var != null) {
                    k1Var.e();
                    return;
                }
                return;
            }
            m141811xe7f5958e2 = j2Var.m141811xe7f5958e();
            if (f17 < m141811xe7f5958e2 || !this.f385160c) {
                return;
            }
            this.f385160c = false;
            k23.k1 k1Var2 = j2Var.f385129n;
            if (k1Var2 != null) {
                k1Var2.b();
            }
        }
    }

    public final void c() {
        java.lang.Runnable runnable = this.f385163f;
        k23.j2 j2Var = this.f385165h;
        if (runnable != null) {
            j2Var.removeCallbacks(runnable);
        }
        this.f385163f = null;
        if (this.f385161d) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f385162e;
            java.lang.String str = this.f385158a;
            if (currentTimeMillis < 300) {
                long j17 = 300 - currentTimeMillis;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", str + ": 长按时间过短(" + currentTimeMillis + " ms)，延迟 " + j17 + "ms 后结束");
                k23.m1 m1Var = new k23.m1(this, this.f385160c, j2Var);
                this.f385164g = m1Var;
                j2Var.postDelayed(m1Var, j17);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSStartRecognizeBtnModeSwitch", str + ": 长按结束，isCanceling=" + this.f385160c);
                k23.k1 k1Var = j2Var.f385129n;
                if (k1Var != null) {
                    k1Var.g(this.f385160c);
                }
            }
        }
        this.f385161d = false;
        this.f385162e = 0L;
    }
}
