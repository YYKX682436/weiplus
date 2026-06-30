package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingGroupHelpItem;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupHelpItem */
/* loaded from: classes.dex */
public final class C17522x58fbb943 extends s24.a {

    /* renamed from: p, reason: collision with root package name */
    public final int f243417p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17522x58fbb943(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243417p = com.p314xaae8f345.mm.R.C30867xcad56011.p9v;
    }

    @Override // s24.f
    public void G7(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (c01.e2.a0()) {
            java.lang.String string = (com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273981k || !(com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_CN") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_HK") || com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d().equals("zh_TW"))) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8h) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            intent.putExtra("showShare", false);
            intent.putExtra("rawUrl", string);
            intent.putExtra("show_feedback", false);
            intent.putExtra("KShowFixToolsBtn", true);
            return;
        }
        com.p314xaae8f345.mm.app.j3.b();
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575221la4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", string2);
        intent.putExtra("show_feedback", false);
        intent.putExtra("KShowFixToolsBtn", true);
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.tools.WebViewUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return "webview";
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return java.lang.Integer.valueOf(this.f243417p);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Help";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.C17601x3fb17a42.class);
    }

    @Override // s24.a, s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f574572ir3;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF243505p() {
        return 1;
    }
}
