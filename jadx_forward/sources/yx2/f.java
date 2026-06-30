package yx2;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f549375a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f549376b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f549377c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f549378d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f549379e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f549380f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f549381g;

    public f(android.widget.ImageView avatarView, android.widget.TextView authorNameView, android.widget.TextView finderDesc, android.widget.LinearLayout avatarFl, android.widget.FrameLayout jumpFinderViewFl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarView, "avatarView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorNameView, "authorNameView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderDesc, "finderDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarFl, "avatarFl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpFinderViewFl, "jumpFinderViewFl");
        this.f549375a = avatarView;
        this.f549376b = authorNameView;
        this.f549377c = finderDesc;
        this.f549378d = avatarFl;
        this.f549379e = jumpFinderViewFl;
        android.content.Context context = avatarView.getContext();
        this.f549380f = context;
        avatarFl.setOnClickListener(new yx2.a(this));
        jumpFinderViewFl.setOnClickListener(new yx2.b(this));
        jumpFinderViewFl.setContentDescription(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.j9w));
    }

    public final void a() {
        this.f549375a.setVisibility(4);
        this.f549376b.setVisibility(4);
        this.f549377c.setVisibility(4);
        this.f549378d.setVisibility(4);
    }

    public final void b() {
        android.content.Context context = this.f549380f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f549381g;
        intent.putExtra("feed_object_id", c19792x256d2725 != null ? java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()) : null);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f549381g;
        intent.putExtra("feed_object_nonceId", c19792x256d27252 != null ? c19792x256d27252.m76803x6c285d75() : null);
        intent.putExtra("key_need_related_list", false);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = this.f549381g;
        if (c19792x256d27253 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
            intent.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(n7Var.h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.j(n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d27253, 0), false, null, 4, null)), null, null));
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 25, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f542005a, context, intent, false, 4, null);
        ((ee0.r4) ((fe0.m4) i95.n0.c(fe0.m4.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doReportSnsCoverActionStruct", "com.tencent.mm.feature.sns.SnsReportHelperService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.f(4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReportSnsCoverActionStruct", "com.tencent.mm.feature.sns.SnsReportHelperService");
    }

    public final void c(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        java.lang.String m176700xe5e0d2a0;
        this.f549381g = c19792x256d2725;
        if (c19792x256d2725 != null) {
            this.f549379e.setVisibility(0);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
            ya2.b2 h17 = m76760x76845fea != null ? ya2.d.h(m76760x76845fea, null, false, 3, null) : null;
            this.f549376b.post(new yx2.c(c19792x256d2725, h17, this));
            this.f549377c.post(new yx2.d(this, c19792x256d2725));
            r45.f1 b17 = hc2.g0.b(c19792x256d2725);
            if (b17 == null || (m176700xe5e0d2a0 = b17.m75945x2fec8307(1)) == null) {
                m176700xe5e0d2a0 = h17 != null ? h17.m176700xe5e0d2a0() : "";
            }
            this.f549375a.post(new yx2.e(m176700xe5e0d2a0, this));
        }
    }
}
