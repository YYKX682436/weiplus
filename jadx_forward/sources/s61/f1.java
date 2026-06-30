package s61;

/* loaded from: classes8.dex */
public class f1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f484881d;

    /* renamed from: e, reason: collision with root package name */
    public final s61.e1 f484882e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f484883f;

    public f1(android.content.Context context, s61.e1 e1Var) {
        this.f484881d = context;
        this.f484882e = e1Var;
    }

    public final void a(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        r61.n1 n1Var = new r61.n1(arrayList);
        gm0.j1.d().g(n1Var);
        android.content.Context context = this.f484881d;
        this.f484883f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g2a), this.f484881d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g29), true, true, new s61.c1(this, n1Var));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        if (android.text.TextUtils.isEmpty(str)) {
            str = "";
        }
        objArr[2] = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendInviteGoogleContact", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        if (m1Var.mo808xfb85f7b0() != 489) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f484883f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f484883f = null;
        }
        gm0.j1.d().q(489, this);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendInviteGoogleContact", "dealSendInviteFail");
            this.f484882e.getClass();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendInviteGoogleContact", "dealSendInviteSuccess");
            db5.e1.m(this.f484881d, com.p314xaae8f345.mm.R.C30867xcad56011.g28, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new s61.d1(this));
        }
    }
}
