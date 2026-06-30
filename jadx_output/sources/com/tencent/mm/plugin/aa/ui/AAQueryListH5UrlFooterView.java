package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes3.dex */
public class AAQueryListH5UrlFooterView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f72442d;

    public AAQueryListH5UrlFooterView(android.content.Context context) {
        super(context);
        a(context);
    }

    public final void a(android.content.Context context) {
        android.widget.TextView textView = (android.widget.TextView) com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f487872a9, (android.view.ViewGroup) this, true).findViewById(com.tencent.mm.R.id.f482310az);
        this.f72442d = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
    }

    public android.widget.TextView getBottomLinkTv() {
        return this.f72442d;
    }

    public AAQueryListH5UrlFooterView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public AAQueryListH5UrlFooterView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a(context);
    }
}
