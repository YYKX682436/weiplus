package fr2;

/* loaded from: classes2.dex */
public final class y extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.z f347305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f347307f;

    public y(fr2.z zVar, java.lang.String str, android.graphics.drawable.Drawable drawable) {
        this.f347305d = zVar;
        this.f347306e = str;
        this.f347307f = drawable;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeContentHeaderUIC$setSubTitleText$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        fr2.z zVar = this.f347305d;
        android.app.Activity m80379x76847179 = zVar.m80379x76847179();
        zVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetailClick jumpUrl: ");
        java.lang.String str = this.f347306e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveThemeContentH", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(m80379x76847179, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLiveThemeContentHeaderUIC$setSubTitleText$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        this.f347307f.setAlpha(127);
        ds6.setColor(this.f347305d.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560638q4));
        ds6.setUnderlineText(false);
    }
}
