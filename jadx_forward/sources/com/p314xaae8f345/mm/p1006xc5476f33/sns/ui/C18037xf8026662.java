package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentFooter */
/* loaded from: classes4.dex */
public class C18037xf8026662 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 implements p94.u0 {
    public static java.lang.String I1;
    public int A;
    public java.lang.String A1;
    public int B;
    public java.util.List B1;
    public int C;
    public boolean C1;
    public java.lang.String D;
    public boolean D1;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 E;
    public final android.text.TextWatcher E1;
    public ta4.x0 F;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cg F1;
    public boolean G;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.eg G1;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f H;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx H1;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f248622J;
    public android.view.View K;
    public android.view.View L;
    public android.view.View M;
    public android.widget.ImageView N;
    public android.view.View P;
    public android.widget.ImageView Q;
    public android.view.View R;
    public zb4.a S;
    public final bc4.d T;
    public boolean U;
    public java.util.Map V;
    public android.view.View W;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f248623g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageButton f248624h;

    /* renamed from: i, reason: collision with root package name */
    public fl5.i f248625i;

    /* renamed from: l1, reason: collision with root package name */
    public final android.view.inputmethod.InputMethodManager f248626l1;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f248627m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f248628n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f248629o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f248630p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f248631p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f248632p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f248633q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f248634r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.LinearLayout f248635s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18420xe54becbe f248636t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f248637u;

    /* renamed from: v, reason: collision with root package name */
    public r45.e86 f248638v;

    /* renamed from: w, reason: collision with root package name */
    public int f248639w;

    /* renamed from: x, reason: collision with root package name */
    public int f248640x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f248641x0;

    /* renamed from: x1, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f248642x1;

    /* renamed from: y, reason: collision with root package name */
    public int f248643y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f248644y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f248645y1;

    /* renamed from: z, reason: collision with root package name */
    public int f248646z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f248647z1;

    static {
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        I1 = o13.n.l(79);
    }

    public C18037xf8026662(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f248638v = null;
        this.f248639w = 0;
        this.f248640x = 0;
        this.f248643y = -1;
        this.f248646z = -1;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext());
        this.G = false;
        this.I = false;
        this.f248622J = false;
        this.S = new zb4.a();
        this.T = new bc4.d();
        this.U = false;
        this.V = new java.util.HashMap();
        this.f248631p0 = false;
        this.f248641x0 = true;
        this.f248644y0 = false;
        this.f248632p1 = false;
        this.f248645y1 = "";
        this.A1 = "";
        this.C1 = false;
        this.D1 = true;
        this.E1 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wf(this);
        this.f248623g = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.F = ta4.x0.f498384j.b();
        this.f248626l1 = (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method");
    }

    public static void I(android.content.Context context, java.lang.Object obj, boolean z17, java.lang.String str, int i17, java.lang.String str2, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) obj;
        ((sg0.c2) ((tg0.n1) i95.n0.c(tg0.n1.class))).wi(null, z17 ? 3 : 2, context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac ? 3 : context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18053x54313abb ? 2 : 1, c17933xe8d1b226.f68896xdde069b, ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e), c17933xe8d1b226.m70377x3172ed() ? 2 : c17933xe8d1b226.m70434xfa01e35c() ? 3 : 1, java.lang.String.valueOf(str), I1, i17, str2, j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reportInputMenu", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public static /* synthetic */ jz5.f0 f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662, java.lang.String str, java.lang.String str2) {
        c18037xf8026662.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$getEmoticonThumbImageTask$7", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        java.lang.String m70707xb001e9bb = c18037xf8026662.m70707xb001e9bb();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "emoticon load success md5: %s currentMd5: %s", str, m70707xb001e9bb);
        if (m70707xb001e9bb.equals(str)) {
            android.widget.ImageView imageView = c18037xf8026662.Q;
            bc4.d dVar = c18037xf8026662.T;
            dVar.b(imageView, str2);
            c18037xf8026662.S.h(dVar.a(str2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$getEmoticonThumbImageTask$7", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return null;
    }

    public static /* synthetic */ jz5.f0 g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662, java.lang.String str) {
        c18037xf8026662.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$getEmoticonThumbImageTask$8", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "emoticon load failed md5: %s currentMd5: %s", str, c18037xf8026662.m70707xb001e9bb());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$getEmoticonThumbImageTask$8", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return null;
    }

    /* renamed from: getCurrentEmojiMd5 */
    private java.lang.String m70707xb001e9bb() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentEmojiMd5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.S.a() != 1 || this.S.b() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentEmojiMd5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return "";
        }
        java.lang.String mo42933xb5885648 = this.S.b().mo42933xb5885648();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentEmojiMd5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return mo42933xb5885648;
    }

    /* renamed from: getImeSupportFileAbility */
    private long m70708xc2520caa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImeSupportFileAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImeSupportFileAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return 7L;
    }

    /* renamed from: getImeSupportIdentityAbility */
    private long m70709xf9411528() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImeSupportIdentityAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImeSupportIdentityAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return 7L;
    }

    /* renamed from: getSmilePanelHeight */
    private int m70710x25689b99() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSmilePanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int max = (this.I && this.f248631p0) ? java.lang.Math.max(qk.w9.a(getContext()), this.A) : this.A;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSmilePanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return max;
    }

    /* renamed from: getSmileyInitTab */
    private java.lang.String m70711xb96fbcfe() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f248642x1;
        if (o4Var != null) {
            java.lang.String u17 = o4Var.u("smiley_panel_tab", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "getSmileyInitTab >> cacheTab: %s", u17);
            if (!android.text.TextUtils.isEmpty(u17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return u17;
            }
        }
        java.util.Iterator it = gr.t.g().a().iterator();
        while (it.hasNext()) {
            if (!n22.m.l((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) it.next())) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return "custom";
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return "smiley";
    }

    /* renamed from: getWxKeyboardAbility */
    private long m70712x8159696c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getWxKeyboardAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getWxKeyboardAbility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return 33L;
    }

    public static /* synthetic */ void h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        c18037xf8026662.o(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public static /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf i(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c18037xf8026662.f248623g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return abstractActivityC21394xb3d2c0cf;
    }

    public static boolean j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        c18037xf8026662.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInReply", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        r45.e86 e86Var = c18037xf8026662.f248638v;
        if (e86Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e86Var.f454659d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInReply", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            z17 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInReply", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            z17 = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z17;
    }

    public static /* synthetic */ zb4.a k(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        zb4.a aVar = c18037xf8026662.S;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return aVar;
    }

    public static /* synthetic */ fl5.i l(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        fl5.i iVar = c18037xf8026662.f248625i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return iVar;
    }

    public static /* synthetic */ java.lang.String m(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        java.lang.String str = c18037xf8026662.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return str;
    }

    public static boolean n(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        c18037xf8026662.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkBtnEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z18 = true;
        boolean z19 = c18037xf8026662.f248625i.getText().toString().trim().length() > 0;
        zb4.a aVar = c18037xf8026662.S;
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isImageComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        boolean z27 = aVar.f552840e == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isImageComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        if (!z27) {
            zb4.a aVar2 = c18037xf8026662.S;
            aVar2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isEmoticonComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            boolean z28 = aVar2.f552840e == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isEmoticonComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
            if (!z28) {
                z17 = false;
                if (!z19 && !z17) {
                    z18 = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBtnEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return z18;
            }
        }
        z17 = true;
        if (!z19) {
            z18 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkBtnEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z18;
    }

    public void A() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestory", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "onDestory: ");
        this.H1 = null;
        if (this.f248634r != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "commentfooter release");
            this.f248634r.l();
            this.f248634r.a();
        }
        fl5.i iVar = this.f248625i;
        if (iVar != null) {
            iVar.mo81351x5cd39ffa();
        }
        bc4.d dVar = this.T;
        dVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroy", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCmtFooterImageLoader", "destroy");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = dVar.f100703a;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.z0.e(dVar.f100704b, null, 1, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroy", "com.tencent.mm.plugin.sns.ui.comment.emoticon.util.SnsCmtFooterImageLoader");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestory", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void B() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "onResume state: %d", java.lang.Integer.valueOf(this.f248640x));
        if (this.f248640x == 2) {
            postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC18041x1f48f242(this), 200L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void C(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSelectEmoticon", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "onSelectEmoticon >> mdt: %s", interfaceC4987x84e327cb.mo42933xb5885648());
        boolean e17 = this.S.e();
        this.S.g(1);
        zb4.a aVar = this.S;
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEmoji", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        aVar.f552836a = interfaceC4987x84e327cb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEmoji", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        this.S.h(new android.util.Size(0, 0));
        zb4.a aVar2 = this.S;
        aVar2.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        aVar2.f552838c = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setImage", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2.f252792a.k(this.L, this.R, this.S, e17);
        G();
        o(true);
        W();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC18041x1f48f242 runnableC18041x1f48f242 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC18041x1f48f242(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnableC18041x1f48f242, 200L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectEmoticon", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.D(java.lang.String):void");
    }

    public void E() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshAtBtnColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "refreshAtBtnColor");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.E;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f248623g;
        if (c17933xe8d1b226 != null && c17933xe8d1b226.m70394x2cf577f() && (this.f248628n instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352)) {
            java.lang.Boolean bool = (java.lang.Boolean) k84.e4.f386554d.b(a84.d0.c(this.E));
            if (bool == null || !bool.booleanValue()) {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f248628n).m82040x7541828(i65.a.d(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.am6));
            } else {
                ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f248628n).m82040x7541828(k84.d4.V.b(this.E));
            }
        } else {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f248628n).m82040x7541828(i65.a.d(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.am6));
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f248628n).m82037xa10c26f6(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshAtBtnColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void F() {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int m70710x25689b99 = m70710x25689b99();
        if (m70710x25689b99 <= 0) {
            m70710x25689b99 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "refreshBottomPanelHeight: %s", java.lang.Integer.valueOf(m70710x25689b99));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f248634r;
        if (abstractC19636xc6b37291 != null && (layoutParams = abstractC19636xc6b37291.getLayoutParams()) != null) {
            this.B = m70710x25689b99;
            layoutParams.height = m70710x25689b99;
            this.f248634r.setLayoutParams(layoutParams);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeRootDy", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            int i17 = this.B;
            int i18 = i17 - this.A;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "changeRootDy >> smileyPanelHeight: %d mKeyboardHeight: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.A));
            if (i18 > 0) {
                this.C = i18;
                U(false);
            } else {
                J(false);
                this.C = 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeRootDy", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void G() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshPostContentView", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "refreshPostContentView currentContentType: %d", java.lang.Integer.valueOf(this.S.a()));
        int a17 = this.S.a();
        if (a17 != 0) {
            bc4.d dVar = this.T;
            if (a17 == 1) {
                android.view.View view = this.K;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.P;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = this.M;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("loadEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb b17 = this.S.b();
                if (b17 != null) {
                    java.lang.String wi6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s6.class))).wi(b17);
                    if (com.p314xaae8f345.mm.vfs.w6.j(wi6)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "load emoji is exist: %s", b17.mo42933xb5885648());
                        dVar.b(this.Q, wi6);
                        this.S.h(dVar.a(wi6));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "load emoji is no exist to loadMd5: %s", b17.mo42933xb5885648());
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEmoticonThumbImageTask", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a aVar = new com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.a();
                        java.lang.String mo42933xb5885648 = b17.mo42933xb5885648();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mo42933xb5885648, "<set-?>");
                        aVar.f147575a = mo42933xb5885648;
                        aVar.f147576b = b17;
                        aVar.f147577c = new yz5.p() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$f
                            @Override // yz5.p
                            /* renamed from: invoke */
                            public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.f(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.this, (java.lang.String) obj, (java.lang.String) obj2);
                                return null;
                            }
                        };
                        aVar.f147578d = new yz5.l() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$g
                            @Override // yz5.l
                            /* renamed from: invoke */
                            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.g(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.this, (java.lang.String) obj);
                                return null;
                            }
                        };
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEmoticonThumbImageTask", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n4 n4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.n4) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.s6.class));
                        n4Var.getClass();
                        wr.j jVar = n4Var.f147939d;
                        jVar.getClass();
                        pm0.v.X(new wr.h(jVar, aVar));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("loadEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                this.N.setImageDrawable(null);
            } else if (a17 == 2) {
                android.view.View view4 = this.K;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = this.P;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view6 = this.M;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                dVar.b(this.N, this.S.c());
            }
        } else {
            android.view.View view7 = this.K;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "refreshPostContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.Q.setImageDrawable(null);
            this.N.setImageDrawable(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshPostContentView", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void H(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("replaceCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248639w = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("replaceCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void J(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetTransY", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f248641x0) {
            int translationY = (int) getTranslationY();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "resetTransY >> transY: %d, currentTransY: %d", java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(translationY));
            if (this.C != 0 && translationY != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "resetTransY >> needAni: %b", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    animate().translationY(0.0f).setDuration(200L).start();
                    if (this.W != null) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6068x7c9d1b1b c6068x7c9d1b1b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6068x7c9d1b1b();
                        android.view.View view = this.W;
                        am.aw awVar = c6068x7c9d1b1b.f136351g;
                        awVar.f87724a = view;
                        awVar.f87725b = this;
                        c6068x7c9d1b1b.e();
                    }
                } else {
                    setTranslationY(0.0f);
                }
            }
        } else if (this.C != 0) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
            int i17 = marginLayoutParams.bottomMargin;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "transToDy >> transY: %d, bottomMargin: %d", java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(i17));
            if (i17 != 0) {
                marginLayoutParams.bottomMargin = 0;
                setLayoutParams(marginLayoutParams);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetTransY", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049, al5.e0
    public void J2(boolean z17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z18 = this.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        super.J2(z17, i17);
        X(z17, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void K(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("selectImageActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "selectImageActivityResult >> resultCode: %d", java.lang.Integer.valueOf(i17));
        if (i17 == -1 && (stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List")) != null && !stringArrayListExtra.isEmpty()) {
            D(stringArrayListExtra.get(0));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("selectImageActivityResult", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void L() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendETListen", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        fl5.i iVar = this.f248625i;
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsCommentFooter", "send edittext is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendETListen", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            android.text.TextWatcher textWatcher = this.E1;
            iVar.mo81574xf214c377(textWatcher);
            this.f248625i.mo81552xeb238c3a(textWatcher);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendETListen", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
    }

    public void M() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDefaultEmojiPanelConfig", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248634r.mo75349x4a374107(false);
        this.f248634r.c();
        this.f248634r.p(false, false);
        this.f248634r.o(false, false);
        this.f248634r.mo75352xe9a5b5a2(false);
        this.f248634r.mo75328x6c4ebec7(null);
        this.f248645y1 = "";
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDefaultEmojiPanelConfig", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(java.util.List r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "setText"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsCommentFooter"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r6.A1 = r8
            r6.B1 = r7
            fl5.i r2 = r6.f248625i
            if (r2 == 0) goto L88
            zb4.a r2 = new zb4.a
            r2.<init>()
            r6.S = r2
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            java.lang.String r3 = ""
            if (r2 != 0) goto L48
            java.util.Iterator r2 = r7.iterator()
        L23:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r2.next()
            com.tencent.mm.plugin.sns.ui.t1 r4 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1) r4
            java.lang.String r5 = r4.f252026a
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L23
            r7.remove(r4)
            zb4.a r8 = r4.f252027b
            java.lang.String r8 = r8.d()
            if (r8 != 0) goto L43
            r8 = r3
        L43:
            zb4.a r2 = r4.f252027b
            r6.S = r2
            goto L49
        L48:
            r8 = r3
        L49:
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r2 != 0) goto L5a
            fl5.i r2 = r6.f248625i
            r2.mo81590x765074af(r3)
            fl5.i r2 = r6.f248625i
            r2.n(r8)
            goto L5f
        L5a:
            fl5.i r8 = r6.f248625i
            r8.mo81590x765074af(r3)
        L5f:
            r6.G()
            zb4.a r8 = r6.S
            boolean r8 = r8.f()
            if (r8 == 0) goto L77
            android.widget.Button r8 = r6.f248633q
            r2 = 0
            r8.setVisibility(r2)
            android.widget.Button r8 = r6.f248630p
            r2 = 8
            r8.setVisibility(r2)
        L77:
            boolean r8 = r6.C1
            if (r8 != 0) goto L85
            fl5.i r8 = r6.f248625i
            com.tencent.mm.plugin.sns.ui.xf r2 = new com.tencent.mm.plugin.sns.ui.xf
            r2.<init>(r6, r7)
            r8.mo81552xeb238c3a(r2)
        L85:
            r7 = 1
            r6.C1 = r7
        L88:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.N(java.util.List, java.lang.String):void");
    }

    public void O(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showAtBtn", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f248628n != null) {
            if (z17) {
                android.view.View view = this.f248627m;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f248628n.setVisibility(0);
                E();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SnsAdAtFriendRedDot", 0) == 1 && gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_SNS_AD_COMMENT_AT_RED_DOT_BOOLEAN_SYNC, true)) {
                    this.f248629o.setVisibility(0);
                } else {
                    this.f248629o.setVisibility(8);
                }
            } else {
                android.view.View view2 = this.f248627m;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "showAtBtn", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f248628n.setVisibility(8);
                this.f248629o.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showAtBtn", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void P() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "showInput: ");
        ((android.view.inputmethod.InputMethodManager) this.f248623g.getSystemService("input_method")).showSoftInput(this.f248625i.j(), 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void Q() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(hc1.i.f69827x24728b, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248634r.i();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext())) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isShowKeyboard", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            int j17 = com.p314xaae8f345.mm.ui.bk.j(getContext());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "is show key board %d, %d, %d", java.lang.Integer.valueOf(this.f248646z), java.lang.Integer.valueOf(this.f248643y), java.lang.Integer.valueOf(j17));
            int i17 = this.f248646z;
            boolean z17 = i17 > 0 && i17 < this.f248643y - j17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isShowKeyboard", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (z17) {
                m81273xb2a7481e().e(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.uf(this));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(hc1.i.f69827x24728b, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", hc1.i.f69827x24728b);
        q(true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.eg egVar = this.G1;
        if (egVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac.AnonymousClass35) egVar).a();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(hc1.i.f69827x24728b, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void R(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f248634r == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        this.f248647z1 = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "showState " + z17);
        if (z17) {
            if (this.f248640x == 0) {
                this.f248625i.k();
                P();
                q(false);
            } else {
                this.f248625i.k();
                u();
                Q();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        r(false, false);
        this.f248625i.clearFocus();
        p();
        this.f248624h.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
        u();
        requestLayout();
        S();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void S() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("smileyPanelPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f248634r;
        if (abstractC19636xc6b37291 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smileyPanelPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (this.f248632p1) {
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSmileyInitTabToCache", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (this.f248642x1 != null && !this.f248645y1.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "setSmileyInitTabToCache >> currentTab: %s", this.f248645y1);
                this.f248642x1.D("smiley_panel_tab", this.f248645y1);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSmileyInitTabToCache", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            abstractC19636xc6b37291.h();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("smileyPanelPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void T() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("switchToEditState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "switchToEditState currentState: %d", java.lang.Integer.valueOf(this.f248640x));
        U(true);
        if (!x()) {
            w();
        }
        this.f248625i.k();
        P();
        m70733xbe62a411(true);
        this.f248624h.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
        this.f248624h.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.axk));
        if (!x()) {
            this.f248640x = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("switchToEditState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void U(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("transToDy", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f248641x0) {
            int translationY = (int) getTranslationY();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "transToDy >> transY: %d, currentTransY: %d isTransing: %b", java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(translationY), java.lang.Boolean.valueOf(this.f248644y0));
            int i17 = this.C;
            if (i17 != 0 && ((translationY == 0 || translationY != i17) && !this.f248644y0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "transToDy >> needAni: %b", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    this.f248644y0 = true;
                    animate().translationY(this.C).setDuration(200L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nf(this)).start();
                    if (this.W != null) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6068x7c9d1b1b c6068x7c9d1b1b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6068x7c9d1b1b();
                        android.view.View view = this.W;
                        am.aw awVar = c6068x7c9d1b1b.f136351g;
                        awVar.f87724a = view;
                        awVar.f87725b = this;
                        c6068x7c9d1b1b.e();
                    }
                } else {
                    setTranslationY(this.C);
                }
            }
        } else if (this.C != 0) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
            int i18 = marginLayoutParams.bottomMargin;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "transToDy >> transY: %d, bottomMargin: %d", java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(i18));
            if (marginLayoutParams.bottomMargin == 0 || java.lang.Math.abs(i18) != this.C) {
                marginLayoutParams.bottomMargin = -this.C;
                setLayoutParams(marginLayoutParams);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("transToDy", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void V(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("unsetCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248639w = (~i17) & this.f248639w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("unsetCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void W() {
        java.util.List list;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCommentCache", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "update commentkey:" + this.A1);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.A1) && (list = this.B1) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1) it.next();
                if (this.A1.equals(t1Var.f252026a)) {
                    t1Var.f252027b.i(this.f248625i.getText().toString());
                    t1Var.f252028c = this.f248639w;
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1 t1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.t1();
                t1Var2.f252026a = this.A1;
                this.S.i(this.f248625i.getText().toString());
                t1Var2.f252027b = this.S;
                t1Var2.f252028c = this.f248639w;
                this.B1.add(t1Var2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCommentCache", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void X(boolean z17, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx zxVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateOnKeyBoardChange", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "updateOnKeyBoardChange: isKeyboardShow:%b, smiley state:%b, keyboardHeight:%d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(y()), java.lang.Integer.valueOf(i17));
        if (z17 && getVisibility() == 0 && (zxVar = this.H1) != null) {
            zxVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollUp", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            zxVar.f253258f = true;
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(zxVar.f253262j, 30L);
            zxVar.f253259g = 10;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimeLineScrollAnimation", "footerTop when up :" + zxVar.f253261i.getTop());
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            android.os.SystemClock.elapsedRealtime();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollUp", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        }
        fl5.i iVar = this.f248625i;
        if (iVar != null) {
            iVar.m(z17);
            if (z17 && i17 != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshSendEditTextMaxHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f248623g;
                int e17 = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
                gc4.c cVar = gc4.c.f351980a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshInputViewMaxHeightOnKeyboardShow", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                if (e17 < 0) {
                    str2 = "refreshSendEditTextMaxHeight";
                    str = "updateOnKeyBoardChange";
                    str3 = "MicroMsg.SnsCommentFooter";
                    a17 = gc4.c.a(cVar, context, i17, 0, 0, 0, 0, 0, 0, 252, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshInputViewMaxHeightOnKeyboardShow", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
                } else {
                    str2 = "refreshSendEditTextMaxHeight";
                    str = "updateOnKeyBoardChange";
                    str3 = "MicroMsg.SnsCommentFooter";
                    a17 = gc4.c.a(cVar, context, i17, e17, 0, 0, 0, 0, 0, 248, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshInputViewMaxHeightOnKeyboardShow", "com.tencent.mm.plugin.sns.ui.helper.SnsCommentFooterHeightProvider");
                }
                this.f248625i.mo81587x25bfb969(a17);
                if (x()) {
                    this.f248640x = 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "refreshSendEditTextMaxHeight maxHeight:%d", java.lang.Integer.valueOf(a17));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str2, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                U(false);
                if (this.A != i17 && i17 != 0) {
                    this.A = i17;
                    fp.w.m(getContext(), i17);
                    F();
                }
                r(z17, y());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        }
        str = "updateOnKeyBoardChange";
        if (this.A != i17) {
            this.A = i17;
            fp.w.m(getContext(), i17);
            F();
        }
        r(z17, y());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // p94.u0
    public void b(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceiveImeEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "onReceiveImeEmoji -> %s", interfaceC4987x84e327cb);
        C(interfaceC4987x84e327cb);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceiveImeEmoji", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // p94.u0
    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onReceiveImeImg", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "onReceiveImeImg -> %s", str);
        D(str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onReceiveImeImg", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: getCommentAtPrefix */
    public java.lang.String m70713x3417cdee() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        java.lang.String str = this.D;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return str;
    }

    /* renamed from: getCommentFlag */
    public int m70714x57316135() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i17 = this.f248639w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return i17;
    }

    /* renamed from: getCommentInfo */
    public r45.e86 m70715x5732c677() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        r45.e86 e86Var = this.f248638v;
        if (e86Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return e86Var;
        }
        r45.e86 e86Var2 = new r45.e86();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return e86Var2;
    }

    /* renamed from: getCurrBottom */
    public int m70716x71ad16f3() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrBottom", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i17 = this.f248646z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrBottom", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return i17;
    }

    public final void o(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1);
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
        loadAnimation.setDuration(150L);
        loadAnimation2.setDuration(150L);
        android.widget.Button button = this.f248630p;
        if (button == null || this.f248633q == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (z17) {
            if (button.getVisibility() == 8 || this.f248630p.getVisibility() == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return;
            }
            this.f248633q.startAnimation(loadAnimation);
            this.f248633q.setVisibility(0);
            this.f248630p.startAnimation(loadAnimation2);
            this.f248630p.setVisibility(8);
        } else {
            if (button.getVisibility() == 0 || this.f248630p.getVisibility() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                return;
            }
            this.f248630p.startAnimation(loadAnimation);
            this.f248630p.setVisibility(0);
            this.f248633q.startAnimation(loadAnimation2);
            this.f248633q.setVisibility(8);
        }
        this.f248633q.getParent().requestLayout();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canSend", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        super.onConfigurationChanged(configuration);
        if (this.f248634r != null) {
            F();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        super.onLayout(z17, i17, i18, i19, i27);
        int i28 = this.f248643y;
        if (i28 < i27) {
            i28 = i27;
        }
        this.f248643y = i28;
        this.f248646z = i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeSmileyPanelGone", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248634r.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSmileyPanelGone", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void q(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeSmileyPanelVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f248634r;
        if (abstractC19636xc6b37291 != null) {
            if (z17) {
                abstractC19636xc6b37291.setVisibility(0);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                boolean z18 = this.G;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableWindowSoftInputModeAdjustNothing", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (!z18) {
                    p();
                } else if (this.f248634r.getVisibility() == 8) {
                    this.f248634r.setVisibility(4);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "changeSmileyPanelVisibility: to %d", java.lang.Integer.valueOf(this.f248634r.getVisibility()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSmileyPanelVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void r(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkReadyInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (this.f248625i == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkReadyInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (!z17 && !z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "checkReadyInput: reset input");
            if (!(this.f248623g.getResources().getConfiguration().orientation == 2) && this.f248625i.j().hasFocus()) {
                t(false);
            }
            this.F = ta4.x0.f498384j.b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkReadyInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearComment", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248625i.mo81590x765074af("");
        this.f248625i.mo81584x764b0e09("");
        this.f248638v = null;
        this.f248639w = 0;
        this.f248640x = 0;
        this.S = new zb4.a();
        G();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearComment", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setAfterEditAction */
    public void m70717x5ad0531a(java.lang.Runnable runnable) {
        java.lang.String Ni;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAfterEditAction", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f248623g;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571034cr5, this);
        this.f248637u = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r2z);
        this.f248627m = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.scf);
        this.f248628n = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564356ow);
        this.f248629o = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564357ox);
        this.f248630p = (android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564369pa);
        this.f248633q = (android.widget.Button) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564363p4);
        this.f248636t = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.AbstractC18420xe54becbe) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564372pd);
        fl5.i iVar = (fl5.i) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564360p0);
        this.f248625i = iVar;
        iVar.d(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).cj());
        this.f248630p.setContentDescription(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9u));
        pc4.d dVar = pc4.d.f434943a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsEmojiPanelCustomTab", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_emoji_panel_tab_custom, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsEmojiPanelCustomTab", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        this.f248632p1 = fj6;
        this.f248642x1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("sns_comment_footer", gm0.j1.b().h(), 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248625i.b(((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.w1) ((su4.x0) i95.n0.c(su4.x0.class))).bj(), com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(abstractActivityC21394xb3d2c0cf), new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.of(this), null);
        this.f248625i.mo81552xeb238c3a(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.pf(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initSelectHelper", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        o(false);
        this.f248630p.setTextSize(0, i65.a.f(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30860x5b28f31.f561452iy) * i65.a.m(abstractActivityC21394xb3d2c0cf));
        this.f248633q.setTextSize(0, i65.a.f(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30860x5b28f31.f561452iy) * i65.a.m(abstractActivityC21394xb3d2c0cf));
        this.f248628n.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.yf(this));
        android.widget.ImageButton imageButton = (android.widget.ImageButton) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564368p9);
        this.f248624h = imageButton;
        imageButton.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zf(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.u3h);
        this.H = c22698xdfbd289f;
        c22698xdfbd289f.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.I1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.this;
                c18037xf8026662.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$init$0", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c18037xf8026662, array);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "sendImgBtn onClick");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("goAlbumUI", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                c18037xf8026662.v();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("max_select_count", 1);
                intent.putExtra("query_source_type", 4);
                intent.putExtra("is_from_sns_comment", true);
                intent.putExtra("query_media_type", 1);
                intent.putExtra("show_header_view", false);
                intent.addFlags(67108864);
                j45.l.n(c18037xf8026662.f248623g, "gallery", ".ui.GalleryEntryUI", intent, 26);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("goAlbumUI", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                yj0.a.h(c18037xf8026662, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$init$0", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        });
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2.f252792a;
        android.widget.ImageButton view = this.f248624h;
        boolean z17 = this.U;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCommonViewParam", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.HashMap hashMap = new java.util.HashMap();
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (r2Var.b(context) == 3) {
            Ni = z17 ? ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni() : ca4.z0.f121604d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Ni);
        } else {
            Ni = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Ni);
        }
        android.content.Context context2 = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        hashMap.put("sns_scene", java.lang.Integer.valueOf(r2Var.b(context2)));
        hashMap.put("sessionid_sns", Ni);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCommonViewParam", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
        this.V = hashMap;
        r2Var.d(this.f248624h, "sns_cmt_emo", hashMap);
        r2Var.d(this.H, "sns_cmt_album", this.V);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initPostContentLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.K = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v8k);
        this.L = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v8j);
        this.R = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v8b);
        this.P = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v8c);
        this.M = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v8e);
        this.N = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v8g);
        this.Q = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v8d);
        this.K.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC18046x1f48f247());
        this.R.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$j
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.I1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.this;
                c18037xf8026662.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$initPostContentLayout$4", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c18037xf8026662, array);
                zb4.a aVar = c18037xf8026662.S;
                aVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isImageComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                boolean z18 = aVar.f552840e == 2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isImageComment", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                if (z18 && c18037xf8026662.S.c() != null && c18037xf8026662.S.c().contains("cmt_temp_")) {
                    com.p314xaae8f345.mm.vfs.w6.h(c18037xf8026662.S.c());
                }
                c18037xf8026662.S.g(0);
                zb4.a aVar2 = c18037xf8026662.S;
                aVar2.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetMediaContent", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                aVar2.f552836a = null;
                aVar2.f552838c = null;
                aVar2.f552837b = new android.util.Size(0, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetMediaContent", "com.tencent.mm.plugin.sns.ui.comment.emoticon.data.SnsCmtPostContentData");
                c18037xf8026662.G();
                if (c18037xf8026662.f248625i.getText().toString().trim().isEmpty()) {
                    c18037xf8026662.o(false);
                }
                c18037xf8026662.W();
                yj0.a.h(c18037xf8026662, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$initPostContentLayout$4", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        });
        this.Q.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$k
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.I1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.this;
                c18037xf8026662.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$initPostContentLayout$5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c18037xf8026662, array);
                if (c18037xf8026662.S.a() == 1 && c18037xf8026662.S.b() != null) {
                    com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb b17 = c18037xf8026662.S.b();
                    int[] iArr = new int[2];
                    if (com.p314xaae8f345.mm.ui.bk.y()) {
                        c18037xf8026662.Q.getLocationOnScreen(iArr);
                    } else {
                        c18037xf8026662.Q.getLocationInWindow(iArr);
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("IntentKeyEmojiMd5", b17.mo42933xb5885648());
                    intent.putExtra("IntentKeyIEmojiInfo", b17);
                    int i17 = iArr[0];
                    int i18 = iArr[1];
                    intent.putExtra("IntentKeyThumbLocation", new android.graphics.Rect(i17, i18, c18037xf8026662.Q.getWidth() + i17, c18037xf8026662.Q.getHeight() + i18));
                    intent.setClass(c18037xf8026662.f248623g, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.ActivityC18417x2fbe3352.class);
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = c18037xf8026662.f248623g;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(abstractActivityC21394xb3d2c0cf2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "lambda$initPostContentLayout$5", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    abstractActivityC21394xb3d2c0cf2.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(abstractActivityC21394xb3d2c0cf2, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "lambda$initPostContentLayout$5", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    c18037xf8026662.v();
                }
                yj0.a.h(c18037xf8026662, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$initPostContentLayout$5", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        });
        this.N.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$b
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.I1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.this;
                c18037xf8026662.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$initPostContentLayout$6", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c18037xf8026662, array);
                int[] iArr = new int[2];
                if (com.p314xaae8f345.mm.ui.bk.y()) {
                    c18037xf8026662.N.getLocationOnScreen(iArr);
                } else {
                    c18037xf8026662.N.getLocationInWindow(iArr);
                }
                r45.jj4 jj4Var = new r45.jj4();
                jj4Var.f459388d = "sns_cmt_local_" + c18037xf8026662.S.c();
                java.lang.String c17 = c18037xf8026662.S.c();
                jj4Var.f459391g = c17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "click image path: %s", c17);
                new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.kj(c18037xf8026662.f248623g).b(c18037xf8026662.E.m70367x7525eefd(), jj4Var, c01.z1.r(), 0, -1L, iArr, c18037xf8026662.N.getWidth(), c18037xf8026662.N.getHeight());
                c18037xf8026662.v();
                yj0.a.h(c18037xf8026662, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$initPostContentLayout$6", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        });
        r2Var.c(this.L, "sns_cmt_bub", this.V);
        r2Var.c(this.R, "sns_cmt_bub_x", this.V);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initPostContentLayout", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248625i.mo81584x764b0e09(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jgp));
        this.f248625i.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ag(this));
        this.f248625i.a(new nl5.p() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$c
            @Override // nl5.p
            public final boolean a(java.lang.String str, android.os.Bundle bundle) {
                java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.I1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.this;
                c18037xf8026662.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$init$1", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                boolean z18 = false;
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canRevivedIMECommand", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    pc4.d dVar2 = pc4.d.f434943a;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                    android.view.inputmethod.InputMethodManager inputMethodManager = c18037xf8026662.f248626l1;
                    inputMethodManager.isActive();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                    boolean z19 = pc4.d.f434948f && c18037xf8026662.I && c18037xf8026662.f248622J && inputMethodManager.isActive();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canRevivedIMECommand", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    if (z19) {
                        z18 = ((i05.n) ((p94.t0) i95.n0.c(p94.t0.class))).Bi((android.view.View) c18037xf8026662.f248625i.mo61840xc52e48b(), c18037xf8026662, str, bundle);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$init$1", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$init$1", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsCommentFooter", e17, null, new java.lang.Object[0]);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$init$1", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                }
                return z18;
            }
        });
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a() == null) {
            this.f248634r = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.t5(abstractActivityC21394xb3d2c0cf);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(getContext());
            this.f248634r = wi6;
            wi6.mo75331xef640234(105);
            this.f248634r.mo75345x9e226965(6501);
            yb4.a aVar = yb4.a.f542230a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canSendEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            aVar.c();
            boolean z18 = yb4.a.f542231b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canSendEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            if (z18) {
                this.f248634r.mo75349x4a374107(true);
            }
            this.f248634r.setVisibility(8);
            this.f248635s = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7g);
            int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
            this.A = g17;
            this.B = g17;
            this.f248635s.addView(this.f248634r, -1, g17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "init: height %s, addView, Gone smileyPanel", java.lang.Integer.valueOf(this.A));
            if (((abstractActivityC21394xb3d2c0cf.getWindow().getDecorView().getSystemUiVisibility() & 512) != 0) && !com.p314xaae8f345.mm.ui.b4.c(abstractActivityC21394xb3d2c0cf)) {
                int c17 = i65.a.c(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.bl.c(abstractActivityC21394xb3d2c0cf));
                android.widget.LinearLayout linearLayout = this.f248635s;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), this.f248635s.getPaddingTop(), this.f248635s.getPaddingRight(), this.f248635s.getPaddingBottom() + c17);
            }
            this.f248634r.i();
            this.f248634r.mo75339x5e04422d(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bg(this));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAfterEditAction", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setAnitiomAdjust */
    public void m70718x969e961c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx zxVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAnitiomAdjust", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.H1 = zxVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAnitiomAdjust", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setCommentAtPrefix */
    public void m70719x6aee6762(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "setCommentAtPrefix: %s", str);
        this.D = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentAtPrefix", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setCommentFlag */
    public void m70720xed96d4a9(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248639w = i17 | this.f248639w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentFlag", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setCommentHint */
    public void m70721xed97b3c4(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentHint", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f248625i.mo81584x764b0e09("");
        } else if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(this.f248639w, 1)) {
            fl5.i iVar = this.f248625i;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f248623g;
            sb6.append(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j69));
            sb6.append(str);
            sb6.append(abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j8z, java.lang.Float.valueOf(this.f248625i.mo81572x40077844())));
            java.lang.String sb7 = sb6.toString();
            float mo81572x40077844 = this.f248625i.mo81572x40077844();
            ((ke0.e) xVar).getClass();
            iVar.mo81584x764b0e09(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, sb7, mo81572x40077844));
        } else {
            fl5.i iVar2 = this.f248625i;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = getContext();
            float mo81572x400778442 = this.f248625i.mo81572x40077844();
            ((ke0.e) xVar2).getClass();
            iVar2.mo81584x764b0e09(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, str, mo81572x400778442));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentHint", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setCommentInfo */
    public void m70722xed9839eb(r45.e86 e86Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248638v = e86Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCommentInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setEnlargeEmoticonSmileyHeight */
    public void m70723xf304222e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setEnlargeEmoticonSmileyHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248631p0 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setEnlargeEmoticonSmileyHeight", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setFeedEmojiCommentEnable */
    public void m70724xa2d6175c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setFeedEmojiCommentEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "setFeedEmojiCommentEnable:%s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setFeedEmojiCommentEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setIsFromMsgUIToDetailUI */
    public void m70725x9eea81f(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setIsFromMsgUIToDetailUI", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.U = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setIsFromMsgUIToDetailUI", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setModeClick */
    public void m70726xe1b25b63(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setModeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setModeClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setOnCommentSendImp */
    public void m70727xebdff806(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.dg dgVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnCommentSendImp", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248633q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.sf(this, dgVar));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnCommentSendImp", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setOnEditTouchListener */
    public void m70728x61b2348(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.cg cgVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnEditTouchListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.F1 = cgVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnEditTouchListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setOnSmileyShowListener */
    public void m70729x773433a3(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.eg egVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOnSmileyShowListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.G1 = egVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOnSmileyShowListener", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setOutsideScrollView */
    public void m70730x7c4d0255(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOutsideScrollView", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.W = view;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOutsideScrollView", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setSnsInfo */
    public void m70731x36d7a384(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.E = c17933xe8d1b226;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("refreshUIStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) this.f248624h;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f248623g;
        if (c22698xdfbd289f != null) {
            c22698xdfbd289f.m82034x7541828(i65.a.d(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        }
        android.view.View view = this.f248637u;
        if (view != null) {
            view.setBackgroundColor(i65.a.d(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748));
        }
        fl5.i iVar = this.f248625i;
        if (iVar != null && android.os.Build.VERSION.SDK_INT >= 29) {
            iVar.mo81592x372124a3(i65.a.i(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30861xcebc809e.afr));
        }
        this.f248644y0 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("refreshUIStyle", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (c17933xe8d1b226 != null) {
            java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.r2.f252792a;
            r2Var.l(this.f248624h, "sns_feed_id", t07);
            r2Var.l(this.H, "sns_feed_id", t07);
            r2Var.l(this.L, "sns_feed_id", t07);
            r2Var.l(this.R, "sns_feed_id", t07);
            ((java.util.HashMap) this.V).put("sns_feed_id", t07);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkEmoticonAndImageEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            yb4.a aVar = yb4.a.f542230a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canSendEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            aVar.c();
            boolean z17 = yb4.a.f542231b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canSendEmoticon", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            this.I = (!z17 || (c17933xe8d1b2263 = this.E) == null || c17933xe8d1b2263.m70377x3172ed()) ? false : true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("canSendCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            boolean z18 = yb4.a.f542233d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("canSendCmtImg", "com.tencent.mm.plugin.sns.ui.comment.emoticon.config.SnsCmtEmoticonConfig");
            this.f248622J = (!z18 || (c17933xe8d1b2262 = this.E) == null || c17933xe8d1b2262.m70377x3172ed()) ? false : true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeEmoticonAndImageEntrance", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (this.f248622J) {
                this.H.setVisibility(0);
            } else {
                this.H.setVisibility(8);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initEmoticonConfig", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            if (this.I) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (this.f248632p1 && this.f248634r != null) {
                    java.lang.String m70711xb96fbcfe = m70711xb96fbcfe();
                    this.f248645y1 = m70711xb96fbcfe;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "setSmileyInitTab >> currentTab: %s", m70711xb96fbcfe);
                    this.f248634r.mo75337x4687b087(this.f248645y1);
                    this.f248634r.mo75338xb079d938(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18042x1f48f243(this));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSmileyInitTab", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                this.f248634r.p(true, false);
                this.f248634r.mo75349x4a374107(true);
                this.f248634r.mo75348x625a7311(false);
                this.f248634r.mo75352xe9a5b5a2(true);
                this.f248634r.mo75328x6c4ebec7(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qf(this));
            } else {
                M();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initEmoticonConfig", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeEmoticonAndImageEntrance", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkEmoticonAndImageEnable", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeSmileyPanelParams", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            int m70710x25689b99 = m70710x25689b99();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "changeSmileyPanelParams >> panelTargetHeight: %d smileyPanelHeight: %d", java.lang.Integer.valueOf(m70710x25689b99), java.lang.Integer.valueOf(this.B));
            if (this.B != m70710x25689b99) {
                F();
            } else if (this.C != 0) {
                U(false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSmileyPanelParams", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            pc4.d dVar = pc4.d.f434943a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isSnsCommentSupportImeEmoji", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            if (!pc4.d.f434948f || c17933xe8d1b226.m70377x3172ed()) {
                android.os.Bundle mo81563xafeef997 = this.f248625i.mo81563xafeef997(true);
                mo81563xafeef997.putBoolean("if_support_wx_emoji", false);
                mo81563xafeef997.putBoolean("if_support_new_wxkb", false);
                mo81563xafeef997.putInt("wechat_scene", 6);
            } else {
                android.os.Bundle mo81563xafeef9972 = this.f248625i.mo81563xafeef997(true);
                mo81563xafeef9972.putBoolean("if_support_wx_emoji", true);
                mo81563xafeef9972.putBoolean("if_support_new_wxkb", true);
                mo81563xafeef9972.putInt("wechat_scene", 6);
                mo81563xafeef9972.putLong("if_support_file_ability", m70708xc2520caa());
                mo81563xafeef9972.putLong("if_support_identity_ability", m70709xf9411528());
                mo81563xafeef9972.putLong("wechat_support_ability", m70712x8159696c());
            }
        } else {
            M();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSnsInfo", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setText */
    public void m70732x765074af(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        fl5.i iVar = this.f248625i;
        if (iVar != null) {
            iVar.mo81590x765074af("");
            this.f248625i.n(str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setToSendTextColor */
    public void m70733xbe62a411(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setToSendTextColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "setToSendTextColor: enable=%b", java.lang.Boolean.valueOf(z17));
        fl5.i iVar = this.f248625i;
        if (iVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setToSendTextColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (z17) {
            iVar.mo81591x1c5c5ff4(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560944yi));
        } else {
            iVar.mo81591x1c5c5ff4(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
            t(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setToSendTextColor", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    /* renamed from: setUseTransAniToLargeFooter */
    public void m70734x6e1b04c2(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setUseTransAniToLargeFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248641x0 = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setUseTransAniToLargeFooter", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        this.f248640x = 0;
        boolean z17 = i17 == 0;
        R(z17);
        if (!z17) {
            this.W = null;
        }
        super.setVisibility(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setVisibility", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void t(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("focusEdt", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "focusEdt: %s, %s", java.lang.Boolean.valueOf(z17), this.f248625i);
        fl5.i iVar = this.f248625i;
        if (iVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("focusEdt", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            return;
        }
        if (z17) {
            iVar.k();
        } else {
            iVar.clearFocus();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("focusEdt", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "hideInput: ");
        this.f248623g.mo48674x36654fab();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideInput", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void v() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hidePanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$h
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.I1;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.this;
                c18037xf8026662.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$hidePanel$2", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (!c18037xf8026662.y()) {
                    c18037xf8026662.f248634r.setVisibility(4);
                }
                c18037xf8026662.u();
                c18037xf8026662.t(false);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                if (c18037xf8026662.f248634r != null) {
                    c18037xf8026662.S();
                }
                c18037xf8026662.f248625i.mo81355xb01dfb57();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                c18037xf8026662.f248640x = 2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$hidePanel$2", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(runnable, 200L, false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hidePanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public final void w() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        S();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.j(getContext())) {
            m81273xb2a7481e().f(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.vf(this));
        } else {
            q(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
    }

    public boolean x() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInPendingState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z17 = this.f248640x == 2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInPendingState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z17;
    }

    public boolean y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isInSmileState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z17 = this.f248640x == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isInSmileState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z17;
    }

    public boolean z() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isReplyingContentEmpty", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        boolean z17 = (this.f248625i.getText() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f248625i.getText().toString())) && this.S.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isReplyingContentEmpty", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        return z17;
    }
}
