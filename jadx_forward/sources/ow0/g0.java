package ow0;

/* loaded from: classes5.dex */
public final class g0 implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f430843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f430844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c f430845c;

    public g0(gx0.u2 u2Var, ex0.a0 a0Var, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p901x8438d441.C10954x76f4876c c10954x76f4876c) {
        this.f430843a = u2Var;
        this.f430844b = a0Var;
        this.f430845c = c10954x76f4876c;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        int ordinal = source.ordinal();
        gx0.u2 u2Var = this.f430843a;
        if (ordinal == 1 || ordinal == 2) {
            p3325xe03a0797.p3326xc267989b.l.d(u2Var.m158345xefc66565(), null, null, new ow0.e0(this.f430843a, d17, this.f430844b, this.f430845c, null), 3, null);
        } else if (ordinal == 3) {
            p3325xe03a0797.p3326xc267989b.l.d(u2Var.m158345xefc66565(), null, null, new ow0.f0(d17, this.f430844b, this.f430845c, this.f430843a, null), 3, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(u2Var, "<this>");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10951xedb68d8b o76 = u2Var.o7();
        if (o76 != null) {
            android.view.View view = o76.f150855f;
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = ((int) d17) + o76.f150863q;
            view.setLayoutParams(layoutParams2);
        }
        ow0.q0.h(u2Var);
    }
}
