package k84;

/* loaded from: classes4.dex */
public abstract class d4 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l {
    public static final k84.r1 V = new k84.r1(null);
    public static final p3325xe03a0797.p3326xc267989b.r0 W;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f386530J;
    public boolean K;
    public int L;
    public p3325xe03a0797.p3326xc267989b.r2 M;
    public k84.s1 N;
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 O;
    public final jz5.g P;
    public android.animation.ValueAnimator Q;
    public android.animation.ValueAnimator R;
    public android.animation.ValueAnimator S;
    public android.animation.ValueAnimator T;
    public p3325xe03a0797.p3326xc267989b.r2 U;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f386531o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f386532p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f f386533q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9 f386534r;

    /* renamed from: s, reason: collision with root package name */
    public final int f386535s;

    /* renamed from: t, reason: collision with root package name */
    public final int f386536t;

    /* renamed from: u, reason: collision with root package name */
    public final i64.b1 f386537u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f386538v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs f386539w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder f386540x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ns f386541y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f386542z;

    static {
        int i17 = p3325xe03a0797.p3326xc267989b.r0.N0;
        W = new k84.f3(p3325xe03a0797.p3326xc267989b.q0.f392100d);
    }

    public d4(java.lang.String str, p012xc85e97e9.p093xedfae76a.y yVar, android.view.View view, android.view.View view2, android.view.View view3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17780x7da32526 c17780x7da32526, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17779xdb9e82f9 c17779xdb9e82f9, int i17, int i18, i64.b1 b1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs bsVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        super(str, yVar, view);
        this.f386531o = view2;
        this.f386532p = view3;
        this.f386533q = c17781x303781f;
        this.f386534r = c17779xdb9e82f9;
        this.f386535s = i17;
        this.f386536t = i18;
        this.f386537u = b1Var;
        this.f386538v = iVar;
        this.f386539w = bsVar;
        this.f386540x = baseViewHolder;
        this.f386542z = jz5.h.b(new k84.y3(view, this, yVar));
        this.A = jz5.h.b(new k84.x3(this));
        this.B = jz5.h.b(new k84.b4(this));
        this.C = jz5.h.b(new k84.w3(this));
        this.D = jz5.h.b(new k84.a4(this));
        this.E = jz5.h.b(new k84.z3(this));
        this.F = jz5.h.b(new k84.x2(this));
        this.G = jz5.h.b(new k84.a3(this));
        this.H = jz5.h.b(new k84.y2(this));
        this.I = jz5.h.b(new k84.z2(this));
        this.L = -1;
        this.N = new k84.s1(0, null, 0);
        this.O = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(java.lang.Boolean.FALSE);
        this.P = jz5.h.b(new k84.e3(view));
    }

    public static void b0(k84.d4 d4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, java.lang.Object obj) {
        java.lang.String str;
        mb4.j0 j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUIForNoAnim");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            throw unsupportedOperationException;
        }
        java.lang.String str2 = null;
        if ((i17 & 1) != 0) {
            c17933xe8d1b226 = null;
        }
        d4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        boolean z17 = d4Var.K;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d4Var.j(), "setUIForNoAnim  checkLikeStatus = " + z17 + " holdingAnimState " + d4Var.f386530J);
        if (c17933xe8d1b226 != null) {
            z17 = c17933xe8d1b226.m70360xbd8ebd19() != 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d4Var.j(), "refresh  checkLikeStatus = " + z17);
        android.view.ViewGroup V2 = d4Var.V();
        android.content.Context context = V2 != null ? V2.getContext() : null;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        } else {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 A = d4Var.A();
            if (A != null) {
                A.setTextColor(d4Var.L);
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 A2 = d4Var.A();
            if (A2 != null) {
                A2.setOutlineProvider(new al5.z1(a84.d0.a(4)));
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 A3 = d4Var.A();
            if (A3 != null) {
                A3.setClipToOutline(true);
            }
            int i18 = d4Var.f386536t;
            if (z17) {
                android.view.ViewGroup V3 = d4Var.V();
                if (V3 != null) {
                    V3.setVisibility(4);
                }
                android.view.ViewGroup U = d4Var.U();
                if (U != null) {
                    U.setVisibility(0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d4Var.j(), "setTopLikeBackground and album like area");
                android.widget.RelativeLayout I = d4Var.I();
                if (I != null) {
                    I.setVisibility(0);
                }
                android.widget.FrameLayout D = d4Var.D();
                if (D != null) {
                    D.setVisibility(0);
                }
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 A4 = d4Var.A();
                if (A4 != null) {
                    A4.setOnClickListener(new k84.d3(d4Var, context));
                }
                if (i18 == 0) {
                    android.widget.LinearLayout E = d4Var.E();
                    if (E != null) {
                        E.setPadding(0, 0, 0, a84.d0.a(8));
                    }
                    android.view.View F = d4Var.F();
                    android.view.ViewGroup.LayoutParams layoutParams = F != null ? F.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.topMargin = a84.d0.a(4);
                    }
                    if (layoutParams2 != null) {
                        layoutParams2.bottomMargin = a84.d0.a(4);
                    }
                    android.view.View F2 = d4Var.F();
                    if (F2 != null) {
                        F2.requestLayout();
                    }
                }
                if (d4Var.f386530J) {
                    android.widget.RelativeLayout I2 = d4Var.I();
                    if (I2 != null) {
                        I2.setVisibility(4);
                    }
                    android.widget.FrameLayout D2 = d4Var.D();
                    if (D2 != null) {
                        D2.setVisibility(4);
                    }
                    android.widget.ImageView G = d4Var.G();
                    if (G != null) {
                        G.setAlpha(0.0f);
                    }
                    d4Var.f0();
                } else {
                    android.widget.ImageView G2 = d4Var.G();
                    if (G2 != null) {
                        G2.setAlpha(1.0f);
                    }
                    d4Var.e0();
                }
                d4Var.a0();
            } else {
                android.view.ViewGroup V4 = d4Var.V();
                if (V4 != null) {
                    V4.setVisibility(0);
                }
                android.view.ViewGroup U2 = d4Var.U();
                if (U2 != null) {
                    U2.setVisibility(4);
                }
                android.widget.RelativeLayout I3 = d4Var.I();
                if (I3 != null) {
                    I3.setVisibility(8);
                }
                android.widget.FrameLayout D3 = d4Var.D();
                if (D3 != null) {
                    D3.setVisibility(8);
                }
                android.widget.ImageView G3 = d4Var.G();
                if (G3 != null) {
                    G3.setVisibility(8);
                }
                if (i18 == 0) {
                    android.widget.LinearLayout E2 = d4Var.E();
                    if (E2 != null) {
                        E2.setPadding(0, 0, 0, a84.d0.a(0));
                    }
                    android.view.View F3 = d4Var.F();
                    android.view.ViewGroup.LayoutParams layoutParams3 = F3 != null ? F3.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.topMargin = 0;
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.bottomMargin = 0;
                    }
                    android.view.View F4 = d4Var.F();
                    if (F4 != null) {
                        F4.requestLayout();
                    }
                }
                d4Var.c0();
                d4Var.f0();
            }
            d4Var.Z();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumLikedTopWording", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            android.view.View view = d4Var.f386531o;
            android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.fir) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedTopWording", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            if (textView != null) {
                mb4.r B = d4Var.B();
                if (B == null || (j17 = B.j()) == null) {
                    str = null;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTopLikeTitle", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                    str = j17.f406962b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTopLikeTitle", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                }
                textView.setText(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumLikedTopWording", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            android.widget.TextView textView2 = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.fir) : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedTopWording", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            if (textView2 != null) {
                textView2.setTextColor(d4Var.L);
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 A5 = d4Var.A();
            if (A5 != null) {
                mb4.r B2 = d4Var.B();
                if (B2 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomButtonTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                    java.lang.String str3 = B2.f407003q;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomButtonTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                    str2 = str3;
                }
                A5.setText(str2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = d4Var.f386533q;
            if (c17781x303781f != null) {
                c17781x303781f.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(k84.d4 r29, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bs r30, android.content.Context r31, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder r32, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r33) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.y(k84.d4, com.tencent.mm.plugin.sns.ui.bs, android.content.Context, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0198, code lost:
    
        if (r6 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b3, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f3, code lost:
    
        if (r6 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021a, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(k84.d4 r27, android.content.Context r28, mb4.r r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.z(k84.d4, android.content.Context, mb4.r, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdAlbumCommentListBottomButton", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f386532p;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 c0080x3ada79f5 = view != null ? (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5) view.findViewById(com.p314xaae8f345.mm.R.id.d0w) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdAlbumCommentListBottomButton", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return c0080x3ada79f5;
    }

    public final mb4.r B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        mb4.c cVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdFireworkCheerInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) i();
        mb4.r rVar = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null || (cVar = m70354x74235b3e.f38211x1b3eca3e) == null) ? null : cVar.f406921m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdFireworkCheerInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return rVar;
    }

    public final mb4.c C() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdSocialInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) i();
        mb4.c cVar = (c17933xe8d1b226 == null || (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) == null) ? null : m70354x74235b3e.f38211x1b3eca3e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdSocialInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return cVar;
    }

    public final android.widget.FrameLayout D() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumLikedBottomContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f386532p;
        android.widget.FrameLayout frameLayout = view != null ? (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.d1s) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedBottomContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return frameLayout;
    }

    public final android.widget.LinearLayout E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumLikedContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f386531o;
        android.widget.LinearLayout linearLayout = view != null ? (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.emm) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return linearLayout;
    }

    public final android.view.View F() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumLikedListLine", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f386531o;
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.f564410qj) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedListLine", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return findViewById;
    }

    public final android.widget.ImageView G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumLikedListTvAnimBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f386531o;
        android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.exo) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedListTvAnimBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return imageView;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        if (I() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            return null;
        }
        android.widget.RelativeLayout I = I();
        if ((I != null ? n3.u1.a(I, 0) : null) instanceof com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) {
            android.widget.RelativeLayout I2 = I();
            android.view.KeyEvent.Callback a17 = I2 != null ? n3.u1.a(I2, 0) : null;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = a17 instanceof com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b ? (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) a17 : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            return c22789xd23e9a9b;
        }
        android.view.View view = this.f386531o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            return null;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = new com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b(context);
        c22789xd23e9a9b2.o(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20316xf7a4b984()) == 1);
        android.widget.RelativeLayout I3 = I();
        if (I3 != null) {
            I3.addView(c22789xd23e9a9b2, 0);
        }
        c22789xd23e9a9b2.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        c22789xd23e9a9b2.requestLayout();
        c22789xd23e9a9b2.o(j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20316xf7a4b984()) == 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return c22789xd23e9a9b2;
    }

    public final android.widget.RelativeLayout I() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAlbumLikedTopTitleContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f386531o;
        android.widget.RelativeLayout relativeLayout = view != null ? (android.widget.RelativeLayout) view.findViewById(com.p314xaae8f345.mm.R.id.fcl) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAlbumLikedTopTitleContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return relativeLayout;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f J() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386533q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return c17781x303781f;
    }

    public final android.animation.ValueAnimator K() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomButtonAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.animation.ValueAnimator valueAnimator = this.T;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomButtonAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return valueAnimator;
    }

    public final android.animation.ValueAnimator L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBottomStretchAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.animation.ValueAnimator valueAnimator = this.S;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBottomStretchAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return valueAnimator;
    }

    public final android.graphics.drawable.StateListDrawable M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBtnNormalDrawable", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new android.graphics.drawable.ColorDrawable(e3.b.c(color, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5), 0.2f)));
        stateListDrawable.addState(new int[0], new android.graphics.drawable.ColorDrawable(color));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBtnNormalDrawable", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return stateListDrawable;
    }

    public final android.widget.LinearLayout N() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCheerContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.F).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCheerContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return linearLayout;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 O() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCheerIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.H).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCheerIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return c22699x3dcdb352;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.I).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return c22699x3dcdb352;
    }

    public final android.widget.LinearLayout Q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.G).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return linearLayout;
    }

    public final p3325xe03a0797.p3326xc267989b.p0 R() {
        p3325xe03a0797.p3326xc267989b.p0 p0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDispatcherInUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f386531o;
        if ((view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.exu) : null) == null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p0Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var3 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p0Var = ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDispatcherInUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return p0Var;
    }

    public final android.animation.ValueAnimator S() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGoldAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.animation.ValueAnimator valueAnimator = this.R;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGoldAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return valueAnimator;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder T() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHolder", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHolder", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return this.f386540x;
    }

    public final android.view.ViewGroup U() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagAfterLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.C).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagAfterLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup V() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagBeforeLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.A).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagBeforeLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup W() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f386542z).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return viewGroup;
    }

    public final android.widget.TextView X() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagWordAfterLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.D).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagWordAfterLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return textView;
    }

    public final android.widget.TextView Y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTagWordBeforeLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.B).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTagWordBeforeLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return textView;
    }

    public final void Z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentLayout", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.LinearLayout Q = Q();
        if (Q != null) {
            Q.setBackground(M());
        }
        android.widget.LinearLayout N = N();
        if (N != null) {
            N.setBackground(M());
        }
        android.view.View view = this.f386531o;
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.emn) : null;
        if (findViewById != null) {
            findViewById.setBackground(new android.graphics.drawable.ColorDrawable(this.L));
        }
        android.view.View findViewById2 = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.emr) : null;
        if (findViewById2 != null) {
            findViewById2.setBackground(new android.graphics.drawable.ColorDrawable(this.L));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentLayout", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    public final void a0() {
        java.lang.String str;
        mb4.j0 j17;
        android.content.Context context;
        android.content.res.Resources resources;
        java.lang.String str2;
        mb4.j0 j18;
        java.lang.String str3;
        mb4.j0 j19;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLikedAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "setLikedAttitudeView() called");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var2.f391656d = "";
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            mb4.r B = B();
            if (B == null || (j17 = B.j()) == null || (str = j17.a()) == null) {
                str = "";
            }
            h0Var.f391656d = str;
            mb4.c C = C();
            java.lang.String str4 = C != null ? C.f72816x2646665c : null;
            if (str4 == null) {
                str4 = "";
            }
            h0Var2.f391656d = str4;
        } else {
            mb4.r B2 = B();
            if (B2 == null || (j19 = B2.j()) == null || (str3 = j19.a()) == null) {
                str3 = "";
            }
            h0Var.f391656d = str3;
            mb4.c C2 = C();
            java.lang.String str5 = C2 != null ? C2.f72815xf67255c6 : null;
            if (str5 == null) {
                str5 = "";
            }
            h0Var2.f391656d = str5;
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f391656d;
        if (charSequence == null || r26.n0.N(charSequence)) {
            mb4.r B3 = B();
            if (B3 == null || (j18 = B3.j()) == null || (str2 = j18.a()) == null) {
                str2 = "";
            }
            h0Var.f391656d = str2;
        }
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) h0Var2.f391656d;
        if (charSequence2 == null || r26.n0.N(charSequence2)) {
            mb4.c C3 = C();
            java.lang.String str6 = C3 != null ? C3.f72815xf67255c6 : null;
            h0Var2.f391656d = str6 != null ? str6 : "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386533q;
        if (c17781x303781f != null) {
            c17781x303781f.x();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 O = O();
        if (O != null) {
            O.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 P = P();
        if (P != null) {
            P.setVisibility(8);
        }
        android.widget.ImageView G = G();
        if (G != null) {
            G.setOutlineProvider(new k84.b3());
        }
        android.widget.ImageView G2 = G();
        if (G2 != null) {
            G2.setClipToOutline(true);
        }
        android.widget.ImageView G3 = G();
        if (G3 != null) {
            G3.setVisibility(0);
        }
        p3325xe03a0797.p3326xc267989b.y0 h17 = h();
        if (h17 != null) {
            p3325xe03a0797.p3326xc267989b.l.d(h17, W, null, new k84.c3(h0Var, this, h0Var2, null), 2, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f2 = this.f386533q;
        if (c17781x303781f2 != null && (context = c17781x303781f2.getContext()) != null && (resources = context.getResources()) != null) {
            int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f3 = this.f386533q;
            if (c17781x303781f3 != null) {
                c17781x303781f3.m69550xbca0446b(color);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLikedAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    public final void c0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUnlikedAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "setUnlikedAttitudeView() called");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 O = O();
        if (O != null) {
            O.setVisibility(8);
        }
        g0();
        int i17 = this.L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386533q;
        if (c17781x303781f != null) {
            c17781x303781f.m69550xbca0446b(i17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUnlikedAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b7, code lost:
    
        if (r8 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0234, code lost:
    
        if (r5 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0172, code lost:
    
        if (r10 != null) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0466  */
    /* JADX WARN: Type inference failed for: r2v51, types: [n74.r] */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.coroutines.Continuation, yz5.p] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.d(java.lang.Object, boolean):void");
    }

    public final void d0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "startAnim");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.U;
        p3325xe03a0797.p3326xc267989b.y0 h17 = h();
        p3325xe03a0797.p3326xc267989b.r2 d17 = h17 != null ? p3325xe03a0797.p3326xc267989b.l.d(h17, W, null, new k84.m3(this, r2Var, null), 2, null) : null;
        this.U = d17;
        if (d17 != null) {
            d17.p(new k84.n3(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.e0():void");
    }

    public final void f0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopTopPag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "stop top pag");
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H = H();
        if (H != null) {
            H.n();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b H2 = H();
        if (H2 != null) {
            H2.setVisibility(4);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopTopPag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if ((r2.length() > 0) == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0() {
        /*
            r6 = this;
            java.lang.String r0 = "tryShowLikeIcon"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            kotlinx.coroutines.flow.j2 r2 = r6.O
            kotlinx.coroutines.flow.h3 r2 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r2
            java.lang.Object r2 = r2.mo144003x754a37bb()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lae
            k84.e4 r2 = k84.e4.f386554d
            java.lang.Object r3 = r6.i()
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) r3
            if (r3 == 0) goto L27
            java.lang.String r3 = a84.d0.c(r3)
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            java.lang.Object r2 = r2.b(r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            if (r2 != 0) goto L37
            goto Lae
        L37:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r6.P()
            if (r2 != 0) goto L3e
            goto L43
        L3e:
            r4 = 8
            r2.setVisibility(r4)
        L43:
            mb4.r r2 = r6.B()
            r4 = 0
            if (r2 == 0) goto L63
            mb4.t r2 = r2.c()
            if (r2 == 0) goto L63
            java.lang.String r2 = r2.a()
            if (r2 == 0) goto L63
            int r2 = r2.length()
            r5 = 1
            if (r2 <= 0) goto L5f
            r2 = r5
            goto L60
        L5f:
            r2 = r4
        L60:
            if (r2 != r5) goto L63
            goto L64
        L63:
            r5 = r4
        L64:
            if (r5 == 0) goto L7b
            java.lang.String r2 = r6.j()
            java.lang.String r3 = "tryShowLikeIcon has pagThumbUrl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r6.P()
            if (r2 != 0) goto L77
            goto Laa
        L77:
            r2.setVisibility(r4)
            goto Laa
        L7b:
            java.lang.String r2 = r6.j()
            java.lang.String r5 = "tryShowLikeIcon no pagThumbUrl"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r5)
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView r2 = r6.f386533q
            if (r2 == 0) goto L92
            boolean r2 = r2.u(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L93
        L92:
            r2 = 0
        L93:
            boolean r2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r3)
            if (r2 == 0) goto Laa
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView r2 = r6.f386533q
            if (r2 == 0) goto La0
            r2.x()
        La0:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r6.P()
            if (r2 != 0) goto La7
            goto Laa
        La7:
            r2.setVisibility(r4)
        Laa:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        Lae:
            java.lang.String r2 = r6.j()
            java.lang.String r3 = "do not show like icon"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.g0():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void p(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 abstractC18285x291d0ca5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetach", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 model = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetach", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        super.p(model);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j(), "onDetach");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = this.f386540x;
        if (baseViewHolder != null && (abstractC18285x291d0ca5 = baseViewHolder.f250816m0) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnCommentInflateCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            abstractC18285x291d0ca5.f250787n = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnCommentInflateCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetach", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetach", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.l
    public void v(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5 abstractC18285x291d0ca5;
        android.widget.LinearLayout E;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        super.v((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj);
        android.widget.RelativeLayout I = I();
        if (I != null) {
            I.setVisibility(8);
        }
        android.widget.FrameLayout D = D();
        if (D != null) {
            D.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2136xd0c93d50.C17781x303781f c17781x303781f = this.f386533q;
        if (c17781x303781f != null) {
            c17781x303781f.m69554x8eae3d2b(false);
        }
        android.widget.RelativeLayout I2 = I();
        if (I2 != null) {
            I2.setTranslationY(0.0f);
        }
        android.widget.RelativeLayout I3 = I();
        if (I3 != null) {
            I3.setAlpha(1.0f);
        }
        android.widget.ImageView G = G();
        if (G != null) {
            G.setAlpha(1.0f);
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5 A = A();
        if (A != null) {
            A.setAlpha(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdAlbumCommentListBottomBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f386532p;
        android.widget.FrameLayout frameLayout = view != null ? (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f564155cm5) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdAlbumCommentListBottomBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        if (frameLayout != null) {
            frameLayout.setTranslationY(0.0f);
        }
        android.animation.ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.widget.LinearLayout N = N();
        if (N != null) {
            N.setBackground(M());
        }
        if (this.f386536t == 0 && (E = E()) != null) {
            E.setPadding(0, 0, 0, a84.d0.a(0));
        }
        android.widget.ImageView G2 = G();
        if (G2 != null) {
            G2.setVisibility(8);
        }
        android.view.ViewGroup W2 = W();
        if (W2 != null) {
            W2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder = this.f386540x;
        if (baseViewHolder != null && (abstractC18285x291d0ca5 = baseViewHolder.f250816m0) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnCommentInflateCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            abstractC18285x291d0ca5.f250787n = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnCommentInflateCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        }
        android.view.View F = F();
        android.view.ViewGroup.LayoutParams layoutParams = F != null ? F.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = 0;
        }
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = 0;
        }
        android.view.View F2 = F();
        if (F2 != null) {
            F2.requestLayout();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 P = P();
        if (P != null) {
            P.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cqv);
        }
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) this.O).k(java.lang.Boolean.FALSE);
        f0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }
}
