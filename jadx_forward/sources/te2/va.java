package te2;

/* loaded from: classes3.dex */
public final class va extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f500034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(te2.hc hcVar) {
        super(3);
        this.f500034d = hcVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.h32 h32Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errString = (java.lang.String) obj2;
        r45.q62 q62Var = (r45.q62) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errString, "errString");
        te2.hc hcVar = this.f500034d;
        if (q62Var != null && (h32Var = hcVar.f499601J) != null) {
            zl2.t.c(h32Var, q62Var, booleanValue);
        }
        hcVar.S6();
        hcVar.T6();
        if (booleanValue) {
            android.app.Activity m80379x76847179 = hcVar.m80379x76847179();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x76847179);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
            e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ljl);
            e4Var.c();
        } else {
            android.app.Activity m80379x768471792 = hcVar.m80379x76847179();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m80379x768471792);
            if (errString.length() > 0) {
                e4Var2.f293309c = errString;
            } else {
                e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.oss);
            }
            e4Var2.c();
        }
        return jz5.f0.f384359a;
    }
}
