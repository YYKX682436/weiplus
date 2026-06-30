package bk4;

/* loaded from: classes9.dex */
public final class z1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.n1 f21645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f21646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f21647f;

    public z1(bk4.n1 n1Var, bk4.c2 c2Var, android.view.View.OnClickListener onClickListener) {
        this.f21645d = n1Var;
        this.f21646e = c2Var;
        this.f21647f = onClickListener;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$textWrapper$1$1$1$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        if (widget instanceof android.widget.TextView) {
            ((android.widget.TextView) widget).setHighlightColor(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(android.R.color.transparent));
        }
        this.f21647f.onClick(widget);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$textWrapper$1$1$1$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        int a17;
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
        java.lang.Integer num = this.f21645d.f21518c;
        if (num != null) {
            a17 = num.intValue();
        } else {
            bk4.c2 c2Var = this.f21646e;
            android.content.res.Resources resources = c2Var.f21410a.getResources();
            android.content.res.Resources.Theme theme = c2Var.f21410a.getContext().getTheme();
            java.lang.ThreadLocal threadLocal = d3.q.f226108a;
            a17 = d3.m.a(resources, com.tencent.mm.R.color.BW_100_Alpha_0_6, theme);
        }
        ds6.setColor(a17);
    }
}
