package com.tencent.mm.plugin.downloader_app.ui;

/* loaded from: classes8.dex */
public class NoTaskLayout extends android.widget.RelativeLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f97388d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView f97389e;

    public NoTaskLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f97388d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ha_);
        this.f97389e = (com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView) findViewById(com.tencent.mm.R.id.aua);
        l02.n.a(this.f97388d, "download_non_task");
    }

    public void setData(c02.g gVar) {
        this.f97389e.setData(gVar);
    }
}
