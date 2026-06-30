package com.tencent.mars.test;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/tencent/mars/test/NetworkWxPkgTest;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "Ljz5/f0;", "onCreate", "Landroid/widget/Switch;", "swWxpkgAll", "Landroid/widget/Switch;", "swWxpkgCgi", "Landroid/widget/EditText;", "etWxpkgCgiIds", "Landroid/widget/EditText;", "Landroid/widget/Button;", "btWxpkgSet", "Landroid/widget/Button;", "<init>", "()V", "Companion", "mmkernel_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class NetworkWxPkgTest extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    public static final java.lang.String DEFAULT_CGI_IDS = "252,763,302,850";
    public static final java.lang.String KEY_WXPKG_ALL_SWITCH = "wxpkg_test_all_switch";
    public static final java.lang.String KEY_WXPKG_CGI_IDS = "wxpkg_test_cgi_ids";
    public static final java.lang.String KEY_WXPKG_CGI_SWITCH = "wxpkg_test_cgi_switch";
    private android.widget.Button btWxpkgSet;
    private android.widget.EditText etWxpkgCgiIds;
    private android.widget.Switch swWxpkgAll;
    private android.widget.Switch swWxpkgCgi;

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.eqy);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.vb8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.swWxpkgAll = (android.widget.Switch) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.vb9);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.swWxpkgCgi = (android.widget.Switch) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.t8q);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.etWxpkgCgiIds = (android.widget.EditText) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.slm);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.btWxpkgSet = (android.widget.Button) findViewById4;
        final com.tencent.mm.sdk.platformtools.o4 L = com.tencent.mm.sdk.platformtools.o4.L();
        android.widget.Switch r07 = this.swWxpkgAll;
        if (r07 == null) {
            kotlin.jvm.internal.o.o("swWxpkgAll");
            throw null;
        }
        r07.setChecked(L.getBoolean(KEY_WXPKG_ALL_SWITCH, false));
        android.widget.Switch r08 = this.swWxpkgCgi;
        if (r08 == null) {
            kotlin.jvm.internal.o.o("swWxpkgCgi");
            throw null;
        }
        r08.setChecked(L.getBoolean(KEY_WXPKG_CGI_SWITCH, false));
        java.lang.String str = DEFAULT_CGI_IDS;
        java.lang.String u17 = L.u(KEY_WXPKG_CGI_IDS, DEFAULT_CGI_IDS);
        android.widget.EditText editText = this.etWxpkgCgiIds;
        if (editText == null) {
            kotlin.jvm.internal.o.o("etWxpkgCgiIds");
            throw null;
        }
        if (!(u17 == null || u17.length() == 0)) {
            kotlin.jvm.internal.o.d(u17);
            str = u17;
        }
        editText.setText(str);
        android.widget.Switch r09 = this.swWxpkgAll;
        if (r09 == null) {
            kotlin.jvm.internal.o.o("swWxpkgAll");
            throw null;
        }
        r09.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.tencent.mars.test.NetworkWxPkgTest$onCreate$1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
                kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
                com.tencent.mm.sdk.platformtools.o4.this.G(com.tencent.mars.test.NetworkWxPkgTest.KEY_WXPKG_ALL_SWITCH, z17);
            }
        });
        android.widget.Switch r010 = this.swWxpkgCgi;
        if (r010 == null) {
            kotlin.jvm.internal.o.o("swWxpkgCgi");
            throw null;
        }
        r010.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() { // from class: com.tencent.mars.test.NetworkWxPkgTest$onCreate$2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
                kotlin.jvm.internal.o.g(compoundButton, "<anonymous parameter 0>");
                com.tencent.mm.sdk.platformtools.o4.this.G(com.tencent.mars.test.NetworkWxPkgTest.KEY_WXPKG_CGI_SWITCH, z17);
            }
        });
        android.widget.Button button = this.btWxpkgSet;
        if (button != null) {
            button.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mars.test.NetworkWxPkgTest$onCreate$3
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    android.widget.EditText editText2;
                    editText2 = com.tencent.mars.test.NetworkWxPkgTest.this.etWxpkgCgiIds;
                    if (editText2 == null) {
                        kotlin.jvm.internal.o.o("etWxpkgCgiIds");
                        throw null;
                    }
                    L.D(com.tencent.mars.test.NetworkWxPkgTest.KEY_WXPKG_CGI_IDS, editText2.getText().toString());
                }
            });
        } else {
            kotlin.jvm.internal.o.o("btWxpkgSet");
            throw null;
        }
    }
}
