package xs2;

/* loaded from: classes3.dex */
public final class z0 extends yp.o {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f537930d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f537931e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f537932f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f537933g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f537930d = itemView;
        this.f537931e = jz5.h.b(xs2.x0.f537927d);
        this.f537932f = jz5.h.b(new xs2.y0(this));
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565050b25);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f537933g = (android.widget.TextView) findViewById;
    }

    @Override // yp.o
    public void e(int i17, int i18) {
        int intValue = ((java.lang.Number) ((jz5.n) this.f537932f).mo141623x754a37bb()).intValue();
        if (i17 < intValue) {
            i17 = intValue;
        }
        super.e(i17, i18);
    }
}
