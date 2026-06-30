package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.p2056xe125c5cf;

@db5.a(m123858x6ac9171 = 800)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/permission/BaseSettingPermissionUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lvj5/k;", "mStatusBarHeightCallback", "Lvj5/k;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.permission.BaseSettingPermissionUI */
/* loaded from: classes5.dex */
public abstract class AbstractActivityC17490x3b7be062 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f242970d = "BaseSettingPermissionUI";
    private vj5.k mStatusBarHeightCallback;

    public abstract int T6();

    public abstract int U6();

    public abstract int V6();

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ckn;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m78583x85ccfe01(8);
        mo55332x76847179().getWindow().addFlags(2097280);
        mo55332x76847179().getWindow().addFlags(67108864);
        mo55332x76847179().getWindow().clearFlags(67108864);
        mo55332x76847179().getWindow().getDecorView().setSystemUiVisibility(1792);
        mo55332x76847179().getWindow().addFlags(Integer.MIN_VALUE);
        mo55332x76847179().getWindow().setStatusBarColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo55332x76847179().getWindow().setNavigationBarColor(0);
        if (com.p314xaae8f345.mm.ui.b4.c(this)) {
            mo78514x143f1b92().W0(this, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            ul5.k m78511x9f88d943 = m78511x9f88d943();
            if (m78511x9f88d943 != null) {
                m78511x9f88d943.mo82165xac752035(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            }
        }
        mo55332x76847179().getWindow().setFormat(-3);
        mo55332x76847179().getWindow().setSoftInputMode(51);
        mo54450xbf7c1df6("");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564846aa1);
        if (findViewById != null) {
            findViewById.setOnClickListener(new s14.d(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        if (textView != null) {
            textView.setText(getString(V6()));
        }
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc)).getPaint(), 0.8f);
        if (!com.p314xaae8f345.mm.ui.b4.c(this)) {
            ((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.f568869oc0)).setPadding(0, com.p314xaae8f345.mm.ui.bl.h(mo55332x76847179()), 0, 0);
        }
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this).inflate(T6(), (android.view.ViewGroup) null);
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).getClass();
        java.util.HashMap hashMap = e85.i.f331852e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42328x90544e91(inflate, new s14.a(hashMap, this));
        ((android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcq)).addView(inflate);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.koc);
        if (textView2 != null) {
            textView2.setText(getString(V6()));
        }
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.koc)).getPaint(), 0.8f);
        m78605xc85f0ffa();
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.moj);
        if (textView3 != null) {
            textView3.setGravity(17);
            java.lang.String string = getString(U6());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ime);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            java.lang.String string3 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.imf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
            java.lang.String concat = string.concat(string2);
            int L = r26.n0.L(concat, string3, 0, false, 6, null);
            int length = string3.length() + L;
            if (L <= 0 || length >= concat.length()) {
                textView3.setText(concat);
            } else {
                android.text.SpannableString spannableString = new android.text.SpannableString(concat);
                spannableString.setSpan(new s14.b(this), L, length, 33);
                textView3.setText(spannableString);
                textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
        }
        android.widget.ScrollView scrollView = (android.widget.ScrollView) findViewById(com.p314xaae8f345.mm.R.id.mcq);
        if (scrollView != null) {
            scrollView.setOnScrollChangeListener(new s14.c(i65.a.b(mo55332x76847179(), 64), (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc)));
        }
        if (com.p314xaae8f345.mm.ui.b4.c(mo55332x76847179())) {
            new n3.m3(getWindow(), getWindow().getDecorView()).b(true);
        }
    }
}
