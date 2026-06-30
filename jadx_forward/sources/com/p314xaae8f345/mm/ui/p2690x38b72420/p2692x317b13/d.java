package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f288365a;

    /* renamed from: b, reason: collision with root package name */
    public final int f288366b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f288368d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f288369e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f288370f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f288371g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f288372h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f288373i;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f288381q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f288382r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f288383s;

    /* renamed from: t, reason: collision with root package name */
    public int f288384t;

    /* renamed from: u, reason: collision with root package name */
    public int f288385u;

    /* renamed from: v, reason: collision with root package name */
    public int f288386v;

    /* renamed from: w, reason: collision with root package name */
    public int f288387w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f288388x;

    /* renamed from: c, reason: collision with root package name */
    public boolean f288367c = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f288374j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f288375k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f288376l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f288377m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f288378n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f288379o = true;

    /* renamed from: p, reason: collision with root package name */
    public boolean f288380p = false;

    static {
        int h17 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia);
        int h18 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        textPaint.setTextSize(h17);
        textPaint2.setTextSize(h18);
    }

    public d(int i17, int i18) {
        this.f288365a = i17;
        this.f288366b = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseContactDataItem", "Create BaseContactDataItem viewType=%d | position=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    public abstract void a(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar);

    public abstract com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c b();

    public boolean c() {
        return false;
    }

    public boolean d() {
        return this.f288369e;
    }

    public android.text.SpannableString e(android.content.Context context, java.lang.String str, int i17) {
        return ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, str, i17);
    }
}
