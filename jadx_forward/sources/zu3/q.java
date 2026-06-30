package zu3;

/* loaded from: classes3.dex */
public final class q extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f557357d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f557358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dxq, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.s8l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f557357d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.s8m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f557358e = (android.widget.TextView) findViewById2;
    }

    public final void a(int i17, int i18) {
        this.f557357d.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), i17, -16777216));
        this.f557358e.setText(i65.a.r(getContext(), i18));
    }
}
