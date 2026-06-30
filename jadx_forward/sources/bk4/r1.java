package bk4;

/* loaded from: classes9.dex */
public final class r1 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f103086d;

    public r1(bk4.c2 c2Var) {
        this.f103086d = c2Var;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$createExpandContent$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        if (widget instanceof android.widget.TextView) {
            ((android.widget.TextView) widget).setHighlightColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getColor(android.R.color.transparent));
        }
        android.view.View.OnClickListener onClickListener = this.f103086d.f102952j;
        if (onClickListener != null) {
            onClickListener.onClick(widget);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/util/TextViewSuffixWrapper$createExpandContent$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        bk4.c2 c2Var = this.f103086d;
        java.lang.Integer num = c2Var.f102951i;
        if (num != null) {
            num.intValue();
            android.content.res.Resources resources = c2Var.f102943a.getResources();
            java.lang.Integer num2 = c2Var.f102951i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
            int intValue = num2.intValue();
            android.content.res.Resources.Theme theme = c2Var.f102943a.getContext().getTheme();
            java.lang.ThreadLocal threadLocal = d3.q.f307641a;
            ds6.setColor(d3.m.a(resources, intValue, theme));
            ds6.setUnderlineText(false);
        }
    }
}
