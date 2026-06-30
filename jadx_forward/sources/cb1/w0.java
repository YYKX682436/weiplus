package cb1;

/* loaded from: classes4.dex */
public class w0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yb f121861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f121863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f121864g;

    public w0(cb1.y0 y0Var, r45.yb ybVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17) {
        this.f121864g = y0Var;
        this.f121861d = ybVar;
        this.f121862e = v5Var;
        this.f121863f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do accept the auto fill data protocol");
        r45.yb ybVar = this.f121861d;
        ybVar.f472474f = true;
        cb1.y0 y0Var = this.f121864g;
        java.lang.String o17 = y0Var.o("ok");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121862e;
        v5Var.a(this.f121863f, o17);
        cb1.y0.C(y0Var, v5Var, ybVar);
    }
}
