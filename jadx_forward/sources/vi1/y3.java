package vi1;

/* loaded from: classes7.dex */
public final class y3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f519044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f519045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(android.app.ProgressDialog progressDialog, vi1.z3 z3Var) {
        super(1);
        this.f519044d = progressDialog;
        this.f519045e = z3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        vi1.z3 z3Var = this.f519045e;
        android.app.ProgressDialog progressDialog = this.f519044d;
        ik1.h0.b(new vi1.x3((r45.x20) obj, z3Var, progressDialog));
        progressDialog.dismiss();
        return jz5.f0.f384359a;
    }
}
