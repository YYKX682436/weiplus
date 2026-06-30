package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/notify/SettingSwitchNotifyInvite;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.notify.SettingSwitchNotifyInvite */
/* loaded from: classes11.dex */
public final class C17589x51b26b56 extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f243487h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f243488i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17589x51b26b56(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243487h = m158359x1e885992().getStringExtra("HighLightCheckBoxPreference") != null;
        this.f243488i = ip.b.t();
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Notify_Invite";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17525x3c71a258.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2071xc2079749.C17590x59bbde0e.class);
    }

    @Override // s24.g, a24.a, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.ohl;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17525x3c71a258.class;
    }

    @Override // a24.i
    public int m7() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        this.f243488i = ip.b.t();
    }

    @Override // s24.g
    public al5.c2 x7() {
        return new k24.g(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF243488i() {
        return this.f243488i;
    }
}
