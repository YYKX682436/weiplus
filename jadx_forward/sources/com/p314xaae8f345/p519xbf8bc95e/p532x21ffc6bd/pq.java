package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class pq extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ap> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ap, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fm {
    private static final double M = 1.0E-10d;

    /* renamed from: d, reason: collision with root package name */
    private static final int f132243d = 180;

    /* renamed from: p, reason: collision with root package name */
    private static final int f132244p = 1;
    private java.lang.String A;
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df B;
    private android.graphics.Rect C;
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df[] D;
    private boolean E;
    private boolean F;
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx> G;
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx> H;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 I;

    /* renamed from: J, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f132245J;
    private java.lang.String K;
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e L;

    /* renamed from: b, reason: collision with root package name */
    final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 f132246b;

    /* renamed from: q, reason: collision with root package name */
    private java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> f132247q;

    /* renamed from: r, reason: collision with root package name */
    private java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> f132248r;

    /* renamed from: s, reason: collision with root package name */
    private java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> f132249s;

    /* renamed from: t, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc[] f132250t;

    /* renamed from: u, reason: collision with root package name */
    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f132251u;

    /* renamed from: v, reason: collision with root package name */
    private android.graphics.Rect f132252v;

    /* renamed from: w, reason: collision with root package name */
    private android.graphics.Rect f132253w;

    /* renamed from: x, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx f132254x;

    /* renamed from: y, reason: collision with root package name */
    private final byte[] f132255y;

    /* renamed from: z, reason: collision with root package name */
    private com.tencent.mapsdk.internal.pq.b f132256z;

    /* loaded from: classes13.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] f132257a;

        public a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
            this.f132257a = r2;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] c26041x873d1d26Arr = {c26041x873d1d26, c26041x873d1d262};
        }

        /* renamed from: toString */
        public final java.lang.String m36905x9616526c() {
            return this.f132257a[0].m99518x9616526c() + "    " + this.f132257a[1].m99518x9616526c();
        }
    }

    public pq(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 c26077xede22024) {
        super(azVar);
        this.f132247q = new java.util.concurrent.CopyOnWriteArrayList();
        this.f132255y = new byte[0];
        this.f132256z = new com.tencent.mapsdk.internal.pq.b((byte) 0);
        this.B = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df();
        this.C = new android.graphics.Rect();
        this.E = false;
        this.F = false;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8();
        this.f132246b = c4257x25d9a8e8;
        c4257x25d9a8e8.f16589xe0df7f5 = -1;
        this.I = c26077xede22024;
        this.f132245J = azVar.b();
        if (c26077xede22024 != null && !com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.K)) {
            this.f132245J.f132041h.a(this);
        }
        a(c26077xede22024);
    }

    private static double a(double d17, double d18, double d19, double d27, double d28, double d29) {
        return ((d19 - d17) * (d29 - d18)) - ((d28 - d17) * (d27 - d18));
    }

    private void e() {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8 = this.f132246b;
        if (-1 == c4257x25d9a8e8.f16589xe0df7f5) {
            c4257x25d9a8e8.f16589xe0df7f5 = this.f132245J.a(c4257x25d9a8e8);
        } else if (v()) {
            this.f132245J.b(this.f132246b);
        }
    }

    private android.graphics.Rect f() {
        android.graphics.Rect rect = this.f132252v;
        if (rect != null) {
            return rect;
        }
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list = this.f132247q;
        if (list == null || list.isEmpty() || this.f132247q.size() < 3) {
            return null;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = this.f132247q.get(0);
        int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
        int m35332x962aa94a = c4247x704e24df.m35332x962aa94a();
        int size = this.f132247q.size();
        int i17 = m35331xbc3301f3;
        int i18 = m35332x962aa94a;
        int i19 = i17;
        for (int i27 = 1; i27 < size; i27++) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = this.f132247q.get(i27);
            int m35331xbc3301f32 = c4247x704e24df2.m35331xbc3301f3();
            int m35332x962aa94a2 = c4247x704e24df2.m35332x962aa94a();
            m35332x962aa94a = java.lang.Math.min(m35332x962aa94a, m35332x962aa94a2);
            i18 = java.lang.Math.max(i18, m35332x962aa94a2);
            i19 = java.lang.Math.max(i19, m35331xbc3301f32);
            i17 = java.lang.Math.min(i17, m35331xbc3301f32);
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(m35332x962aa94a, i19, i18, i17);
        this.f132252v = rect2;
        return rect2;
    }

    private android.graphics.Rect g() {
        android.graphics.Rect rect = this.f132253w;
        if (rect != null) {
            return rect;
        }
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list = this.f132247q;
        if (list == null || list.isEmpty() || this.f132247q.size() < 3) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b17 = this.f132245J.f132046m.b(this.f132247q.get(0).m35336x89192361());
        int x17 = (int) b17.x();
        int x18 = (int) b17.x();
        int y17 = (int) b17.y();
        int y18 = (int) b17.y();
        int size = this.f132247q.size();
        for (int i17 = 1; i17 < size; i17++) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b18 = this.f132245J.f132046m.b(this.f132247q.get(i17).m35336x89192361());
            x17 = (int) java.lang.Math.min(x17, b18.x());
            x18 = (int) java.lang.Math.max(x18, b18.x());
            y17 = (int) java.lang.Math.min(y17, b18.y());
            y18 = (int) java.lang.Math.max(y18, b18.y());
        }
        android.graphics.Rect rect2 = new android.graphics.Rect(x17, y17, x18, y18);
        this.f132253w = rect2;
        return rect2;
    }

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ap h() {
        return this;
    }

    private android.graphics.Rect i() {
        if (this.f132245J == null) {
            return null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b17 = this.f132245J.f132046m.b(this.f132245J.f132046m.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(0.0d, 0.0d)).m35336x89192361());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b18 = this.f132245J.f132046m.b(this.f132245J.f132046m.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f132245J.f132048o.width(), this.f132245J.f132048o.height())).m35336x89192361());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b19 = this.f132245J.f132046m.b(this.f132245J.f132046m.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(0.0d, this.f132245J.f132048o.height())).m35336x89192361());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc b27 = this.f132245J.f132046m.b(this.f132245J.f132046m.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(this.f132245J.f132048o.width(), 0.0d)).m35336x89192361());
        return new android.graphics.Rect((int) java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(b17.x(), b19.x()), b18.x()), b27.x()), (int) java.lang.Math.min(java.lang.Math.min(java.lang.Math.min(b17.y(), b19.y()), b18.y()), b27.y()), (int) java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(b17.x(), b19.x()), b18.x()), b27.x()), (int) java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(b17.y(), b19.y()), b18.y()), b27.y()));
    }

    private static int j() {
        return 1;
    }

    private com.tencent.mapsdk.internal.pq.a[] k() {
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list = this.f132247q;
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(list);
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            int i18 = size - 1;
            if (i17 >= i18) {
                arrayList.add(new com.tencent.mapsdk.internal.pq.a(a17.get(i18), a17.get(0)));
                return (com.tencent.mapsdk.internal.pq.a[]) arrayList.toArray(new com.tencent.mapsdk.internal.pq.a[arrayList.size()]);
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = a17.get(i17);
            i17++;
            arrayList.add(new com.tencent.mapsdk.internal.pq.a(c26041x873d1d26, a17.get(i17)));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ap
    public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 b() {
        return this.f132246b;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ap
    public final java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> c() {
        java.util.ArrayList arrayList = new java.util.ArrayList(49);
        android.graphics.Rect f17 = f();
        int i17 = f17.left;
        int i18 = f17.top;
        double d17 = i17;
        double abs = java.lang.Math.abs(f17.width());
        double d18 = d17 - (abs * 0.125d);
        double d19 = i18;
        double abs2 = java.lang.Math.abs(f17.height());
        double d27 = d19 - (0.125d * abs2);
        double d28 = d17 - (abs * 0.25d);
        double d29 = d19 - (0.25d * abs2);
        double d37 = d17 - (abs * 0.375d);
        double d38 = d19 - (0.375d * abs2);
        double d39 = d17 - (abs * 0.5d);
        double d47 = d19 - (0.5d * abs2);
        double d48 = d17 - (abs * 0.625d);
        double d49 = d19 - (0.625d * abs2);
        double d57 = d17 - (abs * 0.75d);
        double d58 = d19 - (0.75d * abs2);
        double d59 = d17 - (abs * 0.825d);
        double d66 = d19 - (abs2 * 0.825d);
        int i19 = (int) d27;
        int i27 = (int) d18;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i27));
        if (a(c4247x704e24df)) {
            arrayList.add(c4247x704e24df);
        }
        int i28 = (int) d29;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i28, i27));
        if (a(c4247x704e24df2)) {
            arrayList.add(c4247x704e24df2);
        }
        int i29 = (int) d38;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i29, i27));
        if (a(c4247x704e24df3)) {
            arrayList.add(c4247x704e24df3);
        }
        int i37 = (int) d47;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df4 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i37, i27));
        if (a(c4247x704e24df4)) {
            arrayList.add(c4247x704e24df4);
        }
        int i38 = (int) d49;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df5 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i38, i27));
        if (a(c4247x704e24df5)) {
            arrayList.add(c4247x704e24df5);
        }
        int i39 = (int) d58;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df6 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i39, i27));
        if (a(c4247x704e24df6)) {
            arrayList.add(c4247x704e24df6);
        }
        int i47 = (int) d66;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df7 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i47, i27));
        if (a(c4247x704e24df7)) {
            arrayList.add(c4247x704e24df7);
        }
        int i48 = (int) d28;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df8 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i48));
        if (a(c4247x704e24df8)) {
            arrayList.add(c4247x704e24df8);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df9 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i28, i48));
        if (a(c4247x704e24df9)) {
            arrayList.add(c4247x704e24df9);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df10 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i29, i48));
        if (a(c4247x704e24df10)) {
            arrayList.add(c4247x704e24df10);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df11 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i37, i48));
        if (a(c4247x704e24df11)) {
            arrayList.add(c4247x704e24df11);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df12 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i38, i48));
        if (a(c4247x704e24df12)) {
            arrayList.add(c4247x704e24df12);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df13 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i39, i48));
        if (a(c4247x704e24df13)) {
            arrayList.add(c4247x704e24df13);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df14 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i47, i48));
        if (a(c4247x704e24df14)) {
            arrayList.add(c4247x704e24df14);
        }
        int i49 = (int) d37;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df15 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i49));
        if (a(c4247x704e24df15)) {
            arrayList.add(c4247x704e24df15);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df16 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i28, i49));
        if (a(c4247x704e24df16)) {
            arrayList.add(c4247x704e24df16);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df17 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i29, i49));
        if (a(c4247x704e24df17)) {
            arrayList.add(c4247x704e24df17);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df18 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i37, i49));
        if (a(c4247x704e24df18)) {
            arrayList.add(c4247x704e24df18);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df19 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i38, i49));
        if (a(c4247x704e24df19)) {
            arrayList.add(c4247x704e24df19);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df20 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i39, i49));
        if (a(c4247x704e24df20)) {
            arrayList.add(c4247x704e24df20);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df21 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i47, i49));
        if (a(c4247x704e24df21)) {
            arrayList.add(c4247x704e24df21);
        }
        int i57 = (int) d39;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df22 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i57));
        if (a(c4247x704e24df22)) {
            arrayList.add(c4247x704e24df22);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df23 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i28, i57));
        if (a(c4247x704e24df23)) {
            arrayList.add(c4247x704e24df23);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df24 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i29, i57));
        if (a(c4247x704e24df24)) {
            arrayList.add(c4247x704e24df24);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df25 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i37, i57));
        if (a(c4247x704e24df25)) {
            arrayList.add(c4247x704e24df25);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df26 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i38, i57));
        if (a(c4247x704e24df26)) {
            arrayList.add(c4247x704e24df26);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df27 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i39, i57));
        if (a(c4247x704e24df27)) {
            arrayList.add(c4247x704e24df27);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df28 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i47, i57));
        if (a(c4247x704e24df28)) {
            arrayList.add(c4247x704e24df28);
        }
        int i58 = (int) d48;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df29 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i58));
        if (a(c4247x704e24df29)) {
            arrayList.add(c4247x704e24df29);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df30 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i28, i58));
        if (a(c4247x704e24df30)) {
            arrayList.add(c4247x704e24df30);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df31 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i29, i58));
        if (a(c4247x704e24df31)) {
            arrayList.add(c4247x704e24df31);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df32 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i37, i58));
        if (a(c4247x704e24df32)) {
            arrayList.add(c4247x704e24df32);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df33 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i38, i58));
        if (a(c4247x704e24df33)) {
            arrayList.add(c4247x704e24df33);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df34 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i39, i58));
        if (a(c4247x704e24df34)) {
            arrayList.add(c4247x704e24df34);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df35 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i47, i58));
        if (a(c4247x704e24df35)) {
            arrayList.add(c4247x704e24df35);
        }
        int i59 = (int) d57;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df36 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i59));
        if (a(c4247x704e24df36)) {
            arrayList.add(c4247x704e24df36);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df37 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i28, i59));
        if (a(c4247x704e24df37)) {
            arrayList.add(c4247x704e24df37);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df38 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i29, i59));
        if (a(c4247x704e24df38)) {
            arrayList.add(c4247x704e24df38);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df39 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i37, i59));
        if (a(c4247x704e24df39)) {
            arrayList.add(c4247x704e24df39);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df40 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i38, i59));
        if (a(c4247x704e24df40)) {
            arrayList.add(c4247x704e24df40);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df41 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i39, i59));
        if (a(c4247x704e24df41)) {
            arrayList.add(c4247x704e24df41);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df42 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i47, i59));
        if (a(c4247x704e24df42)) {
            arrayList.add(c4247x704e24df42);
        }
        int i66 = (int) d59;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df43 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i66));
        if (a(c4247x704e24df43)) {
            arrayList.add(c4247x704e24df43);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df44 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i28, i66));
        if (a(c4247x704e24df44)) {
            arrayList.add(c4247x704e24df44);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df45 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i29, i66));
        if (a(c4247x704e24df45)) {
            arrayList.add(c4247x704e24df45);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df46 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i37, i66));
        if (a(c4247x704e24df46)) {
            arrayList.add(c4247x704e24df46);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df47 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i38, i66));
        if (a(c4247x704e24df47)) {
            arrayList.add(c4247x704e24df47);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df48 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i39, i66));
        if (a(c4247x704e24df48)) {
            arrayList.add(c4247x704e24df48);
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df49 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i47, i66));
        if (a(c4247x704e24df49)) {
            arrayList.add(c4247x704e24df49);
        }
        return arrayList;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26076x4b86ed1a
    /* renamed from: contains */
    public final boolean mo36484xde2d761f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> mo36485x2a837fd9 = mo36485x2a837fd9();
        if (mo36485x2a837fd9 == null || mo36485x2a837fd9.size() < 3 || c26041x873d1d26 == null) {
            return false;
        }
        int size = mo36485x2a837fd9.size() - 1;
        for (int i17 = 0; i17 < mo36485x2a837fd9.size(); i17++) {
            if (mo36485x2a837fd9.get(i17).m99507xb2c87fbf(c26041x873d1d26)) {
                return true;
            }
        }
        boolean z17 = false;
        int i18 = size;
        for (int i19 = 0; i19 < mo36485x2a837fd9.size(); i19++) {
            if (((mo36485x2a837fd9.get(i19).f49501xaa2bac6c < c26041x873d1d26.f49501xaa2bac6c && mo36485x2a837fd9.get(i18).f49501xaa2bac6c >= c26041x873d1d26.f49501xaa2bac6c) || (mo36485x2a837fd9.get(i18).f49501xaa2bac6c < c26041x873d1d26.f49501xaa2bac6c && mo36485x2a837fd9.get(i19).f49501xaa2bac6c >= c26041x873d1d26.f49501xaa2bac6c)) && (mo36485x2a837fd9.get(i19).f49502x83009af <= c26041x873d1d26.f49502x83009af || mo36485x2a837fd9.get(i18).f49502x83009af <= c26041x873d1d26.f49502x83009af)) {
                z17 ^= mo36485x2a837fd9.get(i19).f49502x83009af + (((c26041x873d1d26.f49501xaa2bac6c - mo36485x2a837fd9.get(i19).f49501xaa2bac6c) / (mo36485x2a837fd9.get(i18).f49501xaa2bac6c - mo36485x2a837fd9.get(i19).f49501xaa2bac6c)) * (mo36485x2a837fd9.get(i18).f49502x83009af - mo36485x2a837fd9.get(i19).f49502x83009af)) <= c26041x873d1d26.f49502x83009af;
            }
            i18 = i19;
        }
        return z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ap
    public final com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df d() {
        android.graphics.Rect f17 = f();
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(f17.centerY(), f17.centerX());
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    public final /* bridge */ /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao f_() {
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26076x4b86ed1a
    /* renamed from: getPoints */
    public final java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> mo36485x2a837fd9() {
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list = this.f132248r;
        return list != null ? list : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(this.f132247q);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void h_() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132245J;
        if (neVar == null) {
            return;
        }
        neVar.f132041h.b(this);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8 = this.f132246b;
        if (c4257x25d9a8e8 != null) {
            this.f132245J.a(c4257x25d9a8e8.f16589xe0df7f5);
        }
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list = this.f132247q;
        if (list != null) {
            list.clear();
        }
        synchronized (this.f132255y) {
            com.tencent.mapsdk.internal.pq.b bVar = this.f132256z;
            if (bVar != null) {
                android.graphics.Bitmap bitmap = bVar.f132261a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    bVar.f132261a.recycle();
                    bVar.f132261a = null;
                }
                this.f132256z = null;
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132254x;
        if (qxVar != null) {
            this.f132245J.f132043j.b(qxVar);
            this.f132245J.f132055v = true;
            this.f132254x = null;
        }
        this.E = false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: handleOnTap */
    public final boolean mo36421x5820b3fc() {
        return true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876
    /* renamed from: isSelected */
    public final boolean mo36422x17bd99e5() {
        return false;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void j_() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f132245J;
        if (neVar == null) {
            return;
        }
        if (!mo36423xf94337e8()) {
            neVar.a(this.f132246b.f16589xe0df7f5);
            this.f132246b.f16589xe0df7f5 = -1;
            return;
        }
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.K)) {
            p();
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8 = this.f132246b;
        if (-1 == c4257x25d9a8e8.f16589xe0df7f5) {
            c4257x25d9a8e8.f16589xe0df7f5 = this.f132245J.a(c4257x25d9a8e8);
        } else if (v()) {
            this.f132245J.b(this.f132246b);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132254x;
        if (qxVar != null) {
            qxVar.j_();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(this.f132254x.a());
            this.A = sb6.toString();
            if (this.F) {
                return;
            }
            int a17 = this.f132254x.a();
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e82 = this.f132246b;
            neVar.a(a17, c4257x25d9a8e82 != null ? c4257x25d9a8e82.f16589xe0df7f5 : -1);
            this.F = true;
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ap
    public final int k_() {
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8 = this.f132246b;
        if (c4257x25d9a8e8 == null) {
            return -1;
        }
        return c4257x25d9a8e8.f16589xe0df7f5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x020d, code lost:
    
        if (r8 <= (r4 / 2.0d)) goto L33;
     */
    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: onTap */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo36424x64f7944(float r16, float r17) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pq.mo36424x64f7944(float, float):boolean");
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ev
    public final void p() {
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list;
        if (this.f132245J == null) {
            return;
        }
        if ((this.f132246b.f16589xe0df7f5 < 0 || v()) && (list = this.f132247q) != null && list.size() > 2) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4257x25d9a8e8 c4257x25d9a8e8 = this.f132246b;
            c4257x25d9a8e8.f16581x5a72f63 = this.f132205f;
            c4257x25d9a8e8.f16578x2b158697 = this.f132206g;
            c4257x25d9a8e8.f16580x2c2c84fa = this.f132204e;
            c4257x25d9a8e8.f16592xd4677478 = mo36420x397e976e();
            this.f132246b.f16584x6219b84 = mo36418x74bf41ce();
            int size = this.f132247q.size();
            this.f132246b.f16588xc56c5ce3 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[size];
            for (int i17 = 0; i17 < size; i17++) {
                this.f132246b.f16588xc56c5ce3[i17] = this.f132247q.get(i17).m35336x89192361();
            }
            int size2 = this.f132249s.size();
            this.f132246b.f16583xc827adc3 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[size2];
            for (int i18 = 0; i18 < size2; i18++) {
                this.f132246b.f16583xc827adc3[i18] = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[]) this.f132249s.get(i18).toArray(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[0]);
            }
            this.f132245J.f132055v = true;
            w();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26076x4b86ed1a
    /* renamed from: setHolePoints */
    public final void mo36486xe48cb3c5(java.util.List<java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26>> list) {
        if (list != null && list.size() > 0) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 c26077xede22024 = this.I;
            if (c26077xede22024 != null) {
                c26077xede22024.m99845xe48cb3c5(list);
            }
            this.f132249s.clear();
            for (java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list2 : list) {
                if (list2 != null && list2.size() >= 3) {
                    this.f132249s.add(list2);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26076x4b86ed1a
    /* renamed from: setOptions */
    public final void mo36487x66c50fdc(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 c26077xede22024) {
        a(c26077xede22024);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26076x4b86ed1a
    /* renamed from: setPoints */
    public final void mo36488x1db8b3e5(java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> list) {
        int size;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df m35328x3017aa;
        this.f132248r = list;
        if (list != null && (size = list.size()) > 0) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 c26077xede22024 = this.I;
            if (c26077xede22024 != null) {
                c26077xede22024.m99846x1db8b3e5(new java.util.ArrayList(list));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < size; i17++) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = list.get(i17);
                if (c26041x873d1d26 != null && (m35328x3017aa = com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df.m35328x3017aa(c26041x873d1d26)) != null) {
                    arrayList.add(m35328x3017aa);
                }
            }
            a(arrayList);
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876
    /* renamed from: setSelected */
    public final void mo36425xbd98911d(boolean z17) {
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876
    /* renamed from: setSelectedListener */
    public final void mo36426x884f4cf1(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876.OnSelectedListener onSelectedListener) {
    }

    private static boolean a(double d17, double d18, double d19, double d27, double d28, double d29, double d37) {
        double d38 = d19 - d17;
        double d39 = d37 - d29;
        double d47 = d27 - d18;
        double d48 = 180.0d - d28;
        double d49 = (d38 * d39) - (d47 * d48);
        if (d49 != 0.0d) {
            double d57 = d18 - d29;
            double d58 = d17 - d28;
            double d59 = ((d48 * d57) - (d39 * d58)) / d49;
            double d66 = ((d57 * d38) - (d58 * d47)) / d49;
            if (d59 >= 0.0d && d59 <= 1.0d && d66 >= 0.0d && d66 <= 1.0d) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(double d17, double d18, double d19, double d27, double d28, double d29) {
        return java.lang.Math.abs(a(d17, d18, d19, d27, d28, d29)) < 1.0E-9d && (d17 - d19) * (d17 - d28) <= 0.0d && (d18 - d27) * (d18 - d29) <= 0.0d;
    }

    private void a(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list2 = this.f132247q;
        if (list2 == null) {
            this.f132247q = new java.util.ArrayList();
        } else {
            list2.clear();
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = list.get(i17);
            if (c4247x704e24df != null) {
                w();
                this.f132247q.add(c4247x704e24df);
            }
        }
    }

    private void d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        if (this.f132245J == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.K)) {
            return;
        }
        synchronized (this.f132255y) {
            byte b17 = 0;
            if (this.f132256z == null) {
                this.f132256z = new com.tencent.mapsdk.internal.pq.b(b17);
            }
        }
        android.graphics.Rect rect = this.C;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect.top, rect.left);
        android.graphics.Rect rect2 = this.C;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect2.top, rect2.right);
        android.graphics.Rect rect3 = this.C;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect3.bottom, rect3.right);
        android.graphics.Rect rect4 = this.C;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[] a17 = a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[]{eyVar.a(c4247x704e24df), eyVar.a(c4247x704e24df2), eyVar.a(c4247x704e24df3), eyVar.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect4.bottom, rect4.left))});
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = a17[0];
        int i17 = (int) fuVar.f131000a;
        int i18 = (int) fuVar.f131001b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = a17[1];
        new android.graphics.Rect(i17, i18, (int) fuVar2.f131000a, (int) fuVar2.f131001b);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: b */
    public final android.graphics.Rect mo36416x7436dfc8(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        android.graphics.Rect rect = new android.graphics.Rect();
        new android.graphics.Rect();
        if (this.f132246b != null) {
            rect = f();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qx qxVar = this.f132254x;
        if (qxVar != null) {
            android.graphics.Rect mo36416x7436dfc8 = qxVar.mo36416x7436dfc8(eyVar);
            rect.left = java.lang.Math.min(rect.left, mo36416x7436dfc8.left);
            rect.top = java.lang.Math.min(rect.top, mo36416x7436dfc8.top);
            rect.right = java.lang.Math.max(rect.right, mo36416x7436dfc8.right);
            rect.bottom = java.lang.Math.max(rect.bottom, mo36416x7436dfc8.bottom);
        }
        return rect;
    }

    private int e(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        android.graphics.Rect rect = this.C;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect.top, rect.left);
        android.graphics.Rect rect2 = this.C;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect2.top, rect2.right);
        android.graphics.Rect rect3 = this.C;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect3.bottom, rect3.right);
        android.graphics.Rect rect4 = this.C;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[] a17 = a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[]{eyVar.a(c4247x704e24df), eyVar.a(c4247x704e24df2), eyVar.a(c4247x704e24df3), eyVar.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect4.bottom, rect4.left))});
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = a17[0];
        int i17 = (int) fuVar.f131000a;
        int i18 = (int) fuVar.f131001b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = a17[1];
        new android.graphics.Rect(i17, i18, (int) fuVar2.f131000a, (int) fuVar2.f131001b);
        return 1;
    }

    /* loaded from: classes10.dex */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        private static final int f132259b = 900;

        /* renamed from: c, reason: collision with root package name */
        private static final int f132260c = 180;

        /* renamed from: a, reason: collision with root package name */
        android.graphics.Bitmap f132261a;

        /* renamed from: d, reason: collision with root package name */
        private android.text.TextPaint f132262d;

        /* renamed from: e, reason: collision with root package name */
        private int f132263e;

        /* renamed from: f, reason: collision with root package name */
        private int f132264f;

        /* renamed from: g, reason: collision with root package name */
        private int f132265g;

        /* renamed from: h, reason: collision with root package name */
        private java.util.HashMap<java.lang.String, java.lang.Integer> f132266h;

        private b() {
            this.f132261a = null;
            this.f132262d = null;
            this.f132263e = f132259b;
            this.f132264f = 180;
            this.f132265g = -1;
            this.f132266h = new java.util.HashMap<>();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int a(android.graphics.Rect r9, java.lang.String r10, int r11, android.graphics.Typeface r12, int r13, int r14) {
            /*
                r8 = this;
                if (r9 != 0) goto L3
                return r14
            L3:
                int r0 = r9.height()
                int r0 = java.lang.Math.abs(r0)
                int r9 = r9.width()
                int r9 = java.lang.Math.abs(r9)
                android.graphics.Rect r1 = new android.graphics.Rect
                r2 = 0
                r1.<init>(r2, r2, r2, r2)
                r8.a(r13, r11, r12)
                r11 = 1065353216(0x3f800000, float:1.0)
                float r12 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hn.o()
                float r11 = r11 / r12
                double r11 = (double) r11
                double r11 = java.lang.Math.ceil(r11)
                int r11 = (int) r11
                int r12 = r13 / 2
                int[] r3 = r8.a(r10, r12, r1)
                r4 = r3[r2]
                r5 = 1
                r3 = r3[r5]
                if (r4 > r9) goto L4c
                if (r3 > r0) goto L4c
            L38:
                int r3 = r12 + r11
                r7 = r3
                r3 = r12
                r12 = r7
                if (r12 >= r13) goto L60
                int[] r4 = r8.a(r10, r12, r1)
                r6 = r4[r2]
                r4 = r4[r5]
                if (r6 > r9) goto L60
                if (r4 > r0) goto L60
                goto L38
            L4c:
                int r12 = r12 - r11
                r3 = r12
            L4e:
                if (r3 < r14) goto L5f
                int[] r12 = r8.a(r10, r3, r1)
                r4 = r12[r2]
                r12 = r12[r5]
                if (r4 > r9) goto L5d
                if (r12 > r0) goto L5d
                goto L60
            L5d:
                int r3 = r3 - r11
                goto L4e
            L5f:
                r3 = r14
            L60:
                if (r3 >= r14) goto L63
                goto L64
            L63:
                r14 = r3
            L64:
                if (r14 <= r13) goto L67
                goto L68
            L67:
                r13 = r14
            L68:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.pq.b.a(android.graphics.Rect, java.lang.String, int, android.graphics.Typeface, int, int):int");
        }

        public /* synthetic */ b(byte b17) {
            this();
        }

        private int[] a(java.lang.String str, int i17, android.graphics.Rect rect) {
            a(i17);
            this.f132262d.getTextBounds(str, 0, str.length(), rect);
            return new int[]{java.lang.Math.abs(rect.width()), java.lang.Math.abs(rect.height())};
        }

        private void a() {
            android.graphics.Bitmap bitmap = this.f132261a;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            this.f132261a.recycle();
            this.f132261a = null;
        }

        private void a(java.lang.String str, int i17, int i18, android.graphics.Typeface typeface) {
            if (this.f132261a == null) {
                try {
                    this.f132261a = android.graphics.Bitmap.createBitmap(this.f132263e, this.f132264f, android.graphics.Bitmap.Config.ARGB_8888);
                } catch (java.lang.OutOfMemoryError unused) {
                    return;
                }
            }
            a(i17, i18, typeface);
            android.graphics.Rect rect = new android.graphics.Rect();
            this.f132262d.getTextBounds(str, 0, str.length(), rect);
            int abs = java.lang.Math.abs(rect.width());
            int abs2 = java.lang.Math.abs(rect.height());
            int i19 = this.f132263e;
            if (abs > i19 || abs2 > this.f132264f) {
                this.f132263e = java.lang.Math.max(abs, i19);
                int max = java.lang.Math.max(abs2, this.f132264f);
                this.f132264f = max;
                this.f132261a = android.graphics.Bitmap.createBitmap(this.f132263e, max, android.graphics.Bitmap.Config.ARGB_8888);
            }
            this.f132261a.eraseColor(0);
            new android.graphics.Canvas(this.f132261a).drawText(str, this.f132263e / 2.0f, (this.f132264f / 2.0f) - ((this.f132262d.descent() + this.f132262d.ascent()) / 2.0f), this.f132262d);
        }

        private void a(int i17, int i18, android.graphics.Typeface typeface) {
            if (this.f132262d == null) {
                android.text.TextPaint textPaint = new android.text.TextPaint(65);
                this.f132262d = textPaint;
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                this.f132262d.setTextAlign(android.graphics.Paint.Align.CENTER);
            }
            this.f132262d.setColor(i18);
            this.f132262d.setTextSize(i17);
            this.f132262d.setTypeface(typeface);
        }

        private void a(int i17) {
            android.text.TextPaint textPaint = this.f132262d;
            if (textPaint != null) {
                textPaint.setTextSize(i17);
            }
        }

        private static java.lang.String a(java.lang.String str, java.lang.String str2, int i17) {
            return str + "_" + str2 + "_" + i17;
        }

        private java.lang.Object[] a(java.lang.String str, java.lang.String str2, int i17, int i18, android.graphics.Typeface typeface) {
            java.lang.String str3 = str + "_" + str2 + "_" + i17;
            if (i17 > 180) {
                i17 = 180;
            }
            if (i17 != this.f132265g) {
                if (this.f132261a == null) {
                    try {
                        this.f132261a = android.graphics.Bitmap.createBitmap(this.f132263e, this.f132264f, android.graphics.Bitmap.Config.ARGB_8888);
                    } catch (java.lang.OutOfMemoryError unused) {
                    }
                }
                a(i17, i18, typeface);
                android.graphics.Rect rect = new android.graphics.Rect();
                this.f132262d.getTextBounds(str2, 0, str2.length(), rect);
                int abs = java.lang.Math.abs(rect.width());
                int abs2 = java.lang.Math.abs(rect.height());
                int i19 = this.f132263e;
                if (abs > i19 || abs2 > this.f132264f) {
                    this.f132263e = java.lang.Math.max(abs, i19);
                    int max = java.lang.Math.max(abs2, this.f132264f);
                    this.f132264f = max;
                    this.f132261a = android.graphics.Bitmap.createBitmap(this.f132263e, max, android.graphics.Bitmap.Config.ARGB_8888);
                }
                this.f132261a.eraseColor(0);
                new android.graphics.Canvas(this.f132261a).drawText(str2, this.f132263e / 2.0f, (this.f132264f / 2.0f) - ((this.f132262d.descent() + this.f132262d.ascent()) / 2.0f), this.f132262d);
                this.f132265g = i17;
            }
            return new java.lang.Object[]{str3, this.f132261a};
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ap
    public final void a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 c26077xede22024) {
        if (c26077xede22024 == null) {
            return;
        }
        m36900x17b1755e(c26077xede22024.m99830xbb5db4ea());
        m36901xe1d3a649(c26077xede22024.m99835x4b6e32d5());
        m36902xe2eaa4ac(c26077xede22024.m99836x4c853138());
        mo36428x2cb3cb7a(c26077xede22024.m99839x397e976e());
        mo36427xcd1079b0(c26077xede22024.m99842xf94337e8());
        mo35536x534d5c42(c26077xede22024.m99832x74bf41ce());
        m36899xe6a688a0(c26077xede22024.m99840xd12298d8());
        mo36488x1db8b3e5(c26077xede22024.m99834x2a837fd9());
        java.util.List<java.lang.Integer> m99833xea6275a = c26077xede22024.m99833xea6275a();
        if (m99833xea6275a != null && !m99833xea6275a.isEmpty()) {
            int[] iArr = new int[m99833xea6275a.size()];
            for (int i17 = 0; i17 < m99833xea6275a.size(); i17++) {
                iArr[i17] = m99833xea6275a.get(i17).intValue();
            }
            this.f132246b.f16587xd0d8eb90 = iArr;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e m99837xe94b10e5 = c26077xede22024.m99837xe94b10e5();
        if (this.L != m99837xe94b10e5) {
            this.L = m99837xe94b10e5;
            m99837xe94b10e5.m99320x12501425(this.f132245J.mo36630x76847179());
            this.f132246b.f16590x602cbe46 = this.L.m99321x981c205a().mo36721xbe9ba820();
        }
        this.f132246b.f16591x1841c2a8 = c26077xede22024.m99838x6d98f9e();
        this.f132249s = c26077xede22024.m99831xb66865b9();
        w();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fm
    public final void b(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        if (i17 == com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gf.f131108a || (neVar = this.f132245J) == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar = neVar.f132046m;
        if (neVar == null || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(this.K)) {
            return;
        }
        synchronized (this.f132255y) {
            byte b17 = 0;
            if (this.f132256z == null) {
                this.f132256z = new com.tencent.mapsdk.internal.pq.b(b17);
            }
        }
        android.graphics.Rect rect = this.C;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect.top, rect.left);
        android.graphics.Rect rect2 = this.C;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect2.top, rect2.right);
        android.graphics.Rect rect3 = this.C;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect3.bottom, rect3.right);
        android.graphics.Rect rect4 = this.C;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[] a17 = a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[]{eyVar.a(c4247x704e24df), eyVar.a(c4247x704e24df2), eyVar.a(c4247x704e24df3), eyVar.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect4.bottom, rect4.left))});
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = a17[0];
        int i18 = (int) fuVar.f131000a;
        int i19 = (int) fuVar.f131001b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = a17[1];
        new android.graphics.Rect(i18, i19, (int) fuVar2.f131000a, (int) fuVar2.f131001b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0138, code lost:
    
        r18 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gc r22) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pq.a(com.tencent.mapsdk.internal.gc):boolean");
    }

    private boolean a(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.f132253w;
        if (rect2 == null || rect == null) {
            return false;
        }
        double abs = java.lang.Math.abs(((rect2.left + rect2.right) / 2) - ((rect.left + rect.right) / 2));
        android.graphics.Rect rect3 = this.f132253w;
        double abs2 = java.lang.Math.abs(((rect3.top + rect3.bottom) / 2) - ((rect.top + rect.bottom) / 2));
        android.graphics.Rect rect4 = this.f132253w;
        double abs3 = java.lang.Math.abs(rect4.left - rect4.right) + java.lang.Math.abs(rect.left - rect.right);
        android.graphics.Rect rect5 = this.f132253w;
        return abs <= abs3 / 2.0d && abs2 <= ((double) (java.lang.Math.abs(rect5.top - rect5.bottom) + java.lang.Math.abs(rect.top - rect.bottom))) / 2.0d;
    }

    private boolean a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list = this.f132247q;
        if (list == null || list.size() <= 1) {
            return false;
        }
        double m35332x962aa94a = c4247x704e24df.m35332x962aa94a();
        double m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
        int size = this.f132247q.size();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int i19 = size - 1;
            if (i17 < i19) {
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = this.f132247q.get(i17);
                int i27 = i17 + 1;
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = this.f132247q.get(i27);
                double m35332x962aa94a2 = c4247x704e24df2.m35332x962aa94a();
                double m35331xbc3301f32 = c4247x704e24df2.m35331xbc3301f3();
                double m35332x962aa94a3 = c4247x704e24df3.m35332x962aa94a();
                double m35331xbc3301f33 = c4247x704e24df3.m35331xbc3301f3();
                double d17 = m35331xbc3301f3;
                double d18 = m35332x962aa94a;
                if (b(m35332x962aa94a, m35331xbc3301f3, m35332x962aa94a2, m35331xbc3301f32, m35332x962aa94a3, m35331xbc3301f33)) {
                    return true;
                }
                if (java.lang.Math.abs(m35331xbc3301f33 - m35331xbc3301f32) >= 1.0E-9d) {
                    if (b(m35332x962aa94a2, m35331xbc3301f32, d18, d17, 180.0d, d17)) {
                        if (m35331xbc3301f32 <= m35331xbc3301f33) {
                        }
                        i18++;
                    } else if (b(m35332x962aa94a3, m35331xbc3301f33, d18, d17, 180.0d, d17)) {
                        if (m35331xbc3301f33 <= m35331xbc3301f32) {
                        }
                        i18++;
                    } else {
                        if (!a(m35332x962aa94a2, m35331xbc3301f32, m35332x962aa94a3, m35331xbc3301f33, d18, d17, d17)) {
                        }
                        i18++;
                    }
                }
                i17 = i27;
                m35331xbc3301f3 = d17;
                m35332x962aa94a = d18;
            } else {
                double d19 = m35331xbc3301f3;
                double d27 = m35332x962aa94a;
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df4 = this.f132247q.get(i19);
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df5 = this.f132247q.get(0);
                double m35332x962aa94a4 = c4247x704e24df4.m35332x962aa94a();
                double m35331xbc3301f34 = c4247x704e24df4.m35331xbc3301f3();
                double m35332x962aa94a5 = c4247x704e24df5.m35332x962aa94a();
                double m35331xbc3301f35 = c4247x704e24df5.m35331xbc3301f3();
                if (b(d27, d19, m35332x962aa94a4, m35331xbc3301f34, m35332x962aa94a5, m35331xbc3301f35)) {
                    return true;
                }
                if (java.lang.Math.abs(m35331xbc3301f35 - m35331xbc3301f34) >= 1.0E-9d && (!b(m35332x962aa94a4, m35331xbc3301f34, d27, d19, 180.0d, d19) ? !(!b(m35332x962aa94a5, m35331xbc3301f35, d27, d19, 180.0d, d19) ? !a(m35332x962aa94a4, m35331xbc3301f34, m35332x962aa94a5, m35331xbc3301f35, d27, d19, d19) : m35331xbc3301f35 <= m35331xbc3301f34) : m35331xbc3301f34 > m35331xbc3301f35)) {
                    i18++;
                }
                return i18 % 2 == 1;
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25979x32e3ffb8
    /* renamed from: a */
    public final android.graphics.Rect mo36419xd5aa333c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        android.graphics.Rect mo36416x7436dfc8 = mo36416x7436dfc8(eyVar);
        int i17 = mo36416x7436dfc8.left;
        int i18 = mo36416x7436dfc8.right;
        int i19 = mo36416x7436dfc8.top;
        int i27 = mo36416x7436dfc8.bottom;
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i17);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i27, i17);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i27, i18);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df4 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(i19, i18);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = eyVar.a(c4247x704e24df);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a18 = eyVar.a(c4247x704e24df2);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a19 = eyVar.a(c4247x704e24df3);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a27 = eyVar.a(c4247x704e24df4);
        return new android.graphics.Rect((int) java.lang.Math.min(java.lang.Math.min(a17.f131000a, a18.f131000a), java.lang.Math.min(a19.f131000a, a27.f131000a)), (int) java.lang.Math.min(java.lang.Math.min(a17.f131001b, a18.f131001b), java.lang.Math.min(a19.f131001b, a27.f131001b)), (int) java.lang.Math.max(java.lang.Math.max(a17.f131000a, a18.f131000a), java.lang.Math.max(a19.f131000a, a27.f131000a)), (int) java.lang.Math.max(java.lang.Math.max(a17.f131001b, a18.f131001b), java.lang.Math.max(a19.f131001b, a27.f131001b)));
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[] a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[] fuVarArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = fuVarArr[0];
        double d17 = fuVar.f131000a;
        double d18 = fuVar.f131001b;
        double d19 = d18;
        double d27 = d19;
        double d28 = d17;
        for (int i17 = 1; i17 < 4; i17++) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = fuVarArr[i17];
            double d29 = fuVar2.f131000a;
            double d37 = fuVar2.f131001b;
            if (d29 < d17) {
                d17 = d29;
            }
            if (d29 > d28) {
                d28 = d29;
            }
            if (d37 < d19) {
                d19 = d37;
            }
            if (d37 > d27) {
                d27 = d37;
            }
        }
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[]{new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(d17, d19), new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu(d28, d27)};
    }

    private android.graphics.Rect a(com.tencent.mapsdk.internal.pq.a[] aVarArr) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
        double a17 = a(aVarArr, c26041x873d1d26);
        double d17 = c26041x873d1d26.f49502x83009af;
        double d18 = c26041x873d1d26.f49501xaa2bac6c;
        return new android.graphics.Rect((int) ((d17 + a17) * 1000000.0d), (int) ((d18 + a17) * 1000000.0d), (int) ((d17 - a17) * 1000000.0d), (int) ((d18 - a17) * 1000000.0d));
    }

    private double a(com.tencent.mapsdk.internal.pq.a[] aVarArr, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26) {
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> a17;
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> c17 = c();
        if (c17.isEmpty() || (a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(c17)) == null || a17.isEmpty()) {
            return 0.0d;
        }
        int size = a17.size();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] c26041x873d1d26Arr = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[size];
        double[] dArr = new double[size];
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            c26041x873d1d26Arr[i18] = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
            double a18 = a(a17.get(i18), aVarArr, c26041x873d1d26Arr[i18]);
            dArr[i18] = a18;
            if (java.lang.Double.isNaN(a18)) {
                dArr[i18] = 0.0d;
            }
        }
        double d17 = dArr[0];
        for (int i19 = 1; i19 < size; i19++) {
            double d18 = dArr[i19];
            if (d18 > d17) {
                i17 = i19;
                d17 = d18;
            }
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = c26041x873d1d26Arr[i17];
        c26041x873d1d26.f49501xaa2bac6c = c26041x873d1d262.f49501xaa2bac6c;
        c26041x873d1d26.f49502x83009af = c26041x873d1d262.f49502x83009af;
        return dArr[i17];
    }

    private static double a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, com.tencent.mapsdk.internal.pq.a[] aVarArr, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262) {
        boolean z17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d263 = c26041x873d1d26;
        com.tencent.mapsdk.internal.pq.a[] aVarArr2 = aVarArr;
        int length = aVarArr2.length;
        double d17 = 0.0d;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d264 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d265 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] c26041x873d1d26Arr = aVarArr2[0].f132257a;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d266 = c26041x873d1d26Arr[0];
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d267 = c26041x873d1d26Arr[1];
        double a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d263, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d266, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d267);
        c26041x873d1d264.f49501xaa2bac6c = c26041x873d1d266.f49501xaa2bac6c;
        c26041x873d1d264.f49502x83009af = c26041x873d1d266.f49502x83009af;
        c26041x873d1d265.f49501xaa2bac6c = c26041x873d1d267.f49501xaa2bac6c;
        c26041x873d1d265.f49502x83009af = c26041x873d1d267.f49502x83009af;
        for (int i17 = 1; i17 < length; i17++) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] c26041x873d1d26Arr2 = aVarArr2[i17].f132257a;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d268 = c26041x873d1d26Arr2[0];
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d269 = c26041x873d1d26Arr2[1];
            double a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d263, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d268, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) c26041x873d1d269);
            if (a18 < a17) {
                c26041x873d1d264.f49501xaa2bac6c = c26041x873d1d268.f49501xaa2bac6c;
                c26041x873d1d264.f49502x83009af = c26041x873d1d268.f49502x83009af;
                c26041x873d1d265.f49501xaa2bac6c = c26041x873d1d269.f49501xaa2bac6c;
                c26041x873d1d265.f49502x83009af = c26041x873d1d269.f49502x83009af;
                a17 = a18;
            }
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(c26041x873d1d263, c26041x873d1d264, c26041x873d1d265);
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d2610 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
        boolean z18 = false;
        int i18 = 0;
        int i19 = 0;
        while (!z18) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 a27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(c26041x873d1d263, a19, i18);
            double a28 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) a27, (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25985x82ad5198) a19);
            int i27 = 0;
            while (true) {
                if (i27 >= length) {
                    z17 = true;
                    break;
                }
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26[] c26041x873d1d26Arr3 = aVarArr2[i27].f132257a;
                z17 = true;
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(a27, a28, c26041x873d1d26Arr3[0], c26041x873d1d26Arr3[1])) {
                    z18 = true;
                    break;
                }
                i27++;
                aVarArr2 = aVarArr;
            }
            if (!z18) {
                c26041x873d1d2610.f49501xaa2bac6c = a27.f49501xaa2bac6c;
                c26041x873d1d2610.f49502x83009af = a27.f49502x83009af;
                i18 += 5;
            } else if (i19 == 0) {
                c26041x873d1d2610.f49501xaa2bac6c = a27.f49501xaa2bac6c;
                c26041x873d1d2610.f49502x83009af = a27.f49502x83009af;
            } else {
                i19++;
                c26041x873d1d263 = c26041x873d1d26;
                aVarArr2 = aVarArr;
            }
            d17 = a28;
            i19++;
            c26041x873d1d263 = c26041x873d1d26;
            aVarArr2 = aVarArr;
        }
        c26041x873d1d262.f49501xaa2bac6c = c26041x873d1d2610.f49501xaa2bac6c;
        c26041x873d1d262.f49502x83009af = c26041x873d1d2610.f49502x83009af;
        return d17;
    }

    private boolean c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26077xede22024 c26077xede22024;
        android.graphics.Rect f17;
        if (this.f132246b == null || (c26077xede22024 = this.I) == null || !c26077xede22024.m99841x7b953cf2() || (f17 = f()) == null) {
            return false;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[] a17 = a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[]{eyVar.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(f17.top, f17.left)), eyVar.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(f17.top, f17.right)), eyVar.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(f17.bottom, f17.right)), eyVar.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(f17.bottom, f17.left))});
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = a17[0];
        int i17 = (int) fuVar.f131000a;
        int i18 = (int) fuVar.f131001b;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = a17[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, (int) fuVar2.f131000a, (int) fuVar2.f131001b);
        return java.lang.Math.abs(rect.width()) > 5 && java.lang.Math.abs(rect.height()) > 5;
    }

    private int a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list = this.f132247q;
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26> a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kr.a(list);
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        while (true) {
            int i18 = size - 1;
            if (i17 < i18) {
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = a17.get(i17);
                i17++;
                arrayList.add(new com.tencent.mapsdk.internal.pq.a(c26041x873d1d26, a17.get(i17)));
            } else {
                arrayList.add(new com.tencent.mapsdk.internal.pq.a(a17.get(i18), a17.get(0)));
                com.tencent.mapsdk.internal.pq.a[] aVarArr = (com.tencent.mapsdk.internal.pq.a[]) arrayList.toArray(new com.tencent.mapsdk.internal.pq.a[arrayList.size()]);
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d262 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26(0.0d, 0.0d);
                double a18 = a(aVarArr, c26041x873d1d262);
                double d17 = c26041x873d1d262.f49502x83009af;
                double d18 = c26041x873d1d262.f49501xaa2bac6c;
                android.graphics.Rect rect = new android.graphics.Rect((int) ((d17 + a18) * 1000000.0d), (int) ((d18 + a18) * 1000000.0d), (int) ((d17 - a18) * 1000000.0d), (int) ((d18 - a18) * 1000000.0d));
                this.C = rect;
                c4247x704e24df.m35334xea574fff(rect.centerY());
                c4247x704e24df.m35335x2c901cbe(this.C.centerX());
                android.graphics.Rect rect2 = this.C;
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect2.top, rect2.left);
                android.graphics.Rect rect3 = this.C;
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df3 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect3.top, rect3.right);
                android.graphics.Rect rect4 = this.C;
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df4 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect4.bottom, rect4.right);
                android.graphics.Rect rect5 = this.C;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[] a19 = a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu[]{eyVar.a(c4247x704e24df2), eyVar.a(c4247x704e24df3), eyVar.a(c4247x704e24df4), eyVar.a(new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(rect5.bottom, rect5.left))});
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = a19[0];
                int i19 = (int) fuVar.f131000a;
                int i27 = (int) fuVar.f131001b;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = a19[1];
                new android.graphics.Rect(i19, i27, (int) fuVar2.f131000a, (int) fuVar2.f131001b);
                return 1;
            }
        }
    }
}
