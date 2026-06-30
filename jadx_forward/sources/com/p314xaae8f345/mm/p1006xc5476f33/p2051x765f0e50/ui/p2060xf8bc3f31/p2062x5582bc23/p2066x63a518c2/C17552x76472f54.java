package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2066x63a518c2;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/display/SettingSwitchHorizontalScreen;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.display.SettingSwitchHorizontalScreen */
/* loaded from: classes11.dex */
public final class C17552x76472f54 extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public boolean f243442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17552x76472f54(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243442h = android.preference.PreferenceManager.getDefaultSharedPreferences(m80379x76847179()).getBoolean("settings_landscape_mode", false);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Display_HorizontalScreen";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17520x367c6f93.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2066x63a518c2.C17548x8d3360bb.class);
    }

    @Override // s24.g, a24.a, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.p9z;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17520x367c6f93.class;
    }

    @Override // a24.i
    public int m7() {
        return 2;
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF243493h() {
        return new f24.a(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF243442h() {
        return this.f243442h;
    }
}
