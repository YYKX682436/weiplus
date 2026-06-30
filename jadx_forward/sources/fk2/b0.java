package fk2;

/* loaded from: classes3.dex */
public final class b0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f344845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f344848g;

    public b0(java.lang.String str, fk2.g0 g0Var, java.lang.String str2, android.content.Context context) {
        this.f344846e = str;
        this.f344845d = g0Var;
        this.f344847f = str2;
        this.f344848g = context;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$configContentPrefixGiftStyleSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.h5 h5Var = ml2.h5.f409075z;
        java.lang.String str = this.f344846e;
        r0Var.Wj(h5Var, str, 0);
        this.f344845d.f526773a.n(str, this.f344847f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$configContentPrefixGiftStyleSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f344848g.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
