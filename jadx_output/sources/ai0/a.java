package ai0;

/* loaded from: classes4.dex */
public final class a extends android.text.style.ClickableSpan implements zh0.c {

    /* renamed from: d, reason: collision with root package name */
    public final int f5039d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5040e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5041f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnClickListener f5042g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5043h;

    public a(int i17, int i18, boolean z17, android.view.View.OnClickListener onClick) {
        kotlin.jvm.internal.o.g(onClick, "onClick");
        this.f5039d = i17;
        this.f5040e = i18;
        this.f5041f = z17;
        this.f5042g = onClick;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/widget/ColoredClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        this.f5042g.onClick(widget);
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/widget/ColoredClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f5039d);
        ds6.setUnderlineText(this.f5041f);
        ds6.bgColor = this.f5043h ? this.f5040e : 0;
    }
}
