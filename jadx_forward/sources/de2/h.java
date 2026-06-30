package de2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f310913a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f310914b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f310915c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f310916d;

    /* renamed from: e, reason: collision with root package name */
    public final wd2.g f310917e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f310918f;

    public h(android.content.Context context, yz5.a block) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        this.f310913a = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570327ag5, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f310914b = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567371j93);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f310915c = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.cgv);
        android.widget.Button button = (android.widget.Button) findViewById2;
        button.setOnClickListener(new de2.g(button, block, this));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "apply(...)");
        this.f310916d = (android.widget.TextView) findViewById2;
        wd2.g gVar = new wd2.g(context, true, zl2.u4.f555521d, false);
        gVar.f526372f.addView(inflate);
        this.f310917e = gVar;
        this.f310918f = "";
    }
}
