package cp4;

/* loaded from: classes5.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f302587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(cp4.r rVar) {
        super(1);
        this.f302587d = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cp4.r rVar = this.f302587d;
        if (booleanValue) {
            ju3.d0.k(rVar.f546865d, ju3.c0.B2, null, 2, null);
        } else {
            rVar.C().f302632g.d();
            cp4.z C = rVar.C();
            java.lang.Object systemService = C.getContext().getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(C.getWindowToken(), 0);
            ju3.c0 c0Var = ju3.c0.f383446x1;
            ju3.d0 d0Var = rVar.f546865d;
            ju3.d0.k(d0Var, c0Var, null, 2, null);
            ju3.d0.k(d0Var, ju3.c0.C2, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
