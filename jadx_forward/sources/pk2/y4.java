package pk2;

/* loaded from: classes3.dex */
public final class y4 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.z4 f437928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437929e;

    public y4(pk2.z4 z4Var, android.content.Context context) {
        this.f437928d = z4Var;
        this.f437929e = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AssistantAskProductionOption$initSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f437928d.f437956i, "click link");
        i95.m c17 = i95.n0.c(zg0.u2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) zg0.u2.K2((zg0.u2) c17, this.f437929e, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/ADF5pXCh5YWMlSlo", null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1(0.0f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388591, null), 4, null)).show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AssistantAskProductionOption$initSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f437929e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
