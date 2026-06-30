package v41;

/* loaded from: classes15.dex */
public final class b extends v41.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.app.Activity context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void h(v41.b bVar) {
        bVar.g(0, "");
    }

    @Override // v41.c, v41.s
    public void a() {
        super.a();
    }

    @Override // v41.s
    public void b() {
        ku5.u0 u0Var = ku5.t0.f394148d;
        v41.a aVar = new v41.a(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(aVar, 400L, false);
    }

    @Override // v41.c, v41.s
    public void c(int i17, int i18, j41.i0 confirmData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmData, "confirmData");
        super.c(i17, i18, confirmData);
        l41.m mVar = this.f514738e;
        if (mVar != null) {
            ((l41.j1) mVar).d(i17);
        }
    }

    @Override // v41.c, v41.s
    public void d(l41.m confirmController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmController, "confirmController");
        super.d(confirmController);
        android.app.Activity activity = this.f514737d;
        if (activity instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.ga mo78514x143f1b92 = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity).mo78514x143f1b92();
            android.app.Activity activity2 = this.f514737d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity2);
            mo78514x143f1b92.G0(com.p314xaae8f345.mm.ui.uk.a(activity2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw), 0));
        }
    }
}
