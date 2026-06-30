package b33;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f17679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17680b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17681c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f17682d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f17683e;

    public p(android.content.Context context, oa.i tab, int i17, int i18, java.lang.String titleName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        kotlin.jvm.internal.o.g(titleName, "titleName");
        this.f17679a = tab;
        this.f17680b = i17;
        this.f17681c = i18;
        this.f17682d = titleName;
        tab.f343778a = this;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.cqp, (android.view.ViewGroup) null);
        tab.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.n6j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f17683e = textView;
        textView.setText(titleName);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
    }

    public final void a(boolean z17) {
        int i17 = z17 ? com.tencent.mm.R.color.BW_F_Alpha_0_8 : com.tencent.mm.R.color.BW_100_Alpha_0_5;
        android.widget.TextView textView = this.f17683e;
        textView.setTextColor(i65.a.d(textView.getContext(), i17));
    }

    public java.lang.String toString() {
        return "abItem(tabType=" + this.f17680b + ", tabIndex=" + this.f17681c + ", titleName='" + this.f17682d + "')";
    }
}
