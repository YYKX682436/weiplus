package s61;

/* loaded from: classes8.dex */
public class a1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f484851d;

    /* renamed from: e, reason: collision with root package name */
    public final s61.z0 f484852e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.ProgressDialog f484853f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f484854g;

    public a1(android.content.Context context, s61.z0 z0Var) {
        this.f484854g = true;
        this.f484851d = context;
        this.f484852e = z0Var;
        this.f484854g = true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 116) {
            return;
        }
        android.app.ProgressDialog progressDialog = this.f484853f;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f484853f = null;
        }
        gm0.j1.d().q(116, this);
        s61.z0 z0Var = this.f484852e;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendInviteEmail", "dealSendInviteEmailFail");
            z0Var.getClass();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendInviteEmail", "dealSendInviteEmailSuccess");
        if (!this.f484854g) {
            ((s61.g0) z0Var).f484885a.f484891d.finish();
        } else {
            db5.e1.m(this.f484851d, com.p314xaae8f345.mm.R.C30867xcad56011.g28, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new s61.y0(this));
        }
    }
}
