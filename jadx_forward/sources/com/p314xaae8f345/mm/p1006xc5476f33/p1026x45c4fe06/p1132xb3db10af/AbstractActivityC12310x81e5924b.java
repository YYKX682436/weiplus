package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.KeyStepBaseActivity */
/* loaded from: classes7.dex */
public abstract class AbstractActivityC12310x81e5924b extends com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f165655d;

    /* renamed from: getLayoutId */
    public abstract int mo51581x2ee31f5b();

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569471c2);
        android.view.LayoutInflater.from(this).inflate(mo51581x2ee31f5b(), (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.cgi));
        this.f165655d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f564079hc);
        findViewById(com.p314xaae8f345.mm.R.id.f78239x65c2f76a).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.q(this));
    }
}
