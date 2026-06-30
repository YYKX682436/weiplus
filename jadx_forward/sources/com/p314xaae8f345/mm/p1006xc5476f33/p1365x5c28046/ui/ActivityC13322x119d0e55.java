package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmoticonCustomCreateResultView;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView */
/* loaded from: classes9.dex */
public final class ActivityC13322x119d0e55 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: e, reason: collision with root package name */
    public boolean f179393e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f179395g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f179396h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 f179397i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f179398m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f179399n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f179400o;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f179392d = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179394f = "";

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dq_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo78530x8b45058f();
        java.lang.String stringExtra = getIntent().getStringExtra("md5");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f179392d = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("edie_session_id");
        this.f179394f = stringExtra2 != null ? stringExtra2 : "";
        this.f179393e = getIntent().getBooleanExtra("add_exceed_limit", false);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.rjc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f179397i = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.rjf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f179395g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.rjb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f179396h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.rje);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f179398m = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.rjd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f179399n = textView;
        if (this.f179393e) {
            textView.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f179396h;
            if (c22661xa3a2b3c0 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("doneBtn");
                throw null;
            }
            c22661xa3a2b3c0.setVisibility(8);
            android.widget.TextView textView2 = this.f179398m;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleView");
                throw null;
            }
            textView2.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cw7));
            android.widget.TextView textView3 = this.f179399n;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hintView");
                throw null;
            }
            textView3.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571235cx4));
            mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.u3(this), com.p314xaae8f345.mm.R.raw.f81444x633f39af);
        } else {
            android.widget.TextView textView4 = this.f179398m;
            if (textView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleView");
                throw null;
            }
            textView4.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.cvr));
            android.widget.TextView textView5 = this.f179399n;
            if (textView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("hintView");
                throw null;
            }
            textView5.setVisibility(8);
            m78560xe21cbbf(false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.f179396h;
        if (c22661xa3a2b3c02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("doneBtn");
            throw null;
        }
        c22661xa3a2b3c02.setEnabled(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c03 = this.f179395g;
        if (c22661xa3a2b3c03 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sendBtn");
            throw null;
        }
        c22661xa3a2b3c03.setEnabled(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c04 = this.f179396h;
        if (c22661xa3a2b3c04 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("doneBtn");
            throw null;
        }
        c22661xa3a2b3c04.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c05 = this.f179395g;
        if (c22661xa3a2b3c05 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sendBtn");
            throw null;
        }
        c22661xa3a2b3c05.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.w3(this));
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = this.f179397i;
        if (abstractC10447x8c9cf7d9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emojiView");
            throw null;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.s(abstractC10447x8c9cf7d9, 2);
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d92 = this.f179397i;
        if (abstractC10447x8c9cf7d92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emojiView");
            throw null;
        }
        abstractC10447x8c9cf7d92.m43715x36e51bc8(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x3(this));
        new hr.a(1, 0, kz5.b0.c(this.f179392d), null, null, 26, null).l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.y3(this));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AddEmojFeedbackEnsurePage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "AddEmojFeedbackEnsurePage");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 12, 10, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "editstickersessionid", this.f179394f);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "result", java.lang.Integer.valueOf(this.f179393e ? 1 : 0));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "emojmd5", this.f179392d);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c06 = this.f179396h;
        if (c22661xa3a2b3c06 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("doneBtn");
            throw null;
        }
        ((cy1.a) rVar).Tj(c22661xa3a2b3c06, 8, 10, false);
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c07 = this.f179396h;
        if (c22661xa3a2b3c07 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("doneBtn");
            throw null;
        }
        ((cy1.a) rVar2).pk(c22661xa3a2b3c07, "emojfeedback_finsh");
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c08 = this.f179395g;
        if (c22661xa3a2b3c08 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sendBtn");
            throw null;
        }
        ((cy1.a) rVar3).Tj(c22661xa3a2b3c08, 8, 10, false);
        dy1.r rVar4 = (dy1.r) i95.n0.c(dy1.r.class);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c09 = this.f179395g;
        if (c22661xa3a2b3c09 != null) {
            ((cy1.a) rVar4).pk(c22661xa3a2b3c09, "emojfeedback_forward");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sendBtn");
            throw null;
        }
    }
}
