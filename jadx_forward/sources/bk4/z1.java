package bk4;

/* loaded from: classes9.dex */
public final class z1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.n1 f103178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f103179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f103180f;

    public z1(bk4.n1 n1Var, bk4.c2 c2Var, android.view.View.OnClickListener onClickListener) {
        this.f103178d = n1Var;
        this.f103179e = c2Var;
        this.f103180f = onClickListener;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$textWrapper$1$1$1$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        if (widget instanceof android.widget.TextView) {
            ((android.widget.TextView) widget).setHighlightColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(android.R.color.transparent));
        }
        this.f103180f.onClick(widget);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$textWrapper$1$1$1$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        int a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
        java.lang.Integer num = this.f103178d.f103051c;
        if (num != null) {
            a17 = num.intValue();
        } else {
            bk4.c2 c2Var = this.f103179e;
            android.content.res.Resources resources = c2Var.f102943a.getResources();
            android.content.res.Resources.Theme theme = c2Var.f102943a.getContext().getTheme();
            java.lang.ThreadLocal threadLocal = d3.q.f307641a;
            a17 = d3.m.a(resources, com.p314xaae8f345.mm.R.C30859x5a72f63.f77678x8113c22e, theme);
        }
        ds6.setColor(a17);
    }
}
