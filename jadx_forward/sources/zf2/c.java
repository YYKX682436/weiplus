package zf2;

/* loaded from: classes3.dex */
public final class c extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf2.e f554162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f554163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ze2 f554164f;

    public c(zf2.e eVar, android.content.Context context, r45.ze2 ze2Var) {
        this.f554162d = eVar;
        this.f554163e = context;
        this.f554164f = ze2Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setCitySpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        zf2.e.n(this.f554162d, this.f554163e, this.f554164f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/LocationCommentConvert$setCitySpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f554163e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560582ak4));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
