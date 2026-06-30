package v41;

/* loaded from: classes15.dex */
public final class m extends v41.c {

    /* renamed from: h, reason: collision with root package name */
    public v41.r f514751h;

    /* renamed from: i, reason: collision with root package name */
    public w41.j f514752i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.app.Activity context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void i(v41.m mVar) {
        mVar.g(0, "");
    }

    @Override // v41.c, v41.s
    public void a() {
        super.a();
    }

    @Override // v41.s
    public void b() {
        ku5.u0 u0Var = ku5.t0.f394148d;
        v41.e eVar = new v41.e(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(eVar, 500L, false);
    }

    @Override // v41.c, v41.s
    public void c(int i17, int i18, j41.i0 confirmData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmData, "confirmData");
        super.c(i17, i18, confirmData);
        this.f514751h = new v41.h(this, i17);
        l41.m mVar = this.f514738e;
        l41.j1 j1Var = mVar instanceof l41.j1 ? (l41.j1) mVar : null;
        w41.j jVar = new w41.j(this.f514737d, j1Var != null ? (ah5.a) ((jz5.n) j1Var.f397380f).mo141623x754a37bb() : null);
        jVar.f524396i = confirmData;
        jVar.setOnKeyListener(new v41.j(this));
        jVar.setOnShowListener(v41.k.f514749d);
        j(new v41.l(this));
        jVar.f524397m = this.f514751h;
        jVar.setCanceledOnTouchOutside(false);
        this.f514752i = jVar;
        jVar.show();
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

    @Override // v41.c, v41.s
    public void e() {
        l41.m mVar = this.f514738e;
        boolean z17 = false;
        if (mVar != null && ((l41.j1) mVar).i()) {
            z17 = true;
        }
        if (z17) {
            j(new v41.d(this));
            w41.j jVar = this.f514752i;
            if (jVar != null) {
                jVar.dismiss();
            }
        }
    }

    @Override // v41.c, v41.s
    public void f() {
        l41.m mVar = this.f514738e;
        boolean z17 = false;
        if (mVar != null && ((l41.j1) mVar).h()) {
            z17 = true;
        }
        if (z17) {
            super.f();
        }
    }

    public final void j(v51.b bVar) {
        w41.j jVar = this.f514752i;
        if (jVar != null) {
            jVar.setOnDismissListener(new v41.f(bVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r0.isShowing() == true) goto L8;
     */
    @Override // v41.c, v41.s
    /* renamed from: release */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo171084x41012807() {
        /*
            r3 = this;
            r0 = 0
            r3.f514737d = r0
            w41.j r0 = r3.f514752i
            r1 = 0
            if (r0 == 0) goto L10
            boolean r0 = r0.isShowing()
            r2 = 1
            if (r0 != r2) goto L10
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L1a
            w41.j r0 = r3.f514752i
            if (r0 == 0) goto L1a
            r0.mo173204xf0b10c72(r1)
        L1a:
            w41.j r0 = r3.f514752i
            if (r0 == 0) goto L31
            com.tencent.mm.openim.ui.dialog.OpenIMKefuConfirmDialogView r0 = r0.f524395h
            if (r0 == 0) goto L31
            java.lang.Class<i41.l> r1 = i41.l.class
            i95.m r1 = i95.n0.c(r1)
            i41.l r1 = (i41.l) r1
            u41.l r1 = r1.Ui()
            r1.mo49775xc84af884(r0)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v41.m.mo171084x41012807():void");
    }
}
