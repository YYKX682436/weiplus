package o25;

/* loaded from: classes9.dex */
public class j0 implements o25.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f424074a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f424075b;

    public j0(android.app.ProgressDialog progressDialog, android.content.Context context) {
        this.f424074a = progressDialog;
        this.f424075b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o25.k0
    public void b(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, boolean z17) {
        r45.zp6 I;
        android.content.Context context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DeepLinkHelper", "DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Boolean.valueOf(z17));
        android.app.ProgressDialog progressDialog = this.f424074a;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        if (m1Var == 0 || i17 == 0 || i18 == 0 || !(m1Var instanceof de0.h) || (I = ((com.p314xaae8f345.mm.p957x53236a1b.h1) ((de0.h) m1Var)).I()) == null || (context = this.f424075b) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(I.f473818g)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv));
        sb6.append(" : ");
        java.lang.String str2 = I.f473818g;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        db5.t7.m123883x26a183b(context, sb6.toString(), 0).show();
    }
}
