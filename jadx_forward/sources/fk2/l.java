package fk2;

/* loaded from: classes2.dex */
public final class l extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f344954d;

    public l(yz5.l onSpanClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSpanClick, "onSpanClick");
        this.f344954d = onSpanClick;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemAskProduct$FinderLiveProductClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        this.f344954d.mo146xb9724478(widget);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemAskProduct$FinderLiveProductClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(android.graphics.Color.parseColor("#FFC300"));
        ds6.setUnderlineText(false);
    }
}
