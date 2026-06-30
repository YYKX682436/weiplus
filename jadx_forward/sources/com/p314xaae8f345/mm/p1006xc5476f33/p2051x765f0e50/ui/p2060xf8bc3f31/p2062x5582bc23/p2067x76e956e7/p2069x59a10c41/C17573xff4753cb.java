package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2069x59a10c41;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingActivityItemTimelineRecentShow;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingActivityItemTimelineRecentShow */
/* loaded from: classes4.dex */
public final class C17573xff4753cb extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public boolean f243471p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f243472q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f243473r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f243474s;

    /* renamed from: t, reason: collision with root package name */
    public int f243475t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f243476u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17573xff4753cb(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243475t = 0;
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        this.f243476u = r17;
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.SnsTagPartlyUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "sns";
    }

    public final void N7(android.widget.LinearLayout linearLayout, int i17, int i18, boolean z17, android.view.View.OnClickListener onClickListener) {
        android.view.View inflate = android.view.View.inflate(m80379x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.cbx, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) inflate;
        textView.setText(i17);
        textView.setTag(java.lang.Integer.valueOf(i18));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (!z17) {
            textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571376db));
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3, 0, 0, 0);
        textView.setContentDescription(((java.lang.Object) textView.getText()) + textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_));
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_PrivacySns_RecentShow";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.C17555x383b3782.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2069x59a10c41.C17574x8d741318.class);
    }

    @Override // s24.a, s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.pby;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.C17555x383b3782.class;
    }

    @Override // a24.i
    public int m7() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: n7 */
    public java.lang.String getF243411p() {
        r45.cb6 cb6Var = new r45.cb6();
        this.f243475t = m158359x1e885992().getIntExtra("enter_scene", 0);
        if (p94.w0.c() != null) {
            cb6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(this.f243476u);
        }
        if (cb6Var == null) {
            return m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bdo);
        }
        int i17 = cb6Var.f452964g;
        int i18 = cb6Var.f452965h;
        boolean z17 = i18 == 4320 && (i17 & 4096) > 0;
        this.f243471p = z17;
        boolean z18 = i18 == 72 && (i17 & 4096) > 0;
        this.f243472q = z18;
        boolean z19 = i18 == 720 && (i17 & 4096) > 0;
        this.f243474s = z19;
        this.f243473r = (i17 & 2048) > 0;
        return z17 ? m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bdp) : z18 ? m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bdr) : z19 ? m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bdq) : m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.bdo);
    }

    @Override // s24.a, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t7(m158354x19263085().getIntent());
        r45.cb6 cb6Var = new r45.cb6();
        p94.j0 c17 = p94.w0.c();
        java.lang.String str = this.f243476u;
        if (c17 != null) {
            cb6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(str);
        }
        if (cb6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingActivityItemTimelineRecentShow", "onClick, userinof is null, selfName:" + str);
            return;
        }
        boolean z17 = false;
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RECENT_RED_DOT_DID_SHOW_ID_INT;
        java.lang.Object m18 = c18.m(u3Var, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m18, "null cannot be cast to non-null type kotlin.Int");
        if (intValue > ((java.lang.Integer) m18).intValue()) {
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(intValue));
            s7();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.f293242a = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.bdn);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bxx, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.nua);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        android.view.View.OnClickListener bVar = new i24.b(linearLayout, this);
        N7(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.bdp, 1, this.f243471p, bVar);
        N7(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.bdq, 3, this.f243474s, bVar);
        N7(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.bdr, 0, this.f243472q, bVar);
        if (!this.f243471p && !this.f243472q && !this.f243474s) {
            z17 = true;
        }
        N7(linearLayout, com.p314xaae8f345.mm.R.C30867xcad56011.bdo, 2, z17, bVar);
        aVar.L = inflate;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        linearLayout.setTag(j0Var);
        j0Var.show();
    }
}
