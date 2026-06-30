package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingAdditionBottom;", "Ls24/b;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionBottom */
/* loaded from: classes.dex */
public final class C17510x3aecf297 extends s24.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17510x3aecf297(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_Bottom";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17512x6b00b84d.class);
    }

    @Override // s24.b, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class;
    }

    @Override // a24.i
    public int m7() {
        return 1;
    }

    @Override // s24.b
    public void x7(in5.s0 holder, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(i17);
        if (viewGroup != null && viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v3l) == null) {
            android.view.LayoutInflater.from(holder.f374654e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ens, viewGroup, true);
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v3v);
        if (textView != null) {
            textView.setOnClickListener(new d24.b(this, holder));
        }
        android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.v3w);
        if (textView2 != null) {
            textView2.setOnClickListener(new d24.c(this, holder));
        }
    }

    public final void y7(android.content.Context context, java.lang.String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f239681a.c();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_feedback", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
