package ai0;

/* loaded from: classes4.dex */
public final class a extends android.text.style.ClickableSpan implements zh0.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f86572d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86573e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86574f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnClickListener f86575g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86576h;

    public a(int i17, int i18, boolean z17, android.view.View.OnClickListener onClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onClick, "onClick");
        this.f86572d = i17;
        this.f86573e = i18;
        this.f86574f = z17;
        this.f86575g = onClick;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/widget/ColoredClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        this.f86575g.onClick(widget);
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/widget/ColoredClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        ds6.setColor(this.f86572d);
        ds6.setUnderlineText(this.f86574f);
        ds6.bgColor = this.f86576h ? this.f86573e : 0;
    }
}
