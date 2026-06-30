package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qv extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po {
    private boolean A;
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao B;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy f132604b;

    /* renamed from: d, reason: collision with root package name */
    public int[] f132605d;

    /* renamed from: p, reason: collision with root package name */
    public int[] f132606p;

    /* renamed from: q, reason: collision with root package name */
    public int f132607q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df f132608r;

    /* renamed from: s, reason: collision with root package name */
    public int f132609s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mapsdk.internal.qv.a f132610t;

    /* renamed from: u, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd f132611u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f132612v;

    /* renamed from: w, reason: collision with root package name */
    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876.OnSelectedListener f132613w;

    /* renamed from: x, reason: collision with root package name */
    private float f132614x;

    /* renamed from: y, reason: collision with root package name */
    private int f132615y;

    /* renamed from: z, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nd f132616z;

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f132617a;

        /* renamed from: b, reason: collision with root package name */
        public int f132618b;
    }

    public qv(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao aoVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.az azVar, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy fyVar) {
        super(azVar);
        this.f132612v = true;
        this.f132609s = -1;
        this.f132614x = -1.0f;
        this.f132615y = -1;
        this.B = aoVar;
        this.f132616z = azVar.c();
        a(fyVar);
    }

    private int A() {
        return this.f132607q;
    }

    private boolean B() {
        return this.f132604b.f131056w;
    }

    private boolean C() {
        return this.f132604b.f131059z;
    }

    private boolean D() {
        return this.f132604b.B;
    }

    private int E() {
        return this.f132604b.C;
    }

    private boolean F() {
        return this.f132604b.O;
    }

    private float G() {
        return this.f132604b.f131057x;
    }

    private float H() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy fyVar = this.f132604b;
        if (fyVar == null) {
            return 1.0f;
        }
        return fyVar.A;
    }

    private com.tencent.mapsdk.internal.qv.a I() {
        return this.f132610t;
    }

    private java.lang.String J() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy fyVar = this.f132604b;
        int[] iArr = fyVar.f131051r;
        if (iArr != null && iArr.length > 0) {
            int i17 = iArr[0];
            if (i17 == 33) {
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy.f131042j;
            }
            if (i17 == 20) {
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy.f131043k;
            }
        }
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hr.a(fyVar.f131058y) ? com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy.f131041i : this.f132604b.f131058y;
    }

    private int K() {
        return this.f132609s;
    }

    private boolean L() {
        return this.f132604b.D;
    }

    private boolean M() {
        return this.f132604b.E;
    }

    private android.graphics.Rect N() {
        int i17;
        android.graphics.Rect rect;
        java.util.ArrayList<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> arrayList = this.f132604b.f131045l;
        if (arrayList != null && !arrayList.isEmpty() && (i17 = this.f132607q) >= 0 && i17 < arrayList.size()) {
            java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> subList = arrayList.subList(this.f132607q, arrayList.size());
            if (subList == null || subList.isEmpty()) {
                rect = null;
            } else {
                com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = subList.get(0);
                int m35332x962aa94a = c4247x704e24df.m35332x962aa94a();
                int m35332x962aa94a2 = c4247x704e24df.m35332x962aa94a();
                int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
                int m35331xbc3301f32 = c4247x704e24df.m35331xbc3301f3();
                int size = subList.size();
                for (int i18 = 0; i18 < size; i18++) {
                    com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = subList.get(i18);
                    if (c4247x704e24df2 != null) {
                        int m35331xbc3301f33 = c4247x704e24df2.m35331xbc3301f3();
                        int m35332x962aa94a3 = c4247x704e24df2.m35332x962aa94a();
                        if (m35332x962aa94a3 < m35332x962aa94a) {
                            m35332x962aa94a = m35332x962aa94a3;
                        } else if (m35332x962aa94a3 > m35332x962aa94a2) {
                            m35332x962aa94a2 = m35332x962aa94a3;
                        }
                        if (m35331xbc3301f33 < m35331xbc3301f32) {
                            m35331xbc3301f32 = m35331xbc3301f33;
                        } else if (m35331xbc3301f33 > m35331xbc3301f3) {
                            m35331xbc3301f3 = m35331xbc3301f33;
                        }
                    }
                }
                rect = new android.graphics.Rect(m35332x962aa94a, m35331xbc3301f3, m35332x962aa94a2, m35331xbc3301f32);
            }
            if (rect != null) {
                this.f132604b.F = rect;
            }
        }
        return this.f132604b.F;
    }

    private java.lang.String O() {
        return this.f132604b.H;
    }

    private float P() {
        return this.f132604b.I;
    }

    private int[] Q() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy fyVar = this.f132604b;
        return new int[]{fyVar.f131044J, fyVar.K};
    }

    private java.util.List<java.lang.Integer> R() {
        return this.f132604b.L;
    }

    private void c(float f17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy fyVar = this.f132604b;
        if (fyVar == null || f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        fyVar.A = f17;
    }

    private java.util.ArrayList<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> e() {
        return this.f132604b.f131046m;
    }

    private int[] f() {
        return this.f132605d;
    }

    private int[] g() {
        return this.f132606p;
    }

    private boolean h() {
        return this.f132604b.f131055v;
    }

    private int[] i() {
        return this.f132604b.f131052s;
    }

    private int[] j() {
        return this.f132604b.f131053t;
    }

    private float k() {
        return this.f132604b.f131054u;
    }

    private int[] l() {
        return this.f132604b.f131047n;
    }

    private int[] m() {
        return this.f132604b.f131048o;
    }

    private java.lang.String[] n() {
        return this.f132604b.f131049p;
    }

    private com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df z() {
        return this.f132608r;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    /* renamed from: a */
    public final android.graphics.Rect mo36419xd5aa333c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        android.graphics.Rect mo36416x7436dfc8 = mo36416x7436dfc8(eyVar);
        if (mo36416x7436dfc8 == null) {
            return null;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(mo36416x7436dfc8.top, mo36416x7436dfc8.left);
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df(mo36416x7436dfc8.bottom, mo36416x7436dfc8.right);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a17 = eyVar.a(c4247x704e24df);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu a18 = eyVar.a(c4247x704e24df2);
        return new android.graphics.Rect((int) a17.f131000a, (int) a17.f131001b, (int) a18.f131000a, (int) a18.f131001b);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    /* renamed from: b */
    public final android.graphics.Rect mo36416x7436dfc8(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ey eyVar) {
        java.util.ArrayList<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> arrayList;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy fyVar = this.f132604b;
        if (fyVar == null || (arrayList = fyVar.f131046m) == null || arrayList.isEmpty()) {
            return null;
        }
        java.util.Iterator<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> it = this.f132604b.f131046m.iterator();
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MIN_VALUE;
        int i19 = Integer.MIN_VALUE;
        int i27 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df next = it.next();
            int m35331xbc3301f3 = next.m35331xbc3301f3();
            int m35332x962aa94a = next.m35332x962aa94a();
            if (m35331xbc3301f3 > i18) {
                i18 = m35331xbc3301f3;
            }
            if (m35331xbc3301f3 < i27) {
                i27 = m35331xbc3301f3;
            }
            if (m35332x962aa94a > i19) {
                i19 = m35332x962aa94a;
            }
            if (m35332x962aa94a < i17) {
                i17 = m35332x962aa94a;
            }
        }
        return new android.graphics.Rect(i17, i18, i19, i27);
    }

    public final void d() {
        com.tencent.mapsdk.internal.qv.a aVar = this.f132610t;
        if (aVar != null) {
            aVar.f132617a = -1;
            w();
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ao f_() {
        return this.B;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: getLevel */
    public final int mo36418x74bf41ce() {
        return this.f132604b.M;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: getZIndex */
    public final int mo36420x397e976e() {
        return this.f132604b.G;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void h_() {
        this.A = true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876
    /* renamed from: isSelected */
    public final boolean mo36422x17bd99e5() {
        return this.f132612v;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po
    public final void j_() {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nd ndVar = this.f132616z;
        if (ndVar == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = ndVar.f132025a;
        this.f132611u = bdVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr) bdVar.d();
        if (trVar == null) {
            return;
        }
        if (this.A && this.f132609s != -1) {
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "deleteLine..." + this.f132609s);
            com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9 c4430xc2040f9 = (com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_;
            c4430xc2040f9.f134045o.f132043j.b(this);
            c4430xc2040f9.f134045o.f132055v = true;
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk i17 = this.f132611u.i();
            i17.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass131(this.f132609s, this.f132604b.B));
            this.f132609s = -1;
            return;
        }
        float f17 = ndVar.f132025a.c().A.f133942b.f133976l;
        float f18 = this.f132614x;
        if (f18 == -1.0f || f18 != f17) {
            this.f132614x = f17;
        }
        if (this.f132609s == -1) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk i18 = this.f132611u.i();
            this.f132609s = ((java.lang.Integer) i18.a((com.p314xaae8f345.map.p511x696c9db.InterfaceC4309x11c86a2<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass126>) new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass126(this), (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass126) (-1))).intValue();
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "createLine..." + this.f132609s);
        }
        if (v()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk i19 = this.f132611u.i();
            i19.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass127(this));
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25998xe695d027
    /* renamed from: onTap */
    public final boolean mo36424x64f7944(float f17, float f18) {
        com.p314xaae8f345.p519xbf8bc95e.p530xb297fa42.jni.p531xc04b6a6a.C4389x448e86b0 a17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = this.f132611u;
        return (bdVar == null || (a17 = bdVar.i().a(f17, f18)) == null || a17.f17369xb9bf0b8e != ((long) this.f132609s)) ? false : true;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25994x1423c876
    /* renamed from: setSelected */
    public final void mo36425xbd98911d(boolean z17) {
        this.f132612v = z17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = this.f132611u;
        if (bdVar == null || bdVar.i() == null) {
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk i17 = this.f132611u.i();
        i17.a(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tk.AnonymousClass129(this));
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.po, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.au, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2988xa0b83a5a.InterfaceC25989x14bfeebe
    /* renamed from: setZIndex */
    public final void mo36429x2cb3cb7a(int i17) {
        this.f132604b.G = i17;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.bd bdVar = this.f132611u;
        if (bdVar == null || bdVar.i() == null) {
            return;
        }
        this.f132611u.i().a(this.f132615y, i17);
    }

    @java.lang.Deprecated
    private void c(java.lang.String str) {
        this.f132604b.f131058y = str;
    }

    private void b(float f17) {
        this.f132604b.f131054u = f17;
    }

    public final void a(int i17, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df) {
        this.f132607q = i17;
        this.f132608r = c4247x704e24df;
        w();
    }

    private void b(java.lang.String str) {
        this.f132604b.f131058y = str;
    }

    private void b(boolean z17) {
        this.f132604b.E = z17;
    }

    private void a(boolean z17) {
        this.f132604b.f131056w = z17;
    }

    private static android.graphics.Rect b(java.util.List<com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df = list.get(0);
        int m35332x962aa94a = c4247x704e24df.m35332x962aa94a();
        int m35332x962aa94a2 = c4247x704e24df.m35332x962aa94a();
        int m35331xbc3301f3 = c4247x704e24df.m35331xbc3301f3();
        int m35331xbc3301f32 = c4247x704e24df.m35331xbc3301f3();
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.map.lib.p496xc04b6a6a.C4247x704e24df c4247x704e24df2 = list.get(i17);
            if (c4247x704e24df2 != null) {
                int m35331xbc3301f33 = c4247x704e24df2.m35331xbc3301f3();
                int m35332x962aa94a3 = c4247x704e24df2.m35332x962aa94a();
                if (m35332x962aa94a3 < m35332x962aa94a) {
                    m35332x962aa94a = m35332x962aa94a3;
                } else if (m35332x962aa94a3 > m35332x962aa94a2) {
                    m35332x962aa94a2 = m35332x962aa94a3;
                }
                if (m35331xbc3301f33 < m35331xbc3301f32) {
                    m35331xbc3301f32 = m35331xbc3301f33;
                } else if (m35331xbc3301f33 > m35331xbc3301f3) {
                    m35331xbc3301f3 = m35331xbc3301f33;
                }
            }
        }
        return new android.graphics.Rect(m35332x962aa94a, m35331xbc3301f3, m35332x962aa94a2, m35331xbc3301f32);
    }

    private void a(float f17) {
        this.f132604b.f131057x = f17;
    }

    private void a(int[] iArr) {
        this.f132604b.f131053t = iArr;
    }

    private void a(int i17, int i18) {
        com.tencent.mapsdk.internal.qv.a aVar = new com.tencent.mapsdk.internal.qv.a();
        this.f132610t = aVar;
        aVar.f132617a = i17;
        aVar.f132618b = i18;
        w();
    }

    @java.lang.Deprecated
    private void a(java.lang.String str) {
        this.f132604b.f131058y = str;
    }

    private void a(int i17) {
        this.f132609s = i17;
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy fyVar) {
        if (fyVar != null && fyVar.a()) {
            if (fyVar.m36738xb2c87fbf(this.f132604b)) {
                return;
            }
            w();
            this.f132604b = fyVar;
            this.f132605d = fyVar.f131050q;
            this.f132606p = fyVar.f131051r;
            return;
        }
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c("LineOptions不能为空！");
    }

    private void a(java.util.List<java.lang.Integer> list) {
        this.f132604b.b(list);
    }
}
