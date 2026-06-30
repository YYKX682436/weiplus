package pf4;

/* loaded from: classes4.dex */
public final class c extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f435382d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f435383e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pf4.e eVar, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f435382d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.kbq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.f435383e = textView;
        pm0.v.c(textView);
    }
}
