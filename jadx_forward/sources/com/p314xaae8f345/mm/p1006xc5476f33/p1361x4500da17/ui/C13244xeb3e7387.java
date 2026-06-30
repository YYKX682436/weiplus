package com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView */
/* loaded from: classes8.dex */
public class C13244xeb3e7387 extends android.widget.FrameLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f178918d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f178919e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 f178920f;

    public C13244xeb3e7387(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f178918d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ot7);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ot6);
        this.f178919e = textView;
        textView.setOnClickListener(new r02.x(this));
    }

    /* renamed from: setData */
    public void m54715x76491f2c(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var) {
        this.f178920f = r0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.f178855k)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f178918d.setMaxLines(2);
        this.f178919e.setVisibility(8);
        this.f178918d.setText(this.f178920f.f178855k);
        this.f178918d.post(new r02.y(this));
    }
}
