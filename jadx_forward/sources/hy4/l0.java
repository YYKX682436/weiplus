package hy4;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: q, reason: collision with root package name */
    public static boolean f367682q = true;

    /* renamed from: r, reason: collision with root package name */
    public static int f367683r;

    /* renamed from: a, reason: collision with root package name */
    public long f367684a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f367686c;

    /* renamed from: d, reason: collision with root package name */
    public long f367687d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f367688e;

    /* renamed from: f, reason: collision with root package name */
    public long f367689f;

    /* renamed from: g, reason: collision with root package name */
    public long f367690g;

    /* renamed from: h, reason: collision with root package name */
    public long f367691h;

    /* renamed from: i, reason: collision with root package name */
    public long f367692i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f367693j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f367694k;

    /* renamed from: l, reason: collision with root package name */
    public long f367695l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f367696m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f367697n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f367698o;

    /* renamed from: p, reason: collision with root package name */
    public int f367699p;

    public l0() {
        int i17;
        if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.f270856b >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.WebViewKernelTestSwitcher", "webViewKernelMode, value:" + com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.f270856b + " (0-render&gpu/1-origin/2-render)");
            i17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.f270856b;
        } else {
            com.p314xaae8f345.p3210x3857dc.z2 i18 = com.p314xaae8f345.p3210x3857dc.a3.i();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XWeb.MM.WebViewKernelTestSwitcher", "webViewKernelMode, webviewMode:" + i18);
            if (i18 == com.p314xaae8f345.p3210x3857dc.z2.RENDER_SANDBOX || i18 == com.p314xaae8f345.p3210x3857dc.z2.RENDER_UNSANDBOX) {
                i17 = 2;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.f270856b = 2;
            } else if (i18 == com.p314xaae8f345.p3210x3857dc.z2.GPU_RENDER_SANDBOX || i18 == com.p314xaae8f345.p3210x3857dc.z2.GPU_RENDER_UNSANDBOX) {
                i17 = 0;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.f270856b = 0;
            } else {
                i17 = 1;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.f270856b = 1;
            }
        }
        this.f367685b = i17;
        this.f367686c = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.d();
    }
}
