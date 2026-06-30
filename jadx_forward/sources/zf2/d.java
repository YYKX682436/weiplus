package zf2;

/* loaded from: classes3.dex */
public final class d extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf2.e f554165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f554166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ze2 f554167f;

    public d(zf2.e eVar, android.content.Context context, r45.ze2 ze2Var) {
        this.f554165d = eVar;
        this.f554166e = context;
        this.f554167f = ze2Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setPoiIconSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        zf2.e.n(this.f554165d, this.f554166e, this.f554167f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setPoiIconSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
    }
}
