package b92;

/* loaded from: classes15.dex */
public final class b2 implements android.view.Window.OnFrameMetricsAvailableListener {
    public int A;
    public int B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f18377a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f18378b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f18379c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f18380d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18381e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18382f;

    /* renamed from: g, reason: collision with root package name */
    public b92.y1 f18383g;

    /* renamed from: h, reason: collision with root package name */
    public long f18384h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f18385i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f18386j;

    /* renamed from: k, reason: collision with root package name */
    public int f18387k;

    /* renamed from: l, reason: collision with root package name */
    public int f18388l;

    /* renamed from: m, reason: collision with root package name */
    public long f18389m;

    /* renamed from: n, reason: collision with root package name */
    public long f18390n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.lifecycle.f f18391o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f18392p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.MessageQueue.IdleHandler f18393q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f18394r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f18395s;

    /* renamed from: t, reason: collision with root package name */
    public int f18396t;

    /* renamed from: u, reason: collision with root package name */
    public int f18397u;

    /* renamed from: v, reason: collision with root package name */
    public int f18398v;

    /* renamed from: w, reason: collision with root package name */
    public int f18399w;

    /* renamed from: x, reason: collision with root package name */
    public int f18400x;

    /* renamed from: y, reason: collision with root package name */
    public long f18401y;

    /* renamed from: z, reason: collision with root package name */
    public int f18402z;

    public b2(java.lang.String scene, java.lang.String commentScene, java.lang.ref.WeakReference windowRef, android.os.Handler handler, long j17, long j18) {
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(windowRef, "windowRef");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f18377a = scene;
        this.f18378b = commentScene;
        this.f18379c = windowRef;
        this.f18380d = handler;
        this.f18381e = j17;
        this.f18382f = j18;
        this.f18385i = new java.util.ArrayList();
        this.f18394r = new int[5];
        this.f18395s = new int[5];
    }

    public final void a(java.lang.String str, b92.y1 y1Var) {
        int i17 = y1Var.f18572g;
        int i18 = y1Var.f18566a;
        if (i17 != i18 || y1Var.b() <= 0) {
            com.tencent.mars.xlog.Log.w("FinderLiveFpsService", "addFrameInfo: can't record frame, source=" + str + ", fps=" + y1Var.b() + ", start=" + i18 + ", end=" + y1Var.f18572g + ", task=" + this);
            return;
        }
        java.util.ArrayList arrayList = this.f18385i;
        boolean z17 = false;
        boolean z18 = arrayList.size() >= 500;
        b92.y1 y1Var2 = (b92.y1) kz5.n0.k0(arrayList);
        if (y1Var2 != null) {
            int i19 = y1Var2.f18566a;
            boolean z19 = i19 != i18;
            if (z19) {
                com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "addFrameInfo: refresh rate change, old=" + i19 + ", new=" + i18);
            }
            z17 = z19;
        }
        if (z18 || z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(arrayList);
            com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "addFrameInfo: calculate frame data, source=" + str + ", outOfSize=" + z18 + ", refreshRateChange=" + z17 + ", size=" + arrayList2.size());
            arrayList.clear();
            pm0.v.O("FinderLiveFpsService", new b92.z1(this, arrayList2));
        }
        arrayList.add(y1Var);
    }

    public final void b(java.util.List list) {
        int[] iArr;
        int[] iArr2;
        kotlin.jvm.internal.o.g(list, "list");
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        long j17 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            iArr = this.f18395s;
            iArr2 = this.f18394r;
            if (!hasNext) {
                break;
            }
            b92.y1 y1Var = (b92.y1) it.next();
            if (y1Var.b() > 0) {
                int i19 = this.f18387k;
                int i27 = y1Var.f18566a;
                if (i27 > i19) {
                    this.f18387k = i27;
                }
                if (i27 < this.f18388l) {
                    this.f18388l = i27;
                }
                i18 = i27 < 60 ? 60 : i27;
                i17 += y1Var.f18571f;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                long millis = j17 + timeUnit.toMillis(y1Var.f18569d - y1Var.f18570e);
                this.f18401y += timeUnit.toMillis(y1Var.f18569d - y1Var.f18570e);
                this.f18402z += y1Var.f18571f;
                int i28 = iArr2[4];
                int[] iArr3 = y1Var.f18573h;
                iArr2[4] = i28 + iArr3[4];
                iArr2[3] = iArr2[3] + iArr3[3];
                iArr2[2] = iArr2[2] + iArr3[2];
                iArr2[1] = iArr2[1] + iArr3[1];
                iArr2[0] = iArr2[0] + iArr3[0];
                int i29 = iArr[4];
                int[] iArr4 = y1Var.f18574i;
                iArr[4] = i29 + iArr4[4];
                iArr[3] = iArr[3] + iArr4[3];
                iArr[2] = iArr[2] + iArr4[2];
                iArr[1] = iArr[1] + iArr4[1];
                iArr[0] = iArr[0] + iArr4[0];
                j17 = millis;
            }
        }
        this.f18398v = (int) ((this.f18402z * 1000) / this.f18401y);
        int i37 = this.A + 1;
        this.A = i37;
        long j18 = (i17 * 1000) / j17;
        int i38 = this.B + ((int) ((((float) j18) * 60.0f) / i18));
        this.B = i38;
        this.f18399w = i38 / i37;
        int i39 = (int) j18;
        int i47 = this.C + (i39 <= 60 ? i39 : 60);
        this.C = i47;
        this.f18400x = i47 / i37;
        this.f18396t = iArr2[1] + iArr2[2] + iArr2[3] + iArr2[4];
        this.f18397u = iArr[1] + iArr[2] + iArr[3] + iArr[4];
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i17) {
        kotlin.jvm.internal.o.g(window, "window");
        kotlin.jvm.internal.o.g(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(10);
        b92.y1 y1Var = this.f18383g;
        if (y1Var == null) {
            y1Var = new b92.y1(or2.k.a(window));
            y1Var.f18567b = metric;
            this.f18383g = y1Var;
            this.f18384h = 0L;
        }
        long j17 = y1Var.f18568c;
        if (1 <= j17 && j17 < metric) {
            com.tencent.mars.xlog.Log.i("FinderLiveFpsService", "onFrameMetricsAvailable: has finished, frameInfo=" + y1Var + ", currFrameInfo=" + this.f18383g);
            this.f18383g = null;
            return;
        }
        y1Var.f18571f++;
        if (y1Var.f18570e == 0) {
            y1Var.f18570e = metric;
            android.os.MessageQueue.IdleHandler idleHandler = this.f18393q;
            if (idleHandler != null) {
                android.os.Looper.getMainLooper().getQueue().removeIdleHandler(idleHandler);
                this.f18393q = null;
            }
            b92.a2 a2Var = new b92.a2(this);
            this.f18393q = a2Var;
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(a2Var);
        }
        long metric2 = frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
        long j18 = y1Var.f18575j;
        y1Var.f18569d = (((metric2 / j18) + 1) * j18) + metric;
        long j19 = this.f18384h;
        if (j19 > 0) {
            int millis = ((int) (java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(metric - j19) / 16)) - 1;
            if (millis > 0) {
                y1Var.a(millis);
            }
        } else {
            int millis2 = ((int) (java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(metric2) / 16)) - 1;
            if (millis2 > 0) {
                y1Var.a(millis2);
            }
        }
        this.f18384h = metric;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[scene=");
        sb6.append(this.f18377a);
        sb6.append(", commentScene=");
        sb6.append(this.f18378b);
        sb6.append(", originFps=");
        sb6.append(this.f18398v);
        sb6.append(", averageFps=");
        sb6.append(this.f18399w);
        sb6.append(", limitFps=");
        sb6.append(this.f18400x);
        sb6.append(", dropCntSum=");
        sb6.append(this.f18396t);
        sb6.append(", dropFrameSum=");
        sb6.append(this.f18397u);
        sb6.append(", totalFrameCount=");
        sb6.append(this.f18402z);
        sb6.append(", totalRefreshDuration=");
        sb6.append(this.f18401y);
        sb6.append(", stayDuration=");
        long j17 = this.f18390n;
        long j18 = this.f18389m;
        sb6.append(j17 > j18 ? j17 - j18 : 0L);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(this.f18381e));
        sb6.append(", liveId=");
        sb6.append(pm0.v.u(this.f18382f));
        return sb6.toString();
    }
}
