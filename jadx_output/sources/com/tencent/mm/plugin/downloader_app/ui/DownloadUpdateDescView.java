package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes8.dex */
public class DownloadUpdateDescView extends android.widget.FrameLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f97385d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f97386e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.model.r0 f97387f;

    public DownloadUpdateDescView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f97385d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ot7);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ot6);
        this.f97386e = textView;
        textView.setOnClickListener(new r02.x(this));
    }

    public void setData(com.tencent.mm.plugin.downloader_app.model.r0 r0Var) {
        this.f97387f = r0Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0Var.f97322k)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f97385d.setMaxLines(2);
        this.f97386e.setVisibility(8);
        this.f97385d.setText(this.f97387f.f97322k);
        this.f97385d.post(new r02.y(this));
    }
}
