package fk2;

/* loaded from: classes3.dex */
public final class g1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.h1 f344926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344928f;

    public g1(fk2.h1 h1Var, java.lang.String str, android.content.Context context) {
        this.f344926d = h1Var;
        this.f344927e = str;
        this.f344928f = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemJoinFansClub$getNickNameClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        this.f344926d.f526773a.c(this.f344927e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemJoinFansClub$getNickNameClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f344928f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
