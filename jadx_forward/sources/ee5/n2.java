package ee5;

/* loaded from: classes9.dex */
public final class n2 extends zd5.k {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f333512m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f333513n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.gfu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f333512m = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.gg_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f333513n = textView;
        textView.setVisibility(0);
    }
}
