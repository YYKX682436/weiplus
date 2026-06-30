package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public abstract class KeyStepBaseActivity extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f84122d;

    public abstract int getLayoutId();

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.f487938c2);
        android.view.LayoutInflater.from(this).inflate(getLayoutId(), (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.cgi));
        this.f84122d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482546hc);
        findViewById(com.tencent.mm.R.id.actionbar_up_indicator_btn).setOnClickListener(new com.tencent.mm.plugin.appbrand.keylogger.q(this));
    }
}
