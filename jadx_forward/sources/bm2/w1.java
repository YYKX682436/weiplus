package bm2;

/* loaded from: classes3.dex */
public final class w1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f103931d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f103932e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f103933f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f103934g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f103935h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f103936i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(android.view.View mItemView) {
        super(mItemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mItemView, "mItemView");
        this.f103931d = mItemView;
        android.view.View findViewById = mItemView.findViewById(com.p314xaae8f345.mm.R.id.d66);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f103932e = findViewById;
        android.view.View findViewById2 = mItemView.findViewById(com.p314xaae8f345.mm.R.id.f565688d65);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f103933f = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = mItemView.findViewById(com.p314xaae8f345.mm.R.id.d6k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f103934g = textView;
        android.view.View findViewById4 = mItemView.findViewById(com.p314xaae8f345.mm.R.id.d6m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f103935h = findViewById4;
        android.view.View findViewById5 = mItemView.findViewById(com.p314xaae8f345.mm.R.id.d6n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById5;
        this.f103936i = textView2;
        d92.f fVar = d92.f.f309003a;
        android.content.Context context = mItemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 12.0f, 0.0f, 8, null);
        android.content.Context context2 = mItemView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView2, 12.0f, 0.0f, 8, null);
    }
}
