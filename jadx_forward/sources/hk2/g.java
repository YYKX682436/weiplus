package hk2;

/* loaded from: classes3.dex */
public final class g extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f363427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f363430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363431h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363432i;

    public g(gk2.e eVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4) {
        this.f363427d = eVar;
        this.f363428e = str;
        this.f363429f = str2;
        this.f363430g = i17;
        this.f363431h = str3;
        this.f363432i = str4;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemGift$fillItem$userMessage$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        gk2.e eVar = this.f363427d;
        boolean z17 = ((mm2.m6) eVar.a(mm2.m6.class)).f410781p;
        fk2.x xVar = fk2.g0.f344923m;
        dk2.ef efVar = dk2.ef.f314905a;
        xVar.a(dk2.ef.f314917g, this.f363428e, this.f363429f, this.f363430g, z17);
        ((mm2.m6) eVar.a(mm2.m6.class)).f410777i.mo7808x76db6cb1(new mm2.j7(this.f363431h, this.f363432i));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/danmakuitem/DanmakuItemGift$fillItem$userMessage$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
