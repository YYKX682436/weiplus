package i22;

/* loaded from: classes15.dex */
public final class x extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f369597f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.view.View itemView, i22.p0 p0Var) {
        super(itemView, p0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.deq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f369597f = (android.widget.TextView) findViewById;
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        this.f369536e = item;
        i22.l0 l0Var = item instanceof i22.l0 ? (i22.l0) item : null;
        java.lang.String str = l0Var != null ? l0Var.f369533a : null;
        android.widget.TextView textView = this.f369597f;
        textView.setText(str);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
    }
}
