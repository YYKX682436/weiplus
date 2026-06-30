package cb1;

/* loaded from: classes4.dex */
public class v0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yb f40320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40322f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f40323g;

    public v0(cb1.y0 y0Var, r45.yb ybVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f40323g = y0Var;
        this.f40320d = ybVar;
        this.f40321e = v5Var;
        this.f40322f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do not accept the auto fill data protocol");
        r45.yb ybVar = this.f40320d;
        ybVar.f390941f = false;
        cb1.y0 y0Var = this.f40323g;
        java.lang.String o17 = y0Var.o("cancel");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40321e;
        v5Var.a(this.f40322f, o17);
        cb1.y0.C(y0Var, v5Var, ybVar);
    }
}
