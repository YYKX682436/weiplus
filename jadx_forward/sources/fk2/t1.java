package fk2;

/* loaded from: classes3.dex */
public final class t1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.u1 f345014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f345015e;

    public t1(fk2.u1 u1Var, android.content.Context context) {
        this.f345014d = u1Var;
        this.f345015e = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalSetManager$onBindSetManagerInfo$2$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        this.f345014d.f526773a.k(this.f345015e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemLocalSetManager$onBindSetManagerInfo$2$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f345015e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
