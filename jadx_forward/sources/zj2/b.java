package zj2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f554820a;

    /* renamed from: b, reason: collision with root package name */
    public final ak2.a f554821b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.ViewGroup f554822c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f554823d;

    public b(android.view.View root, ak2.a adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        this.f554820a = root;
        this.f554821b = adapter;
        android.view.View findViewById = root.findViewById(com.p314xaae8f345.mm.R.id.f566266fb4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f554822c = viewGroup;
        android.view.View findViewById2 = root.findViewById(com.p314xaae8f345.mm.R.id.jk6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f554823d = (android.widget.TextView) findViewById2;
        viewGroup.setOnClickListener(new zj2.a(this));
    }
}
