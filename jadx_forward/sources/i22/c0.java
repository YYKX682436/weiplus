package i22;

/* loaded from: classes15.dex */
public final class c0 extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f369483f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f369484g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.view.View itemView) {
        super(itemView, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.mzc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f369483f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.mzb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f369484g = (android.widget.TextView) findViewById2;
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.i(item, payloads);
        i22.y0 y0Var = item instanceof i22.y0 ? (i22.y0) item : null;
        android.widget.TextView textView = this.f369483f;
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        textView.setText(y0Var != null ? y0Var.f369601a : null);
        java.lang.String str = y0Var != null ? y0Var.f369602b : null;
        android.widget.TextView textView2 = this.f369484g;
        textView2.setText(str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y0Var != null ? y0Var.f369602b : null, "")) {
            textView2.setVisibility(8);
        }
    }
}
