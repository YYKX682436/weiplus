package ee5;

/* loaded from: classes9.dex */
public final class a extends zd5.k {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f333322m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f333323n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f333324o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.gfu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f333322m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.gfv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f333323n = imageView;
        android.view.View findViewById3 = itemView.findViewById(com.p314xaae8f345.mm.R.id.gfq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f333324o = (android.widget.TextView) findViewById3;
        imageView.setVisibility(8);
    }
}
