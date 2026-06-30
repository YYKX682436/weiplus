package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ac implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fm, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ox, com.tencent.mapsdk.internal.v.a {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mv f130306a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx f130307b;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 f130309d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne f130310e;

    /* renamed from: h, reason: collision with root package name */
    float f130313h;

    /* renamed from: i, reason: collision with root package name */
    float f130314i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f130316k;

    /* renamed from: l, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f130317l;

    /* renamed from: m, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener f130318m;

    /* renamed from: c, reason: collision with root package name */
    public int f130308c = com.tencent.mapsdk.internal.ac.a.f130329a;

    /* renamed from: f, reason: collision with root package name */
    public boolean f130311f = false;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 f130312g = null;

    /* renamed from: n, reason: collision with root package name */
    private boolean f130319n = false;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener f130315j = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener() { // from class: com.tencent.mapsdk.internal.ac.1
        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener
        /* renamed from: onScaleViewChanged */
        public final void mo36381x92aceca4(float f17) {
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac.this;
            float f18 = acVar.f130314i;
            acVar.f130313h = f18;
            acVar.f130314i = f17;
            if (f18 <= 20.0d || f17 > 20.0d || !acVar.f130311f || (c26034x15ff5647 = acVar.f130312g) == null) {
                return;
            }
            java.lang.String m99466x3935e1d5 = c26034x15ff5647.m99466x3935e1d5();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac.this.f130310e.f130533c;
            if (hgVar == null || android.text.TextUtils.isEmpty(m99466x3935e1d5)) {
                return;
            }
            hgVar.d().a(m99466x3935e1d5).c();
        }
    };

    /* renamed from: com.tencent.mapsdk.internal.ac$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements java.lang.Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac acVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac.this;
            int i17 = acVar.f130308c;
            if (i17 == com.tencent.mapsdk.internal.ac.a.f130329a) {
                acVar.a(acVar.f130307b.a());
            } else {
                acVar.a(i17);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.ac$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130328a;

        static {
            int[] iArr = new int[com.tencent.mapsdk.internal.ac.a.a().length];
            f130328a = iArr;
            try {
                iArr[com.tencent.mapsdk.internal.ac.a.f130330b - 1] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f130328a[com.tencent.mapsdk.internal.ac.a.f130329a - 1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f130328a[com.tencent.mapsdk.internal.ac.a.f130331c - 1] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes13.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f130329a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f130330b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f130331c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ int[] f130332d = {1, 2, 3};

        private a(java.lang.String str, int i17) {
        }

        public static int[] a() {
            return (int[]) f130332d.clone();
        }
    }

    public ac(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar, java.lang.String str) {
        org.json.JSONArray jSONArray = null;
        this.f130318m = null;
        this.f130309d = null;
        this.f130317l = trVar;
        if (trVar != null) {
            if (str == null) {
                this.f130306a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.my.a(trVar.I());
            } else {
                this.f130306a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.mx.a(trVar.I(), str);
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar2 = this.f130317l;
            this.f130309d = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar2.e_;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = trVar2.f133806as;
            this.f130310e = neVar;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar = neVar.f132053t;
            if (vVar != null) {
                vVar.a(this);
            }
            int b17 = this.f130306a.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.B);
            int b18 = this.f130306a.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.C);
            java.lang.String a17 = this.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.D);
            try {
                if (!android.text.TextUtils.isEmpty(a17)) {
                    jSONArray = new org.json.JSONArray(a17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131747o, "indoor auth init failed", e17);
            }
            if (b17 != -1 && b18 != -1 && jSONArray != null) {
                this.f130307b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx(b17, b18, jSONArray);
            }
            com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = this.f130309d;
            if (c4430xc2040f9 != null) {
                c4430xc2040f9.a(c());
                if (b18 == 1) {
                    this.f130309d.a(d());
                }
            }
            a(false);
        }
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f92 = this.f130309d;
        if (c4430xc2040f92 != null) {
            c4430xc2040f92.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fm) this);
            this.f130309d.f134045o.a(this);
            this.f130318m = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.to(this.f130317l);
        }
    }

    private void g() {
        int b17 = this.f130306a.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.B);
        int b18 = this.f130306a.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.C);
        java.lang.String a17 = this.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.D);
        org.json.JSONArray jSONArray = null;
        try {
            if (!android.text.TextUtils.isEmpty(a17)) {
                jSONArray = new org.json.JSONArray(a17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131747o, "indoor auth init failed", e17);
        }
        if (b17 != -1 && b18 != -1 && jSONArray != null) {
            this.f130307b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx(b17, b18, jSONArray);
        }
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = this.f130309d;
        if (c4430xc2040f9 != null) {
            c4430xc2040f9.a(c());
            if (b18 == 1) {
                this.f130309d.a(d());
            }
        }
    }

    private boolean h() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar = this.f130307b;
        return fxVar != null && fxVar.a();
    }

    private boolean i() {
        return this.f130311f;
    }

    private void j() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f130310e;
        if (neVar == null) {
            return;
        }
        int i17 = neVar.N()[0];
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar2 = this.f130310e;
        if (neVar2.f132053t.f133942b.f133977m >= i17) {
            this.f130319n = true;
        } else {
            neVar2.d(i17);
            this.f130319n = false;
        }
    }

    private void k() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.f130312g;
        if (c26034x15ff5647 != null) {
            java.lang.String m99466x3935e1d5 = c26034x15ff5647.m99466x3935e1d5();
            int m99465xd84262ca = this.f130312g.m99465xd84262ca();
            java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> m99469x2328f865 = this.f130312g.m99469x2328f865();
            if (m99469x2328f865 == null || m99465xd84262ca >= m99469x2328f865.size()) {
                return;
            }
            java.lang.String m99474xfb82e301 = m99469x2328f865.get(m99465xd84262ca).m99474xfb82e301();
            if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(m99466x3935e1d5) || com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(m99474xfb82e301)) {
                return;
            }
            this.f130310e.a(m99466x3935e1d5, m99474xfb82e301);
        }
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 l() {
        return this.f130312g;
    }

    private java.lang.String m() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.f130312g;
        if (c26034x15ff5647 == null) {
            return null;
        }
        return c26034x15ff5647.m99466x3935e1d5();
    }

    private int n() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.f130312g;
        if (c26034x15ff5647 == null) {
            return -1;
        }
        return c26034x15ff5647.m99465xd84262ca();
    }

    private java.lang.String[] o() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.f130312g;
        if (c26034x15ff5647 == null || c26034x15ff5647.m99469x2328f865() == null || this.f130312g.m99469x2328f865().isEmpty()) {
            return null;
        }
        java.util.List<com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1> m99469x2328f865 = this.f130312g.m99469x2328f865();
        java.lang.String[] strArr = new java.lang.String[m99469x2328f865.size()];
        for (int i17 = 0; i17 < m99469x2328f865.size(); i17++) {
            strArr[i17] = m99469x2328f865.get(i17).m99474xfb82e301();
        }
        return strArr;
    }

    private java.lang.String p() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.f130312g;
        return c26034x15ff5647 == null ? "" : c26034x15ff5647.m99468x266119d5();
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 q() {
        return this.f130312g;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnScaleViewChangedListener f() {
        return this.f130315j;
    }

    public final int c() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar = this.f130307b;
        return (fxVar == null || !fxVar.b()) ? 0 : 1;
    }

    public final java.lang.String[] d() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar = this.f130307b;
        if (fxVar != null) {
            return fxVar.f131032f;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ox
    public final void e() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        M m17;
        if (!this.f130316k || (trVar = this.f130317l) == null || (m17 = trVar.e_) == 0) {
            return;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).f134045o.f132039f;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qr qrVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qr) tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass167(c4247x704e24df), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass167) null);
        if (qrVar == null) {
            return;
        }
        final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26((c4247x704e24df.m35331xbc3301f3() * 1.0d) / 1000000.0d, (c4247x704e24df.m35332x962aa94a() * 1.0d) / 1000000.0d);
        final java.lang.String str = qrVar.f132560a;
        final java.lang.String str2 = qrVar.f132561b;
        final java.lang.String[] strArr = qrVar.f132563d;
        final int i17 = qrVar.f132562c;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new java.lang.Runnable() { // from class: com.tencent.mapsdk.internal.ac.3
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac.this.a(str, str2, c26041x873d1d26, strArr, i17);
            }
        });
    }

    private void b(boolean z17) {
        int i17 = z17 ? com.tencent.mapsdk.internal.ac.a.f130330b : com.tencent.mapsdk.internal.ac.a.f130331c;
        this.f130308c = i17;
        a(i17);
    }

    private void c(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f130310e;
        if (neVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = neVar.f130533c;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.f130312g;
        if (c26034x15ff5647 != null) {
            java.lang.String m99466x3935e1d5 = c26034x15ff5647.m99466x3935e1d5();
            if (hgVar != null && !android.text.TextUtils.isEmpty(m99466x3935e1d5)) {
                hgVar.d().a(m99466x3935e1d5).b();
            }
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar = this.f130310e.f132039f;
        if (tkVar != null) {
            tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass164(i17));
        }
        e();
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx fxVar) {
        if (fxVar != null) {
            this.f130307b = fxVar;
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "IndoorAuth:".concat(java.lang.String.valueOf(fxVar)));
            this.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.B, fxVar.f131029c);
            this.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.C, fxVar.f131030d);
            org.json.JSONArray jSONArray = fxVar.f131031e;
            if (jSONArray != null) {
                this.f130306a.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.D, jSONArray.toString());
            }
            com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = this.f130309d;
            if (c4430xc2040f9 != null) {
                c4430xc2040f9.a(c());
                if (c() == 1) {
                    this.f130309d.a(d());
                }
            }
        } else {
            this.f130306a.a(new java.lang.String[]{com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.B, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.C, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.er.D});
        }
        if (this.f130307b == null) {
            this.f130307b = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fx();
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ko.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac.AnonymousClass2());
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean b() {
        int i17 = this.f130310e.N()[0];
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f130310e;
        if (neVar.f132053t.f133942b.f133977m < i17 && this.f130319n) {
            this.f130319n = false;
            neVar.d(i17);
        }
        return false;
    }

    private void c(boolean z17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = this.f130309d;
        if (c4430xc2040f9 == null || (tkVar = c4430xc2040f9.f134045o.f132039f) == null || tkVar.f133194e == 0) {
            return;
        }
        tkVar.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass173(z17));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fm
    public final void b(int i17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar;
        if (!this.f130316k || (trVar = this.f130317l) == null || trVar.e_ == 0) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs qsVar = trVar.f133731m;
    }

    public final void a(int i17) {
        int i18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ac.AnonymousClass4.f130328a[i17 - 1];
        if (i18 == 1) {
            a(true);
        } else if (i18 == 2 || i18 == 3) {
            a(false);
        }
    }

    public final void a(boolean z17) {
        this.f130316k = z17;
        if (this.f130310e == null) {
            return;
        }
        if (!h()) {
            this.f130310e.d(false);
            return;
        }
        this.f130310e.d(z17);
        if (z17 || !this.f130311f) {
            return;
        }
        a(null, null, null, null, -1);
    }

    public final void a(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26041x873d1d26 c26041x873d1d26, java.lang.String[] strArr, int i17) {
        M m17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs qsVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qs qsVar2;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar2;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f130317l;
        if (trVar == null || (m17 = trVar.e_) == 0) {
            return;
        }
        int q17 = ((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).q();
        if (str != null && strArr != null && strArr.length > 0 && i17 >= 0 && q17 >= 16) {
            if (!android.text.TextUtils.isEmpty(str) && this.f130314i <= 20.0d && !this.f130311f && (hgVar2 = this.f130310e.f130533c) != null) {
                hgVar2.d().a(str).c();
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f130318m;
            if (onIndoorStateChangeListener != null && !this.f130311f) {
                this.f130311f = true;
                onIndoorStateChangeListener.mo37005xa4a722b1();
            }
            j();
            if (this.f130318m != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str3 : strArr) {
                    arrayList.add(new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1(str3));
                }
                try {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff5647 = this.f130312g;
                    if (c26034x15ff5647 != null && c26034x15ff5647.m99466x3935e1d5().equals(str)) {
                        if (this.f130312g.m99465xd84262ca() == i17) {
                            return;
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff56472 = this.f130312g;
                if ((c26034x15ff56472 == null || !str.equals(c26034x15ff56472.m99466x3935e1d5())) && (hgVar = this.f130310e.f130533c) != null) {
                    hgVar.d().f131240a.a();
                    if (!android.text.TextUtils.isEmpty(str)) {
                        hgVar.d().a(str).a();
                    }
                }
                com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 c26034x15ff56473 = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647(str, str2, c26041x873d1d26, arrayList, i17);
                this.f130312g = c26034x15ff56473;
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar2 = this.f130317l;
                if (trVar2 != null && (qsVar2 = trVar2.f133731m) != null && qsVar2.f132581b) {
                    qsVar2.a(c26034x15ff56473);
                }
                this.f130318m.mo37006xc2ec745f(this.f130312g);
                return;
            }
            return;
        }
        if (this.f130311f) {
            this.f130311f = false;
            this.f130312g = null;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar3 = this.f130317l;
            if (trVar3 != null && (qsVar = trVar3.f133731m) != null) {
                qsVar.a((com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647) null);
            }
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener onIndoorStateChangeListener2 = this.f130318m;
            if (onIndoorStateChangeListener2 != null) {
                onIndoorStateChangeListener2.mo37004xf3e3a8aa();
            }
            j();
        }
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a(float f17, float f18) {
        if (this.f130319n) {
            int i17 = this.f130310e.N()[0];
            if (f18 <= com.tencent.mapsdk.internal.v.b.a(i17)) {
                this.f130319n = false;
                this.f130310e.d(i17);
            }
            if (f17 > f18) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mapsdk.internal.v.a
    public final boolean a() {
        return this.f130319n;
    }

    private void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar = this.f130310e;
        if (neVar == null) {
            return;
        }
        neVar.a(str, str2);
    }

    private int a(java.lang.String str) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ne neVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk tkVar;
        com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = this.f130309d;
        if (c4430xc2040f9 == null || (neVar = c4430xc2040f9.f134045o) == null || (tkVar = neVar.f132039f) == null) {
            return -1;
        }
        return ((java.lang.Integer) tkVar.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass50>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass50(str), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass50) (-1))).intValue();
    }
}
