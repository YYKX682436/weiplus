package fk2;

/* loaded from: classes3.dex */
public final class u2 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.v2 f345026e;

    public u2(android.content.Context context, fk2.v2 v2Var) {
        this.f345025d = context;
        this.f345026e = v2Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemShopMsgAnchorTips$initSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        zl2.r4.f555483a.G(this.f345025d, this.f345026e.f345034m);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemShopMsgAnchorTips$initSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f345025d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
