package cb1;

/* loaded from: classes4.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yb f121853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f121855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f121856g;

    public v0(cb1.y0 y0Var, r45.yb ybVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f121856g = y0Var;
        this.f121853d = ybVar;
        this.f121854e = v5Var;
        this.f121855f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do not accept the auto fill data protocol");
        r45.yb ybVar = this.f121853d;
        ybVar.f472474f = false;
        cb1.y0 y0Var = this.f121856g;
        java.lang.String o17 = y0Var.o("cancel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121854e;
        v5Var.a(this.f121855f, o17);
        cb1.y0.C(y0Var, v5Var, ybVar);
    }
}
