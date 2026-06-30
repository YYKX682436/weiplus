package gr2;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f356349a;

    /* renamed from: b, reason: collision with root package name */
    public final oa.i f356350b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f356351c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f356352d;

    /* renamed from: e, reason: collision with root package name */
    public int f356353e;

    public q0(android.content.Context context, oa.i tab) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        this.f356349a = context;
        this.f356350b = tab;
        tab.f425311a = this;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c6k, (android.view.ViewGroup) tab.f425318h, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f356352d = inflate;
        this.f356351c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o5c);
        tab.d(inflate);
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f356351c;
        if (textView != null) {
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }
}
