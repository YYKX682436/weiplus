package in2;

/* loaded from: classes10.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.n0 f374386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f374387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(in2.n0 n0Var, android.view.View view) {
        super(3);
        this.f374386d = n0Var;
        this.f374387e = view;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.List songInfoList = (java.util.List) obj2;
        java.util.LinkedList unComplianceList = (java.util.LinkedList) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfoList, "songInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unComplianceList, "unComplianceList");
        in2.n0 n0Var = this.f374386d;
        if (intValue == 0) {
            mm2.m6 m6Var = (mm2.m6) n0Var.H.a(mm2.m6.class);
            gk2.e eVar = n0Var.H;
            m6Var.f410774f.e(songInfoList, (java.lang.String) ((mm2.m6) eVar.a(mm2.m6.class)).f410776h.mo3195x754a37bb(), new in2.j0(n0Var));
            boolean isEmpty = unComplianceList.isEmpty();
            android.content.Context context = n0Var.f199716e;
            if (!isEmpty) {
                java.util.LinkedList linkedList = ((mm2.m6) eVar.a(mm2.m6.class)).f410780o;
                linkedList.clear();
                linkedList.addAll(unComplianceList);
                db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oyx));
            }
            n0Var.I.r7();
            in2.f0 f0Var = n0Var.P;
            f0Var.f374359h.clear();
            f0Var.m8146xced61ae5();
            java.lang.Object systemService = context.getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(this.f374387e.getWindowToken(), 0);
        } else {
            db5.t7.g(n0Var.f199716e, "请稍后再试");
        }
        return jz5.f0.f384359a;
    }
}
