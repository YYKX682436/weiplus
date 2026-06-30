package fk2;

/* loaded from: classes3.dex */
public final class d0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f344874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344876f;

    public d0(fk2.g0 g0Var, java.lang.String str, android.content.Context context) {
        this.f344874d = g0Var;
        this.f344875e = str;
        this.f344876f = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$getNickNameClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        this.f344874d.f526773a.c(this.f344875e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$getNickNameClickableSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f344876f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
