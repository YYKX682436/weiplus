package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public final pj4.b0 f255432a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f255433b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f255434c;

    /* renamed from: d, reason: collision with root package name */
    public int f255435d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f255436e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f255437f;

    /* renamed from: g, reason: collision with root package name */
    public long f255438g;

    /* renamed from: h, reason: collision with root package name */
    public long f255439h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f255440i;

    /* renamed from: j, reason: collision with root package name */
    public long f255441j;

    public g8(pj4.b0 curTextStatusExtInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curTextStatusExtInfo, "curTextStatusExtInfo");
        this.f255432a = curTextStatusExtInfo;
        this.f255437f = true;
        this.f255440i = "";
    }

    public final void a(android.content.Context context) {
        pj4.h2 h2Var;
        int i17 = this.f255435d;
        if (i17 == 2) {
            pj4.h2 h2Var2 = (pj4.h2) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 8, pj4.h2.class);
            if (h2Var2 != null) {
                h2Var2.f436624p = this.f255438g * 1000;
                h2Var2.f436627q = this.f255441j;
                h2Var2.S = (int) this.f255439h;
                h2Var2.T = this.f255440i;
                return;
            }
            return;
        }
        if (i17 != 1 || (h2Var = (pj4.h2) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 8, pj4.h2.class)) == null) {
            return;
        }
        h2Var.f436624p = 0L;
        h2Var.f436627q = this.f255441j;
        h2Var.S = (int) this.f255439h;
        h2Var.T = this.f255440i;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "media reset: ");
        this.f255433b = null;
        this.f255434c = null;
        this.f255435d = 0;
        this.f255436e = false;
        this.f255437f = true;
        this.f255438g = 0L;
        this.f255439h = 0L;
        this.f255440i = "";
        this.f255441j = 0L;
    }

    public final void c(bi4.d1 d1Var, java.lang.String str, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        b();
        if (d1Var != null) {
            java.lang.String str2 = d1Var.f436471e;
            if (!(str2 == null || r26.n0.N(str2))) {
                int i17 = d1Var.f436470d.f436507f;
                if (i17 == 1) {
                    this.f255435d = 1;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        java.lang.String a17 = oj4.l.f427351a.a(str);
                        this.f255433b = a17;
                        this.f255434c = a17;
                    }
                    this.f255437f = false;
                } else if (i17 == 2) {
                    this.f255435d = 2;
                    this.f255433b = str;
                    if (str != null) {
                        qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(str);
                        this.f255438g = (wi6 != null ? wi6.f442899d : 0L) / 1000;
                    }
                    this.f255437f = false;
                    this.f255436e = true;
                }
            }
        }
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(this.f255433b);
        this.f255441j = k17;
        this.f255439h = k17;
        this.f255440i = kk.k.e(this.f255433b);
        a(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "[updateFromSetStatusParam] media oriLen:" + this.f255439h + " finalLen:" + this.f255441j + " type:" + this.f255435d + ", useDefaultBackground:" + this.f255437f);
    }
}
