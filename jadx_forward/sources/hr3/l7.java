package hr3;

/* loaded from: classes9.dex */
public class l7 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f365280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f365281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.z9 f365282f;

    public l7(android.app.ProgressDialog progressDialog, boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        this.f365280d = progressDialog;
        this.f365281e = z17;
        this.f365282f = z9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17;
        android.app.ProgressDialog progressDialog = this.f365280d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        int n17 = c01.z1.n();
        boolean z17 = this.f365281e;
        if (z17) {
            i17 = n17 & (-16777217);
        } else {
            i17 = n17 | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb;
            c01.d9.b().p().w(286722, "");
            c01.d9.b().p().w(286721, "");
            c01.d9.b().p().w(286723, "");
        }
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        r45.u85 u85Var = new r45.u85();
        u85Var.f468669d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb;
        u85Var.f468670e = !z17 ? 1 : 0;
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(39, u85Var));
        com.p314xaae8f345.mm.ui.z9 z9Var = this.f365282f;
        if (z9Var == null) {
            return false;
        }
        z9Var.mo735xb0dfc7d8(null, null);
        return false;
    }
}
