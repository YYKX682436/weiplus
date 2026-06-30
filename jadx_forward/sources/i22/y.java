package i22;

/* loaded from: classes15.dex */
public final class y extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f369599f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f369600g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, android.view.View itemView, i22.p0 p0Var) {
        super(itemView, p0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.dec);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f369599f = (android.widget.TextView) findViewById;
        int d17 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77660x7595c307);
        int d18 = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77628xb498cd1d);
        float a17 = ym5.x.a(context, 8.0f);
        this.f369600g = n22.f.f415823a.b(d17, d18, 0.0f, 0.0f, a17, a17);
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        super.i(item, payloads);
        i22.k0 k0Var = (i22.k0) this.f369536e;
        this.f369599f.setText(k0Var != null ? k0Var.f369528a : null);
        this.f3639x46306858.setBackground(this.f369600g);
    }
}
