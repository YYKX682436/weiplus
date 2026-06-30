package ty2;

/* loaded from: classes9.dex */
public final class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13821x319c273d {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f504655m = 0;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f504656g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f504657h;

    /* renamed from: i, reason: collision with root package name */
    public ty2.v f504658i;

    public y(android.content.Context context, yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(context);
        this.f504656g = lVar;
        this.f504657h = jz5.h.b(new ty2.x(this, context));
        this.f504658i = new ty2.v(0, null);
        setOrientation(1);
    }

    /* renamed from: getEnableUpdate */
    private final boolean m167240xff8d6ea2() {
        ty2.v vVar = this.f504658i;
        return vVar.f504651b != null && vVar.f504650a > 0;
    }

    /* renamed from: getSubViews */
    private final java.util.List<ty2.b> m167241xff629184() {
        return (java.util.List) ((jz5.n) this.f504657h).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setViewStatus */
    public final void m167242xad5facf9(ty2.v vVar) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504658i, vVar)) {
            return;
        }
        this.f504658i = vVar;
        if (m167240xff8d6ea2()) {
            removeAllViews();
            if (m167240xff8d6ea2()) {
                for (ty2.b bVar : m167241xff629184()) {
                    bVar.f504593c = ty2.z.a(bVar.f504593c, 0, 0, 0, 0, (this.f504658i.f504650a - c(bVar.f504593c.f504660b)) - c(bVar.f504593c.f504661c), null, 47, null);
                    bw5.q5 q5Var = this.f504658i.f504651b;
                    if (q5Var == null) {
                        return;
                    }
                    android.view.View b17 = bVar.b(q5Var);
                    if (b17 != null) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
                        marginLayoutParams.setMargins(c(bVar.f504593c.f504660b), c(bVar.f504593c.f504659a), c(bVar.f504593c.f504661c), c(bVar.f504593c.f504662d));
                        addView(b17, marginLayoutParams);
                    }
                }
            }
        }
    }

    public final int c(int i17) {
        return i65.a.b(getContext(), i17);
    }

    public final void d(bw5.q5 item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f504658i.getClass();
        m167242xad5facf9(new ty2.v(i17, item));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        post(new ty2.w(this));
    }
}
