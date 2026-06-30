package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class z2 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f102745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102746e;

    public z2(boolean z17, android.content.Context context) {
        this.f102745d = z17;
        this.f102746e = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/assist/FinderGameLiveUtil$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.plugin.finder.assist.b3 b3Var = com.tencent.mm.plugin.finder.assist.b3.f102022a;
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveUtil", "license click");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f102745d ? "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_mini_game_agreement&lang=zh_CN" : "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_game_agreement&lang=zh_CN");
        j45.l.j(widget.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/assist/FinderGameLiveUtil$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f102746e.getResources().getColor(com.tencent.mm.R.color.f479000n4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
