package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/privacy_permission/SettingAdditionBottomPrivacy;", "Ls24/b;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.privacy_permission.SettingAdditionBottomPrivacy */
/* loaded from: classes.dex */
public final class C17653x564a00f1 extends s24.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17653x564a00f1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final void y7(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17653x564a00f1 c17653x564a00f1, java.lang.String str) {
        c17653x564a00f1.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        j45.l.j(c17653x564a00f1.m80379x76847179(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_PrivacyPermission_BottomPrivacy";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17528x9ac1c108.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2077x721ef2e6.C17652xbbf83a6.class);
    }

    @Override // s24.b, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17528x9ac1c108.class;
    }

    @Override // a24.i
    public int m7() {
        return 2;
    }

    @Override // s24.b
    public void x7(in5.s0 holder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
        h0Var.f391656d = obj;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            h0Var.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.e();
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) h0Var.f391656d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.x0((java.lang.String) h0Var.f391656d)) {
            h0Var.f391656d = "";
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(i17);
        if (viewGroup != null && viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v3l) == null) {
            android.view.LayoutInflater.from(holder.f374654e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ent, viewGroup, true);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568408mq5);
        if (textView != null) {
            textView.setOnClickListener(new p24.c(this, h0Var));
        }
        if (r26.i0.p((java.lang.String) h0Var.f391656d, "cn", true)) {
            ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568408mq5)).setVisibility(0);
        } else {
            ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568408mq5)).setVisibility(8);
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568407mq4);
        if (textView2 != null) {
            textView2.setOnClickListener(new p24.d(this, h0Var));
        }
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        itemView.setMinimumHeight(0);
        itemView.getLayoutParams().height = -2;
        itemView.post(new p24.e(itemView, i18));
    }
}
