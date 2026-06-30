package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/SettingVoiceAssistantPermissionUI;", "Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.permission.SettingVoiceAssistantPermissionUI */
/* loaded from: classes.dex */
public final class ActivityC17499xf7256adf extends com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f242973f = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f242974e;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062
    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.enh;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062
    public int U6() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.phi;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062
    public int V6() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.phw;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf.AbstractActivityC17490x3b7be062, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcq);
        if (scrollView != null) {
            scrollView.post(new s14.g(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.moj);
        if (textView != null) {
            textView.setGravity(17);
            textView.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.phi));
        }
        this.f242974e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.btf);
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OVC_VOICE_ASSISTANT_SWITCH_INT_SYNC, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        boolean z17 = intValue == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceAssistantPermission", "onCreate: read switch value from ConfigStorage = " + intValue + " (0=NOT_SET, 1=ON, 2=OFF), isChecked = " + z17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.f242974e;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = this.f242974e;
        if (viewOnClickListenerC22631x1cc07cc82 != null) {
            viewOnClickListenerC22631x1cc07cc82.m81396xb3e0a10a(s14.h.f483682a);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = this.f242974e;
        if (viewOnClickListenerC22631x1cc07cc83 != null) {
            viewOnClickListenerC22631x1cc07cc83.m81396xb3e0a10a(new s14.i(this));
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f569141vo4);
        if (textView2 != null) {
            java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.phj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format("<a href='%s'>%s</a>", java.util.Arrays.copyOf(new java.lang.Object[]{"https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/HBS2pZuIGJqUG0cC", string}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            textView2.setText(format);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).oj(textView2, 1);
        }
    }
}
