package com.p314xaae8f345.mm.p2499xd05e7f95.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/recovery/ui/RecoveryToolsUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "recovery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.recovery.ui.RecoveryToolsUI */
/* loaded from: classes12.dex */
public final class ActivityC19821xb90ad83a extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f273719i = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f273720d = jz5.h.b(new c55.h(this));

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f273721e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f273722f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f273723g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f273724h;

    public final void O6() {
        android.widget.ProgressBar progressBar = this.f273722f;
        if (progressBar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveLogToDownloadDirProgressBar");
            throw null;
        }
        progressBar.setVisibility(0);
        nz5.b.a(false, false, null, "recovery-io", 0, new c55.l(this), 23, null);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25471xbddafb2a.f46213xdc85d7b2);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        ((android.widget.Button) findViewById(com.p314xaae8f345.p2922xd05e7f95.wx.R.id.f46194x908effec)).setOnClickListener(new c55.f((android.widget.ProgressBar) findViewById(com.p314xaae8f345.p2922xd05e7f95.wx.R.id.f46200x7072ae6e), this, (android.widget.TextView) findViewById(com.p314xaae8f345.p2922xd05e7f95.wx.R.id.f46204xcd024ccb), (android.widget.TextView) findViewById(com.p314xaae8f345.p2922xd05e7f95.wx.R.id.f46203xed10d60f)));
        android.view.View findViewById = findViewById(com.p314xaae8f345.p2922xd05e7f95.wx.R.id.f46196x6912c669);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f273721e = (android.widget.Button) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.p2922xd05e7f95.wx.R.id.f46201x2f79a7d7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f273722f = (android.widget.ProgressBar) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.p2922xd05e7f95.wx.R.id.f46207x37c63b22);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f273723g = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.p2922xd05e7f95.wx.R.id.f46206xcf7a40d8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f273724h = (android.widget.TextView) findViewById4;
        android.widget.Button button = this.f273721e;
        if (button != null) {
            button.setOnClickListener(new c55.g(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveLogToDownloadDirButton");
            throw null;
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (i17 != 1) {
            super.onRequestPermissionsResult(i17, permissions, grantResults);
            return;
        }
        java.lang.Integer M = kz5.z.M(grantResults);
        if (M != null && M.intValue() == 0) {
            O6();
            return;
        }
        android.widget.TextView textView = this.f273723g;
        if (textView != null) {
            textView.setText(getString(com.p314xaae8f345.p2922xd05e7f95.wx.R.C25472xcad56011.f46222x7d0d1290));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("saveLogToDownloadDirStatus");
            throw null;
        }
    }
}
