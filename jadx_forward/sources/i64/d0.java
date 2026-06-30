package i64;

/* loaded from: classes4.dex */
public class d0 {
    public final java.lang.String G;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f370667b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f370668c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f370669d;

    /* renamed from: h, reason: collision with root package name */
    public int f370673h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f370674i;

    /* renamed from: j, reason: collision with root package name */
    public final int f370675j;

    /* renamed from: k, reason: collision with root package name */
    public int f370676k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f370677l;

    /* renamed from: m, reason: collision with root package name */
    public final long f370678m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 f370679n;

    /* renamed from: a, reason: collision with root package name */
    public boolean f370666a = false;

    /* renamed from: e, reason: collision with root package name */
    public int f370670e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f370671f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f370672g = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f370680o = -10086;

    /* renamed from: p, reason: collision with root package name */
    public int f370681p = -10086;

    /* renamed from: q, reason: collision with root package name */
    public int f370682q = -10086;

    /* renamed from: r, reason: collision with root package name */
    public long f370683r = 0;

    /* renamed from: s, reason: collision with root package name */
    public long f370684s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f370685t = -10086;

    /* renamed from: u, reason: collision with root package name */
    public long f370686u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f370687v = -10086;

    /* renamed from: w, reason: collision with root package name */
    public long f370688w = 0;

    /* renamed from: x, reason: collision with root package name */
    public long f370689x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f370690y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f370691z = 0;
    public int A = -1;
    public int B = -1;
    public int C = 0;
    public int D = 0;
    public boolean E = false;
    public int F = 0;
    public boolean H = false;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17902x72cc1771 c17902x72cc1771, java.lang.String str, long j17, android.view.View view, int i17, android.view.View view2, int i18, int i19, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7, int i27, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 c17903x3b438f4) {
        this.f370675j = 0;
        java.lang.String str2 = "";
        this.f370677l = "";
        this.f370678m = 0L;
        this.G = "";
        this.f370668c = view;
        this.f370667b = c19806x4c372b7;
        this.f370679n = c17903x3b438f4;
        if (c17902x72cc1771 != null) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        }
        if (c17902x72cc1771 != null) {
            java.lang.String str3 = c17902x72cc1771.f38104xce64ddf1;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 != null) {
                str2 = str3;
            }
        }
        this.f370677l = str2;
        this.G = str;
        this.f370678m = j17;
        this.f370673h = i17;
        this.f370674i = view2;
        this.f370675j = i18;
        if (view != null) {
            this.f370669d = view.findViewById(com.p314xaae8f345.mm.R.id.f564408qh);
        }
        c();
    }

    public void a(boolean z17) {
        boolean z18;
        boolean z19;
        boolean z27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        android.view.View view = this.f370668c;
        if (view != null) {
            c();
            boolean z28 = this.E;
            int i17 = this.f370671f;
            if (z28 || i17 <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                return;
            }
            boolean z29 = true;
            this.f370666a = true;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i18 = (iArr[1] - this.f370676k) - this.f370675j;
            int i19 = this.f370671f;
            int i27 = i18 + i19;
            if (i18 < 0 || i27 < 0 || i27 > this.f370673h) {
                this.F = 0;
            } else {
                this.F = 1;
                this.H = true;
            }
            if (this.f370680o == -10086 && this.f370681p == -10086) {
                this.f370680o = i18;
                this.f370681p = i27;
            }
            this.f370682q = i18;
            int i28 = this.f370672g;
            if (i18 < 0) {
                int i29 = i19 - i27;
                if (i27 < i28 || this.f370685t != -10086) {
                    z19 = true;
                } else {
                    this.f370685t = i18;
                    this.f370686u = java.lang.System.currentTimeMillis();
                    z19 = false;
                }
                if (i29 >= this.f370672g && this.f370687v == -10086 && z19 && this.f370686u > 0) {
                    this.f370687v = i18;
                    this.f370688w = java.lang.System.currentTimeMillis();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                int i37 = this.f370672g;
                if (i27 >= i37) {
                    this.H = true;
                    z27 = false;
                } else {
                    z27 = true;
                }
                if (i29 >= i37 && z27) {
                    this.H = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            }
            int i38 = this.f370673h;
            if (i27 > i38) {
                int i39 = i27 - i38;
                int i47 = this.f370671f - i39;
                if (i47 < this.f370672g || this.f370685t != -10086) {
                    z18 = true;
                } else {
                    this.f370685t = i18;
                    this.f370686u = java.lang.System.currentTimeMillis();
                    z18 = false;
                }
                if (i39 >= this.f370672g && this.f370687v == -10086 && z18 && this.f370686u > 0) {
                    this.f370687v = i18;
                    this.f370688w = java.lang.System.currentTimeMillis();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                int i48 = this.f370672g;
                if (i47 >= i48) {
                    this.H = true;
                    z29 = false;
                }
                if (i39 >= i48 && z29) {
                    this.H = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcHalfVisibleState", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
            }
            if (i18 < 0 || i27 > this.f370673h) {
                if (this.f370690y == 0 && this.f370689x != 0) {
                    this.f370690y = java.lang.System.currentTimeMillis();
                }
            } else if (this.f370689x == 0) {
                this.f370689x = java.lang.System.currentTimeMillis();
            }
            if (i18 < 0) {
                int i49 = -i18;
                int i57 = this.A;
                if (i57 == -1 || i57 > i49) {
                    this.A = i49;
                }
            } else {
                this.A = 0;
            }
            int i58 = this.f370673h;
            if (i27 > i58) {
                int i59 = i27 - i58;
                int i66 = this.B;
                if (i66 == -1 || i66 > i59) {
                    this.B = i59;
                }
            } else {
                this.B = 0;
            }
            int i67 = this.f370671f;
            if (i18 < 0) {
                i67 += i18;
            }
            if (i27 > i58) {
                i67 -= i27 - i58;
            }
            int i68 = this.f370691z;
            if (i68 == -1 || i68 < i67) {
                this.f370691z = i67;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calc", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.h3 b() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i64.d0.b():r45.h3");
    }

    public final void c() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initView", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
        if (this.f370671f == 0 && (view = this.f370668c) != null) {
            this.f370671f = view.getHeight();
            android.view.View view2 = this.f370669d;
            if (view2 != null && view2.getVisibility() == 0) {
                this.f370670e = view2.getHeight();
            }
            if (this.f370671f == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
                return;
            }
            this.f370676k = 0;
            android.view.View view3 = this.f370674i;
            if (view3 != null) {
                this.f370676k = view3.getHeight();
            }
            int i17 = this.f370671f - this.f370670e;
            this.f370671f = i17;
            this.f370672g = i17 / 2;
            int i18 = this.f370673h - this.f370676k;
            int i19 = this.f370675j;
            this.f370673h = i18 - i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdViewStatic", "viewHeight " + this.f370671f + " SCREEN_HEIGHT: " + this.f370673h + " abottom: " + this.f370676k + " stHeight: " + i19 + " commentViewHeight:" + this.f370670e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initView", "com.tencent.mm.plugin.sns.ad.model.AdViewStatic");
    }
}
