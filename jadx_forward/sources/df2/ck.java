package df2;

/* loaded from: classes3.dex */
public final class ck extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f311421d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(df2.pk pkVar) {
        super(3);
        this.f311421d = pkVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        jz5.f0 f0Var;
        java.lang.String m75945x2fec8307;
        r45.ma0 ma0Var = (r45.ma0) obj;
        java.lang.String selectKey = (java.lang.String) obj2;
        ((java.lang.Number) obj3).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectKey, "selectKey");
        df2.pk pkVar = this.f311421d;
        ce2.i iVar = pkVar.f312605J;
        r45.na0 D0 = iVar != null ? iVar.D0() : null;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (ma0Var == null || (m75945x2fec8307 = ma0Var.m75945x2fec8307(4)) == null) {
            f0Var = null;
        } else {
            ma0Var.set(2, selectKey);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1 = pkVar.f312612s;
            if (c14940x2aae97e1 != null) {
                c14940x2aae97e1.j(m75945x2fec8307, selectKey);
            }
            pkVar.f7("onCustomerSelectComponent");
            f0Var = f0Var2;
        }
        java.lang.String str = pkVar.f312606m;
        if (f0Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCustomerSelectComponent but ");
            sb6.append(pm0.b0.g(ma0Var == null ? "" : ma0Var));
            sb6.append(" component_key is null");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, sb6.toString());
        }
        boolean Z6 = pkVar.Z6("", pkVar.I, pkVar.f312605J);
        boolean a76 = pkVar.a7(pkVar.I, pkVar.f312605J);
        android.widget.TextView textView = pkVar.f312611r;
        if (textView != null) {
            textView.setEnabled(Z6 || a76);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onCustomerSelectComponent key:");
        sb7.append(selectKey);
        sb7.append(",component:");
        sb7.append(ma0Var);
        sb7.append(", componentChange:");
        sb7.append(Z6);
        sb7.append(",customGiftTextChange:");
        sb7.append(a76);
        sb7.append(", new customComponentList:");
        sb7.append(pkVar.b7(D0 != null ? D0.m75941xfb821914(0) : null));
        sb7.append(" customText:");
        sb7.append(D0 != null ? (r45.pa0) D0.m75936x14adae67(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
        return f0Var2;
    }
}
