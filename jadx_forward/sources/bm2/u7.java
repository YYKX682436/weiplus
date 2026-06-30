package bm2;

/* loaded from: classes3.dex */
public final class u7 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f103886d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f103887e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f103888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.w7 f103889g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(bm2.w7 w7Var, android.view.View viewItem) {
        super(viewItem);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewItem, "viewItem");
        this.f103889g = w7Var;
        this.f103886d = viewItem;
        this.f3639x46306858.setOnTouchListener(bm2.q7.f103791d);
        this.f3639x46306858.setOnLongClickListener(new bm2.r7(this));
        android.view.View findViewById = viewItem.findViewById(com.p314xaae8f345.mm.R.id.pnw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f103887e = (android.widget.TextView) findViewById;
        this.f103888f = "";
    }
}
