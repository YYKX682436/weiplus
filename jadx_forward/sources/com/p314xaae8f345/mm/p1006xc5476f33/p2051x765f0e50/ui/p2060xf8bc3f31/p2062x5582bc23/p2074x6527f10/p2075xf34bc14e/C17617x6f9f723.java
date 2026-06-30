package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.p2075xf34bc14e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/other/accessibility/SettingActivityItemPluginLinkedIn;", "Ls24/a;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.other.accessibility.SettingActivityItemPluginLinkedIn */
/* loaded from: classes.dex */
public final class C17617x6f9f723 extends s24.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17617x6f9f723(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // s24.f
    public java.lang.String C7() {
        return "linkedinplugin";
    }

    @Override // s24.f
    public void G7(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        super.G7(context, intent);
        intent.putExtra("Contact_User", "linkedinplugin");
    }

    @Override // s24.a
    public java.lang.String L7() {
        return ".ui.ContactInfoUI";
    }

    @Override // s24.a
    public java.lang.String M7() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Other_Accessibility_LinkedIn";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.C17598xcecb1f12.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.p2075xf34bc14e.C17627x3a92c225.class);
    }

    @Override // a24.i
    public java.lang.String c7() {
        java.lang.String f27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("linkedinplugin", true).f2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f27, "getDisplayNick(...)");
        return f27;
    }

    @Override // s24.a, s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return -1;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2074x6527f10.C17598xcecb1f12.class;
    }

    @Override // a24.i
    public int m7() {
        return 3;
    }

    @Override // a24.i
    public boolean q7() {
        java.lang.String d17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LinkedinPluginClose");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(d17, 0) != 0) {
            return false;
        }
        boolean z17 = (c01.z1.n() & com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb) == 0;
        java.lang.Object l17 = gm0.j1.u().c().l(286721, null);
        return z17 && (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17 instanceof java.lang.String ? (java.lang.String) l17 : null) ^ true);
    }
}
