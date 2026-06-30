package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public class a2 {

    /* renamed from: j, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 f257855j;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f257861f;

    /* renamed from: a, reason: collision with root package name */
    public int f257856a = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f257858c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f257859d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f257860e = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f257862g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f257863h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f257864i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.w1(this), true);

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 f257857b = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()));

    public static com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2 a() {
        if (f257855j == null) {
            f257855j = new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.a2();
        }
        return f257855j;
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1 z1Var;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258353g2++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipNetStatusChecker", "my network bad");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62.f258354h2++;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipNetStatusChecker", "otherside network bad");
        }
        this.f257863h = 0;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (this.f257858c) {
            return;
        }
        long j17 = this.f257860e;
        if (j17 == -1 || currentTimeMillis - j17 >= 5000) {
            this.f257858c = true;
            this.f257860e = currentTimeMillis;
            java.lang.ref.WeakReference weakReference = this.f257861f;
            if (weakReference == null || (z1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.z1) weakReference.get()) == null) {
                return;
            }
            z1Var.m(z17);
        }
    }

    public void c() {
        this.f257860e = -1L;
        this.f257862g = true;
        this.f257856a = 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.x1(this), 3000L);
    }
}
