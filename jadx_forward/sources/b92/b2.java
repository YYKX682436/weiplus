package b92;

/* loaded from: classes15.dex */
public final class b2 implements android.view.Window.OnFrameMetricsAvailableListener {
    public int A;
    public int B;
    public int C;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f99910a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f99911b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f99912c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f99913d;

    /* renamed from: e, reason: collision with root package name */
    public final long f99914e;

    /* renamed from: f, reason: collision with root package name */
    public final long f99915f;

    /* renamed from: g, reason: collision with root package name */
    public b92.y1 f99916g;

    /* renamed from: h, reason: collision with root package name */
    public long f99917h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f99918i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f99919j;

    /* renamed from: k, reason: collision with root package name */
    public int f99920k;

    /* renamed from: l, reason: collision with root package name */
    public int f99921l;

    /* renamed from: m, reason: collision with root package name */
    public long f99922m;

    /* renamed from: n, reason: collision with root package name */
    public long f99923n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.f f99924o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.ref.WeakReference f99925p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.MessageQueue.IdleHandler f99926q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f99927r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f99928s;

    /* renamed from: t, reason: collision with root package name */
    public int f99929t;

    /* renamed from: u, reason: collision with root package name */
    public int f99930u;

    /* renamed from: v, reason: collision with root package name */
    public int f99931v;

    /* renamed from: w, reason: collision with root package name */
    public int f99932w;

    /* renamed from: x, reason: collision with root package name */
    public int f99933x;

    /* renamed from: y, reason: collision with root package name */
    public long f99934y;

    /* renamed from: z, reason: collision with root package name */
    public int f99935z;

    public b2(java.lang.String scene, java.lang.String commentScene, java.lang.ref.WeakReference windowRef, android.os.Handler handler, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowRef, "windowRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f99910a = scene;
        this.f99911b = commentScene;
        this.f99912c = windowRef;
        this.f99913d = handler;
        this.f99914e = j17;
        this.f99915f = j18;
        this.f99918i = new java.util.ArrayList();
        this.f99927r = new int[5];
        this.f99928s = new int[5];
    }

    public final void a(java.lang.String str, b92.y1 y1Var) {
        int i17 = y1Var.f100105g;
        int i18 = y1Var.f100099a;
        if (i17 != i18 || y1Var.b() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveFpsService", "addFrameInfo: can't record frame, source=" + str + ", fps=" + y1Var.b() + ", start=" + i18 + ", end=" + y1Var.f100105g + ", task=" + this);
            return;
        }
        java.util.ArrayList arrayList = this.f99918i;
        boolean z17 = false;
        boolean z18 = arrayList.size() >= 500;
        b92.y1 y1Var2 = (b92.y1) kz5.n0.k0(arrayList);
        if (y1Var2 != null) {
            int i19 = y1Var2.f100099a;
            boolean z19 = i19 != i18;
            if (z19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "addFrameInfo: refresh rate change, old=" + i19 + ", new=" + i18);
            }
            z17 = z19;
        }
        if (z18 || z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "addFrameInfo: calculate frame data, source=" + str + ", outOfSize=" + z18 + ", refreshRateChange=" + z17 + ", size=" + arrayList2.size());
            arrayList.clear();
            pm0.v.O("FinderLiveFpsService", new b92.z1(this, arrayList2));
        }
        arrayList.add(y1Var);
    }

    public final void b(java.util.List list) {
        int[] iArr;
        int[] iArr2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        long j17 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            iArr = this.f99928s;
            iArr2 = this.f99927r;
            if (!hasNext) {
                break;
            }
            b92.y1 y1Var = (b92.y1) it.next();
            if (y1Var.b() > 0) {
                int i19 = this.f99920k;
                int i27 = y1Var.f100099a;
                if (i27 > i19) {
                    this.f99920k = i27;
                }
                if (i27 < this.f99921l) {
                    this.f99921l = i27;
                }
                i18 = i27 < 60 ? 60 : i27;
                i17 += y1Var.f100104f;
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
                long millis = j17 + timeUnit.toMillis(y1Var.f100102d - y1Var.f100103e);
                this.f99934y += timeUnit.toMillis(y1Var.f100102d - y1Var.f100103e);
                this.f99935z += y1Var.f100104f;
                int i28 = iArr2[4];
                int[] iArr3 = y1Var.f100106h;
                iArr2[4] = i28 + iArr3[4];
                iArr2[3] = iArr2[3] + iArr3[3];
                iArr2[2] = iArr2[2] + iArr3[2];
                iArr2[1] = iArr2[1] + iArr3[1];
                iArr2[0] = iArr2[0] + iArr3[0];
                int i29 = iArr[4];
                int[] iArr4 = y1Var.f100107i;
                iArr[4] = i29 + iArr4[4];
                iArr[3] = iArr[3] + iArr4[3];
                iArr[2] = iArr[2] + iArr4[2];
                iArr[1] = iArr[1] + iArr4[1];
                iArr[0] = iArr[0] + iArr4[0];
                j17 = millis;
            }
        }
        this.f99931v = (int) ((this.f99935z * 1000) / this.f99934y);
        int i37 = this.A + 1;
        this.A = i37;
        long j18 = (i17 * 1000) / j17;
        int i38 = this.B + ((int) ((((float) j18) * 60.0f) / i18));
        this.B = i38;
        this.f99932w = i38 / i37;
        int i39 = (int) j18;
        int i47 = this.C + (i39 <= 60 ? i39 : 60);
        this.C = i47;
        this.f99933x = i47 / i37;
        this.f99929t = iArr2[1] + iArr2[2] + iArr2[3] + iArr2[4];
        this.f99930u = iArr[1] + iArr[2] + iArr[3] + iArr[4];
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(window, "window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(10);
        b92.y1 y1Var = this.f99916g;
        if (y1Var == null) {
            y1Var = new b92.y1(or2.k.a(window));
            y1Var.f100100b = metric;
            this.f99916g = y1Var;
            this.f99917h = 0L;
        }
        long j17 = y1Var.f100101c;
        if (1 <= j17 && j17 < metric) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFpsService", "onFrameMetricsAvailable: has finished, frameInfo=" + y1Var + ", currFrameInfo=" + this.f99916g);
            this.f99916g = null;
            return;
        }
        y1Var.f100104f++;
        if (y1Var.f100103e == 0) {
            y1Var.f100103e = metric;
            android.os.MessageQueue.IdleHandler idleHandler = this.f99926q;
            if (idleHandler != null) {
                android.os.Looper.getMainLooper().getQueue().removeIdleHandler(idleHandler);
                this.f99926q = null;
            }
            b92.a2 a2Var = new b92.a2(this);
            this.f99926q = a2Var;
            android.os.Looper.getMainLooper().getQueue().addIdleHandler(a2Var);
        }
        long metric2 = frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
        long j18 = y1Var.f100108j;
        y1Var.f100102d = (((metric2 / j18) + 1) * j18) + metric;
        long j19 = this.f99917h;
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
        this.f99917h = metric;
    }

    /* renamed from: toString */
    public java.lang.String m9990x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[scene=");
        sb6.append(this.f99910a);
        sb6.append(", commentScene=");
        sb6.append(this.f99911b);
        sb6.append(", originFps=");
        sb6.append(this.f99931v);
        sb6.append(", averageFps=");
        sb6.append(this.f99932w);
        sb6.append(", limitFps=");
        sb6.append(this.f99933x);
        sb6.append(", dropCntSum=");
        sb6.append(this.f99929t);
        sb6.append(", dropFrameSum=");
        sb6.append(this.f99930u);
        sb6.append(", totalFrameCount=");
        sb6.append(this.f99935z);
        sb6.append(", totalRefreshDuration=");
        sb6.append(this.f99934y);
        sb6.append(", stayDuration=");
        long j17 = this.f99923n;
        long j18 = this.f99922m;
        sb6.append(j17 > j18 ? j17 - j18 : 0L);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(this.f99914e));
        sb6.append(", liveId=");
        sb6.append(pm0.v.u(this.f99915f));
        return sb6.toString();
    }
}
