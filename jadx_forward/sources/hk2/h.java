package hk2;

/* loaded from: classes3.dex */
public final class h extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we2.a f363433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363435f;

    public h(java.lang.String str, we2.a aVar, java.lang.String str2) {
        this.f363434e = str;
        this.f363433d = aVar;
        this.f363435f = str2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemGift$fillItem$userMessage$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.h5 h5Var = ml2.h5.f409075z;
        java.lang.String str = this.f363434e;
        r0Var.Wj(h5Var, str, 0);
        this.f363433d.n(str, this.f363435f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemGift$fillItem$userMessage$2$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
