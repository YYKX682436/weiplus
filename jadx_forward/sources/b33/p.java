package b33;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f99212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f99214c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f99215d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f99216e;

    public p(android.content.Context context, oa.i tab, int i17, int i18, java.lang.String titleName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleName, "titleName");
        this.f99212a = tab;
        this.f99213b = i17;
        this.f99214c = i18;
        this.f99215d = titleName;
        tab.f425311a = this;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cqp, (android.view.ViewGroup) null);
        tab.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.n6j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f99216e = textView;
        textView.setText(titleName);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
    }

    public final void a(boolean z17) {
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77715xd67f4bc5 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d;
        android.widget.TextView textView = this.f99216e;
        textView.setTextColor(i65.a.d(textView.getContext(), i17));
    }

    /* renamed from: toString */
    public java.lang.String m9759x9616526c() {
        return "abItem(tabType=" + this.f99213b + ", tabIndex=" + this.f99214c + ", titleName='" + this.f99215d + "')";
    }
}
