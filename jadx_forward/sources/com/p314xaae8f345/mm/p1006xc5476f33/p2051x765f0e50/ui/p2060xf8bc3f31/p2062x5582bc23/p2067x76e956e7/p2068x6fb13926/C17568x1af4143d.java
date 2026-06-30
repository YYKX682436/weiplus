package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/add_me_way/SettingSwitchFindQQ;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.add_me_way.SettingSwitchFindQQ */
/* loaded from: classes.dex */
public final class C17568x1af4143d extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f243466h;

    /* renamed from: i, reason: collision with root package name */
    public int f243467i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17568x1af4143d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243466h = new java.util.HashMap();
        this.f243467i = c01.z1.p();
        c01.z1.j();
        c01.z1.o();
    }

    public static final void A7(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17568x1af4143d c17568x1af4143d, boolean z17, int i17, int i18) {
        if (z17) {
            c17568x1af4143d.f243467i = i17 | c17568x1af4143d.f243467i;
        } else {
            c17568x1af4143d.f243467i = (~i17) & c17568x1af4143d.f243467i;
        }
        c17568x1af4143d.f243466h.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_AddMeWay_FindByQQ";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.C17559x3d659565.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.p2068x6fb13926.C17567x9927305f.class);
    }

    @Override // s24.g, a24.a, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.p7z;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2067x76e956e7.C17559x3d659565.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF243505p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF243481p() {
        java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(9, null);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.MeSetPrivacyAddByQQ.h() || num == null || num.intValue() == 0) {
            return false;
        }
        return (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) ? false : true;
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF243494h() {
        return new h24.g(this);
    }

    @Override // s24.g
    /* renamed from: y7 */
    public boolean getF243480n() {
        if ((c01.z1.p() & 8) != 0) {
            return !((c01.z1.p() & 16) != 0);
        }
        return true;
    }
}
