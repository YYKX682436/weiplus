package v41;

/* loaded from: classes15.dex */
public abstract class c implements v41.s {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f514737d;

    /* renamed from: e, reason: collision with root package name */
    public l41.m f514738e;

    /* renamed from: f, reason: collision with root package name */
    public int f514739f = -1;

    /* renamed from: g, reason: collision with root package name */
    public j41.i0 f514740g;

    public c(android.app.Activity activity) {
        this.f514737d = activity;
    }

    @Override // v41.s
    public void a() {
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1;
        if (j41.g0.a(this.f514739f)) {
            j41.i0 i0Var = this.f514740g;
            java.lang.Object obj = i0Var != null ? i0Var.f379176d : null;
            k41.g0 g0Var = obj instanceof k41.g0 ? (k41.g0) obj : null;
            l41.m mVar = this.f514738e;
            int i17 = -1;
            if (mVar != null && (c11207x71c7a1c1 = ((l41.j1) mVar).f397377c) != null) {
                i17 = c11207x71c7a1c1.f153807f;
            }
            q41.f.c(g0Var, 22, i17, 0L, 8, null);
        }
    }

    @Override // v41.s
    public void c(int i17, int i18, j41.i0 confirmData) {
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmData, "confirmData");
        this.f514739f = i17;
        this.f514740g = confirmData;
        if (j41.g0.a(i17)) {
            j41.u uVar = confirmData.f379176d;
            k41.g0 g0Var = uVar instanceof k41.g0 ? (k41.g0) uVar : null;
            l41.m mVar = this.f514738e;
            int i19 = -1;
            if (mVar != null && (c11207x71c7a1c1 = ((l41.j1) mVar).f397377c) != null) {
                i19 = c11207x71c7a1c1.f153807f;
            }
            q41.f.c(g0Var, 21, i19, 0L, 8, null);
        }
    }

    @Override // v41.s
    public void d(l41.m confirmController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(confirmController, "confirmController");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmBaseUIModel", "OpenIMKefuConfirmUIModel onCreate: %s", this);
        this.f514738e = confirmController;
    }

    @Override // v41.s
    public void e() {
        g(4, "start conversation failed");
    }

    @Override // v41.s
    public void f() {
        g(3, "user cancel");
    }

    public final void g(int i17, java.lang.String str) {
        l41.m mVar = this.f514738e;
        if (mVar != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_result_err_code", i17);
            intent.putExtra("key_result_err_msg", str);
            ((l41.j1) mVar).f(-1, i17, intent);
        }
    }

    @Override // v41.s
    /* renamed from: release */
    public void mo171084x41012807() {
        this.f514737d = null;
    }
}
