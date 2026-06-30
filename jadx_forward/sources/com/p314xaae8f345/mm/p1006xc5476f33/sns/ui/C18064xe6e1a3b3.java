package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsInfoFlip */
/* loaded from: classes4.dex */
public class C18064xe6e1a3b3 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2 implements com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener, db5.c8, com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener {

    /* renamed from: o2, reason: collision with root package name */
    public static final /* synthetic */ int f248719o2 = 0;
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public android.view.View G1;
    public android.widget.TextView H1;
    public android.widget.TextView I1;
    public java.util.List J1;
    public boolean K1;
    public float L1;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 M1;
    public java.lang.Runnable N1;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 O1;
    public java.lang.String P1;
    public int Q1;
    public int R1;
    public boolean S1;
    public boolean T1;
    public long U1;
    public android.content.Context V;
    public int V1;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e W;
    public boolean W1;
    public boolean X1;
    public final java.util.HashMap Y1;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj Z1;

    /* renamed from: a2, reason: collision with root package name */
    public int f248720a2;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f248721b2;

    /* renamed from: c2, reason: collision with root package name */
    public android.view.View f248722c2;

    /* renamed from: d2, reason: collision with root package name */
    public db5.a8 f248723d2;

    /* renamed from: e2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ak f248724e2;

    /* renamed from: f2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zj f248725f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yj f248726g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.util.HashMap f248727h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d f248728i2;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f248729j2;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f248730k2;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f248731l1;

    /* renamed from: l2, reason: collision with root package name */
    public final java.util.HashSet f248732l2;

    /* renamed from: m2, reason: collision with root package name */
    public final java.util.HashMap f248733m2;

    /* renamed from: n2, reason: collision with root package name */
    public final java.util.HashMap f248734n2;

    /* renamed from: p0, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk f248735p0;

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.HashMap f248736p1;

    /* renamed from: x0, reason: collision with root package name */
    public db5.f0 f248737x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.HashMap f248738x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f248739y0;

    /* renamed from: y1, reason: collision with root package name */
    public final java.util.HashMap f248740y1;

    /* renamed from: z1, reason: collision with root package name */
    public final java.util.HashMap f248741z1;

    public C18064xe6e1a3b3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248739y0 = false;
        this.f248731l1 = true;
        this.f248736p1 = new java.util.HashMap();
        this.f248738x1 = new java.util.HashMap();
        this.f248740y1 = new java.util.HashMap();
        this.f248741z1 = new java.util.HashMap();
        this.A1 = false;
        this.B1 = false;
        this.C1 = false;
        this.D1 = false;
        this.E1 = false;
        this.F1 = true;
        this.K1 = true;
        this.L1 = 1.0f;
        this.N1 = null;
        this.O1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.P1 = "";
        this.Q1 = -1;
        this.R1 = -1;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0L;
        this.V1 = 0;
        this.W1 = true;
        this.X1 = false;
        this.Y1 = new java.util.HashMap();
        this.Z1 = null;
        this.f248720a2 = 0;
        this.f248721b2 = false;
        this.f248723d2 = null;
        this.f248727h2 = new java.util.HashMap();
        this.f248729j2 = false;
        this.f248730k2 = false;
        this.f248732l2 = new java.util.HashSet();
        this.f248733m2 = new java.util.HashMap();
        this.f248734n2 = new java.util.HashMap();
        p(context);
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 A(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 c21508xc28dbdd3 = c18064xe6e1a3b3.M1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return c21508xc28dbdd3;
    }

    public static /* synthetic */ db5.f0 B(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        db5.f0 f0Var = c18064xe6e1a3b3.f248737x0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return f0Var;
    }

    public static /* synthetic */ db5.f0 C(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3, db5.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1402", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        c18064xe6e1a3b3.f248737x0 = f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1402", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return f0Var;
    }

    public static /* synthetic */ boolean D(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = c18064xe6e1a3b3.X1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public static /* synthetic */ java.util.List E(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.util.List list = c18064xe6e1a3b3.J1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return list;
    }

    public static void F(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        c18064xe6e1a3b3.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("exit", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.content.Context context = c18064xe6e1a3b3.V;
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18016xf3330816) context).v7();
        } else {
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee activityC18058xc05952ee = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18058xc05952ee) context;
                if (activityC18058xc05952ee.X) {
                    activityC18058xc05952ee.z7();
                }
            }
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18049x9dc71116) context).D7();
            } else {
                if (c18064xe6e1a3b3.B1) {
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).finish();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exit", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                }
                c18064xe6e1a3b3.O1.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pj(c18064xe6e1a3b3));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exit", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public static void G(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var) {
        int i17;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        c18064xe6e1a3b3.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLivePhotoPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i18 = 0;
        if (c17933xe8d1b226 != null) {
            int i19 = c17933xe8d1b226.f68895x2262335f;
            str = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
            i17 = i19;
        } else {
            i17 = 0;
            str = "";
        }
        java.lang.String str2 = jj4Var.f459388d;
        java.util.HashMap hashMap = c18064xe6e1a3b3.f248741z1;
        java.lang.String str3 = hashMap.containsKey(str2) ? (java.lang.String) hashMap.get(jj4Var.f459388d) : "";
        if (c18064xe6e1a3b3.C == com.p314xaae8f345.mm.p2621x8fb0427b.s7.d()) {
            i18 = 3;
        } else if (c18064xe6e1a3b3.C == new com.p314xaae8f345.mm.p2621x8fb0427b.s7("comment_detail")) {
            i18 = 5;
        } else if (c18064xe6e1a3b3.D == 7) {
            i18 = 2;
        }
        ke4.a.f388558a.c(2, str3, i18, jj4Var.f459388d, ca4.z0.l(), i17, str, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni(), (int) jj4Var.X.R);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLivePhotoPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public static /* synthetic */ boolean H(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = c18064xe6e1a3b3.S1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public static /* synthetic */ java.util.HashMap I(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.util.HashMap hashMap = c18064xe6e1a3b3.f248727h2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return hashMap;
    }

    public static /* synthetic */ java.util.HashMap J(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.util.HashMap hashMap = c18064xe6e1a3b3.Y1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return hashMap;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk K(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = c18064xe6e1a3b3.f248735p0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return bkVar;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e L(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = c18064xe6e1a3b3.W;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return c21520x5bb48e5e;
    }

    public static /* synthetic */ r45.jj4 M(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.jj4 m70751x462947e9 = c18064xe6e1a3b3.m70751x462947e9();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return m70751x462947e9;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d N(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = c18064xe6e1a3b3.f248728i2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return scaleGestureDetectorOnScaleGestureListenerC22653x4730490d;
    }

    public static void O(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        c18064xe6e1a3b3.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scaleTouchView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) view;
            c18064xe6e1a3b3.q0(c17983xb14a9c8d.m70627xfb84e958(), c17983xb14a9c8d.m70640x4ee17f0a());
        } else {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getChildAt(0) instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d c17983xb14a9c8d2 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d) viewGroup.getChildAt(0);
                c18064xe6e1a3b3.q0(c17983xb14a9c8d2.m70627xfb84e958(), c17983xb14a9c8d2.m70640x4ee17f0a());
            } else if (viewGroup.getChildAt(0) instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15 viewOnLongClickListenerC18284x499dee15 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) viewGroup.getChildAt(0);
                c18064xe6e1a3b3.q0(viewOnLongClickListenerC18284x499dee15, viewOnLongClickListenerC18284x499dee15);
            } else if (viewGroup.getChildAt(0) instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) viewGroup.getChildAt(0);
                c18064xe6e1a3b3.q0(c18280x2556ea40.m71039x42c61d7a(), c18280x2556ea40.m71039x42c61d7a());
            } else if (viewGroup.getChildAt(0) instanceof y51.c) {
                y51.b bVar = (y51.b) ((y51.c) viewGroup.getChildAt(0));
                c18064xe6e1a3b3.q0(bVar.m176505xa2cba55e(), bVar.m176505xa2cba55e());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scaleTouchView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zj P(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zj zjVar = c18064xe6e1a3b3.f248725f2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return zjVar;
    }

    public static /* synthetic */ boolean Q(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = c18064xe6e1a3b3.A1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public static java.lang.String e0(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("packageReportKey", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.lang.String str2 = str + "_" + i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("packageReportKey", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return str2;
    }

    /* renamed from: getMediaObj */
    private r45.jj4 m70751x462947e9() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.m33 m70762x8b87fe25 = m70762x8b87fe25();
        if (m70762x8b87fe25 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        r45.jj4 jj4Var = m70762x8b87fe25.f461642d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return jj4Var;
    }

    /* renamed from: getReportNetworkType */
    private int m70752x1f24e7fe() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(context)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 1;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(context)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 2;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(context)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 3;
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(context)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 4;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return 0;
    }

    private void p(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.U1 = java.lang.System.currentTimeMillis();
        this.V = context;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e) android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cs6, this).findViewById(com.p314xaae8f345.mm.R.id.ghs);
        this.W = c21520x5bb48e5e;
        c21520x5bb48e5e.setVerticalFadingEdgeEnabled(false);
        this.W.setHorizontalFadingEdgeEnabled(false);
        this.W.m80853x40341e13(1);
        this.W.m79173x3be48126(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qj(this));
        this.W.m79172x7f47da8f(this);
        this.W.m79171xf8b16000(this);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 c21508xc28dbdd3 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3) findViewById(com.p314xaae8f345.mm.R.id.plr);
        this.M1 = c21508xc28dbdd3;
        c21508xc28dbdd3.m79063x9da123c9(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571067cv4);
        this.G1 = findViewById(com.p314xaae8f345.mm.R.id.t2k);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.vfu);
        this.H1 = textView;
        com.p314xaae8f345.mm.ui.dl.i(textView.getPaint());
        this.I1 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.vfx);
        android.view.View view = this.G1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.G1.setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Integer.MIN_VALUE, 0}));
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.M1.getLayoutParams();
        int c17 = layoutParams.bottomMargin + com.p314xaae8f345.mm.ui.bl.c(getContext());
        layoutParams.bottomMargin = c17;
        this.f248720a2 = c17 + i65.a.b(getContext(), 6);
        this.M1.setLayoutParams(layoutParams);
        ca4.z0.f121602b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_big_pic_bound, 3200);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj njVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj(context);
        this.Z1 = njVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAlive", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageTransSheetManager", "onAlive");
        njVar.f251548b.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAlive", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public static /* synthetic */ boolean z(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = c18064xe6e1a3b3.D1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public android.util.Pair R(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.view.View e17 = this.f248735p0.e(i17);
        if (e17 instanceof android.view.ViewGroup) {
            boolean z17 = false;
            android.view.View childAt = ((android.view.ViewGroup) e17).getChildAt(0);
            if (childAt instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2756x7e662d35.C22679xbbf0480c) {
                childAt = ((android.view.ViewGroup) childAt).getChildAt(0);
                z17 = true;
            }
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "getLivePhotoView >> pos: %d is %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(childAt.hashCode()));
                android.util.Pair pair = new android.util.Pair((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) childAt, java.lang.Boolean.valueOf(z17));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return pair;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsInfoFlip", "getLivePhotoView >> pos: %d is null", java.lang.Integer.valueOf(i17));
        android.util.Pair pair2 = new android.util.Pair(null, java.lang.Boolean.FALSE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return pair2;
    }

    public void S() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e m70758x1fe82520 = m70758x1fe82520();
        if (m70758x1fe82520 != null && m70758x1fe82520.getVisibility() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "hideImgBottomBarView >> position: %d", java.lang.Integer.valueOf(mo70579xa86cd69f()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m70758x1fe82520, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "hideImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m70758x1fe82520.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m70758x1fe82520, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "hideImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.D1 && (view = this.G1) != null && view.getVisibility() == 0) {
            android.view.View view2 = this.G1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "hideImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "hideImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public boolean T(r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLivePhotoMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = jj4Var.X != null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLivePhotoMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public boolean U(r45.jj4 jj4Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isOnlineLivePhoto", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (jj4Var.X != null) {
            android.os.Vibrator vibrator = ca4.z0.f121601a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isLocalLivePhoto", "com.tencent.mm.plugin.sns.data.SnsUtil");
            boolean startsWith = jj4Var.f459388d.startsWith("pre_temp_sns_live_photo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isLocalLivePhoto", "com.tencent.mm.plugin.sns.data.SnsUtil");
            if (!startsWith) {
                z17 = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlineLivePhoto", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return z17;
            }
        }
        z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isOnlineLivePhoto", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public final void V() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (!this.f248731l1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoFlip", "longClickOver, adapter is null.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        r45.m33 m17 = bkVar.m(this.W.m80830xfda78ef6());
        if (m17 == null || (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17.f461643e) && !w())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        android.view.View.OnLongClickListener onLongClickListener = this.F;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(this.W);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "longClick %b", java.lang.Boolean.valueOf(m17.f461646h));
        if (m17.f461646h) {
            p0(m17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
        c6631xd817ea85.f139850e = 1L;
        if (this.S1) {
            c6631xd817ea85.f139851f = 6L;
        } else {
            c6631xd817ea85.f139851f = 7L;
        }
        r45.jj4 jj4Var = this.f248735p0.m(this.W.m80830xfda78ef6()).f461642d;
        c6631xd817ea85.q(jj4Var.f459391g);
        c6631xd817ea85.k();
        x(jj4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(jj4Var), m17.f461643e, jj4Var.f459388d, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void W() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar != null) {
            bkVar.mo8343xced61ae5();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void X(java.util.List list, java.lang.String str, int i17, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.s4 s4Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4 n4Var) {
        r45.lj4 lj4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAttach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().c(this);
        this.J1 = list;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSelf", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        c01.z1.r().equals(str.trim());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSelf", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        this.f247812g = s4Var;
        this.f247813h = n4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk(this, this.V);
        this.f248735p0 = bkVar;
        this.W.mo79164x6cab2c8d(bkVar);
        if (i17 >= 0 && i17 < this.J1.size()) {
            this.W.m80844x940d026a(i17);
            if (this.K1) {
                this.K1 = false;
                r45.jj4 jj4Var = this.f248735p0.m(i17).f461642d;
                if (jj4Var != null && (lj4Var = jj4Var.f459398p) != null) {
                    float f17 = lj4Var.f461054e;
                    if (f17 > 0.0f) {
                        this.L1 = lj4Var.f461053d / f17;
                    }
                }
                this.L1 = 1.0f;
            }
        }
        this.W.setFadingEdgeLength(0);
        this.W.mo79170x2d3430b4(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uj(this));
        this.W.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vj(this));
        db5.a8 a8Var = this.f248723d2;
        if (a8Var != null) {
            this.W.m79169xf8a6a4f2(a8Var);
        } else if (this.f248731l1) {
            this.W.m79169xf8a6a4f2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wj(this));
        }
        if (this.f248721b2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTouchLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d(getContext());
            this.f248728i2 = scaleGestureDetectorOnScaleGestureListenerC22653x4730490d;
            android.view.View view = this.f248722c2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            android.view.View childAt = viewGroup.getChildAt(0);
            viewGroup.removeView(childAt);
            scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.addView(childAt, 0);
            viewGroup.addView(scaleGestureDetectorOnScaleGestureListenerC22653x4730490d, 0);
            this.f248728i2.m81483xbb7f6adc(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sj(this));
            this.f248728i2.m81476x4cd678a4(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.tj(this));
            r0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTouchLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        if (this.A1 && this.f248735p0.mo8338x7444f759() > 1 && !this.D1) {
            this.M1.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 c21508xc28dbdd3 = this.M1;
            c21508xc28dbdd3.f279047e = this.f248735p0.mo8338x7444f759();
            c21508xc28dbdd3.a(i17);
        }
        if (this.T1 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248735p0.m(i17).f461643e)) {
            r45.jj4 jj4Var2 = this.f248735p0.m(i17).f461642d;
            java.lang.String str2 = jj4Var2.f459388d;
            final java.lang.String l17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(this.f248735p0.m(i17).f461642d);
            if (jj4Var2.X != null) {
                android.content.Context context = this.V;
                android.content.DialogInterface.OnClickListener onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$$a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.f248719o2;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.this;
                        c18064xe6e1a3b3.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$onAttach$2", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        c18064xe6e1a3b3.n(l17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$onAttach$2", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    }
                };
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                db5.e1.C(context, i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.ojq), "", i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.ojp), i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, onClickListener, ke4.d.f388572d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
            } else {
                n(l17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAttach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void Y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlipView", "onDestroy: ");
        this.L.mo48814x2efc64();
        this.M.mo48814x2efc64();
        this.N.mo48814x2efc64();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5899x1c237e c5899x1c237e = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5899x1c237e();
        c5899x1c237e.f136205g.f88979a = (android.app.Activity) this.f247816n;
        c5899x1c237e.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar != null) {
            bkVar.h();
            this.f248735p0 = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void Z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDetach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "sns info flip on detach.");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar != null) {
            bkVar.p();
            this.f248735p0.i();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar2 = this.f248735p0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            bkVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("releaseAdapterHoldLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            android.util.SparseArray sparseArray = K(bkVar2.f249458r).f310004f;
            for (int i17 = 0; i17 < sparseArray.size(); i17++) {
                java.lang.Object valueAt = sparseArray.valueAt(i17);
                if (valueAt instanceof android.view.View) {
                    bkVar2.s((android.view.View) valueAt);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("releaseAdapterHoldLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Cj().v(this);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDetach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(r45.jj4 r23, int r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.a0(r45.jj4, int, java.lang.String):void");
    }

    public void b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f247824v = null;
        this.f247825w = "";
        this.f247826x = null;
        this.f247827y = null;
        if (this.B != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831 c5225x893b831 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831();
            android.app.Activity activity = (android.app.Activity) this.f247816n;
            am.p1 p1Var = c5225x893b831.f135558g;
            p1Var.f89127b = activity;
            p1Var.f89126a = this.B.f240152d;
            c5225x893b831.e();
            this.B = null;
        }
        this.A.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar != null) {
            bkVar.p();
            this.f248735p0.i();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void c0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onRefresh", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar != null) {
            if (z17) {
                bkVar.mo8343xced61ae5();
            }
            d0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onRefresh", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void d0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar == null || bkVar.m(this.W.m80830xfda78ef6()) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        int m80830xfda78ef6 = this.W.m80830xfda78ef6();
        if (this.A1 && this.f248735p0.mo8338x7444f759() > 1 && !this.D1) {
            this.M1.setVisibility(0);
            this.M1.m79064x764e9211(m80830xfda78ef6);
        }
        r45.jj4 jj4Var = this.f248735p0.m(this.W.m80830xfda78ef6()).f461642d;
        this.f248732l2.add(jj4Var.f459388d);
        java.lang.String str = this.f248735p0.m(this.W.m80830xfda78ef6()).f461643e;
        java.lang.String str2 = jj4Var.f459388d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetFailId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P1) || !this.P1.equals(str2)) {
            this.P1 = "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetFailId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetFailId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        a0(jj4Var, m80830xfda78ef6, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void f0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordLoadCancel", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (!this.S1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordLoadCancel", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        java.util.HashMap hashMap = this.f248733m2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadCancel >> reportInfoMapSize：%d", java.lang.Integer.valueOf(hashMap.size()));
        hashMap.forEach(new java.util.function.BiConsumer() { // from class: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$$b
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.f248719o2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.this;
                c18064xe6e1a3b3.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$recordLoadCancel$4", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadCancel key:%s", (java.lang.String) obj);
                c18064xe6e1a3b3.j0((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xj) obj2, 2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$recordLoadCancel$4", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            }
        });
        hashMap.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordLoadCancel", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void g0(java.lang.String str, r45.jj4 jj4Var, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoFlip", "recordLoadStart error for null media");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        if (!this.S1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        java.lang.String str2 = jj4Var.f459388d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadStart, snsId:%s, mediaId:%s downloadType:%d reason:%d downloadScene:%d", str, str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        java.lang.String e07 = e0(str2, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xj xjVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xj();
        xjVar.f253051a = m70753x7444f759();
        xjVar.f253059i = str;
        xjVar.f253053c = m70752x1f24e7fe();
        xjVar.f253056f = java.lang.System.currentTimeMillis();
        xjVar.f253055e = jj4Var;
        xjVar.f253060j = i18;
        xjVar.f253061k = i19;
        if (i27 == 0) {
            xjVar.f253054d = i27;
            java.util.HashMap hashMap = this.f248733m2;
            if (!hashMap.containsKey(e07)) {
                hashMap.put(e07, xjVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadStart, put to report map key: %s", e07);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadStart, put to need load map key: %s", str2);
            this.f248734n2.put(str2, xjVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2
    /* renamed from: getCntMedia */
    public r45.jj4 mo70574x2d3ab571() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCntMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (this.f248735p0 != null) {
            int m80830xfda78ef6 = this.W.m80830xfda78ef6();
            java.util.List list = this.J1;
            if (list != null && m80830xfda78ef6 < list.size()) {
                r45.jj4 jj4Var = this.f248735p0.m(m80830xfda78ef6).f461642d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCntMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return jj4Var;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCntMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return null;
    }

    /* renamed from: getCount */
    public int m70753x7444f759() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 0;
        }
        int mo8338x7444f759 = bkVar.mo8338x7444f759();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return mo8338x7444f759;
    }

    /* renamed from: getCurrentFlipItem */
    public r45.m33 m70754xd9065b83() {
        java.util.List list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentFlipItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int m80830xfda78ef6 = this.W.m80830xfda78ef6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "getCurrentFlipItem pos: %d size: %d", java.lang.Integer.valueOf(m80830xfda78ef6), java.lang.Integer.valueOf(this.J1.size()));
        if (m80830xfda78ef6 < 0 || (list = this.J1) == null || list.size() <= m80830xfda78ef6) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentFlipItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        r45.m33 m33Var = (r45.m33) this.J1.get(m80830xfda78ef6);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentFlipItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return m33Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2
    /* renamed from: getCurrentImageView */
    public android.view.View mo70575xb763149d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.lang.Object obj = this.f248737x0;
        if (!(obj instanceof android.view.View)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        android.view.View view = (android.view.View) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return view;
    }

    /* renamed from: getCurrentView */
    public android.view.View m70755xfdad4e88() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar == null || (i17 = this.R1) == -1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        android.view.View e17 = bkVar.e(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return e17;
    }

    /* renamed from: getFlipList */
    public java.util.List<r45.m33> m70756xea2e6421() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFlipList", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.util.List<r45.m33> list = this.J1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFlipList", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return list;
    }

    /* renamed from: getFromScene */
    public com.p314xaae8f345.mm.p2621x8fb0427b.s7 m70757x38bbc4c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = this.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return s7Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2
    /* renamed from: getGallery */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e mo70578x3219b31c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGallery", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.W;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGallery", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return c21520x5bb48e5e;
    }

    /* renamed from: getImgBottomBarView */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e m70758x1fe82520() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.view.View m70755xfdad4e88 = m70755xfdad4e88();
        if (!(m70755xfdad4e88 instanceof android.view.ViewGroup)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) m70755xfdad4e88;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e abstractC18014xebccc4e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e) childAt;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return abstractC18014xebccc4e;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return null;
    }

    /* renamed from: getNumOfFileExist */
    public int m70759xb3d0c054() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNumOfFileExist", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i17 = 0;
        int i18 = 0;
        for (r45.m33 m33Var : this.J1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj();
            if (com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1.l(m33Var.f461642d))) {
                i17++;
            }
            i18++;
            if (i18 > 9) {
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNumOfFileExist", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2
    /* renamed from: getPosition */
    public int mo70579xa86cd69f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i17 = this.R1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return i17;
    }

    /* renamed from: getSelectCount */
    public int m70760xe521303d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int size = this.f248732l2.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return size;
    }

    /* renamed from: getSelectId */
    public java.lang.String m70761xc2e02cad() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.m33 m70762x8b87fe25 = m70762x8b87fe25();
        if (m70762x8b87fe25 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        java.lang.String str = m70762x8b87fe25.f461643e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return str;
    }

    /* renamed from: getSelectItem */
    public r45.m33 m70762x8b87fe25() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.W;
        if (c21520x5bb48e5e == null || this.f248735p0 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        r45.m33 m17 = this.f248735p0.m(c21520x5bb48e5e.m80830xfda78ef6());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return m17;
    }

    /* renamed from: getSelectLivePhotoView */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 m70763xa5e60d99() {
        r45.jj4 jj4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.m33 m70762x8b87fe25 = m70762x8b87fe25();
        if (m70762x8b87fe25 == null || (jj4Var = m70762x8b87fe25.f461642d) == null || !U(jj4Var)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) R(m70764x99258502()).first;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return c18280x2556ea40;
    }

    /* renamed from: getSelectPos */
    public int m70764x99258502() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectPos", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = this.W;
        if (c21520x5bb48e5e == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectPos", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return -1;
        }
        int m80830xfda78ef6 = c21520x5bb48e5e.m80830xfda78ef6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectPos", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return m80830xfda78ef6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2
    /* renamed from: getSelectedMediaId */
    public java.lang.String mo70580xfac972ce() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSelectedMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.jj4 mo70574x2d3ab571 = mo70574x2d3ab571();
        if (mo70574x2d3ab571 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectedMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        java.lang.String str = mo70574x2d3ab571.f459388d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSelectedMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2
    /* renamed from: getSnsId */
    public long mo70581x7525eefd() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 0L;
        }
        r45.m33 m17 = bkVar.m(this.W.m80830xfda78ef6());
        java.lang.String str = m17 == null ? "" : m17.f461643e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 0L;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        long j17 = k17 != null ? k17.f68891x29d1292e : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return j17;
    }

    /* renamed from: getWidthModHeight */
    public float m70765x450e3899() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWidthModHeight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        float f17 = this.L1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWidthModHeight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return f17;
    }

    public void h0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("release", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        l0(this.W.m80830xfda78ef6());
        this.W.f279148m.mo50303x856b99f0(1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj njVar = this.Z1;
        njVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDead", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageTransSheetManager", "onDead");
        njVar.f251548b.mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDead", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("release", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2
    public boolean i(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dispatchXY", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dispatchXY", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return true;
    }

    public boolean i0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i17 = 0;
        if (this.f248735p0 == null || this.J1 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return false;
        }
        while (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (this.f248735p0 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            } else {
                while (i17 < this.J1.size()) {
                    r45.m33 m17 = this.f248735p0.m(i17);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m17.f461643e) && m17.f461643e.equals(str)) {
                        this.J1.remove(i17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        break;
                    }
                    i17++;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            }
            i17 = -1;
        }
        this.f248735p0.mo8343xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return true;
    }

    public final void j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xj xjVar, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportBigPicLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        xjVar.f253057g = java.lang.System.currentTimeMillis();
        xjVar.f253053c = m70752x1f24e7fe();
        xjVar.f253058h = xjVar.f253057g - xjVar.f253056f;
        xjVar.f253052b = i17;
        r45.jj4 jj4Var = xjVar.f253055e;
        int i18 = jj4Var.S;
        r45.lj4 lj4Var = new r45.lj4();
        int i19 = xjVar.f253060j;
        if (i19 == 2) {
            lj4Var = jj4Var.f459398p;
            str = "0";
        } else if (i19 == 10) {
            lj4Var = jj4Var.f459415z1;
            str = "2000";
        } else if (i19 == 11) {
            lj4Var = jj4Var.F1;
            str = "1000";
        } else {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = java.lang.Integer.valueOf(xjVar.f253051a);
        objArr[1] = java.lang.Integer.valueOf(xjVar.f253052b);
        objArr[2] = java.lang.Long.valueOf(xjVar.f253058h);
        objArr[3] = java.lang.Integer.valueOf(xjVar.f253053c);
        objArr[4] = java.lang.Integer.valueOf(xjVar.f253054d);
        objArr[5] = java.lang.Float.valueOf(lj4Var.f461055f);
        objArr[6] = xjVar.f253059i;
        objArr[7] = java.lang.Long.valueOf(xjVar.f253056f);
        objArr[8] = java.lang.Float.valueOf(lj4Var.f461053d);
        objArr[9] = java.lang.Float.valueOf(lj4Var.f461054e);
        objArr[10] = java.lang.Float.valueOf(lj4Var.f461055f);
        objArr[11] = java.lang.Integer.valueOf(i18);
        objArr[12] = java.lang.Integer.valueOf(xjVar.f253055e.X != null ? 1 : 0);
        objArr[13] = java.lang.Integer.valueOf(xjVar.f253055e.Y + 1);
        objArr[14] = java.lang.Integer.valueOf(xjVar.f253061k);
        objArr[15] = str;
        g0Var.d(11601, objArr);
        java.lang.Object[] objArr2 = new java.lang.Object[13];
        objArr2[0] = java.lang.Integer.valueOf(xjVar.f253051a);
        objArr2[1] = java.lang.Integer.valueOf(xjVar.f253052b);
        objArr2[2] = java.lang.Long.valueOf(xjVar.f253058h);
        objArr2[3] = java.lang.Integer.valueOf(xjVar.f253053c);
        objArr2[4] = xjVar.f253059i;
        objArr2[5] = java.lang.Long.valueOf(xjVar.f253056f);
        objArr2[6] = java.lang.Float.valueOf(lj4Var.f461053d);
        objArr2[7] = java.lang.Float.valueOf(lj4Var.f461054e);
        objArr2[8] = java.lang.Float.valueOf(lj4Var.f461055f);
        objArr2[9] = java.lang.Integer.valueOf(i18);
        objArr2[10] = "";
        objArr2[11] = java.lang.Boolean.valueOf(xjVar.f253055e.X != null);
        objArr2[12] = java.lang.Integer.valueOf(xjVar.f253055e.Y);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport report big pic load, picNum:%d, loadResult:%d, loadCostTime:%d, networkType:%d ,publishid:%s,startTimes:%d,width:%f,height:%f,size:%f,mediaType:%d,path:%sisLivePhoto:%b,index:%d ", objArr2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportBigPicLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void k0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, r45.jj4 jj4Var) {
        java.lang.String str;
        java.lang.String str2;
        int i18;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportLivePhotoExposure", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (jj4Var.X != null) {
            java.lang.String str3 = jj4Var.f459388d;
            java.util.HashMap hashMap = this.f248741z1;
            if (hashMap.containsKey(str3)) {
                str = (java.lang.String) hashMap.get(jj4Var.f459388d);
            } else {
                str = jj4Var.f459388d + "_" + java.lang.System.currentTimeMillis();
                hashMap.put(jj4Var.f459388d, str);
            }
            java.lang.String str4 = str;
            if (c17933xe8d1b226 != null) {
                int i28 = c17933xe8d1b226.f68895x2262335f;
                str2 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
                i18 = i28;
            } else {
                str2 = "";
                i18 = 0;
            }
            if (this.C == com.p314xaae8f345.mm.p2621x8fb0427b.s7.d()) {
                i27 = 3;
            } else if (this.C == new com.p314xaae8f345.mm.p2621x8fb0427b.s7("comment_detail")) {
                i27 = 5;
            } else if (this.D == 7) {
                i27 = 2;
            } else {
                i19 = 0;
                ke4.a.f388558a.b(str4, i18, str2, ca4.z0.l(), i19, jj4Var.f459388d, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni(), (int) jj4Var.X.R);
            }
            i19 = i27;
            ke4.a.f388558a.b(str4, i18, str2, ca4.z0.l(), i19, jj4Var.f459388d, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni(), (int) jj4Var.X.R);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportLivePhotoExposure", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void l0(int i17) {
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (i17 < 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        r45.m33 m17 = this.f248735p0.m(i17);
        if (m17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        r45.jj4 jj4Var = m17.f461642d;
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        java.lang.String str = m17.f461643e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null || k17.m70371x485d7().f39014x86965dde == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        java.util.LinkedList linkedList = k17.m70371x485d7().f39014x86965dde.f451373h;
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        int i19 = 0;
        while (true) {
            i18 = -1;
            if (i19 >= linkedList.size()) {
                i19 = -1;
                break;
            } else if (((r45.jj4) linkedList.get(i19)).f459388d.equals(jj4Var.f459388d)) {
                break;
            } else {
                i19++;
            }
        }
        java.lang.String t07 = ca4.z0.t0(k17.f68891x29d1292e);
        int i27 = jj4Var.f459389e == 6 || T(jj4Var) ? 2 : 1;
        ta4.f1 f1Var = ta4.f1.f498276a;
        int i28 = this.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("snsUIScene2Report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
        if (i28 == 1) {
            i18 = 3;
        } else if (i28 == 2) {
            i18 = 4;
        } else if (i28 == 4 || i28 == 5) {
            i18 = 5;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("snsUIScene2Report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
        f1Var.b(i18, i27, t07, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public boolean m0(db5.f0 f0Var, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yj yjVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFirstViewLoad", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (f0Var == null || !this.W1 || (yjVar = this.f248726g2) == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFirstViewLoad", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return false;
        }
        this.W1 = false;
        yjVar.a(f0Var, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFirstViewLoad", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return true;
    }

    public void n0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPageControlGone", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21508xc28dbdd3 c21508xc28dbdd3 = this.M1;
        if (c21508xc28dbdd3 != null) {
            c21508xc28dbdd3.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPageControlGone", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void o0() {
        java.lang.Integer num;
        int i17;
        java.lang.Float f17;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e m70758x1fe82520 = m70758x1fe82520();
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (m70758x1fe82520 == null || m70758x1fe82520.getVisibility() != 8) {
            num = 0;
            i17 = 0;
            f17 = valueOf;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "showImgBottomBarView >> position: %d", java.lang.Integer.valueOf(mo70579xa86cd69f()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(valueOf);
            java.util.Collections.reverse(arrayList);
            num = 0;
            i17 = 0;
            f17 = valueOf;
            yj0.a.d(m70758x1fe82520, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            m70758x1fe82520.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(m70758x1fe82520, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(null);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m70758x1fe82520, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m70758x1fe82520.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(m70758x1fe82520, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(m70758x1fe82520, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
        if (this.D1 && (view = this.G1) != null && view.getVisibility() == 8) {
            android.view.View view2 = this.G1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(f17);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList3.get(i17)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view3 = this.G1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(num);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(i17)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.G1, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.start();
        }
        r0();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener
    /* renamed from: onCenterChanged */
    public void mo15812x74e67900(android.graphics.PointF pointF, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCenterChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCenterChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener
    /* renamed from: onDoubleClickScale */
    public void mo15819x92a4c352(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleClickScale", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        ta4.f1.f498276a.a(1, f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleClickScale", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.ScaleChangeReportListener
    /* renamed from: onFingerScaleEnd */
    public void mo15820x6d672179(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFingerScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        ta4.f1.f498276a.a(2, f17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFingerScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onImageFinish */
    public void mo852x876bfa6f(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3;
        r45.jj4 jj4Var;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        super.mo852x876bfa6f(str, i17, z17);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Boolean.valueOf(this.f248735p0 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "onImageFinish, mediaId: %s,downloadType:%d isOK: %s, null == adapter: %s.", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        final r45.jj4 jj4Var2 = bkVar.m(this.W.m80830xfda78ef6()).f461642d;
        if (!z17 && jj4Var2 != null && (str3 = jj4Var2.f459388d) != null && str3.equals(str)) {
            android.content.Context context = this.V;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_9), 0).show();
            this.P1 = str;
        }
        int i18 = z17 ? 1 : 3;
        if (this.S1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaObjWithMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            java.util.Iterator it = this.J1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObjWithMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    jj4Var = null;
                    break;
                } else {
                    r45.m33 m33Var = (r45.m33) it.next();
                    if (m33Var.f461642d.f459388d.equals(str)) {
                        jj4Var = m33Var.f461642d;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaObjWithMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        break;
                    }
                }
            }
            if (jj4Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsInfoFlip", "BigImageReport recordEnd, mediaId: %s no in item", str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadEnd, result:%d, mediaId:%s downloadType:%d", java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i17));
                java.lang.String e07 = e0(str, i17);
                java.util.HashMap hashMap = this.f248733m2;
                if (hashMap.containsKey(e07)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xj xjVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.xj) hashMap.remove(e07);
                    if (xjVar == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport infoMap has key: %s", e07);
                        j0(xjVar, i18);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SnsInfoFlip", "BigImageReport infoMap no has key: %s", e07);
                }
                java.util.HashMap hashMap2 = this.f248734n2;
                if (hashMap2.containsKey(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport need to load info to remove: %s", str);
                    hashMap2.remove(str);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            }
        }
        if (jj4Var2 != null && (str2 = jj4Var2.f459388d) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "img download finish, refresh ui, media id: %s. and mediaLocal id %s", str2, java.lang.Integer.valueOf(jj4Var2.f459403s));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar2 = this.f248735p0;
            bkVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b32 = bkVar2.f249458r;
            int size = E(c18064xe6e1a3b32).size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    break;
                }
                r45.m33 m17 = bkVar2.m(i19);
                if (m17 != null && m17.f461642d.f459388d.equals(str)) {
                    if (!c18064xe6e1a3b32.U(m17.f461642d)) {
                        bkVar2.t(i19, i17, str, z17);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        break;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40 c18280x2556ea40 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.C18280x2556ea40) c18064xe6e1a3b32.R(i19).first;
                    if (c18280x2556ea40 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateLivePhotoViewByLoadBigImageFinish", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                        c18064xe6e1a3b3 = c18064xe6e1a3b32;
                        c18280x2556ea40.m("updateLivePhotoViewByLoadBigImageFinish isOk: " + z17);
                        if (!z17) {
                            c18280x2556ea40.f250738w = dd4.f.f310530f;
                            android.view.View view = c18280x2556ea40.f250724f;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView", "updateLivePhotoViewByLoadBigImageFinish", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView", "updateLivePhotoViewByLoadBigImageFinish", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else if (c18280x2556ea40.f250738w == dd4.f.f310529e) {
                            c18280x2556ea40.p();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateLivePhotoViewByLoadBigImageFinish", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                    } else {
                        c18064xe6e1a3b3 = c18064xe6e1a3b32;
                    }
                } else {
                    c18064xe6e1a3b3 = c18064xe6e1a3b32;
                }
                i19++;
                c18064xe6e1a3b32 = c18064xe6e1a3b3;
            }
            if (jj4Var2.f459388d.equals(str) && this.T1) {
                if (jj4Var2.X != null) {
                    android.content.Context context2 = this.V;
                    android.content.DialogInterface.OnClickListener onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$$c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i27) {
                            int i28 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.f248719o2;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b33 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.this;
                            c18064xe6e1a3b33.getClass();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$onImageFinish$3", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                            c18064xe6e1a3b33.o(jj4Var2);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$onImageFinish$3", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        }
                    };
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                    db5.e1.C(context2, i65.a.r(context2, com.p314xaae8f345.mm.R.C30867xcad56011.ojq), "", i65.a.r(context2, com.p314xaae8f345.mm.R.C30867xcad56011.ojp), i65.a.r(context2, com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, onClickListener, ke4.d.f388572d);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
                } else {
                    o(jj4Var2);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener
    /* renamed from: onScaleChanged */
    public void mo15813x264e5589(float f17, float f18, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScaleChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d.OnStateChangedListener
    /* renamed from: onScaleFinish */
    public void mo15814xd4e26b1e(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScaleFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        pc4.d dVar = pc4.d.f434943a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsImageLoadScaleLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_sns_image_load_scale_limit, 1.1f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsConfig", "getSnsImageLoadScaleLimit:" + Di);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsImageLoadScaleLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (f17 >= Di) {
            r45.jj4 m70751x462947e9 = m70751x462947e9();
            if (m70751x462947e9 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            int n17 = bkVar.n(m70751x462947e9);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            if (n17 == 3 || n17 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar2 = this.f248735p0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                java.util.HashSet hashSet = bkVar2.f249453m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                if (hashSet.contains(m70751x462947e9.f459388d)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    return;
                }
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "start load uhd image id:%s", m70751x462947e9.f459388d);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar3 = this.f248735p0;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$3700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                java.util.HashSet hashSet2 = bkVar3.f249453m;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$3700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                hashSet2.add(m70751x462947e9.f459388d);
                com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = this.C;
                int i17 = m70762x8b87fe25().f461644f;
                com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.s7(s7Var.f276845a);
                s7Var2.f276846b = i17;
                boolean n07 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().n0(m70751x462947e9, 2, s7Var2, m70751x462947e9.N);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", "onScaleFinish to load uhd image %b", java.lang.Boolean.valueOf(n07));
                if (!n07) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(m70762x8b87fe25().f461643e);
                    g0(k17 != null ? ca4.z0.t0(k17.f68891x29d1292e) : "", m70751x462947e9, m70762x8b87fe25().f461645g, 10, 2, 0);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScaleFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.h0
    /* renamed from: onSightFinish */
    public void mo854x822e7131(java.lang.String str, boolean z17) {
        r45.jj4 jj4Var;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        super.mo854x822e7131(str, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSightFinish ");
        sb6.append(str);
        sb6.append(" ");
        sb6.append(z17);
        sb6.append(" ");
        sb6.append(this.f248735p0 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsInfoFlip", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bk bkVar = this.f248735p0;
        if (bkVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        if (!z17 && bkVar.m(this.W.m80830xfda78ef6()) != null && (jj4Var = this.f248735p0.m(this.W.m80830xfda78ef6()).f461642d) != null && (str2 = jj4Var.f459388d) != null && str2.equals(str)) {
            android.content.Context context = this.V;
            dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j__), 0).show();
            this.P1 = str;
        }
        this.f248735p0.mo8343xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void p0(r45.m33 m33Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTranlateLongClickBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj njVar = this.Z1;
        njVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showMenuForOCRTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        if (m33Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageTransSheetManager", "showMenuForOCRTranslateResult item is NULL");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showMenuForOCRTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(njVar.f251547a, 0, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.lj(njVar);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.mj(njVar, m33Var);
            k0Var.v();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showMenuForOCRTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTranlateLongClickBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void q0(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("touchView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (view2 != null && view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            view2.getGlobalVisibleRect(rect);
            if (rect.bottom - rect.top > 0) {
                this.f248728i2.m81482x1405e56c(r7 - r3);
                this.f248728i2.m81485xbdd8ccab(rect);
            }
            this.f248728i2.b(view);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("touchView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void r0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTouchLayoutDisabledRect", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (!this.D1 || this.f248728i2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTouchLayoutDisabledRect", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e m70758x1fe82520 = m70758x1fe82520();
        if ((m70758x1fe82520 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18011x827742fc) && m70758x1fe82520.getVisibility() == 0) {
            m70758x1fe82520.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$$d
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.f248719o2;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3 c18064xe6e1a3b3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18064xe6e1a3b3.this;
                    c18064xe6e1a3b3.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$updateTouchLayoutDisabledRect$1", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC18014xebccc4e abstractC18014xebccc4e = m70758x1fe82520;
                    if (abstractC18014xebccc4e.getVisibility() == 0 && c18064xe6e1a3b3.f248728i2 != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        abstractC18014xebccc4e.getGlobalVisibleRect(rect);
                        c18064xe6e1a3b3.f248728i2.m81475x5caef802(rect);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$updateTouchLayoutDisabledRect$1", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                }
            });
        } else {
            this.f248728i2.m81475x5caef802(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTouchLayoutDisabledRect", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractC17957x723314d2
    public boolean s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = this.S1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    /* renamed from: setCurrentImageView */
    public void m70766x5b5fa9a9(db5.f0 f0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f248737x0 = f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setEnableHorLongBmpMode */
    public void m70767x464b3146(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnableHorLongBmpMode", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.E1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnableHorLongBmpMode", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setEnableSingleClickOver */
    public void m70768x1de55fcf(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnableSingleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.F1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnableSingleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setFirstItemLoadListener */
    public void m70769xad4dadfb(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yj yjVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFirstItemLoadListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f248726g2 = yjVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFirstItemLoadListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setFromScene */
    public void m70770x5fdf7cc0(com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.C = s7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setGalleyLongClickOverListener */
    public void m70771xcb3a9904(db5.a8 a8Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGalleyLongClickOverListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f248723d2 = a8Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGalleyLongClickOverListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setInfoType */
    public void m70772x812dff8a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setInfoType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setInfoType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setIsAd */
    public void m70773x764ba26f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsAd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f248739y0 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsAd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setIsFromMainTimeline */
    public void m70774xdfe95330(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.S1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setIsSoonEnterPhotoEditUI */
    public void m70775x7065439f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsSoonEnterPhotoEditUI", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.T1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsSoonEnterPhotoEditUI", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setItems */
    public void m70776x5329a87e(java.util.List<r45.m33> list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.J1 = list;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setOnDeleteAllAction */
    public void m70777xcef415ab(java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnDeleteAllAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.N1 = runnable;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnDeleteAllAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setOnPageScrollChangeListener */
    public void m70778x18ea94e1(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zj zjVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnPageScrollChangeListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f248725f2 = zjVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnPageScrollChangeListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setOnPageSelectListener */
    public void m70779x76fc4600(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ak akVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnPageSelectListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f248724e2 = akVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnPageSelectListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setShowLongClickMenu */
    public void m70780x6da39bac(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowLongClickMenu", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f248731l1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowLongClickMenu", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setShowPageControl */
    public void m70781x8fe1d3cf(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowPageControl", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.A1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowPageControl", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setShowTitle */
    public void m70782xe9aedf19(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShowTitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.C1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShowTitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setTitleMain */
    public void m70783xdc70e1ef(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleMain", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.widget.TextView textView = this.H1;
        if (textView != null) {
            textView.setText(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleMain", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setTitleSubtitle */
    public void m70784x1a181d4e(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTitleSubtitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.widget.TextView textView = this.I1;
        if (textView != null) {
            textView.setText(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTitleSubtitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setTouchFinish */
    public void m70785xbe0666f0(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTouchFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.B1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTouchFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setUIFromScene */
    public void m70786xa143192c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUIFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.D = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUIFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setUseFixAnimation */
    public void m70787x25bde954(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUseFixAnimation", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.X1 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUseFixAnimation", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setUseNewInteraction */
    public void m70788x24b1f577(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUseNewInteraction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.D1 = z17;
        android.view.View view = this.G1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "setUseNewInteraction", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "setUseNewInteraction", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUseNewInteraction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* renamed from: setVideoScene */
    public void m70789xbb45aed3(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVideoScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.V1 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVideoScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public C18064xe6e1a3b3(android.content.Context context) {
        super(context);
        this.f248739y0 = false;
        this.f248731l1 = true;
        this.f248736p1 = new java.util.HashMap();
        this.f248738x1 = new java.util.HashMap();
        this.f248740y1 = new java.util.HashMap();
        this.f248741z1 = new java.util.HashMap();
        this.A1 = false;
        this.B1 = false;
        this.C1 = false;
        this.D1 = false;
        this.E1 = false;
        this.F1 = true;
        this.K1 = true;
        this.L1 = 1.0f;
        this.N1 = null;
        this.O1 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.P1 = "";
        this.Q1 = -1;
        this.R1 = -1;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0L;
        this.V1 = 0;
        this.W1 = true;
        this.X1 = false;
        this.Y1 = new java.util.HashMap();
        this.Z1 = null;
        this.f248720a2 = 0;
        this.f248721b2 = false;
        this.f248723d2 = null;
        this.f248727h2 = new java.util.HashMap();
        this.f248729j2 = false;
        this.f248730k2 = false;
        this.f248732l2 = new java.util.HashSet();
        this.f248733m2 = new java.util.HashMap();
        this.f248734n2 = new java.util.HashMap();
        p(context);
    }
}
