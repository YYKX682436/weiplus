package com.p314xaae8f345.p542x3306d5.p549x364492;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/tencent/mars/test/NetworkWxPkgTest;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "Ljz5/f0;", "onCreate", "Landroid/widget/Switch;", "swWxpkgAll", "Landroid/widget/Switch;", "swWxpkgCgi", "Landroid/widget/EditText;", "etWxpkgCgiIds", "Landroid/widget/EditText;", "Landroid/widget/Button;", "btWxpkgSet", "Landroid/widget/Button;", "<init>", "()V", "Companion", "mmkernel_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mars.test.NetworkWxPkgTest */
/* loaded from: classes13.dex */
public final class ActivityC4597x7d257bef extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: DEFAULT_CGI_IDS */
    public static final java.lang.String f19703x6959eba0 = "252,763,302,850";

    /* renamed from: KEY_WXPKG_ALL_SWITCH */
    public static final java.lang.String f19704xbb9d746 = "wxpkg_test_all_switch";

    /* renamed from: KEY_WXPKG_CGI_IDS */
    public static final java.lang.String f19705x4a63acaa = "wxpkg_test_cgi_ids";

    /* renamed from: KEY_WXPKG_CGI_SWITCH */
    public static final java.lang.String f19706xd75307e2 = "wxpkg_test_cgi_switch";
    private android.widget.Button btWxpkgSet;
    private android.widget.EditText etWxpkgCgiIds;
    private android.widget.Switch swWxpkgAll;
    private android.widget.Switch swWxpkgCgi;

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.eqy);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.vb8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.swWxpkgAll = (android.widget.Switch) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.vb9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.swWxpkgCgi = (android.widget.Switch) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.t8q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.etWxpkgCgiIds = (android.widget.EditText) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.slm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.btWxpkgSet = (android.widget.Button) findViewById4;
        final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        android.widget.Switch r07 = this.swWxpkgAll;
        if (r07 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("swWxpkgAll");
            throw null;
        }
        r07.setChecked(L.getBoolean(f19704xbb9d746, false));
        android.widget.Switch r08 = this.swWxpkgCgi;
        if (r08 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("swWxpkgCgi");
            throw null;
        }
        r08.setChecked(L.getBoolean(f19706xd75307e2, false));
        java.lang.String str = f19703x6959eba0;
        java.lang.String u17 = L.u(f19705x4a63acaa, f19703x6959eba0);
        android.widget.EditText editText = this.etWxpkgCgiIds;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("etWxpkgCgiIds");
            throw null;
        }
        if (!(u17 == null || u17.length() == 0)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
            str = u17;
        }
        editText.setText(str);
        android.widget.Switch r09 = this.swWxpkgAll;
        if (r09 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("swWxpkgAll");
            throw null;
        }
        r09.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.tencent.mars.test.NetworkWxPkgTest$onCreate$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compoundButton, "<anonymous parameter 0>");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.this.G(com.p314xaae8f345.p542x3306d5.p549x364492.ActivityC4597x7d257bef.f19704xbb9d746, z17);
            }
        });
        android.widget.Switch r010 = this.swWxpkgCgi;
        if (r010 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("swWxpkgCgi");
            throw null;
        }
        r010.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.tencent.mars.test.NetworkWxPkgTest$onCreate$2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compoundButton, "<anonymous parameter 0>");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.this.G(com.p314xaae8f345.p542x3306d5.p549x364492.ActivityC4597x7d257bef.f19706xd75307e2, z17);
            }
        });
        android.widget.Button button = this.btWxpkgSet;
        if (button != null) {
            button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mars.test.NetworkWxPkgTest$onCreate$3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    android.widget.EditText editText2;
                    editText2 = com.p314xaae8f345.p542x3306d5.p549x364492.ActivityC4597x7d257bef.this.etWxpkgCgiIds;
                    if (editText2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("etWxpkgCgiIds");
                        throw null;
                    }
                    L.D(com.p314xaae8f345.p542x3306d5.p549x364492.ActivityC4597x7d257bef.f19705x4a63acaa, editText2.getText().toString());
                }
            });
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("btWxpkgSet");
            throw null;
        }
    }
}
