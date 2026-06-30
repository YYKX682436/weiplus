package fk2;

/* loaded from: classes3.dex */
public final class y extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f345049d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345051f;

    public y(fk2.g0 g0Var, java.lang.String str, java.lang.String str2) {
        this.f345049d = g0Var;
        this.f345050e = str;
        this.f345051f = str2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$asyncLoadGiftImgSpan$1$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        this.f345049d.f526773a.n(this.f345050e, this.f345051f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemComboLiveReward$asyncLoadGiftImgSpan$1$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
    }
}
