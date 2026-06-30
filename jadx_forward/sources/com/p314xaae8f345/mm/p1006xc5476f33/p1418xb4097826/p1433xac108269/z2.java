package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes3.dex */
public final class z2 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f184278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f184279e;

    public z2(boolean z17, android.content.Context context) {
        this.f184278d = z17;
        this.f184279e = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/assist/FinderGameLiveUtil$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3 b3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.b3.f183555a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveUtil", "license click");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f184278d ? "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_mini_game_agreement&lang=zh_CN" : "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_game_agreement&lang=zh_CN");
        j45.l.j(widget.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/assist/FinderGameLiveUtil$getLicenseTxt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f184279e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560533n4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
