package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationConfirmUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.colive.FinderLiveCoLiveInvitationConfirmUI */
/* loaded from: classes3.dex */
public final class ActivityC14183x9ab478f1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f193063t = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f193064d;

    /* renamed from: h, reason: collision with root package name */
    public int f193068h;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f193070m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f193071n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f193072o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f193073p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f193074q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f193075r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f193076s;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f193065e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f193066f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f193067g = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f193069i = "";

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationConfirmUI", "onAcceptInvitation: invitationId=" + activityC14183x9ab478f1.f193064d + ", initiator=" + activityC14183x9ab478f1.f193067g);
        activityC14183x9ab478f1.f193076s = true;
        az2.f a17 = az2.c.a(az2.f.f97658d, activityC14183x9ab478f1, null, 0L, null, 8, null);
        a17.a();
        long j17 = activityC14183x9ab478f1.f193064d;
        java.lang.String str = activityC14183x9ab478f1.f193067g;
        re2.o0 o0Var = new re2.o0(activityC14183x9ab478f1, a17);
        re2.q0 q0Var = new re2.q0(activityC14183x9ab478f1, a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveRequestHelper", "acceptInvitation: invitationId=" + j17 + ", initiator=" + str);
        new ek2.q(j17, 1, null, str, new re2.z0(j17, o0Var, q0Var)).l();
    }

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14183x9ab478f1 activityC14183x9ab478f1, int i17, java.lang.String str, int i18, java.lang.String str2) {
        activityC14183x9ab478f1.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationConfirmUI", "pushErrorUI: errCode=" + i17 + ", userFlag=" + i18 + ", spamJumpUrl=" + str2);
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14184xa1edf579.f193077n;
        android.content.Intent intent = new android.content.Intent(activityC14183x9ab478f1, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14184xa1edf579.class);
        if (str == null) {
            str = "";
        }
        intent.putExtra("co_live_error_desc", str);
        intent.putExtra("co_live_error_code", i17);
        intent.putExtra("co_live_use_close_icon", false);
        intent.putExtra("co_live_user_flag", i18);
        if (!(str2 == null || str2.length() == 0)) {
            intent.putExtra("co_live_spam_jump_url", str2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationErrorUI", "startForResult: errorCode=" + i17 + ", userFlag=" + i18 + ", spamJumpUrl=" + str2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(32273);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activityC14183x9ab478f1, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationErrorUI$Companion", "startForResult", "(Landroid/app/Activity;ILjava/lang/String;IILjava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9l;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 32273) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationConfirmUI", "onActivityResult: errorUI returned, resultCode=" + i18);
        if (i18 != -1) {
            finish();
            return;
        }
        android.view.View view = this.f193074q;
        if (view != null) {
            view.post(new re2.r0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("acceptBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f193064d = getIntent().getLongExtra("co_live_invitation_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("co_live_initiator_nickname");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f193065e = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("co_live_initiator_head_url");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f193066f = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("co_live_initiator_username");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f193067g = stringExtra3;
        this.f193068h = getIntent().getIntExtra("co_live_settlement_mode", 0);
        java.lang.String stringExtra4 = getIntent().getStringExtra("co_live_finder_username");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f193069i = stringExtra4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationConfirmUI", "initData: invitationId=" + this.f193064d + ", initiatorNickname=" + this.f193065e + ", initiatorHeadUrl=" + this.f193066f + ", initiatorUsername=" + this.f193067g + ", settlementMode=" + this.f193068h + ", finderUsername=" + this.f193069i);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        mo78530x8b45058f();
        mo74406x9c8c0d33(new re2.k0(this), com.p314xaae8f345.mm.R.raw.f79682xb9dc343d);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.stb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f193070m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.stl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f193071n = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.stp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.stg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f193072o = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.sto);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f193073p = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.sta);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f193074q = findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.std);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f193075r = findViewById7;
        findViewById7.setOnClickListener(new re2.l0(this));
        android.view.View view = this.f193074q;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("acceptBtn");
            throw null;
        }
        view.setOnClickListener(new re2.m0(this));
        if (this.f193066f.length() > 0) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            mn2.q3 q3Var = new mn2.q3(this.f193066f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
            android.widget.ImageView imageView = this.f193070m;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarIv");
                throw null;
            }
            a17.c(q3Var, imageView, g1Var.h(mn2.f1.f411495p));
        }
        android.widget.TextView textView = this.f193071n;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nicknameTv");
            throw null;
        }
        textView.setText(this.f193065e);
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.onj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ong) + ' ' + string;
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        int L = r26.n0.L(str, string, 0, false, 6, null);
        if (L >= 0 && string.length() + L <= str.length()) {
            spannableString.setSpan(new re2.j0(this), L, string.length() + L, 33);
        }
        android.widget.TextView textView2 = this.f193072o;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
            throw null;
        }
        textView2.setText(spannableString);
        android.widget.TextView textView3 = this.f193072o;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
            throw null;
        }
        textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        int i17 = this.f193068h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d80 d80Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.d80.f199620e;
        java.lang.String string2 = i17 == 1 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.onk) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.onl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
        android.widget.TextView textView4 = this.f193073p;
        if (textView4 != null) {
            textView4.setText(string2);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("settlementTv");
            throw null;
        }
    }
}
