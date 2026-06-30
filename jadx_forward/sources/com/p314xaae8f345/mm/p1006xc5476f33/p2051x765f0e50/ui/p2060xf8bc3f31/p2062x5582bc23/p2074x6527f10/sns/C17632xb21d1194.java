package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.sns;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/other/sns/SettingSwitchAutoPlayVideo;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.other.sns.SettingSwitchAutoPlayVideo */
/* loaded from: classes.dex */
public final class C17632xb21d1194 extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public boolean f243506h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17632xb21d1194(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.TRUE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        this.f243506h = ((java.lang.Boolean) m17).booleanValue();
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Other_Plugin_AutoPlayVideo";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.C17602xa16f20c9.class, null);
    }

    @Override // s24.g, a24.a, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.p8b;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.C17602xa16f20c9.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF243505p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: p7 */
    public java.lang.Integer getF243482q() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.p8c);
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF243481p() {
        if (m158354x19263085().getIntent().getIntExtra("activity_caller_params", 0) == 1) {
            return false;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_autoplay, 0) == 1;
        java.lang.String m17 = wo.w0.m();
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = m17.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_sns_video_autoplay_disable_device, "", true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            if (Zi != null && r26.n0.B(Zi, lowerCase, false)) {
                z17 = false;
            }
        }
        return z17;
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF243494h() {
        return new n24.a(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF243506h() {
        return this.f243506h;
    }
}
