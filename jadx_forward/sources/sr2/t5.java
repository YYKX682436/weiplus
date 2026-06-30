package sr2;

/* loaded from: classes10.dex */
public final class t5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.v5 f493258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(sr2.v5 v5Var) {
        super(2);
        this.f493258d = v5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        sr2.v5 v5Var = this.f493258d;
        if (str != null) {
            java.lang.String str2 = r26.n0.B(str, v5Var.f493283n, false) ? v5Var.f493283n : "";
            yz5.p pVar = v5Var.f493279g;
            if (pVar != null) {
                pVar.mo149xb9724478(str, str2);
            }
        }
        android.widget.LinearLayout linearLayout = v5Var.f493276d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        v5Var.f493282m = -1;
        v5Var.f493283n = "";
        if (str == null) {
            str = "";
        }
        v5Var.O6(1, str, intValue);
        return jz5.f0.f384359a;
    }
}
